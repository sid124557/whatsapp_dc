package X;

/* renamed from: X.2em  reason: invalid class name and case insensitive filesystem */
public final class C48362em {
    public C69263Wi A00;
    public C183538qC A01;

    public final void A00(AnonymousClass49I r15, AnonymousClass49I r16, Object obj, String str, String str2, String str3, int i) {
        C183538qC r0 = this.A01;
        if (r0 != null) {
            AnonymousClass30P A0M = C18320x8.A0M(r0);
            C50912iy r5 = AnonymousClass2BX.A00;
            AnonymousClass49I r11 = r16;
            Object obj2 = obj;
            if (A0M.A01(r5) != null) {
                A01(r11, obj2);
                return;
            }
            C183538qC r02 = this.A01;
            if (r02 != null) {
                AnonymousClass30P A0M2 = C18320x8.A0M(r02);
                Integer valueOf = Integer.valueOf(i);
                C85944If r8 = new C85944If(this, r15, r11, obj2, 0);
                C85944If r3 = r8;
                ((C59532x4) A0M2.A03.get()).A01(r5, new AnonymousClass1VC(r8, r3, A0M2, r5, C54662p5.A00(), valueOf, str, str2, str3));
                return;
            }
            throw C18270x1.A0S("fbUserEntityManagementLazy");
        }
        throw C18270x1.A0S("fbUserEntityManagementLazy");
    }

    public final void A01(AnonymousClass49I r4, Object obj) {
        C69263Wi r2 = this.A00;
        if (r2 != null) {
            r2.BkS(new C117165rU(obj, 1, r4));
            return;
        }
        throw C18270x1.A0S("globalUI");
    }
}
