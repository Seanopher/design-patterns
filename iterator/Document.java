package iterator;
import java.util.Stack;
/**
 * @author seannary
 */
public class Document 
{
    private String title;
    private Stack<String> undoStack = new Stack<String>();
    private Stack<String> redoStack = new Stack<String>();
    
    /**
     * this method is the default constructor that is utilized to name the document
     * @param title - stack name
     */
    public Document(String title)
    {
        this.title = title;
    }
    /** 
     * this method adds the users change to the undoStack
     * @param change - the user's input change
     * @return String - a message displaying the change
     */
    public String makeChange(String change)
    {
        undoStack.add(change);

        return "Making change: "+change;
    }

    /** 
     * this method will undo the most recent change and move it to the redoStack
     * @return String - a message displaying what change is being undone
     */
    public String undoChange() 
    {
        String temp = undoStack.pop();
        redoStack.add(temp);

        return ("Undoing: "+temp);
    }

    /** 
     * this method checks if the user is able to undo an action
     * @return boolean - whether the undoStack is null
     */
    public boolean canUndo()
    {
        if(undoStack!= null)
            return true;
        else
            return false;
    }

    

    /** 
     * this method will redo the most recently undone change and adds it to the undo stack
     * @return String - a message displaying what change is being redone
     */
    public String redoChange()
    {
        String temp = redoStack.pop();
        undoStack.add(temp);

        return("Redoing: "+temp);
    }

    
    /** 
     * this method will check to see whether the redoStack is null
     * @return boolean - if user can redo change
     */
    public boolean canRedo()
    {
        if(redoStack==null)
            return false;
        else
            return true;
    }


    
    /** 
     * this method creates a new iterator for the undoStack
     * @return StackIterator - the StackIterator for undoStack
     */
    public StackIterator getUndoIterator()
    {
        return new StackIterator(undoStack);
    }

    
    /** 
     * this method creates a new iterator for the redoStack
     * @return StackIterator - the StackIterator for redoStack
     */
    public StackIterator getRedoIterator()
    {
        return new StackIterator(redoStack);
    }
}
