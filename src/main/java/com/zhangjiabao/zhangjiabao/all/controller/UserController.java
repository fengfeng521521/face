package com.zhangjiabao.zhangjiabao.all.controller;


import com.zhangjiabao.zhangjiabao.all.bean.*;
import com.zhangjiabao.zhangjiabao.all.service.CustomerService;
import com.zhangjiabao.zhangjiabao.all.service.UserService;
import com.zhangjiabao.zhangjiabao.all.unitls.VerifyCodeUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

@Controller
public class UserController {
    @Autowired
    UserService userService;


    @Autowired
    CustomerService customerService;
    //测试转发到jsp
    @RequestMapping("/showAllInfo")
    public String  getUserInfoController(HttpSession session){
     User userInfo=  userService.getUserInfoService();
        session.setAttribute("userInfo",userInfo);

        return  "userinfo";

    }


    //转发到对应的jsp
    @RequestMapping("/index")
    public String toZhanFaIndex(){


        return "index";
    }





    //转发ChangePassword.jsp
    @RequestMapping("/ChangePassword")
    public String toZhanFaChangePassword(){


        return "ChangePassword";
    }

    //转发GoodsPurchased.jsp
    @RequestMapping("/GoodsPurchased")
    public String toZhanFaGoodsPurchased(){


        return "GoodsPurchased";
    }
    //转发MyAfterSales.jsp
    @RequestMapping("/MyAfterSales")
    public String toZhanFaMyAfterSales(){


        return "MyAfterSales";
    }
    //转发MyCollection.jsp
    @RequestMapping("/MyCollection")
    public String toZhanFaMyCollection(){


        return "MyCollection";
    }
    //转发MyCommission.jsp
    @RequestMapping("/MyCommission")
    public String toZhanFaMyCommission(){


        return "MyCommission";
    }
    //转发MyOrder.jsp
    @RequestMapping("/MyOrder")
    public String toZhanFaMyOrder(){


        return "MyOrder";
    }
    //转发OrderPaymentSuccessful.jsp
    @RequestMapping("/OrderPaymentSuccessful")
    public String toZhanFaOrderPaymentSuccessful(){


        return "OrderPaymentSuccessful";
    }
    //转发ProductDetails.jsp
    @RequestMapping("/ProductDetails")
    public String toZhanFaProductDetails(){


        return "ProductDetails";
    }
    //转发ProductList.jsp
    @RequestMapping("/ProductList")
    public String toZhanFaProductList(){


        return "ProductList";
    }
    //转发ReceivingAddress.jsp
    @RequestMapping("/ReceivingAddress")
    public String toZhanFaReceivingAddress(){


        return "ReceivingAddress";
    }
    //转发ShoppingCart.jsp
    @RequestMapping("/ShoppingCart")
    public String toZhanFaShoppingCart(){


        return "ShoppingCart";
    }
    //转发ShoppingCartFillInCheckOrder.jsp
    @RequestMapping("/ShoppingCartFillInCheckOrder")
    public String toZhanFaShoppingCartFillInCheckOrder(){


        return "ShoppingCartFillInCheckOrder";
    }
    //转发SignIn.jsp
    @RequestMapping("/SignIn")
    public String toZhanFaSignIn(){


        return "SignIn";
    }
    //转发userInfo.jsp
    @RequestMapping("/userInfo")
    public String toZhanFauserInfo(){


        return "userInfo";
    }
    //转发UserRegistration.jsp
    @RequestMapping("/UserRegistration")
    public String toZhanFaUserRegistration(){


        return "UserRegistration";
    }
    //转发ViewLogistics.jsp
    @RequestMapping("/ViewLogistics")
    public String toZhanFaViewLogistics(){


        return "ViewLogistics";
    }
    /**
     * @deprecated 完善个人信息 address
     * 2019.8.19
     *
     *
     * */
    @RequestMapping("/address")
    @ResponseBody
    public ResponseResult<Address>getUserInfo(){
        ResponseResult<Address> rr=new ResponseResult<>();



        return  rr;

    }










    //转发向到userinfo.jsp
    @RequestMapping("/startShop")
    public  String doDirectIndx(){
        return "userInfo";
    }

    //验证码图片展示
    @GetMapping("/past/img")
    public String image() {
        return "verify_code";
    }


    //获取验证码图片并显示在页面上
    @RequestMapping(value="/past/image",method= RequestMethod.GET)
    public void authImage(HttpServletResponse response,HttpSession session) throws IOException {



        System.out.println("来到了改变验证码图片的方法");
        response.setHeader("Pragma", "No-cache");
        response.setHeader("Cache-Control", "no-cache");
        response.setDateHeader("Expires", 0);
        response.setContentType("image/jpeg");
        // 生成随机字串
        String verifyCode = VerifyCodeUtils.generateVerifyCode(4);
        session.removeAttribute("verCode");
        session.removeAttribute("codeTime");

        session.setAttribute("verCode", verifyCode.toLowerCase());
        session.setAttribute("codeTime", LocalDateTime.now());

        // 生成图片
        int w = 100, h = 30;
        OutputStream out = response.getOutputStream();
        VerifyCodeUtils.outputImage(w, h, out, verifyCode);

    }



