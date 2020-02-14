package com.zhangjiabao.zhangjiabao.all.bean;

import java.util.Objects;

public class Order_master {
    /*order_id	int	10	0	0	0	-1	0				订单ID					0	0	0	0	-1	-1	0
order_sn	bigint	20	0	0	0	0	0				订单编号 yyyymmddnnnnnnnn					0	0	0	0	0	-1	0
customer_id	int	10	0	0	0	0	0				下单人ID					0	0	0	0	0	-1	0
shipping_user	varchar	10	0	0	0	0	0				收货人姓名			utf8	utf8_general_ci	0	0	0	0	0	0	0
province	smallint	6	0	0	0	0	0				省					0	0	0	0	0	0	0
city	smallint	6	0	0	0	0	0				市					0	0	0	0	0	0	0
district	smallint	6	0	0	0	0	0				区					0	0	0	0	0	0	0
address	varchar	100	0	0	0	0	0				地址			utf8	utf8_general_ci	0	0	0	0	0	0	0
payment_method	tinyint	4	0	0	0	0	0				支付方式：1现金，2余额，3网银，4支付宝，5微信					0	0	0	0	0	0	0
order_money	decimal	8	2	0	0	0	0				订单金额					0	0	0	0	0	0	0
district_money	decimal	8	2	0	0	0	0			0.00	优惠金额					0	0	0	0	0	0	0
shipping_money	decimal	8	2	0	0	0	0			0.00	运费金额					0	0	0	0	0	0	0
payment_money	decimal	8	2	0	0	0	0			0.00	支付金额					0	0	0	0	0	0	0
shipping_comp_name	varchar	10	0	-1	0	0	0				快递公司名称			utf8	utf8_general_ci	0	0	0	0	0	0	0
shipping_sn	varchar	50	0	-1	0	0	0				快递单号			utf8	utf8_general_ci	0	0	0	0	0	0	0
create_time	varchar	50	0	0	0	0	0			CURRENT_TIMESTAMP	下单时间			utf8	utf8_general_ci	0	0	0	0	0	0	0
shipping_time	varchar	50	0	-1	0	0	0				发货时间			utf8	utf8_general_ci	0	0	0	0	0	0	0
pay_time	varchar	50	0	-1	0	0	0				支付时间			utf8	utf8_general_ci	0	0	0	0	0	0	0
receive_time	varchar	50	0	-1	0	0	0				收货时间			utf8	utf8_general_ci	0	0	0	0	0	0	0
order_status	tinyint	4	0	0	0	0	0			0	订单状态					0	0	0	0	0	0	0
order_point	int	10	0	0	0	0	0			0	订单积分					0	0	0	0	0	-1	0
invoice_time	varchar	100	0	-1	0	0	0				发票抬头			utf8	utf8_general_ci	0	0	0	0	0	0	0
modified_time	varchar	50	0	0	0	0	0			CURRENT_TIMESTAMP	最后修改时间			utf8	utf8_general_ci	0	0	-1	0	0	0	0
*/

    //订单详情表ID
    private int order_id;
    //订单详情表ID
    private int order_sn;
    //订单详情表ID
    private int customer_id;
    //订单详情表ID
    private String shipping_user;
    //订单详情表ID
    private int province;
    //订单详情表ID
    private int city;
    //订单详情表ID
    private int district;
    //订单详情表ID
    private int address;
    //订单详情表ID
    private int payment_method;
    //订单详情表ID
    private double order_money;
    //订单详情表ID
    private double district_money;
    //订单详情表ID
    private double shipping_money;
    //订单详情表ID
    private double payment_money;
    //订单详情表ID
    private String shipping_comp_name;
    //订单详情表ID
    private String shipping_sn;
    //订单详情表ID
    private String create_time;
    //订单详情表ID
    private String shipping_time;
    //订单详情表ID
    private String pay_time;
    //订单详情表ID
    private String receive_time;
    //订单详情表ID
    private int order_status;
    //订单详情表ID
    private int order_point;
    //订单详情表ID
    private String invoice_time;
    //订单详情表ID
    private String modified_time;

