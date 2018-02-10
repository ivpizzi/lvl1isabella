 // Copyright Wintriss Technical Schools 2013
import java.awt.Component;
import java.awt.Frame;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public static void main(String[] args) throws Exception {
		Frame quizWindow = new Frame();
		quizWindow.setVisible(true);
		
		int score = 0;
		
		// 1. find an image on the internet, and put its URL in a String variable (from your browser, right click on the image, and select “Copy Image URL”)
		String img1url = "https://images-na.ssl-images-amazon.com/images/I/81AQmbC2kJL._SL1500_.jpg";
		String img2url = "http://www.emilydenisephotography.com/photos/IMG_2642ab.png";
		String img3url = "https://lh3.googleusercontent.com/Rjo-L26ErvSoywToIne5nnmcLokU3dFClZAi1TmFjg7nFQz9Gx-qz-Il0TFcz65IODE=h310";
		String img4url = "https://i.pinimg.com/736x/de/77/08/de7708bd51d4e5154d6ca604bc473f51--grip-in-fashion.jpg";
		String img5url = "https://images-na.ssl-images-amazon.com/images/I/51XKXiUrAOL._SX466_.jpg";
		
		// 2. create a variable of type "Component" that will hold your image
		Component img1;
		Component img2;
		Component img3;
		Component img4;
		Component img5;
		
		// 3. use the "createImage()" method below to initialize your Component
		img1 = createImage(img1url);
		img2 = createImage(img2url);
		img3 = createImage(img3url);
		img4 = createImage(img4url);
		img5 = createImage(img5url);
		
		// 4. add the image to the quiz window
		quizWindow.add(img1);
		
		// 5. call the pack() method on the quiz window
		quizWindow.pack();
		
		// 6. ask a question that relates to the image
		String ans1 = JOptionPane.showInputDialog("What kind of reflective polish is this?");
		
		// 7. print "CORRECT" if the user gave the right answer
		if (ans1.equals("holographic") || ans1.equals("holo"))
		{
			JOptionPane.showMessageDialog(null, "Correct!");
			score += 1;
		}
		
		// 8. print "INCORRECT" if the answer is wrong
		else
		{
			JOptionPane.showMessageDialog(null, "Wrong, it is holographic");
		}
		
		// 9. remove the component from the quiz window (you may not see the effect of this until step 12)
		quizWindow.remove(img1);
		
		// 10. find another image and create it (might take more than one line of code)
		

		// 11. add the second image to the quiz window
		quizWindow.add(img2);
		
		// 12. pack the quiz window
		quizWindow.pack();
		
		// 13. ask another question
		String ans2 = JOptionPane.showInputDialog("What kind of reflective polish is this?");

		// 14. check answer, say if correct or incorrect, etc.
		if (ans2.equals("multichrome"))
		{
			JOptionPane.showMessageDialog(null, "Correct!");
			score += 1;
		}
		
		else
		{
			JOptionPane.showMessageDialog(null, "Wrong, it is multichrome");
		}
		quizWindow.remove(img2);
		
		//-----img3-----
		
		quizWindow.add(img3);
		quizWindow.pack();
		
		String ans3 = JOptionPane.showInputDialog("What kind of reflective polish is this?");
		
		if (ans3.equals("iridescent"))
		{
			JOptionPane.showMessageDialog(null, "Correct!");
			score += 1;
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Wrong, it is iridescent");
		}
		quizWindow.remove(img3);
		
		//-----img4-----
		
		quizWindow.add(img4);
		quizWindow.pack();
		
		String ans4 = JOptionPane.showInputDialog("What kind of reflective polish is this?");
		
		if(ans4.equals("dual chrome"))
		{
			JOptionPane.showMessageDialog(null, "Correct!");
			score += 1;
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Wrong, it is dual chrome");
		}
		
		quizWindow.remove(img4);
		
		//-----img5-----
		
		quizWindow.add(img5);
		quizWindow.pack();
		
		String ans5 = JOptionPane.showInputDialog("What kind of reflective polish is this?");
		
		if(ans5.equals("chrome") || ans5.equals("mirror chrome") || ans5.equals("silver chrome") || ans5.equals("silver mirror chrome"))
		{
			JOptionPane.showMessageDialog(null, "Correct!");
			score += 1;
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Wrong, it is silver mirror chrome");
		}
		quizWindow.remove(img5);
		
		//-----Score-----
		quizWindow.pack();
		int percentage = score/5 * 100;
		JOptionPane.showMessageDialog(null, "Your score is " + score + " out of 5 or " + percentage + "%"); 

	}

	private static Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image (imageComponent.addMouseMotionListener()) 
}





