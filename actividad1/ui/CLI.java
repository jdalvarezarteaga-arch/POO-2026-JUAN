package edu.juan.arteaga.actividad1.ui;

public class SLI {
}


public class CLI {
    public static void start(){
        edu.juan.arteaga.actividad1.ui.Switch switch_wifi;
        switch_wifi = new edu.juan.arteaga.actividad1.ui.Switch();
        System.out.println("hola, bienvenido al programa");
        System.out.println("Estado inicial del switch: "+ (switch_wifi.isOn()));
        if(switch_wifi.isOn()) {
            System.out.println("desea apagar el switch");
        }else {
            System.out.println("desea prender el switch");
        }
        System.out.println("el swtich esta "+switch_wifi.isOn());
    }
}