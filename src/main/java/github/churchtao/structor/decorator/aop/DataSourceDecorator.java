package github.churchtao.structor.decorator.aop;

import github.churchtao.structor.decorator.DataSource;

public abstract class DataSourceDecorator implements DataSource {

    protected DataSource wrapDataSource;

    public DataSourceDecorator(DataSource wrapDataSource) {
        this.wrapDataSource = wrapDataSource;
    }
}
