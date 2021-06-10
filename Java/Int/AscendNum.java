class AscendNum{
	
	static int[] a={1,1,1,1};
	static int b[] = new int[a.length-1];
	static int c[] = new int[b.length-1];
	static int d[] = new int[c.length-1];
	static int e[] = new int[d.length-1];
	public static void main(String args[]){
	//System.out.println("The length of b is "+b.length);
	for(int i=0;i<=(a.length-2);i++){
		int value=a[i]+a[i+1];
		b[i]=value;
		System.out.print(b[i]);
		if(i==a.length-2)
		{System.out.println();}
	}
	//System.out.println("The length of c is "+c.length);
	for(int j=0;j<(b.length-1);j++)
	{
		int value1=b[j]+b[j+1];
		c[j]=value1;	
		System.out.print(c[j]);
		if(j==b.length-2)
		{System.out.println();}					
	}
	//System.out.println("The length of d is "+d.length);
	for(int k=0;k<(c.length-1);k++)
	{
		int value2=c[k]+c[k+1];
		d[k]=value2;	
		System.out.print(d[k]);
		if(k==c.length-2)
		{System.out.println();}						
	}
	//System.out.println("The length of e is "+e.length);
	for(int l=0;l<(d.length-1);l++)
	{
		int value3=d[l]+d[l+1];
		e[l]=value3;	
		System.out.print(e[l]);
		if(l==d.length-2)
		{System.out.println();}						
	}
}
}