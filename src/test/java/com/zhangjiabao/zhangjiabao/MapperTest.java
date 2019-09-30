package com.zhangjiabao.zhangjiabao;

import com.zhangjiabao.zhangjiabao.all.bean.*;
import com.zhangjiabao.zhangjiabao.all.mapper.ProductMapperAPI;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MapperTest {
    @Resource
    ProductMapperAPI productMapperAPI;

@Test
public void testProductinfo() {

    List<Product_info> productinfoList= productMapperAPI.selectAllProductInfo();
    for (Product_info product_info :productinfoList) {
        System.out.println(product_info);

    }






}

    @Test
    public  void testserviceproduct(){
        //商品信息
        List<Product_info> Product_infoList =productMapperAPI.selectAllProductInfo();
        System.out.println(Product_infoList);
        for (Product_info product_info:
        Product_infoList) {
            System.out.println(product_info);
        }

        System.out.println("以上为商品信息");







        if (Product_infoList!=null) {
            for (Product_info product_info : Product_infoList) {

                //商品图片放入session
                List<Product_pic_info> Product_pic_infolist = productMapperAPI.selectProductPicInfoByProductId(product_info.getProduct_id());
                //session.setAttribute("Product_pic_infolist",Product_pic_infolist);
                for (Product_pic_info product_pic_info : Product_pic_infolist) {
                    System.out.println(product_pic_info);

                }



                //店家商品表
                List<Product_info_supp> product_info_suppList=productMapperAPI.selectProductInfoSupp(product_info.getProduct_id());
                for (Product_info_supp product_info_supp:
                product_info_suppList) {
                    List<Product_supplierinfo> Product_supplierinfolist = productMapperAPI.selectProductSupplierinfobyInfosupid(product_info_supp.getInfosupid());



                }


                List<Product_supplierinfo> Product_supplierinfolist = productMapperAPI.selectProductSupplierinfobyInfosupid(product_info.getProduct_id());
                //session.setAttribute("Product_supplierinfolist",Product_supplierinfolist);
                for (Product_supplierinfo product_supplierinfo : Product_supplierinfolist) {
                    System.out.println(product_supplierinfo);

                }



                //品牌信息
                List<Product_brand_info> Product_brand_infoList = productMapperAPI.selectProductBrandInfoByBrandInfo(product_info.getBrand_id());
                //session.setAttribute("Product_brand_infoList",Product_brand_infoList);
                for (Product_brand_info product_brand_info : Product_brand_infoList) {
                    System.out.println(product_brand_info);

                }



                //分类信息
                /* productMapperAPI.selectProductCategoryByCategoryIdCategoryId(product_info.getThree_category_id());
                 */

            }


        }
    }



}
