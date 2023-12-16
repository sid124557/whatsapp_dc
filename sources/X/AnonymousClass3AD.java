package X;

import android.view.MenuItem;
import com.whatsapp.R;

/* renamed from: X.3AD  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3AD implements C15590rc {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C194711h A01;
    public final /* synthetic */ AnonymousClass39D A02;
    public final /* synthetic */ AnonymousClass39M A03;

    public final boolean onMenuItemClick(MenuItem menuItem) {
        C194711h r7 = this.A01;
        AnonymousClass39D r6 = this.A02;
        int i = this.A00;
        AnonymousClass39M r4 = this.A03;
        if (menuItem == null) {
            return false;
        }
        int itemId = menuItem.getItemId();
        if (Integer.valueOf(itemId) == null) {
            return false;
        }
        if (itemId == R.id.fun_stickers_send) {
            r7.A0C.BGj(r6, Integer.valueOf(i), r4);
            return true;
        } else if (itemId == R.id.fun_stickers_favorite) {
            r7.A0B.invoke(r6, r4);
            return true;
        } else if (itemId != R.id.fun_stickers_report) {
            return false;
        } else {
            r7.A09.invoke(r6);
            return true;
        }
    }

    public /* synthetic */ AnonymousClass3AD(C194711h r1, AnonymousClass39D r2, AnonymousClass39M r3, int i) {
        this.A01 = r1;
        this.A02 = r2;
        this.A00 = i;
        this.A03 = r3;
    }
}
