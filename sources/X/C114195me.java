package X;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

/* renamed from: X.5me  reason: invalid class name and case insensitive filesystem */
public class C114195me implements C186058ug, C188018yB {
    public final int A00;
    public final long A01;
    public final Uri A02;
    public final AnonymousClass5UR A03;
    public final File A04;
    public final boolean A05;

    public Bitmap Bqg(int i) {
        ParcelFileDescriptor parcelFileDescriptor;
        Bitmap createBitmap;
        try {
            AnonymousClass5UR r3 = this.A03;
            Uri uri = this.A02;
            Matrix A0K = C107655bf.A0K(uri, r3);
            try {
                File A042 = C627536m.A04(uri);
                if (A042 != null) {
                    parcelFileDescriptor = ParcelFileDescriptor.open(A042, 268435456);
                } else {
                    parcelFileDescriptor = r3.A05(uri, "r");
                }
            } catch (FileNotFoundException unused) {
                parcelFileDescriptor = null;
            }
            long j = (long) i;
            Bitmap A012 = AnonymousClass31W.A01(parcelFileDescriptor, i, j * j * 2);
            if (A0K == null || A0K.isIdentity()) {
                if (parcelFileDescriptor != null) {
                    parcelFileDescriptor.close();
                }
                return A012;
            }
            if (A012 == null) {
                createBitmap = null;
            } else {
                createBitmap = Bitmap.createBitmap(A012, 0, 0, A012.getWidth(), A012.getHeight(), A0K, true);
            }
            if (parcelFileDescriptor != null) {
                parcelFileDescriptor.close();
            }
            return createBitmap;
        } catch (IOException unused2) {
            return null;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    public Uri B3d() {
        return this.A02;
    }

    public long B6l() {
        return new Date(this.A04.lastModified()).getTime();
    }

    public /* synthetic */ long B7A() {
        return 0;
    }

    public File B7c() {
        return this.A04;
    }

    public byte B9d() {
        return 1;
    }

    public String B9l() {
        return "image/*";
    }

    public int BCL() {
        return this.A00;
    }

    public boolean BHc() {
        return this.A05;
    }

    public long getContentLength() {
        return this.A01;
    }

    public int getType() {
        return 0;
    }

    public C114195me(AnonymousClass5UR r4, File file, int i, boolean z) {
        Uri.Builder buildUpon = Uri.fromFile(file).buildUpon();
        if (z) {
            buildUpon.appendQueryParameter("flip-h", "1");
        }
        if (i != 0) {
            buildUpon.appendQueryParameter("rotation", Integer.toString(i));
        }
        Uri build = buildUpon.build();
        long length = file.length();
        this.A03 = r4;
        this.A02 = build;
        this.A01 = length;
        this.A04 = file;
        this.A05 = z;
        this.A00 = i;
    }
}
