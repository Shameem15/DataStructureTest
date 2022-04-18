package lambdaExpression;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Product{
	int id;
	String name;
	Double price;
	public Product(int id, String name, Double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	@Override
	public String toString() {
		final StringBuffer sb = new StringBuffer("Product{");
		sb.append("id=").append(id);
		sb.append(", name='").append(name).append('\'');
		sb.append(", price=").append(price);
		sb.append('}');
		return sb.toString();
	}
}
public class LambdaExpressionExample11{
	public static void main(String[] args) {
		List<Product> list=new ArrayList<Product>();
		list.add(new Product(1,"Samsung A5",17000d));
		list.add(new Product(3,"Iphone 6S",65000d));
		list.add(new Product(2,"Sony Xperia",25000d));
		list.add(new Product(4,"Nokia Lumia",15000d));
		list.add(new Product(5,"Redmi4 ",26000d));
		list.add(new Product(6,"Lenevo Vibe",19000d));
		
		// using lambda to filter data  
		Stream<Product> filtered_data = list.stream().filter(p -> p.price > 20000);
		
		// using lambda to iterate through collection  
		filtered_data.forEach(
				product -> System.out.println(product.name+": "+product.price)
		);
		
		List<Product> listOfName = list.stream().filter(x-> x.price > 20000).collect(Collectors.toList());
		System.out.println("listOfName: " + listOfName);
		
		List<String> listOfName1 = list.stream().map(x-> x.name).collect(Collectors.toList());
		System.out.println("listOfName: " + listOfName1);
		
		Double sumOfprice = list.stream().collect(Collectors.summingDouble(x-> x.price));
		System.out.println("listOfprice: " + sumOfprice);
		
		Double sumOfpriceFilter = list.stream().filter(x-> x.price > 20000).collect(Collectors.summingDouble(x-> x.price));
		System.out.println("listOfprice: " + sumOfpriceFilter);
	}
}  
