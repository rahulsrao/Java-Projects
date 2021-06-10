class Reciprocal{

	static int[] a={1,2,3,4,5};
	static int b[] = new int[a.length];
	public static void main(String args[]){
	for(int i=0;i<=(a.length-1);i++){
		b[i]=a[(a.length-1)-i];
		System.out.println(b[i]);
	}
	
	}

}