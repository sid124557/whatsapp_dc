package X;

import android.view.MenuItem;
import androidx.appcompat.widget.ActionMenuView;

/* renamed from: X.0b0  reason: invalid class name */
public class AnonymousClass0b0 implements C16460tR {
    public final /* synthetic */ ActionMenuView A00;

    public AnonymousClass0b0(ActionMenuView actionMenuView) {
        this.A00 = actionMenuView;
    }

    public boolean BWQ(MenuItem menuItem, C07890cz r4) {
        C15610re r0;
        C14500pn r02 = this.A00.A09;
        if (r02 == null || (r0 = ((C07550bD) r02).A00.A0R) == null || !r0.onMenuItemClick(menuItem)) {
            return false;
        }
        return true;
    }

    public void BWR(C07890cz r2) {
        C16460tR r0 = this.A00.A05;
        if (r0 != null) {
            r0.BWR(r2);
        }
    }
}
