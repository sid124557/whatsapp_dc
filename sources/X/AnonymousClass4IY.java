package X;

import android.app.Activity;
import android.content.DialogInterface;
import com.whatsapp.stickers.store.preview.StickerStorePackPreviewActivity;

/* renamed from: X.4IY  reason: invalid class name */
public class AnonymousClass4IY implements DialogInterface.OnDismissListener {
    public Object A00;
    public final int A01;

    public AnonymousClass4IY(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        Activity activity;
        switch (this.A01) {
            case 0:
                activity = (Activity) this.A00;
                activity.finish();
                break;
            case 1:
                activity = (Activity) this.A00;
                break;
            case 2:
                ((C97654yv) this.A00).BZD();
                return;
            default:
                StickerStorePackPreviewActivity stickerStorePackPreviewActivity = ((C68743Ui) this.A00).A00;
                if (!stickerStorePackPreviewActivity.isFinishing() && !stickerStorePackPreviewActivity.isDestroyed()) {
                    stickerStorePackPreviewActivity.finish();
                    return;
                }
                return;
        }
        activity.overridePendingTransition(0, 0);
    }
}
