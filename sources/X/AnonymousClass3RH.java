package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.widget.ImageView;
import java.lang.ref.WeakReference;
import java.util.Map;

/* renamed from: X.3RH  reason: invalid class name */
public final class AnonymousClass3RH implements AnonymousClass668 {
    public final String A00;
    public final /* synthetic */ C46502bj A01;

    public AnonymousClass3RH(C46502bj r1, String str) {
        this.A01 = r1;
        this.A00 = str;
    }

    public /* synthetic */ void BS4(AnonymousClass583 r1) {
    }

    public void BdK(byte[] bArr) {
        ImageView imageView;
        C46502bj r2 = this.A01;
        Map map = r2.A04;
        synchronized (map) {
            String str = this.A00;
            WeakReference weakReference = (WeakReference) map.get(str);
            if (!(weakReference == null || (imageView = (ImageView) weakReference.get()) == null || !C162457s7.A0P(imageView.getTag(-1641051461), str))) {
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
                C162457s7.A0D(decodeByteArray);
                r2.A00.A0S(new C70113Zy(imageView, 37, decodeByteArray));
            }
        }
    }
}
