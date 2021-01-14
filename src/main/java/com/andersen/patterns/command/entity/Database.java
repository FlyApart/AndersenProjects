package com.andersen.patterns.command.entity;


import org.apache.log4j.Logger;

/**
 * Entity for command Pattern
 */
public class Database {

    Logger log = Logger.getLogger(Database.class);
    public void insert(){
        log.info("Inserting...");
    }
    public void update(){
        log.info("Updating...");
    }
    public void select(){
        log.info("Reading...");
    }
    public void delete(){
        log.info("Deleting...");
    }
}
