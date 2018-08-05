package me.welkinbai.jbox.chocolate;

import com.alibaba.fastjson.JSON;

class JBoxJson implements JJson, Chocolate {
    public String toJsonString(Object obj) {
        return JSON.toJSONString(obj);
    }

    public Object fromJsonString(String jsonString) {
        return JSON.parse(jsonString);
    }

    public <T> T fromJsonString(String jsonString, Class<T> clazz) {
        return JSON.parseObject(jsonString, clazz);
    }
}
