package X;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.DecelerateInterpolator;
import com.whatsapp.R;
import com.whatsapp.settings.chat.wallpaper.SolidColorWallpaperPreview;

/* renamed from: X.5fh  reason: invalid class name and case insensitive filesystem */
public class C110105fh implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ SolidColorWallpaperPreview A04;

    public boolean onPreDraw() {
        SolidColorWallpaperPreview solidColorWallpaperPreview = this.A04;
        AnonymousClass0x7.A16(solidColorWallpaperPreview.A07, this);
        View findViewById = solidColorWallpaperPreview.findViewById(R.id.wallpaper_preview_mock_chat);
        View findViewById2 = solidColorWallpaperPreview.findViewById(R.id.wallpaper_preview_mock_chat_dark);
        int[] A1Z = C86664Kz.A1Z();
        solidColorWallpaperPreview.A09.getLocationOnScreen(A1Z);
        solidColorWallpaperPreview.A02 = this.A02 - A1Z[0];
        solidColorWallpaperPreview.A03 = this.A03 - A1Z[1];
        solidColorWallpaperPreview.A00 = AnonymousClass001.A04(solidColorWallpaperPreview.A09, (float) this.A01);
        solidColorWallpaperPreview.A01 = ((float) this.A00) / C86664Kz.A02(solidColorWallpaperPreview.A09);
        int A002 = (int) (C86604Kt.A00(solidColorWallpaperPreview) * 20.0f);
        solidColorWallpaperPreview.A09.setPivotX(0.0f);
        solidColorWallpaperPreview.A09.setPivotY(0.0f);
        solidColorWallpaperPreview.A09.setScaleX(solidColorWallpaperPreview.A00);
        solidColorWallpaperPreview.A09.setScaleY(solidColorWallpaperPreview.A01);
        solidColorWallpaperPreview.A09.setTranslationX((float) solidColorWallpaperPreview.A02);
        solidColorWallpaperPreview.A09.setTranslationY((float) solidColorWallpaperPreview.A03);
        solidColorWallpaperPreview.A04.setAlpha(0.0f);
        solidColorWallpaperPreview.A06.setAlpha(0.0f);
        if (findViewById != null) {
            findViewById.setAlpha(0.0f);
            findViewById.setTranslationY((float) A002);
        }
        if (findViewById2 != null) {
            findViewById2.setAlpha(0.0f);
            findViewById2.setTranslationY((float) A002);
        }
        DecelerateInterpolator decelerateInterpolator = new DecelerateInterpolator();
        solidColorWallpaperPreview.A05.setBackgroundColor(0);
        solidColorWallpaperPreview.A04.animate().setDuration(250).alpha(1.0f).setInterpolator(decelerateInterpolator);
        C86634Kw.A0P(C86654Ky.A0I(solidColorWallpaperPreview.A09, 250), 1.0f).translationX(0.0f).translationY(0.0f).setInterpolator(decelerateInterpolator).setListener(new AnonymousClass67M(findViewById2, decelerateInterpolator, this, findViewById, 2));
        return true;
    }

    public C110105fh(SolidColorWallpaperPreview solidColorWallpaperPreview, int i, int i2, int i3, int i4) {
        this.A04 = solidColorWallpaperPreview;
        this.A02 = i;
        this.A03 = i2;
        this.A01 = i3;
        this.A00 = i4;
    }
}
