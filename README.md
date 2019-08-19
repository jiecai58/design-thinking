# design-thinking 

## 总纲

### 单一职责原则

应该有且仅有一个原因引起类的变更. 
最佳实践: 接口一定要做到单一职责，类的设计尽量做到只有一个原因引起变化。

### 里氏替换原则

标准定义

1. 如果对每一个类型为S的对象o1，都有类型为T的对象o2，使得以T定义的所有程序P在所有的对象o1都代换成o2时，程序P的行为没有发生变化，那么类型S是类型T的子类型。
2. 所有引用基类的地方必须能透明地使用其子类的对象。

4条含义
1. 子类必须完全实现父类的方法
2. 子类可以有自己的个性, 但尽量要控制
3. 覆盖或实现父类的方法时输入参数可以被放大
4. 覆写或实现父类的方法时输出结果可以被缩小

### 依赖倒置原则
在真实的自然界中我们都是直接依赖各种真实的实现的. 而在程序世界. 我们要依赖接口或者抽象类. 从实现到抽象或者接口的转变叫依赖倒置

* 高层模块不依赖底层模块. 两者都应该依赖其抽象.
* 抽象不应该依赖细节
* 细节应该依赖其抽象.

依赖倒置原则. 翻译成java语言版本:

* 模块间的依赖通过抽象发生，实现类之间不发生直接的依赖关系，其依赖关系是通过接口或抽象类产生的；
* 接口或抽象类不依赖于实现类；
* 实现类依赖接口或抽象类。

依赖的三种写法: 只要用到抽象依赖. 即使是多层的传递依赖也无所谓
1. 构造函数依赖
2. set方法依赖
3. 接口声明的时候产生依赖

最佳实践:
1. 每个类尽量都有接口或抽象类，或者抽象类和接口两者都具备
2. 变量的表面类型尽量是接口或者是抽象类
3. 任何类都不应该从具体类派生
4. 尽量不要覆写基类的方法 如果基类是抽象类, 尽量不要去重写基类已经实现的方法, 抽象方法是可以的.
5. 结合里氏替换原则使用

### 接口隔离原则

1. Clients should not be forced to depend upon interfaces that they don't use.（客户端不应该依赖它不需要的接口。）
2. The dependency of one class to another one should depend on the smallest possible interface.（类间的依赖关系应该建立在最小的接口上。）

这里的接口即指类. 也指接口

通俗点说的意思就是 接口要功能要细化. 客户端在用接口的时候, 只提供它需要的接口即可.

单一职责要求的是类和接口职责单一，注重的是职责，这是业务逻辑上的划分，而接口隔离原则要求接口的方法尽量少。
例如一个接口的职责可能包含10个方法，这10个方法都放在一个接口中，并且提供给多个模块访问，各个模块按照规定的权限来访问，在系统外通过文档约束“不使用的方法不要访问”，按照单一职责原则是允许的，
按照接口隔离原则是不允许的，因为它要求“尽量使用多个专门的接口”。
专门的接口指什么？就是指提供给每个模块的都应该是单一接口，提供给几个模块就应该有几个接口，而不是建立一个庞大的臃肿的接口，容纳所有的客户端访问

保持接口的纯净性:
1. 接口要尽量的小, 但是小也是有限度的, 不能违反接口单一原则.
2. 接口要高内聚
什么是高内聚？高内聚就是提高接口、类、模块的处理能力，减少对外的交互。 接口是对外的承诺，承诺越少对系统的开发越有利，变更的风险也就越少，同时也有利于降低成本。
3. 定制服务
一个系统或系统内的模块之间必然会有耦合，有耦合就要有相互访问的接口（并不一定就是Java中定义的Interface，也可能是一个类或单纯的数据交换），我们设计时就需要为各个访问者（即客户端）定制服务，什么是定制服务？定制服务就是单独为一个个体提供优良的服务。
4. 接口设计是有限度的
这个度需要权衡

最佳实践:
* 一个接口只服务于一个子模块或业务逻辑；

