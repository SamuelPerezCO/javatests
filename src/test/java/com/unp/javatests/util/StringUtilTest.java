package com.unp.javatests.util;

public class StringUtilTest {
    public static void main(String[] args) {

        String result = StringUtil.repeat("Hola" , 3);
        System.out.println(result);
        if(result.equals("HolaHolaHola")){
            System.out.println("Okey");
        }

        String result2 = StringUtil.repeat("Hola" , 1);
        System.out.println(result2);
        if (result2.equals("Hola")){
            System.out.println("OK");
        }
    }
}