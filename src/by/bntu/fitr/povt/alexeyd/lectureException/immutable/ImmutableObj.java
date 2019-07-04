package immutable;

public final class ImmutableObj {

    private final ImmutableObj instance = this;
    private final Integer number = 1;

    public ImmutableObj() {
    }

    public ImmutableObj getInstance() {
        return instance;
    }

    public void setInstance(ImmutableObj instance) {
        //this.instance = instance;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        //this.number = number;
    }
}
