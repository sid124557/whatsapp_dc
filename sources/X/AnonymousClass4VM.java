package X;

import java.util.Collections;
import java.util.Objects;

/* renamed from: X.4VM  reason: invalid class name */
public class AnonymousClass4VM extends C05550Ty {
    public final AnonymousClass08J A00;
    public final C102585Jk A01;
    public final C27991fJ A02;
    public final AnonymousClass4UC A03;
    public final AnonymousClass4UC A04;
    public final AnonymousClass4UC A05;

    public void A0D() {
        AnonymousClass0x7.A18(this.A05);
        C102585Jk r8 = this.A01;
        C27991fJ r4 = this.A02;
        C71553cI r10 = new C71553cI((Object) this, 27);
        AnonymousClass6A8 r6 = new AnonymousClass6A8(this, 1);
        AnonymousClass6A8 r5 = new AnonymousClass6A8(this, 2);
        AnonymousClass6A8 r7 = new AnonymousClass6A8(this, 2);
        AnonymousClass31C r11 = r8.A04;
        String A032 = r11.A03();
        C35721xK r9 = new C35721xK(new C35381wm(new C35381wm(A032, 8), 10), new C35381wm(Collections.emptyList(), Collections.singletonList(new C35251wZ(new C35391wn(r4, 0)))), 21);
        r11.A0D(new AnonymousClass8JI(r5, r6, r7, r8, r9, r10), r9.A00, A032, 16, C625635p.A0L);
    }

    public final void A0E(int i) {
        AnonymousClass4UC r0;
        AnonymousClass0x9.A1I(this.A05);
        int i2 = 2;
        if (i == 0) {
            r0 = this.A03;
        } else if (i == 1) {
            r0 = this.A03;
            i2 = 3;
        } else if (i == 2) {
            r0 = this.A03;
            i2 = 4;
        } else {
            return;
        }
        C06270Wx.A04(r0, i2);
    }

    public AnonymousClass4VM(C102585Jk r5, C27991fJ r6) {
        AnonymousClass4UC r3 = new AnonymousClass4UC(C18290x4.A0Z());
        this.A03 = r3;
        Boolean bool = Boolean.FALSE;
        this.A05 = new AnonymousClass4UC(bool);
        this.A04 = new AnonymousClass4UC(bool);
        AnonymousClass08J A0E = AnonymousClass4L0.A0E();
        this.A00 = A0E;
        this.A01 = r5;
        this.A02 = r6;
        Objects.requireNonNull(A0E);
        A0E.A0J(r3, new AnonymousClass4K2(A0E, 28));
    }
}
