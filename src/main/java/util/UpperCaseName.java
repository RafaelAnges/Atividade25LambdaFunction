/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import entities.Product;
import java.util.function.Function;

/**
 *
 * @author rafae
 */
public class UpperCaseName implements Function<Product, String> {
//IMPLEMENTAÇÃO DA INTERFACE
    @Override
    public String apply(Product p) {
        return p.getName().toUpperCase();
    }
    
}
