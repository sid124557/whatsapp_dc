package X;

/* renamed from: X.91o  reason: invalid class name and case insensitive filesystem */
public class C1895091o implements C835148s {
    public int A00;
    public Object A01;
    public final int A02;

    public C1895091o(Object obj, int i, int i2) {
        this.A02 = i2;
        this.A01 = obj;
        this.A00 = i;
    }

    public final void BGn(Object obj) {
        switch (this.A02) {
            case 0:
                ((C186488vR) obj).BW7((C151877Wq) this.A01, this.A00);
                return;
            case 1:
                ((C186488vR) obj).BYA(((C160747oF) this.A01).A0D, this.A00);
                return;
            default:
                ((C186488vR) obj).Be5(((C160747oF) this.A01).A05, this.A00);
                return;
        }
    }
}