* 通过业务逻辑压缩接口中的public方法，接口时常去回顾，尽量让接口达到“满身筋骨肉”，而不是“肥嘟嘟”的一大堆方法；

* 已经被污染了的接口，尽量去修改，若变更的风险较大，则采用适配器模式进行转化处理；

* 了解环境，拒绝盲从。每个项目或产品都有特定的环境因素，别看到大师是这样做的你就照抄。千万别，环境不同，接口拆分的标准就不同。深入了解业务逻辑，最好的接口设计就出自你的手中！

### 迪米特法则
迪米特法则（Law of Demeter，LoD）也称为最少知识原则（Least Knowledge Principle，LKP）
也叫最少知识原则. 即虽然名字不同，但描述的是同一个规则：一个对象应该对其他对象有最少的了解。通俗地讲，一个类应该对自己需要耦合或调用的类知道得最少，你（被耦合或调用的类）的内部是如何复杂都和我没关系，那是你的事情，我就知道你提供的这么多public方法，我就调用这么多，其他的我一概不关心。

### 开闭原则(总纲中的总纲)
Software entities like classes,modules and functions should be open for extension but closed for modifications.（一个软件实体如类、模块和函数应该对扩展开放，对修改关闭。）

软件实体应该对扩展开放，对修改关闭，其含义是说一个软件实体应该通过扩展来实现变化，而不是通过修改已有的代码来实现变化。那什么又是软件实体呢？软件实体包括以下几个部分：

* 项目或软件产品中按照一定的逻辑规则划分的模块。
* 抽象和类。
* 方法。

在实际需求编码中我们经常遇到三种情况:
1. 修改接口. 即直接修改原有的代码 这样做带来的后果是. 所有的实现类都要修改一遍.
2. 修改实现类. 即修改特定实现类的特定实现方法, 当然这是一个很好的方案, 但是要考虑情况这个接口对业务系统的影响面有多大, 比如计算价格的方法. 你接到需求针对一些商品进行打折处理, 你定位到了特定的实现类及其特定的实现方法, 准备大干一番.
可是修改完上了测试, 发现用户端确实价格是折后了, 可是公司内部采购人员或者数据人员看到的也是折后的. 这会导致很多问题.
3. 通过扩展实现变化. 采用这种方法就需要修改高层依赖关系. 替换为新的拓展类. 完成业务变化对系统的最小化开发。好办法，修改也少，风险也小.

可以将变化总结为三种:
1. 逻辑变化, 比如算法从ab+c 变成ab*c.可以通过修改原有类中的方法的方式来完成，前提条件是所有依赖或关联类都按照相同的逻辑处理。
2. 子模块变化. 一个模块变化，会对其他的模块产生影响. 特别是一个低层次的模块变化必然引起高层模块的变化，因此在通过扩展完成变化时，高层次的模块修改是必然的
3. 可见视图变化

可见视图是提供给客户使用的界面，如JSP程序、Swing界面等，该部分的变化一般会引起连锁反应（特别是在国内做项目，做欧美的外包项目一般不会影响太大）。如果仅仅是界面上按钮、文字的重新排布倒是简单，最司空见惯的是业务耦合变化，什么意思呢？一个展示数据的列表，按照原有的需求是6列，突然有一天要增加1列，而且这一列要跨N张表，处理M个逻辑才能展现出来，这样的变化是比较恐怖的，但还是可以通过扩展来完成变化，这就要看我们原有的设计是否灵活。

