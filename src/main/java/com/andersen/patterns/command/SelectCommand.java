package com.andersen.patterns.command;


import com.andersen.patterns.command.entity.Database;

public class SelectCommand implements Command {
    private Database database;

    public SelectCommand(Database database) {
        this.database = database;
    }

    @Override
    public void execute() {
        database.select();
    }
}
