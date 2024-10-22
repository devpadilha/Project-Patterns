public class Light {
    private String place;

    public Light(String place) {
        this.place = place;
    }

    public void turnOn() {
        System.out.println(place + ": Light turned on");
    }

    public void turnOff() {
        System.out.println(place + ": Light turned off");
    }
}
