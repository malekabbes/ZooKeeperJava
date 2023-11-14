package fr.isep;

import fr.isep.Node;

public class Leader extends Node {
    public Leader(int nodeId) {
        super(nodeId);
    }

    @Override
    public void processModification(String data) {
        String logEntry = createLogEntry(data);
        this.log.add(new LogEntry(logEntry));
        // Notify followers to update their logs
    }

    private String createLogEntry(String data) {
        // Create log entry with timestamp and ID
        long timestamp = System.currentTimeMillis();
        return "ID " + this.nodeId + " \"" + data + "\" " + timestamp;
    }

    public void suggestNumber() {
        // Suggest a number for clients to guess
    }

    public void verifyGuesses() {
        // Verify client guesses and determine the closest guess
    }
}
