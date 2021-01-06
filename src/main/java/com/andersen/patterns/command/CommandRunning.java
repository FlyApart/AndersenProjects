package com.andersen.patterns.command;

/**
 * launching methods of the Database class through separate entities with uniform interfaces Command
 */
public class CommandRunning {
    Command select;
    Command insert;
    Command delete;
    Command update;

    public CommandRunning(Command select, Command insert, Command delete, Command update) {
        this.select = select;
        this.insert = insert;
        this.delete = delete;
        this.update = update;
    }

    public void selectRecord(){
        select.execute();
    }

    public void insertRecord(){
        insert.execute();
    }

    public void deleteRecord(){
        delete.execute();
    }

    public void updateRecord(){
        update.execute();
    }
}
