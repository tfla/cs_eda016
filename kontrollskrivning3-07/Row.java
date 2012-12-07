public class Row {
    private int[] attributes;
    private int n;

    /** Skapar en rad med plats för nbrAttr attribut */
    public Row(int nbrAttr) {
        attributes = new int[nbrAttr];
        n = 0;
    }

    /** Lägger till ett nytt attributvärde value efter de värden som
        redan har lagts in */
    public void addAttributeValue(int value) {
        attributes[n] = value;
        n++;
    }

    /** Tar reda på värdet av attributet på plats pos */
    public int getAttributeValue(int pos) {
        return attributes[pos];
    }

    /** Skapar och returnerar en ny rad som innehåller kopior av
        attributen på plats positions[0], positions[1], ... */
    public Row selectiveCopy(int[] positions) {
        Row result = new Row(positions.length);
        for (int i = 0; i < positions.length; i++) { 
            result.addAttributeValue(attributes[positions[i]]);
        }
        return result;
    }

    /** Skriver ut raden (värdena i alla attributen åtskilda med
        blanktecken) */
    public void print() {
        for (int i = 0; i < attributes.length; i++) {
            System.out.print(attributes[i] + " ");
        }
        System.out.println();
    }
}
