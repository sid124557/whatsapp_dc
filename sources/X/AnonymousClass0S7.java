package X;

import java.io.File;

/* renamed from: X.0S7  reason: invalid class name */
public class AnonymousClass0S7 {
    public static AnonymousClass0UR A00(C56972sr r3, C06430Xr r4, AnonymousClass0WN r5, C56512s6 r6, C48502f0 r7, C48092eK r8, C48772fR r9, AnonymousClass22O r10, C622634i r11, File file, Boolean bool) {
        AnonymousClass22O r2 = r10;
        int A05 = r10.A05();
        C622634i r102 = r11;
        File file2 = file;
        if (A05 == AnonymousClass22O.UNENCRYPTED.A05()) {
            return new AnonymousClass0DE(r6, r8, r102, file);
        }
        if (A05 == AnonymousClass22O.CRYPT12.A05()) {
            return new AnonymousClass0DH(r3, r4, r5, r6, r7, r8, r9, r102, file2);
        }
        if (A05 == AnonymousClass22O.CRYPT13.A05()) {
            return new AnonymousClass0DF(r3, r4, r5, r6, r7, r8, r9, r102, file2);
        }
        Boolean bool2 = bool;
        if (A05 == AnonymousClass22O.CRYPT14.A05()) {
            return new AnonymousClass0DI(r3, r4, r5, r6, r7, r8, r9, r102, file2, bool2);
        }
        if (A05 == AnonymousClass22O.CRYPT15.A05()) {
            return new AnonymousClass0DG(r3, r4, r5, r6, r7, r8, r9, r102, file2, bool2);
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("BackupFile/verify-integrity/unknown-version: ");
        A0o.append(r2);
        r9.A01(AnonymousClass000.A0P(file2, " ", A0o), 4);
        throw AnonymousClass002.A0C("BackupFile/verify-integrity/unknown-version");
    }

    public static AnonymousClass0UR A01(C56972sr r2, AnonymousClass0WN r3, C56512s6 r4, C48502f0 r5, C48092eK r6, C48772fR r7, AnonymousClass22O r8, C622634i r9, File file) {
        return A00(r2, (C06430Xr) null, r3, r4, r5, r6, r7, r8, r9, file, (Boolean) null);
    }
}
