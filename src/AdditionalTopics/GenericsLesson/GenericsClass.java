package AdditionalTopics.GenericsLesson;

public class GenericsClass {
    public static void main(String[] args) {
//так же у нас могут быть случаи когда нам нужно объявить переменную
//но мы не можем заранее знать к какому типу данных ее отнести(смотри класс Account)

        //вот итог, поле Id может быть как строкой, так и числом
        Account account1 = new Account("123", 50000);
        Account account2 = new Account(456, 10000);

        //так же можно обобщать интерфейсы, методы и конструкторы
        //и еще можем использовать даже несколько универсальных параметров
        //(если хочешь узнать об этом, то читай,
        //мне лень было записывать это дальше
        //ну ладно, немного расскажу
        //В случае интерфейсов мы можем обобщить только метод инетрфейса,
        //для его переиспользования, а метод класса наследника сделать с фиксированным параметром
        //или можем обощить и метод интерфейса и метод и параметр наследника

    }
}


//и тут нам на помощь приходит обобщение класса и переменной
//Обобщение класса происходит за счет добавления к классу <T>
//Параметр <T> скобках называется универсальным параметром
class Account<T>{
    private T id;
    private int sum;

    public Account(T id, int sum) {
        this.id = id;
        this.sum = sum;
    }

    public T getId(){return id;}
    public int getSum(){return sum;}
    public void setSum(int sum){this.sum = sum;}
}