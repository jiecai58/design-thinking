package com.ten951.design.visitor;

/**
 * @author Darcy
 * @date 2019-08-21 19:22
 */
public interface IVisitor {

    //首先，定义我可以访问普通员工
    void visit(CommonEmployee commonEmployee);

    //其次，定义我还可以访问部门经理
    void visit(Manager manager);
}
