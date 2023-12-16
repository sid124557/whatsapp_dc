package X;

/* renamed from: X.1SO  reason: invalid class name */
public class AnonymousClass1SO extends AnonymousClass33W {
    public final long A00;
    public final String A01;

    public AnonymousClass1SO(AnonymousClass33J r10, String str, String str2, long j, long j2, boolean z) {
        super(C60642yt.A03, r10, str, "regular_low", 7, j, z);
        this.A01 = str2;
        this.A00 = j2;
    }

    public AnonymousClass18L A06() {
        AnonymousClass18L A06 = super.A06();
        C626936e.A06(A06);
        C130546c9 A0G = C21131Aq.DEFAULT_INSTANCE.A0G();
        long j = this.A00;
        C21131Aq r1 = (C21131Aq) C18320x8.A0C(A0G);
        r1.bitField0_ |= 1;
        r1.lastStickerSentTs_ = j;
        AnonymousClass1EO r2 = (AnonymousClass1EO) C18320x8.A0C(A06);
        C21131Aq r0 = (C21131Aq) A0G.A06();
        r0.getClass();
        r2.removeRecentStickerAction_ = r0;
        r2.bitField0_ |= 268435456;
        return A06;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("RemoveRecentStickerMutation{fileHash=");
        A0o.append(this.A01);
        A0o.append("; ts=");
        A0o.append(this.A00);
        return AnonymousClass000.A0X("}", A0o);
    }
}
