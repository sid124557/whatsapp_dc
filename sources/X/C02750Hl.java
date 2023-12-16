package X;

import android.content.ContentResolver;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;

/* renamed from: X.0Hl  reason: invalid class name and case insensitive filesystem */
public class C02750Hl {
    public static ParcelFileDescriptor A00(ContentResolver contentResolver, Uri uri, CancellationSignal cancellationSignal, String str) {
        return contentResolver.openFileDescriptor(uri, str, cancellationSignal);
    }
}
