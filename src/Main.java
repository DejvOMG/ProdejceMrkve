public class Main {
    public static void main(String[] args) {

        Seller seller1 = new Seller("Pavel Novotný", "Porubského 314, Praha");
        Seller seller2 = new Seller("Petr Oldbram", "Dvanácterákova 8, Opava");


        System.out.println("Names of the sellers:");
        System.out.println(seller1.name);
        System.out.println(seller1.adrress);
        System.out.println(seller2.name);
        System.out.println(seller2.adrress);
