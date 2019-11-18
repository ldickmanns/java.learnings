package utility;

/*******************
 * Java Learnings  *
 * @java.learnings *
 *******************/

public class Tests {

	public static void main(String[] args) {
		System.out.println(Boolean.parseBoolean("tru"));
	}
}

interface Product{}

interface Creator {
	public Product create();
}

class ConcreteCreator<P extends Product> implements Creator {
	public Procuct create() {
		 return P::new;
	}
}

