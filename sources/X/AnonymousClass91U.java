package X;

import android.content.Context;
import com.whatsapp.settings.chat.wallpaper.WallpaperCurrentPreviewActivity;

/* renamed from: X.91U  reason: invalid class name */
public class AnonymousClass91U implements C15790rw {
    public Object A00;
    public final int A01;

    public AnonymousClass91U(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void AwB(Object obj) {
        switch (this.A01) {
            case 0:
                AnonymousClass84O r2 = (AnonymousClass84O) this.A00;
                r2.A0T(40, "");
                r2.A0T(35, obj);
                return;
            case 1:
                ((C06270Wx) this.A00).A0G(obj);
                return;
            case 2:
                ((AnonymousClass4VR) this.A00).A0G((AnonymousClass5L8) obj);
                return;
            case 3:
                AnonymousClass91U.super.A0B((AnonymousClass3ZH) obj);
                return;
            case 4:
                C95704uI r1 = (C95704uI) this.A00;
                if (r1.A7I()) {
                    r1.A7G();
                    r1.A7E();
                    return;
                }
                return;
            case 7:
                WallpaperCurrentPreviewActivity wallpaperCurrentPreviewActivity = (WallpaperCurrentPreviewActivity) this.A00;
                C107065ad.A03(wallpaperCurrentPreviewActivity);
                wallpaperCurrentPreviewActivity.A74();
                return;
            default:
                C107065ad.A03((Context) this.A00);
                return;
        }
    }
}
