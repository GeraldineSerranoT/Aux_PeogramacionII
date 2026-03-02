
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Anime a1=new Anime("One Piece","Shonen",1200);
		Anime a2= new Anime("Blood+","Misterio",50);
		Televisor t1=new Televisor("LG",720,"ips");
		Televisor t2=new Televisor();
		Instrumento i1=new Instrumento("Guitarra","madera","cuerda");
		Instrumento i2=new Instrumento("Flauta","plastico","viento");
		System.out.println(a1.mostrar());
		System.out.println(a2.mostrar());
		System.out.println(t1.toString());
		System.out.println(t2.toString());
		System.out.println(i1.toString());
		System.out.println(i2.toString());
	}

}
