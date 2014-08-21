/**
 * 
 */
package dictionaries;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

import edu.mit.jmwe.data.IMWE;
import edu.mit.jmwe.data.IToken;
import edu.mit.jmwe.data.Token;
import edu.mit.jmwe.detect.Consecutive;
import edu.mit.jmwe.detect.IMWEDetector;
import edu.mit.jmwe.index.IMWEIndex;
import edu.mit.jmwe.index.MWEIndex;

/**
 * @author alessandro
 *
 */
public class Main {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = " What is Ebola? Ebola virus disease (also known as Ebola hemorrhagic fever) is a rare and deadly disease. The disease is native to several African countries and is caused by infection with one of the ebolaviruses (Ebola, Sudan, Bundibugyo, or Taï Forest virus). It is spread by direct contact with a sick person’s blood or body fluids. It is also spread by contact with contaminated objects or infected animals. Symptoms include fever, headache, joint and muscle aches, sore throat, and weakness, followed by diarrhea, vomiting, and stomach pain. Skin rash, red eyes, and internal and external bleeding may be seen in some patients. Who is at risk? Travelers could be infected if they come into contact with blood or body fluids from someone who is sick or has died from Ebola, sick wildlife, or meat from an infected animal. Health care providers caring for Ebola patients and family and friends in close contact with an ill person are at highest risk because they may come into contact with blood or body fluids. What can travelers do to prevent Ebola? There is no vaccine or specific treatment for Ebola, and many people who get the disease die. Therefore, it is important to take steps to prevent Ebola.";
		System.out.println(text);
		try {
			simpleDetectorExample();
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}

	public static void simpleDetectorExample() throws IOException {
		File idxData = new File("data/test/wordnet.data");
		IMWEIndex index = new MWEIndex(idxData);
		index.open();
		IMWEDetector detector = new Consecutive(index);
		List<IToken> sentence = new ArrayList<IToken>();
		sentence.add(new Token("She", "DT"));
		sentence.add(new Token("looked", "VBD", "look"));
		sentence.add(new Token("up", "RP"));
		sentence.add(new Token("the", "DT"));
		sentence.add(new Token("world", "NN"));
		sentence.add(new Token("record", "NN"));
		sentence.add(new Token(".", "."));
		List<IMWE<IToken>> mwes = detector.detect(sentence);
		for(IMWE<IToken> mwe : mwes)
			System.out.println(mwe);
	}
}
