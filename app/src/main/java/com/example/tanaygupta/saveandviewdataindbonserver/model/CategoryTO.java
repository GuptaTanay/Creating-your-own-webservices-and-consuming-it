package com.example.tanaygupta.saveandviewdataindbonserver.model;

public class CategoryTO {
    private  String name;
    private String class_name;

    public CategoryTO(String name, String class_name) {
        this.name = name;
        this.class_name = class_name;
    }

    public CategoryTO()
    {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClass_name() {
        return class_name;
    }

    public void setClass_name(String class_name) {
        this.class_name = class_name;
    }
}
