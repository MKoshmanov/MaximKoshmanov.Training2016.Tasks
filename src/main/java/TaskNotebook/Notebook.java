package TaskNotebook;


public class Notebook {
	public static void main(String[] args){
		
		WrittenInNotebook written = new WrittenInNotebook();
		
		written.addNote("Ivan Ivanov, 59-12-22");
		written.addNote("Semen Petrov, 11-58-98");
		written.addNote("Igor Sidorov, 44-78-22");
		written.addNote("Anna Smirnova, 99-62-30");
		written.deleteNote(0);
		written.deleteNote("Igor Sidorov, 44-78-22");
		written.replaceNote(1, "Kate Petrova, 11-55-22");
		written.lookAllNotes();
	}
}
