package X;

/* renamed from: X.3Ou  reason: invalid class name and case insensitive filesystem */
public final class C67313Ou implements C84594Cy {
    public static final AnonymousClass27A A06 = new AnonymousClass27A();
    public final C56612sH A00;
    public final AnonymousClass30P A01;
    public final C50912iy A02;
    public final AnonymousClass27A A03;
    public final AnonymousClass4AN A04;
    public final C186568vZ A05;

    public void Bh4(AnonymousClass4EN r10) {
        C186568vZ r4 = this.A05;
        r4.markerStart(386138113);
        C50912iy r2 = this.A02;
        r4.markerAnnotate(386138113, "fb_user_type", r2.A00);
        AnonymousClass30P r8 = this.A01;
        C60272yH A012 = r8.A01(r2);
        if (A012 != null) {
            C56612sH r1 = this.A00;
            if (!AnonymousClass27B.A00(r1, A012, r2)) {
                AnonymousClass4AN r7 = this.A04;
                Long l = A012.A07;
                if (l == null || C56612sH.A00(r1) <= A012.A00 + l.longValue()) {
                    r7.B00(C18280x3.A0b(A012.A02)).Bh4(new C86434Kc(A012, this, r10, 0));
                    return;
                } else {
                    r8.A03(A012, new C85934Ie(this, 2, r10), (C54662p5) null);
                    return;
                }
            }
        }
        r8.A04(new C85934Ie(this, 1, r10), r2);
    }

    public C67313Ou(C56612sH r2, AnonymousClass30P r3, C50912iy r4, AnonymousClass27A r5, AnonymousClass4AN r6, C186568vZ r7) {
        C18260x0.A0c(r2, r3, r7, r4);
        C162457s7.A0J(r6, 6);
        this.A00 = r2;
        this.A01 = r3;
        this.A05 = r7;
        this.A02 = r4;
        this.A03 = r5;
        this.A04 = r6;
    }
}
