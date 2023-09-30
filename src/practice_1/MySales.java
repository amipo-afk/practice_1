package practice_1;

/** 設計図クラス*/
public class MySales {
	/** フィールド ***********************/
	//固定費
	static final int DEFAULT_COST = 3000;
	//貯金額
	int amt;
	/** コンストラクタ *******************/
	/**
	 * デフォルトコンストラクタ
	 */
	public MySales() {
	}
	/** メソッド ***********************/
	/**
	 * 貯金額を返却する
	 * @param inAmt 収入額
	 * @param outAmt 支出額
	 * @return 貯金額
	 */
	int amount(int inAmt, int outAmt) {
		this.amt = inAmt - (outAmt + DEFAULT_COST); 
		return amt;
	}
	/**
	 * 情報表示
	 */
	void displayInfo() {
		System.out.println("貯金額は、" + this.amt + "円です。");
	}
	/**********************************/
}
