package X;

import android.graphics.Bitmap;
import android.net.Uri;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.lang.ref.WeakReference;

/* renamed from: X.554  reason: invalid class name */
public class AnonymousClass554 extends AnonymousClass5ZM {
    public final int A00;
    public final int A01;
    public final Uri A02;
    public final C989053r A03;
    public final WeakReference A04;

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        int max = Math.max(this.A01, this.A00);
        try {
            return this.A03.A0B(this.A02, max, max);
        } catch (C1000259c | IOException e) {
            Log.e("BaseQrActivity/loadImageRunnable Failed to load image", e);
            return null;
        }
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        C97654yv r5 = (C97654yv) this.A04.get();
        if (r5 != null && !r5.BHW()) {
            r5.A01.setVisibility(C86644Kx.A08(bitmap));
            r5.A01.setImageBitmap(bitmap);
            if (bitmap == null) {
                r5.A05.A0H(R.string.f11nameremoved, 0);
                r5.A0Z = false;
                r5.BjL();
                return;
            }
            AnonymousClass4FS r4 = r5.A04;
            C989053r r3 = r5.A0V;
            AnonymousClass0x7.A1B(new C138236pz(r5.A00, r5.A0b, r3), r4);
        }
    }

    public AnonymousClass554(Uri uri, C97654yv r3, C989053r r4, int i, int i2) {
        this.A03 = r4;
        this.A02 = uri;
        this.A01 = i;
        this.A00 = i2;
        this.A04 = AnonymousClass0x9.A14(r3);
    }
}
