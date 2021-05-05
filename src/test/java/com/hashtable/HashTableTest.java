package com.hashtable;

import org.junit.Assert;
import org.junit.Test;

public class HashTableTest {


    @Test
    public void stringParsed_ReturnsFrequency(){
        String string="To be or not to be";
        HashMap<String,Integer> hashMap = new HashMap<>();
        String[] words=string.toLowerCase().split(" ");
        for(String s:words)
        {
            Integer value = hashMap.get(s);
            if(value==null)
                value=1;
            else
                value++;
            hashMap.add(s,value);
        }
        int frequency = hashMap.get("be");
        Assert.assertEquals(2,frequency);
    }
    @Test
    public void given_a_String_whenPasses_returnsFreq() {
        String string="Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations";
        HashTable<String,Integer> hashtable=new HashTable<>();
        String[] words=string.toLowerCase().split(" ");
        for(String s:words)
        {
            Integer value = hashtable.get(s);
            if(value==null)
                value=1;
            else
                value++;
            hashtable.add(s,value);
        }
        int frequency = hashtable.get("paranoid");
        Assert.assertEquals(3,frequency);
    }
    @Test
    public void stringPassed_returnsWordFrequency() {
        String str="Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations";
        HashTable<String,Integer> hashtable=new HashTable<>();
        String[] words=str.toLowerCase().split(" ");
        for(String s:words)
        {
            Integer value = hashtable.get(s);
            if(value==null)
                value=1;
            else
                value++;
            hashtable.add(s,value);
        }
        hashtable.remove("avoidable");
        Integer frequency = hashtable.get("avoidable");
        Assert.assertEquals(null,frequency);
    }



}
