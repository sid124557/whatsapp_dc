package X;

import android.content.Context;
import android.view.MenuItem;

/* renamed from: X.0N8  reason: invalid class name */
public abstract class AnonymousClass0N8 {
    public C06290Wz A00;
    public final Context A01;

    public final MenuItem A00(MenuItem menuItem) {
        if (!(menuItem instanceof C17230vB)) {
            return menuItem;
        }
        C17230vB r1 = (C17230vB) menuItem;
        C06290Wz r0 = this.A00;
        if (r0 == null) {
            r0 = new C06290Wz();
            this.A00 = r0;
        }
        MenuItem menuItem2 = (MenuItem) r0.get(menuItem);
        if (menuItem2 != null) {
            return menuItem2;
        }
        AnonymousClass04I r3 = new AnonymousClass04I(this.A01, r1);
        this.A00.put(r1, r3);
        return r3;
    }

    public AnonymousClass0N8(Context context) {
        this.A01 = context;
    }
}
