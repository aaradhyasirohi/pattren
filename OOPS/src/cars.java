public class cars implements Comparable<cars>{
    int price;
    int speed;
    String color;
    public cars(){
    }
    public cars(int price,int speed,String color){
        this.price=price;
        this.color=color;
        this.speed=speed;
    }
    @Override
    public String toString(){
        return "P : " +this.price+ " S:"+ this.speed+" C: "+this.color;
    }

    @Override
    public int compareTo(cars o) {
        return this.color.compareTo(o.color);
       // return this.speed-o.speed;
    }
}
