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


}
