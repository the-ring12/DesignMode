package com.the_ring.util;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

public class XMLUtil {

    // 该方法用于 XML 配置中提取图表类型，并返回类型名
    public static String getChartType(String packageName) {
        try {
            // 创建 DOM 文档对象
            DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = builderFactory.newDocumentBuilder();
            Document document;
            document = builder.parse("src//com//the_ring//" + packageName + "//config.xml");

            // 获取包含类名的文本结点
            NodeList nodeList = document.getElementsByTagName("chartType");
            Node classNode = nodeList.item(0).getFirstChild();
            String chartType = classNode.getNodeValue().trim();
            return chartType;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    // 该方法用于 XML 配置中提取具体类的类名，并返回一个实例对象
    public static Object getBean(String packageName) {
        try {
            // 创建 DOM 文档对象
            DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = builderFactory.newDocumentBuilder();
            Document document;
            document = builder.parse("src//com//the_ring//" + packageName + "//config.xml");

            // 获取包含类名的文本结点
            NodeList nodeList = document.getElementsByTagName("className");
            Node classNode = nodeList.item(0).getFirstChild();
            String cName = classNode.getNodeName();

            // 通过类名生成实例对象并将其返回
            Class c = Class.forName(cName);
            Object obj = c.newInstance();
            return obj;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
