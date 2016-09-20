package com.example;

public class BinaryConvert {
    public static void main(String[] args) {
        String InputBinary = "0001110011";
        System.out.println(Binary2Number(InputBinary));

    }

    public static int Binary2Number(String nInput){
        int nOutput = 0;
 // I love radix - finally years of programming can solve in 1 line :P

    nOutput = Integer.parseInt(nInput,2);

        return nOutput;
    }
}
