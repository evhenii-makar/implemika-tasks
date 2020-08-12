package com.imaginarium.webstudio.task1;

import java.util.Scanner;

public class Bracket {
    /*
    * for calculations  use the recursive Catalans formula C[n] = C[k]C[n-1-k]

    */
    private int minimumSequence = 0;
    private int resultOfMinimumSequence = 1;

    public int getBraсketVariation(int countBracket){
        if(countBracket == minimumSequence){
            return resultOfMinimumSequence;
        }
        int result = 0;
        for(int i =0; i<countBracket; i++){
            result += getBraсketVariation(i) * getBraсketVariation(countBracket - 1 - i);
        }
        return result;
    }

    public void startInputFromConsole(){
        Scanner scanner = new Scanner(System.in);
        int countBracket = 0;
        System.out.println ("Enter the number of pairs of brackets: ");
        while (scanner.hasNext()){

            if(scanner.hasNextInt()){
                countBracket = scanner.nextInt();
                System.out.println("possible variation " + getBraсketVariation(countBracket));
                break;
            }
            System.out.println (scanner.next() + " it`s not number");
            System.out.println ("Enter the number of pairs of brackets: ");

        }
        System.out.println ("Enter the number of pairs of brackets: " + countBracket);

    }

}
