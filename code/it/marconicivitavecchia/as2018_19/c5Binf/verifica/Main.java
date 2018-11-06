
// TODO Inserire il package corretto
package __TODO__;

import javax.swing.*;

public class Main extends JFrame {
	
	public Main() {
		super("Project X");
		super.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		// TODO Inserire la size in accordo con il wireframe
		super.setSize(900,300);
		StringBuilder sb = new StringBuilder();
		sb.append("<html>");
		sb.append("<h1>almanacco astronomico</h1>");
		sb.append("<div style='display:table'>");
		sb.append("<div style='display:table-row'>");
		
		sb.append("<div style='display:table-cell'>");
		sb.append("Name");
		sb.append("</div>");
		sb.append("<div style='display:table-cell'>");
		sb.append("Description");
		sb.append("</div>");
		
		sb.append("</div>");
		
		sb.append("</div>");
		sb.append("</html>");
		// TODO Usare StringBuilder per costruire la stringa HTML
		
		// TODO Creare la stringa HTML per il wireframe
		
		// TODO Convertire lo StringBuilder in String
		
		// TODO Assegnare correttamente la stringa create a JLabel
		super.add(new JLabel(__TODO__));
		super.setVisible(true);
		 
		System.out.println(htmlText);
		
		System.out.println("Verifica Swing-GitHub");
		
		
	}
	
	public static void main (String[] args) {
		new Main();
	}
}

