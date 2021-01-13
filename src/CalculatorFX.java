import javafx.application.Application;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.scene.input.KeyCode;

public class CalculatorFX extends Application {
	
	Button list_button[];
	public int x, y, widthN, lenghtN, widthA, lenghtA, lenghtR;
	public double distanceX, distanceY, positionA_bottom;
	private boolean move = false;
	public String list[] = {"0", ",", "%", "+",  "=", "1", "2", "3", "-", "x²", "√", "4", "5", "6", "x", "(", ")", "7", "8", "9", "/", "del", "C"};
	public String number = "0123456789";
	private TextArea textArea;
	private TextField textfield;
	private AnchorPane layout;
	public String alphabet = "0123456789.%+-x²√x()/";
	
	
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage stage) throws Exception {
		stage.setTitle("Calcolatrice");
		
		layout = new AnchorPane();
		
		list_button = new Button[23];
		
		y = 0;
		widthN = 65;
		lenghtN = 50;
		distanceX = 5;
		distanceY = 5;
		
		widthA = (int) ((widthN + distanceX) * 6 - distanceX);
		lenghtA = 45;
		positionA_bottom = ((lenghtN + distanceY) * 4 + distanceY);
		lenghtR = (int) ((widthN+distanceX)*6+distanceX - positionA_bottom);
				
		textArea = new TextArea();
		textArea.setEditable(false);
		textArea.setPrefWidth(widthA);
		textArea.setPrefHeight(lenghtR);
		AnchorPane.setLeftAnchor(textArea, distanceX);
		AnchorPane.setTopAnchor(textArea, distanceX);
		layout.getChildren().add(textArea);		
		
		textfield = new TextField();
		textfield.setPrefWidth(widthA);
		textfield.setPrefHeight(lenghtA);
		AnchorPane.setLeftAnchor(textfield, distanceX);
		AnchorPane.setBottomAnchor(textfield, positionA_bottom);
		layout.getChildren().add(textfield);
		
		
		for(int i=0; i<list.length; i++) {
			list_button[i] = new Button();
		}
		
		textfield.setOnKeyPressed(e -> {
			String result;
			if(e.getCode() == KeyCode.ENTER) {
				if(check(textfield.getText()) == true) {
					textfield.setPromptText("Operazione non consentita!");
					textfield.clear();
				}else {
					if(textfield.getText().length() != 0) {
						result = calculate(textfield.getText());
						textArea.appendText(textfield.getText()+" = "+result.toString()+"\n");
						textfield.setText(result);
					}
				}
			}
		});
		
		
		list_button[0].setOnAction(e -> {
			textfield.setPromptText(" ");
			textfield.appendText(list[0]);
		});
		
		list_button[1].setOnAction(e -> {
			textfield.setPromptText(" ");
			textfield.appendText(".");
		});
		
		list_button[2].setOnAction(e -> {
			textfield.setPromptText(" ");
			textfield.appendText(list[2]);
		});
		
		list_button[3].setOnAction(e -> {
			textfield.setPromptText(" ");
			textfield.appendText(list[3]);
		});
		
		list_button[4].setOnAction(e -> {
			String result;
			if(check(textfield.getText()) == true) {
				textfield.setPromptText("Operazione non consentita!");
				textfield.clear();
			}else {
				if(textfield.getText().length() != 0) {
					result = calculate(textfield.getText());
					textArea.appendText(textfield.getText()+" = "+result.toString()+"\n");
					textfield.setText(result);
				}
			}
			
		});
		
		list_button[5].setOnAction(e -> {
			textfield.setPromptText(" ");
			textfield.appendText(list[5]);
		});
		
		list_button[6].setOnAction(e -> {
			textfield.setPromptText(" ");
			textfield.appendText(list[6]);
		});
		
		list_button[7].setOnAction(e -> {
			textfield.setPromptText(" ");
			textfield.appendText(list[7]);
		});
		
		list_button[8].setOnAction(e -> {
			textfield.setPromptText(" ");
			textfield.appendText(list[8]);
		});
		
		list_button[9].setOnAction(e -> {
			textfield.setPromptText(" ");
			textfield.appendText("²");
		});
		
		list_button[10].setOnAction(e -> {
			textfield.setPromptText(" ");
		textfield.appendText(list[10]);
		});
		
		list_button[11].setOnAction(e -> {
			textfield.setPromptText(" ");
		textfield.appendText(list[11]);
		});
		
		list_button[12].setOnAction(e -> {
			textfield.setPromptText(" ");
		textfield.appendText(list[12]);
		});
		
		list_button[13].setOnAction(e -> {
			textfield.setPromptText(" ");
		textfield.appendText(list[13]);
		});
		
		list_button[14].setOnAction(e -> {
			textfield.setPromptText(" ");
		textfield.appendText(list[14]);
		});
		
		list_button[15].setOnAction(e -> {
			textfield.setPromptText(" ");
		textfield.appendText(list[15]);
		});
		
		list_button[16].setOnAction(e -> {
			textfield.setPromptText(" ");
		textfield.appendText(list[16]);
		});
		
		list_button[17].setOnAction(e -> {
			textfield.setPromptText(" ");
		textfield.appendText(list[17]);
		});
		
		list_button[18].setOnAction(e -> {
			textfield.setPromptText(" ");
		textfield.appendText(list[18]);
		});
		
		list_button[19].setOnAction(e -> {
			textfield.setPromptText(" ");
		textfield.appendText(list[19]);
		});
		
		list_button[20].setOnAction(e -> {
			textfield.setPromptText(" ");
		textfield.appendText(list[20]);
		});
		
		list_button[21].setOnAction(e -> {
			textfield.setPromptText(" ");
			if(textfield.getText().length() != 0) {
				textfield.setText(textfield.getText().substring(0, textfield.getText().length()-1));
			}
		});
		
		list_button[22].setOnAction(e -> {
			textfield.setPromptText(" ");
			textfield.clear();
			textArea.clear();
		});		
				
		
		for(int i=0; i<list.length; i++) {
			list_button[i].setText(list[i]);
			list_button[i].setPrefWidth(widthN);
			list_button[i].setPrefHeight(lenghtN);
			
			
			if(move == true) {
				AnchorPane.setBottomAnchor(list_button[i], distanceY + (y * (lenghtN + distanceY)));
				AnchorPane.setLeftAnchor(list_button[i], distanceX + (x * (widthN + distanceX)));
				layout.getChildren().add(list_button[i]);
				x++;
				if(list[i].equals("√") == true || list[i].equals(")") == true) {
					x = 0;
					y++;
				}
				continue;
			}
			
			if(list[i].equals("=") == true) {
				move = true;
				x = 0;
				y++;
				list_button[i].setPrefWidth(distanceX + (widthN) * 2);
				list_button[i].setStyle("-fx-background-color: #8BC8F0");	
			}
			
			AnchorPane.setLeftAnchor(list_button[i], distanceX + (i * (widthN + distanceX)));
			AnchorPane.setBottomAnchor(list_button[i], distanceX);
			layout.getChildren().add(list_button[i]);			
		}
		
		Scene scene = new Scene(layout, (widthN+distanceX)*6+distanceX, (lenghtN+distanceY)*6+distanceY+150);		
		stage.setScene(scene);
		stage.show();
	}
	
	public boolean check(String operation) {
		if(operation.contains("xx") == true || operation.contains("x+") == true || operation.contains("x-") == true || operation.contains("x/") == true || operation.contains("x%") == true || operation.contains("x.") == true || operation.contains("x²") == true) return true;
		if(operation.contains("++") == true || operation.contains("+-") == true || operation.contains("+x") == true || operation.contains("+/") == true || operation.contains("+%") == true || operation.contains("+.") == true || operation.contains("+²") == true) return true;
		if(operation.contains("--") == true || operation.contains("-+") == true || operation.contains("-x") == true || operation.contains("-/") == true || operation.contains("-%") == true || operation.contains("-.") == true || operation.contains("-²") == true) return true;
		if(operation.contains("//") == true || operation.contains("/+") == true || operation.contains("/x") == true || operation.contains("/-") == true || operation.contains("/%") == true || operation.contains("/.") == true || operation.contains("/²") == true) return true;
		if(operation.contains("..") == true || operation.contains(".+") == true || operation.contains(".x") == true || operation.contains("./") == true || operation.contains(".%") == true || operation.contains(".-") == true || operation.contains(".²") == true || operation.contains(".√") == true) return true;
		if(operation.contains("√√") == true || operation.contains("√+") == true || operation.contains("√-") == true || operation.contains("√/") == true || operation.contains("√x") == true || operation.contains("√.") == true || operation.contains("√²") == true || operation.contains("√%") == true) return true;	
		if(operation.contains("()") == true || operation.contains(")(") == true || operation.contains("(x") == true || operation.contains("(+") == true || operation.contains("(/") == true || operation.contains("(-") == true || operation.contains("(%") == true || operation.contains("(²") == true || operation.contains("(.") == true || operation.contains("x)") == true || operation.contains("+)") == true || operation.contains("-)") == true || operation.contains("/)") == true || operation.contains(".)") == true || operation.contains("√)") == true) return true;
		if(operation.contains("²²") == true || operation.contains("².") == true || operation.contains("²%") == true || operation.contains("²√") == true) return true;
		if(operation.contains("%%") == true || operation.contains("%.") == true) return true;
		
		String operation_check = ".%+-x)/²";
		String operation_check_2 = ".+-x/√(";
			
		if(operation_check.contains(String.valueOf(operation.charAt(0))) == true || operation_check_2.contains(String.valueOf(operation.charAt(operation.length()-1))) == true) return true;
				
		for(int i=0; i<operation.length(); i++) {
			if(!alphabet.contains(String.valueOf(operation.charAt(i)))) return true;
		}
		
		return false;
	}

	public String calculate(String text) {
		float op;
		int j, text_length;
		
		op = 0;
		text_length = text.length();
		
		for(int i=0; i<text_length; i++) {
			
			if(i == 0 && text.charAt(0) != '√' && text.charAt(0) != '(') {
				while(i<text_length && (number.contains(String.valueOf(text.charAt(i))) == true || '.' == text.charAt(i))){i++;}
				if(i == 1) {
					op = Float.parseFloat(String.valueOf(text.charAt(i-1)));
					i--;
					continue;
				}
				op = Float.parseFloat(text.substring(0, i));
			}
			
			if(text.charAt(i) == '+') {
				i++;
				j = i;
				
				if(text.charAt(i) == '√') {
					i++;
					j = i;
					
					while(i<text_length && (number.contains(String.valueOf(text.charAt(i))) == true || '.' == text.charAt(i))){i++;}
					
					if(i == j) {
						op += (float) Math.sqrt(Float.parseFloat(String.valueOf(text.charAt(j))));
					}else {
						op += (float) Math.sqrt(Float.parseFloat(text.substring(j, i)));
					}
					i--;
					continue;
				}
				
				while(i<text_length && (number.contains(String.valueOf(text.charAt(i))) == true || '.' == text.charAt(i))){i++;}
				
				if(i == j) {
					op += Float.parseFloat(String.valueOf(text.charAt(j)));
				}else {
					op += Float.parseFloat(text.substring(j, i));
				}
				i--;
				continue;
			}
			

			if(text.charAt(i) == '-') {
				i++;
				j = i;
				
				if(text.charAt(i) == '√') {
					i++;
					j = i;
					
					while(i<text_length && (number.contains(String.valueOf(text.charAt(i))) == true || '.' == text.charAt(i))){i++;}
					
					if(i == j) {
						op -= (float) Math.sqrt(Float.parseFloat(String.valueOf(text.charAt(j))));
					}else {
						op -= (float) Math.sqrt(Float.parseFloat(text.substring(j, i)));
					}
					i--;
					continue;
				}
				
				while(i<text_length && (number.contains(String.valueOf(text.charAt(i))) == true || '.' == text.charAt(i))){i++;}
				
				if(i == j) {
					op -= Float.parseFloat(String.valueOf(text.charAt(j)));
				}else {
					op -= Float.parseFloat(text.substring(j, i));
				}
				i--;
				continue;
			}
			
			
			if(text.charAt(i) == 'x') {
				i++;
				j = i;
				
				if(text.charAt(i) == '√') {
					i++;
					j = i;
					
					while(i<text_length && (number.contains(String.valueOf(text.charAt(i))) == true || '.' == text.charAt(i))){i++;}
					
					if(i == j) {
						op *= (float) Math.sqrt(Float.parseFloat(String.valueOf(text.charAt(j))));
					}else {
						op *= (float) Math.sqrt(Float.parseFloat(text.substring(j, i)));
					}
					i--;
					continue;
				}
				
				while(i<text_length && (number.contains(String.valueOf(text.charAt(i))) == true || '.' == text.charAt(i))){i++;}
				
				if(i == j) {
					op *= Float.parseFloat(String.valueOf(text.charAt(j)));
				}else {
					op *= Float.parseFloat(text.substring(j, i));
				}
				i--;
				continue;
			}
			
			
			if(text.charAt(i) == '/') {
				i++;
				j = i;
				
				if(text.charAt(i) == '√') {
					i++;
					j = i;
					
					while(i<text_length && (number.contains(String.valueOf(text.charAt(i))) == true || '.' == text.charAt(i))){i++;}
					
					if(i == j) {
						op /= (float) Math.sqrt(Float.parseFloat(String.valueOf(text.charAt(j))));
					}else {
						op /= (float) Math.sqrt(Float.parseFloat(text.substring(j, i)));
					}
					i--;
					continue;
				}
				
				while(i<text_length && (number.contains(String.valueOf(text.charAt(i))) == true || '.' == text.charAt(i))){i++;}
				
				if(i == j) {
					op /= Float.parseFloat(String.valueOf(text.charAt(j)));
				}else {
					op /= Float.parseFloat(text.substring(j, i));
				}
				i--;
				continue;
			}
			
			if(text.charAt(i) == '%') {
				op /= 100;			
				continue;
			}
						
			
			if(text.charAt(i) == '√') {
				i++;
				j = i;
				
				while(i<text_length && (number.contains(String.valueOf(text.charAt(i))) == true || '.' == text.charAt(i))){i++;}
				
				if(i == j) {
					op = (float) Math.sqrt(Float.parseFloat(String.valueOf(text.charAt(j))));
				}else {
					op = (float) Math.sqrt(Float.parseFloat(text.substring(j, i)));
				}
				i--;
				continue;
			}
			
			if(text.charAt(i) == '²') {
				op = (float) Math.pow(op, 2);
				continue;
			}			
			
			if(text.charAt(i) == '(') {
				i++;
				j = i;
				
				while(i<text_length && text.charAt(i) != ')') {
					if(i == text_length-1 && text.charAt(i) != ')') {return "indeterminato";}
					i++;
				}
				String brackets_calculate;
				brackets_calculate = calculate(text.substring(j, i));
				if(brackets_calculate == "indeterminato") return "indeterminato";
				op = Float.parseFloat(calculate(text.substring(j, i)));
				i--;
				continue;
			}	
				
		}
		
		return(Float.toString(op));
	}
	
}
















