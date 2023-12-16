package X;

import java.io.File;

/* renamed from: X.2aC  reason: invalid class name and case insensitive filesystem */
public final class C45552aC {
    public final C56352rq A00;
    public final C55732qp A01;
    public final AnonymousClass2X1 A02;

    public final AnonymousClass294 A00(AnonymousClass39M r4) {
        String str;
        C162457s7.A0J(r4, 0);
        String str2 = r4.A0D;
        if (str2 == null || str2.length() == 0) {
            str = "StickerDownloader/error: plain file hash is null or empty";
        } else {
            C56352rq r1 = this.A00;
            File A012 = r1.A01(str2);
            if (A012 == null) {
                File A002 = this.A02.A00(r4, r1.A02(str2), false);
                if (A002 != null) {
                    AnonymousClass39M.A02(r4, A002);
                    C55732qp r2 = this.A01;
                    String absolutePath = A002.getAbsolutePath();
                    C162457s7.A0D(absolutePath);
                    r4.A04 = r2.A01(r4.A04(), absolutePath);
                } else {
                    StringBuilder A0o = AnonymousClass001.A0o();
                    A0o.append("StickerDownloader/error: sticker download failed, could not save file (hash=");
                    str = C18260x0.A07(r4.A0D, A0o);
                }
            } else {
                AnonymousClass39M.A02(r4, A012);
            }
            return new C32841ri(r4);
        }
        return new C32831rh(str);
    }

    public C45552aC(C56352rq r1, C55732qp r2, AnonymousClass2X1 r3) {
        C18260x0.A0V(r2, r1, r3);
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = r3;
    }
}
