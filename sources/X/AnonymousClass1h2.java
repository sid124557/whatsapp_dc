package X;

/* renamed from: X.1h2  reason: invalid class name */
public final class AnonymousClass1h2 extends AnonymousClass3D2 {
    public AnonymousClass4DF A00;
    public final C56652sL A01;
    public final C162047r8 A02;
    public final String A03;
    public final String A04;
    public final byte[] A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass1h2(C56652sL r2, C49552gi r3, AnonymousClass4DF r4, AnonymousClass48L r5, C162047r8 r6, AnonymousClass4FS r7, String str, String str2, byte[] bArr) {
        super(r3, r5, r7);
        C18260x0.A0a(r7, r5, r2, 1);
        this.A01 = r2;
        this.A02 = r6;
        this.A04 = str;
        this.A03 = str2;
        this.A05 = bArr;
        this.A00 = r4;
    }

    public void cancel() {
        super.cancel();
        this.A00 = null;
    }
}
