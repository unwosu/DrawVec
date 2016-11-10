package view.menu;

/**
 * Created by un4 on 10/11/16.
 */
public enum FileMenuAction {
    OPEN,SAVE,EXPORT;
    public String getName(){
        switch (this){
            case OPEN:
                return "Open";
            case SAVE:
                return "Save";
            case EXPORT:
                return "Export";
        }
        return null ;
    }
}
