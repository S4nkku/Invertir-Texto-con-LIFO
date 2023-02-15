
package com.mycompany.ejercicio_2;

/**
 *
 * @author david
 */
public class Invertir {
    
    char caracteres[];
    int numElementos;
    int top;
    
    
    public Invertir(int longitud){
        
        this.numElementos = longitud;
        this.top = -1;
        this.caracteres = new char[longitud];
    }
           
    public boolean push (char caracter){
    
            boolean isInsertado = false;
            
            if(this.top < this.numElementos-1){
                this.top = this.top +1;
                this.caracteres[this.top] = caracter;
                isInsertado = true;
            }
            
            return isInsertado;
}
            
            public char pop (){
                
                char caracter = Character.MIN_VALUE;
                
                if(this.top>=0){
                caracter = this.caracteres[this.top];
                this.caracteres [this.top] = Character.MIN_VALUE;
                this.top = this.top -1;
                
            }

                return caracter;

            }
           
          public char peek (){
              
              char caracter = Character.MIN_VALUE;
              
              if (this.top >= 0){
                  caracter = this.caracteres[this.top];
              }
               return caracter;   
          }  
          
          public boolean estaLlena (){
              
              boolean lleno = false;
              
              if(this.top > this.numElementos-1){
                  lleno = true;
                  
              }
              
              return lleno;  
              
          }
          
          
          public boolean estaVacio (){
              
            boolean empty = false;
            
            
            if(this.top < 0){
                empty = true;
                
            }
              return empty;
          }
          
          
          
          
          
          
          
          
          
          
          
          
          
          
}
            
            
            
            
            



