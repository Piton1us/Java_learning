public abstract class Transport {

private float speed;
private int weight;
protected String color;
private int[] coordinate;


public Transport(float _speed,int _weight,String _color,int[] _coordinate){
    System.out.println("Объект создан");
    setValues(_speed,_weight,_color,_coordinate);
   // System.out.println(getValues());
}

public Transport(float speed,int weight){
    System.out.println("Объект создан");
    this.speed = speed;
    this.weight = weight;
   // System.out.println(getValues());
}

public  abstract void moveObject(int speed);


protected void setValues(float speed,int weight,String color,int[] coordinate){
   this.speed = speed;
   this.weight = weight;
   this.color = color;
   this.coordinate = coordinate;
}

protected String getValues(){

    if (color == null){
        String info = "object speed: " + speed + ". weight: " + weight;
        return info;
    }
String info = "object speed: " + speed + ". weight: " + weight + " .color: " + color;

    return info;
}







}
