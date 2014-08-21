package paraphrase;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Set;


public class AbstractRelations {

	public HashMap<String, List<String>> ar;

	public AbstractRelations() {
		// A HashMap of lists of relations
		ar = new HashMap<String, List<String>>();
		/**
		 * Reading a lot of abstract relations for file
		 */
		try {
			BufferedReader arBuffer = new BufferedReader(new FileReader("data/test/relations.data"));
			List<String> value = new ArrayList<String>();
			while (arBuffer.ready()) {
				String line = arBuffer.readLine();
				String[] s = line.split(",");
				for (String pattern : s){
					value.add(pattern);
				}
				ar.put(s[0], value);
			}
			arBuffer.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

		
	}
	public Set<String> getTypes() {
		return this.ar.keySet(); 
	}
	public Collection<List<String>> getValues() {
		return this.ar.values();
	}
}
