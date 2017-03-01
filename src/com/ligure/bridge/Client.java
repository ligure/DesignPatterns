package com.ligure.bridge;

/**
 * Created by Administrator on 2017/2/27.
 */
public class Client {
    public static void main(String[] args) {
        Driver driver = new MySqlDriver();
        Connector connector = new MySqlConnector(driver);
        connector.connect();
        driver = new OracleDriver();
        connector = new OracleConnector(driver);
        connector.connect();
    }
}
