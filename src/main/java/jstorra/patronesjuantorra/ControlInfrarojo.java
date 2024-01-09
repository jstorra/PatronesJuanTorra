package jstorra.patronesjuantorra;

public class ControlInfrarojo extends DispositivoManipulacionTV{

    @Override
    void encender() {
        System.out.println("Encendiendo control infrarojo...");
    }

    @Override
    void apagar() {
        System.out.println("Apagando control infra rojo");
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
