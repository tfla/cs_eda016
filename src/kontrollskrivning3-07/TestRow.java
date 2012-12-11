public class TestRow {
    public static void main(String[] args) {
        Row row = new Row(5);
        row.addAttributeValue(3);
        row.addAttributeValue(7);
        row.addAttributeValue(2);
        row.addAttributeValue(13);
        row.addAttributeValue(41);
        row.print(); // Utskrift 3, 7, 2, 13, 41

        int[] positions = {3, 0, 1};
        Row copy = row.selectiveCopy(positions);
        copy.print(); // Utskrift 13, 3, 7
    }
}
