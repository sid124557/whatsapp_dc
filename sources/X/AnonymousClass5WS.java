package X;

import androidx.core.view.inputmethod.InputContentInfoCompat;
import com.whatsapp.util.Log;

/* renamed from: X.5WS  reason: invalid class name */
public class AnonymousClass5WS {
    public static final String[] A01 = {"image/gif", "video/x.looping_mp4", "image/jpeg", "image/jpg", "image/png", "image/webp.wasticker"};
    public InputContentInfoCompat A00;

    public C147997Gn A00(InputContentInfoCompat inputContentInfoCompat, int i) {
        try {
            InputContentInfoCompat inputContentInfoCompat2 = this.A00;
            if (inputContentInfoCompat2 != null) {
                inputContentInfoCompat2.releasePermission();
            }
        } catch (Exception e) {
            Log.e("conversation/InputContentInfoCompat#releasePermission() failed.", e);
        } catch (Throwable th) {
            this.A00 = null;
            throw th;
        }
        this.A00 = null;
        for (String str : A01) {
            if (inputContentInfoCompat.getDescription().hasMimeType(str)) {
                if ((i & 1) != 0) {
                    try {
                        inputContentInfoCompat.requestPermission();
                    } catch (Exception e2) {
                        Log.e("conversation/InputContentInfoCompat#requestPermission() failed.", e2);
                        return null;
                    }
                }
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("conversation/onCommitContent: ");
                C18260x0.A1L(A0o, inputContentInfoCompat.getContentUri().toString());
                this.A00 = inputContentInfoCompat;
                return new C147997Gn(str, inputContentInfoCompat.getContentUri());
            }
        }
        return null;
    }
}
