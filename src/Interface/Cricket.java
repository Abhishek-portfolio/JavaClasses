package Interface;

interface Cricket {
    public void Sachin();
    public void Dhoni();
}

class Match implements Cricket {
    public void Sachin() {
        System.out.println("Sachin's 100th Century against Australia");
    }
    
    public void Dhoni() {
        System.out.println("Dhoni finishing off in style");
    }


public class Main {
    public static void main(String[] args) {
        Match match = new Match();
        match.Sachin();
        match.Dhoni();
    	}
	}
}