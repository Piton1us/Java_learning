public class Car extends Transport {

    public Car(float speed,int weight,String color,int[] coordinate){
        super(speed,weight,color,coordinate);
    }

    @Override
    public void moveObject(int speed){
        System.out.println("Двигается со скоростью - "+ speed +"км/ч");
    }
}
