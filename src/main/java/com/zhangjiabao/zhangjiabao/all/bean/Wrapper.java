package com.zhangjiabao.zhangjiabao.all.bean;

import java.util.Map;

public class Wrapper {
    public static String ERROR_CODE;
    private Map CODEMAP;

    public Map getCODEMAP() {
        return CODEMAP;
    }

    public void setCODEMAP(Map CODEMAP) {
        this.CODEMAP = CODEMAP;
    }

    public Wrapper(Map CODEMAP) {
        this.CODEMAP = CODEMAP;
    }
    public Wrapper() {

    }

}
