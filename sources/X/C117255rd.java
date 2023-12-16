package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;

/* renamed from: X.5rd  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C117255rd implements Runnable {
    public final /* synthetic */ float A00;
    public final /* synthetic */ BitmapDrawable A01;
    public final /* synthetic */ BitmapDrawable A02;
    public final /* synthetic */ C105795Wl A03;

    public final void run() {
        C105795Wl r5 = this.A03;
        float f = this.A00;
        BitmapDrawable bitmapDrawable = this.A01;
        BitmapDrawable bitmapDrawable2 = this.A02;
        synchronized (r5) {
            int i = 255;
            float f2 = (float) 255;
            int i2 = (int) (f * f2);
            if (i2 < 0) {
                i2 = 0;
            } else if (i2 > 255) {
                i2 = 255;
            }
            float max = Math.max(f, 0.5f);
            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmapDrawable.getBitmap(), (int) (((float) bitmapDrawable.getIntrinsicWidth()) * max), (int) (((float) bitmapDrawable.getIntrinsicHeight()) * max), false);
            C162457s7.A0D(createScaledBitmap);
            int max2 = (int) (((float) Math.max(bitmapDrawable.getIntrinsicWidth(), bitmapDrawable2.getIntrinsicWidth())) * 2.0f);
            int max3 = (int) (((float) Math.max(bitmapDrawable.getIntrinsicHeight(), bitmapDrawable2.getIntrinsicHeight())) * 2.0f);
            Bitmap A0Y = C86664Kz.A0Y(max2, max3);
            C162457s7.A0D(A0Y);
            Canvas A06 = AnonymousClass4L0.A06(A0Y);
            if (i2 > 0) {
                Paint paint = r5.A01;
                paint.setAlpha(i2);
                A06.drawBitmap(createScaledBitmap, (float) ((max2 / 2) - (createScaledBitmap.getWidth() / 2)), (float) ((max3 / 2) - (createScaledBitmap.getHeight() / 2)), paint);
            }
            float f3 = 1.0f - f;
            if (f3 >= 0.5f) {
                float max4 = Math.max(f3, 0.5f);
                int i3 = (int) (f3 * f2);
                if (i3 < 0) {
                    i = 0;
                } else if (i3 <= 255) {
                    i = i3;
                }
                Paint paint2 = r5.A01;
                paint2.setAlpha(i);
                Bitmap createScaledBitmap2 = Bitmap.createScaledBitmap(bitmapDrawable2.getBitmap(), (int) (((float) bitmapDrawable2.getIntrinsicHeight()) * max4), (int) (((float) bitmapDrawable2.getIntrinsicWidth()) * max4), false);
                C162457s7.A0D(createScaledBitmap2);
                A06.drawBitmap(createScaledBitmap2, (float) ((max2 / 2) - (createScaledBitmap2.getWidth() / 2)), (float) ((max3 / 2) - (createScaledBitmap2.getHeight() / 2)), paint2);
            }
            r5.A04.A0S(new C71573cK(r5, 0, A0Y));
        }
    }

    public /* synthetic */ C117255rd(BitmapDrawable bitmapDrawable, BitmapDrawable bitmapDrawable2, C105795Wl r3, float f) {
        this.A03 = r3;
        this.A00 = f;
        this.A01 = bitmapDrawable;
        this.A02 = bitmapDrawable2;
    }
}
