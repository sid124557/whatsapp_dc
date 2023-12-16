package com.whatsapp.newsletter.viewmodel;

import X.AnonymousClass08M;
import X.AnonymousClass0GH;
import X.AnonymousClass21F;
import X.AnonymousClass4DE;
import X.AnonymousClass4GP;
import X.AnonymousClass5UP;
import X.AnonymousClass8SE;
import X.C05550Ty;
import X.C104605Rq;
import X.C104935Sx;
import X.C106855aH;
import X.C113835m4;
import X.C120015xu;
import X.C120025xv;
import X.C136766nE;
import X.C136776nF;
import X.C136786nG;
import X.C15910sA;
import X.C162457s7;
import X.C17280vG;
import X.C18260x0;
import X.C18300x5;
import X.C18320x8;
import X.C29311ic;
import X.C56842se;
import X.C70113Zy;
import X.C73153f1;
import X.C95804uY;
import com.whatsapp.R;
import java.util.Collection;
import java.util.Iterator;

public class NewsletterListViewModel extends C05550Ty implements C17280vG, AnonymousClass4DE {
    public final AnonymousClass08M A00 = AnonymousClass08M.A01();
    public final AnonymousClass08M A01 = AnonymousClass08M.A01();
    public final C29311ic A02;
    public final C113835m4 A03;
    public final C56842se A04;

    public final void A0E(C95804uY r5) {
        C162457s7.A0J(r5, 0);
        C56842se r3 = this.A04;
        AnonymousClass5UP r1 = r3.A0E;
        if (C18300x5.A1S(r1) && C106855aH.A04(r3.A09, r5, r1)) {
            r3.A0Q.BkM(new C70113Zy(r3, 44, r5));
        }
    }

    public void BcK(AnonymousClass0GH r4, C15910sA r5) {
        int A022 = C18320x8.A02(r4, 1);
        if (A022 == 2) {
            A0F(new C120015xu(this), false);
        } else if (A022 == 3) {
            A0F(new C120025xv(this), true);
        }
    }

    public final int A0D(AnonymousClass21F r4, Throwable th) {
        int ordinal;
        AnonymousClass8SE r5;
        if (((th instanceof C136776nF) && (r5 = (AnonymousClass8SE) th) != null && r5.code == 419) || (ordinal = r4.ordinal()) == 2 || ordinal == 3 || ordinal == 0 || ordinal == 1) {
            return R.string.f11nameremoved;
        }
        throw C73153f1.A00();
    }

    public final void A0F(AnonymousClass4GP r4, boolean z) {
        Iterable A05 = this.A02.A05();
        boolean z2 = false;
        if (!(A05 instanceof Collection) || !((Collection) A05).isEmpty()) {
            Iterator it = A05.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (C162457s7.A0P(it.next(), this)) {
                        z2 = true;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        if (z2 == z) {
            r4.invoke();
        }
    }

    public void BLy(C95804uY r9, AnonymousClass21F r10, Throwable th) {
        int A0D;
        int A0D2;
        C95804uY r2 = r9;
        if (this.A03.A01(r9) != null) {
            boolean z = !(th instanceof C136776nF);
            boolean z2 = th instanceof C136766nE;
            boolean z3 = th instanceof C136786nG;
            AnonymousClass21F r3 = r10;
            if (z2) {
                A0D = R.string.f11nameremoved;
                A0D2 = R.string.f11nameremoved;
            } else {
                A0D = A0D(r10, th);
                if (z3) {
                    A0D2 = R.string.f11nameremoved;
                } else {
                    A0D2 = A0D(r10, th);
                }
            }
            this.A01.A0G(new C104935Sx(r2, r3, A0D, A0D2, z, z2));
        }
    }

    public void BM1(C95804uY r3, AnonymousClass21F r4) {
        this.A00.A0G(new C104605Rq(r3, r4));
        if (r4 == AnonymousClass21F.UNFOLLOW) {
            this.A04.A06(r3);
        }
    }

    public NewsletterListViewModel(C29311ic r2, C113835m4 r3, C56842se r4) {
        C18260x0.A0V(r3, r4, r2);
        this.A03 = r3;
        this.A04 = r4;
        this.A02 = r2;
    }
}