为什么要采用开闭原则?
1. 开闭原则对测试的影响, 可以减少测试的工作范围.
2. 开闭原则可以提高复用性 在面向对象的设计中，所有的逻辑都是从原子逻辑组合而来的，而不是在一个类中独立实现一个业务逻辑。只有这样代码才可以复用，粒度越小，被复用的可能性就越大。那为什么要复用呢？减少代码量，避免相同的逻辑分散在多个角落，避免日后的维护人员为了修改一个微小的缺陷或增加新功能而要在整个项目中到处查找相关的代码，然后发出对开发人员“极度失望”的感慨。那怎么才能提高复用率呢？缩小逻辑粒度，直到一个逻辑不可再拆分为止。
3. 开闭原则可以提高可维护性 一款软件投产后，维护人员的工作不仅仅是对数据进行维护，还可能要对程序进行扩展，维护人员最乐意做的事情就是扩展一个类，而不是修改一个类，甭管原有的代码写得多么优秀还是多么糟糕，让维护人员读懂原有的代码，然后再修改，是一件很痛苦的事情，不要让他在原有的代码海洋里游弋完毕后再修改，那是对维护人员的一种折磨和摧残。
4. 面向对象开发的要求 万物皆对象，我们需要把所有的事物都抽象成对象，然后针对对象进行操作，但是万物皆运动，有运动就有变化，有变化就要有策略去应对，怎么快速应对呢？这就需要在设计之初考虑到所有可能变化的因素，然后留下接口，等待“可能”转变为“现实”。
   
#### 如何使用开闭原则
     
开闭原则是一个非常虚的原则，前面5个原则是对开闭原则的具体解释，但是开闭原则并不局限于这么多，它“虚”得没有边界，就像“好好学习，天天向上”的口号一样，告诉我们要好好学习，但是学什么，怎么学并没有告诉我们，需要去体会和掌握，开闭原则也是一个口号，那我们怎么把这个口号应用到实际工作中呢？

1. 抽象约束
抽象是对一组事物的通用描述，没有具体的实现，也就表示它可以有非常多的可能性，可以跟随需求的变化而变化。因此，通过接口或抽象类可以约束一组可能变化的行为，并且能够实现对扩展开放，其包含三层含义：

第一，通过接口或抽象类约束扩展，对扩展进行边界限定，不允许出现在接口或抽象类中不存在的public方法；

第二，参数类型、引用对象尽量使用接口或者抽象类，而不是实现类；

第三，抽象层尽量保持稳定，一旦确定即不允许修改。还是以书店为例，目前只是销售小说类书籍，单一经营毕竟是有风险的，于是书店新增加了计算机书籍，它不仅包含书籍名称、作者、价格等信息，还有一个独特的属性：面向的是什么领域，也就是它的范围，比如是和编程语言相关的，还是和数据库相关的.



```java
public interface IComputerBook extends IBook{      
     //计算机书籍是有一个范围
     String getScope();
}
```
很简单，计算机书籍增加了一个方法，就是获得该书籍的范围，同时继承IBook接口，毕竟计算机书籍也是书籍.

```java
public class ComputerBook implements IComputerBook {
             private String name;
             private String scope;
             private String author;
             private int price; 
             public ComputerBook(String _name,int _price,String _author,String _scope){
                     this.name=_name;
                     this.price = _price;
             this.author = _author;
             this.scope = _scope;
     }
     public String getScope() {
             return this.scope;
     }
     public String getAuthor() {
             return this.author;
     }
     public String getName() {
             return this.name;
     }
     public int getPrice() {
             return this.price;
     }
}
```

这也很简单，实现IComputerBook就可以，而BookStore类没有做任何的修改，只是在static静态模块中增加一条数据.
```java

public class BookStore {
     private final static ArrayList bookList = new ArrayList();
     //static静态模块初始化数据，实际项目中一般是由持久层完成
     static {
             bookList.add(new NovelBook("天龙八部",3200,"金庸"));
             bookList.add(new NovelBook("巴黎圣母院",5600,"雨果"));
             bookList.add(new NovelBook("悲惨世界",3500,"雨果"));
             bookList.add(new NovelBook("金瓶梅",4300,"兰陵笑笑生"));
             //增加计算机书籍
             bookList.add(new ComputerBook("Think in Java",4300,"Bruce Eckel","编程语言"));
     }  
     //模拟书店卖书
     public static void main(String[] args) {
             NumberFormat formatter = NumberFormat.getCurrencyInstance();
             formatter.setMaximumFractionDigits(2);
             System.out.println("-----------书店卖出去的书籍记录如下：-----------");
             for(IBook book:bookList){
                       System.out.println("书籍名称：" + book.getName()+"\t书籍作者：" + book.getAuthor()+ "\t书籍价格：" + formatter.format (book.getPrice()/100.0)+"元");
             }
     }
}
```
书店开始销售计算机书籍，运行结果如下所示。

