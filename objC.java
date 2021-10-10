class customerC  implements Cloneable{
	String cname;
	int cid;
	public customerC(String cname, int cid){
		this.cname=cname;
		this.cid=cid;
	}
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
	}
	public class objC {
public static void main (String [] args)throws CloneNotSupportedException {
	customerC c = new customerC("hosh",9999);
	customerC c2 = (customerC)c.clone();//deep cloneing
	customerC c1=c;//shallow cloning
	System.out.println(c1.equals(c2));
	System.out.println(c1.equals(c));
	System.out.println(c.hashCode());
	System.out.println(c1.hashCode());
	System.out.println(c2.hashCode());
	System.out.println(c1.toString());
	System.out.println(c2.toString());
	
}
}