public class WaterBottle {
    private int volume;

    public WaterBottle(int volume) {
        this.volume = volume;
    }

    public int getVolume(){
        return this.volume;
    }

    public void drinkOneTenth(){
        this.volume -= 10;
    }

    public void emptyBottle(){
        this.volume = 0;
    }

    public void refillBottle() {
        this.volume = 100;
    }
}
