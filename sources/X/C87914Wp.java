package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import com.whatsapp.settings.chat.wallpaper.SolidColorWallpaper;

/* renamed from: X.4Wp  reason: invalid class name and case insensitive filesystem */
public class C87914Wp extends AnonymousClass0R6 {
    public final Context A00;
    public final int[] A01;
    public final /* synthetic */ SolidColorWallpaper A02;

    public C87914Wp(Context context, SolidColorWallpaper solidColorWallpaper, int[] iArr) {
        this.A02 = solidColorWallpaper;
        this.A00 = context;
        this.A01 = iArr;
    }

    public long A0B(int i) {
        return (long) this.A01[i];
    }

    public int A0G() {
        return this.A01.length;
    }

    public /* bridge */ /* synthetic */ void BNf(C05570Ua r4, int i) {
        AnonymousClass6IK r42 = (AnonymousClass6IK) r4;
        C87914Wp r1 = r42.A00;
        int i2 = r1.A01[i];
        View view = r42.A0H;
        view.setBackgroundColor(i2);
        C18300x5.A13(r1.A02, view, SolidColorWallpaper.A04[i]);
        C109695f2.A00(view, r42, i, 17);
    }

    public /* bridge */ /* synthetic */ C05570Ua BQR(ViewGroup viewGroup, int i) {
        AnonymousClass4ST r2 = new AnonymousClass4ST(this.A00);
        r2.setLayoutParams(new AbsListView.LayoutParams(-1, -1));
        return new AnonymousClass6IK(r2, this);
    }
}
