package X;

import android.graphics.Bitmap;
import android.text.TextUtils;
import android.widget.ImageView;
import java.lang.ref.WeakReference;

/* renamed from: X.9dx  reason: invalid class name and case insensitive filesystem */
public class C197839dx implements C185158tB {
    public final /* synthetic */ ImageView A00;
    public final /* synthetic */ C15810ry A01;
    public final /* synthetic */ C15810ry A02;
    public final /* synthetic */ C59482wz A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ WeakReference A06;
    public final /* synthetic */ WeakReference A07;

    public C197839dx(ImageView imageView, C15810ry r2, C15810ry r3, C59482wz r4, String str, String str2, WeakReference weakReference, WeakReference weakReference2) {
        this.A07 = weakReference;
        this.A06 = weakReference2;
        this.A02 = r2;
        this.A05 = str;
        this.A00 = imageView;
        this.A04 = str2;
        this.A03 = r4;
        this.A01 = r3;
    }

    public void BVO() {
        String str = this.A05;
        if (!TextUtils.isEmpty(str)) {
            ImageView imageView = this.A00;
            String str2 = this.A04;
            C59482wz r2 = this.A03;
            C15810ry r0 = this.A01;
            C15810ry r1 = this.A02;
            if (str2 != null && AnonymousClass001.A1Z(r0.get())) {
                str = str2;
            }
            r2.A00(new C196099aI(imageView, r1), str);
        }
    }

    public void Be2(Bitmap bitmap) {
        ImageView imageView = (ImageView) this.A07.get();
        Object obj = this.A06.get();
        Number number = (Number) this.A02.get();
        if (imageView != null && obj != null && number != null) {
            imageView.setColorFilter(number.intValue());
        }
    }

    public void Be1() {
    }
}
