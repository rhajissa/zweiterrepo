import java.util.HashMap;

public class AssoziativesArray {
    public static void main(String[] args) {
        // Erstelle eine HashMap
        HashMap<String, Integer> ages = new HashMap<>();

        // Daten in der HashMap speichern
        ages.put("Fowler", 30);
        ages.put("Anna", 25);
        ages.put("John", 40);

        // Wert anhand des Schlüssels abrufen
        System.out.println("Fowlers Alter: " + ages.get("Fowler"));  // Ausgabe: 30

        // Überprüfen, ob ein Schlüssel existiert
        if (ages.containsKey("Anna")) {
            System.out.println("Annas Alter: " + ages.get("Anna"));  // Ausgabe: 25
        }

        // Durch die HashMap iterieren
        for (String key : ages.keySet()) {
            System.out.println(key + " ist " + ages.get(key) + " Jahre alt.");
        }

        // Elemente aus der HashMap entfernen
        ages.remove("John");

        // Größe der HashMap
        System.out.println("Anzahl der Einträge: " + ages.size());  // Ausgabe: 2
    }
}