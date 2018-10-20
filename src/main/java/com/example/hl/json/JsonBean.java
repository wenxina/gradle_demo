package com.example.hl.json;

import java.util.Arrays;
import java.util.List;

public class JsonBean {
    private String name;
    private String type;
    private Integer[] data;
    private List<Data> markPoint;
    private List<Date> markLine;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer[] getData() {
        return data;
    }

    public void setData(Integer[] data) {
        this.data = data;
    }

    public List<Data> getMarkPoint() {
        return markPoint;
    }

    public void setMarkPoint(List<Data> markPoint) {
        this.markPoint = markPoint;
    }

    public List<Date> getMarkLine() {
        return markLine;
    }

    public void setMarkLine(List<Date> markLine) {
        this.markLine = markLine;
    }

    @Override
    public String toString() {
        return "JsonBean{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", data=" + Arrays.toString(data) +
                ", markPoint=" + markPoint +
                ", markLine=" + markLine +
                '}';
    }
}
