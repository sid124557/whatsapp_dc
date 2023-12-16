package X;

import android.graphics.Bitmap;
import android.net.Uri;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;

/* renamed from: X.4tL  reason: invalid class name and case insensitive filesystem */
public class C95304tL extends AnonymousClass3OX {
    public Bitmap A00(long j, int i) {
        File A0B;
        boolean z;
        String str;
        String str2 = this.A05;
        if (str2 == null) {
            A0B = null;
        } else {
            A0B = AnonymousClass002.A0B(str2);
        }
        if (A0B == null) {
            Log.e("mediafileutils/createVideoThumbnail/file=null");
            return null;
        }
        try {
            C172218Kd.A04(A0B);
            z = true;
        } catch (IOException unused) {
            z = false;
        }
        if (!z) {
            return C107085af.A00(new AnonymousClass8HO(A0B), 512, 0, 0, false, false);
        }
        try {
            return C172218Kd.A00(A0B);
        } catch (IOException | IllegalArgumentException e) {
            e = e;
            str = "mediafileutils/createGifThumbnail/gif file not read ";
            Log.e(str, e);
            return null;
        } catch (Exception e2) {
            e = e2;
            str = "mediafileutils/createGifThumbnail/unexpected gif exception ";
            Log.e(str, e);
            return null;
        }
    }

    public Bitmap Bqg(int i) {
        File A0B;
        boolean z;
        String str;
        if (i < 144) {
            String str2 = this.A05;
            if (str2 == null) {
                A0B = null;
            } else {
                A0B = AnonymousClass002.A0B(str2);
            }
            if (A0B == null) {
                Log.e("mediafileutils/createVideoThumbnail/file=null");
                return null;
            }
            try {
                C172218Kd.A04(A0B);
                z = true;
            } catch (IOException unused) {
                z = false;
            }
            if (!z) {
                return C107085af.A00(new AnonymousClass8HO(A0B), 96, 0, 0, false, false);
            }
            try {
                return C172218Kd.A00(A0B);
            } catch (IOException | IllegalArgumentException e) {
                e = e;
                str = "mediafileutils/createGifThumbnail/gif file not read ";
                Log.e(str, e);
                return null;
            } catch (Exception e2) {
                e = e2;
                str = "mediafileutils/createGifThumbnail/unexpected gif exception ";
                Log.e(str, e);
                return null;
            }
        } else {
            long j = (long) i;
            return A00(2 * j * j, i);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C95304tL) || !this.A03.equals(((AnonymousClass3OX) obj).A03)) {
            return false;
        }
        return true;
    }

    public int getType() {
        return 1;
    }

    public int hashCode() {
        return this.A03.toString().hashCode();
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("VideoObject");
        return AnonymousClass001.A0k(A0o, this.A02);
    }

    public C95304tL(Uri uri, AnonymousClass5UR r2, String str, String str2, long j, long j2, long j3) {
        super(uri, r2, str, str2, j, j2, j3);
    }
}
