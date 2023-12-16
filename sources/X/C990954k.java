package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.whatsapp.settings.chat.wallpaper.WallPaperView;

/* renamed from: X.54k  reason: invalid class name and case insensitive filesystem */
public final class C990954k extends AnonymousClass5ZM {
    public final Context A00;
    public final Resources A01;
    public final WallPaperView A02;

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        return AnonymousClass366.A02(this.A00, this.A01);
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        Drawable drawable = (Drawable) obj;
        WallPaperView wallPaperView = this.A02;
        if (wallPaperView != null) {
            wallPaperView.setDrawable(drawable);
        }
    }

    public C990954k(Context context, Resources resources, WallPaperView wallPaperView) {
        this.A00 = context;
        this.A01 = resources;
        this.A02 = wallPaperView;
    }
}
