package com.zhangjiabao.zhangjiabao.all.bean;

import java.util.HashMap;
import java.util.Map;

public class WrapMapper {

   public static Wrapper  wrap(String str,String message) {

       Map<String, String> map = new HashMap<String, String>();
       map.put("meg",message);
       return  new Wrapper(map);
   }
    public static Wrapper  ok() {
        Map<String, String> map = new HashMap<String, String>();
        map.put("meg","验证通过");
        return  new Wrapper(map);
    }
}
