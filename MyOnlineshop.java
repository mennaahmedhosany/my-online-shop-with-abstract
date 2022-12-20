/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myonlineshop;

import java.util.Scanner;

/**
 *
 * @author ORIGINAL
 */
public class MyOnlineshop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("the number of books do you want");
        Scanner input= new Scanner (System.in);
        int size= input.nextInt();
        product[] arr=new childern_class[size];
        double price;
        double total=0;
        for(int i=0 ; i<arr.length;i++)
        {
            System.out.println("the price of books do you want" +(i+1));
            price=input.nextInt();
            arr[i]=new childern_class(price);
            arr[i].price();
            total=+arr[i].price();
        }
        System.out.println(total);
    }
    
}
