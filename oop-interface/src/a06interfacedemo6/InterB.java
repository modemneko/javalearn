package a06interfacedemo6;

public interface InterB {
    public default void show() {
        System.out.println("接口中的默认方法 ---- show");
    }

    public abstract void method();
}
