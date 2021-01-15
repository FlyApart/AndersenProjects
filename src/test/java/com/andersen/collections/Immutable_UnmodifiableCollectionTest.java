package com.andersen.collections;

import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

public class Immutable_UnmodifiableCollectionTest {
    Logger logger = Logger.getLogger(this.getClass());
    StringBuilder sb;
    StringBuilder sb2;

    @Before
    public void init(){
        sb = new StringBuilder("Testing Word");
        sb2 = new StringBuilder("Testing Word 2");
    }

    @Test
    public void modifiableCollectionTest(){
        List<StringBuilder> modList = new ArrayList<>();
        modList.add(sb);
        assertEquals(1,modList.size());
        modList.add(sb2);
        assertEquals(2,modList.size());

        assertEquals("Testing Word",modList.get(0).toString());

        assertEquals("Testing Word123", modList.get(0).append(123).toString());
    }

    @Test
    public void immutableCollectionTest(){
        List<StringBuilder> modList = new ArrayList<>();
        modList.add(sb);
        List<StringBuilder> immutableList = List.of(modList.toArray(new StringBuilder[]{}));

        modList.add(sb2);
        assertEquals(1, immutableList.size());

        boolean exceptionThrown = false;
        try {
            immutableList.add(sb2);
            fail("add supported for immutableList!");
        } catch (UnsupportedOperationException e) {
            exceptionThrown=true;
            logger.info("immutableList.add() not supported");
        }
        assertEquals(1, immutableList.size());
        assertTrue(exceptionThrown);

        exceptionThrown = false;
        try {
            immutableList.remove(0);
            fail("add supported for immutableList!");
        } catch (UnsupportedOperationException e) {
            exceptionThrown=true;
            logger.info("immutableList.remove() not supported");
        }
        assertEquals(1, immutableList.size());
        assertTrue(exceptionThrown);

        assertEquals("Testing Word123", immutableList.get(0).append(123).toString());

        logger.info("immutableList НЕ позволяет добавлять и удалять элементы, и не доступно изменение методами внутренней коллекци," +
                " поля входящих объектов можно изменять" );
    }

    @Test
    public void UnmodifiableCollectionTest(){
        List<StringBuilder> modList = new ArrayList<>();
        modList.add(sb);
        List<StringBuilder> unModifiableList = Collections.unmodifiableList(modList);
        modList.add(sb2);

        assertEquals(2, unModifiableList.size());

        boolean exceptionThrown = false;

        try {
            unModifiableList.add(sb2);
            fail("add supported for unModifiableList!");
        } catch (UnsupportedOperationException e) {
            exceptionThrown=true;
            logger.info("unModifiableList.add() not supported");
        }
        assertEquals(2, unModifiableList.size());
        assertTrue(exceptionThrown);

        exceptionThrown = false;
        try {
            unModifiableList.remove(0);
            fail("add supported for unModifiableList!");
        } catch (UnsupportedOperationException e) {
            exceptionThrown=true;
            logger.info("unModifiableList.remove() not supported");
        }
        assertEquals(2, unModifiableList.size());
        assertTrue(exceptionThrown);

        assertEquals("Testing Word123", unModifiableList.get(0).append(123).toString());

        logger.info("unModifiableList НЕ позволяет добавлять и удалять элементы, но доступно изменение методами внутренней коллекции," +
                "а также  поля входящих объектов можно изменять");
    }

}
