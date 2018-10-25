import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ReadStrutsCoreTldTagFile {

	static String readTagName(String line) {
		String[] tagName = line.trim().split("(<name>)|(</name>)");
		return tagName[1];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int totalStrutsTags = 0;
		try (BufferedReader bufReader = new BufferedReader(new FileReader("struts-tags.tld"))) {
			String line = "";
			while ((line = bufReader.readLine()) != null) {
				if (line.trim().startsWith("<name>")) {
					String tagName = readTagName(line);
					System.out.print("tag name is : " + tagName);
					totalStrutsTags++;
					int attrib = 0;
					while (true) {
						line = bufReader.readLine();
						ArrayList<String> attribName = new ArrayList<String>();
						if (line.trim().startsWith("<attribute>")) {
							attrib++;
						} else if (line.trim().startsWith("</tag>")) {
							System.out.println(" , Tag <" + tagName + "> has : " + attrib + " attributes");
							attrib = 1;
							break;
						}
					}
				}

			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("\nTotal number of tags struts2-core has : " + totalStrutsTags);

	}

}
