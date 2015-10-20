package lexPackage;



public class DeleteHashEntry extends SymbolTable{
	
	public static DeleteHashEntry entry = null;
	
	private DeleteHashEntry(){
		super(-1,-1);
	}
	
	public static DeleteHashEntry getLexemetoDelete(){
		if (entry == null)

            entry = new DeleteHashEntry();

      return entry;
	}

}
