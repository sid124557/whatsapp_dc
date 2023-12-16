package X;

import com.whatsapp.gallery.MediaGalleryActivity;

/* renamed from: X.4p8  reason: invalid class name */
public final class AnonymousClass4p8 extends AnonymousClass4p9 {
    public boolean A02(C89654ea r5, C624134x r6) {
        int i;
        C162457s7.A0J(r6, 0);
        if (!(r5 instanceof MediaGalleryActivity)) {
            return super.A02(r5, r6);
        }
        MediaGalleryActivity mediaGalleryActivity = (MediaGalleryActivity) r5;
        C162457s7.A0J(mediaGalleryActivity, 0);
        int i2 = mediaGalleryActivity.A00;
        if (i2 == mediaGalleryActivity.A03) {
            i = 4;
        } else if (i2 == mediaGalleryActivity.A01) {
            i = 5;
        } else {
            int i3 = mediaGalleryActivity.A02;
            i = 3;
            if (i2 == i3) {
                i = 6;
            }
        }
        return A01(r5, r6, i, true);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4p8(C621033m r1, C106065Xm r2) {
        super(r1, r2);
        C18260x0.A0Q(r1, r2);
    }
}
