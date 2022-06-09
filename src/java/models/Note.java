
package models;
import java.io.Serializable;

/**
 *
 * @author prince
 */
public class Note implements Serializable {
    
    private String title;
    private String context;

    public Note(String title, String context) {
        this.title = title;
        this.context = context;
    }

   public Note() {
        this.title="";
        this.context="";
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }
    
    
    
}
