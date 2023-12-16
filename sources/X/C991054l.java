package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.widget.ImageView;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/* renamed from: X.54l  reason: invalid class name and case insensitive filesystem */
public class C991054l extends AnonymousClass5ZM {
    public final Context A00;
    public final ImageView A01;
    public final File A02;

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        FileInputStream fileInputStream;
        Point A012 = C623834u.A01(this.A00);
        try {
            fileInputStream = new FileInputStream(this.A02);
            Bitmap bitmap = C107245ax.A04((AnonymousClass5QA) null, C623834u.A02(A012, true), fileInputStream, false).A02;
            fileInputStream.close();
            return bitmap;
        } catch (IOException | OutOfMemoryError e) {
            Log.e("LoadThumbnailWallpaperImageTask/error when loading wallpaper resource", e);
            return null;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        if (bitmap == null) {
            return;
        }
        if (!C18320x8.A1T(this)) {
            this.A01.setImageBitmap(bitmap);
        } else {
            bitmap.recycle();
        }
    }

    public C991054l(Context context, ImageView imageView, File file) {
        this.A00 = context;
        this.A01 = imageView;
        this.A02 = file;
    }
}
