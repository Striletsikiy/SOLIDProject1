import io.Data;
import io.IData;
import model.Model;
import service.IService;
import service.ServiceSum;

import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        IData data = new Data(scanner);
        IService service = new ServiceSum();
        Model model = new Model();

        model.init(data);
        model.print(service);
        model.done(data);
    }
}
