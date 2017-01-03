package demo.yang.com.shopinfo.UI;

import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.ImageRequest;
import com.android.volley.toolbox.Volley;

import demo.yang.com.shopinfo.Entity.ShopEntity;
import demo.yang.com.shopinfo.Presentor.ShopPre;
import demo.yang.com.shopinfo.R;

public class MainActivity extends AppCompatActivity implements IShopView{

    ShopPre shopPre;

    RequestQueue queue;

    TextView tv_ShopName;
    TextView tv_ShopAddress;
    TextView tv_ShopEmdil;
    TextView tv_ShopNet ;
    TextView tv_ShopTime;
    TextView tv_ShopPhone;

    LinearLayout ll_Net;
    LinearLayout ll_Time;
    LinearLayout ll_Email;

    ImageView iv_ShopImg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();

        shopPre.setEntity();

    }

    private void init() {
        queue = Volley.newRequestQueue(this);

        iv_ShopImg = (ImageView) findViewById(R.id.iv_ShopImg);

        tv_ShopName = (TextView) findViewById(R.id.tv_ShopName);
        tv_ShopAddress = (TextView) findViewById(R.id.tv_ShopAddress);
        tv_ShopEmdil = (TextView) findViewById(R.id.tv_ShopEmail);
        tv_ShopNet = (TextView) findViewById(R.id.tv_ShopNet);
        tv_ShopTime = (TextView) findViewById(R.id.tv_ShopTime);
        tv_ShopPhone = (TextView) findViewById(R.id.tv_ShopPhone);

        ll_Net = (LinearLayout) findViewById(R.id.ll_ShopNet);
        ll_Time = (LinearLayout) findViewById(R.id.ll_ShopTime);
        ll_Email = (LinearLayout) findViewById(R.id.ll_ShopEmail);
        shopPre = new ShopPre(this);
    }

    @Override
    public void setEntity(ShopEntity shopEntity) {
        readBitmapViaVolley(shopEntity.getImg_url(),iv_ShopImg);

        tv_ShopName.setText(shopEntity.getName());
        tv_ShopAddress.setText(shopEntity.getAddress());
        tv_ShopPhone.setText(shopEntity.getPhone());

        if(shopEntity.getEmail()!=null){
            tv_ShopEmdil.setText(shopEntity.getEmail());
        }else ll_Email.setVisibility(View.INVISIBLE);

        if(shopEntity.getNet()!=null){
            tv_ShopNet.setText(shopEntity.getNet());
        }else ll_Net.setVisibility(View.INVISIBLE);

        if(shopEntity.getTime()!=null){
            tv_ShopTime.setText(shopEntity.getTime());
        }else ll_Time.setVisibility(View.INVISIBLE);

    }

    public void readBitmapViaVolley(String imgUrl, final ImageView imageView) {
        ImageRequest imgRequest = new ImageRequest(imgUrl,
                new Response.Listener<Bitmap>() {
                    @Override
                    public void onResponse(Bitmap arg0) {
                        // TODO Auto-generated method stub
                        iv_ShopImg.setImageBitmap(arg0);
                    }
                },
                0,
                0,
                ImageView.ScaleType.FIT_XY,
                Bitmap.Config.ARGB_8888,
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError arg0) {

                    }
                });

        queue.add(imgRequest);
    }
}
