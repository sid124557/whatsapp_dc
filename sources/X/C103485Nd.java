package X;

/* renamed from: X.5Nd  reason: invalid class name and case insensitive filesystem */
public final class C103485Nd {
    public boolean A00;
    public final Object A01 = AnonymousClass002.A0D();
    public final String A02;

    public C103485Nd(String str) {
        C162457s7.A0J(str, 1);
        this.A02 = str;
    }

    public final String A00() {
        boolean z;
        synchronized (this.A01) {
            z = this.A00;
        }
        if (z) {
            return "";
        }
        return this.A02;
    }
}
