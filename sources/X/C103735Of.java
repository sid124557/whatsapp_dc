package X;

/* renamed from: X.5Of  reason: invalid class name and case insensitive filesystem */
public class C103735Of {
    public final C64393Dh A00;
    public final C56612sH A01;
    public final C56982ss A02;
    public final C60302yK A03;
    public final C104675Rx A04;
    public final C103725Oe A05;
    public final AnonymousClass4FS A06;

    public final boolean A00(Long l) {
        if (l == null || this.A01.A0H() - l.longValue() > 1296000000) {
            return true;
        }
        return false;
    }

    public C103735Of(C64393Dh r9, C56612sH r10, C56982ss r11, C613830m r12, AnonymousClass319 r13, C72303dV r14, C60302yK r15, C55832qz r16, C33141sV r17, AnonymousClass4FS r18, C34441vA r19) {
        this.A01 = r10;
        this.A06 = r18;
        this.A02 = r11;
        this.A00 = r9;
        this.A03 = r15;
        C104675Rx r5 = new C104675Rx(r10, r19);
        this.A04 = r5;
        this.A05 = new C103725Oe(r11, r12, r13, r14, r5, r16, r17);
    }
}
