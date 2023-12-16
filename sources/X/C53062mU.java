package X;

import java.io.File;

/* renamed from: X.2mU  reason: invalid class name and case insensitive filesystem */
public final class C53062mU {
    public final C64393Dh A00;
    public final C56352rq A01;
    public final C54292oU A02;
    public final AnonymousClass2X1 A03;

    public File A00(C51042jB r4) {
        File A022 = C54292oU.A02(this.A02);
        C162457s7.A0D(A022);
        File A0e = AnonymousClass0x7.A0e(A022, "avatar-temporary");
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append(r4.A00);
        return C18270x1.A0A(A0e, ".webp", A0o);
    }

    public File A01(AnonymousClass39M r7) {
        File A002;
        String str = r7.A05;
        if (str == null) {
            return null;
        }
        File A003 = A00(new C51042jB(str));
        A003.getAbsolutePath();
        if (!A003.exists() || A003.length() <= 0) {
            A003.createNewFile();
            A002 = this.A03.A00(r7, A003, true);
            if (A002 == null) {
                return null;
            }
        } else {
            A002 = A003;
        }
        AnonymousClass39M.A01(r7, A003);
        return A002;
    }

    public void A02() {
        File A022 = C54292oU.A02(this.A02);
        C162457s7.A0D(A022);
        C174438Un.A00(AnonymousClass0x7.A0e(A022, "avatar-temporary"));
    }

    public C53062mU(C64393Dh r1, C56352rq r2, C54292oU r3, AnonymousClass2X1 r4) {
        C18260x0.A0c(r3, r1, r2, r4);
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = r2;
        this.A03 = r4;
    }
}
