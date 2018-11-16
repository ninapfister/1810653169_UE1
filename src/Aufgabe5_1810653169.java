public class Aufgabe5_1810653169
{
    public static void main (String []args)
    {
        int zahl1 = 10;
        int zahl2= 20;

        System.out.println(zahl1++);
        System.out.println(zahl2++);
        System.out.println(zahl1);
        System.out.println(zahl2);
        System.out.println(++zahl1);
        System.out.println(++zahl2);

        /* bei zahl1++ wird die Zahl erst bei der nächsten Ausgabe um eines erhöht
        bei ++zahl1 wird die Zahl sofort um 1 erhöht, hier um 2, da wir vorher schon plus 1 ausgegeben haben */
    }
}
