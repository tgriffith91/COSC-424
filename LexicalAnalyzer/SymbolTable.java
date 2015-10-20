package lexPackage;

public class SymbolTable {

	private int lexeme;
	private int token;

	SymbolTable(int lexeme, int token) {
		this.lexeme = lexeme;
		this.token = token;

	}

	public int getLexeme() {
		return lexeme;
	}

	public int getToken() {
		return token;
	}
	
	public void setToken(int token){
		this.token = token;
	}
	public void setLexeme(int lexeme){
		this.lexeme = lexeme;
	}

}
