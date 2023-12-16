package X;

/* renamed from: X.1SH  reason: invalid class name */
public class AnonymousClass1SH extends AnonymousClass33W {
    public final int A00;

    public AnonymousClass1SH(AnonymousClass33J r10, String str, String str2, int i, long j, boolean z) {
        super(C60642yt.A03, r10, str, str2, 3, j, z);
        this.A00 = i;
    }

    public AnonymousClass18L A06() {
        AnonymousClass18L A06 = super.A06();
        C626936e.A06(A06);
        C130546c9 A0G = C21051Ai.DEFAULT_INSTANCE.A0G();
        int i = this.A00;
        C21051Ai r1 = (C21051Ai) C18320x8.A0C(A0G);
        r1.bitField0_ |= 1;
        r1.expiredKeyEpoch_ = i;
        AnonymousClass1EO r12 = (AnonymousClass1EO) C18320x8.A0C(A06);
        C21051Ai r0 = (C21051Ai) A0G.A06();
        r0.getClass();
        r12.keyExpiration_ = r0;
        r12.bitField0_ |= 16384;
        return A06;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        AnonymousClass33W.A02(this, "SentinelMutation{rowId=", A0o);
        A0o.append(", expiredKeyEpoch=");
        A0o.append(this.A00);
        AnonymousClass33W.A03(this, A0o);
        AnonymousClass33W.A04(this, A0o);
        return AnonymousClass000.A0Q(this.A00, A0o);
    }
}
