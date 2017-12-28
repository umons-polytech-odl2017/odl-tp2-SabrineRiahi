package exercise2;

public class ProductionWorker implements Payable {

	int producePieceRate ;
	int production = 0 ;

	public ProductionWorker (int producePieceRate) {
		this.producePieceRate = producePieceRate ;
	}

	public void produceOnePiece () {
		production += 1 ;
	}

	public int computeSalary() {
		return production*producePieceRate;
	}
}
