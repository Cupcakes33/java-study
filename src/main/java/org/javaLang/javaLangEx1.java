package org.javaLang;

import java.util.Objects;

public class javaLangEx1 {
    public static void main(String[] args) {
      Value a = new Value();
      Value b = new Value();

      a.setValue(1);
      b.setValue(1);

        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
        System.out.println(a.equals(b));
    }

}

class Value {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private int value;



    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (o == null || getClass() != o.getClass()) return false;
//        Value a = (Value) o;
//        return id == a.id;
//    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}