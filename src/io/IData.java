package io;

public interface IData extends IReader, IPrinter{

    //метод який виводить щосб на еран , та повертає сканер який считує дані з клавіатури
    default int input(String text) {
        print(text);
        return read();
    }
}
