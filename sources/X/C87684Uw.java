package X;

/* renamed from: X.4Uw  reason: invalid class name and case insensitive filesystem */
public final class C87684Uw extends C05550Ty {
    public final C06270Wx A00;
    public final AnonymousClass5TN A01;
    public final C56612sH A02;
    public final AnonymousClass33p A03;
    public final AnonymousClass107 A04;

    public C87684Uw(C69263Wi r12, AnonymousClass5TN r13, C56612sH r14, AnonymousClass33p r15, boolean z) {
        boolean z2 = true;
        C18260x0.A0Z(r14, r15, r12, 1);
        this.A02 = r14;
        this.A03 = r15;
        this.A01 = r13;
        AnonymousClass107 A0O = AnonymousClass4L0.A0O(new AnonymousClass5XX(false, true, false, false, false));
        this.A04 = A0O;
        C06270Wx A012 = C05110Rz.A01(C05110Rz.A00(new AnonymousClass923(3), A0O));
        this.A00 = A012;
        AnonymousClass5XX r1 = (AnonymousClass5XX) C86634Kw.A0v(A0O);
        A0O.A0H(new AnonymousClass5XX(r1.A04, r1.A01, r13.A02, z, (!r13.A04 || r13.A05) ? false : z2));
        A012.A0E(AnonymousClass4L0.A0G(new C1220662y(r12, C117625sE.A00(this, 18)), 223));
    }

    public final void A0D() {
        AnonymousClass107 r2 = this.A04;
        AnonymousClass5XX r1 = (AnonymousClass5XX) C86634Kw.A0v(r2);
        if (r1.A04) {
            r2.A0H(new AnonymousClass5XX(false, r1.A01, r1.A00, r1.A03, r1.A02));
        }
    }

    public final void A0E(boolean z) {
        AnonymousClass107 r1 = this.A04;
        boolean z2 = z;
        if (((AnonymousClass5XX) C86634Kw.A0v(r1)).A01 != z) {
            AnonymousClass5XX r0 = (AnonymousClass5XX) C86634Kw.A0v(r1);
            r1.A0H(new AnonymousClass5XX(r0.A04, z2, r0.A00, r0.A03, r0.A02));
            if (!z) {
                A0D();
            }
        }
    }
}
