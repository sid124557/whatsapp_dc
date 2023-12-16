package X;

import android.os.Environment;
import com.whatsapp.util.Log;
import java.io.File;

/* renamed from: X.2Ve  reason: invalid class name and case insensitive filesystem */
public final class C44232Ve {
    public final C64393Dh A00;

    public C44232Ve(C64393Dh r2) {
        C162457s7.A0J(r2, 1);
        this.A00 = r2;
    }

    public final File A00(String str) {
        File A002;
        C162457s7.A0J(str, 0);
        if (!"mounted".equals(Environment.getExternalStorageState())) {
            Log.e("BloksFileManager/getCapturedMediaDirectory external storage is not writable");
            A002 = null;
        } else {
            A002 = C64393Dh.A00(this.A00, "bloks_captured_media");
        }
        if (A002 != null) {
            if (A002.exists() || A002.mkdirs()) {
                return C18330xA.A04(A002.getPath(), str);
            }
            Log.e("BloksFileManager/getCapturedMediaFile: failed to create media directory");
        }
        return null;
    }
}
