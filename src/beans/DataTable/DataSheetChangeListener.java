package beans.DataTable;

import java.util.EventListener;

public interface DataSheetChangeListener extends EventListener {
    void dataChanged(DataSheetChangeEvent event);
}
