package X;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.2xQ  reason: invalid class name and case insensitive filesystem */
public final class C59752xQ {
    public final C69263Wi A00;
    public final C65203Gp A01;
    public final C64773Ex A02;
    public final C104195Qa A03;
    public final AnonymousClass5XZ A04;
    public final C105245Ud A05;
    public final AnonymousClass4E4 A06;
    public final AnonymousClass7DW A07;
    public final C64223Cq A08;
    public final AnonymousClass4FS A09;

    public final void A01(C51602k5 r15, C95814uZ r16, Long l, String str, String str2) {
        AnonymousClass4FS r2;
        C70203a7 r1;
        String str3 = str;
        C162457s7.A0J(str3, 1);
        boolean A1W = AnonymousClass000.A1W(r15);
        C95814uZ r12 = r16;
        if (r16 != null) {
            AnonymousClass3ZH r10 = new AnonymousClass3ZH(r12);
            C64773Ex r4 = this.A02;
            ArrayList A0D = r4.A05.A0D(r12);
            AnonymousClass5XZ r13 = this.A04;
            r10.A0R = r13.A01();
            r10.A0Q = r13.A03();
            r10.A0P = r13.A02();
            r10.A0t = true;
            if (l != null) {
                r10.A0N(l.longValue());
            }
            if (this.A07.A00.isChecked()) {
                r10.A07 = 0;
            } else {
                r10.A07 = 1;
            }
            if (A1W) {
                AnonymousClass3ZH r122 = null;
                if (str2 != null) {
                    C105245Ud r22 = this.A05;
                    String str4 = r22.A01;
                    String A012 = r22.A01();
                    if (str4 != null ? !str4.equals(A012) : A012 != null) {
                        if (l != null) {
                            AnonymousClass3ZH A042 = r4.A04(l.longValue());
                            if (A042 != null) {
                                ArrayList A0s = AnonymousClass001.A0s();
                                Iterator it = A0D.iterator();
                                while (it.hasNext()) {
                                    Object next = it.next();
                                    if (((AnonymousClass3ZH) next).A0Q()) {
                                        A0s.add(next);
                                    }
                                }
                                int size = A0s.size();
                                AnonymousClass4FS r3 = this.A09;
                                int i = 14;
                                if (size > 1) {
                                    i = 13;
                                }
                                C70203a7.A00(r3, this, A042, i);
                            }
                        } else {
                            return;
                        }
                    }
                }
                r10.A0F = r15;
                if (!(l == null || (r122 = r4.A04(l.longValue())) == null)) {
                    r10.A0l = r122.A0l;
                }
                Iterator it2 = A0D.iterator();
                while (it2.hasNext()) {
                    if (A00(C18310x6.A0R(it2), r10)) {
                        this.A06.Bak(C18320x8.A07());
                        return;
                    }
                }
                ArrayList A0s2 = AnonymousClass001.A0s();
                Iterator it3 = A0D.iterator();
                while (it3.hasNext()) {
                    Object next2 = it3.next();
                    if (((AnonymousClass3ZH) next2).A0F() != r10.A0F()) {
                        A0s2.add(next2);
                    }
                }
                ArrayList A0J = AnonymousClass002.A0J(A0s2);
                A0J.add(r10);
                this.A09.BkM(new C71593cM((Object) this, (Object) r10, (Object) A0J, (Object) r122, 31));
                return;
            }
            r10.A0F = new C51602k5(-5, str3);
            ArrayList A0s3 = AnonymousClass001.A0s();
            Iterator it4 = A0D.iterator();
            while (it4.hasNext()) {
                if (A00(C18310x6.A0R(it4), r10)) {
                    this.A06.Bak(C18320x8.A07());
                    return;
                }
            }
            ArrayList A0s4 = AnonymousClass001.A0s();
            Iterator it5 = A0D.iterator();
            while (it5.hasNext()) {
                Object next3 = it5.next();
                if (((AnonymousClass3ZH) next3).A0Q()) {
                    A0s4.add(next3);
                }
            }
            boolean z = false;
            if (!A0s4.isEmpty()) {
                Iterator it6 = A0s4.iterator();
                while (true) {
                    if (it6.hasNext()) {
                        if (C18310x6.A0R(it6).A0l) {
                            z = true;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            if (A0s4.isEmpty()) {
                r2 = this.A09;
                r1 = new C70203a7(this, 15, r10);
            } else {
                r10.A0l = z;
                A0s3.add(r10);
                A0s3.addAll(A0s4);
                r2 = this.A09;
                r1 = new C70203a7(this, 16, A0s3);
            }
            r2.BkM(r1);
        }
    }

    public C59752xQ(C69263Wi r2, C65203Gp r3, C64773Ex r4, C104195Qa r5, AnonymousClass5XZ r6, C105245Ud r7, AnonymousClass4E4 r8, AnonymousClass7DW r9, C64223Cq r10, AnonymousClass4FS r11) {
        C18260x0.A0f(r2, r11, r3, r4, r10);
        C162457s7.A0J(r6, 7);
        C18260x0.A0X(r9, r5, r7);
        this.A00 = r2;
        this.A09 = r11;
        this.A01 = r3;
        this.A02 = r4;
        this.A08 = r10;
        this.A06 = r8;
        this.A04 = r6;
        this.A07 = r9;
        this.A03 = r5;
        this.A05 = r7;
    }

    public static final boolean A00(AnonymousClass3ZH r3, AnonymousClass3ZH r4) {
        String A0J = r3.A0J();
        String A0J2 = r4.A0J();
        if (A0J == null) {
            if (A0J2 != null) {
                return false;
            }
        } else if (!A0J.equals(A0J2)) {
            return false;
        }
        C51602k5 r0 = r3.A0F;
        C162457s7.A0H(r0);
        String str = r0.A01;
        C51602k5 r02 = r4.A0F;
        C162457s7.A0H(r02);
        if (str.equals(r02.A01)) {
            return true;
        }
        return false;
    }
}
