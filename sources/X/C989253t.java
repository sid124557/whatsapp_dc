package X;

/* renamed from: X.53t  reason: invalid class name and case insensitive filesystem */
public final class C989253t extends AnonymousClass3CR {
    public final C174218Tk A00 = new C174218Tk(200);
    public final C174218Tk A01 = new C174218Tk(10);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C989253t(AnonymousClass2MO r3) {
        super(r3);
        C162457s7.A0J(r3, 1);
        A04();
    }

    public final void A05() {
        synchronized (this) {
            this.A01.clear();
            this.A00.clear();
        }
    }

    public String BDJ() {
        String A0h;
        synchronized (this) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("BusinessSearchQueryCache=");
            A0o.append(this.A01.size());
            A0o.append(',');
            A0h = AnonymousClass000.A0h(A0o, this.A00.size());
        }
        return A0h;
    }

    public void Bej(boolean z) {
        A05();
    }
}
