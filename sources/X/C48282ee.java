package X;

import android.graphics.Bitmap;

/* renamed from: X.2ee  reason: invalid class name and case insensitive filesystem */
public final class C48282ee {
    public final AnonymousClass30B A00;

    public C48282ee(AnonymousClass30B r2) {
        C162457s7.A0J(r2, 1);
        this.A00 = r2;
    }

    public final Bitmap A00(String str) {
        C162457s7.A0J(str, 0);
        C33131sU A04 = this.A00.A04();
        C162457s7.A0D(A04);
        Bitmap bitmap = (Bitmap) A04.A06(str);
        if (bitmap == null || !bitmap.isRecycled()) {
            return bitmap;
        }
        C18260x0.A0q("StickerTrayIconCache/getBitmapFromMemCache/bitmap is recycled, cacheKey: ", str, AnonymousClass001.A0o());
        A04.A08(str);
        return null;
    }

    public final void A01(Bitmap bitmap, String str) {
        C162457s7.A0J(str, 0);
        if (bitmap.isRecycled()) {
            C18260x0.A0q("StickerTrayIconCache/addBitmapToMemoryCache/bitmap is recycled, cacheKey: ", str, AnonymousClass001.A0o());
        } else if (A00(str) == null) {
            this.A00.A04().A09(str, bitmap);
        }
    }
}
