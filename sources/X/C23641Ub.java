package X;

import com.whatsapp.jid.Jid;

/* renamed from: X.1Ub  reason: invalid class name and case insensitive filesystem */
public final class C23641Ub extends C56672sN {
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C23641Ub(X.C56612sH r13, X.C54292oU r14, X.AnonymousClass33p r15, X.AnonymousClass1VX r16, X.AnonymousClass4FV r17, X.AnonymousClass2WM r18, X.C84084Ay r19, X.AnonymousClass8JP r20, X.C186568vZ r21, X.AnonymousClass4FS r22) {
        /*
            r12 = this;
            r1 = r13
            r2 = r14
            r3 = r15
            r5 = r17
            r10 = r22
            X.C18260x0.A0f(r13, r14, r10, r5, r15)
            r7 = r19
            r8 = r20
            r9 = r21
            X.C18260x0.A0W(r9, r7, r8)
            r0 = 10
            r4 = r16
            X.C162457s7.A0J(r4, r0)
            r11 = 200740397(0xbf70e2d, float:9.516227E-32)
            r0 = r12
            r6 = r18
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23641Ub.<init>(X.2sH, X.2oU, X.33p, X.1VX, X.4FV, X.2WM, X.4Ay, X.8JP, X.8vZ, X.4FS):void");
    }

    public final void A0D(C372521n r9, Jid jid, Boolean bool, String str, String str2, String str3, int i) {
        C162457s7.A0J(r9, 2);
        String str4 = str;
        int i2 = i;
        A02(i, str);
        if (bool != null) {
            A05(i, "psl_is_draft", bool.booleanValue());
        }
        A04(i, "fetch_context", r9.contextName);
        A07(jid, str2, str3, str4, i2);
    }

    public final void A0C(int i, String str, String str2) {
        if (!(str == null || str.length() == 0)) {
            A04(i, "error_code", str);
        }
        if (str2 != null && str2.length() != 0) {
            A04(i, "error_message", str2);
        }
    }
}
