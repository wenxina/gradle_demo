package com.example.hl.json;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        Integer[] integer = {11,11,15,13,12,13,10};

        JsonBean jsonBean = new JsonBean();
        Data data = new Data();
        Date date = new Date();
        data.setType("mix");
        data.setName("最大值");
        List<Data> list1 = new ArrayList();
        list1.add(data);

        date.setType("average");
        date.setName("平均值");
        List<Date> list2 = new ArrayList();
        list2.add(date);

        jsonBean.setName("最高气温");
        jsonBean.setType("line");
        jsonBean.setData(integer);
        jsonBean.setMarkPoint(list1);
        jsonBean.setMarkLine(list2);

        System.out.println(jsonBean);
    }
}
