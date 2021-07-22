/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import entities.Product;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

import util.UpperCaseName;

/**
 *
 * @author rafae
 */
public class Program {
    public static void main(String[] args){
        
        Locale.setDefault(Locale.US);
        
        List<Product> list = new ArrayList<>();
        
        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));
        //EXPRESSÃO LAMBDA INLINE
        
        List<String> names = list.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList());
        
        names.forEach(System.out::println);
        
        
        
        /*EXPRESSÃO LAMDA DECLARADA
        Function<Product, String> func = p -> p.getName().toUpperCase();
        List<String> names = list.stream().map(func).collect(Collectors.toList());
        
        names.forEach(System.out::println);
        */
        
        /*REFERENCE METHOD COM MÉTODO NÃO ESTÁTICO
        List<String> names = list.stream().map(Product::nonStaticUpperCaseName).collect(Collectors.toList());
        
        names.forEach(System.out::println);
        */
        
        /*REFERENCE METHOD COM MÉTODO ESTÁTICO
        List<String> names = list.stream().map(Product::staticUpperCaseName).collect(Collectors.toList());
        
        names.forEach(System.out::println);
        */
        
         /*IMPLEMENTAÇÃO DA INTERFACE
        List<String> names = list.stream().map(new UpperCaseName()).collect(Collectors.toList());
        
        names.forEach(System.out::println);
*/
    
}
}

