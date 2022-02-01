package com.khancompany.app.builder;

import java.util.Objects;

public class Field<E> {

    private String id;
    private String name;
    private E type;
    private String values;


    public Field() {
    }

    public Field(String id, String name, E type, String values) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.values = values;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public E getType() {
        return this.type;
    }

    public void setType(E type) {
        this.type = type;
    }

    public String getValues() {
        return this.values;
    }

    public void setValues(String values) {
        this.values = values;
    }

    public Field id(String id) {
        setId(id);
        return this;
    }

    public Field name(String name) {
        setName(name);
        return this;
    }

    public Field type(E type) {
        setType(type);
        return this;
    }

    public Field values(String values) {
        setValues(values);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Field)) {
            return false;
        }
        Field field = (Field) o;
        return Objects.equals(id, field.id) && Objects.equals(name, field.name) && Objects.equals(type, field.type) && Objects.equals(values, field.values);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, type, values);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", name='" + getName() + "'" +
            ", type='" + getType() + "'" +
            ", values='" + getValues() + "'" +
            "}";
    }

}
