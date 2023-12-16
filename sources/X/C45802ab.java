package X;

/* renamed from: X.2ab  reason: invalid class name and case insensitive filesystem */
public final class C45802ab {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass4CV A01;
    public final /* synthetic */ C43842Tr A02;
    public final /* synthetic */ String A03;

    public C45802ab(AnonymousClass4CV r1, C43842Tr r2, String str, int i) {
        this.A00 = i;
        this.A02 = r2;
        this.A03 = str;
        this.A01 = r1;
    }

    public void A00(Exception exc) {
        AnonymousClass356.A04("WfsManager launchWfsFlow error", exc);
        this.A02.A00.BkS(new C117125rQ(this.A01, 18));
    }
}
