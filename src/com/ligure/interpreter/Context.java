package com.ligure.interpreter;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2017/2/28.
 */
public class Context {
    private Map<Expression, Integer> map = new HashMap<Expression, Integer>();
    public void assign(Expression var, Integer value) {
        map.put(var, value);
    }
    public Integer lookup(Expression var) {
        return map.get(var);
    }
}
