public class Cat {
    private String name;
    private  int appetite;
    private boolean satiety;

    public  Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = false;
    }
    public  void  eat(Plate plate) {
        if (plate.getFood() >= appetite) {
            plate.decreaseFood(appetite);
            satiety = true;
            System.out.println(name + " съел " + appetite + " кусочков корма");
        } else  {
            satiety = false;
            System.out.println(name + " не смог поесть, в тарелке недостаточно корма.");
        }
    }
    public boolean isSatiety() {
        return satiety;
    }
    public  String getName() {
        return name;}

}