--------------------书店卖出去的书籍记录如下：---------------------

书籍名称：天龙八部　　　　书籍作者：金庸　　　　　书籍价格：￥32.00元

书籍名称：巴黎圣母院　　　书籍作者：雨果　　　　　书籍价格：￥56.00元

书籍名称：悲惨世界　　　　书籍作者：雨果　　　　　书籍价格：￥35.00元

书籍名称：金瓶梅　　　　　书籍作者：兰陵笑笑生　　书籍价格：￥43.00元

书籍名称：Think in Java　　　书籍作者：Bruce Eckel　　　书籍价格：￥43.00元

如果我是负责维护的，我就非常乐意做这样的事情，简单而且不需要与其他的业务进行耦合。我唯一需要做的事情就是在原有的代码上添砖加瓦，然后就可以实现业务的变化。我们来看看这段代码有哪几层含义。

首先，ComputerBook类必须实现IBook的三个方法，是通过IComputerBook接口传递进来的约束，也就是我们制定的IBook接口对扩展类ComputerBook产生了约束力，正是由于该约束力，BookStore类才不需要进行大量的修改。

其次，如果原有的程序设计采用的不是接口，而是实现类，那会出现什么问题呢？我们把 BookStore类中的私有变量bookList修改一下，如下面的代码所示。
```java

private final static ArrayList<IBook> bookList = new ArrayList();
```
把原有IBook的依赖修改为对NovelBook实现类的依赖，想想看，我们这次的扩展是否还能继续下去呢？一旦这样设计，我们就根本没有办法扩展，需要修改原有的业务逻辑（也就是main方法），这样的扩展基本上就是形同虚设。

最后，如果我们在IBook上增加一个方法getScope，是否可以呢？答案是不可以，因为原有的实现类NovelBook已经在投产运行中，它不需要该方法，而且接口是与其他模块交流的契约，修改契约就等于让其他模块修改。因此，接口或抽象类一旦定义，就应该立即执行，不能有修改接口的思想，除非是彻底的大返工。

所以，要实现对扩展开放，首要的前提条件就是抽象约束。

2. 元数据（metadata）控制模块行为

编程是一个很苦很累的活，那怎么才能减轻我们的压力呢？答案是尽量使用元数据来控制程序的行为，减少重复开发。什么是元数据？用来描述环境和数据的数据，通俗地说就是配置参数，参数可以从文件中获得，也可以从数据库中获得。举个非常简单的例子，login方法中提供了这样的逻辑：先检查IP地址是否在允许访问的列表中，然后再决定是否需要到数据库中验证密码（如果采用SSH架构，则可以通过Struts的拦截器来实现），该行为就是一个典型的元数据控制模块行为的例子，其中达到极致的就是控制反转（Inversion of Control），使用最多的就是Spring容器，在SpringContext配置文件中

然后，通过建立一个Father类的子类Son，完成一个新的业务，同时修改SpringContext文件，。

通过扩展一个子类，修改配置文件，完成了业务变化，这也是采用框架的好处。

3. 制定项目章程
在一个团队中，建立项目章程是非常重要的，因为章程中指定了所有人员都必须遵守的约定，对项目来说，约定优于配置。相信大家都做过项目，会发现一个项目会产生非常多的配置文件。举个简单的例子，以SSH项目开发为例，一个项目中的Bean配置文件就非常多，管理非常麻烦。如果需要扩展，就需要增加子类，并修改SpringContext文件。然而，如果你在项目中指定这样一个章程：所有的Bean都自动注入，使用Annotation进行装配，进行扩展时，甚至只用写一个子类，然后由持久层生成对象，其他的都不需要修改，这就需要项目内约束，每个项目成员都必须遵守，该方法需要一个团队有较高的自觉性，需要一个较长时间的磨合，一旦项目成员都熟悉这样的规则，比通过接口或抽象类进行约束效率更高，而且扩展性一点也没有减少。

