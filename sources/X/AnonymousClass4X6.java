package X;

import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;
import java.util.List;

/* renamed from: X.4X6  reason: invalid class name */
public final class AnonymousClass4X6 extends AnonymousClass0R6 {
    public AnonymousClass4q1 A00;
    public final C101045Dg A01;
    public final C69263Wi A02;
    public final C64773Ex A03;
    public final C105365Uq A04;
    public final AnonymousClass5YD A05;
    public final C179578jN A06;
    public final C179588jO A07;
    public final List A08 = AnonymousClass001.A0s();
    public final AnonymousClass66R A09;

    public /* bridge */ /* synthetic */ C05570Ua BQR(ViewGroup viewGroup, int i) {
        C162457s7.A0J(viewGroup, 0);
        if (i == 0) {
            C101045Dg r2 = this.A01;
            View A0I = C18310x6.A0I(C18280x3.A0D(viewGroup), viewGroup, R.layout.f8nameremoved, false);
            C105365Uq r4 = this.A04;
            C64333Db r1 = r2.A00.A03;
            return new C96954xJ(A0I, r4, C86634Kw.A0n(r1), (AnonymousClass5QQ) r1.A00.A85.get(), this);
        } else if (i == 1) {
            return new C136896nR(C18310x6.A0I(C86604Kt.A0D(viewGroup), viewGroup, R.layout.f8nameremoved, false));
        } else {
            if (i == 2) {
                return new C136886nQ(C18310x6.A0I(C86604Kt.A0D(viewGroup), viewGroup, R.layout.f8nameremoved, false));
            }
            if (i == 3 || i == 4 || i == 5) {
                return new C96944xI(C18310x6.A0I(C86604Kt.A0D(viewGroup), viewGroup, R.layout.f8nameremoved, false), this.A07);
            }
            throw AnonymousClass000.A0G("View type not supported ", AnonymousClass001.A0o(), i);
        }
    }

    public int A0G() {
        return this.A08.size();
    }

    public final void A0K() {
        List list = this.A08;
        if (C18310x6.A1X(list) && (C18300x5.A0c(list) instanceof C136836nL)) {
            list.remove(AnonymousClass002.A03(list));
            A08(AnonymousClass002.A03(list));
        }
    }

    public final void A0L(C95814uZ r8, boolean z, boolean z2) {
        C96934xH r1;
        List list = this.A08;
        C162457s7.A0J(list, 0);
        int i = 0;
        for (Object next : AnonymousClass002.A0J(list)) {
            int i2 = i + 1;
            if (i < 0) {
                throw C18280x3.A0X();
            }
            C1452374s r12 = (C1452374s) next;
            if ((r12 instanceof C96934xH) && (r1 = (C96934xH) r12) != null) {
                if (!C162457s7.A0P(r1.A02.A05(), r8)) {
                    i = i2;
                } else if (z) {
                    r1.A01 = false;
                } else if (z2 && !r1.A00.A0g) {
                    r1.A00 = this.A03.A0A(r8);
                }
            }
            this.A02.A0S(new C117705sM((Object) this, i, 47));
            i = i2;
        }
    }

    public final void A0M(List list) {
        C86604Kt.A1R(this.A00);
        AnonymousClass4q1 r3 = new AnonymousClass4q1(this.A08, list);
        ((C103445Mz) this.A09.getValue()).A02(new C1237969u(this, 0, list), r3);
        this.A00 = r3;
    }

    public /* bridge */ /* synthetic */ void BNf(C05570Ua r2, int i) {
        C125676Iy r22 = (C125676Iy) r2;
        C162457s7.A0J(r22, 0);
        r22.A07((C1452374s) this.A08.get(i));
    }

    public int getItemViewType(int i) {
        Object obj = this.A08.get(i);
        if (obj instanceof C96934xH) {
            return 0;
        }
        if (obj instanceof C136856nN) {
            return 1;
        }
        if (obj instanceof C136836nL) {
            return 2;
        }
        if (obj instanceof C136846nM) {
            return 3;
        }
        if (obj instanceof C136876nP) {
            return 4;
        }
        if (obj instanceof C136866nO) {
            return 5;
        }
        throw C73153f1.A00();
    }

    public AnonymousClass4X6(C101045Dg r3, C69263Wi r4, C64773Ex r5, C114015mM r6, C54292oU r7, AnonymousClass5YD r8, C179578jN r9, C179588jO r10, AnonymousClass4FS r11) {
        C18260x0.A0f(r6, r7, r11, r5, r4);
        C18260x0.A0U(r3, r8);
        this.A03 = r5;
        this.A02 = r4;
        this.A01 = r3;
        this.A05 = r8;
        this.A06 = r9;
        this.A07 = r10;
        this.A04 = r6.A06(r7.A00, "directory-adapter");
        this.A09 = C154517dI.A01(new C119985xr(r11));
    }
}
