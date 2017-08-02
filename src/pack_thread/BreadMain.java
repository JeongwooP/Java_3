package pack_thread;

public class BreadMain {
	public static void main(String[] args) {
		BreadPlate breadPlate = new BreadPlate();
		
		BreadMaker make = new BreadMaker(breadPlate);
		make.setPriority(7);
		BreadEater eater = new BreadEater(breadPlate);
	
	}

}
