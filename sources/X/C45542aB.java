package X;

/* renamed from: X.2aB  reason: invalid class name and case insensitive filesystem */
public final class C45542aB {
    public final C55732qp A00;
    public final C183538qC A01;
    public final C183538qC A02;

    public final void A00(AnonymousClass1nE r8, AnonymousClass4BM r9) {
        C183538qC r0;
        C162457s7.A0J(r8, 0);
        if (this.A00.A00(r8).A0J) {
            r0 = this.A01;
        } else {
            r0 = this.A02;
        }
        C27841el A0a = AnonymousClass0x9.A0a(r0);
        AnonymousClass39M A002 = A0a.A06.A00(r8);
        long j = r8.A03;
        boolean z = A002.A0J;
        boolean z2 = A0a.A0E;
        if (z != z2) {
            C18260x0.A1D("RecentStickers/addAsync separate avatar sticker with the normal one. isAvatarSticker=", AnonymousClass001.A0o(), z2);
        } else {
            A0a.A0C.execute(new C71443c7(r9, A0a, A002, j));
        }
    }

    public C45542aB(C55732qp r1, C183538qC r2, C183538qC r3) {
        C18260x0.A0V(r2, r3, r1);
        this.A02 = r2;
        this.A01 = r3;
        this.A00 = r1;
    }
}
