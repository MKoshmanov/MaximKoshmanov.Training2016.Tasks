package TaskNotebook;


import java.util.ArrayList;


public class WrittenInNotebook {
	
	private int index;
	private String note;
	ArrayList<String> noteList = new ArrayList<String>();
	
	protected void addNote(String note) {
		noteList.add(note);
		index = noteList.indexOf(note);
		System.out.println("Note: " + noteList.get(index) + " added, " + "note index " + index);
	}
	
	protected void deleteNote(int index) {
		System.out.println("Note: " + noteList.get(index) + " delete");
		noteList.remove(index);
	}
	
	protected void deleteNote(String note) {
		System.out.println("Note: " + note + " delete");
		noteList.remove(note);
	}
	
	protected void replaceNote(int index, String note) {
		System.out.print("Note: " + noteList.get(index) + " replace ");
		noteList.set(index, note);
		System.out.println(" on another note: " + noteList.get(index));
	}
	protected void lookAllNotes() {
		note = "";
		for (int i = 0; i < noteList.size(); i++) {
			note += noteList.get(i) + "\n";
		}
		System.out.println("All notes:\n" + note);
	}
}
