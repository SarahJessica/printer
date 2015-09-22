package printing;

/**
 * Created by leives01 on 21/09/15.
 */
public class PaperTray {
    int pages = 0;

    public void addPaper(int count){
        pages += count;
    }

    public void usePage(){
        pages--;
    }

    public boolean isEmpty(){
        return pages > 0;
    }
}
