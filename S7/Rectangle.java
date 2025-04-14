class Rectangle{
	
	private int height;
	int width;
	
	Rectangle(){//proper way to set default values
		height=2;
		width=3;
	}
	
	Rectangle(int height, int width){
		this.height/*Class variable height*/=height;//parameter height
		this.width=width;
		System.out.println("Just created a rectangle with size(h*w) "+height+" * "+width);
		print(width,height);
	}
	
	
	void get_detail(){
		System.out.println("Height "+height+" Width "+width);
	}
	//This is a print function defined inside Rectangle
	void print(int width, int height){
		for(int j=0; j<height; j++){// for lines i.e,height (rows)
			for(int i=0; i<width; i++){//for the *'s i.e,width (columns)
				System.out.print("*");//* in each line
			}
		System.out.println();//break line
	}
		
	}
	
}


class Main{
	public static void main(String[] args){
		/*
		for(int i=0; i<10; i++){
			System.out.println("Value of i is = "+i);
		}
		*/
		
		Rectangle r1=new Rectangle(5,3);
		//System.out.println("Height "+r1.height+" Width "+r1.width);
		Rectangle r2=new Rectangle();
		//System.out.println("Height "+r2.height+" Width "+r2.width);
		r1.width=20;
		Rectangle r3=r1;
		
		r1.get_detail();
		r2.get_detail();
		r3.get_detail();
		//System.out.println("Height "+r3.height+" Width "+r3.width);
		//r1.print(5,3);
		
		
		
		

	}

}