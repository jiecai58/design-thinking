package com.ten951.design.proxy;

/**
 * 访问真实的角色. 必须通过真实角色指定的代理对象. 否则不能访问
 * <p>
 * 强制代理在设计模式中比较另类，为什么这么说呢？一般的思维都是通过代理找到真实的角色，但是强制代理却是要“强制”，你必须通过真实角色查找到代理角色，否则你不能访问。甭管你是通过代理类还是通过直接new一个主题角色类，都不能访问，
 * 只有通过真实角色指定的代理类才可以访问，也就是说由真实角色管理代理角色。这么说吧，高层模块new了一个真实角色的对象，返回的却是代理角色，
 * 这就好比是你和一个明星比较熟，相互认识，有件事情你需要向她确认一下，于是你就直接拨通了明星的电话：
 * <p>
 * “喂，沙比呀，我要见一下×××导演，你帮下忙了！”
 * <p>
 * “不行呀衰哥，我这几天很忙呀，你找我的经纪人吧……”
 * <p>
 * 郁闷了吧，你是想直接绕过她的代理，谁知道返回的还是她的代理，这就是强制代理，你可以不用知道代理存在，但是你的所作所为还是需要代理为你提供。我们
 *
 * @author Darcy
 * @date 2019-08-19 16:20
 */
public class ForceGamePlayer implements IGamePlayer {
    private String name = null;

    private IGamePlayer proxy = null;

    public ForceGamePlayer(String name) {
        this.name = name;
    }


    public IGamePlayer getProxy() {
        return proxy = new GamePlayerProxy(this);
    }

    //打怪，最期望的就是杀老怪
    @Override
    public void killBoss() {
        if (this.isProxy()) {
            System.out.println(this.name + "在打怪！");
        } else {
            System.out.println("请使用指定的代理访问");
        }
    }

    //进游戏之前你肯定要登录吧，这是一个必要条件
    @Override
    public void login(String user, String password) {
        if (this.isProxy()) {
            System.out.println("登录名为" + user + "的用户" + this.name + "登录成功！");
        } else {
            System.out.println("请使用指定的代理访问");
            ;
        }
    }

    //升级，升级有很多方法，花钱买是一种，做任务也是一种
    @Override
    public void upgrade() {
        if (this.isProxy()) {
            System.out.println(this.name + " 又升了一级！");
        } else {
            System.out.println("请使用指定的代理访问");
        }
    }

    //校验是否是代理访问
    private boolean isProxy() {
        return this.proxy != null;
    }
}
