package com.ligure.bridge;

/**
 * Created by Administrator on 2017/2/28.
 */
public class OracleConnector extends Connector {
    public OracleConnector(Driver driver) {
        super(driver);
    }
    @Override
    public void connect() {
        super.driver.connect();
    }
}
