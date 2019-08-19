package com.ten951.design.proxy;

/**
 * @author Darcy
 * @date 2019-08-19 15:14
 */
public interface IGamePlayer {
    //登录游戏
    void login(String user, String password);

    //杀怪，网络游戏的主要特色
    void killBoss();

    //升级
    void upgrade();

}
