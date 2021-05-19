package io;

import java.util.Scanner;

public class ReaderConsole implements IReader{

    private Scanner scanner;

    //конструктор за допомогою якого ми можемо використовувати будь який метод сканеру
    public ReaderConsole(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public int read(){
        return scanner.nextInt();
    }
}
