package by.bntu.fitr.povt.alexeyd.lectureGeneric.exercise2;

public class Box<QWERTY extends Student, A, B> {

    private QWERTY data;
    private A dataa;
    private B datab;

    public Box() {
    }

    public QWERTY getData() {
        return data;
    }

    public void setData(QWERTY data) {
        this.data = data;
    }

    public A getDataa() {
        return dataa;
    }

    public void setDataa(A dataa) {
        this.dataa = dataa;
    }

    public B getDatab() {
        return datab;
    }

    public void setDatab(B datab) {
        this.datab = datab;
    }
}
