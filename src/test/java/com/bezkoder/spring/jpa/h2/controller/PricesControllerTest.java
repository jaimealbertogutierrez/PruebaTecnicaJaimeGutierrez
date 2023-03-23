package com.bezkoder.spring.jpa.h2.controller;

/************************************************************/
/************************************************************/
/************************************************************/
import org.junit.Test;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;

import com.pruebatecnica.spring.jpa.h2.controller.PricesController;
import com.pruebatecnica.spring.jpa.h2.model.Prices;

import java.util.List;

/************************************************************/
/************************************************************/
/************************************************************/
/************************************************************/
/************************************************************/
/************************************************************/
public class PricesControllerTest {

    private Logger log = Logger.getLogger(this.getClass());

    @BeforeAll
    static void initAll() {
    }

    @BeforeEach
    void init() {
    }

    @Test
    @DisplayName("get All Pricess")
    public void getAllPricess() {
        try {
            log.info("Starting execution of getAllPricess");
            ResponseEntity<List<Prices>> expectedValue = null;

            PricesController pricescontroller = new PricesController();
            ResponseEntity<List<Prices>> actualValue = pricescontroller.getAllPricess();
            log.info("Expected Value=" + expectedValue + " . Actual Value=" + actualValue);
            System.out.println("Expected Value=" + expectedValue + " . Actual Value=" + actualValue);
            Assertions.assertEquals(expectedValue, actualValue);
        } catch (Exception exception) {
            log.error("Exception in execution of execute1GetAllLogFromFirstMovF-" + exception, exception);
            exception.printStackTrace();
            Assertions.assertFalse(false);
        }
    }

    @Test
    @DisplayName("get Prices By Id")
    public void getPricesById() {
        try {
            log.info("Starting execution of getPricesById");
            ResponseEntity<Prices> expectedValue = null;
            // @PathVariable = null;

            PricesController pricescontroller = new PricesController();
            ResponseEntity<Prices> actualValue = pricescontroller.getPricesById(1);
            log.info("Expected Value=" + expectedValue + " . Actual Value=" + actualValue);
            System.out.println("Expected Value=" + expectedValue + " . Actual Value=" + actualValue);
            Assertions.assertEquals(expectedValue, actualValue);
        } catch (Exception exception) {
            log.error("Exception in execution of execute1GetAllLogFromFirstMovF-" + exception, exception);
            exception.printStackTrace();
            Assertions.assertFalse(false);
        }
    }

    @Test
    @DisplayName("get Prices By Id Exception")
    public void getPricesByIdException() {
        try {
            log.info("Starting execution of getPricesByIdException");
            // @PathVariable = null;

            PricesController pricescontroller = new PricesController();
            pricescontroller.getPricesById(1);
            Assertions.assertTrue(false);
        } catch (Exception exception) {
            log.error("Exception in execution ofgetPricesByIdException-" + exception, exception);
            exception.printStackTrace();
            Assertions.assertFalse(true);
        }
    }

    @Test
    @DisplayName("create Prices")
    public void createPrices() {
        try {
            log.info("Starting execution of createPrices");
            ResponseEntity<Prices> expectedValue = null;
            RequestBody Prices = null;

            PricesController pricescontroller = new PricesController();
            ResponseEntity<Prices> actualValue = pricescontroller.getPricesById(3);

            log.info("Expected Value=" + expectedValue + " . Actual Value=" + actualValue);
            System.out.println("Expected Value=" + expectedValue + " . Actual Value=" + actualValue);
            Assertions.assertEquals(expectedValue, actualValue);
        } catch (Exception exception) {
            log.error("Exception in execution of execute1GetAllLogFromFirstMovF-" + exception, exception);
            exception.printStackTrace();
            Assertions.assertFalse(false);
        }
    }

    @Test
    @DisplayName("update Prices")
    public void updatePrices() {
        try {
            log.info("Starting execution of updatePrices");
            ResponseEntity<Prices> expectedValue = null;
            // @PathVariable = null;

            PricesController pricescontroller = new PricesController();
            ResponseEntity<Prices> actualValue = pricescontroller.updatePrices(2, null);
            log.info("Expected Value=" + expectedValue + " . Actual Value=" + actualValue);
            System.out.println("Expected Value=" + expectedValue + " . Actual Value=" + actualValue);
            Assertions.assertEquals(expectedValue, actualValue);
        } catch (Exception exception) {
            log.error("Exception in execution of execute1GetAllLogFromFirstMovF-" + exception, exception);
            exception.printStackTrace();
            Assertions.assertFalse(false);
        }
    }

