package com.hashtable;

import java.util.ArrayList;

public class HashTable<K,V> {

    private final int num_of_buckets;
    ArrayList<MyLinkedList> hash_array;

    public HashTable() {
        this.num_of_buckets = 10;
        this.hash_array = new ArrayList<>(num_of_buckets);

        for (int i = 0; i < 10; i++)
        {
            hash_array.add(null);
        }
    }

    public V get(K key) {
        int index = this.getBucketIndex(key);
        MyLinkedList ll = this.hash_array.get(index);
        if (ll == null)
            return null;
        MyMapNode<K, V> mapNode = (MyMapNode<K, V>) ll.search(key);
        return (mapNode == null) ? null : mapNode.getValue();
    }

    private int getBucketIndex(K key) {
        int hashCode = Math.abs(key.hashCode());
        int index = hashCode % num_of_buckets;
        return index;
    }


    public void add(K key, V value) {
        int index = this.getBucketIndex(key);
        MyLinkedList ll = this.hash_array.get(index);
        if (ll == null)
        {
            ll = new MyLinkedList();
            this.hash_array.set(index, ll);
        }

        MyMapNode<K, V> mapNode = (MyMapNode<K, V>) ll.search(key);
        if (mapNode == null)
        {
            mapNode = new MyMapNode<>(key, value);
            ll.append(mapNode);
        }
        else
            mapNode.setValue(value);

    }


}