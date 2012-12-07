import java.util.ArrayList;

public class Table {
    private String name;
    private ArrayList<String> attributeNames;
    private ArrayList<Row> rows;

    /** Skapar en tim tabell (inga attributnamn, inga rader) med 
        namnet name */
    public Table(String name) {
        this.name = name;
        attributeNames = new ArrayList<String>();
        rows = new ArrayList<Row>();
    }

    /** Tar reda på tabellens namn */
    public String getName() {
        return name;
    }

    /** Tar reda på antalet attribut i tabellens rader */
    public int getNbrAttributes() {
        return attributeNames.size();
    }

    /** Lägger till attributnamnet attributeName sist */
    public void addAttributeName(String attributeName) {
        attributeNames.add(attributeName);
    }

    /** Lägger till raden row sist */
    void addRow(Row row) {
        rows.add(row);
    }

    /** Skriver ut tabellen: först attributnamnen, sedan en rad med
        10 streck, sedan alla raderna */
    public void print() {
        for (int i = 0; i < attributeNames.size(); i++) {
            System.out.print(attributeNames.get(i) + " ");
        }
        System.out.println();
        System.out.println("----------");
        for (int i = 0; i < rows.size(); i++) {
            rows.get(i).print();
        }
    }
    
    /** Utför frågan "select <namnen i selectedAttributeName> from
        <denna tabell> where <checkedAttribute> = <checkedValue>"
        Returnerar en ny tabell med namnet Result som är svaret på
        frågan */
    public Table select(ArrayList<String> selectedAttributeNames,
                        String checkedAttribute, int checkedValue) {
        Table result = new Table("Result");
        for (int i = 0; i < selectedAttributeNames.size(); i++) {
            result.addAttributeName(selectedAttributeNames.get(i));
        }

        int checkPos = attributeNames.indexOf(checkedAttribute);

        int[] positions = new int[selectedAttributeNames.size()];
        for (int i = 0; i < positions.length; i++) {
            positions[i] = attributeNames.indexOf(selectedAttributeNames.get(i));
        }

        for (int i = 0; i < rows.size(); i++) {
            int value = rows.get(i).getAttributeValue(checkPos);
            if (value == checkedValue) {
                result.addRow(rows.get(i).selectiveCopy(positions));
            }
        }
        return result;
    }
}
