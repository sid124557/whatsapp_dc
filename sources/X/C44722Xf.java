package X;

import java.security.MessageDigest;

/* renamed from: X.2Xf  reason: invalid class name and case insensitive filesystem */
public final class C44722Xf {
    public final C620533h A00;
    public final AnonymousClass2G0 A01;

    public C44722Xf(C620533h r1, AnonymousClass2G0 r2) {
        C18260x0.A0Q(r1, r2);
        this.A00 = r1;
        this.A01 = r2;
    }

    public final String A00(C624134x r10) {
        StringBuilder A0o = AnonymousClass001.A0o();
        AnonymousClass2z0 r1 = r10.A1J;
        AnonymousClass2z0.A0A(r1, A0o);
        A0o.append(r1.A02);
        byte[] digest = MessageDigest.getInstance("MD5").digest(AnonymousClass0x2.A1a(AnonymousClass000.A0R(r1.A00, A0o)));
        C162457s7.A0H(digest);
        C825844d r6 = C825844d.A00;
        StringBuilder A0X = C18270x1.A0X(digest);
        A0X.append("");
        int i = 0;
        for (byte b : digest) {
            i++;
            if (i > 1) {
                A0X.append("");
            }
            A0X.append((CharSequence) r6.invoke(Byte.valueOf(b)));
        }
        A0X.append("");
        return C18290x4.A0o(A0X);
    }
}
