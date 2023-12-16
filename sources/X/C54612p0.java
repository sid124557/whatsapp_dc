package X;

/* renamed from: X.2p0  reason: invalid class name and case insensitive filesystem */
public final class C54612p0 {
    public final C69263Wi A00;
    public final C29351ig A01;
    public final C183538qC A02;

    public final void A02(AnonymousClass4DP r5, String str) {
        C162457s7.A0J(str, 1);
        if (A00() == null) {
            r5.onFailure(AnonymousClass001.A0e("Avatar user does not exist"));
            return;
        }
        C18320x8.A0M(this.A02).A06(new C85974Ii(r5, 2), AnonymousClass2BB.A00, (C54662p5) null, str);
    }

    public final C60272yH A00() {
        return C18320x8.A0M(this.A02).A01(AnonymousClass2BB.A00);
    }

    public C54612p0(C69263Wi r1, C29351ig r2, C183538qC r3) {
        C18260x0.A0V(r1, r2, r3);
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
    }

    public final void A01() {
        if (A00() != null) {
            AnonymousClass30P A0M = C18320x8.A0M(this.A02);
            ((AnonymousClass308) A0M.A00.get()).A03(AnonymousClass2BB.A00);
        }
    }
}
