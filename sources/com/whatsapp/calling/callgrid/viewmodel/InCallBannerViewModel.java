package com.whatsapp.calling.callgrid.viewmodel;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass0x9;
import X.AnonymousClass107;
import X.AnonymousClass1VX;
import X.AnonymousClass4L0;
import X.AnonymousClass4UC;
import X.AnonymousClass4VK;
import X.AnonymousClass5L7;
import X.AnonymousClass5ZU;
import X.AnonymousClass7Y6;
import X.C103925Oy;
import X.C106155Xv;
import X.C107305b5;
import X.C118285tI;
import X.C137956pX;
import X.C150477Qw;
import X.C18320x8;
import X.C56972sr;
import X.C64773Ex;
import X.C86614Ku;
import X.C97174xk;
import com.whatsapp.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class InCallBannerViewModel extends AnonymousClass4VK {
    public boolean A00 = false;
    public final C56972sr A01;
    public final C106155Xv A02;
    public final C97174xk A03;
    public final C118285tI A04;
    public final C64773Ex A05;
    public final AnonymousClass5ZU A06;
    public final AnonymousClass1VX A07;
    public final AnonymousClass107 A08;
    public final AnonymousClass4UC A09;
    public final AnonymousClass4UC A0A;
    public final AnonymousClass4UC A0B;
    public final AnonymousClass4UC A0C;
    public final AnonymousClass4UC A0D;
    public final AnonymousClass4UC A0E;

    public void A0C() {
        this.A03.A07(this);
    }

    public final AnonymousClass5L7 A0G(AnonymousClass5L7 r6, AnonymousClass5L7 r7) {
        int i = r6.A01;
        if (i != r7.A01) {
            return null;
        }
        ArrayList A0J = AnonymousClass002.A0J(r6.A07);
        for (Object A1T : r7.A07) {
            C86614Ku.A1T(A1T, A0J);
        }
        if (i == 3) {
            return A0H(A0J, r7.A00);
        }
        if (i == 2) {
            return A0I(A0J, r7.A00);
        }
        return null;
    }

    public final AnonymousClass5L7 A0H(List list, int i) {
        C150477Qw A042 = C107305b5.A04(this.A05, this.A06, list, 3, true);
        Objects.requireNonNull(A042);
        Object[] objArr = {A042};
        C137956pX r4 = new C137956pX(objArr, R.plurals.f9nameremoved, list.size());
        C103925Oy r1 = new C103925Oy(A042, new C137956pX(new Object[0], R.plurals.f9nameremoved, list.size()), 3, i);
        r1.A06 = true;
        r1.A05 = true;
        r1.A03.addAll(list);
        r1.A04 = true;
        r1.A02 = r4;
        return r1.A00();
    }

    public final AnonymousClass5L7 A0I(List list, int i) {
        C150477Qw A042 = C107305b5.A04(this.A05, this.A06, list, 3, true);
        Objects.requireNonNull(A042);
        C103925Oy r1 = new C103925Oy(A042, new C137956pX(AnonymousClass4L0.A0U(), R.plurals.f9nameremoved, list.size()), 2, i);
        r1.A05 = true;
        r1.A03.addAll(list);
        r1.A04 = true;
        return r1.A00();
    }

    public final void A0J(AnonymousClass5L7 r6) {
        if (!this.A00) {
            C118285tI r4 = this.A04;
            if (r4.isEmpty()) {
                r4.add(r6);
            } else {
                AnonymousClass5L7 r1 = (AnonymousClass5L7) r4.get(0);
                AnonymousClass5L7 A0G = A0G(r1, r6);
                if (A0G != null) {
                    r4.set(A0G, 0);
                } else {
                    int i = r1.A01;
                    int i2 = r6.A01;
                    if (i >= i2) {
                        r4.set(r6, 0);
                    } else {
                        for (int i3 = 1; i3 < r4.size(); i3++) {
                            if (i2 < ((AnonymousClass5L7) r4.get(i3)).A01) {
                                r4.add(i3, r6);
                                return;
                            }
                            AnonymousClass5L7 A0G2 = A0G((AnonymousClass5L7) r4.get(i3), r6);
                            if (A0G2 != null) {
                                r4.set(A0G2, i3);
                                return;
                            }
                        }
                        r4.add(r6);
                        return;
                    }
                }
            }
            this.A0D.A0G(r4.get(0));
        }
    }

    public InCallBannerViewModel(C56972sr r8, C106155Xv r9, C97174xk r10, C64773Ex r11, AnonymousClass5ZU r12, AnonymousClass1VX r13) {
        AnonymousClass4UC A0b = AnonymousClass0x9.A0b();
        this.A0D = A0b;
        AnonymousClass4UC A0b2 = AnonymousClass0x9.A0b();
        this.A0C = A0b2;
        AnonymousClass4UC A0b3 = AnonymousClass0x9.A0b();
        this.A0E = A0b3;
        AnonymousClass4UC A0b4 = AnonymousClass0x9.A0b();
        this.A09 = A0b4;
        this.A0A = AnonymousClass0x9.A0b();
        this.A0B = AnonymousClass0x9.A0b();
        this.A08 = AnonymousClass4L0.A0O(new AnonymousClass7Y6(R.dimen.f6nameremoved, 0));
        this.A07 = r13;
        this.A01 = r8;
        this.A05 = r11;
        this.A06 = r12;
        A0b3.A0H(Boolean.FALSE);
        C18320x8.A18(A0b4, false);
        A0b2.A0H(AnonymousClass001.A0s());
        A0b.A0H((Object) null);
        this.A04 = new C118285tI(this);
        this.A03 = r10;
        this.A02 = r9;
        r10.A06(this);
    }
}
