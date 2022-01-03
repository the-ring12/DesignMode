# com.ring.util
工具类，用于从 XML 配置文件中解析出需要用到的实例

1. public static String getChartType(String packageName)
该方法用于 XML 配置中提取图表类型，并返回类型名

2. public static Object getBean(String packageName) 
该方法用于 XML 配置中提取具体类的类名，并返回一个实例对象