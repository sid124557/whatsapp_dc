package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;

/* renamed from: X.7dk  reason: invalid class name and case insensitive filesystem */
public class C154787dk {
    public static final C180368kv A00 = new AnonymousClass93M(2);

    public static C172258Kh A00(Uri uri) {
        Bitmap decodeFile = BitmapFactory.decodeFile(uri.getPath(), new BitmapFactory.Options());
        C180368kv r2 = A00;
        C180358ku r1 = C172258Kh.A04;
        if (decodeFile != null) {
            return new C172258Kh(r1, r2, (Object) decodeFile);
        }
        return null;
    }
}
