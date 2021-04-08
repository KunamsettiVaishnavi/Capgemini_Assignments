package day3;

public class DogApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d = new Dog();
		d.setName("Dogi");  
		d.setAge(4);
		d.setWeight(7);
		
		d.doFeedAnimal();
		d.playGames();
		
		if(d.isPlay()) {
			System.out.println(d.getName()+" of age "+d.getAge()+" can play games because it's weight is "+d.getWeight());
		}
		else {
			System.out.println(d.getName()+" is of age "+d.getAge()+" can't play games because it's weight is "+d.getWeight());
		}

	

	}

}
