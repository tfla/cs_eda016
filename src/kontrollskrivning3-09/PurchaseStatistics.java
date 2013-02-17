public class PurchaseStatistics {
	private ArrayList<PairCount> pairs;

	public PurchaseStatistics() {
		items = new ArrayList<PairCount>();
	}

	public void update(Item a, Item b) {
		PairCount p = new PairCount(a,b);
		for (int i = 0; i < pairs.size(); i++) {
			Item item1 = pairs.get(i).getItem1();
			Item item2 = pairs.get(i).getItem2();
			if (item1 == a || item1 == b && item2 == a || item2 == b) {
				int count = pairs.get(i).getCount();
				if (count > 0) {
					pairs.get(i).incrementCount();
				}
				else {
					pairs.add(p);
				}
				if (count > pairs.get(i-1).getCount) {
					
				}
			}
		}
	}

	public ArrayList<Item> find(Item a, int n) {

	}
}