4. 封装变化
对变化的封装包含两层含义：
第一，将相同的变化封装到一个接口或抽象类中；

第二，将不同的变化封装到不同的接口或抽象类中，不应该有两个不同的变化出现在同一个接口或抽象类中。封装变化，也就是受保护的变化（protected variations），找出预计有变化或不稳定的点，我们为这些变化点创建稳定的接口，准确地讲是封装可能发生的变化，一旦预测到或“第六感”发觉有变化，就可以进行封装，

23个设计模式都是从各个不同的角度对变化进行封装的，我们会在各个模式中逐步讲解。

最佳实践

软件设计最大的难题就是应对需求的变化，但是纷繁复杂的需求变化又是不可预料的。我们要为不可预料的事情做好准备，这本身就是一件非常痛苦的事情，但是大师们还是给我们提出了非常好的6大设计原则以及23个设计模式来“封装”未来的变化.

* Single Responsibility Principle：单一职责原则

* Open Closed Principle：开闭原则

* Liskov Substitution Principle：里氏替换原则

* Law of Demeter：迪米特法则

* Interface Segregation Principle：接口隔离原则

* Dependence Inversion Principle：依赖倒置原则

把这6个原则的首字母（里氏替换原则和迪米特法则的首字母重复，只取一个）联合起来就是SOLID（solid，稳定的），其代表的含义也就是把这6个原则结合使用的好处：建立稳定、灵活、健壮的设计，而开闭原则又是重中之重，是最基础的原则，是其他5大原则的精神领袖。我们在使用开闭原则时要注意以下几个问题。

* 开闭原则也只是一个原则

开闭原则只是精神口号，实现拥抱变化的方法非常多，并不局限于这6大设计原则，但是遵循这6大设计原则基本上可以应对大多数变化。因此，我们在项目中应尽量采用这6大原则，适当时候可以进行扩充，例如通过类文件替换的方式完全可以解决系统中的一些缺陷。大家在开发中比较常用的修复缺陷的方法就是类替换，比如一个软件产品已经在运行中，发现了一个缺陷，需要修正怎么办？如果有自动更新功能，则可以下载一个.class文件直接覆盖原有的class，重新启动应用（也不一定非要重新启动）就可以解决问题，也就是通过类文件的替换方式修正了一个缺陷，当然这种方式也可以应用到项目中，正在运行中的项目发现需要增加一个新功能，通过修改原有实现类的方式就可以解决这个问题，前提条件是：类必须做到高内聚、低耦合，否则类文件的替换会引起不可预料的故障。

* 项目规章非常重要

如果你是一位项目经理或架构师，应尽量让自己的项目成员稳定，稳定后才能建立高效的团队文化，章程是一个团队所有成员共同的知识结晶，也是所有成员必须遵守的约定。优秀的章程能带给项目带来非常多的好处，如提高开发效率、降低缺陷率、提高团队士气、提高技术成员水平，等等。

* 预知变化

在实践中过程中，架构师或项目经理一旦发现有发生变化的可能，或者变化曾经发生过，则需要考虑现有的架构是否可以轻松地实现这一变化。架构师设计一套系统不仅要符合现有的需求，还要适应可能发生的变化，这才是一个优良的架构。

开闭原则是一个终极目标，任何人包括大师级人物都无法百分之百做到，但朝这个方向努力，可以非常显著地改善一个系统的架构，真正做到“拥抱变化”。

## 招式

