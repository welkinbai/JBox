package me.welkinbai.jbox;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class JBoxTest {

    @Test
    public void testJBox() throws Exception {
        System.out.println(JBox.String.join("a", "b"));
        List<String> list = new ArrayList<String>();
        list.add("a");
        list.add("b");
        String json = JBox.Json.toJsonString(list);
        System.out.println(json);
        System.out.println(JBox.Json.fromJsonString(json));
        String test = "test";
        System.out.println(JBox.Json.fromJsonString(JBox.Json.toJsonString(test), String.class));

    }

}