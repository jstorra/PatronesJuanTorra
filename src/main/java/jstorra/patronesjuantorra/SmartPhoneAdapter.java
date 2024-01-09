package jstorra.patronesjuantorra;

public class SmartPhoneAdapter extends DispositivoManipulacionTV{
    private SmartPhone smartPhone;
    
    public SmartPhoneAdapter() {
        this.smartPhone = new SmartPhone();
    }
    
    @Override
    void encender() {
        System.out.println("ENCENDIENDO SMARTPHONE");
        smartPhone.iniciarAplicacion();
        smartPhone.escanearDispositivosEnLaRed();
        smartPhone.seleccionarDispositivo();
        smartPhone.iniciarDispositivo();
    }

    @Override
    void apagar() {
        System.out.println("\nAPAGANDO SMARTPHONE");
        smartPhone.iniciarAplicacion();
        smartPhone.escanearDispositivosEnLaRed();
        smartPhone.seleccionarDispositivo();
        smartPhone.detenerDispositivo();
    }

    @Override
    void manipularVolumen() {
        System.out.println("\nMANIPULANDO VOLUMEN DEL SMARTPHONE");
        smartPhone.iniciarAplicacion();
        smartPhone.escanearDispositivosEnLaRed();
        smartPhone.seleccionarDispositivo();
        smartPhone.manipularVolumen();
    }

    @Override
    void cambiarEntrada() {
        System.out.println("\nCAMBIANDO ENTRADA DEL SMARTPHONE");
        smartPhone.iniciarAplicacion();
        smartPhone.escanearDispositivosEnLaRed();
        smartPhone.seleccionarDispositivo();
        smartPhone.cambiarEntrada();
    }
    
}
