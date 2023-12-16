package X;

import android.graphics.Bitmap;

/* renamed from: X.6po  reason: invalid class name and case insensitive filesystem */
public class C138126po extends AnonymousClass5ZM {
    public Bitmap[] A00;

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        int i = 0;
        while (true) {
            Bitmap[] bitmapArr = this.A00;
            if (i >= bitmapArr.length) {
                return null;
            }
            Bitmap bitmap = bitmapArr[i];
            if (bitmap != null) {
                bitmap.recycle();
                bitmapArr[i] = null;
            }
            i++;
        }
    }

    public C138126po(Bitmap[] bitmapArr) {
        this.A00 = bitmapArr;
    }
}
