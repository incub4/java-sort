package training;

class FDemo{
    int x;

    FDemo(int i){ //Конструктор
        x=i;
    }

    protected void finalize() throws Throwable{
        System.out.println("финализация " + x);
    }

    // Генерирует объект который тотчас уничтожается
    void generator(int i){
        FDemo o = new FDemo(i);
    }
}

public class Finalize {
    public static void main(String[] args) {
        int count;

        FDemo ob = new FDemo(0);

        for (count=1; count<100000; count++){
            ob.generator(count);
        }
    }
}
