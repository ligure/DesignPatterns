package com.ligure.iterator;

/**
 * Created by Administrator on 2017/2/28.
 */
public class Client {
    public static void main(String[] args) {
        String [] s = {"a","b","c","d"};
        Container c = new List(s);
        Iterator i = c.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }
}
