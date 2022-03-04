public class AInt extends AExpr {
	int val;

	public AInt (int i) {this.val = i;}

	int eval() {return this.val;}
}
