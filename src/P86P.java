class P86P extends P85E{
	int j =20;
	void print(){
		System.out.println("execute print");
	}
	public static void main(String[] args) {
		P86P p = new P86P();
		System.out.println(p.i);
		System.out.println(p.j);
		p.disp();
		p.print();
	}
}
