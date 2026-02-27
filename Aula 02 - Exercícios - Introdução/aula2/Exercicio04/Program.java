package Exercicio04;
import Exercicio04.entities.TVController;

public class Program {

    public static void main(String[] args) {
        TVController controller = new TVController();
        controller.setChannel(38);
        controller.setVolume(67);

        controller.print();

        controller.increaseVolume(80);
        controller.setChannel(123);

        controller.print();

        controller.decreaseVolume(68);
        controller.setChannel(-17);

        controller.print();
    }   
}
