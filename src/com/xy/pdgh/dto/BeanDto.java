package com.xy.pdgh.dto;

public class BeanDto extends Been{

    private String ww;

    public void setWw(String ww) {
        this.ww = ww;
    }

    @Override
    public String toString() {
        return "Been{" +
                "hb='" + hb + '\'' +
                ", lx='" + lx + '\'' +
                ", dydj='" + dydj + '\'' +
                ", nx='" + nx + '\'' +
                ", bdzbsl='" + bdzbsl + '\'' +
                ", bddlq='" + bddlq + '\'' +
                ", xljkcd='" + xljkcd + '\'' +
                ", xldlcd='" + xldlcd + '\'' +
                ",ww='"+ww+'\''+
                '}';
    }

    public String getWw() {

        return ww;
    }
}
