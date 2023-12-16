package X;

import java.io.File;

/* renamed from: X.2jF  reason: invalid class name and case insensitive filesystem */
public class C51082jF {
    public final C56352rq A00;

    public File A00(C50612iT r4, byte[] bArr) {
        File A01 = A01(r4.A0G);
        if (A01 == null || !C627536m.A0R(A01, AnonymousClass0x9.A0d(bArr))) {
            return null;
        }
        C18260x0.A1P(AnonymousClass001.A0o(), "ThirdPartyStickerManager/cacheTrayIcon to: ", A01);
        return A01;
    }

    public File A01(String str) {
        File A01 = C64393Dh.A01(C54292oU.A01(this.A00.A00), "Stickers");
        if (A01.exists() || A01.mkdirs()) {
            return C18270x1.A0A(A01, ".png", AnonymousClass000.A0l(str));
        }
        return null;
    }

    public C51082jF(C56352rq r1) {
        this.A00 = r1;
    }
}
