package io;

public class PrinterStars implements IPrinter{

    @Override
    public void print(String text){
        System.out.print(text);
    }
    @Override
    public void print(int number){
        for (int j=0; j<number; j++){
            print("*");

        }
    }
}
