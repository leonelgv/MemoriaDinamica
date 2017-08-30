import java.util.ArrayList;

public class MemoriaDinamica {
    private String[] elementos = new String[6];
    private ArrayList<String> lista = new ArrayList<String>();

    public void usoMemoria() {
        elementos[0]="Jaime";
        elementos[1]="Alejandro";
        elementos[2]="Vannesa";
        elementos[3]="Ivan";
        elementos[4]="Luis Fernando";
        elementos[5]="Luis David";
        //System.out.println("El Array contiene: "+ elementos.length);
        for(int a=0;a<elementos.length;a++){
            //System.out.println((a + 1) + " " + elementos[a]);
        }


        lista.add("Acuña Dominguez Jaime");
        lista.add("Aguirre Soto Alejandro");
        lista.add("Albarran Santos Vanessa");
        lista.add("Alejo Diaz Ivan");
        lista.add("Araujo Luviano Luis Fernando");
        lista.add("Arenas Santana Luis David");
        lista.add("Arias Cedillo Arcelia");
        lista.add("Bahena Trujillo Kevin");

        System.out.println("El ArrayList contiene: " + lista.size());

        for(int i=0;i<lista.size();i++){
            System.out.println((i+1) + " " + lista.get(i));
        }

        lista.remove(0);
        System.out.println("Elemento de la lista eliminado " + 0);
        for(int i=0;i<lista.size();i++){
            System.out.println((i+1) + " " + lista.get(i));
        }

        lista.set(0,"AGUIRRE SOTO ALEJANDRO");

        System.out.println("Actualización de la lista");
        for(int i=0;i<lista.size();i++){
            System.out.println((i+1) + " " + lista.get(i));
        }
        lista.clear();
        System.out.println("¿La lista está vacia? " + lista.isEmpty());
    }
}
