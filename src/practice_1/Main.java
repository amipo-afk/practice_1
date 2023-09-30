package practice_1;

public class Main {

	public static void main(String[] args) {
		//インスタンス化
		MySales cs = new MySales();
		//値代入
		cs.amount(200000, 150000);
		//貯金額の表示
		cs.displayInfo();
	}
}
