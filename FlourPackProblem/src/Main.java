public class Main {

    public static void main(String[] args) {

        FlourPacker flour = new FlourPacker();

        System.out.println(flour.canPack(1, 0, 4));
        System.out.println(flour.canPack(1, 0, 5));
        System.out.println(flour.canPack(0, 5, 4));
        System.out.println(flour.canPack(2, 1, 5));
        System.out.println(flour.canPack(-3, 2, 12));


    }

}
