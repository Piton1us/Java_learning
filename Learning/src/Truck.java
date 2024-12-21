public class Truck extends Transport{

    private boolean isLoaded;

    public Truck(float speed,int weight){
        super(speed,weight);
    }

    public Truck(float speed,int weight, boolean isLoaded){
        super(speed,weight);
        this.isLoaded = isLoaded;
    }

    @Override
    public void moveObject(int speed){
        System.out.println("Двигается со скоростью - "+ speed +"км/ч");
    }

    public void setValues(float speed,int weight,String color,int[] coordinate, boolean isLoaded){
        super.setValues(speed,weight,color,coordinate);
        this.isLoaded = isLoaded;

    }

    @Override
    protected String getValues() {
       System.out.println(super.getValues());
       return getLoaded();
    }

    public void setLoaded(boolean loaded){
        isLoaded = loaded;
    }

    public String  getLoaded(){
        if(isLoaded){
           return  "Грузовик загружен";
        }else{
            return "Грузовик не загружен";
        }
    }

}
