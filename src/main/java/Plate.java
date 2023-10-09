public class Plate {
    private int food;

    public Plate(int food){
        this.food = food;
    }
    public  void info(){
        System.out.println("В миске: " + food + " кусочков корма.");
    }
    public  int getFood(){
        return  food;
    }

    public  void decreaseFood(int amount) {
        if (food >= amount){
            food -= amount;
        }
    }
    public  void addFood(int amount){
        if (amount >0){
            food += amount;
            System.out.println("В миску добавлено " + amount + " кусочков корма.");
        }
    }
}