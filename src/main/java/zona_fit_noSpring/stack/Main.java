package zona_fit_noSpring.stack;

public class Main {

    public static void main(String[] args) {
        Stack myStack = new Stack(2);

        /*System.out.println("Before push():");
        System.out.println("--------------");
        myStack.getTop();
        myStack.getHeight();*/

        /*System.out.println("\nStack:");
        myStack.printStack();

        myStack.push(1);

        System.out.println("\n\nAfter push():");
        System.out.println("-------------");
        myStack.getTop();
        myStack.getHeight();

        System.out.println("\nStack:");
        myStack.printStack();*/


        myStack.push(1);

        // (2) Items - Returns 1 Node
        System.out.println(myStack.pop().value);
        // (1) Item - Returns 2 Node
        System.out.println(myStack.pop().value);
        // (0) Items - Returns null
        System.out.println(myStack.pop());

    }
}
