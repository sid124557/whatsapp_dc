package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.Menu;
import android.view.MenuItem;
import com.whatsapp.R;
import com.whatsapp.WaImageButton;

/* renamed from: X.5gF  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C110445gF implements C15790rw {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ Menu A02;
    public final /* synthetic */ MenuItem A03;
    public final /* synthetic */ WaImageButton A04;
    public final /* synthetic */ C92274mN A05;

    public final void AwB(Object obj) {
        C92274mN r4 = this.A05;
        Menu menu = this.A02;
        Context context = this.A01;
        int i = this.A00;
        WaImageButton waImageButton = this.A04;
        MenuItem menuItem = this.A03;
        AnonymousClass3ZH r9 = (AnonymousClass3ZH) obj;
        if (r9 == null) {
            menu.removeItem(32);
            return;
        }
        Bitmap A032 = r4.A0I.A03(context, r9, 0.0f, i, false);
        if (A032 != null) {
            waImageButton.setImageDrawable(r4.A0S.A01(context.getResources(), A032, new AnonymousClass922(1)));
        } else {
            AnonymousClass5UX r2 = r4.A0F;
            r2.A05(waImageButton, -2.14748365E9f, r2.A00(r9), i);
        }
        r4.A06(menuItem, R.string.f11nameremoved, true);
    }

    public /* synthetic */ C110445gF(Context context, Menu menu, MenuItem menuItem, WaImageButton waImageButton, C92274mN r5, int i) {
        this.A05 = r5;
        this.A02 = menu;
        this.A01 = context;
        this.A00 = i;
        this.A04 = waImageButton;
        this.A03 = menuItem;
    }
}
