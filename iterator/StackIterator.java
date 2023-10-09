package iterator;
/**
 * @author seannary
 */
import java.util.Iterator;
import java.util.Stack;

public class StackIterator implements Iterator<String>
{
        private Stack<String> items = new Stack<String>();
        private int position;

        /**
         * this method is the default constructor for the StackIterator
         * @param items - the stack used to store all items
         * 
         */
        public StackIterator(Stack<String> items)
        {
            this.items = items;
        }

        
        /** 
         * this method returns the next item if possible
         * @return String - the next item in stack
         */
        public String next()
        {
           if(!hasNext()) {
            return null;
           }
           else
           {
            return items.elementAt(position++);
           } 
        }

        
        /** 
         * this method checks if there is another item stored in the stack
         * @return boolean - whether there is another item in the stack
         */
        public boolean hasNext()
        {
            if(position >= items.size() || items.get(position) == null){
                return false;
            }
            else
                return true;
        }
        
}
