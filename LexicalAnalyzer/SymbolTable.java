package lexPackage;

/*
 * Symbol Table Class
 * Stores lexemes and their tokens into a table for use with a lexical analyzer.
 */
public class SymbolTable {

	private int lexeme;		//should these be String instead of int?
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
