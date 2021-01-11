package jiekou;

public class AlermDoor extends Door implements  Alerm {

    @Override
    public void alerm() {
        System.out.println("嘀嘀嘀~");
    }

    @Override
    public void open() {
        System.out.println("门已打开");
    }

    @Override
    public void close() {
        System.out.println("门已关闭");
    }
}
