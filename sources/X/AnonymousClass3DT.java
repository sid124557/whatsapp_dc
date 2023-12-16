package X;

/* renamed from: X.3DT  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3DT implements C16370su {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C16370su A02;

    public final Object AyK(Object obj) {
        C16370su r3 = this.A02;
        int i = this.A00;
        int i2 = this.A01;
        Number number = (Number) obj;
        if (r3 == null) {
            return null;
        }
        r3.AyK(Integer.valueOf(i + ((number.intValue() * (i2 - i)) / 100)));
        return null;
    }

    public /* synthetic */ AnonymousClass3DT(C16370su r1, int i, int i2) {
        this.A02 = r1;
        this.A00 = i;
        this.A01 = i2;
    }
}
