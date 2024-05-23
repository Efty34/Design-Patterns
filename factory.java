abstract class vehicle{
    public abstract int getWheel();
    public String toString(){
        return "Wheel: "+this.getWheel();
    }
}

class car extends vehicle{
    int wheel;
    car(int wheel){
        this.wheel = wheel;
    }
    @Override
    public int getWheel(){
        return this.wheel;
    }
}

class bike extends vehicle{
    int wheel;
    bike(int wheel){
        this.wheel = wheel;
    }
    @Override
    public int getWheel(){
        return this.wheel;
    }
}

class vehicleFactory{
    public static vehicle getInstance(String type, int wheel){
        if(type.equals("car")){
            return new car(wheel);
        }
        else if(type.equals("bike")){
            return new bike(wheel);
        }
        return null;
    }
}

public class factory {
    public static void main(String[] args){
        vehicle car = vehicleFactory.getInstance("car", 4);
        System.out.println(car);

        vehicle bike = vehicleFactory.getInstance("bike", 2);
        System.out.println(bike);
    }    
}
