package X;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import com.whatsapp.settings.chat.wallpaper.WallpaperDownloadFailedDialogFragment;
import com.whatsapp.settings.chat.wallpaper.downloadable.picker.DownloadableWallpaperPreviewActivity;

/* renamed from: X.5Na  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C103455Na {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass509 A01;
    public final /* synthetic */ AnonymousClass50B A02;

    public final void A00(AnonymousClass7II r7) {
        View view;
        AnonymousClass50B r1 = this.A02;
        AnonymousClass509 r4 = this.A01;
        int i = this.A00;
        Bitmap bitmap = r7.A01;
        if (bitmap != null) {
            r4.setWallpaper(bitmap);
        }
        int i2 = r7.A00;
        if (i2 == 2) {
            DownloadableWallpaperPreviewActivity downloadableWallpaperPreviewActivity = r1.A02.A01;
            C86654Ky.A1R(downloadableWallpaperPreviewActivity.A08, i);
            if (downloadableWallpaperPreviewActivity.A01.getCurrentItem() == i) {
                downloadableWallpaperPreviewActivity.A00.setEnabled(true);
            }
            view = r4.A02;
        } else if (i2 == 1) {
            r4.A02.setVisibility(0);
            r4.A03.setVisibility(0);
            view = r4.A01;
        } else {
            AnonymousClass7IM r12 = r1.A02;
            if (!r12.A00) {
                r12.A00 = true;
                DownloadableWallpaperPreviewActivity downloadableWallpaperPreviewActivity2 = r12.A01;
                WallpaperDownloadFailedDialogFragment wallpaperDownloadFailedDialogFragment = new WallpaperDownloadFailedDialogFragment();
                Bundle A08 = AnonymousClass002.A08();
                A08.putInt("ERROR_STATE_KEY", i2);
                wallpaperDownloadFailedDialogFragment.A0u(A08);
                downloadableWallpaperPreviewActivity2.Boo(wallpaperDownloadFailedDialogFragment);
            }
            r4.A02.setVisibility(0);
            r4.A03.setVisibility(8);
            r4.A01.setVisibility(0);
            return;
        }
        view.setVisibility(8);
    }

    public /* synthetic */ C103455Na(AnonymousClass509 r1, AnonymousClass50B r2, int i) {
        this.A02 = r2;
        this.A01 = r1;
        this.A00 = i;
    }
}
