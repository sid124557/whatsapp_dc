package X;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.CancellationSignal;

/* renamed from: X.0Hx  reason: invalid class name and case insensitive filesystem */
public class C02870Hx {
    public static Cursor A00(ContentResolver contentResolver, Uri uri, Object obj, String str, String str2, String[] strArr, String[] strArr2) {
        return contentResolver.query(uri, strArr, str, strArr2, str2, (CancellationSignal) obj);
    }
}
