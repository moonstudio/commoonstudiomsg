package com.moonstudio.util;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.moonstudio.pojo.Msg;

import java.io.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MsgUtil {


    public static final Map<Long, Msg> MAP = new HashMap<>();

    static {
        MAP.put(1L, new Msg("1", "name1", "rem"));
        MAP.put(2L, new Msg("2L", "name2", "age2"));
        MAP.put(3L, new Msg("3L", "name3", "age3"));
        MAP.put(4L, new Msg("4L", "name4", "age4"));
        MAP.put(5L, new Msg("5L", "name5", "age5"));
        MAP.put(6L, new Msg("6L", "name6", "age6"));
        MAP.put(7L, new Msg("7L", "name7", "age7"));
        MAP.put(8L, new Msg("8L", "name8", "age8"));
    }

    public static Msg getMsgById(Long id) {
        return MAP.get(id);
    }

}
