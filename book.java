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
public class book extends product {
    private  double price ;

    public book() {
    }
   
    public book(double price)
    {
      this.price=price;
    }
    @Override
     double price() {
  return price*.5;
    }
    
    
}
