public class Program {
    public  static void main(String[] args){
        Cat[] cats = {new Cat("Барсик", 5),new Cat("Лаки", 8), new Cat("Мурка", 10)};
        Plate plate = new Plate(20);

        plate.info();

        for (Cat cat : cats) {
            cat.eat(plate);
            System.out.println(cat.getName() + ":" + (cat.isSatiety() ? " сыт" : " голоден"));
        }

        plate.info();
        plate.addFood(30);
        plate.info();
    }
}
