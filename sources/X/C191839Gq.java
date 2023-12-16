package X;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.widget.ImageView;
import java.lang.ref.SoftReference;

/* renamed from: X.9Gq  reason: invalid class name and case insensitive filesystem */
public class C191839Gq extends AnonymousClass5ZM {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ ImageView A02;
    public final /* synthetic */ AnonymousClass39R A03;
    public final /* synthetic */ AnonymousClass9RV A04;
    public final /* synthetic */ String A05;

    public C191839Gq(ImageView imageView, AnonymousClass39R r2, AnonymousClass9RV r3, String str, int i, int i2) {
        this.A04 = r3;
        this.A05 = str;
        this.A03 = r2;
        this.A01 = i;
        this.A00 = i2;
        this.A02 = imageView;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        AnonymousClass9RV r0 = this.A04;
        return r0.A01.A03(this.A03.A02(r0.A00.A0F()), this.A05, this.A01, this.A00);
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        if (bitmap != null) {
            ImageView imageView = this.A02;
            BitmapDrawable bitmapDrawable = new BitmapDrawable(imageView.getResources(), bitmap);
            this.A04.A03.put(this.A05, new SoftReference(bitmapDrawable));
            imageView.setImageDrawable(bitmapDrawable);
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        }
    }
}
