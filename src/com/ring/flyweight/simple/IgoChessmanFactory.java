package com.ring.flyweight.simple;

import java.util.Hashtable;

/**
 * 围棋棋子工厂类
 *
 * @author: the_ring
 * @time: 2022/1/4 15:46
 */
public class IgoChessmanFactory {
    private static final IgoChessmanFactory instance = new IgoChessmanFactory();
    /**
     * 存储享元对象，充当享元池
     */
    private static Hashtable ht;

    public IgoChessmanFactory() {
        ht = new Hashtable();
        BaseIgoChessman black, white;
        black = new BlackIgoChessman();
        white = new WhiteIgoChessman();
        ht.put("b", black);
        ht.put("w", white);
    }

    /**
     * 返回享元工厂类的唯一实例
     *
     * @return
     */
    public static IgoChessmanFactory getInstance() {
        return instance;
    }

    /**
     * 通过 key 获取存储在 HashTable 中的享元对象
     *
     * @param color
     * @return
     */
    public BaseIgoChessman getIgoChessman(String color) {
        return (BaseIgoChessman) ht.get(color);
    }
}
