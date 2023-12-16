package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.view.animation.DecelerateInterpolator;
import com.whatsapp.settings.chat.wallpaper.WallpaperImagePreview;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: X.55U  reason: invalid class name */
public class AnonymousClass55U extends AnonymousClass5ZM {
    public final int A00;
    public final int A01;
    public final Context A02;
    public final Resources A03;
    public final WallpaperImagePreview A04;
    public final WallpaperImagePreview A05;

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        InputStream openRawResource;
        Resources resources = this.A03;
        if (resources != null) {
            Point A012 = C623834u.A01(this.A02);
            try {
                openRawResource = resources.openRawResource(this.A01);
                Bitmap bitmap = C107245ax.A04((AnonymousClass5QA) null, C623834u.A02(A012, true), openRawResource, false).A02;
                if (openRawResource != null) {
                    openRawResource.close();
                }
                return bitmap;
            } catch (IOException | OutOfMemoryError e) {
                Log.e("LoadWallpaperImageTask/error when loading wallpaper resource", e);
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        }
        return null;
        throw th;
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        if (bitmap == null) {
            return;
        }
        if (!C18320x8.A1T(this)) {
            this.A04.setImageBitmap(bitmap);
            this.A05.animate().setDuration(500).alpha(0.0f).setInterpolator(new DecelerateInterpolator()).setListener(new AnonymousClass67L(this, 19));
            return;
        }
        bitmap.recycle();
    }

    public AnonymousClass55U(Context context, Resources resources, WallpaperImagePreview wallpaperImagePreview, WallpaperImagePreview wallpaperImagePreview2, int i, int i2) {
        this.A02 = context;
        this.A05 = wallpaperImagePreview;
        this.A04 = wallpaperImagePreview2;
        this.A03 = resources;
        this.A00 = i;
        this.A01 = i2;
    }
}
