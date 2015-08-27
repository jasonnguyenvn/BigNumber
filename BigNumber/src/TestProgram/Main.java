/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestProgram;

import InputLib.input;
import StackAndQueue.BigNumber;
import java.util.Scanner;

/**
 *
 * @author study
 */
public class Main {
    public static void main(String[] args) {
        String numA = "", numB = "";
        Scanner sc = new Scanner(System.in);
        numA = input.inputStringInorgeSpace(sc, "Input number A: ");
        sc = new Scanner(System.in);
        numB = input.inputStringInorgeSpace(sc, "Input number B: ");
//        for (int i = 1, j = 1, k=9; i < 5000; i++, j++, k--) {
//            if(j>=10)
//                j=1;
//            if(k==1)
//                k=9;
//            numA += Integer.toString(k);
//            numB += Integer.toString(j);
//            
//        }
        
        BigNumber big1, big2, addRe, subRe, mulRe, divRe;
        big1 = BigNumber.parse(numA);
        big2 = BigNumber.parse(numB);
        System.out.println("Computing....");
        addRe = big1.Add(big2);
        System.out.println("Result of A + B: " + addRe);
        System.out.println("Computing....");
        subRe = big1.Sub(big2);
        System.out.println("Result of A - B: " + subRe);
        System.out.println("Computing....");
        mulRe = big1.Mul(big2);
        System.out.println("Result of A * B: " + mulRe);
        System.out.println("Computing....");
        divRe = big1.Div(big2);
        System.out.println("Result of A / B: " + divRe);
    }
}
