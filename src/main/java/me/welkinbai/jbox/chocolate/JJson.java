package me.welkinbai.jbox.chocolate;

public interface JJson {

    String toJsonString(Object obj);

    Object fromJsonString(String jsonString);

    <T> T fromJsonString(String jsonString, Class<T> clazz);


}
