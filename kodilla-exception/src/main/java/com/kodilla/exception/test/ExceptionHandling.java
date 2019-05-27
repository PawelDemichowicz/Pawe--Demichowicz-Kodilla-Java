package com.kodilla.exception.test;

public class ExceptionHandling {

    public static void main(String[] args) {

        SecondChallenge secondChallenge = new SecondChallenge();

        try{
            System.out.println(secondChallenge.probablyIWillThrowException(2,1));
        } catch (Exception e){
            System.out.println("First parametr must be in the range od <1,2) and second parametr cant be equals 1.5");
        } finally {
            System.out.println("Throw and throws exam");
        }
    }
}
