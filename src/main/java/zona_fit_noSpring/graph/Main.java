package zona_fit_noSpring.graph;



public class Main {
    public static void main(String[] args) {
        Graph myGraph = new Graph();

        myGraph.addVertex("A");
        myGraph.addVertex("B");
        myGraph.addVertex("C");

        myGraph.addEdge("A", "B");
        myGraph.addEdge("A", "C");
        myGraph.addEdge("B", "C");


        //System.out.println("\nGraph before removeEdge():");
        System.out.println("\nGraph before removeVertex():");
        myGraph.printGraph();

        myGraph.removeVertex("D");
        //myGraph.removeEdge("A", "B");

        //System.out.println("\nGraph after removeEdge():");
        System.out.println("\nGraph after removeVertex():");
        myGraph.printGraph();
    }
}
