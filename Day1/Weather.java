class temp{
    String city;
    float temp;
    int humidity;
    void display(){
        if(temp > 35){
            if(humidity>70){
                System.out.println(city + " is experiencing very Hot weather.\nDrink water");
            } else {
                System.out.println(city + " is experiencing very Hot weather.");
            }
        }
        else if(temp >=20){
            System.out.println(city + " is experiencing Moderate weather.");
        }
        else{
            System.out.println(city + " is experiencing Cold weather.\nWear warm clothes");
        }
    }
}
public class Weather {
    public static void main(String[] args){
        temp t1=new temp();
        t1.city="Phoenix";
        t1.temp=40.0f;
        t1.humidity=75;
        t1.display();

        temp t2=new temp();
        t2.city="San Francisco";
        t2.temp=18.5f;
        t2.humidity=60;
        t2.display();
    }
}
