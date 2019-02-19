
public interface IGoogle {
	public void search();
}

class News implements IGoogle{
	public void search(){
		System.out.println("search news");
	}
}
class Map implements IGoogle{
	public void search(){
		System.out.println("search maps");
	}
}
class Image implements IGoogle{
	public void search(){
		System.out.println("search image");
	}
}
