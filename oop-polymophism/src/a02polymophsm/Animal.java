package a02polymophsm;

class Test {
    public static void main(String[] args) {
        // 创建对象(多态方式)
        // Fu f = new Zi();

        Animal a = new Dog();
        // 调用成员变量：编译看方法，运行看左边
        // 编译看左边：javac编译代码的时候，会看左边的弗雷中有没有这个变量，如果有编译成功，反之，如果没有则编译失败
        // 运行也看左边：java运行代码的时候，实际获取的是左边父类中成员变量的值
        System.out.println(a.name);// 动物
        // a是Animal类型的

        // 调用成员方法
        // 编译看左边：javac编译代码的时候，会看左边的弗雷中有没有这个变量，如果有编译成功，反之，如果没有则编译失败
        // 运行看右边：java 运行代码的时候，实际上运行的时候子类中的方法
        a.show();// Dog show
    }
}

class Animal {
    String name = "动物";

    public void show() {
        System.out.println("Animal show方法");
    }
}

class Dog extends Animal{
    String name = "狗";

    @Override
    public void show() {
        System.out.println("Dog show方法");
    }
}

class Cat extends Animal {
    String name = "猫";

    @Override
    public void show() {
        System.out.println("Cat show方法");
    }
}