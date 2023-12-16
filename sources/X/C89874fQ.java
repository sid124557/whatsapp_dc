package X;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.settings.chat.wallpaper.WallPaperView;
import com.whatsapp.util.Log;

/* renamed from: X.4fQ  reason: invalid class name and case insensitive filesystem */
public final class C89874fQ extends AnonymousClass5c4 {
    public final Activity A00;
    public final ViewGroup A01;
    public final C64303Cy A02;
    public final C95814uZ A03;
    public final C623834u A04;
    public final WallPaperView A05;
    public final AnonymousClass4FS A06;

    public final void A00(Drawable drawable) {
        ViewGroup viewGroup;
        int A022;
        if (drawable != null) {
            Log.d("conversation/wallpaper/set/drawable");
            this.A05.setDrawable(drawable);
            viewGroup = this.A01;
            A022 = 0;
        } else {
            Log.d("conversation/wallpaper/clear/toggle_view");
            C86644Kx.A1N(this.A05);
            viewGroup = this.A01;
            A022 = AnonymousClass5Yj.A02(viewGroup.getContext(), R.attr.f3nameremoved, R.color.f5nameremoved);
        }
        viewGroup.setBackgroundResource(A022);
    }

    public C89874fQ(Activity activity, ViewGroup viewGroup, AnonymousClass4FU r12, C69263Wi r13, AnonymousClass74P r14, C620633i r15, C95814uZ r16, C623834u r17, WallPaperView wallPaperView, AnonymousClass4FS r19, Runnable runnable) {
        this.A03 = r16;
        this.A00 = activity;
        this.A06 = r19;
        C623834u r8 = r17;
        this.A04 = r8;
        this.A01 = viewGroup;
        WallPaperView wallPaperView2 = wallPaperView;
        this.A05 = wallPaperView2;
        this.A02 = new C64303Cy(activity, r12, r13, new C113305lD(this, wallPaperView2, runnable), r14, r15, r8);
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        super.onActivityCreated(activity, bundle);
        A00((Drawable) null);
        AnonymousClass4FS r5 = this.A06;
        C95814uZ r4 = this.A03;
        C18270x1.A0w(new C991354o(this.A00, new C147327Dr(this), r4, this.A04), r5);
    }

    public void onActivityResumed(Activity activity) {
        super.onActivityResumed(activity);
        C623834u r5 = this.A04;
        if (r5.A00) {
            C18270x1.A0w(new C991354o(this.A00, new C147327Dr(this), this.A03, r5), this.A06);
            r5.A00 = false;
        }
    }
}
