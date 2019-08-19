package com.ten951.design.clone;

import java.util.ArrayList;

/**
 * @author Darcy
 * @date 2019-08-19 19:10
 */
public class Thing implements Cloneable {
    public Thing() {
    }

    private ArrayList<String> arrayList = new ArrayList<>();

    private String name;
    private Integer integer;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getInteger() {
        return integer;
    }

    public void setInteger(Integer integer) {
        this.integer = integer;
    }

    //设置HashMap的值
    public void setValue(String value) {
        this.arrayList.add(value);
    }

    //取得arrayList的值
    public ArrayList getValue() {
        return this.arrayList;
    }

    @Override
    protected Thing clone() {
        try {
            return (Thing) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    protected Thing deepenClone() {
        Thing clone = this.clone();
        clone.arrayList = (ArrayList<String>) this.arrayList.clone();
        return clone;
    }
}
