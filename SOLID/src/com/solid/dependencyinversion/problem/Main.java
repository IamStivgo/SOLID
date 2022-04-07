package com.solid.dependencyinversion.problem;

public class Main {
    public static void main(String[] args) {
        String origin = "";
        String dbPath = "";
        Monitor monitor = new Monitor(origin);
        monitor.show();
        FileDB fileDB = new FileDB(dbPath, origin);
        fileDB.save();
    }
}
