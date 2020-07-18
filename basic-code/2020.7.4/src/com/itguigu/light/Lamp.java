package com.itguigu.light;

/**
 * @author z
 * @create 2020-07-15-14:25
 */
public class Lamp {
    private Buble buble;
    public void on( Buble buble){
        buble.light();
        System.out.println("台灯打开");
    }


    public Lamp(Buble buble) {
        this.buble = buble;
    }

    public Buble getBuble() {
        return buble;
    }

    public void setBuble(Buble buble) {
        this.buble = buble;
    }

    @Override
    public String toString() {
        return "Lamp{" +
                "buble=" + buble +
                '}';
    }


}
