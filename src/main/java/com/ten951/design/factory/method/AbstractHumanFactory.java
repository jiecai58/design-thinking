package com.ten951.design.factory.method;

/**
 * @author Darcy
 * @date 2019-08-19 09:38
 */
public abstract class AbstractHumanFactory {

    /**
     * 构建人类实体
     * 参数可以是enum class string
     * @param type 枚举
     * @return 人类
     */
    abstract Human createHuman(HumanType type);
}
