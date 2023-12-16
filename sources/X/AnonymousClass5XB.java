package X;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Rect;
import android.view.View;

/* renamed from: X.5XB  reason: invalid class name */
public class AnonymousClass5XB {
    public int A00 = 2;
    public C95814uZ A01;
    public Double A02;
    public Double A03;
    public String A04;
    public boolean A05;
    public final Rect A06;
    public final C95814uZ A07;
    public final Integer A08;

    public static AnonymousClass5XB A00(View view, C95814uZ r3, Integer num) {
        AnonymousClass5XB r1 = new AnonymousClass5XB(view, r3, num);
        r1.A04 = AnonymousClass0YZ.A06(view);
        return r1;
    }

    public void A02(Activity activity) {
        if (activity != null) {
            AnonymousClass0RN.A00(activity, A01(activity), C05880Vi.A00().A02());
            activity.overridePendingTransition(0, 0);
        }
    }

    public AnonymousClass5XB(View view, C95814uZ r8, Integer num) {
        this.A07 = r8;
        this.A08 = num;
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        Rect A0N = AnonymousClass001.A0N();
        int i = iArr[0];
        A0N.left = (int) ((((float) i) * 1.0f) + 0.5f);
        A0N.top = (int) ((((float) iArr[1]) * 1.0f) + 0.5f);
        A0N.right = (int) ((((float) (i + view.getWidth())) * 1.0f) + 0.5f);
        A0N.bottom = (int) ((((float) C86634Kw.A09(view, iArr)) * 1.0f) + 0.5f);
        this.A06 = A0N;
    }

    public Intent A01(Activity activity) {
        Integer num;
        Integer valueOf = Integer.valueOf(activity.getWindow().getStatusBarColor());
        if (C107385bE.A05()) {
            num = Integer.valueOf(activity.getWindow().getNavigationBarColor());
        } else {
            num = null;
        }
        Integer num2 = this.A08;
        String str = this.A04;
        Rect rect = this.A06;
        boolean z = this.A05;
        C95814uZ r9 = this.A01;
        Double d = this.A02;
        Double d2 = this.A03;
        C95814uZ r5 = this.A07;
        int i = this.A00;
        Intent A072 = C18320x8.A07();
        A072.setClassName(activity.getPackageName(), "com.whatsapp.quickcontact.QuickContactActivity");
        if (num2 != null) {
            A072.putExtra("profile_entry_point", num2);
        }
        if (str != null) {
            A072.putExtra("transition_name", str);
        }
        if (valueOf != null) {
            A072.putExtra("status_bar_color", valueOf);
        }
        if (num != null) {
            A072.putExtra("navigation_bar_color", num);
        }
        if (r9 != null) {
            AnonymousClass0x2.A0u(A072, r9, "gjid");
        }
        if (d != null) {
            A072.putExtra("location_latitude", d);
        }
        if (d2 != null) {
            A072.putExtra("location_longitude", d2);
        }
        A072.putExtra("show_get_direction", z);
        C627336j.A0D(A072, r5, "jid");
        A072.putExtra("animation_style", i);
        A072.setSourceBounds(rect);
        return A072;
    }

    public AnonymousClass5XB(Rect rect, C95814uZ r3, Integer num) {
        this.A07 = r3;
        this.A08 = num;
        this.A06 = rect;
    }
}