### 单例模式
#### 优点:
1. 由于单例模式在内存中只有一个实例，减少了内存开支，特别是一个对象需要频繁地创建、销毁时，而且创建或销毁时性能又无法优化，单例模式的优势就非常明显。
2. 由于单例模式只生成一个实例，所以减少了系统的性能开销，当一个对象的产生需要比较多的资源时，如读取配置、产生其他依赖对象时，则可以通过在应用启动时直接产生一个单例对象，然后用永久驻留内存的方式来解决（在Java EE中采用单例模式时需要注意JVM垃圾回收机制）。
3. 单例模式可以避免对资源的多重占用，例如一个写文件动作，由于只有一个实例存在内存中，避免对同一个资源文件的同时写操作。
4. 单例模式可以在系统设置全局的访问点，优化和共享资源访问，例如可以设计一个单例类，负责所有数据表的映射处理。
#### 缺点
1. 单例模式一般没有接口，扩展很困难，若要扩展，除了修改代码基本上没有第二种途径可以实现。单例模式为什么不能增加接口呢？因为接口对单例模式是没有任何意义的，它要求“自行实例化”，并且提供单一实例、接口或抽象类是不可能被实例化的。当然，在特殊情况下，单例模式可以实现接口、被继承等，需要在系统开发中根据环境判断。
2. 单例模式对测试是不利的。在并行开发环境中，如果单例模式没有完成，是不能进行测试的，没有接口也不能使用mock的方式虚拟一个对象。
3. 单例模式与单一职责原则有冲突。一个类应该只实现一个逻辑，而不关心它是否是单例的，是不是要单例取决于环境，单例模式把“要单例”和业务逻辑融合在一个类中

### 工厂方法模式

#### 优点
工厂方法模式是典型的解耦框架。高层模块值需要知道产品的抽象类，其他的实现类都不用关心，符合迪米特法则，

我不需要的就不要去交流；

也符合依赖倒置原则，只依赖产品类的抽象；当然也符合里氏替换原则，使用产品子类替换产品父类，没问题！

工厂方法模式在项目中使用得非常频繁，以至于很多代码中都包含工厂方法模式。该模式几乎尽人皆知，但不是每个人都能用得好。熟能生巧，熟练掌握该模式，多思考工厂方法如何应用，而且工厂方法模式还可以与其他模式混合使用（例如模板方法模式、单例模式、原型模式等），变化出无穷的优秀设计，这也正是软件设计和开发的乐趣所在。
   
#### 使用场景

首先，工厂方法模式是new一个对象的替代品，所以在所有需要生成对象的地方都可以使用，但是需要慎重地考虑是否要增加一个工厂类进行管理，增加代码的复杂度。

其次，**需要灵活的、可扩展的框架时**，可以考虑采用工厂方法模式。万物皆对象，那万物也就皆产品类，例如需要设计一个连接邮件服务器的框架，有三种网络协议可供选择：POP3、IMAP、HTTP，我们就可以把这三种连接方法作为产品类，定义一个接口如IConnectMail，然后定义对邮件的操作方法，用不同的方法实现三个具体的产品类（也就是连接方式）再定义一个工厂方法，按照不同的传入条件，选择不同的连接方式。如此设计，可以做到完美的扩展，如某些邮件服务器提供了WebService接口，很好，我们只要增加一个产品类就可以了。

再次，工厂方法模式可以用在异构项目中，例如通过WebService与一个非Java的项目交互，虽然WebService号称是可以做到异构系统的同构化，但是在实际的开发中，还是会碰到很多问题，如类型问题、WSDL文件的支持问题，等等。从WSDL中产生的对象都认为是一个产品，然后由一个具体的工厂类进行管理，减少与外围系统的耦合。



### 抽象工厂模式
为创建一组相关或相互依赖的对象提供一个接口，而且无须指定它们的具体类

#### 优点
1. 封装性，每个产品的实现类不是高层模块要关心的，它要关心的是什么？是接口，是抽象，它不关心对象是如何创建出来，这由谁负责呢？工厂类，只要知道工厂类是谁，我就能创建出一个需要的对象，省时省力，优秀设计就应该如此。

2. 产品族内的约束为非公开状态。例如生产男女比例的问题上，猜想女娲娘娘肯定有自己的打算，不能让女盛男衰，否则女性的优点不就体现不出来了吗？那在抽象工厂模式，就应该有这样的一个约束：每生产1个女性，就同时生产出1.2个男性，这样的生产过程对调用工厂类的高层模块来说是透明的，它不需要知道这个约束，我就是要一个黄色女性产品就可以了，具体的产品族内的约束是在工厂内实现的。

