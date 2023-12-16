package X;

import com.whatsapp.gifvideopreview.GifVideoPreviewActivity;
import java.io.File;
import java.lang.ref.WeakReference;

/* renamed from: X.5ms  reason: invalid class name and case insensitive filesystem */
public class C114335ms implements C184388ri {
    public final WeakReference A00;

    public void BTT(File file, String str, byte[] bArr) {
        C89134bh r1 = (C89134bh) this.A00.get();
        if (file == null) {
            if (r1 != null) {
                r1.A01.setVisibility(8);
            }
        } else if (r1 != null) {
            r1.A03.postDelayed(new C71343bx(r1, 48, file), 50);
        }
    }

    public C114335ms(GifVideoPreviewActivity gifVideoPreviewActivity) {
        this.A00 = AnonymousClass0x9.A14(gifVideoPreviewActivity);
    }

    public void onFailure(Exception exc) {
    }
}
