package training;

class Vehicle{ //транспортное средство
    int passengers, // пассажиры(кол-во)
    fuelcup,        // топливный бак(емкость)
    mpg;            // расход топлива(в милях на галлон)

    public Vehicle(int passengers, int fuelcup, int mpg) {
        this.passengers = passengers;
        this.fuelcup = fuelcup;
        this.mpg = mpg;
    }

    int rang(){
        return fuelcup*mpg; //возвращает сколько проедет миль на одном баке
    }

    double fuelneeded (int milies){ //Расчет объема топлива необходимого для преодоления заданного расстаяния
        return (double) milies/mpg;
    }
}

class ChkNum{
    boolean isEven(int x){
        if (x % 2 == 0) return true;
        else return false;
    }
}




public class TestClass {
    public static void main(String[] args) {
//        training.ChkNum cn = new training.ChkNum();
//        System.out.println("Число 11 четное ? - " + cn.isEven(11));

    }
}
