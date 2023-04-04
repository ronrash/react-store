package com.corejava.corejava.datatype;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

public class SmapleBigDecimal {

    // BigDecimal should be used over float and double for more precision values
    // use compareTo to comapre and not equlas
    // they are immutable
    // it extends NUmber class and implements Comparable interface

    public static void main(String[] args) {
        double d1 = 374.142;
        double d2 = 674.290;

        System.out.println(d2-d1); // 300.14799999999997

        BigDecimal b1 = new BigDecimal("374.142");
        BigDecimal b2 = new BigDecimal("674.290");

        System.out.println(b2.subtract(b1)); // 300.148 getting rounded values

        // we should not use double value to iniialise bigdecimal becoz it will give again large values
        // instead use string to initialize

        // rounding modes
        BigDecimal b3 = new BigDecimal(21.236);
      //  System.out.println(b3.setScale(1)); // throws an error need to round off
        System.out.println(b3.setScale(2, RoundingMode.CEILING)); // greater than 5 then increase the number .236 -- 24
        System.out.println(b3.setScale(2,RoundingMode.FLOOR));  // see the less vlue


      // we cannot use operators we have to use methods bcoz of the class

      // use comapreTo to compare BIgDecimal values

      BigDecimal bigDecimal1 = new BigDecimal("23.444");
      BigDecimal bigDecimal2 = new BigDecimal("23.444");

        System.out.println(bigDecimal1.setScale(2,BigDecimal.ROUND_CEILING)); // ceiling is next higher value
        System.out.println(bigDecimal2.setScale(2,BigDecimal.ROUND_FLOOR));  // floor next lower value
        System.out.println("using compare to method "+bigDecimal1.compareTo(bigDecimal2));// 0 if equal

    }


}
