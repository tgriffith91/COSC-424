package lexPackage;

import java.io.IOException;

import lexPackage.CharacterReader;
import lexPackage.ConstantHandler;

public class Token {
	

	private Token() throws IOException {
		int state = 0;
		CharacterReader in = new CharacterReader("LexChars.txt");
		char c;
		c = in.readChars();
		switch (state) {
		case 0:
			c = in.readChars();
			if(c >= 'a' && c <= 'z'||c >= 'A' && c <= 'Z' ){
				state = 1;
			}
			else if (c >= '0' && c <= '9') state = 3;
			else if(c == '{')state = 5;
			else if(c =='}')state = 6;
			else if(c =='(')state = 7;
			else if(c ==')')state = 8;
			else if(c == ';')state = 9;
			else if(c == ',')state = 10;
			else if(c == '=')state = 11;
			else if(c == '!')state = 14;
			else if(c == '<')state = 17;
			else if(c == '>')state = 20;
			else if(c == '+')state = 23;
			else if(c == '-')state = 24;
			else if(c == '*')state = 25;
			else if(c == '/')state = 26;
			
		case 1: 
			c = in.readChars();
			if(c >= 'a' && c <= 'z'||c >= 'A' && c <= 'Z' ){
				state = 1;
			}
			else state = 2;
			break;
		  
		case 2: retract();
		        getToken(); 
		        installID();
		        
		case 3: c = in.readChars();
		if(c >= '0' && c <= '9')state = 3;
		else state = 4;
		break;
		
		case 4: 
			retract();
			return(NUM,numValue());
			
		case 5: 
			if( c == '{'){
			put(LBRCK,0);
			}
		
		case 6:
			if (c == '}'){
			put(RBRK,0);
			}
		
		case 7: 
			if(c == '('){
			put(LPTH,0);
			}
			
		case 8: 
			if(c == ')'){
			put(RPTH,0);
			}
			
		case 9: 
			if(c == ';'){
			put(SMIC,0);
			}
		
		case 10: 
			if(c == ','){
			put(COMMA,0);
			}
			
		case 11: 
			 if(c == '='){
			put(ASSIGNOP,EQ);
			 }
		case 12: 
			 if(c == '+'){
				 
			 }
				 
			 }
				 
			 }
}
