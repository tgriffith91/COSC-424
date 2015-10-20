package lexPackage;

public class SymbolHash {

	private static final int SYMBOLSIZE = 50;

	SymbolTable[] table;

	SymbolHash() {

		table = new SymbolTable[SYMBOLSIZE];

		for (int i = 0; i < SYMBOLSIZE; i++)
			table[i] = null;
	}

	public int get(int lexeme) {
		int hash = (lexeme % SYMBOLSIZE);
		int initial = -1;
		while (hash != initial
				&& (table[hash] != null && (table[hash] == DeleteHashEntry
						.getLexemetoDelete() || table[hash] != null
						&& table[hash].getLexeme() != lexeme))) {

			if (initial == -1)
				initial = hash;
			hash = (hash + 1) % SYMBOLSIZE;
		}

		if (table[hash] == null || hash == initial)

			return -1;

		else

			return table[hash].getToken();

	}

	public void put(int lexeme, int token) {

		int hash = (lexeme % SYMBOLSIZE);

		int initial = -1;

		int indexOfDeletedEntry = -1;

		while (hash != initial
				&& (table[hash] != null && (table[hash] == DeleteHashEntry
						.getLexemetoDelete() || table[hash] != null
						&& table[hash].getLexeme() != lexeme))) {

			if (initial == -1)

				initial = hash;

			if (table[hash] == DeleteHashEntry.getLexemetoDelete())

				indexOfDeletedEntry = hash;

			hash = (hash + 1) % SYMBOLSIZE;

		}

		if ((table[hash] == null || hash == initial)

		&& indexOfDeletedEntry != -1)

			table[indexOfDeletedEntry] = new SymbolTable(lexeme, token);

		else if (initial != hash)

			if (table[hash] != DeleteHashEntry.getLexemetoDelete()

			&& table[hash] != null && table[hash].getLexeme() == lexeme)

				table[hash].setToken(token);

			else

				table[hash] = new SymbolTable(lexeme, token);

	}

}
