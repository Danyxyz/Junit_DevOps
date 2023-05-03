package com.example.demo.demo;
public class Calculator {
    
    public int processNumbers(int a, int b, char operation){
        if (operation == '+') {
            return  a + b;
        } else if (operation =='-'){
            return  a - b;

        } else if (operation =='*') {
            return a * b;

        } else if (operation =='/') {
            return a / b;

        } else if (operation == '%') {
            return a % b;
        } else if (operation =='s') {
            return a * a;
        } else if (operation =='a') {
            return Math.abs(a-b);
        } else if (operation == 'm') {
            return Math.max(a, b);
        }
        return 0;
    }
}
