package com.andersen.patterns.command;

import com.andersen.patterns.command.entity.Database;
import org.junit.Before;
import org.junit.Test;

public class CommandTest {
    Database database;
    CommandRunning commandRunning;

    @Before
    public void init(){
        database = new Database();
        commandRunning = new CommandRunning(
                new SelectCommand(database),
                new InsertCommand(database),
                new DeleteCommand(database),
                new UpdateCommand(database)
        );
    }

    @Test
    public void startCommand() {
        commandRunning.selectRecord();
        commandRunning.insertRecord();
        commandRunning.deleteRecord();
        commandRunning.updateRecord();
    }
}