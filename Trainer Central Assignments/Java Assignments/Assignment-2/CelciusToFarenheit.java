// 1. Write a program to convert Celsius to Fahrenheit using appropriate datatypes and literal conventions

import java.util.Scanner;

public class CelciusToFarenheit {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter temprature in Celsius : ");
        float tempInCelsius = sc.nextFloat();

        System.out.println(tempInCelsius + "'C in Farenheit scale is : " + convertToFarenheit(tempInCelsius)+"'F");
        sc.close();
    }
    // To convert Celsius to Fahrenheit, we use the C to F formula which is °F = (9/5) °C+32
    public static float convertToFarenheit(float tempInCelsius){
        float tempInFarenheit = (9.0f / 5.0f) * tempInCelsius + 32;

        return tempInFarenheit;
    }
}
