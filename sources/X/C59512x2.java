package X;

import java.util.List;
import java.util.concurrent.Future;

/* renamed from: X.2x2  reason: invalid class name and case insensitive filesystem */
public final class C59512x2 {
    public final int A00;
    public final AnonymousClass227 A01;
    public final List A02;
    public final boolean A03;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0008, code lost:
        if (r3 == X.AnonymousClass227.A01) goto L_0x000a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C59512x2 A00(X.AnonymousClass227 r3, com.whatsapp.jid.UserJid r4, java.lang.String r5, int r6, boolean r7, boolean r8, boolean r9) {
        /*
            X.227 r0 = X.AnonymousClass227.A0D
            r2 = 1
            if (r3 == r0) goto L_0x000a
            X.227 r1 = X.AnonymousClass227.A01
            r0 = 0
            if (r3 != r1) goto L_0x000b
        L_0x000a:
            r0 = 1
        L_0x000b:
            X.C626936e.A0C(r0)
            X.32q r0 = new X.32q
            r0.<init>(r4, r5)
            r0.A0C = r2
            r0.A0L = r2
            r0.A0J = r2
            r0.A0E = r8
            r0.A0B = r2
            r0.A0F = r2
            r0.A0H = r2
            r0.A0N = r7
            r0.A0M = r9
            X.2UM r0 = r0.A03()
            java.util.List r1 = java.util.Collections.singletonList(r0)
            X.2x2 r0 = new X.2x2
            r0.<init>(r3, r1, r6, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59512x2.A00(X.227, com.whatsapp.jid.UserJid, java.lang.String, int, boolean, boolean, boolean):X.2x2");
    }

    public C59512x2(AnonymousClass227 r1, List list, int i, boolean z) {
        this.A01 = r1;
        this.A02 = list;
        this.A03 = z;
        this.A00 = i;
    }

    public static Future A01(AnonymousClass227 r4, C68403Ta r5, String str, List list, int i) {
        return r5.A04(new C59512x2(r4, list, i, false), C621733w.A00(str), 64000);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("[mode=");
        AnonymousClass227 r2 = this.A01;
        StringBuilder A0A = C18330xA.A0A(AnonymousClass000.A0X(r2.mode.modeString, A0o));
        A0A.append(" context=");
        A0A.append(r2.context.contextString);
        A0A.append(" requests=");
        A0A.append(this.A02.size());
        return AnonymousClass000.A0f(A0A);
    }
}
