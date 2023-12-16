package X;

import android.view.Menu;
import android.view.MenuItem;

/* renamed from: X.0ax  reason: invalid class name and case insensitive filesystem */
public class C07480ax implements C16910uE {
    public C16910uE A00;
    public final /* synthetic */ AnonymousClass040 A01;

    public C07480ax(AnonymousClass040 r1, C16910uE r2) {
        this.A01 = r1;
        this.A00 = r2;
    }

    public boolean BLz(MenuItem menuItem, AnonymousClass0R2 r3) {
        return this.A00.BLz(menuItem, r3);
    }

    public boolean BQL(Menu menu, AnonymousClass0R2 r3) {
        return this.A00.BQL(menu, r3);
    }

    public void BQw(AnonymousClass0R2 r5) {
        this.A00.BQw(r5);
        AnonymousClass040 r3 = this.A01;
        if (r3.A09 != null) {
            r3.A08.getDecorView().removeCallbacks(r3.A0O);
        }
        if (r3.A0K != null) {
            C04830Qv r0 = r3.A0M;
            if (r0 != null) {
                r0.A01();
            }
            C04830Qv A05 = C06560Yg.A05(r3.A0K);
            A05.A03(0.0f);
            r3.A0M = A05;
            A05.A0A(new C17580vo(this, 2));
        }
        C16440tP r1 = r3.A0j;
        if (r1 != null) {
            r1.Bdh(r3.A0J);
        }
        r3.A0J = null;
        AnonymousClass0V0.A02(r3.A07);
    }

    public boolean BYg(Menu menu, AnonymousClass0R2 r3) {
        AnonymousClass0V0.A02(this.A01.A07);
        return this.A00.BYg(menu, r3);
    }
}
