package service;

public class ServiceSum implements IService{

    //перегружений метод для обчислення
    @Override
    public int calculate(int a, int b){
        return a * b;
    }
}
