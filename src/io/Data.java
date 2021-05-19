package io;

import java.util.Scanner;

public class Data implements IData{

    private IReader reader;
    private IPrinter printer;

    //конструктор з параметрами
    public Data(IReader reader, IPrinter printer) {
        this.reader = reader;
        this.printer = printer;
    }

    //Перегружені методи
    //вивід тексту
    @Override
    public void print(String text){
        printer.print(text);
    }

    //вивід числа
    @Override
    public void print(int number){
        printer.print(number);
    }

    //считування з клавіатури
    @Override
    public int read(){
       return reader.read();
    }
}
