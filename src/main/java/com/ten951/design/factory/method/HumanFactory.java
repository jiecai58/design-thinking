package com.ten951.design.factory.method;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author Darcy
 * @date 2019-08-19 09:40
 */
public class HumanFactory extends AbstractHumanFactory {
    private static final Map<HumanType, Human> HUMAN = new ConcurrentHashMap<>();

    @Override
    public Human createHuman(HumanType type) {
        if (HumanType.black.equals(type)) {
            return new BlackHuman();
        } else if (HumanType.white.equals(type)) {
            return new WhiteHuman();
        } else if (HumanType.yellow.equals(type)) {
            return new YellowHuman();
        } else {
            throw new IllegalArgumentException("未知肤色");
        }
    }

    /**
     * 延时初始化的工厂方法
     *
     * @param type 枚举
     * @return 人类
     */
    public synchronized Human createHumanDelay(HumanType type) {
        if (HUMAN.containsKey(type)) {
            return HUMAN.get(type);
        }
        Human human = this.createHuman(type);
        HUMAN.put(type, human);
        return human;
    }

}
