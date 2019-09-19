public class FlourPacker {

    public boolean canPack(int bigCount, int smallCount, int goal) {

        if(bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }

        if(bigCount*5 < goal) {
            return (bigCount*5) + smallCount >= goal;
        } else {
            return smallCount >= goal%5;
        }

    }
}
