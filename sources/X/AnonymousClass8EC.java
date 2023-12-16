package X;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.whatsapp.util.Log;

/* renamed from: X.8EC  reason: invalid class name */
public final class AnonymousClass8EC implements C185398ta {
    public final C59862xc A00;

    public /* bridge */ /* synthetic */ void BMf(C186038ue r2) {
        Log.d("InteropImageLoaderAdapter/onAsyncLoadBegin()");
    }

    public /* bridge */ /* synthetic */ void BVP(C186038ue r2) {
        Log.d("InteropImageLoaderAdapter/onLoadEmptyImage()");
    }

    public /* bridge */ /* synthetic */ void BVY(C186038ue r2) {
        Log.d("InteropImageLoaderAdapter/onLoadPrepare()");
    }

    public /* bridge */ /* synthetic */ void BVd(Bitmap bitmap, C186038ue r7, boolean z) {
        AnonymousClass8EH r72 = (AnonymousClass8EH) r7;
        C18260x0.A0O(r72, bitmap);
        Log.d("InteropImageLoaderAdapter/onLoadSuccess()");
        ImageView B8H = r72.B8H();
        if (B8H != null) {
            B8H.setImageDrawable(this.A00.A01(B8H.getResources(), bitmap, new AnonymousClass922(1)));
        }
        C185158tB r0 = r72.A04;
        if (r0 != null) {
            r0.Be2(bitmap);
        }
    }

    public AnonymousClass8EC(C59862xc r1) {
        this.A00 = r1;
    }
}
