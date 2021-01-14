package com.andersen.structures.linkedList;

public class LinkList {

    private Node headNode;

    static class Node{
        private int value;
        private Node nextNode;

        public Node(Integer value) {
            this.value = value;
        }
    }

    /**
     * adds a node to the tail of the linked list
     * @param value = data to add
     */
    public void add(int value){
        if(headNode == null){
            headNode = new Node(value);
            return;
        }
        Node node = headNode;
        while (node.nextNode != null){
            node = node.nextNode;
        }
        node.nextNode = new Node(value);
    }

    /**
     * getting the value in order from the beginning
     * @param nodeNumber = ordinal number of the element
     * @return = element
     */
    public int get(int nodeNumber){
        Node node = headNode;
        while(nodeNumber > 0){
            if(node == null){
                throw new IllegalArgumentException();
            }
            node = node.nextNode;
            nodeNumber--;
        }
        return node.value;
    }

    /**
     * search node from the end of the list
     * @param nodeNumber = ordinal number of the element from the end
     * @return = element
     */
    public int getNodeFromEnd(int nodeNumber){
        Node firstNode = headNode;
        Node secondNode = headNode;
        int i = 0;

        while (firstNode != null){
            firstNode = firstNode.nextNode;
            i++;
            if(i > nodeNumber){
                secondNode = secondNode.nextNode;
            }
        }
        return secondNode.value;
    }
}
