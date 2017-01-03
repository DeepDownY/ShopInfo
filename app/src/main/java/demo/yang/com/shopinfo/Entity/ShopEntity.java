package demo.yang.com.shopinfo.Entity;


import android.graphics.Bitmap;

/**
 * Created by y1247 on 2017/1/3 0003.
 */

public class ShopEntity {
    private String name;
    private String Address;
    private String phone;
    private String email;
    private String net;
    private String Time;
    private String img_url;

    private Bitmap ShopImg;

    public Bitmap getShopImg() {
        return ShopImg;
    }

    public void setShopImg(Bitmap shopImg) {
        ShopImg = shopImg;
    }

    public String getImg_url() {
        return img_url;
    }

    public void setImg_url(String img_url) {
        this.img_url = img_url;
    }



    public ShopEntity() {
    }

    public ShopEntity(String name, String address, String phone, String email, String net, String time) {
        this.name = name;
        Address = address;
        this.phone = phone;
        this.email = email;
        this.net = net;
        Time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNet() {
        return net;
    }

    public void setNet(String net) {
        this.net = net;
    }

    public String getTime() {
        return Time;
    }

    public void setTime(String time) {
        Time = time;
    }
}