#### 缺点
抽象工厂模式的最大缺点就是产品族扩展非常困难，为什么这么说呢？我们以通用代码为例，如果要增加一个产品C，也就是说产品家族由原来的2个增加到3个，看看我们的程序有多大改动吧！抽象类AbstractCreator要增加一个方法createProductC()，然后两个实现类都要修改，想想看，这严重违反了开闭原则，而且我们一直说明抽象类和接口是一个契约。改变契约，所有与契约有关系的代码都要修改，那么这段代码叫什么？叫“有毒代码”，——只要与这段代码有关系，就可能产生侵害的危险！

#### 使用场景及其注意事项
抽象工厂模式的使用场景定义非常简单：一个对象族（或是一组没有任何关系的对象）都有相同的约束，则可以使用抽象工厂模式。什么意思呢？例如一个文本编辑器和一个图片处理器，都是软件实体，但是*nix下的文本编辑器和Windows下的文本编辑器虽然功能和界面都相同，但是代码实现是不同的，图片处理器也有类似情况。也就是具有了共同的约束条件：操作系统类型。于是我们可以使用抽象工厂模式，产生不同操作系统下的编辑器和图片处理器。

在抽象工厂模式的缺点中，我们提到抽象工厂模式的产品族扩展比较困难，但是一定要清楚，是产品族扩展困难，而不是产品等级。在该模式下，产品等级是非常容易扩展的，增加一个产品等级，只要增加一个工厂类负责新增加出来的产品生产任务即可。也就是说横向扩展容易，纵向扩展困难。以人类为例子，产品等级中只有男、女两个性别，现实世界还有一种性别：双性人，既是男人也是女人（俗语就是阴阳人），那我们要扩展这个产品等级也是非常容易的，增加三个产品类，分别对应不同的肤色，然后再创建一个工厂类，专门负责不同肤色人的双性人的创建任务，完全通过扩展来实现需求的变更，从这一点上看，抽象工厂模式是符合开闭原则的。

使用的场景非常多，大家在软件产品开发过程中，涉及不同操作系统的时候，都可以考虑使用抽象工厂模式，例如一个应用，需要在三个不同平台（Windows、Linux、Android（Google发布的智能终端操作系统））上运行，你会怎么设计？分别设计三套不同的应用？非也，通过抽象工厂模式屏蔽掉操作系统对应用的影响。三个不同操作系统上的软件功能、应用逻辑、UI都应该是非常类似的，唯一不同的是调用不同的工厂方法，由不同的产品类去处理与操作系统交互的信息。


### 模板方法模式

#### 优点

* 封装不变部分，扩展可变部分

把认为是不变部分的算法封装到父类实现，而可变部分的则可以通过继承来继续扩展。在悍马模型例子中，是不是就非常容易扩展？例如增加一个H3型号的悍马模型，很容易呀，增加一个子类，实现父类的基本方法就可以了。

* 提取公共部分代码，便于维护

我们例子中刚刚走过的弯路就是最好的证明，如果我们不抽取到父类中，任由这种散乱的代码发生，想想后果是什么样子？维护人员为了修正一个缺陷，需要到处查找类似的代码！

* 行为由父类控制，子类实现

基本方法是由子类实现的，因此子类可以通过扩展的方式增加相应的功能，符合开闭原则

#### 使用场景

* 多个子类有公有的方法，并且逻辑基本相同时。

* 重要、复杂的算法，可以把核心算法设计为模板方法，周边的相关细节功能则由各个子类实现。

* 重构时，模板方法模式是一个经常使用的模式，把相同的代码抽取到父类中，然后通过钩子函数（见“模板方法模式的扩展”）约束其行为。

### 建造者模式

