package thrift.pojo.parameters;

import thrift.pojo.ThriftPojoGenerator;

public class PojoParameterSet extends PojoParameterCollectionAbstract{
    public PojoParameterSet(String type, String paramName) {
        super(type, paramName);
        setGenericSet(true);
    }

    @Override
    protected String getCollectionClassName() {
        return ThriftPojoGenerator.POJO_CLASS_SET;
    }
}
