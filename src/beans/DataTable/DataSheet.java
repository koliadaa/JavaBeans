package beans.DataTable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataListType", propOrder = {
        "dataRows"
})

public class DataSheet {

    List<DataItem> dataRows;

    public DataSheet() {
        dataRows = new ArrayList<>();
    }

    public int size() {
        return dataRows.size();
    }

    public DataItem getDataItem(int rowIndex) {
        return dataRows.get(rowIndex);
    }

    public void addDataItem(DataItem item) {
        dataRows.add(item);
    }

    public void removeDataItem(int rowIndex) {
        dataRows.remove(rowIndex);
    }
}
