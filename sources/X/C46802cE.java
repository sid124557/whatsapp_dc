package X;

import java.io.File;

/* renamed from: X.2cE  reason: invalid class name and case insensitive filesystem */
public final class C46802cE {
    public final C56352rq A00;
    public final C54292oU A01;
    public final AnonymousClass1VX A02;
    public final C40762Hq A03;
    public final C49912hI A04;
    public final AnonymousClass2ME A05;

    public C46802cE(C56352rq r2, C54292oU r3, AnonymousClass1VX r4, C40762Hq r5, C49912hI r6, AnonymousClass2ME r7) {
        C18260x0.A0a(r3, r7, r6, 1);
        C18260x0.A0T(r2, r4);
        this.A01 = r3;
        this.A03 = r5;
        this.A05 = r7;
        this.A04 = r6;
        this.A00 = r2;
        this.A02 = r4;
    }

    public final File A00(String str) {
        C162457s7.A0J(str, 0);
        File A012 = C64393Dh.A01(C54292oU.A01(this.A00.A00), "Stickers");
        if (A012.exists() || A012.mkdirs()) {
            return C18270x1.A0A(A012, ".png", AnonymousClass000.A0l(str));
        }
        return null;
    }
}
