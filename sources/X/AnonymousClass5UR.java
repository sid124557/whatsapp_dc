package X;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: X.5UR  reason: invalid class name */
public final class AnonymousClass5UR {
    public ContentResolver A00;
    public final C59352wm A01;

    public AnonymousClass5UR(C59352wm r2) {
        C162457s7.A0J(r2, 1);
        this.A01 = r2;
    }

    public static ContentResolver A00(AnonymousClass5UR r1, Object obj) {
        C162457s7.A0J(obj, 0);
        return r1.A02();
    }

    public Cursor A03(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        ContentResolver A002 = A00(this, uri);
        this.A01.A00(AnonymousClass58S.QUERY, uri.getAuthority());
        return A002.query(uri, strArr, str, strArr2, str2);
    }

    public Bundle A04(Uri uri, Bundle bundle, String str) {
        return A00(this, uri).call(uri, str, (String) null, bundle);
    }

    public final ContentResolver A02() {
        ContentResolver contentResolver = this.A00;
        if (contentResolver != null) {
            return contentResolver;
        }
        throw new AnonymousClass8RO();
    }

    public int A01(Uri uri, String str, String[] strArr) {
        return A00(this, uri).delete(uri, str, strArr);
    }

    public ParcelFileDescriptor A05(Uri uri, String str) {
        C18260x0.A0O(uri, str);
        ContentResolver A02 = A02();
        this.A01.A00(AnonymousClass58S.FILE, uri.getAuthority());
        return A02.openFileDescriptor(uri, str);
    }

    public InputStream A06(Uri uri) {
        ContentResolver A002 = A00(this, uri);
        this.A01.A00(AnonymousClass58S.STREAM, uri.getAuthority());
        return A002.openInputStream(uri);
    }

    public OutputStream A07(Uri uri) {
        ContentResolver A002 = A00(this, uri);
        this.A01.A00(AnonymousClass58S.STREAM, uri.getAuthority());
        return A002.openOutputStream(uri);
    }
}
