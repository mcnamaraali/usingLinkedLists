import java.util.Arrays;
import java.util.LinkedList;

public class UsingToArray {

	public static void main(String[] args) {
		String[] colours = {"black", "blue", "white"};
		LinkedList<String> links = new LinkedList<>(Arrays.asList(colours));
		
		links.addLast("red");
		links.add("pink");
		links.add(2, "green");
		links.addFirst("silver");
		
		colours = links.toArray(new String[links.size()]);
		
		System.out.println("colours:");
		
		for(String colour : colours) {
			System.out.println(colour);
		}

	}

}
