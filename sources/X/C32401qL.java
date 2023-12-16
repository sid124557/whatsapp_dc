package X;

import java.util.Set;

/* renamed from: X.1qL  reason: invalid class name and case insensitive filesystem */
public final class C32401qL extends AnonymousClass3PB {
    public final AnonymousClass32U A00;
    public final C45012Yi A01;

    public C32401qL(AnonymousClass32U r2, C45012Yi r3) {
        C162457s7.A0J(r3, 2);
        this.A00 = r2;
        this.A01 = r3;
    }

    public void AyB(C52952mJ r4, AnonymousClass1A3 r5, C624134x r6) {
        C30441mS r1;
        C162457s7.A0J(r6, 0);
        C18260x0.A0Q(r5, r4);
        if (!(r6 instanceof C30951nU) || (r1 = (C30441mS) r6) == null) {
            throw AnonymousClass24A.A00(0);
        }
        super.AyB(r4, r5, r6);
        r5.A0C(AnonymousClass23Q.A2j);
        String str = r1.A01;
        if (str != null) {
            r5.A0D(str);
        }
    }

    public C624134x BgV(C50972j4 r7, AnonymousClass1ES r8) {
        String str;
        AnonymousClass23Q A0M = r8.A0M();
        if (A0M == AnonymousClass23Q.A2j) {
            AnonymousClass2z0 A02 = this.A00.A02(r8);
            long A002 = AnonymousClass32U.A00(r8);
            C30951nU r4 = new C30951nU(A02, A002);
            r4.A1G(5);
            r4.A0J = r4.A0K;
            r4.A00 = r8.revokeMessageTimestamp_;
            if (C18310x6.A05(r8) > 0) {
                str = AnonymousClass001.A0n(r8.messageStubParameters_, 0);
            } else {
                str = new C30951nU((C624134x) r4, AnonymousClass35J.A01(r4.A1J.A00, this.A01.A01), A002).A1J.A01;
            }
            r4.A01 = str;
            return r4;
        }
        throw AnonymousClass24W.A01(0, AnonymousClass000.A0P(A0M, "Unexpected stub type: ", AnonymousClass001.A0o()));
    }

    public Set B80() {
        return C18290x4.A13(AnonymousClass23Q.A2j);
    }
}
