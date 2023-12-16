package X;

import android.graphics.Bitmap;
import java.io.Closeable;
import java.io.IOException;
import java.util.logging.Level;

/* renamed from: X.93M  reason: invalid class name */
public class AnonymousClass93M implements C180368kv {
    public final int A00;

    public AnonymousClass93M(int i) {
        this.A00 = i;
    }

    public /* bridge */ /* synthetic */ void Bim(Object obj) {
        Bitmap bitmap;
        switch (this.A00) {
            case 0:
                Closeable closeable = (Closeable) obj;
                if (closeable != null) {
                    try {
                        closeable.close();
                        return;
                    } catch (IOException e) {
                        try {
                            C154617dT.A00.log(Level.WARNING, "IOException thrown while closing Closeable.", e);
                            return;
                        } catch (IOException unused) {
                            return;
                        }
                    }
                } else {
                    return;
                }
            case 1:
                bitmap = (Bitmap) obj;
                C162457s7.A0J(bitmap, 0);
                break;
            default:
                bitmap = (Bitmap) obj;
                break;
        }
        bitmap.recycle();
    }
}
