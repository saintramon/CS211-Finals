/**
 * NAME: JASMIN, Ramon Emmiel P.
 * DATE: 17 November 2023
 */

import java.util.ArrayList;
import java.util.List;

public class Node {
    private int id;
    private List<Edge> neighbors = new ArrayList<Edge>();

    public Node(int id){
        this.id = id;
    }

    public int getId() {
        return id;
    }

    /**
     * getNeighbors method will display all the neighbors of a node
     * It will first display the edges, with its corresponding id and the other connected to it
     */
    public void getNeighbors() {
        System.out.println("List of all edges that node " + this.id + " has: ");
        System.out.println("=================================================");
        for (int i = 0; i < this.neighbors.size(); i++){
            System.out.println("ID of Edge: " + neighbors.get(i).getId() + "\nID of the first node: " + neighbors.get(i).getStart() +
                    "\nID of the second node: " + neighbors.get(i).getEnd());
            System.out.println();
        }
        System.out.println(neighbors);
    }

    /**
     * addNeighbor method adds the Edge e to the neighbors list of a node if it does not exist already
     * @param e
     */
    public void addNeighbor(Edge e){
        if (this.neighbors.contains(e)){
            System.out.println("This edge has already been used for this node");
        }else {
            System.out.println("Succesfully added " + e);
            this.neighbors.add(e);
        }
    }

    @Override
    public String toString() {
        return ""+id;
    }
}
