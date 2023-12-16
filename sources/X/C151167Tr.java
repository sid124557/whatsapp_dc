package X;

/* renamed from: X.7Tr  reason: invalid class name and case insensitive filesystem */
public final class C151167Tr {
    public C153117ah A00;
    public final C69263Wi A01;
    public final C56492s4 A02;
    public final AnonymousClass8EB A03;
    public final C54292oU A04;

    public C151167Tr(C69263Wi r11, C56492s4 r12, C54292oU r13, AnonymousClass33K r14) {
        C18260x0.A0c(r11, r13, r12, r14);
        this.A01 = r11;
        this.A04 = r13;
        this.A02 = r12;
        AnonymousClass8EB r4 = new AnonymousClass8EB();
        this.A03 = r4;
        this.A00 = new AnonymousClass1LW(r11, r12, r4, r14, AnonymousClass002.A0A(r13.A00.getCacheDir(), "biz_directory_cache"), "directory-image", 16777216);
    }

    public final void A00(C184228rS r4, String str, int i) {
        C18270x1.A10(str, 0, r4);
        this.A00.A02(new AnonymousClass8EG(r4, str, i, i), false);
    }
}
