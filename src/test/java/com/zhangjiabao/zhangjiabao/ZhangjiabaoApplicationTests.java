package com.zhangjiabao.zhangjiabao;

import com.zhangjiabao.zhangjiabao.all.bean.*;
import com.zhangjiabao.zhangjiabao.all.mapper.CustomerMapper;
import com.zhangjiabao.zhangjiabao.all.mapper.ProductAPI;
import com.zhangjiabao.zhangjiabao.all.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ZhangjiabaoApplicationTests {


    @Resource
    UserService userService;

    @Resource
    CustomerMapper customerMapper;

    @Resource
    ProductAPI productAPI;


    @Test
    public void contextLoads() {

        System.out.println(userService.getUserInfoService());


    }

    @Test
    public  void testMapperSelect(){
       Customer customer= customerMapper.selectCustomerByloginName("王五");
        System.out.println(customer);

    }
    @Test
    public  void testMapperSelectAll12(){
        List<Customer> customerList= customerMapper.selectCustomers();
        System.out.println(customerList);

    }
    @Test
    public  void testMapperSelectid(){
        Customer customer= customerMapper.selectCustomerById(3);
        System.out.println(customer);

    }

    @Test
    public  void testMapperinsert(){
        Customer customer=new Customer();
        customer.setUserStyle(1);
        customer.setModifiedTime(new Date());
        customer.setPassWord("43242");
        customer.setLoginName("中国移动");
        customer.setUserStats(1);
        customerMapper.addCustomer(customer);


    }
    @Test
    public  void testMapperdelet(){
        customerMapper.deleteCustomerById(3);


    }
    @Test
    public  void testMapperupdata(){
        Customer customer=new Customer();
        customer.setCustomerId(4);
        customer.setUserStyle(2);
        customer.setModifiedTime(new Date());
        customer.setPassWord("555555");
        customer.setLoginName("李建");
        customer.setUserStats(1);
        customerMapper.upDateCustomerById(customer);


    }



// 批量录入商品信息

    @Test
    public  void testInsertProductInfo(){


        /**
         *
         *  private Integer brand_id;品牌ID
         *     private String brand_name;品牌名称
         *     private String telephone;联系电话
         *     private String brand_web;品牌网络
         *     private String brand_logo;品牌logo URL
         *     private String brand_desc;品牌描述
         *     private Boolean brand_status;品牌状态,0禁用,1启用
         *     private Boolean brand_order;排序
         *     private Timestamp modified_time;最后修改时间
         *
         *
         *
         *IT、数码、通讯类
         * 索尼 松下 三星 IBM 戴尔 惠普 夏普 LG 东芝 日立 佳能 三洋 西门子 爱立信 诺基
         *
         *
         *摩托车 本田 铃木 雅马 哈川崎 太子 豪爵 建设 嘉陵 南方 新大洲 宗申 钱江 力帆
         *
         *家电类 飞利浦、长虹、创维、Tcl、康佳、海信、海尔、熊猫 春兰、美的、新飞、长
         *
         *饮料、纯净水 可口可乐、百事可乐、娃哈哈、乐百氏、农夫山泉、健力宝
         *
         * 奶粉、鲜奶 伊利 蒙牛 三鹿 光明 美庐 飞鹤 完达山 雅士利 维维 汇源 喜之
         * */


        Product_brand_info product_brand_info=new Product_brand_info();
        product_brand_info.setBrand_name("索尼");
        product_brand_info.setTelephone("13523001414");
        product_brand_info.setBrand_web("http://www.gree.com/");
        product_brand_info.setBrand_logo("http://gree.com/data/tms/gree/images/header_logo_1.jpg");
        product_brand_info.setBrand_desc("完美");
        product_brand_info.setBrand_status(true);
        product_brand_info.setBrand_order(true);
        product_brand_info.setModified_time(new Date());
        productAPI.insertProductBrandInfo(product_brand_info);

        Product_brand_info product_brand_info1=new Product_brand_info();
        product_brand_info1.setBrand_name("三星");
        product_brand_info1.setTelephone("13523001414");
        product_brand_info1.setBrand_web("https://www.apple.com/");
        product_brand_info1.setBrand_logo("https://www.apple.com/");
        product_brand_info1.setBrand_desc("打造智慧生活");
        product_brand_info1.setBrand_status(true);
        product_brand_info1.setBrand_order(true);
        product_brand_info1.setModified_time(new Date());
        productAPI.insertProductBrandInfo(product_brand_info1);


        Product_brand_info product_brand_info2=new Product_brand_info();
        product_brand_info2.setBrand_name("戴尔");
        product_brand_info2.setTelephone("13523001414");
        product_brand_info2.setBrand_web("https://www.apple.com/");
        product_brand_info2.setBrand_logo("https://www.apple.com/");
        product_brand_info2.setBrand_desc("打造智慧生活");
        product_brand_info2.setBrand_status(true);
        product_brand_info2.setBrand_order(true);
        product_brand_info2.setModified_time(new Date());
        productAPI.insertProductBrandInfo(product_brand_info2);

       /* private Integer category_id;分类ID
        private String category_name;分类名称
        private String category_code;分类编码
        private Integer parent_id;父分类ID
        private Boolean category_level;分类层级
        private Boolean category_status;分类状态
        private Timestamp modified_time;最后修改时间
*/


        Product_category product_category=new Product_category();

        product_category.setCategory_name("常用电器");
        product_category.setCategory_code("201910000");
        product_category.setParent_id(1);
        product_category.setCategory_level(true);
        product_category.setCategory_status(true);
        product_category.setModified_time(new Date());
        productAPI.insertProductCategory(product_category);






        Product_category product_categoryer=new Product_category();

        product_categoryer.setCategory_name("IT 数码");
        product_categoryer.setCategory_code("201911000");
        product_categoryer.setParent_id(201910000);
        product_categoryer.setCategory_level(true);
        product_categoryer.setCategory_status(true);
        product_categoryer.setModified_time( new Date());
        productAPI.insertProductCategory(product_categoryer);



        Product_category product_categoryer99=new Product_category();

        product_categoryer99.setCategory_name("电器电线");
        product_categoryer99.setCategory_code("201912000");
        product_categoryer99.setParent_id(201910000);
        product_categoryer99.setCategory_level(true);
        product_categoryer99.setCategory_status(true);
        product_categoryer99.setModified_time(new Date());
        productAPI.insertProductCategory(product_categoryer99);




        Product_category product_categoryer9934=new Product_category();

        product_categoryer9934.setCategory_name("电脑");
        product_categoryer9934.setCategory_code("201913000");
        product_categoryer9934.setParent_id(201910000);
        product_categoryer9934.setCategory_level(true);
        product_categoryer9934.setCategory_status(true);
        product_categoryer9934.setModified_time(new Date());
        productAPI.insertProductCategory(product_categoryer9934);


        Product_category product_categoryer993423=new Product_category();

        product_categoryer993423.setCategory_name("游戏本");
        product_categoryer993423.setCategory_code("201913001");
        product_categoryer993423.setParent_id(201913000);
        product_categoryer993423.setCategory_level(true);
        product_categoryer993423.setCategory_status(true);
        product_categoryer993423.setModified_time(new Date());
        productAPI.insertProductCategory(product_categoryer993423);


        Product_category product_categ=new Product_category();

        product_categ.setCategory_name("商务本");
        product_categ.setCategory_code("201913002");
        product_categ.setParent_id(201913000);
        product_categ.setCategory_level(true);
        product_categ.setCategory_status(true);
        product_categ.setModified_time( new Date());
        productAPI.insertProductCategory(product_categ);







        Product_category product_categoryshan=new Product_category();

        product_categoryshan.setCategory_name("手机智能");
        product_categoryshan.setCategory_code("201911001");
        product_categoryshan.setParent_id(201911000);
        product_categoryshan.setCategory_level(true);
        product_categoryshan.setCategory_status(true);
        product_categoryshan.setModified_time( new Date());
        productAPI.insertProductCategory(product_categoryshan);


        Product_category product_category111=new Product_category();

        product_category111.setCategory_name("数码摄像机");
        product_category111.setCategory_code("201911002");
        product_category111.setParent_id(201911000);
        product_category111.setCategory_level(true);
        product_category111.setCategory_status(true);
        product_category111.setModified_time( new Date());
        productAPI.insertProductCategory(product_category111);








        Product_category product_category1=new Product_category();
        product_category1.setCategory_name("日常生活");
        product_category1.setCategory_code("201920000");
        product_category1.setParent_id(1);
        product_category1.setCategory_level(true);
        product_category1.setCategory_status(true);
        product_category1.setModified_time( new Date());
        productAPI.insertProductCategory(product_category1);



        Product_category product_category2=new Product_category();
        product_category2.setCategory_name("运动机械");
        product_category2.setCategory_code("201930000");
        product_category2.setParent_id(1);
        product_category2.setCategory_level(true);
        product_category2.setCategory_status(true);
        product_category2.setModified_time( new Date());
        productAPI.insertProductCategory(product_category2);



        Product_category product_category3=new Product_category();
        product_category3.setCategory_name("学习用品");
        product_category3.setCategory_code("201940000");
        product_category3.setParent_id(1);
        product_category3.setCategory_level(true);
        product_category3.setCategory_status(true);
        product_category3.setModified_time( new Date());
        productAPI.insertProductCategory(product_category3);




        Product_category product_category4=new Product_category();
        product_category4.setCategory_name("其他");
        product_category4.setCategory_code("201950000");
        product_category4.setParent_id(1);
        product_category4.setCategory_level(true);
        product_category4.setCategory_status(true);
        product_category4.setModified_time( new Date());
        productAPI.insertProductCategory(product_category4);
        /**
         * private Integer comment_id;评论ID
         *     private Integer product_id;商品ID
         *     private Long order_id;订单ID
         *     private Integer customer_id;用户ID
         *     private String title;评论标题
         *     private String content;评论内容
         *     private Integer audit_status;审核状态：0未审核，1已审核
         *     private Timestamp audit_time;评论时间
         *     private Timestamp modified_time;最后修改时间
         *
         *
         *
         *
         *
         * */



        Product_comment product_comment=new Product_comment();
        product_comment.setProduct_id(1);
        //可以当前日期加登录人员的id 作为订单编号id
        product_comment.setOrder_id(new Date().getTime()+112);
        product_comment.setCustomer_id(12);
        product_comment.setTitle("好评");
        product_comment.setContent("这个东西真的好");
        product_comment.setAudit_status(0);
        product_comment.setAudit_time(new Date() );
        product_comment.setModified_time(new Date() );

        productAPI.insertProductComment(product_comment);


        Product_comment product_comment1=new Product_comment();
        product_comment1.setProduct_id(1);
        //可以当前日期加登录人员的id 作为订单编号id
        product_comment1.setOrder_id(new Date().getTime()+100);
        product_comment1.setCustomer_id(1);
        product_comment1.setTitle("好评");
        product_comment1.setContent("这个东西真的好");
        product_comment1.setAudit_status(0);
        product_comment1.setAudit_time(new Date() );
        product_comment1.setModified_time(new Date() );

        productAPI.insertProductComment(product_comment1);


        Product_comment product_comment2=new Product_comment();
        product_comment2.setProduct_id(1);
        //可以当前日期加登录人员的id 作为订单编号id
        product_comment2.setOrder_id(new Date().getTime()+102);
        product_comment2.setCustomer_id(2);
        product_comment2.setTitle("好评");
        product_comment2.setContent("这个东西真的好");
        product_comment2.setAudit_status(0);
        product_comment2.setAudit_time(new Date() );
        product_comment2.setModified_time(new Date() );

        productAPI.insertProductComment(product_comment2);


        Product_comment product_comment3=new Product_comment();
        product_comment3.setProduct_id(1);
        //可以当前日期加登录人员的id 作为订单编号id
        product_comment3.setOrder_id(new Date().getTime()+103);
        product_comment3.setCustomer_id(3);
        product_comment3.setTitle("好评");
        product_comment3.setContent("这个东西真的好");
        product_comment3.setAudit_status(0);
        product_comment3.setAudit_time(new Date() );
        product_comment3.setModified_time(new Date() );

        productAPI.insertProductComment(product_comment3);


        Product_comment product_comment4=new Product_comment();
        product_comment4.setProduct_id(1);
        //可以当前日期加登录人员的id 作为订单编号id
        product_comment4.setOrder_id(new Date().getTime()+113);
        product_comment4.setCustomer_id(13);
        product_comment4.setTitle("好评");
        product_comment4.setContent("这个东西真的好");
        product_comment4.setAudit_status(0);
        product_comment4.setAudit_time(new Date() );
        product_comment4.setModified_time(new Date() );

        productAPI.insertProductComment(product_comment4);






        /**
         * private Integer product_id;商品ID
         *     private String product_core;商品编码
         *     private String product_name;商品名称
         *     private String bar_code;校条码
         *
         *     private Integer brand_id;品牌表的ID
         *     private Integer one_category_id;一级分类ID
         *     private Integer two_category_id;二级分类ID
         *     private Integer three_category_id;三级分类ID
         *     private Integer supplier_id;商品的供应商ID
         *
         *     private BigDecimal price;商品销售价格
         *
         *当我们测算新资本的预期成本的时候，我们应当采用每个成分的市值，而不是它们的面值 （这之间可能存在明显差额）. 另外，更“外部”的资金来源，例如可转换债券，可转换优先股等，如果数额较大，也需要体现在公式中，因为这些融资方式的特殊性，其成本和普通股本债券通常存在差
         *     private BigDecimal average_cost;商品加权平均成本
         *     private Boolean publish_status;上下架状态：0下架1上架
         *     private Boolean audit_status;审核状态：0未审核，1已审核
         *
         *     private Double weight;商品重量
         *     private Double length;商品长度
         *     private Double height;商品高度
         *     private Double width;商品宽度
         *     //color_type
         *     private Integer color_type;'红','黄','蓝','黑'
         *     private Date production_date;生产日期
         *     private Integer shelf_life;商品有效期
         *     private String descript;商品描述
         *     private Timestamp indate;商品录入时间
         *     private Timestamp modified_time;最后修改时间
         *
         *
         * */

        Product_info product_info =new Product_info();

        product_info.setProduct_core(new StringBuilder(new Date().getTime()+"").substring(0,5) +"2019");
        product_info.setProduct_name("OPPOR9智能手机");
        product_info.setBar_code("919"+new Date());
        product_info.setBrand_id(1);
        //商品分类
        //智能手机
        product_info.setOne_category_id(1);
        product_info.setTwo_category_id(201911000);
        product_info.setThree_category_id(201911001);

        product_info.setSupplier_id(1);
        product_info.setPrice(new BigDecimal(129.25));

        product_info.setAverage_cost(new BigDecimal(25.25) );
        product_info.setPublish_status(true);
        product_info.setAudit_status(true);
        product_info.setWeight(15.67);

        product_info.setHeight(12.56);
        product_info.setWidth(34.66);
        product_info.setLength(34.65);
        product_info.setColor_type(1);
         product_info.setProduction_date(new Date());
        product_info.setShelf_life(100);
        product_info.setDescript("九成新");
        product_info.setIndate(new Date());
        product_info.setModified_time(new Date());

        productAPI.insertProductInfo(product_info);

        /**
         *
         *  private Integer product_pic_id;商品图片ID
         *     private Integer product_id;商品ID
         *     private String pic_desc;图片描述
         *     private String pic_url;图片URL
         *     private Boolean is_master;是否主图：0.非主图1.主图
         *     private Boolean pic_order;图片排序
         *     private Boolean pic_status;图片是否有效：0无效 1有效
         *     private Timestamp modified_time;最后修改时间
         *
         *
         * */

        Product_pic_info product_pic_info=new Product_pic_info();

        product_pic_info.setProduct_id(1);
        product_pic_info.setPic_desc("二手手机图片");
        product_pic_info.setPic_url("static/images/002.jpg");
        product_pic_info.setIs_master(true);
        product_pic_info.setPic_order(true);
        product_pic_info.setPic_status(true);
        product_pic_info.setModified_time(new Date());

        productAPI.insertProductPicinfo(product_pic_info);

        /**
         *
         * private Integer supplier_id;供应商ID
         *     private String supplier_code;供应商编码
         *     private String supplier_name;供应商名称
         *     private Integer supplier_type;供应商类型：1.自营，2.平台
         *     private String link_man;供应商联系人
         *     private String phone_number;联系电话
         *     private String bank_name;供应商开户银行名称
         *     private String bank_account;银行账号
         *     private String address;供应商地址
         *     private Boolean supplier_status;状态：0禁止，1启用
         *     private Timestamp modified_time;最后修改时间
         *
         *
         *
         * */



       /* Product_supplierinfo product_supplierinfo=new Product_supplierinfo();

        product_supplierinfo.setSupplier_code("919"+new Date().getYear()+"5815");

        product_supplierinfo.setSupplier_name("峰峰官方旗舰店");
        product_supplierinfo.setSupplier_type(false);
        product_supplierinfo.setLink_man("马艳峰");
        product_supplierinfo.setPhone_number("13523001401");
        product_supplierinfo.setBank_name("中国工商银行");
        product_supplierinfo.setBank_account("4564658453131351");
        product_supplierinfo.setAddress("河南省安阳市文峰大道599号安阳学院");
        product_supplierinfo.setSupplier_status(true);

        product_supplierinfo.setModified_time(new Date());

        productAPI.insertProductSupplierInfo(product_supplierinfo);*/


    }





    @Test
    public  void testInsertfenleiinfo() {

        Product_info product_info = new Product_info();

        product_info.setProduct_core(new StringBuilder(new Date().getTime() + "").substring(0, 5) + "2019");
        product_info.setProduct_name("刷子");
        product_info.setBar_code("919" + new Date());
        product_info.setBrand_id(1);
        //商品分类
        //智能手机
        product_info.setOne_category_id(1);
        product_info.setTwo_category_id(201921000);
        product_info.setThree_category_id(201921001);

        product_info.setSupplier_id(1);
        product_info.setPrice(new BigDecimal(129.25));

        product_info.setAverage_cost(new BigDecimal(25.25));
        product_info.setPublish_status(true);
        product_info.setAudit_status(true);
        product_info.setWeight(15.67);

        product_info.setHeight(11.56);
        product_info.setWidth(15.66);
        product_info.setLength(30.65);
        product_info.setColor_type(1);
        product_info.setProduction_date(new Date());
        product_info.setShelf_life(100);
        product_info.setDescript("九成新");
        product_info.setIndate(new Date());
        product_info.setModified_time(new Date());

        productAPI.insertProductInfo(product_info);

    }

    @Test
    public  void setfenleixing(){

        Product_category product_category111=new Product_category();

        product_category111.setCategory_name("经常使用");
        product_category111.setCategory_code("201921001");
        product_category111.setParent_id(201921000);
        product_category111.setCategory_level(true);
        product_category111.setCategory_status(true);
        product_category111.setModified_time( new Date());
        productAPI.insertProductCategory(product_category111);

    }
    @Test
    public  void  setproductdianpu(){


        Product_supplierinfo product_supplierinfo=new Product_supplierinfo();

        product_supplierinfo.setSupplier_code("919"+new Date().getYear()+"5815");
        product_supplierinfo.setProduct_id(18);

        product_supplierinfo.setSupplier_name("老谭小商品专卖店");
        product_supplierinfo.setSupplier_type("0");
        product_supplierinfo.setLink_man("谭志斌");
        product_supplierinfo.setPhone_number("13523001401");
        product_supplierinfo.setBank_name("中国工商银行");
        product_supplierinfo.setBank_account("4564658453131351");
        product_supplierinfo.setAddress("河南省安阳市安阳学院");
        product_supplierinfo.setSupplier_status(true);


        product_supplierinfo.setModified_time(new Date());
        productAPI.insertProductSupplierInfo(product_supplierinfo);
    }

}
