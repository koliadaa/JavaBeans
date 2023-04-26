package beans.DataGraph;

import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.beans.SimpleBeanInfo;

public class DataSheetGraphBeanInfo extends SimpleBeanInfo {
    private PropertyDescriptor[] propertyDescriptors;

    public DataSheetGraphBeanInfo() {
        try {
            propertyDescriptors = new PropertyDescriptor[]
                    {
                            new PropertyDescriptor("color", DataSheetGraph.class),
                            new PropertyDescriptor("deltaX", DataSheetGraph.class),
                            new PropertyDescriptor("deltaY", DataSheetGraph.class),
                            new PropertyDescriptor("xStep", DataSheetGraph.class),
                            new PropertyDescriptor("yStep", DataSheetGraph.class)
                    };
        } catch (IntrospectionException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public PropertyDescriptor[] getPropertyDescriptors() {
        return propertyDescriptors;
    }
}
