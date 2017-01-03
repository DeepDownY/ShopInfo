package demo.yang.com.shopinfo.Model;


import demo.yang.com.shopinfo.Entity.ShopEntity;

/**
 * Created by y1247 on 2017/1/3 0003.
 */

public class ShopModel implements IShopModel {

    @Override
    public ShopEntity getEntity() {
        ShopEntity shopEntity = new ShopEntity();
        shopEntity.setName("临时店铺");
        shopEntity.setAddress("成都市武侯区二仙桥街道");
        shopEntity.setEmail("12345678@gmail.com");
        shopEntity.setNet("developers.google.cn");
        shopEntity.setPhone("12345678901");
        shopEntity.setImg_url("http://7vijy3.com1.z0.glb.clouddn.com/20150914162129_FAfuQ.jpeg");

        return shopEntity;
    }
}
