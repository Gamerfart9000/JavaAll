package homewrk;

public class Hw2 {
	public class CashRegister {
		private double purchase;
		private double payment;
		private int itemCount;

		public CashRegister() {
			purchase = 0;
			payment = 0;
			itemCount = 0;
		}

		public void recordPurchase(double amount) {
			purchase += amount;
			itemCount++;
		}

		public void receivePayment(double amount) {
			payment += amount;
		}

		public double giveChange() {
			double change = payment - purchase;
			purchase = 0;
			payment = 0;
			return change;
		}

		// Part (a)
		public int getItemCount() {
			return itemCount;
		}

		// Part (b)
		public static int countTotal(CashRegister[] registers) {
			int total = 0;

			for (CashRegister register : registers) {
				total += register.getItemCount();
			}

			return total;

		}

	}
}
