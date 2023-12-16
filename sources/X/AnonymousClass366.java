package X;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: X.366  reason: invalid class name */
public class AnonymousClass366 {
    public static Drawable A02(Context context, Resources resources) {
        C162457s7.A0J(context, 0);
        Context applicationContext = context.getApplicationContext();
        C162457s7.A0D(applicationContext);
        if (C389229y.A01(applicationContext).Avy().A0Y(C58422vE.A02, 6565)) {
            Bitmap A00 = A00(context, resources, R.drawable.whatsapp_doodle);
            if (A00 != null) {
                return new AnonymousClass4Ll(AnonymousClass0Y8.A04(context, R.color.f5nameremoved), AnonymousClass0Y8.A04(context, R.color.f5nameremoved), A00);
            }
        } else {
            Bitmap A002 = A00(context, resources, R.drawable.default_wallpaper);
            if (A002 != null) {
                return new BitmapDrawable(resources, A002);
            }
        }
        Log.w("wallpaper/cannot decode default wallpaper");
        return null;
    }

    public static Drawable A04(Context context, C69263Wi r9, int i, int i2, int i3) {
        Bitmap bitmap;
        Drawable drawable = null;
        try {
            Drawable drawable2 = context.getPackageManager().getResourcesForApplication("com.whatsapp.wallpaper").getDrawable(i);
            try {
                Bitmap bitmap2 = ((BitmapDrawable) drawable2).getBitmap();
                if (bitmap2 == null) {
                    bitmap2 = null;
                } else {
                    float f = (float) i2;
                    float height = ((float) bitmap2.getHeight()) / ((float) i3);
                    if (((float) bitmap2.getWidth()) / f > height) {
                        int width = (int) (((float) bitmap2.getWidth()) / height);
                        if (width > 0 && i3 > 0 && i2 > 0) {
                            bitmap = Bitmap.createScaledBitmap(bitmap2, width, i3, true);
                            bitmap2 = Bitmap.createBitmap(bitmap, (bitmap.getWidth() - i2) / 2, 0, i2, i3);
                        }
                    } else {
                        int height2 = (int) ((((float) bitmap2.getHeight()) * f) / ((float) bitmap2.getWidth()));
                        if (height2 > 0 && i3 > 0 && i2 > 0) {
                            bitmap = Bitmap.createScaledBitmap(bitmap2, i2, height2, true);
                            bitmap2 = Bitmap.createBitmap(bitmap, 0, (bitmap.getHeight() - i3) / 2, i2, i3);
                        }
                    }
                    if (bitmap2 != bitmap) {
                        bitmap.recycle();
                    }
                }
                if (bitmap2 != null) {
                    return new BitmapDrawable((Resources) null, bitmap2);
                }
                r9.A0F(R.string.f11nameremoved, 0);
                return drawable2;
            } catch (PackageManager.NameNotFoundException | OutOfMemoryError | RuntimeException e) {
                e = e;
                drawable = drawable2;
                Log.e("wallpaper/set-global-wallpaper", e);
                r9.A0F(R.string.f11nameremoved, 0);
                return drawable;
            }
        } catch (PackageManager.NameNotFoundException | OutOfMemoryError | RuntimeException e2) {
            e = e2;
            Log.e("wallpaper/set-global-wallpaper", e);
            r9.A0F(R.string.f11nameremoved, 0);
            return drawable;
        }
    }

    public static Bitmap A00(Context context, Resources resources, int i) {
        InputStream openRawResource;
        Point A01 = C623834u.A01(context);
        try {
            openRawResource = resources.openRawResource(i);
            Bitmap bitmap = C107245ax.A04((AnonymousClass5QA) null, C623834u.A02(A01, true), openRawResource, false).A02;
            if (openRawResource != null) {
                openRawResource.close();
            }
            bitmap.setDensity(0);
            return bitmap;
        } catch (IOException unused) {
            return null;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    public static Drawable A01(Context context, int i, boolean z) {
        Resources resources = context.getResources();
        int i2 = R.array.f2nameremoved;
        if (z) {
            i2 = R.array.f2nameremoved;
        }
        int[] intArray = resources.getIntArray(i2);
        Bitmap createBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.RGB_565);
        createBitmap.setPixel(0, 0, intArray[i]);
        return new BitmapDrawable(context.getResources(), createBitmap);
    }

    public static Drawable A03(Context context, Resources resources, File file) {
        if (file.exists()) {
            try {
                Bitmap bitmap = C107245ax.A06(C623834u.A02(C623834u.A01(context), true), file).A02;
                if (bitmap != null) {
                    Log.d("wallpaper/get found bitmap in wallpaper.jpg");
                    return new BitmapDrawable(resources, bitmap);
                }
                Log.d("wallpaper/get no bitmap in wallpaper.jpg");
                return null;
            } catch (OutOfMemoryError e) {
                Log.e((Throwable) e);
            }
        }
        return null;
    }

    public static void A05(Context context, Drawable drawable, int i) {
        drawable.setColorFilter(new PorterDuffColorFilter(AnonymousClass0YI.A06(AnonymousClass0Y8.A04(context, R.color.f5nameremoved), (int) ((((float) i) / 100.0f) * 255.0f)), PorterDuff.Mode.DARKEN));
    }
}
