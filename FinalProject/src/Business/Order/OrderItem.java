/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Order;

import Business.Product.Product;
import Business.Sensors.RFID;

/**
 *
 * @author user
 */
public class OrderItem {
    private Product product;
    private int quantity;
    private int salesPrice;
    private RFID rfid;

    public RFID getRfid() {
        return rfid;
    }

    public void setRfid(RFID rfid) {
        this.rfid = rfid;
    }  

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
    
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getSalesPrice() {
        return salesPrice;
    }

    public void setSalesPrice(int salesPrice) {
        this.salesPrice = salesPrice;
    }   
    
}