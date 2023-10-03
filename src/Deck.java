import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Deck {
    //Lista de tipo Card que contiene las cartas a crear
    static ArrayList<Card> deck = new ArrayList<>();

    //Valores para crear las cartas
    static String[] palo = {"tréboles","corazones","picas","diamantes"};
    static String[] valor = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};

    public static void main(String[] args) {
        //Inicializar 52 cartas
        for(int i=0; i < palo.length; i++){
            for(int j=0; j < valor.length; j++){
                if (palo[i] == "tréboles" || palo[i] == "picas") {
                    deck.add(new Card(palo[i],"negro",valor[j]));
                } else {
                    deck.add(new Card(palo[i],"rojo",valor[j]));
                }
            }
        }
        //Imprime el Deck
        for (Card card : deck) {
            System.out.println(card);
        }

        //Llamar métodos
        shuffle();
        head();
        pick();
        hand();
    }
    //Mezclar el deck
    public static void shuffle(){
        Collections.shuffle(deck);
        System.out.println("Se mezcló el Deck.\n");
    }
    //Mostrar primera carta y la remueve
    public static void head(){
        System.out.println(deck.get(0));
        deck.remove(0);
        System.out.println("Quedan " + deck.size() + " cartas.\n");
    }
    //Selecciona carta al azar y la remueve
    public static void pick(){
        Random random = new Random();
        int index = random.nextInt(deck.size());
        System.out.println(deck.get(index));
        deck.remove(index);
        System.out.println("Quedan " + deck.size() + " cartas.\n");
    }
    //Mostrar arreglo de 5 cartas y removerlas
    public static void hand(){
        for(int i=4; i>=0; i--){
            System.out.println(deck.get(i));
            deck.remove(i);
        }
        System.out.println("Quedan " + deck.size() + " cartas.\n");
    }
}