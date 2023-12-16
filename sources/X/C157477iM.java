package X;

/* renamed from: X.7iM  reason: invalid class name and case insensitive filesystem */
public class C157477iM {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final boolean A03;

    public C157477iM(Object obj, int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
        this.A02 = obj;
        this.A03 = false;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("MeasureResult:[width ");
        A0o.append(this.A01);
        A0o.append(" height ");
        A0o.append(this.A00);
        A0o.append(" layoutData ");
        A0o.append(this.A02);
        A0o.append(" mHadExceptions ");
        A0o.append(this.A03);
        return AnonymousClass000.A0f(A0o);
    }

    public C157477iM() {
        this.A01 = 0;
        this.A00 = 0;
        this.A02 = null;
        this.A03 = true;
    }
}
