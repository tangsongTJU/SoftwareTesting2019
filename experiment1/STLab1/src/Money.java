
public class Money {
	public boolean CalMoney(int money) {
		if(money > 0) {
			int num_50 = money/50;
			money = money % 50;
			int num_20 = money/20;
			money = money%20;
			int num_5 = money/5;
			money = money%5;
			int num_1 = money/1;
			if(num_50<2 && num_20<2 &&num_5<3 && num_1<4) {
				return true;
			}
		}
		return false;
	}
	
}

