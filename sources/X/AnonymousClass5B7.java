package X;

import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import com.whatsapp.HomeActivity;

/* renamed from: X.5B7  reason: invalid class name */
public final /* synthetic */ class AnonymousClass5B7 {
    public static Drawable A00(AnonymousClass640 r2, int i) {
        C003203q A0Q = ((C08310eF) r2).A0Q();
        if (!(A0Q instanceof AnonymousClass673)) {
            return null;
        }
        C162457s7.A0K(A0Q, "null cannot be cast to non-null type com.whatsapp.home.HomeActivityInterface");
        HomeActivity homeActivity = (HomeActivity) ((AnonymousClass673) A0Q);
        if (!C106545Zk.A00(homeActivity.A0D)) {
            return null;
        }
        return C107335b8.A05(homeActivity, i, C106545Zk.A03(homeActivity.A0D));
    }

    public static void A01(MenuItem menuItem, AnonymousClass640 r2, int i) {
        menuItem.setIcon(A00(r2, i));
    }
}
