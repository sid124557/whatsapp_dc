package X;

/* renamed from: X.7Wh  reason: invalid class name and case insensitive filesystem */
public class C151787Wh {
    public final int A00;
    public final int A01;
    public final AnonymousClass7Vs A02;
    public final AnonymousClass7VH A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C151787Wh r5 = (C151787Wh) obj;
            if (this.A01 != r5.A01 || this.A00 != r5.A00 || !AnonymousClass75J.A00(this.A03, r5.A03) || !AnonymousClass75J.A00(this.A02, r5.A02)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = new Object[4];
        AnonymousClass000.A1L(objArr, this.A01);
        AnonymousClass000.A1M(objArr, this.A00);
        objArr[2] = this.A03;
        return C18310x6.A08(this.A02, objArr, 3);
    }

    public C151787Wh(AnonymousClass7Vs r1, AnonymousClass7VH r2, int i, int i2) {
        this.A01 = i;
        this.A03 = r2;
        this.A02 = r1;
        this.A00 = i2;
    }
}
