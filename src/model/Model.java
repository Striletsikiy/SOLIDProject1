package model;

import io.IData;
import io.IPrinter;
import service.IService;

public class Model {

    int a, b, sum;

    //метод для вводу даних
    public void init(IData data){
        a = data.input("Enter a: ");
        b = data.input("Enter b: ");
    }

    //метод для оьчислення введених даних
    public void print(IService service){
        sum = service.calculate(a, b);
    }

    //метод для виводу результату
    public void done(IPrinter printer){
        printer.print("Result: ");
        printer.print(sum);
    }
}
