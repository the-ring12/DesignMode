package com.the_ring.factorymethod;

public class DatabaseLoggerFactory implements LoggerFactory {
    @Override
    public Logger createLogger() {
        // 连接数据库
        // 创建数据库日志记录器对象
        Logger logger = new DatabaseLogger();
        // 初始化数据库日志记录器
        return logger;
    }
}
