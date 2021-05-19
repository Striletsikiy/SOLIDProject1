import io.*;
import model.Model;
import service.IService;
import service.ServiceSum;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws FileNotFoundException {

        //File file = new File("numbers.txt");
        //Scanner scanner = new Scanner(file);

        Scanner scanner = new Scanner(System.in);

        IReader reader = new ReaderConsole(scanner);
        //IPrinter printer = new PrinterStars();
        IPrinter printer = new PrinterConsole();
        IData data = new Data(reader, printer);
        IService service = new ServiceSum();

        Model model = new Model();

        model.init(data);
        model.print(service);
        model.done(data);
    }
}
