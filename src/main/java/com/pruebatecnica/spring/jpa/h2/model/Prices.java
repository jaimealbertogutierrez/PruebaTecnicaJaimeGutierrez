package com.pruebatecnica.spring.jpa.h2.model;

/************************************************************/
/************************************************************/
/************************************************************/
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

/************************************************************/
/************************************************************/
/************************************************************/
/************************************************************/
/************************************************************/
/************************************************************/
/**
 * Clase Java para la definición de la entidad de negocio
 * Autor: Jaime Alberto Gutierrez Mejía
 * Fecha: 23-03-2023
 */
@Entity
@Table(name = "prices")
public class Prices {

    // *******************************************************
    // *******************************************************
    // *******************************************************
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int price_list;

    @Column(name = "brand_id")
    private int brand_id;

    @Column(name = "start_date")
    private java.sql.Timestamp start_date;

    @Column(name = "end_date")
    private java.sql.Timestamp end_date;

    @Column(name = "product_id")
    private int product_id;

    @Column(name = "priority")
    private int priority;

    @Column(name = "price")
    private BigDecimal price;

    @Column(name = "curr")
    private String curr;

    // *******************************************************
    // *******************************************************
    // *******************************************************
    public Prices() {
    }

    // *******************************************************
    // *******************************************************
    // *******************************************************
    public Prices(int price_listP, int brand_idP, java.sql.Timestamp start_dateP,
            java.sql.Timestamp end_dateP,
            int product_idP,
            int priorityD, BigDecimal priceD,
            String currP) {
        this.price_list = price_listP;
        this.brand_id = brand_idP;
        this.start_date = start_dateP;
        this.end_date = end_dateP;
        this.product_id = product_idP;
        this.priority = priorityD;
        this.price = priceD;
        this.curr = currP;
    }

    // *******************************************************
    // *******************************************************
    // *******************************************************
    // *******************************************************
    // *******************************************************
    // *******************************************************
    /**
     * @return the price_list
     */
    public int getPrice_list() {
        return price_list;
    }

    /**
     * @param price_list the price_list to set
     */
    public void setPrice_list(int price_list) {
        this.price_list = price_list;
    }

    /**
     * @return the brand_id
     */
    public int getBrand_id() {
        return brand_id;
    }

    /**
     * @param brand_id the brand_id to set
     */
    public void setBrand_id(int brand_id) {
        this.brand_id = brand_id;
    }

    /**
     * @return the start_date
     */
    public java.sql.Timestamp getStart_date() {
        return start_date;
    }

    /**
     * @param start_date the start_date to set
     */
    public void setStart_date(java.sql.Timestamp start_date) {
        this.start_date = start_date;
    }

    /**
     * @return the end_date
     */
    public java.sql.Timestamp getEnd_date() {
        return end_date;
    }

    /**
     * @param end_date the end_date to set
     */
    public void setEnd_date(java.sql.Timestamp end_date) {
        this.end_date = end_date;
    }

    /**
     * @return the product_id
     */
    public int getProduct_id() {
        return product_id;
    }

    /**
     * @param product_id the product_id to set
     */
    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public int getPriority() {
        return priority;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     * @return the curr
     */
    public String getCurr() {
        return curr;
    }

    /**
     * @param curr the curr to set
     */
    public void setCurr(String curr) {
        this.curr = curr;
    }

    // *******************************************************
    // *******************************************************
    // *******************************************************
    // *******************************************************
    // *******************************************************
    // *******************************************************
}
/************************************************************/
/************************************************************/
/************************************************************/
/************************************************************/
/************************************************************/
/************************************************************/
