package com.bezkoder.spring.jpa.h2.repository;

/************************************************************/
/************************************************************/
/************************************************************/
import org.apache.log4j.Logger;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Assertions;

/************************************************************/
/************************************************************/
/************************************************************/
/************************************************************/
/************************************************************/
/************************************************************/
/**
 * Clase PricesRepositoryTest
 * Objetivo: Realizar pruebas unitarias sobre el repositorio del DAO
 * Autor: Jaime Alberto Gutiérrez Mejía
 * Fecha: 22-03-2022
 * Prueba Técnica
 */
public class PricesRepositoryTest {
    // *******************************************************
    // *******************************************************
    // *******************************************************

    private Logger log = Logger.getLogger(this.getClass());

    // *******************************************************
    // *******************************************************
    // *******************************************************
    @BeforeAll
    static void initAll() {
        Assertions.assertTrue(true);
    }

    // *******************************************************
    // *******************************************************
    // *******************************************************
    @BeforeEach
    void init() {
        Assertions.assertTrue(true);
    }

    // *******************************************************
    // *******************************************************
    // *******************************************************
    @AfterEach
    void tearDown() {
        Assertions.assertTrue(true);
    }

    // *******************************************************
    // *******************************************************
    // *******************************************************
    @AfterAll
    static void tearDownAll() {
        Assertions.assertTrue(true);
    }
    // *******************************************************
    // *******************************************************
    // *******************************************************
    // *******************************************************
    // *******************************************************
    // *******************************************************
}