    @Override
    public String toString() {
        return "Order_master{" +
                "order_id=" + order_id +
                ", order_sn=" + order_sn +
                ", customer_id=" + customer_id +
                ", shipping_user='" + shipping_user + '\'' +
                ", province=" + province +
                ", city=" + city +
                ", district=" + district +
                ", address=" + address +
                ", payment_method=" + payment_method +
                ", order_money=" + order_money +
                ", district_money=" + district_money +
                ", shipping_money=" + shipping_money +
                ", payment_money=" + payment_money +
                ", shipping_comp_name='" + shipping_comp_name + '\'' +
                ", shipping_sn='" + shipping_sn + '\'' +
                ", create_time='" + create_time + '\'' +
                ", shipping_time='" + shipping_time + '\'' +
                ", pay_time='" + pay_time + '\'' +
                ", receive_time='" + receive_time + '\'' +
                ", order_status=" + order_status +
                ", order_point=" + order_point +
                ", invoice_time='" + invoice_time + '\'' +
                ", modified_time='" + modified_time + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order_master that = (Order_master) o;
        return order_id == that.order_id &&
                order_sn == that.order_sn &&
                customer_id == that.customer_id &&
                province == that.province &&
                city == that.city &&
                district == that.district &&
                address == that.address &&
                payment_method == that.payment_method &&
                Double.compare(that.order_money, order_money) == 0 &&
                Double.compare(that.district_money, district_money) == 0 &&
                Double.compare(that.shipping_money, shipping_money) == 0 &&
                Double.compare(that.payment_money, payment_money) == 0 &&
                order_status == that.order_status &&
                order_point == that.order_point &&
                Objects.equals(shipping_user, that.shipping_user) &&
                Objects.equals(shipping_comp_name, that.shipping_comp_name) &&
                Objects.equals(shipping_sn, that.shipping_sn) &&
                Objects.equals(create_time, that.create_time) &&
                Objects.equals(shipping_time, that.shipping_time) &&
                Objects.equals(pay_time, that.pay_time) &&
                Objects.equals(receive_time, that.receive_time) &&
                Objects.equals(invoice_time, that.invoice_time) &&
                Objects.equals(modified_time, that.modified_time);
    }

    @Override
    public int hashCode() {
        return Objects.hash(order_id, order_sn, customer_id, shipping_user, province, city, district, address, payment_method, order_money, district_money, shipping_money, payment_money, shipping_comp_name, shipping_sn, create_time, shipping_time, pay_time, receive_time, order_status, order_point, invoice_time, modified_time);
    }

    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public int getOrder_sn() {
        return order_sn;
    }

    public void setOrder_sn(int order_sn) {
        this.order_sn = order_sn;
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public String getShipping_user() {
        return shipping_user;
    }

    public void setShipping_user(String shipping_user) {
        this.shipping_user = shipping_user;
    }

    public int getProvince() {
        return province;
    }

    public void setProvince(int province) {
        this.province = province;
    }

    public int getCity() {
        return city;
    }

    public void setCity(int city) {
        this.city = city;
    }

    public int getDistrict() {
        return district;
    }

    public void setDistrict(int district) {
        this.district = district;
    }

    public int getAddress() {
        return address;
    }

    public void setAddress(int address) {
        this.address = address;
    }

    public int getPayment_method() {
        return payment_method;
    }

    public void setPayment_method(int payment_method) {
        this.payment_method = payment_method;
    }

    public double getOrder_money() {
        return order_money;
    }

    public void setOrder_money(double order_money) {
        this.order_money = order_money;
    }

    public double getDistrict_money() {
        return district_money;
    }

    public void setDistrict_money(double district_money) {
        this.district_money = district_money;
    }

    public double getShipping_money() {
        return shipping_money;
    }

    public void setShipping_money(double shipping_money) {
        this.shipping_money = shipping_money;
    }

    public double getPayment_money() {
        return payment_money;
    }

    public void setPayment_money(double payment_money) {
        this.payment_money = payment_money;
    }

    public String getShipping_comp_name() {
        return shipping_comp_name;
    }

    public void setShipping_comp_name(String shipping_comp_name) {
        this.shipping_comp_name = shipping_comp_name;
    }

    public String getShipping_sn() {
        return shipping_sn;
    }

    public void setShipping_sn(String shipping_sn) {
        this.shipping_sn = shipping_sn;
    }

    public String getCreate_time() {
        return create_time;
    }

    public void setCreate_time(String create_time) {
        this.create_time = create_time;
    }

    public String getShipping_time() {
        return shipping_time;
    }

    public void setShipping_time(String shipping_time) {
        this.shipping_time = shipping_time;
    }

    public String getPay_time() {
        return pay_time;
    }

    public void setPay_time(String pay_time) {
        this.pay_time = pay_time;
    }

    public String getReceive_time() {
        return receive_time;
    }

    public void setReceive_time(String receive_time) {
        this.receive_time = receive_time;
    }

    public int getOrder_status() {
        return order_status;
    }

    public void setOrder_status(int order_status) {
        this.order_status = order_status;
    }

    public int getOrder_point() {
        return order_point;
    }

    public void setOrder_point(int order_point) {
        this.order_point = order_point;
    }

    public String getInvoice_time() {
        return invoice_time;
    }

    public void setInvoice_time(String invoice_time) {
        this.invoice_time = invoice_time;
    }

    public String getModified_time() {
        return modified_time;
    }

    public void setModified_time(String modified_time) {
        this.modified_time = modified_time;
    }
}
