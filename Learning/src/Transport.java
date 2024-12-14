public class Transport {

public float speed;
public int weight;
public String color;
public int[] coordinate;

public void setValues(float _speed,int _weight,String _color,int[] _coordinate){
    speed = _speed;
    weight = _weight;
    color = _color;
    coordinate = _coordinate;
}

public String getValues(){

String info = "object speed: " + speed + ". weight: " + weight + " .color: " + color;

    return info;
}







}
