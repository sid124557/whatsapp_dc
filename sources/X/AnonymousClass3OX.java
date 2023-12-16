package X;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.IOException;

/* renamed from: X.3OX  reason: invalid class name */
public abstract class AnonymousClass3OX implements C186058ug {
    public final long A00;
    public final long A01;
    public final long A02;
    public final Uri A03;
    public final AnonymousClass5UR A04;
    public final String A05;
    public final String A06;

    public Bitmap A00(long j, int i) {
        Bitmap bitmap;
        int i2;
        ParcelFileDescriptor A052;
        Uri uri = this.A03;
        AnonymousClass5UR r1 = this.A04;
        C626936e.A06(uri);
        try {
            A052 = r1.A05(uri, "r");
            bitmap = AnonymousClass31W.A01(A052, i, j);
            if (A052 != null) {
                A052.close();
            }
        } catch (IOException | IllegalArgumentException | NullPointerException unused) {
            bitmap = null;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        if (bitmap == null) {
            return bitmap;
        }
        if (this instanceof C26681cb) {
            i2 = ((C26681cb) this).A00;
        } else {
            i2 = 0;
        }
        return AnonymousClass31W.A00(bitmap, i2);
        throw th;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AnonymousClass3OX)) {
            return false;
        }
        return this.A03.equals(((AnonymousClass3OX) obj).A03);
    }

    public int hashCode() {
        return this.A03.hashCode();
    }

    public String toString() {
        return this.A03.toString();
    }

    public AnonymousClass3OX(Uri uri, AnonymousClass5UR r2, String str, String str2, long j, long j2, long j3) {
        this.A04 = r2;
        this.A02 = j;
        this.A03 = uri;
        this.A05 = str;
        this.A06 = str2;
        this.A01 = j2;
        this.A00 = j3;
    }

    public Uri B3d() {
        return this.A03;
    }

    public long B6l() {
        return this.A01;
    }

    public /* synthetic */ long B7A() {
        return 0;
    }

    public String B9l() {
        return this.A06;
    }

    public long getContentLength() {
        return this.A00;
    }
}
