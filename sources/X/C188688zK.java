package X;

import android.database.ContentObserver;
import android.os.Handler;
import com.whatsapp.gallery.MediaGalleryFragmentBase;
import com.whatsapp.util.Log;

/* renamed from: X.8zK  reason: invalid class name and case insensitive filesystem */
public class C188688zK extends ContentObserver {
    public Object A00;
    public final int A01 = 1;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C188688zK(Handler handler, MediaGalleryFragmentBase mediaGalleryFragmentBase) {
        super(handler);
        this.A00 = mediaGalleryFragmentBase;
    }

    public boolean deliverSelfNotifications() {
        return true;
    }

    public void onChange(boolean z) {
        if (this.A01 != 0) {
            super.onChange(z);
            Log.d("MediaMessagesNavigator/navigator/on-change");
            ((C171468He) this.A00).A0F.A09.post(new C70013Zn(this, 10));
            return;
        }
        C18260x0.A1E("MediaGalleryFragmentBase/onchange ", AnonymousClass001.A0o(), z);
        MediaGalleryFragmentBase mediaGalleryFragmentBase = (MediaGalleryFragmentBase) this.A00;
        C186308v5 r0 = mediaGalleryFragmentBase.A0L;
        if (r0 != null) {
            if (!z) {
                r0.Bjj();
                mediaGalleryFragmentBase.A1O();
            }
            mediaGalleryFragmentBase.A01 = r0.getCount();
        }
        mediaGalleryFragmentBase.A1P();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C188688zK(C171468He r2) {
        super((Handler) null);
        this.A00 = r2;
    }
}
