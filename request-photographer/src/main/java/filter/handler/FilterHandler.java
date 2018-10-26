package filter.handler;

public abstract class FilterHandler<T> {
    abstract String getQuery(); //TODO should this output be some kind of dbquery object?
    //TODO should the handler be passed the db and operate on the db?
}
