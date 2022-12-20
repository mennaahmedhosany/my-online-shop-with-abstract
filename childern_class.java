/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myonlineshop;

/**
 *
 * @author ORIGINAL
 */
public class childern_class extends book {
    double price;

    public childern_class() {
    }

    public childern_class(double price) {
        super(price);
        this.price=price;
    }

    @Override
    double price() {
        return .3* price;
    }
    
}
