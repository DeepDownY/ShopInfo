package demo.yang.com.shopinfo.Presentor;

import demo.yang.com.shopinfo.Entity.ShopEntity;
import demo.yang.com.shopinfo.Model.IShopModel;
import demo.yang.com.shopinfo.Model.ShopModel;
import demo.yang.com.shopinfo.UI.IShopView;

/**
 * Created by y1247 on 2017/1/3 0003.
 */

public class ShopPre {
    IShopModel shopModel;
    IShopView shopView;

    public ShopPre(IShopView shopView) {
        this.shopView = shopView;
        shopModel = new ShopModel();
    }

    public void setEntity(){
        ShopEntity shopEntity = shopModel.getEntity();
        shopView.setEntity(shopEntity);
    }
}
