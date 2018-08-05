package me.welkinbai.jbox;

import me.welkinbai.jbox.chocolate.ChocolatePicker;
import me.welkinbai.jbox.chocolate.JJson;
import me.welkinbai.jbox.chocolate.JString;

public interface JBox {

    JString String = (JString) ChocolatePicker.getChocolate("String");

    JJson Json = (JJson) ChocolatePicker.getChocolate("Json");
}
