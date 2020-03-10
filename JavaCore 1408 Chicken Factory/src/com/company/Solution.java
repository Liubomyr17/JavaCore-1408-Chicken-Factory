package com.company;

/*
1408  Куриная фабрика
Написать Фабрику(Factory) по производству кур(Hen):
1. Создать класс Hen.
1.1. Сделать его абстрактным.
1.2. Добавить в класс абстрактный метод int getCountOfEggsPerMonth().
1.3. Добавить в класс метод String getDescription(), который возвращает строку «Я — курица.«.
2. Создать класс RussianHen, который наследуется от Hen.
3. Создать класс UkrainianHen, который наследуется от Hen.
4. Создать класс MoldovanHen, который наследуется от Hen.
5. Создать класс BelarusianHen, который наследуется от Hen.
6. В каждом из четырех последних классов написать свою реализацию метода getCountOfEggsPerMonth.
Методы должны возвращать количество яиц в месяц от данного типа куриц.
7. В каждом из четырех последних классов написать свою реализацию метода getDescription.
Методы должны возвращать строку вида:
<getDescription() родительского класса> + <» Моя страна — Sssss. Я несу N яиц в месяц.»>
где Sssss — название страны
где N — количество яиц в месяц
8. В классе HenFactory реализовать метод getHen, который возвращает соответствующую стране породу кур.
9. Все созданные вами классы должны быть в отдельных файлах.

Требования:
1. Класс Hen должен быть абстрактным.
2. Класс Hen должен содержать абстрактный метод int getCountOfEggsPerMonth().
3. В классе Hen должен быть реализован метод String getDescription(), который возвращает строку "Я - курица.".
4. Классы RussianHen, UkrainianHen, MoldovanHen и BelarusianHen должны наследоваться от класса Hen и быть созданы в отдельных файлах.
5. Классы RussianHen, UkrainianHen, MoldovanHen и BelarusianHen должны реализовывать метод getCountOfEggsPerMonth, который должен возвращать количество яиц в месяц от данного типа куриц.
6. Классы RussianHen, UkrainianHen, MoldovanHen и BelarusianHen должны переопределять метод getDescription родительского класса, таким образом, чтобы возвращаемая ими строка имела вид: + < Моя страна - Sssss. Я несу N яиц в месяц.> где Sssss - название страны, а N - количество яиц в месяц.
7. Метод getHen должен быть реализован в классе HenFactory и должен возвращать тип кур для переданной в него страны.

BelarusianHen.java
	package com.javarush.task.task14.task1408;


	 Created by Alex on 2/16/17.

public class BelarusianHen extends Hen{

    @Override
    public int getCountOfEggsPerMonth() {
        return 60;
    }

    public String getDescription(){
        return super.getDescription() + " Моя страна - "+ Country.BELARUS+". Я несу "+getCountOfEggsPerMonth() +" яиц в месяц.";    }
}



Country.java

public interface Country {
    String UKRAINE = "Ukraine";
    String RUSSIA = "Russia";
    String MOLDOVA = "Moldova";
    String BELARUS = "Belarus";
}


 Hen.java


public abstract class Hen{

    public abstract int getCountOfEggsPerMonth();

    public String getDescription(){
        return "Я - курица.";
    }

}



MoldovanHen.java

public class MoldovanHen extends Hen{

    @Override
    public int getCountOfEggsPerMonth() {
        return 20;
    }

    public String getDescription(){
        return super.getDescription() + " Моя страна - "+ Country.MOLDOVA+". Я несу "+getCountOfEggsPerMonth() +" яиц в месяц.";}
}


 RussianHen.java


public class RussianHen extends Hen {

    @Override
    public int getCountOfEggsPerMonth() {
        return 100;
    }

    public String getDescription(){
        return super.getDescription() + " Моя страна - "+ Country.RUSSIA+". Я несу "+getCountOfEggsPerMonth() +" яиц в месяц.";}
}

 Solution.java


public class Solution {
    public static void main(String[] args) {
        Hen hen = HenFactory.getHen(Country.BELARUS);
        hen.getCountOfEggsPerMonth();
    }

    static class HenFactory {

        static Hen getHen(String country) {
            Hen hen = null;

            if (country.equals("Belarus")) return new BelarusianHen();
            else if (country.equals("Ukraine")) return new UkrainianHen();
            else if (country.equals("Moldova")) return new MoldovanHen();
            else return new RussianHen();
            //напишите тут ваш код

        }
    }
}


 UkrainianHen.java


public class UkrainianHen extends Hen{

    @Override
    public int getCountOfEggsPerMonth() {
        return 80;
    }

    public String getDescription(){
        return super.getDescription() + " Моя страна - "+ Country.UKRAINE+". Я несу "+getCountOfEggsPerMonth() +" яиц в месяц.";}
}










*/
