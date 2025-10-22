/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apariciomolina_20102025;

public class pila {
    
    private int[] elementos;
    private int cima;
    private int capacidad;

    public pila(int tamano){
        this.capacidad = tamano;
        this.elementos = new int[this.capacidad];
        this.cima = -1;
    }

    public boolean estaVacia(){
        return this.cima == -1;
    }

    public boolean estaLlena(){
        return this.cima == (this.capacidad - 1);
    }

    public int tamano(){
        return this.cima + 1;
    }

    public void push(int valor){
        if (estaLlena()){
            System.out.println("La pila está llena, no puede agregar el valor: " + valor);
        } else {
            this.cima++;
            this.elementos[this.cima] = valor;
            System.out.println("El valor " + valor + " fue agregado a la pila");
        }
    }

    public int pop(){
        if (estaVacia()){
            System.out.println("La pila está vacía, no se puede extraer un elemento");
            return -1;
        } else {
            int elementoExtraido = this.elementos[this.cima];
            this.cima--;
            return elementoExtraido;
        }
    }

    public int peek(){
        if (estaVacia()){
            System.out.println("La pila está vacia");
            return -1;
        } else {
            return this.elementos[this.cima];
        }
    }

    public void mostrar(){
        if (estaVacia()){
            System.out.println("La pila esta vacia.");
        } else {
            System.out.print("Contenido de la pila (de cima a base): [");
            for (int i = this.cima; i >= 0; i--) {
                System.out.print(this.elementos[i]);
                if (i > 0) System.out.print(", ");
            }
            System.out.println("]");
        }
    }
}
