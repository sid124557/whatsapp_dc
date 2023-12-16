package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/* renamed from: X.2vq  reason: invalid class name and case insensitive filesystem */
public class C58802vq {
    public final AnonymousClass08M A00 = AnonymousClass08M.A01();
    public final C29441ip A01;
    public final C55322qA A02;
    public final C46552bp A03;
    public final C72173dI A04;

    public C58802vq(C29441ip r2, C55322qA r3, C46552bp r4, AnonymousClass4FS r5) {
        this.A04 = C72173dI.A00(r5);
        this.A03 = r4;
        this.A01 = r2;
        this.A02 = r3;
    }

    public static Bitmap A00(Context context, File file) {
        FileInputStream A0g;
        Point A012 = C623834u.A01(context);
        try {
            A0g = AnonymousClass0x9.A0g(file);
            Bitmap bitmap = C107245ax.A04((AnonymousClass5QA) null, C623834u.A02(A012, true), A0g, false).A02;
            A0g.close();
            return bitmap;
        } catch (IOException | OutOfMemoryError e) {
            Log.e("DownloadableWallpaperManager/error when loading wallpaper resource", e);
            return null;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }
}
