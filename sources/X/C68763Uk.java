package X;

import com.whatsapp.R;
import com.whatsapp.stickers.store.preview.StickerStorePackPreviewActivity;
import java.lang.ref.WeakReference;

/* renamed from: X.3Uk  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C68763Uk implements AnonymousClass4BO {
    public final /* synthetic */ WeakReference A00;

    public final void Bcg(boolean z) {
        AnonymousClass48Y r3 = (AnonymousClass48Y) this.A00.get();
        if (r3 != null) {
            StickerStorePackPreviewActivity stickerStorePackPreviewActivity = (StickerStorePackPreviewActivity) r3;
            stickerStorePackPreviewActivity.A0Y = false;
            if (z) {
                stickerStorePackPreviewActivity.A05.A0H(R.string.f11nameremoved, 1);
                if (!stickerStorePackPreviewActivity.A0a) {
                    stickerStorePackPreviewActivity.finish();
                    return;
                }
                return;
            }
            stickerStorePackPreviewActivity.A74();
        }
    }

    public /* synthetic */ C68763Uk(WeakReference weakReference) {
        this.A00 = weakReference;
    }
}
