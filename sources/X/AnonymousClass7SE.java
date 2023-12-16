package X;

import android.net.Uri;
import java.io.File;

/* renamed from: X.7SE  reason: invalid class name */
public final class AnonymousClass7SE {
    public final /* synthetic */ AnonymousClass7TX A00;
    public final /* synthetic */ File A01;

    public AnonymousClass7SE(AnonymousClass7TX r1, File file) {
        this.A00 = r1;
        this.A01 = file;
    }

    public final void A00(AnonymousClass9JJ r6) {
        C141756w5 r0;
        int ordinal = r6.ordinal();
        if (ordinal != 0) {
            AnonymousClass7TX r2 = this.A00;
            File file = this.A01;
            if (ordinal != 1) {
                r0 = C141756w5.INTERNAL_ERROR;
            } else {
                r0 = C141756w5.USER_CANCELLED;
            }
            r2.A00(r0);
            file.delete();
            return;
        }
        AnonymousClass7TX r22 = this.A00;
        String A0o = C18290x4.A0o(Uri.fromFile(this.A01));
        C835248t r3 = r22.A03;
        if (r3 != null) {
            C153427bI r1 = r22.A00;
            C131266dJ r23 = r22.A01;
            Object[] A0M = AnonymousClass002.A0M();
            C18280x3.A19(r1, A0o, A0M);
            C157157hp.A00(r23, new C157967jD(AnonymousClass8UF.A0o(A0M)), r3);
        }
    }
}
