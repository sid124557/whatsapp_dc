package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.R;

/* renamed from: X.5b8  reason: invalid class name and case insensitive filesystem */
public class C107335b8 {
    public static Drawable A08(Context context, Drawable drawable, boolean z) {
        int i;
        Drawable drawable2;
        Drawable drawable3 = drawable;
        if (!z) {
            i = 1;
        } else if ((drawable instanceof InsetDrawable) && (drawable2 = ((InsetDrawable) drawable3).getDrawable()) != null) {
            return drawable2;
        } else {
            i = -1;
        }
        int dimensionPixelSize = i * context.getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
        return new InsetDrawable(drawable3, dimensionPixelSize, 0, dimensionPixelSize, 0);
    }

    public static Bitmap A00(Drawable drawable) {
        Bitmap createBitmap;
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            if (bitmapDrawable.getBitmap() != null) {
                return bitmapDrawable.getBitmap();
            }
        }
        if (drawable.getIntrinsicWidth() <= 0 || drawable.getIntrinsicHeight() <= 0) {
            createBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
        } else {
            createBitmap = C86664Kz.A0Y(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        }
        Canvas A06 = AnonymousClass4L0.A06(createBitmap);
        drawable.setBounds(0, 0, A06.getWidth(), A06.getHeight());
        drawable.draw(A06);
        return createBitmap;
    }

    public static Drawable A05(Context context, int i, boolean z) {
        if (context == null) {
            return null;
        }
        Drawable A04 = A04(context, i, R.color.f5nameremoved);
        if (z) {
            return A08(context, A04, false);
        }
        return A04;
    }

    public static Drawable A0A(Resources resources, Drawable drawable, int i) {
        if (!(drawable instanceof BitmapDrawable)) {
            return drawable;
        }
        return new BitmapDrawable(resources, Bitmap.createScaledBitmap(((BitmapDrawable) drawable).getBitmap(), i, i, false));
    }

    public static Drawable A0B(Drawable drawable, int i) {
        if (i == 0) {
            return drawable;
        }
        Drawable A01 = C06130Wj.A01(drawable);
        AnonymousClass0YG.A06(A01, i);
        return A01;
    }

    public static void A0E(ImageView imageView, int i) {
        ColorStateList valueOf;
        C05040Rr.A01(PorterDuff.Mode.SRC_IN, imageView);
        if (i == 0) {
            valueOf = null;
        } else {
            valueOf = ColorStateList.valueOf(i);
        }
        C05040Rr.A00(valueOf, imageView);
    }

    public static void A0F(TextView textView, int i) {
        if (i != 0) {
            for (Drawable drawable : textView.getCompoundDrawables()) {
                if (drawable != null) {
                    AnonymousClass001.A12(PorterDuff.Mode.SRC_IN, drawable, i);
                }
            }
        }
    }

    public static Drawable A01(Context context, int i) {
        return A04(context, i, R.color.f5nameremoved);
    }

    public static Drawable A02(Context context, int i) {
        return C18310x6.A0G(context, i);
    }

    public static Drawable A03(Context context, int i, int i2) {
        Drawable A04 = A04(context, i, i2);
        C162457s7.A0D(A04);
        return A04;
    }

    public static Drawable A04(Context context, int i, int i2) {
        Integer num;
        Drawable A0G = C18310x6.A0G(context, i);
        if (i2 != 0) {
            try {
                num = Integer.valueOf(AnonymousClass0Y8.A04(context, i2));
            } catch (Resources.NotFoundException unused) {
                num = null;
            }
            if (!(num == null || num.intValue() == 0)) {
                return A07(context, A0G.mutate(), i2);
            }
        }
        return A0G;
    }

    public static Drawable A06(Context context, Drawable drawable) {
        ColorStateList A07 = AnonymousClass0Y8.A07(context, R.color.f5nameremoved);
        if (A07 != null) {
            return new RippleDrawable(A07, drawable, (Drawable) null);
        }
        if (!(drawable instanceof C14920qU)) {
            drawable = C06130Wj.A01(drawable);
        }
        AnonymousClass0YG.A04(PorterDuff.Mode.MULTIPLY, drawable);
        int[][] iArr = {new int[]{16842919}, new int[0]};
        int[] iArr2 = new int[2];
        iArr2[0] = AnonymousClass0Y8.A04(context, R.color.f5nameremoved);
        AnonymousClass0YG.A01(C86664Kz.A0W(iArr2, iArr, AnonymousClass0Y8.A04(context, R.color.f5nameremoved), 1), drawable);
        return drawable;
    }

    public static Drawable A07(Context context, Drawable drawable, int i) {
        return A0B(drawable, AnonymousClass0Y8.A04(context, i));
    }

    public static Drawable A09(Resources resources, Drawable drawable, int i) {
        return A0B(drawable, resources.getColor(i));
    }

    public static void A0C(Context context, ImageView imageView, int i, int i2) {
        imageView.setImageDrawable(A04(context, i, i2));
    }

    public static void A0D(Context context, Toolbar toolbar, C620733j r3, int i) {
        toolbar.setNavigationIcon((Drawable) new C131666dx(A04(context, R.drawable.ic_back, i), r3));
    }
}
