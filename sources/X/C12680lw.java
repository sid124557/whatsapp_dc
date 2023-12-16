package X;

import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.Log;
import androidx.sharetarget.ShortcutInfoCompatSaverImpl;
import java.io.FileOutputStream;
import java.io.IOException;

/* renamed from: X.0lw  reason: invalid class name and case insensitive filesystem */
public class C12680lw implements Runnable {
    public final /* synthetic */ Bitmap A00;
    public final /* synthetic */ ShortcutInfoCompatSaverImpl A01;
    public final /* synthetic */ String A02;

    public C12680lw(Bitmap bitmap, ShortcutInfoCompatSaverImpl shortcutInfoCompatSaverImpl, String str) {
        this.A01 = shortcutInfoCompatSaverImpl;
        this.A00 = bitmap;
        this.A02 = str;
    }

    public void run() {
        FileOutputStream fileOutputStream;
        Bitmap bitmap = this.A00;
        String str = this.A02;
        if (!TextUtils.isEmpty(str)) {
            try {
                fileOutputStream = new FileOutputStream(AnonymousClass002.A0B(str));
                if (bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream)) {
                    fileOutputStream.close();
                    return;
                } else {
                    Log.wtf("ShortcutInfoCompatSaver", "Unable to compress bitmap");
                    throw AnonymousClass002.A0E(AnonymousClass000.A0V("Unable to compress bitmap for saving ", str, AnonymousClass001.A0o()));
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e) {
                Log.wtf("ShortcutInfoCompatSaver", "Unable to write bitmap to file", e);
                throw new RuntimeException(AnonymousClass000.A0V("Unable to write bitmap to file ", str, AnonymousClass001.A0o()), e);
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        } else {
            throw AnonymousClass001.A0c("path is empty");
        }
        throw th;
    }
}
