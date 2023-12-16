package X;

import com.whatsapp.mediacomposer.MediaComposerActivity;
import com.whatsapp.mediacomposer.MediaComposerFragment;
import com.whatsapp.settings.chat.wallpaper.downloadable.picker.DownloadableWallpaperPreviewActivity;

/* renamed from: X.90q  reason: invalid class name and case insensitive filesystem */
public class C1892690q implements C16870uA {
    public Object A00;
    public final int A01;

    public C1892690q(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void BXd(int i) {
    }

    public void BXf(int i) {
        int i2;
        switch (this.A01) {
            case 0:
                MediaComposerActivity mediaComposerActivity = (MediaComposerActivity) this.A00;
                MediaComposerFragment A76 = mediaComposerActivity.A76();
                if (A76 != null) {
                    mediaComposerActivity.A7N(A76);
                }
                mediaComposerActivity.A7A();
                mediaComposerActivity.A7J(mediaComposerActivity.A0v.A0M(i));
                return;
            case 1:
                C153137aj r1 = (C153137aj) this.A00;
                r1.A00 = i;
                if (!r1.A0B.A0T()) {
                    C131676dy r0 = r1.A03;
                    if (r0 != null) {
                        i2 = r0.A01.length;
                    } else {
                        i2 = 0;
                    }
                    i = (i2 - i) - 1;
                }
                r1.A03(i);
                C185108t6 r02 = r1.A04;
                if (r02 != null) {
                    r02.BXf(i);
                    return;
                }
                return;
            default:
                DownloadableWallpaperPreviewActivity downloadableWallpaperPreviewActivity = (DownloadableWallpaperPreviewActivity) this.A00;
                downloadableWallpaperPreviewActivity.A00.setEnabled(C18300x5.A1X(downloadableWallpaperPreviewActivity.A08, i));
                return;
        }
    }

    public void BXe(int i, float f, int i2) {
    }
}
