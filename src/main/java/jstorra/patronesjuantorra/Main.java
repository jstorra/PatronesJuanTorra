package jstorra.patronesjuantorra;

public class Main {

    public static void main(String[] args) {
        SmartPhoneAdapter adapter = new SmartPhoneAdapter();
        adapter.encender();
        adapter.manipularVolumen();
        adapter.cambiarEntrada();
        adapter.apagar();
    }
}
