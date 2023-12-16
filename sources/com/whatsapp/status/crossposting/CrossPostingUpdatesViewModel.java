package com.whatsapp.status.crossposting;

import X.AnonymousClass0GH;
import X.AnonymousClass59Q;
import X.AnonymousClass5Gm;
import X.AnonymousClass5L2;
import X.AnonymousClass5S1;
import X.C05550Ty;
import X.C103305Mj;
import X.C104695Rz;
import X.C104715Sb;
import X.C104735Sd;
import X.C104745Se;
import X.C105125Tr;
import X.C113995mK;
import X.C116785qr;
import X.C1226265c;
import X.C15910sA;
import X.C162457s7;
import X.C17280vG;
import X.C18270x1;
import X.C18320x8;
import X.C61102zi;
import X.C65173Gm;
import com.whatsapp.bridge.wfal.WfalManager;

public final class CrossPostingUpdatesViewModel extends C05550Ty implements C17280vG {
    public C104715Sb A00;
    public C103305Mj A01;
    public final WfalManager A02;
    public final AnonymousClass5Gm A03 = new AnonymousClass5Gm(this);
    public final C116785qr A04 = new C116785qr(this);
    public final C1226265c A05;
    public final C65173Gm A06;
    public final C113995mK A07;
    public final AnonymousClass5L2 A08;
    public final C105125Tr A09;
    public final C104745Se A0A;

    public void A0C() {
        this.A01 = null;
        if (!this.A02.A02() && !this.A0A.A00()) {
            C65173Gm r0 = this.A06;
            r0.A01.A07(this.A05);
        }
    }

    public void BcK(AnonymousClass0GH r6, C15910sA r7) {
        C61102zi r2;
        Object obj;
        int A022 = C18320x8.A02(r6, 1);
        if (A022 != 0) {
            if (A022 != 1) {
                if (A022 == 5) {
                    if (this.A02.A02()) {
                        AnonymousClass5L2 r1 = this.A08;
                        r1.A00 = null;
                        r1.A03 = false;
                        r2 = r1.A08;
                        obj = r1.A05;
                    } else if (this.A0A.A00()) {
                        C105125Tr r12 = this.A09;
                        r12.A00 = null;
                        r12.A03 = false;
                        r2 = r12.A07;
                        obj = r12.A05;
                    } else {
                        return;
                    }
                    r2.A07(obj);
                }
            } else if (this.A02.A02()) {
                AnonymousClass5L2 r3 = this.A08;
                AnonymousClass5Gm r13 = this.A03;
                C162457s7.A0J(r13, 0);
                r3.A00 = r13;
                r3.A01 = new C104695Rz(false, false);
                AnonymousClass59Q r14 = AnonymousClass59Q.HIDE;
                r3.A02 = new C104735Sd(r14, r14, false, false);
                if (!r3.A03) {
                    r3.A03 = true;
                    r3.A08.A06(r3.A05);
                }
            } else if (this.A0A.A00()) {
                C105125Tr r22 = this.A09;
                C116785qr r15 = this.A04;
                C162457s7.A0J(r15, 0);
                r22.A00 = r15;
                r22.A01();
            }
        } else if (this.A0A.A00()) {
            C105125Tr r23 = this.A09;
            C116785qr r0 = this.A04;
            C162457s7.A0J(r0, 0);
            r23.A00 = r0;
            if (r23.A01 == null) {
                r23.A01 = new AnonymousClass5S1(false, false);
            }
            if (r23.A02 == null) {
                r23.A02 = new AnonymousClass5S1(false, false);
            }
        }
    }

    public final C104715Sb A0D() {
        C104715Sb r0 = this.A00;
        if (r0 != null) {
            return new C104715Sb(r0.A01, r0.A00, r0.A03, r0.A02);
        }
        throw C18270x1.A0S("crossPostingViewModelState");
    }

    public final void A0E(boolean z, boolean z2) {
        C104715Sb r1 = this.A00;
        if (r1 == null) {
            throw C18270x1.A0S("crossPostingViewModelState");
        } else if (r1.A01 != z || r1.A00 != z2) {
            r1.A01 = z;
            r1.A00 = z2;
            C103305Mj r0 = this.A01;
            if (r0 != null) {
                r0.A00();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0047, code lost:
        if (X.C18300x5.A0v(r6.A03).isEmpty() != false) goto L_0x0049;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public CrossPostingUpdatesViewModel(com.whatsapp.bridge.wfal.WfalManager r5, X.C65173Gm r6, X.C113995mK r7, X.AnonymousClass5L2 r8, X.C105125Tr r9, X.C104745Se r10) {
        /*
            r4 = this;
            X.C18260x0.A0f(r10, r7, r5, r9, r8)
            r0 = 6
            X.C162457s7.A0J(r6, r0)
            r4.<init>()
            r4.A0A = r10
            r4.A07 = r7
            r4.A02 = r5
            r4.A09 = r9
            r4.A08 = r8
            r4.A06 = r6
            r3 = 0
            X.6Ba r2 = new X.6Ba
            r2.<init>(r4, r3)
            r4.A05 = r2
            X.5qr r0 = new X.5qr
            r0.<init>(r4)
            r4.A04 = r0
            X.5Gm r0 = new X.5Gm
            r0.<init>(r4)
            r4.A03 = r0
            boolean r0 = r5.A02()
            boolean r0 = X.AnonymousClass001.A1T(r0)
            if (r0 != 0) goto L_0x0049
            boolean r0 = r10.A00()
            if (r0 != 0) goto L_0x0049
            java.util.Map r0 = r6.A03
            java.util.ArrayList r0 = X.C18300x5.A0v(r0)
            boolean r0 = r0.isEmpty()
            r1 = 1
            if (r0 == 0) goto L_0x004a
        L_0x0049:
            r1 = 0
        L_0x004a:
            X.5Sb r0 = new X.5Sb
            r0.<init>(r1, r1, r3, r3)
            r4.A00 = r0
            com.whatsapp.bridge.wfal.WfalManager r0 = r4.A02
            boolean r1 = r0.A02()
            r0 = 1
            if (r1 == r0) goto L_0x0065
            boolean r0 = r10.A00()
            if (r0 != 0) goto L_0x0065
            X.1iG r0 = r6.A01
            r0.A06(r2)
        L_0x0065:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.status.crossposting.CrossPostingUpdatesViewModel.<init>(com.whatsapp.bridge.wfal.WfalManager, X.3Gm, X.5mK, X.5L2, X.5Tr, X.5Se):void");
    }
}
