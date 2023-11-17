/**
 * NAME: JASMIN, Ramon Emmiel P.
 * DATE: 17 November 2023
 */

import java.util.List;
import java.util.ArrayList;
public class Graph {
    private List<Node> nodes = new ArrayList<Node>();
    private int numberOfNodes = 0;

    /**
     * checkForAvailability method returns a boolean whether the Graph object has more than 1 node
     * @return
     */
    public boolean checkForAvailability(){
        return this.numberOfNodes > 1;
    }

    /**
     * createNode adds a node to the nodes list of the Graph
     * @param node
     */
    public void createNode(Node node){
        this.nodes.add(node);
        ++this.numberOfNodes;
    }

    public int getNumberOfNodes(){
        return this.numberOfNodes;
    }
}
