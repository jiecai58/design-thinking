package com.ten951.design.proxy;

/**
 * 普通代理模式
 * 调用者只知代理而不用知道真实的角色是谁，屏蔽了真实角色的变更对高层模块的影响，真实的主题角色想怎么修改就怎么修改，对高层次的模块没有任何的影响，只要你实现了接口所对应的方法，该模式非常适合对扩展性要求较高的场合。当然，在实际的项目中，一般都是通过约定来禁止new一个真实的角色，这也是一个非常好的方案
 * @author Darcy
 * @date 2019-08-19 16:13
 */
public class GamePlayerProxy implements IGamePlayer {

    private IGamePlayer gamePlayer = null;

    public GamePlayerProxy(String name) {
        gamePlayer = new GamePlayer(this, name);
    }

    public GamePlayerProxy(IGamePlayer gamePlayer) {
        this.gamePlayer = gamePlayer;
    }

    //代练杀怪
    @Override
    public void killBoss() {
        this.gamePlayer.killBoss();
    }
    //代练登录
    @Override
    public void login(String user, String password) {
        this.gamePlayer.login(user, password);
    }
    //代练升级
    @Override
    public void upgrade() {
        this.gamePlayer.upgrade();
    }
}
