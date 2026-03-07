package Day3;

public class Thermostat {
    private int temperature;

    public void setTemperature(int t) {
        if (t < 16) temperature = 16;
        else if (t > 30) temperature = 30;
        else temperature = t;
    }

    public int getTemperature() {
        return temperature;
    }
    public static void main(String[] args) {
        Thermostat thermostat = new Thermostat();
        thermostat.setTemperature(10);
        System.out.println("Temperature set to: " + thermostat.getTemperature());
        thermostat.setTemperature(25);
        System.out.println("Temperature set to: " + thermostat.getTemperature());
        thermostat.setTemperature(35);
        System.out.println("Temperature set to: " + thermostat.getTemperature());
    }
} 
