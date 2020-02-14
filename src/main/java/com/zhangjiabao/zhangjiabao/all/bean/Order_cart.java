package com.zhangjiabao.zhangjiabao.all.bean;

import java.util.Objects;

public class Order_cart {
    /*cart_id	int	10	0	0	0	-1	0				购物车ID					0	0	0	0	-1	-1	0
customer_id	int	10	0	0	0	0	0				用户ID					0	0	0	0	0	-1	0
product_id	int	10	0	0	0	0	0				商品ID					0	0	0	0	0	-1	0
product_amount	int	11	0	0	0	0	0				加入购物车商品数量					0	0	0	0	0	0	0
price	decimal	8	2	0	0	0	0				商品价格					0	0	0	0	0	0	0
add_time	varchar	50	0	0	0	0	0			CURRENT_TIMESTAMP	加入购物车时间			utf8	utf8_general_ci	0	0	0	0	0	0	0
modified_time	varchar	50	0	0	0	0	0			CURRENT_TIMESTAMP	最后修改时间			utf8	utf8_general_ci	0	0	-1	0	0	0	0
*/

    //购物车ID
    private Integer customer_inf_id;
    //用户ID
    private Integer customer_id;
    //商品ID
    private Integer product_id;
    //加入购物车商品数量
    private Integer product_amount;
    //商品价格
    private double price;
    //加入购物车时间
    private String add_time;
    //最后修改时间
    private String modified_time;

    @Override
    public String toString() {
        return "Order_cart{" +
                "customer_inf_id=" + customer_inf_id +
                ", customer_id=" + customer_id +
                ", product_id=" + product_id +
                ", product_amount=" + product_amount +
                ", price=" + price +
                ", add_time='" + add_time + '\'' +
                ", modified_time='" + modified_time + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order_cart that = (Order_cart) o;
        return Double.compare(that.price, price) == 0 &&
                Objects.equals(customer_inf_id, that.customer_inf_id) &&
                Objects.equals(customer_id, that.customer_id) &&
                Objects.equals(product_id, that.product_id) &&
                Objects.equals(product_amount, that.product_amount) &&
                Objects.equals(add_time, that.add_time) &&
                Objects.equals(modified_time, that.modified_time);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customer_inf_id, customer_id, product_id, product_amount, price, add_time, modified_time);
    }

    public Integer getCustomer_inf_id() {
        return customer_inf_id;
    }

    public void setCustomer_inf_id(Integer customer_inf_id) {
        this.customer_inf_id = customer_inf_id;
    }

    public Integer getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(Integer customer_id) {
        this.customer_id = customer_id;
    }

    public Integer getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Integer product_id) {
        this.product_id = product_id;
    }

    public Integer getProduct_amount() {
        return product_amount;
    }

    public void setProduct_amount(Integer product_amount) {
        this.product_amount = product_amount;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAdd_time() {
        return add_time;
    }

    public void setAdd_time(String add_time) {
        this.add_time = add_time;
    }

    public String getModified_time() {
        return modified_time;
    }

    public void setModified_time(String modified_time) {
        this.modified_time = modified_time;
    }
}
