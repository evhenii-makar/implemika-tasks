package com.imaginarium.webstudio.task3;

import java.math.BigInteger;

public class FactorialSumm {
    /**
     *
     * @param number
     * @return  the sum of the digits in the factorial number
     */
    public int getFactorialSumm(int number){
        /**
        * we get the factorial as String
         */
        String factorial = getFactorial(number).toString();

        String[] numArray = factorial.split("");
        int factorialSumm = 0 ;
        for (String num: numArray) {
            factorialSumm += Integer.parseInt(num);
        }
        return factorialSumm;
    }

    /**
     * we get the factorial of a given number
     * @param number
     * @return BigInteger factorial number
     */
    private BigInteger getFactorial(int number){
        BigInteger factorial = BigInteger.ONE;

        if (number == 0 || number == 1){ // factorial numm 0 and 1 == 1
            return factorial;
        }

        for (int i = 1; i< number+1;i++){
            factorial = factorial.multiply(BigInteger.valueOf(i));
            System.out.println(factorial);
        }
        return factorial;
    }
}
