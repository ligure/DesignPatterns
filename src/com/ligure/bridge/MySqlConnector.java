package com.ligure.bridge;

/**
 * Created by Administrator on 2017/2/28.
 */
public class MySqlConnector extends Connector {
    public MySqlConnector(Driver driver) {
        super(driver);
    }
    @Override
    public void connect() {
        driver.connect();
    }
}
