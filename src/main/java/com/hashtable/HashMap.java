package com.hashtable;

public class HashMap<K,V> {

    MyLinkedList<K,V> ll;

    public HashMap(){
        ll =new MyLinkedList();
    }

    public V get(K key) {
        MyMapNode<K,V> mapNode = (MyMapNode<K, V>) ll.search(key);
        return (mapNode == null) ? null : mapNode.getValue();
    }

    public void add(K key, V value) {
        MyMapNode<K,V> mapNode = (MyMapNode<K, V>) ll.search(key);
        if(mapNode==null)
        {
            mapNode = new MyMapNode<>(key,value);
            ll.append(mapNode);
        }
        else
            mapNode.setValue(value);
    }


}