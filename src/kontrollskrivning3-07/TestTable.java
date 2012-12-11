public class TestTable {
    public static void main(String[] args) {
        Table tab = new Table("Tab");
        tab.addAttributeName("A");
        tab.addAttributeName("B");
        tab.addAttributeName("C");
        
        int nbrAttr = tab.getNbrAttributes();
        Row row = new Row(nbrAttr);
        row.addAttributeValue(3);
        row.addAttributeValue(7);
        row.addAttributeValue(2);
        tab.addRow(row);

        row = new Row(nbrAttr);
        row.addAttributeValue(1);
        row.addAttributeValue(1);
        row.addAttributeValue(6);
        tab.addRow(row);

        tab.print();
    }
}
