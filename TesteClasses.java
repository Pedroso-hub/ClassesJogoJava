public class TesteClasses{
	public static void main (String args[]){
		Player p1 = new Player(10, "pedro", 10);
		Player p2 = p1;
		p2.setName("rafael");
		System.out.println(p1.getName());
	}

}