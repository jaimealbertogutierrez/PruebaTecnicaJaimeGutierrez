package com.pruebatecnica.spring.jpa.h2.controller;

/************************************************************/
/************************************************************/
/************************************************************/
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.pruebatecnica.spring.jpa.h2.model.Prices;
import com.pruebatecnica.spring.jpa.h2.repository.PricesRepository;

/************************************************************/
/************************************************************/
/************************************************************/
/************************************************************/
/************************************************************/
/************************************************************/

/**
 * Implementación del microservicio RESTFul para la gestión
 * CRUD de los datos e implementación de la funcionalidad de consulta
 * de registros en la tabla del modelo
 * 
 * Fecha: 23-03-2023
 * Autor: Jaime Alberto Gutiérrez Mejía
 */
@CrossOrigin(origins = "http://localhost:8081")
@RestController
@RequestMapping("/api/pricesservice")
public class PricesController {

    @Autowired
    PricesRepository pricesRepository;

    @GetMapping("/pricess")
    public ResponseEntity<List<Prices>> getAllPricess() {
        System.out.println("Trayendo datos por get");

        try {
            List<Prices> prices = new ArrayList<Prices>();

            prices = pricesRepository.findAll();
            System.out.println("estructura: " + prices.size());

            if (prices.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }

            return new ResponseEntity<>(prices, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/pricess/{id}")
    public ResponseEntity<Prices> getPricesById(@PathVariable("id") int id) {
        Optional<Prices> PricesData = pricesRepository.findById(id);

        if (PricesData.isPresent()) {
            return new ResponseEntity<>(PricesData.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/pricess")
    public ResponseEntity<Prices> createPrices(@RequestBody Prices Prices) {
        try {
            Prices _Prices = pricesRepository
                    .save(new Prices(
                            Prices.getPrice_list(),
                            Prices.getBrand_id(),
                            Prices.getStart_date(),
                            Prices.getEnd_date(),
                            Prices.getProduct_id(),
                            Prices.getPriority(),
                            Prices.getPrice(),
                            Prices.getCurr()));
            return new ResponseEntity<>(_Prices, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/pricess/{id}")
    public ResponseEntity<Prices> updatePrices(@PathVariable("id") int id, @RequestBody Prices Prices) {
        Optional<Prices> PricesData = pricesRepository.findById(id);

        if (PricesData.isPresent()) {
            Prices _Prices = PricesData.get();
            _Prices.setPrice_list(Prices.getPrice_list());
            _Prices.setBrand_id(Prices.getBrand_id());
            _Prices.setStart_date(Prices.getStart_date());
            _Prices.setEnd_date(Prices.getEnd_date());
            _Prices.setProduct_id(Prices.getProduct_id());
            _Prices.setPriority(Prices.getPriority());
            _Prices.setPrice(Prices.getPrice());
            _Prices.setCurr(Prices.getCurr());

            return new ResponseEntity<>(pricesRepository.save(_Prices), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/pricess/{id}")
    public ResponseEntity<HttpStatus> deletePrices(@PathVariable("id") int id) {
        try {
            pricesRepository.deleteById(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/pricess")
    public ResponseEntity<HttpStatus> deleteAllPricess() {
        try {
            pricesRepository.deleteAll();
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }

    // *********************************************************************
    // *********************************************************************
    // *********************************************************************
    // Método para la consulta de los datos del modelo por fecha de aplicación,
    // identificador de producto, cadena y hora de consulta
    @GetMapping(value = "/GetDataPrices/{fechaAplicacion}/{identificadorProducto}/{cadena}/{hora}")
    public ResponseEntity<Prices> getDataPrices(
            @PathVariable("fechaAplicacion") String fechaAplicacion,
            @PathVariable("identificadorProducto") int identificadorProducto,
            @PathVariable("cadena") int cadena,
            @PathVariable("hora") int hora) {

        String fechaConHora = fechaAplicacion + " " + hora + ":00:00.000";
        System.out.println("Fecha con hora: " + fechaConHora);

        DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.sss");
        java.util.Date date;
        java.sql.Timestamp timeStampDate = null;

        try {
            date = formatter.parse(fechaConHora);
            timeStampDate = new java.sql.Timestamp(date.getTime());
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        Prices prices = pricesRepository.findByStarDateAndbrandIdAndproductId(timeStampDate, identificadorProducto,
                cadena);

        ResponseEntity response = new ResponseEntity<>(HttpStatus.OK);

        if (prices != null) {
            System.out.println("Se encontraron precios: " + prices);
            return ResponseEntity.ok(prices);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    // *********************************************************************
    // *********************************************************************
    // *********************************************************************
}

/************************************************************/
/************************************************************/
/************************************************************/
/************************************************************/
/************************************************************/
/************************************************************/