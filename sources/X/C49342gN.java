package X;

import android.net.Uri;
import java.util.List;

/* renamed from: X.2gN  reason: invalid class name and case insensitive filesystem */
public final class C49342gN {
    public final C834948q A00;
    public final AnonymousClass2CG A01;
    public final List A02;
    public final List A03;

    public AnonymousClass20C A00(String str) {
        String A0V;
        C834948q r5 = this.A00;
        Uri A002 = C624635d.A00(r5, str);
        if (A002 == null) {
            A0V = "Uri cannot be parsed so we block it.";
        } else {
            for (AnonymousClass2UQ A003 : this.A02) {
                if (A003.A00(A002)) {
                    return AnonymousClass20C.NAVIGATE;
                }
            }
            String scheme = A002.getScheme();
            String authority = A002.getAuthority();
            if (scheme == null) {
                scheme = "cannot parse";
            }
            if (authority == null) {
                authority = "cannot parse";
            }
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("Uri is blocked, scheme: ");
            A0o.append(scheme);
            A0V = AnonymousClass000.A0V(" , authority: ", authority, A0o);
        }
        r5.Bja("WebViewUriHandler", A0V, (Throwable) null);
        return AnonymousClass20C.BLOCKED;
    }

    public AnonymousClass20C A01(String str) {
        C834948q r3 = this.A00;
        Uri A002 = C624635d.A00(r3, str);
        if (A002 == null) {
            r3.Bja("WebViewUriHandler", "Uri cannot be parsed so we block it.", (Throwable) null);
            return AnonymousClass20C.BLOCKED;
        }
        for (C835048r r0 : this.A03) {
            Uri uri = ((AnonymousClass3Aw) r0).A00.A01;
            if (uri == null) {
                throw C18270x1.A0S("launchUri");
            } else if (A002.equals(uri)) {
                return AnonymousClass20C.LAUNCHED;
            }
        }
        return A00(str);
    }

    public C49342gN(C834948q r1, AnonymousClass2CG r2, List list, List list2) {
        this.A02 = list2;
        this.A03 = list;
        this.A00 = r1;
        this.A01 = r2;
    }
}
