public class Bulb {
    private boolean isOn;

    public Bulb() {
        isOn = false; 
    }

    public void turnOn() {
        isOn = true;
    }

    public void turnOff() {
        isOn = false;
    }

    public boolean isOn() {
        return isOn;
    }

    @Override
    public String toString() {
        return "Bulb is " + (isOn ? "on" : "off");
    }
}
