package X;

import android.graphics.Bitmap;
import com.whatsapp.mediaview.PhotoView;

/* renamed from: X.5nn  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C114905nn implements C182718os {
    public final /* synthetic */ Bitmap A00;
    public final /* synthetic */ C111885iq A01;
    public final /* synthetic */ PhotoView A02;

    public final void Bed(boolean z) {
        C003203q A0Q;
        C111885iq r0 = this.A01;
        PhotoView photoView = this.A02;
        Bitmap bitmap = this.A00;
        if (z && (A0Q = r0.A02.A0Q()) != null && !A0Q.isFinishing()) {
            photoView.A06(bitmap);
        }
    }

    public /* synthetic */ C114905nn(Bitmap bitmap, C111885iq r2, PhotoView photoView) {
        this.A01 = r2;
        this.A02 = photoView;
        this.A00 = bitmap;
    }
}
