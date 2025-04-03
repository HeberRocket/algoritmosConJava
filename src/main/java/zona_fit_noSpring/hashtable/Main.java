package zona_fit_noSpring.hashtable;

public class Main {
    public static void main(String[] args) {

        HashTable myHashTable = new HashTable();


        /*System.out.println( myHashTable.hash("paint") );
        System.out.println( myHashTable.hash("bolts") );
        System.out.println( myHashTable.hash("nails") );
        System.out.println( myHashTable.hash("stuff") );
        System.out.println( myHashTable.hash("lumber") );*/

        /*myHashTable.set("nails", 100);
        myHashTable.set("tile", 50);
        myHashTable.set("lumber", 80);
        myHashTable.set("bolts", 200);
        myHashTable.set("screws", 140);
        myHashTable.printTable();*/

        myHashTable.set("paint", 20);
        myHashTable.set("bolts", 40);
        myHashTable.set("nails", 100);
        myHashTable.set("tile", 50);
        myHashTable.set("lumber", 80);

        System.out.println( myHashTable.keys() );

        /*System.out.println("Lumber:");
        System.out.println( myHashTable.get("lumber") );

        System.out.println("\nBolts:");
        System.out.println( myHashTable.get("bolts") );*/


    }
}
