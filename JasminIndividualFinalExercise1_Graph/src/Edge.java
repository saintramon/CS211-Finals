/**
 * NAME: JASMIN, Ramon Emmiel P.
 * DATE: 17 November 2023
 */
public class Edge {
    private Node start;
    private Node end;
    private double weight;
    private int id;

    /**
     * Constructor for the Edge class
     * @param start
     * @param end
     * @param weight
     * @param id
     */
    public Edge(Node start, Node end, double weight, int id){
        this.start = start;
        this.end = end;
        this.weight = weight;
        this.id = id;
    }

    public Node getStart() {
        return start;
    }

    public Node getEnd() {
        return end;
    }

    public double getWeight() {
        return weight;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return ("(" + start + "," + end + ")");
    }
}
