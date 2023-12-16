package X;

import android.view.MenuItem;
import com.whatsapp.HomeActivity;

/* renamed from: X.6A0  reason: invalid class name */
public class AnonymousClass6A0 implements C16460tR {
    public Object A00;
    public final int A01;

    public AnonymousClass6A0(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public boolean BWQ(MenuItem menuItem, C07890cz r7) {
        if (this.A01 != 0) {
            return false;
        }
        AnonymousClass4P2 r2 = (AnonymousClass4P2) this.A00;
        if (r2.A01 == null || menuItem.getItemId() != r2.A04.A0A) {
            C178878iF r0 = r2.A02;
            if (r0 == null) {
                return false;
            }
            HomeActivity homeActivity = ((C170068Bt) r0).A00;
            homeActivity.A06 = menuItem.getItemId();
            homeActivity.A0k.A0F(HomeActivity.A0C(menuItem.getItemId()), false);
            homeActivity.A7E();
            C18270x1.A0v(homeActivity.A07.A00, "bottom_nav_tooltip_seen", true);
            C86644Kx.A1P(homeActivity.A1K);
            return false;
        }
        ((C170058Bs) r2.A01).A00.A0k.setCurrentItem(HomeActivity.A0C(menuItem.getItemId()));
        return true;
    }

    public void BWR(C07890cz r2) {
        if (this.A01 != 0) {
            ((C08310eF) this.A00).A0x(r2);
        }
    }
}
