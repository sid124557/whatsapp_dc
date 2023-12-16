package X;

import java.util.Locale;

/* renamed from: X.2d1  reason: invalid class name and case insensitive filesystem */
public class C47292d1 {
    public final C55682qk A00;
    public final C622834k A01;
    public final C43392Ry A02 = new C43392Ry();
    public final AnonymousClass4F4 A03;
    public final C50632iV A04;
    public final C66543Lv A05;
    public final AnonymousClass313 A06;
    public final C620333f A07;
    public final AnonymousClass33H A08;
    public final C55832qz A09;

    public final void A00(AnonymousClass1ES r6, String str, Throwable th) {
        Locale locale = Locale.US;
        Object[] objArr = new Object[4];
        objArr[0] = str;
        AnonymousClass1ET r0 = r6.key_;
        if (r0 == null) {
            r0 = AnonymousClass1ET.DEFAULT_INSTANCE;
        }
        objArr[1] = r0.id_;
        objArr[2] = r6.A0M();
        AnonymousClass000.A1O(objArr, C18310x6.A05(r6));
        String format = String.format(locale, "%s; key=%s, stub_type=%s, params=%d", objArr);
        C18260x0.A0u("IncrementalBackup/MessagesImporter/", format, AnonymousClass001.A0o(), th);
        if (th != null) {
            this.A00.A09("incremental-backup-importer-parsing-failed", AnonymousClass000.A0P(th, "; ex=", AnonymousClass000.A0l(format)), th);
        } else {
            this.A00.A0A("incremental-backup-importer-parsing-failed", false, format);
        }
    }

    public C47292d1(C55682qk r2, C622834k r3, AnonymousClass4F4 r4, C50632iV r5, C66543Lv r6, AnonymousClass313 r7, C620333f r8, AnonymousClass33H r9, C55832qz r10) {
        this.A00 = r2;
        this.A05 = r6;
        this.A08 = r9;
        this.A09 = r10;
        this.A04 = r5;
        this.A01 = r3;
        this.A07 = r8;
        this.A06 = r7;
        this.A03 = r4;
    }
}
