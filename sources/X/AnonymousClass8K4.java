package X;

import com.whatsapp.mediaview.PhotoView;

/* renamed from: X.8K4  reason: invalid class name */
public final /* synthetic */ class AnonymousClass8K4 implements C183348pt {
    public final /* synthetic */ PhotoView A00;
    public final /* synthetic */ boolean A01;

    public final void BYM(boolean z, int i) {
        float f;
        boolean z2 = this.A01;
        PhotoView photoView = this.A00;
        if (i == 3) {
            if (!z2) {
                photoView.setVisibility(8);
                f = 0.0f;
            } else {
                return;
            }
        } else if (i == 1) {
            photoView.setVisibility(0);
            f = 1.0f;
        } else {
            return;
        }
        photoView.setAlpha(f);
    }

    public /* synthetic */ AnonymousClass8K4(PhotoView photoView, boolean z) {
        this.A01 = z;
        this.A00 = photoView;
    }
}
