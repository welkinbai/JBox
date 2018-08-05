package me.welkinbai.jbox.chocolate;

import java.util.HashMap;
import java.util.Map;

public class ChocolatePicker {

    private final static Map<String, Chocolate> chocolateMap = new HashMap<String, Chocolate>();

    static {
        chocolateMap.put("String", new JBoxString());
        chocolateMap.put("Json", new JBoxJson());
    }

    public static Chocolate getChocolate(String name) {
        return chocolateMap.get(name);
    }
}
