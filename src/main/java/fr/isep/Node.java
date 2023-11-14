package fr.isep;

import java.util.ArrayList;
import java.util.List;

public abstract class Node {
    protected int nodeId;
    protected List<LogEntry> log;

    public Node(int nodeId) {
        this.nodeId = nodeId;
        this.log = new ArrayList<>();
    }

    public abstract void processModification(String data);
}
