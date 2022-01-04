package com.ring.util;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

public class XMLUtil {

    /**
     * 该方法用于 XML 配置中提取图表类型，并返回类型名
     *
     * @param packageName:
     * @return String
     * @author the_ring
     * @date 2022/1/4 12:08
     */
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
            return classNode.getNodeValue().trim();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 该方法用于 XML 配置中提取具体类的类名，并返回一个实例对象
     *
     * @param packageName:
     * @return Object
     * @author the_ring
     * @date 2022/1/4 12:08
     */
    public static Object getBean(String packageName) {
        try {
            // 创建 DOM 文档对象
            DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = builderFactory.newDocumentBuilder();
            Document document;
            document = builder.parse("src//com//ring//" + packageName + "//config.xml");

            // 获取包含类名的文本结点
            NodeList nodeList = document.getElementsByTagName("className");
            Node classNode = nodeList.item(0).getFirstChild();
            String cName = classNode.getNodeValue();
            // 通过类名生成实例对象并将其返回
            Class c = Class.forName(cName);
            return c.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 桥接模式
     *
     * @param packageName:
     * @param args:
     * @return Object
     * @author the_ring
     * @date 2022/1/4 12:09
     */
    public static Object getBean(String packageName, String args) {
        try {
            // 创建 DOM 文档对象
            DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = builderFactory.newDocumentBuilder();
            Document document;
            document = builder.parse("src//com//ring//" + packageName + "//config.xml");

            // 获取包含类名的文本结点
            NodeList nodeList = null;
            Node classNode = null;
            String cName = null;
            nodeList = document.getElementsByTagName("className");

            // 获取第一个包含类名的结点，即扩充抽象类
            String a = "image";
            String b = "os";
            if (a.equals(args)) {
                classNode = nodeList.item(0).getFirstChild();
            }
            // 获取第一个包含类名的结点，即具体实现类
            else if (b.equals(args)) {
                classNode = nodeList.item(1).getFirstChild();
            }

            cName = classNode.getNodeValue();
            // 通过类名生成实例对象并将其返回
            Class c = Class.forName(cName);
            return c.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
