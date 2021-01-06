package com.andersen.patterns.command;


import com.andersen.patterns.command.entity.Database;

public class DeleteCommand implements Command {
    private Database database;

    public DeleteCommand(Database database) {
        this.database = database;
    }

    @Override
    public void execute() {
        database.delete();
    }
}
