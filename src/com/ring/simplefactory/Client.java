package com.ring.simplefactory;

import com.ring.util.XMLUtil;

public class Client {
    public static void main(String[] args) {
        Chart chart;
//        chart = ChartFactory.getChart("histogram"); // 通过静态工厂方法创建产品
        String type = XMLUtil.getChartType("simplefactory");
        chart = ChartFactory.getChart(type);
        chart.display();
    }
}
