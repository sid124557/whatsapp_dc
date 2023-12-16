package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import com.whatsapp.R;
import com.whatsapp.contact.photos.ContactPhotos$LoaderLifecycleEventObserver;
import com.whatsapp.util.Log;
import java.io.InputStream;
import java.util.List;

/* renamed from: X.5mM  reason: invalid class name and case insensitive filesystem */
public class C114015mM implements AnonymousClass485 {
    public final C69263Wi A00;
    public final C56972sr A01;
    public final AnonymousClass5UX A02;
    public final C64773Ex A03;
    public final AnonymousClass5ZU A04;
    public final C56332ro A05;
    public final C613330g A06;
    public final C620633i A07;
    public final C54292oU A08;
    public final C620733j A09;
    public final C56982ss A0A;
    public final C59862xc A0B;
    public final C56072rN A0C;

    public C105365Uq A07(String str, float f, int i) {
        return new C105365Uq(this, str, f, i, false);
    }

    public static Bitmap A01(InputStream inputStream, float f, int i) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inDither = true;
        options.inScaled = false;
        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
        Bitmap bitmap = C107245ax.A04((AnonymousClass5QA) null, new AnonymousClass5WB(options, (Long) null, i, i, true), inputStream, false).A02;
        if (bitmap == null) {
            return null;
        }
        return A00(bitmap, f, i);
    }

    public static Bitmap A02(List list, float f) {
        Rect rect;
        RectF A092;
        int i;
        List<Bitmap> list2 = list;
        C626936e.A0D(C86624Kv.A1W(list2.size(), 1), "Insufficient number of bitmaps to combine");
        if (list2.size() == 1) {
            return (Bitmap) list2.get(0);
        }
        int i2 = 0;
        int i3 = 0;
        for (Bitmap bitmap : list2) {
            if (i2 < bitmap.getWidth()) {
                i2 = bitmap.getWidth();
            }
            if (i3 < bitmap.getHeight()) {
                i3 = bitmap.getHeight();
            }
        }
        Bitmap A0Y = C86664Kz.A0Y(i2, i3);
        Canvas A062 = AnonymousClass4L0.A06(A0Y);
        float f2 = (float) i2;
        float f3 = (float) i3;
        RectF rectF = new RectF(0.0f, 0.0f, f2, f3);
        Paint A0Z = C86664Kz.A0Z();
        A0Z.setColor(-1);
        float f4 = f;
        int i4 = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
        if (i4 != 0) {
            if (i4 > 0) {
                A062.drawRoundRect(rectF, f4, f4, A0Z);
            } else {
                A062.drawArc(rectF, 0.0f, 360.0f, true, A0Z);
            }
            C86634Kw.A18(A0Z, PorterDuff.Mode.SRC_IN);
        }
        if (list2.size() == 2) {
            Rect rect2 = new Rect(((int) (((double) i2) * 0.25d)) + 1, 0, ((int) (0.75f * f2)) - 1, i3);
            float f5 = 0.5f * f2;
            A062.drawBitmap((Bitmap) list2.get(0), rect2, new RectF(0.0f, 0.0f, f5 - 2.0f, f3), A0Z);
            A062.drawBitmap((Bitmap) list2.get(1), rect2, AnonymousClass4L0.A09(f5 + 2.0f, 0.0f, f2, f3), A0Z);
        } else {
            if (list2.size() == 3) {
                int i5 = ((int) (((double) i2) * 0.25d)) + 1;
                int i6 = ((int) (0.75f * f2)) - 1;
                float f6 = f2 * 0.5f;
                A062.drawBitmap((Bitmap) list2.get(0), new Rect(i5, 0, i6, i3), new RectF(0.0f, 0.0f, f6 - 2.0f, f3), A0Z);
                double d = (double) i3;
                rect = new Rect(i5, ((int) (d * 0.25d)) + 1, i6, ((int) (d * 0.75d)) - 1);
                float f7 = f6 + 2.0f;
                float f8 = f3 * 0.5f;
                A062.drawBitmap((Bitmap) list2.get(1), rect, AnonymousClass4L0.A09(f7, 0.0f, f2, f8 - 2.0f), A0Z);
                A092 = AnonymousClass4L0.A09(f7, f8 + 2.0f, f2, f3);
                i = 2;
            } else if (list2.size() == 4) {
                double d2 = (double) i3;
                rect = new Rect(((int) (((double) i2) * 0.25d)) + 1, ((int) (d2 * 0.25d)) + 1, ((int) (0.75f * f2)) - 1, ((int) (d2 * 0.75d)) - 1);
                float f9 = f2 * 0.5f;
                float f10 = f9 - 2.0f;
                float f11 = 0.5f * f3;
                float f12 = f11 - 2.0f;
                A062.drawBitmap((Bitmap) C18290x4.A0k(list2), rect, new RectF(0.0f, 0.0f, f10, f12), A0Z);
                float f13 = f11 + 2.0f;
                A062.drawBitmap((Bitmap) list2.get(1), rect, AnonymousClass4L0.A09(0.0f, f13, f10, f3), A0Z);
                float f14 = f9 + 2.0f;
                A062.drawBitmap((Bitmap) list2.get(2), rect, AnonymousClass4L0.A09(f14, 0.0f, f2, f12), A0Z);
                A092 = AnonymousClass4L0.A09(f14, f13, f2, f3);
                i = 3;
            }
            A062.drawBitmap((Bitmap) list2.get(i), rect, A092, A0Z);
            return A0Y;
        }
        return A0Y;
    }

    public C114015mM(C69263Wi r1, C56972sr r2, AnonymousClass5UX r3, C64773Ex r4, AnonymousClass5ZU r5, C56332ro r6, C613330g r7, C620633i r8, C54292oU r9, C620733j r10, C56982ss r11, C59862xc r12, C56072rN r13) {
        this.A00 = r1;
        this.A08 = r9;
        this.A01 = r2;
        this.A0A = r11;
        this.A02 = r3;
        this.A03 = r4;
        this.A07 = r8;
        this.A04 = r5;
        this.A09 = r10;
        this.A0C = r13;
        this.A05 = r6;
        this.A0B = r12;
        this.A06 = r7;
    }

    public static Bitmap A00(Bitmap bitmap, float f, int i) {
        Rect rect;
        int i2 = i;
        if (bitmap.getWidth() == i2 && bitmap.getHeight() == i2 && ((int) f) == 0) {
            Log.d("contactphotos/getroundrectbitmap/skip generating");
            return bitmap;
        }
        Bitmap createBitmap = Bitmap.createBitmap(i2, i2, Bitmap.Config.ARGB_8888);
        Canvas A062 = AnonymousClass4L0.A06(createBitmap);
        Paint A0Z = C86664Kz.A0Z();
        float f2 = (float) i2;
        RectF rectF = new RectF(0.0f, 0.0f, f2, f2);
        A0Z.setAntiAlias(true);
        A0Z.setDither(true);
        A0Z.setFilterBitmap(true);
        A062.drawARGB(0, 0, 0, 0);
        A0Z.setColor(-1);
        int i3 = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
        if (i3 == 0) {
            A062.drawRect(rectF, A0Z);
        } else if (i3 > 0) {
            A062.drawRoundRect(rectF, f, f, A0Z);
        } else if (f == -2.14748365E9f) {
            A062.drawPath(C107245ax.A03(rectF), A0Z);
        } else {
            A062.drawArc(rectF, 0.0f, 360.0f, true, A0Z);
        }
        C86634Kw.A18(A0Z, PorterDuff.Mode.SRC_IN);
        RectF rectF2 = new RectF(0.0f, 0.0f, f2, f2);
        int width = (bitmap.getWidth() - bitmap.getHeight()) / 2;
        if (width > 0) {
            rect = new Rect(width, 0, bitmap.getWidth() - width, bitmap.getHeight());
        } else {
            rect = new Rect(0, -width, bitmap.getWidth(), bitmap.getHeight() + width);
        }
        A062.drawBitmap(bitmap, rect, rectF2, A0Z);
        bitmap.recycle();
        return createBitmap;
    }

    public Bitmap A03(Context context, AnonymousClass3ZH r8, int i, int i2) {
        int min = Math.min(i, i2);
        AnonymousClass3ZH r2 = r8;
        int i3 = -1;
        if (this.A0C.A06(AnonymousClass34R.A01(r8.A0H))) {
            i3 = Integer.MIN_VALUE;
        }
        C56332ro r0 = this.A05;
        float f = (float) i3;
        Bitmap bitmap = (Bitmap) r0.A02.A01().A06(r8.A0M(f, min));
        if (bitmap != null || !r8.A0g || min <= 0) {
            return bitmap;
        }
        return this.A06.A03(context, r2, f, min, true);
    }

    public C105365Uq A04(Context context, C15910sA r5, String str) {
        C105365Uq A062 = A06(context, str);
        r5.getLifecycle().A00(new ContactPhotos$LoaderLifecycleEventObserver(A062));
        return A062;
    }

    public C105365Uq A05(Context context, String str) {
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.f6nameremoved);
        return new C105365Uq(this, str, resources.getDimension(R.dimen.f6nameremoved), dimensionPixelSize, true);
    }

    public C105365Uq A06(Context context, String str) {
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.f6nameremoved);
        return new C105365Uq(this, str, resources.getDimension(R.dimen.f6nameremoved), dimensionPixelSize, false);
    }
}
