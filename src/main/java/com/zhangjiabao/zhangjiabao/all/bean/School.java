package com.zhangjiabao.zhangjiabao.all.bean;

import java.util.Objects;

public class School {

    private Integer id;
    private String name;
    private String place;
    private String type;
    private String properties;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getProperties() {
        return properties;
    }

    public void setProperties(String properties) {
        this.properties = properties;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        School school = (School) o;
        return Objects.equals(id, school.id) &&
                Objects.equals(name, school.name) &&
                Objects.equals(place, school.place) &&
                Objects.equals(type, school.type) &&
                Objects.equals(properties, school.properties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, place, type, properties);
    }

    @Override
    public String toString() {
        return "School{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", place='" + place + '\'' +
                ", type='" + type + '\'' +
                ", properties='" + properties + '\'' +
                '}';
    }
}
