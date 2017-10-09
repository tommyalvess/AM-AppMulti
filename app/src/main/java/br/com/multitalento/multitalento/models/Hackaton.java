package br.com.multitalento.multitalento.models;

import java.io.Serializable;

/**
 * Created by logonrm on 12/09/2017.
 */

public class Hackaton implements Serializable {

    private int id;
    private String name;
    private String des;
    private byte[] img;

    public Hackaton(String name, String des, byte[] img, int id) {
        this.name = name;
        this.des = des;
        this.img = img;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public byte[] getImg() {
        return img;
    }

    public void setImg(byte[] img) {
        this.img = img;
    }
}
