public class WaterBottle {
    private int volume;

    public WaterBottle(int volume){
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int emptyBottle(){
        return this.volume = 0;
    }

    public int fullBottle(){
        return this.volume = 100;
    }

    public int subtractBottle() {
        if (this.volume >= 0) {
            return this.volume -= 10;
        }
        return volume;
    }
}