#### 优点
1. 封装性 使用建造者的客户端不必知道产品的具体细节. 例如code中的Client就不关心每一个具体的car model是怎么实现的.
2. 建造者独立，容易扩展. BMWBuilder和BenzBuilder是完全独立的
3. 便于控制细节风险 由于具体的建造者都是独立, 所以可以对建造过程具体细化. 而不对其他的模块产生影响.

#### 使用场景和注意事项
1. 相同的方法，不同的执行顺序，产生不同的事件结果时，可以采用建造者模式。
2. 多个部件或零件，都可以装配到一个对象中，但是产生的运行结果又不相同时，则可以使用该模式。
3. 产品类非常复杂，或者产品类中的调用顺序不同产生了不同的效能，这个时候使用建造者模式非常合适。
4. 在对象创建过程中会使用到系统中的一些其他对象，这些对象在产品对象的创建过程中不易得到时，也可以采用建造者模式封装该对象的创建过程。该种场景只能是一个补偿方法，因为一个对象不容易获得，而在设计阶段竟然没有发觉，而要通过创建者模式柔化创建过程，本身已经违反设计的最初目标。

注意事项:
建造者模式关注的是零件类型和装配工艺（顺序），这是它与工厂方法模式最大不同的地方，虽然同为创建类模式，但是注重点不同。

### 代理模式
1. 普通代理模式 该模式下，调用者只知代理而不用知道真实的角色是谁，屏蔽了真实角色的变更对高层模块的影响，真实的主题角色想怎么修改就怎么修改，对高层次的模块没有任何的影响，只要你实现了接口所对应的方法，该模式非常适合对扩展性要求较高的场合。当然，在实际的项目中，一般都是通过约定来禁止new一个真实的角色，这也是一个非常好的方案。
2. 强制代理模式 强制代理的概念就是要从真实角色查找到代理角色，不允许直接访问真实角色。高层模块只要调用getProxy就可以访问真实角色的所有方法，它根本就不需要产生一个代理出来，代理的管理已经由真实角色自己完成。
3. 动态代理模式 要实现动态代理的首要条件是：被代理类必须实现一个接口，回想一下前面的分析吧。当然了，现在也有很多技术如CGLIB可以实现不需要接口也可以实现动态代理的方式。
#### 优点
1. 高拓展性 真实的角色就是实现实际的业务逻辑，不用关心其他非本职责的事务，通过后期的代理完成一件事务，附带的结果就是编程简洁清晰。
2. 职责清晰 
3. 智能化

#### 使用场景
比如事前调查、事后追查都由律师来搞定，这就是为了减轻你的负担。代理模式的使用场景非常多，大家可以看看Spring AOP，这是一个非常典型的动态代理。

### 原型模式

#### 优点, 使用场景及其注意事项

* 优点 
性能优良 原型模式是在内存二进制流的拷贝，要比直接new一个对象性能好很多，特别是要在一个循环体内产生大量的对象时，原型模式可以更好地体现其优点。

逃避构造函数的约束 这既是它的优点也是缺点，直接在内存中拷贝，构造函数是不会执行的。优点就是减少了约束，缺点也是减少了约束，需要大家在实际应用时考虑

* 使用场景
资源优化场景 类初始化需要消化非常多的资源，这个资源包括数据、硬件资源等。
性能和安全要求的场景  通过new产生一个对象需要非常繁琐的数据准备或访问权限，则可以使用原型模式。
一个对象多个修改者的场景 一个对象需要提供给其他对象访问，而且各个调用者可能都需要修改其值时，可以考虑使用原型模式拷贝多个对象供调用者使用。
             
在实际项目中，原型模式很少单独出现，一般是和工厂方法模式一起出现，通过clone的方法创建一个对象，然后由工厂方法提供给调用者。原型模式已经与Java融为一体，大家可以随手拿来使用。
             
* 注意事项
1. 构造函数不会被执行
2. 浅拷贝和深拷贝 深浅拷贝的区别在于数组或者引用变量的拷贝. 浅拷贝拷贝出来的对象和原有对象持有的类成员变量是同一个, 修改了拷贝的新对象的这些变量. 原有的实例的类变量也会同时修改.



