package io;

public class PrinterConsole implements IPrinter{

    //перегружений метор виводу тексту
    @Override
    public void print(String text){
        System.out.print(text);
    }

    //перегружений метод виводу числа
    @Override
    public void print(int number){
        System.out.println(number);
    }
}
