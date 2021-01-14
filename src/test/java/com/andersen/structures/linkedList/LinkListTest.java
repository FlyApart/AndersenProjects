package com.andersen.structures.linkedList;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LinkListTest {

    private LinkList linkList;

    @Before
    public void init(){
        linkList = new LinkList();
        linkList.add(1);
        linkList.add(22);
        linkList.add(33);
        linkList.add(44);
        linkList.add(55);
    }

    @Test
    public void get() {
        assertEquals(1, linkList.get(0));
        assertEquals(55,linkList.get(4));
    }

    @Test(expected = IllegalArgumentException.class)
    public void getMoreTotalItems() {
        linkList.get(7);
    }


    @Test
    public void getNodeFromEnd() {
        assertEquals(44, linkList.getNodeFromEnd(2));
    }
}