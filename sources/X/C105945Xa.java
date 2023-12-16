package X;

import com.whatsapp.R;
import java.lang.ref.Reference;

/* renamed from: X.5Xa  reason: invalid class name and case insensitive filesystem */
public final class C105945Xa {
    public static final AnonymousClass21S A0A = AnonymousClass21S.A0G;
    public final C111095hX A00;
    public final C69263Wi A01;
    public final AnonymousClass5X8 A02;
    public final AnonymousClass5PU A03;
    public final AnonymousClass4FS A04;
    public final C29161iN A05;
    public final C183538qC A06;
    public final C183538qC A07;
    public final C183538qC A08;
    public final C183538qC A09;

    public final void A01(C109665ez r9, String str, int i, int i2, boolean z) {
        this.A01.BkS(new C117405rs(r9, this, str, i, i2, z));
    }

    public final void A02(String str) {
        C162457s7.A0J(str, 0);
        A01((C109665ez) null, str, R.string.f11nameremoved, 0, false);
    }

    public final C110065fd A00(C109665ez r6, String str, int i, int i2) {
        C1228966g r2;
        Reference reference = (Reference) this.A03.A00.get(str);
        C110065fd r3 = null;
        if (!(reference == null || (r2 = (C1228966g) reference.get()) == null || !r2.B6S().A00(AnonymousClass0GC.STARTED))) {
            r3 = r2.BD8(i, 3500, false);
            C162457s7.A0D(r3);
            if (!(r6 == null || i2 == 0)) {
                r3.A04(r6, i2);
                r3.A02(AnonymousClass5Yj.A02(r3.A03.A0J.getContext(), R.attr.f3nameremoved, R.color.f5nameremoved));
            }
        }
        return r3;
    }

    public C105945Xa(C111095hX r1, C69263Wi r2, AnonymousClass5X8 r3, AnonymousClass5PU r4, AnonymousClass4FS r5, C29161iN r6, C183538qC r7, C183538qC r8, C183538qC r9, C183538qC r10) {
        C18260x0.A0f(r2, r5, r4, r3, r1);
        C18260x0.A0g(r6, r7, r8, r9, r10);
        this.A01 = r2;
        this.A04 = r5;
        this.A03 = r4;
        this.A02 = r3;
        this.A00 = r1;
        this.A05 = r6;
        this.A08 = r7;
        this.A06 = r8;
        this.A09 = r9;
        this.A07 = r10;
    }
}
