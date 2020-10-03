
public class Box {
	float width;
	float height;
	float depth;
	
	Box(float width,float height,float depth){
		this.width=width;
		this.height=height;
		this.depth=depth;
	}
	
	public float getVolume() {
		return width*height*depth;
	}

	public static void main(String[] args) {
		Box obj=new Box(2,6,8);
		System.out.print("Volume of Box: "+obj.getVolume());
	}

}