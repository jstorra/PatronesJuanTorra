package jstorra.patronesjuantorra;

public class PanelTV extends DispositivoManipulacionTV {

    @Override
    void encender() {
        System.out.println("Encendiendo TV...");
    }

    @Override
    void apagar() {
        System.out.println("Apagando TV...");
    }

    @Override
    void manipularVolumen() {
        System.out.println("Manipulando volumen...");
    }

    @Override
    void cambiarEntrada() {
        System.out.println("Cambiando entrada...");
    }
    
}
