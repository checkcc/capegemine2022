package com.demo;

public class CommandLineArgDemo {

public static void main(String args[]){

String firstnumber=args[0];

int a = Integer.parseInt(firstnumber);

String secondnuber=args[1];

int b = Integer.parseInt(secondnuber);


int c=a+b;
System.out.println(c);


}

}