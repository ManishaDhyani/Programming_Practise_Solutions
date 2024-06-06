package com.codechef.java.basic;


import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class PS_01_Solution
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);

        int size,count,result,flag;
        int arr[];
        int testCases = sc.nextInt();

        for(int i=0;i<testCases;i++){

            count=0;
            result=0;
            flag=0;
            size = sc.nextInt();
            arr = new int[size];

            for(int j=0;j<size;j++){

                arr[j]=sc.nextInt();

            }

            for(int n : arr){
                if(n<0){
                    count++;
                }
                if(n==0){
                    flag = 1;
                    break;
                }
            }

            if(flag==1){
                System.out.println("0");
            }else{
                if(count%2==0){
                    System.out.println("0");
                }else{
                    System.out.println("1");
                }
            }
        }
    }
}