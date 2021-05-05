package com.hashtable;

public class MyMapNode<K,V> {
    K key;
    V value;
    MyMapNode next;

    public MyMapNode(K key, V value) {
        this.key=key;
        this.value=value;
        this.next = null;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public MyMapNode<K,V> getNext() {
        return next;
    }

    public void setNext(MyMapNode<K,V> next) {
        this.next = next;
    }


}
