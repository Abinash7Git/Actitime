package Programming;

public class Driver {

	public static void main(String[] args) {
		Animal a=new Lion("Tiger","yellow",40);
		a.Eat();
		Lion l=new Lion("jira","while",50);
		l.Eat();
		Lion l1=(Lion)a;
		l1.hunt();
        
	}

}
