### 面向对象的特征

* **抽象**：抽象是将一类对象的共同特征总结出来构造类的过程，包括数据抽象和行为抽象两个方面。抽象只关心对象有哪些行为和属性，并不关心这些行为的细节是什么。
* **继承**：继承是从已有类得到继承信息的创建过程。提供继承信息的类被称为父类；得到继承信息的类被沉稳给子类。继承让变化的软件系统有了一定的连续性，同时继承也是封装程序中可变因素的重要手段
* **封装**：通常认为封装是把数据和操作数据的方法绑定起来，对数据的访问只能通过已经定义的接口。面向对象的本质就是将现实世界描绘成一系列完全自治、封闭的对象。在类编写的方法就是对实现细节的一种封装；类就是对于数据和数据操作的封装。封装就是隐藏一切可以隐藏的东西，只向外界提供最简单的编程接口。
* **多态**：多态是指允许不同的子类型的对象对同一消息作出不同的响应。简单的说就是同样的对象调用同样的方法但是做了不同的事情。多态性分为编译时的多态性和运行时的多态性。如果将对象的方法视为对象向外界提供的服务,那么运行时的多态性可以解释为：当 A 系统访问 B 系统提供的服务时，B 系统有多种提供服务的方式，但一切对 A 系统来说都是透明的（就像电动剃须 刀是 A 系统，它的供电系统是 B 系统，B 系统可以使用电池供电或者用交流电， 甚至还有可能是太阳能，A 系统只会通过 B 类对象调用供电的方法，但并不知道 供电系统的底层实现是什么，究竟通过何种方式获得了动力）。**方法重载（overload）实现的是编译时的多态性（也称为前绑定），而方法重写（override） 实现的是运行时的多态性（也称为后绑定）**。运行时的多态是面向对象最精髓的 东西，要实现多态需要做两件事：1. 方法重写（子类继承父类并重写父类中已 有的或抽象的方法）；2. 对象造型（用父类型引用引用子类型对象，这样同样 的引用调用同样的方法就会根据子类对象的不同而表现出不同的行为）。