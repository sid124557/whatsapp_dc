package X;

import android.view.MenuItem;
import java.lang.ref.WeakReference;

/* renamed from: X.5eM  reason: invalid class name and case insensitive filesystem */
public class C109275eM implements MenuItem.OnMenuItemClickListener {
    public WeakReference A00;

    public boolean onMenuItemClick(MenuItem menuItem) {
        WeakReference weakReference = this.A00;
        if (weakReference.get() == null || menuItem == null) {
            return false;
        }
        int itemId = menuItem.getItemId();
        C113245l7 r0 = ((C93064np) weakReference.get()).A03;
        if (itemId == 7) {
            r0.A2R();
            return true;
        }
        for (C185008su BXQ : r0.A7M) {
            if (BXQ.BXQ(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public C109275eM(C93064np r2) {
        this.A00 = AnonymousClass0x9.A14(r2);
    }
}