    //验证验证码
    @RequestMapping(value = "/past/valid",method = RequestMethod.POST)
    @ResponseBody
    public Wrapper validImage(HttpServletRequest request, String code, @SessionAttribute("verCode") Object verCode,HttpSession session){
        System.out.println("来了Valid******************");
        System.out.println(verCode+"                 "+code);
        if (null == verCode) {
            request.setAttribute("error", "验证码已失效，请重新输入");
            return WrapMapper.wrap(Wrapper.ERROR_CODE,"验证码已失效，请重新输入");
        }
        String verCodeStr = verCode.toString();
        LocalDateTime localDateTime = (LocalDateTime)session.getAttribute("codeTime");

        long past = localDateTime.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
        long now = LocalDateTime.now().atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();

        if(verCodeStr == null || code == null || code.isEmpty() || !verCodeStr.equalsIgnoreCase(code)){

            request.setAttribute("error", "验证码错误");
            return WrapMapper.wrap(Wrapper.ERROR_CODE,"验证码错误");

        } else if((now-past)/1000/60>2){//两分钟
            request.setAttribute("error", "验证码已过期，重新获取");
            return WrapMapper.wrap(Wrapper.ERROR_CODE,"验证码已过期，重新获取");
        } else {
            //验证成功，删除存储的验证码
            session.removeAttribute("verCode");
            return WrapMapper.ok();
        }
    }


    //异步处理用户名重复提示
    @RequestMapping(value = "/past/checkName",method = RequestMethod.POST)
    @ResponseBody
    public ResponseResult<Void> checkUserLoginName(String userName){
        ResponseResult<Void> rr=new ResponseResult<Void>();
        if (customerService.isCheckUserLoginName(userName)){
            rr.setState(0);
            rr.setMessage("用户名重复,请重新填写!");

        }else {
            rr.setState(1);
            rr.setMessage("用户名可以使用");

        }





        return rr;
    }



    //处理用户上传的注册信息
    //注册成功后，先登录 然后完善个人信息包括用户名，昵称，。。。。
    @RequestMapping(value = "/past/userRegAction")
    public String UserRegistrationAction(String LoginName,String PassWord){
        Customer customer=new Customer();
        customer.setLoginName(LoginName);
        customer.setPassWord(PassWord);
        customer.setModifiedTime(new Date());
        customer.setUserStats(1);
        customer.setUserStyle(1);
        try {
            customerService.insertCustomer(customer);
            return "SignIn";
        }
        catch (Exception e){

            System.out.println(e.getStackTrace());
            return "UserRegistration";
        }


    }


    /**
     * @deprecated 处理登录的请求
     * 登录成功显示主页
     * 否侧还在登录页面并显示原因
     * 2019.8.14
     *
     * */
    @RequestMapping(value = "/toSinInAction")
    public String UserSignInAction(String LoginName, String PassWord, HttpSession session){


     try {
           Customer customer= customerService.toSignIn(LoginName,PassWord);
           session.setAttribute("customer",customer);

           return "index";
       }
       catch (Exception e){
           System.out.println(e.getMessage());
           session.setAttribute("topMeg",e.getMessage());
           return "SignIn";
       }

          }

    /**
     * @deprecated
     * 退出登录功能实现
     * 2019.8.15
     * 找到对应的用户删除他
     *
     * */
    @RequestMapping("past/exit")
    public String userExitAction(HttpSession session){
        session.invalidate();

        return "redirect:index";

    }
    /**
     * @deprecated
     * 完善个人信息并提交
     *
     * */
    @RequestMapping("/toUpDateAction")
    public String userInfoAction(ModelMap modelMap, String customer_id, String school_name, String customer_name, String identity_card_type
    , String identity_card_no, String gender, String customer_email, String weixin, String mobile_phone, String province,
                                 String city, String district, String address
    ){


        //个人信息修改
        Customer_info Customer_info=new Customer_info();


        //个人信息的地址省县区
        Customer_addr customer_addr=new Customer_addr();




        Customer_info.setCustomer_id(Integer.parseInt(customer_id));
        Customer_info.setSchool_name(school_name);
        Customer_info.setCustomer_name(customer_name);
        Customer_info.setIdentity_card_type(0);
        Customer_info.setIdentity_card_no(identity_card_no);
        Customer_info.setMobile_phone(Integer.parseInt(mobile_phone));
        Customer_info.setCustomer_email(customer_email);
        Customer_info.setGender(gender);
        Customer_info.setUser_point(0);
        Customer_info.setRegister_time(new Timestamp(new Date().getTime()));
        Customer_info.setWeixin(weixin);
        Customer_info.setCustomer_level(1);
        Customer_info.setUser_money(new BigDecimal(0.00));
        Customer_info.setModified_time(new Timestamp(new Date().getTime()));

        customer_addr.setAddress(address);
        customer_addr.setCity(Integer.parseInt(city));
        customer_addr.setCustomer_id(Integer.parseInt(customer_id));
        customer_addr.setDistrict(Integer.parseInt(district));
        customer_addr.setIs_default(1);
        customer_addr.setZip(4500);
        customer_addr.setProvince(Integer.parseInt(province));
        customer_addr.setModified_time(new Timestamp(new Date().getTime()));



        try {
            customerService.InsertCustomerIfo(Customer_info,customer_addr);
        }
        catch (Exception e){
            System.out.println(e.getMessage());

            modelMap.addAttribute("meg",e.getMessage());
            return  "userInfo";

        }









        return "index";
    }

}
