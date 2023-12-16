package X;

import android.view.MenuItem;
import com.whatsapp.R;

/* renamed from: X.5g9  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C110385g9 implements C15590rc {
    public final /* synthetic */ C109665ez A00;
    public final /* synthetic */ C109665ez A01;
    public final /* synthetic */ C109665ez A02;

    public final boolean onMenuItemClick(MenuItem menuItem) {
        C109665ez r4 = this.A00;
        C109665ez r3 = this.A01;
        C109665ez r2 = this.A02;
        int itemId = menuItem.getItemId();
        if (itemId == R.id.menuitem_delete) {
            r4.onClick(menuItem.getActionView());
            return true;
        } else if (itemId == R.id.menuitem_forward) {
            r3.onClick(menuItem.getActionView());
            return true;
        } else if (itemId != R.id.menuitem_share_status_facebook) {
            return true;
        } else {
            r2.onClick(menuItem.getActionView());
            return true;
        }
    }

    public /* synthetic */ C110385g9(C109665ez r1, C109665ez r2, C109665ez r3) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
    }
}
