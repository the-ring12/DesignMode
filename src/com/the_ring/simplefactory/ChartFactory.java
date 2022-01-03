package com.the_ring.simplefactory;

public class ChartFactory {
    // 静态工厂方法
    public static Chart getChart(String type) {
        Chart chart = null;
        if (type.equals("histogram")) {
            chart = new HistogramChart();
            System.out.println("初始化设置柱状图！");
        } else if (type.equals("pie")) {
            chart = new PieChart();
            System.out.println("初始化饼状图！");
        } else if (type.equals("line")) {
            chart = new LineChart();
            System.out.println("初始化折线图！");
        }
        return chart;
    }
}
