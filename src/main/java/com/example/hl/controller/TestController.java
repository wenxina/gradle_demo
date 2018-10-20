package com.example.hl.controller;

import com.example.hl.json.Data;
import com.example.hl.json.Date;
import com.example.hl.json.JsonBean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@RestController
public class TestController {

    @RequestMapping(value = "test2.do")
    public void test1(HttpServletResponse response) throws IOException {
        System.out.println("test2 is do......");
        response.getWriter().print("hello world!");
    }

    @RequestMapping(value = "test4.do")
    public JsonBean test2(){
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

        return jsonBean;
    }
}
