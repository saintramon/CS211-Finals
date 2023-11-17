/**
 * NAME: JASMIN, Ramon Emmiel P.
 * DATE: 17 November 2023
 *
 * SAMPLE RUN:
 *
 * Succesfully added (1,2)
 * Succesfully added (1,3)
 * List of all edges that node 1 has:
 * =================================================
 * ID of Edge: 1
 * ID of the first node: 1
 * ID of the second node: 2
 *
 * ID of Edge: 2
 * ID of the first node: 1
 * ID of the second node: 3
 *
 * [(1,2), (1,3)]
 */
public class TestGraph implements Runnable{
    public static void main(String[] args) {
        try {
            TestGraph program = new TestGraph();
            Thread thread = new Thread(program);
            thread.start();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void run(){
        Graph graph = new Graph();

        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);

        graph.createNode(node1);
        graph.createNode(node2);
        graph.createNode(node3);

        Edge e12 = new Edge(node1,node2,5,1);
        Edge e13 = new Edge(node1, node3,10,2);

        if (graph.checkForAvailability()){
            node1.addNeighbor(e12);
            node1.addNeighbor(e13);
            node1.getNeighbors();
        }else {
            System.out.println("There are less than 2 nodes. Add more to connect");
        }
    }
}
