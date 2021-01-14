package com.andersen.patterns.command;


import com.andersen.patterns.command.entity.Database;

public class InsertCommand implements Command {
    private Database database;

    public InsertCommand(Database database) {
        this.database = database;
    }

    @Override
    public void execute() {
        database.insert();
    }
}
