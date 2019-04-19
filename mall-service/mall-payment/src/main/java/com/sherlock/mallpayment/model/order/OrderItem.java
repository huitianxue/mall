package com.sherlock.mallpayment.model.order;

import java.util.Date;

public class OrderItem {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_item.id
     *
     * @mbggenerated Fri Apr 19 10:11:31 CST 2019
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_item.order_id
     *
     * @mbggenerated Fri Apr 19 10:11:31 CST 2019
     */
    private String orderId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_item.goods_id
     *
     * @mbggenerated Fri Apr 19 10:11:31 CST 2019
     */
    private String goodsId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_item.price
     *
     * @mbggenerated Fri Apr 19 10:11:31 CST 2019
     */
    private Integer price;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_item.status
     *
     * @mbggenerated Fri Apr 19 10:11:31 CST 2019
     */
    private String status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_item.gmt_create
     *
     * @mbggenerated Fri Apr 19 10:11:31 CST 2019
     */
    private Date gmtCreate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_item.gmt_modified
     *
     * @mbggenerated Fri Apr 19 10:11:31 CST 2019
     */
    private Date gmtModified;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_item.id
     *
     * @return the value of order_item.id
     *
     * @mbggenerated Fri Apr 19 10:11:31 CST 2019
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_item.id
     *
     * @param id the value for order_item.id
     *
     * @mbggenerated Fri Apr 19 10:11:31 CST 2019
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_item.order_id
     *
     * @return the value of order_item.order_id
     *
     * @mbggenerated Fri Apr 19 10:11:31 CST 2019
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_item.order_id
     *
     * @param orderId the value for order_item.order_id
     *
     * @mbggenerated Fri Apr 19 10:11:31 CST 2019
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_item.goods_id
     *
     * @return the value of order_item.goods_id
     *
     * @mbggenerated Fri Apr 19 10:11:31 CST 2019
     */
    public String getGoodsId() {
        return goodsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_item.goods_id
     *
     * @param goodsId the value for order_item.goods_id
     *
     * @mbggenerated Fri Apr 19 10:11:31 CST 2019
     */
    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId == null ? null : goodsId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_item.price
     *
     * @return the value of order_item.price
     *
     * @mbggenerated Fri Apr 19 10:11:31 CST 2019
     */
    public Integer getPrice() {
        return price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_item.price
     *
     * @param price the value for order_item.price
     *
     * @mbggenerated Fri Apr 19 10:11:31 CST 2019
     */
    public void setPrice(Integer price) {
        this.price = price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_item.status
     *
     * @return the value of order_item.status
     *
     * @mbggenerated Fri Apr 19 10:11:31 CST 2019
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_item.status
     *
     * @param status the value for order_item.status
     *
     * @mbggenerated Fri Apr 19 10:11:31 CST 2019
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_item.gmt_create
     *
     * @return the value of order_item.gmt_create
     *
     * @mbggenerated Fri Apr 19 10:11:31 CST 2019
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_item.gmt_create
     *
     * @param gmtCreate the value for order_item.gmt_create
     *
     * @mbggenerated Fri Apr 19 10:11:31 CST 2019
     */
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_item.gmt_modified
     *
     * @return the value of order_item.gmt_modified
     *
     * @mbggenerated Fri Apr 19 10:11:31 CST 2019
     */
    public Date getGmtModified() {
        return gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_item.gmt_modified
     *
     * @param gmtModified the value for order_item.gmt_modified
     *
     * @mbggenerated Fri Apr 19 10:11:31 CST 2019
     */
    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }
}