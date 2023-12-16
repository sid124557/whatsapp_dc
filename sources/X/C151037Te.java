package X;

/* renamed from: X.7Te  reason: invalid class name and case insensitive filesystem */
public class C151037Te {
    public int A00 = 0;
    public int A01 = 0;
    public int A02 = 0;
    public final Object[] A03 = new Object[32];

    public synchronized Object A00() {
        Object obj;
        int i = this.A01;
        C626936e.A0C(AnonymousClass001.A1W(i));
        Object[] objArr = this.A03;
        int i2 = this.A02;
        obj = objArr[i2];
        objArr[i2] = null;
        this.A02 = (i2 + 1) % objArr.length;
        this.A01 = i - 1;
        return obj;
    }
}
