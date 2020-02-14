package com.zhangjiabao.zhangjiabao.all.bean;

import java.util.Objects;

public class Order_detail {
    /*order_detail_id	int	10	0	0	0	-1	0				订单详情表ID					0	0	0	0	-1	-1	0
order_id	int	10	0	0	0	0	0				订单表ID					0	0	0	0	0	-1	0
product_id	int	10	0	0	0	0	0				订单商品ID					0	0	0	0	0	-1	0
product_name	varchar	50	0	0	0	0	0				商品名称			utf8	utf8_general_ci	0	0	0	0	0	0	0
product_cnt	int	11	0	0	0	0	0			1	购买商品数量					0	0	0	0	0	0	0
product_price	decimal	8	2	0	0	0	0				购买商品单价					0	0	0	0	0	0	0
average_cost	decimal	8	2	0	0	0	0				平均成本价格					0	0	0	0	0	0	0
weight	float	0	0	-1	0	0	0				商品重量					0	0	0	0	0	0	0
fee_money	decimal	8	2	0	0	0	0			0.00	优惠分摊金额					0	0	0	0	0	0	0
w_id	int	10	0	0	0	0	0				仓库ID					0	0	0	0	0	-1	0
modified_time	varchar	50	0	0	0	0	0			CURRENT_TIMESTAMP	最后修改时间			utf8	utf8_general_ci	0	0	-1	0	0	0	0
*/

    //订单详情表ID
    private int order_detail_id;
    //订单表ID
    private int order_id;
    //订单商品ID
    private int product_id;
    //商品名称
    private String product_name;
    //购买商品数量
    private int product_cnt;
    //购买商品单价
    private double product_price;
    //平均成本价格
    private double average_cost;
    //商品重量
    private float weight;
    //优惠分摊金额
    private double fee_money;
    //仓库ID
    private Integer w_id;
    //最后修改时间
    private String modified_time;

    @Override
    public String toString() {
        return "Order_detail{" +
                "order_detail_id=" + order_detail_id +
                ", order_id=" + order_id +
                ", product_id=" + product_id +
                ", product_name='" + product_name + '\'' +
                ", product_cnt=" + product_cnt +
                ", product_price=" + product_price +
                ", average_cost=" + average_cost +
                ", weight=" + weight +
                ", fee_money=" + fee_money +
                ", w_id=" + w_id +
                ", modified_time='" + modified_time + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order_detail that = (Order_detail) o;
        return order_detail_id == that.order_detail_id &&
                order_id == that.order_id &&
                product_id == that.product_id &&
                product_cnt == that.product_cnt &&
                Double.compare(that.product_price, product_price) == 0 &&
                Double.compare(that.average_cost, average_cost) == 0 &&
                Float.compare(that.weight, weight) == 0 &&
                Double.compare(that.fee_money, fee_money) == 0 &&
                Objects.equals(product_name, that.product_name) &&
                Objects.equals(w_id, that.w_id) &&
                Objects.equals(modified_time, that.modified_time);
    }

    @Override
    public int hashCode() {
        return Objects.hash(order_detail_id, order_id, product_id, product_name, product_cnt, product_price, average_cost, weight, fee_money, w_id, modified_time);
    }

    public int getOrder_detail_id() {
        return order_detail_id;
    }

    public void setOrder_detail_id(int order_detail_id) {
        this.order_detail_id = order_detail_id;
    }

    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public int getProduct_cnt() {
        return product_cnt;
    }

    public void setProduct_cnt(int product_cnt) {
        this.product_cnt = product_cnt;
    }

    public double getProduct_price() {
        return product_price;
    }

    public void setProduct_price(double product_price) {
        this.product_price = product_price;
    }

    public double getAverage_cost() {
        return average_cost;
    }

    public void setAverage_cost(double average_cost) {
        this.average_cost = average_cost;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public double getFee_money() {
        return fee_money;
    }

    public void setFee_money(double fee_money) {
        this.fee_money = fee_money;
    }

    public Integer getW_id() {
        return w_id;
    }

    public void setW_id(Integer w_id) {
        this.w_id = w_id;
    }

    public String getModified_time() {
        return modified_time;
    }

    public void setModified_time(String modified_time) {
        this.modified_time = modified_time;
    }
}
