package X;

import com.whatsapp.jid.UserJid;
import java.util.Set;

/* renamed from: X.1qK  reason: invalid class name and case insensitive filesystem */
public final class C32391qK extends AnonymousClass3PB {
    public final C55682qk A00;
    public final AnonymousClass32U A01;

    public C32391qK(C55682qk r2, AnonymousClass32U r3) {
        C162457s7.A0J(r2, 1);
        this.A00 = r2;
        this.A01 = r3;
    }

    public void AyB(C52952mJ r4, AnonymousClass1A3 r5, C624134x r6) {
        C30961nV r2;
        String rawString;
        C162457s7.A0J(r6, 0);
        C18260x0.A0Q(r5, r4);
        if (!(r6 instanceof C30961nV) || (r2 = (C30961nV) r6) == null) {
            throw AnonymousClass24A.A00(0);
        }
        super.AyB(r4, r5, r6);
        r5.A0C(AnonymousClass23Q.A01);
        String str = r2.A01;
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        r5.A0D(str);
        UserJid userJid = r2.A00;
        if (!(userJid == null || (rawString = userJid.getRawString()) == null)) {
            str2 = rawString;
        }
        r5.A0D(str2);
    }

    public C624134x BgV(C50972j4 r7, AnonymousClass1ES r8) {
        AnonymousClass23Q A0M = r8.A0M();
        if (A0M == AnonymousClass23Q.A01) {
            C30961nV r4 = new C30961nV(this.A01.A02(r8), AnonymousClass32U.A00(r8));
            r4.A1G(5);
            r4.A0J = r4.A0K;
            r4.A00 = r8.revokeMessageTimestamp_;
            if (C18310x6.A05(r8) > 1) {
                String A0n = AnonymousClass001.A0n(r8.messageStubParameters_, 0);
                if (AnonymousClass0x7.A06(A0n) > 0) {
                    r4.A01 = A0n;
                }
                UserJid A06 = AnonymousClass32Y.A06(r8, 1);
                if (A06 != null) {
                    r4.A1v(A06);
                } else {
                    C55682qk r2 = this.A00;
                    StringBuilder A0o = AnonymousClass001.A0o();
                    A0o.append("build=");
                    r2.A0A("FMessageAdminRevokedHistorySync/nullAdminJid", true, AnonymousClass000.A0X("beta", A0o));
                    return r4;
                }
            }
            return r4;
        }
        throw AnonymousClass24W.A01(0, AnonymousClass000.A0P(A0M, "Unexpected stub type: ", AnonymousClass001.A0o()));
    }

    public Set B80() {
        return C18290x4.A13(AnonymousClass23Q.A01);
    }
}
