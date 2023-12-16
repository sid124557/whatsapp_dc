package X;

/* renamed from: X.0Ae  reason: invalid class name and case insensitive filesystem */
public final class C01330Ae extends AnonymousClass0O7 {
    public final C16090sS A00;
    public final C02180Fe A01;
    public final Object A02;
    public final String A03;

    public C01330Ae(C16090sS r2, C02180Fe r3, Object obj, String str) {
        C162457s7.A0J(r3, 3);
        this.A02 = obj;
        this.A03 = str;
        this.A01 = r3;
        this.A00 = r2;
    }

    public AnonymousClass0O7 A01(String str, AnonymousClass4GQ r8) {
        String str2 = str;
        C162457s7.A0J(str, 0);
        Object obj = this.A02;
        if (AnonymousClass001.A1Z(r8.invoke(obj))) {
            return this;
        }
        return new C01340Af(this.A00, this.A01, obj, this.A03, str2);
    }

    public Object A02() {
        return this.A02;
    }
}