    @Test
    @DisplayName("update Prices Exception")
    public void updatePricesException() {
        try {
            log.info("Starting execution of updatePricesException");
            // @PathVariable = null;

            PricesController pricescontroller = new PricesController();
            pricescontroller.updatePrices(2, null);
            Assertions.assertTrue(false);
        } catch (Exception exception) {
            log.error("Exception in execution ofupdatePricesException-" + exception, exception);
            exception.printStackTrace();
            Assertions.assertFalse(true);
        }
    }

    @Test
    @DisplayName("delete Prices")
    public void deletePrices() {
        try {
            log.info("Starting execution of deletePrices");
            ResponseEntity<HttpStatus> expectedValue = null;
            // @PathVariable = null;

            PricesController pricescontroller = new PricesController();
            ResponseEntity<HttpStatus> actualValue = pricescontroller.deletePrices(2);
            log.info("Expected Value=" + expectedValue + " . Actual Value=" + actualValue);
            System.out.println("Expected Value=" + expectedValue + " . Actual Value=" + actualValue);
            Assertions.assertEquals(expectedValue, actualValue);
        } catch (Exception exception) {
            log.error("Exception in execution of execute1GetAllLogFromFirstMovF-" + exception, exception);
            exception.printStackTrace();
            Assertions.assertFalse(false);
        }
    }

    @Test
    @DisplayName("delete Prices Exception")
    public void deletePricesException() {
        try {
            log.info("Starting execution of deletePricesException");
            // @PathVariable = null;

            PricesController pricescontroller = new PricesController();
            pricescontroller.deletePrices(2);
            Assertions.assertTrue(false);
        } catch (Exception exception) {
            log.error("Exception in execution ofdeletePricesException-" + exception, exception);
            exception.printStackTrace();
            Assertions.assertFalse(true);
        }
    }

    @Test
    @DisplayName("delete All Pricess")
    public void deleteAllPricess() {
        try {
            log.info("Starting execution of deleteAllPricess");
            ResponseEntity<HttpStatus> expectedValue = null;

            PricesController pricescontroller = new PricesController();
            ResponseEntity<HttpStatus> actualValue = pricescontroller.deleteAllPricess();
            log.info("Expected Value=" + expectedValue + " . Actual Value=" + actualValue);
            System.out.println("Expected Value=" + expectedValue + " . Actual Value=" + actualValue);
            Assertions.assertEquals(expectedValue, actualValue);
        } catch (Exception exception) {
            log.error("Exception in execution of execute1GetAllLogFromFirstMovF-" + exception, exception);
            exception.printStackTrace();
            Assertions.assertFalse(false);
        }
    }

    @Test
    @DisplayName("get Data Prices")
    public void getDataPrices() {
        try {
            log.info("Starting execution of getDataPrices");
            ResponseEntity<Prices> expectedValue = null;
            // @PathVariable = null;

            PricesController pricescontroller = new PricesController();
            ResponseEntity<Prices> actualValue = pricescontroller.getPricesById(2);
            log.info("Expected Value=" + expectedValue + " . Actual Value=" + actualValue);
            System.out.println("Expected Value=" + expectedValue + " . Actual Value=" + actualValue);
            Assertions.assertEquals(expectedValue, actualValue);
        } catch (Exception exception) {
            log.error("Exception in execution of execute1GetAllLogFromFirstMovF-" + exception, exception);
            exception.printStackTrace();
            Assertions.assertFalse(false);
        }
    }

    @Test
    @DisplayName("get Data Prices Exception")
    public void getDataPricesException() {
        try {
            log.info("Starting execution of getDataPricesException");
            // @PathVariable = null;

            PricesController pricescontroller = new PricesController();
            pricescontroller.getAllPricess();
            Assertions.assertTrue(false);
        } catch (Exception exception) {
            log.error("Exception in execution ofgetDataPricesException-" + exception, exception);
            exception.printStackTrace();
            Assertions.assertFalse(true);
        }
    }

    @AfterEach
    void tearDown() {
    }

    @AfterAll
    static void tearDownAll() {
    }
}
/************************************************************/
/************************************************************/
/************************************************************/
/************************************************************/
/************************************************************/
/************************************************************/
