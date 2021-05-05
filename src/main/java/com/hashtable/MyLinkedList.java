package com.hashtable;

public class MyLinkedList<K,V> {
    private MyMapNode head = null;
    private MyMapNode tail = null;

    public void append(MyMapNode last) {

        MyMapNode node = head;
        tail = last;
        if (head == null)
        {
            head = last;
        }
        else
        {
            while (node.getNext() != null)
            {
                node = node.getNext();
            }
            node.setNext(last);
        }
    }

    public MyMapNode<K,V> search(K key) {
        MyMapNode temp = head;
        while (temp != null)
        {
            if (temp.getKey().equals(key))
            {
                return temp;
            }
            temp = temp.getNext();
        }
        return null;
    }

    public void printLinkedList() {
        MyMapNode node = head;
        while (node != null) {
            System.out.print(node);
            if (node != tail)
            {
                System.out.print(" -> ");
            }
            node = node.getNext();
        }
    }

    public void delete(K key) {
        MyMapNode temp = head;
        while (temp != null) {
            if(head.getKey().equals(key))
            {
                if(head.getNext()==null)
                {
                    head=null;
                    tail=null;
                    break;
                }
                else
                {
                    head=head.getNext();
                    break;
                }
            }
            if (temp.getNext().getKey().equals(key))
            {
                temp.setNext(temp.getNext().getNext());
            }
            tail = temp;
            temp = temp.getNext();
        }
    }

}