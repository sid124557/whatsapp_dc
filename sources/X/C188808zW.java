package X;

import com.whatsapp.R;
import com.whatsapp.settings.chat.wallpaper.WallpaperGridLayoutManager;
import com.whatsapp.settings.chat.wallpaper.downloadable.picker.DownloadableWallpaperGridLayoutManager;

/* renamed from: X.8zW  reason: invalid class name and case insensitive filesystem */
public class C188808zW extends AnonymousClass0OM {
    public Object A00;
    public final int A01;

    public C188808zW(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public int A00(int i) {
        if (this.A01 != 0) {
            int itemViewType = ((DownloadableWallpaperGridLayoutManager) this.A00).A00.getItemViewType(i);
            if (itemViewType == 0 || itemViewType == 1) {
                return 1;
            }
            if (itemViewType == 2 || itemViewType == 3) {
                return 3;
            }
            throw AnonymousClass002.A0G(AnonymousClass000.A0Y("Invalid viewType: ", AnonymousClass001.A0o(), itemViewType));
        }
        WallpaperGridLayoutManager wallpaperGridLayoutManager = (WallpaperGridLayoutManager) this.A00;
        int itemViewType2 = wallpaperGridLayoutManager.A01.getItemViewType(i);
        if (itemViewType2 == 0 || itemViewType2 == 1 || itemViewType2 == 2 || itemViewType2 == 3) {
            return 4 / wallpaperGridLayoutManager.A00.getResources().getInteger(R.integer.f7nameremoved);
        }
        if (itemViewType2 == 4 || itemViewType2 == 5) {
            return 4;
        }
        throw AnonymousClass002.A0G(AnonymousClass000.A0Y("Invalid viewType: ", AnonymousClass001.A0o(), itemViewType2));
    }
}
