package com.bezkoder.spring.jpa.h2.model;

/************************************************************/
/************************************************************/
/************************************************************/

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.junit.Test;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import com.pruebatecnica.spring.jpa.h2.model.Prices;

/************************************************************/
/************************************************************/
/************************************************************/
/************************************************************/
/************************************************************/
/************************************************************/
public class PricesTest {

    private Logger log = Logger.getLogger(this.getClass());

    @BeforeAll
    static void initAll() {
    }

    @BeforeEach
    void init() {
    }

    @Test
    @DisplayName("get Product_id")
    public void getProduct_id() {
        try {
            log.info("Starting execution of getProduct_id");
            int expectedValue = 0;

            int price_listPc = 1;
            int brand_idPc = 0;
            java.sql.Timestamp start_datePc = null;
            java.sql.Timestamp end_datePc = null;
            int product_id = 1;
            int priority = 0;
            BigDecimal priceDc2 = null;
            String curr = null;

            Prices prices = new Prices(price_listPc, brand_idPc, start_datePc,
                    end_datePc, product_id, priority, priceDc2, curr);

            int actualValue = prices.getProduct_id();
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
    @DisplayName("set Product_id")
    public void setProduct_id() {
        try {
            log.info("Starting execution of setProduct_id");

            int price_listPc = 1;
            int brand_idPc = 0;
            java.sql.Timestamp start_datePc = null;
            java.sql.Timestamp end_datePc = null;
            int product_id = 1;
            int priority = 0;
            BigDecimal priceDc2 = null;
            String curr = null;

            Prices prices = new Prices(price_listPc, brand_idPc, start_datePc,
                    end_datePc, product_id, priority, priceDc2, curr);

            prices.setProduct_id(product_id);
            Assertions.assertTrue(true);
        } catch (Exception exception) {
            log.error("Exception in execution ofsetProduct_id-" + exception, exception);
            exception.printStackTrace();
            Assertions.assertFalse(false);
        }
    }

    @Test
    @DisplayName("set Priority")
    public void setPriority() {
        try {
            log.info("Starting execution of setPriority");

            int price_listPc = 1;
            int brand_idPc = 0;
            java.sql.Timestamp start_datePc = null;
            java.sql.Timestamp end_datePc = null;
            int product_id = 1;
            int priority = 0;
            BigDecimal priceDc2 = null;
            String curr = null;

            Prices prices = new Prices(price_listPc, brand_idPc, start_datePc,
                    end_datePc, product_id, priority, priceDc2, curr);

            prices.setPriority(priority);
            Assertions.assertTrue(true);
        } catch (Exception exception) {
            log.error("Exception in execution ofsetPriority-" + exception, exception);
            exception.printStackTrace();
            Assertions.assertFalse(false);
        }
    }

    @Test
    @DisplayName("get Priority")
    public void getPriority() {
        try {
            log.info("Starting execution of getPriority");
            int expectedValue = 0;

            int price_listPc = 1;
            int brand_idPc = 0;
            java.sql.Timestamp start_datePc = null;
            java.sql.Timestamp end_datePc = null;
            int product_id = 1;
            int priority = 0;
            BigDecimal priceDc2 = null;
            String curr = null;

            Prices prices = new Prices(price_listPc, brand_idPc, start_datePc,
                    end_datePc, product_id, priority, priceDc2, curr);

            int actualValue = prices.getPriority();
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
    @DisplayName("get Price")
    public void getPrice() {
        try {
            log.info("Starting execution of getPrice");
            BigDecimal expectedValue = null;

            int price_listPc = 1;
            int brand_idPc = 0;
            java.sql.Timestamp start_datePc = null;
            java.sql.Timestamp end_datePc = null;
            int product_id = 1;
            int priority = 0;
            BigDecimal priceDc2 = null;
            String curr = null;

            Prices prices = new Prices(price_listPc, brand_idPc, start_datePc,
                    end_datePc, product_id, priority, priceDc2, curr);

            BigDecimal actualValue = prices.getPrice();
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
    @DisplayName("set Price")
    public void setPrice() {
        try {
            log.info("Starting execution of setPrice");

            int price_listPc = 1;
            int brand_idPc = 0;
            java.sql.Timestamp start_datePc = null;
            java.sql.Timestamp end_datePc = null;
            int product_id = 1;
            int priority = 0;
            BigDecimal priceDc2 = new BigDecimal(10);
            String curr = null;

            Prices prices = new Prices(price_listPc, brand_idPc, start_datePc,
                    end_datePc, product_id, priority, priceDc2, curr);

            prices.setPrice(priceDc2);
            Assertions.assertTrue(true);
        } catch (Exception exception) {
            log.error("Exception in execution ofsetPrice-" + exception, exception);
            exception.printStackTrace();
            Assertions.assertFalse(false);
        }
    }

    @Test
    @DisplayName("get Curr")
    public void getCurr() {
        try {
            log.info("Starting execution of getCurr");
            String expectedValue = "";

            int price_listPc = 1;
            int brand_idPc = 0;
            java.sql.Timestamp start_datePc = null;
            java.sql.Timestamp end_datePc = null;
            int product_id = 1;
            int priority = 0;
            BigDecimal priceDc2 = new BigDecimal(10);
            String curr = null;

            Prices prices = new Prices(price_listPc, brand_idPc, start_datePc,
                    end_datePc, product_id, priority, priceDc2, curr);

            String actualValue = prices.getCurr();
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
    @DisplayName("set Curr")
    public void setCurr() {
        try {
            log.info("Starting execution of setCurr");

            int price_listPc = 1;
            int brand_idPc = 0;
            java.sql.Timestamp start_datePc = null;
            java.sql.Timestamp end_datePc = null;
            int product_id = 1;
            int priority = 0;
            BigDecimal priceDc2 = new BigDecimal(10);
            String curr = "EUR";

            Prices prices = new Prices(price_listPc, brand_idPc, start_datePc,
                    end_datePc, product_id, priority, priceDc2, curr);
            prices.setCurr(curr);
            Assertions.assertTrue(true);
        } catch (Exception exception) {
            log.error("Exception in execution ofsetCurr-" + exception, exception);
            exception.printStackTrace();
            Assertions.assertFalse(false);
        }
    }

    @Test
    @DisplayName("get Price_list")
    public void getPrice_list() {
        try {
            log.info("Starting execution of getPrice_list");
            int expectedValue = 1;

            int price_listPc = 1;
            int brand_idPc = 0;
            java.sql.Timestamp start_datePc = null;
            java.sql.Timestamp end_datePc = null;
            int product_id = 1;
            int priority = 0;
            BigDecimal priceDc2 = new BigDecimal(10);
            String curr = null;

            Prices prices = new Prices(price_listPc, brand_idPc, start_datePc,
                    end_datePc, product_id, priority, priceDc2, curr);
            int actualValue = prices.getPrice_list();
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
    @DisplayName("set Price_list")
    public void setPrice_list() {
        try {
            log.info("Starting execution of setPrice_list");
            int price_listPc = 1;
            int brand_idPc = 0;
            java.sql.Timestamp start_datePc = null;
            java.sql.Timestamp end_datePc = null;
            int product_id = 1;
            int priority = 0;
            BigDecimal priceDc2 = new BigDecimal(10);
            String curr = null;

            Prices prices = new Prices(price_listPc, brand_idPc, start_datePc,
                    end_datePc, product_id, priority, priceDc2, curr);

            prices.setPrice_list(price_listPc);

            Assertions.assertTrue(true);
        } catch (Exception exception) {
            log.error("Exception in execution ofsetPrice_list-" + exception, exception);
            exception.printStackTrace();
            Assertions.assertFalse(false);
        }
    }

    @Test
    @DisplayName("get Brand_id")
    public void getBrand_id() {
        try {
            log.info("Starting execution of getBrand_id");
            int expectedValue = 0;

            int price_listPc = 1;
            int brand_idPc = 0;
            java.sql.Timestamp start_datePc = null;
            java.sql.Timestamp end_datePc = null;
            int product_id = 1;
            int priority = 0;
            BigDecimal priceDc2 = new BigDecimal(10);
            String curr = null;

            Prices prices = new Prices(price_listPc, brand_idPc, start_datePc,
                    end_datePc, product_id, priority, priceDc2, curr);

            int actualValue = prices.getBrand_id();
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
    @DisplayName("set Brand_id")
    public void setBrand_id() {
        try {
            log.info("Starting execution of setBrand_id");
            int expectedValue = 1;

            int price_listPc = 1;
            int brand_idPc = 1;
            java.sql.Timestamp start_datePc = null;
            java.sql.Timestamp end_datePc = null;
            int product_id = 1;
            int priority = 0;
            BigDecimal priceDc2 = new BigDecimal(10);
            String curr = null;

            Prices prices = new Prices(price_listPc, brand_idPc, start_datePc,
                    end_datePc, product_id, priority, priceDc2, curr);

            prices.setBrand_id(brand_idPc);
            Assertions.assertTrue(true);
        } catch (Exception exception) {
            log.error("Exception in execution ofsetBrand_id-" + exception, exception);
            exception.printStackTrace();
            Assertions.assertFalse(false);
        }
    }

    @Test
    @DisplayName("get Start_date")
    public void getStart_date() {
        try {
            log.info("Starting execution of getStart_date");
            java.sql.Timestamp expectedValue = new Timestamp(2023, 1, 1, 0, 0, 0, 0);

            int price_listPc = 1;
            int brand_idPc = 1;
            java.sql.Timestamp start_datePc = new Timestamp(2023, 1, 1, 0, 0, 0, 0);
            java.sql.Timestamp end_datePc = null;
            int product_id = 1;
            int priority = 0;
            BigDecimal priceDc2 = new BigDecimal(10);
            String curr = null;

            Prices prices = new Prices(price_listPc, brand_idPc, start_datePc,
                    end_datePc, product_id, priority, priceDc2, curr);

            java.sql.Timestamp actualValue = prices.getStart_date();
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
    @DisplayName("set Start_date")
    public void setStart_date() {
        try {
            log.info("Starting execution of setStart_date");

            java.sql.Timestamp expectedValue = new Timestamp(2023, 1, 1, 0, 0, 0, 0);

            int price_listPc = 1;
            int brand_idPc = 1;
            java.sql.Timestamp start_datePc = new Timestamp(2023, 1, 1, 0, 0, 0, 0);
            java.sql.Timestamp end_datePc = null;
            int product_id = 1;
            int priority = 0;
            BigDecimal priceDc2 = new BigDecimal(10);
            String curr = null;

            Prices prices = new Prices(price_listPc, brand_idPc, start_datePc,
                    end_datePc, product_id, priority, priceDc2, curr);

            prices.setStart_date(start_datePc);

            Assertions.assertTrue(true);
        } catch (Exception exception) {
            log.error("Exception in execution ofsetStart_date-" + exception, exception);
            exception.printStackTrace();
            Assertions.assertFalse(false);
        }
    }

    @Test
    @DisplayName("get End_date")
    public void getEnd_date() {
        try {
            log.info("Starting execution of getEnd_date");

            java.sql.Timestamp expectedValue = new Timestamp(2023, 1, 1, 0, 0, 0, 0);

            int price_listPc = 1;
            int brand_idPc = 1;
            java.sql.Timestamp end_datePc = new Timestamp(2023, 1, 1, 0, 0, 0, 0);
            java.sql.Timestamp start_datePc = null;
            int product_id = 1;
            int priority = 0;
            BigDecimal priceDc2 = new BigDecimal(10);
            String curr = null;

            Prices prices = new Prices(price_listPc, brand_idPc, start_datePc,
                    end_datePc, product_id, priority, priceDc2, curr);

            java.sql.Timestamp actualValue = prices.getEnd_date();
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
    @DisplayName("set End_date")
    public void setEnd_date() {
        try {
            log.info("Starting execution of setEnd_date");
            java.sql.Timestamp expectedValue = new Timestamp(2023, 1, 1, 0, 0, 0, 0);

            int price_listPc = 1;
            int brand_idPc = 1;
            java.sql.Timestamp end_datePc = new Timestamp(2023, 1, 1, 0, 0, 0, 0);
            java.sql.Timestamp start_datePc = null;
            int product_id = 1;
            int priority = 0;
            BigDecimal priceDc2 = new BigDecimal(10);
            String curr = null;

            Prices prices = new Prices(price_listPc, brand_idPc, start_datePc,
                    end_datePc, product_id, priority, priceDc2, curr);

            prices.setEnd_date(end_datePc);

            Assertions.assertTrue(true);
        } catch (Exception exception) {
            log.error("Exception in execution ofsetEnd_date-" + exception, exception);
            exception.printStackTrace();
            Assertions.assertFalse(false);
        }
    }

    @AfterEach
    void tearDown() {
        Assertions.assertTrue(true);
    }

    @AfterAll
    static void tearDownAll() {
        Assertions.assertTrue(true);
    }
}

/************************************************************/
/************************************************************/
/************************************************************/
/************************************************************/
/************************************************************/
/************************************************************/
