package com.day08.homew;

import java.util.List;

/**
 * @author wq
 * @since 2022-05-31 12:51
 */

public class ProvinceDemo {
    private String name;
    private List<Province> provinces;

    public ProvinceDemo() {
    }

    public ProvinceDemo(String name, List<Province> provinces) {
        this.name = name;
        this.provinces = provinces;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Province> getProvinces() {
        return provinces;
    }

    public void setProvinces(List<Province> provinces) {
        this.provinces = provinces;
    }

    @Override
    public String toString() {
        return "ProvinceDemo{" +
                "name='" + name + '\'' +
                ", provinces=" + provinces +
                '}';
    }
}
