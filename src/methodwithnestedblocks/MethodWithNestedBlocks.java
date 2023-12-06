/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methodwithnestedblocks;

/**
 *
 * @author Maria
 */
public class MethodWithNestedBlocks {

    
    public static void main(String[] args) {
       methodWithNestedBlocks();
    }
    public static void methodWithNestedBlocks()
       {
           int aNumber = 10;
           
           System.out.println("In outer block, aNumber is " + aNumber);
           {
               int anotherNumber = 512;
               System.out.println("In inner block, aNumber is " + aNumber +
                       " and another number is " + anotherNumber);
           }
           System.out.println("In outer block, aNumber is " + aNumber);
       }     
    
    
}
