package X;

import android.graphics.Bitmap;
import com.whatsapp.status.playback.content.BlurFrameLayout;
import java.lang.ref.WeakReference;

/* renamed from: X.55M  reason: invalid class name */
public final class AnonymousClass55M extends AnonymousClass5ZM {
    public final WeakReference A00;

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        Bitmap[] bitmapArr = (Bitmap[]) objArr;
        C162457s7.A0J(bitmapArr, 0);
        Bitmap copy = bitmapArr[0].copy(Bitmap.Config.ARGB_8888, true);
        C162457s7.A0D(copy);
        AnonymousClass75H.A00(16, copy);
        return copy;
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        C162457s7.A0J(bitmap, 0);
        BlurFrameLayout blurFrameLayout = (BlurFrameLayout) this.A00.get();
        if (blurFrameLayout != null) {
            Bitmap bitmap2 = blurFrameLayout.A01;
            if (bitmap2 == null) {
                blurFrameLayout.setAlpha(0.0f);
                blurFrameLayout.A02 = C86624Kv.A0B(blurFrameLayout).setDuration(500);
            } else {
                bitmap2.recycle();
            }
            blurFrameLayout.A01 = bitmap;
            blurFrameLayout.invalidate();
        }
    }

    public AnonymousClass55M(BlurFrameLayout blurFrameLayout) {
        this.A00 = AnonymousClass0x9.A14(blurFrameLayout);
    }
}
