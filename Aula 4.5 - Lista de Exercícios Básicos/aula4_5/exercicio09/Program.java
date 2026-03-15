package aula4_5.exercicio09;
import aula4_5.exercicio09.entities.Celular;

public class Program {
    public static void main(String[] args){
        Celular cl = new Celular("Samsumg", "A20", "Tela inicial", 50);
        System.out.println(cl.toString());
        cl.descarregar(21);
        cl.mudarViewAtual("YouTube");

        System.out.println(cl.toString());
    } 
}