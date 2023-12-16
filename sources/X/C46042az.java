package X;

import android.graphics.Bitmap;
import android.net.Uri;
import android.util.Pair;
import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;
import com.whatsapp.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/* renamed from: X.2az  reason: invalid class name and case insensitive filesystem */
public class C46042az {
    public final C55682qk A00;
    public final C45122Yt A01;
    public final C107105ah A02;
    public final C107085af A03;

    public AnonymousClass2QF A00(C149557Mx r8) {
        byte[] bArr;
        FileInputStream A0g;
        byte[] bArr2;
        Pair pair;
        byte[] A04;
        int i;
        int i2;
        byte[] A042;
        byte[] bArr3;
        Pair pair2;
        C633138t r1 = r8.A00;
        if (AnonymousClass36O.A04(r1)) {
            if (!r8.A03) {
                bArr3 = this.A03.A05(Uri.fromFile(r8.A01), 100, 100, 0);
            } else {
                bArr3 = null;
            }
            File file = r8.A01;
            Pair A0M = C107655bf.A0M(file);
            try {
                if (AnonymousClass0x7.A05(A0M.second) > AnonymousClass0x7.A05(A0M.first)) {
                    pair2 = AnonymousClass29I.A00(file);
                    return new AnonymousClass2QF(A0M, pair2, bArr3, (byte[]) null);
                }
            } catch (Exception | OutOfMemoryError unused) {
            }
            pair2 = null;
            return new AnonymousClass2QF(A0M, pair2, bArr3, (byte[]) null);
        } else if (r1 == C633138t.A0A || r1 == C633138t.A0D || r1 == C633138t.A0h || r1 == C633138t.A0B || r1 == C633138t.A0I || r1 == C633138t.A0U) {
            try {
                A0g = AnonymousClass0x9.A0g(r8.A01);
                C140226tM r3 = new C140226tM(A0g.available());
                byte[] bArr4 = new byte[ZipDecompressor.UNZIP_BUFFER_SIZE];
                while (true) {
                    int read = A0g.read(bArr4);
                    if (read == -1) {
                        break;
                    }
                    r3.write(bArr4, 0, read);
                }
                bArr = r3.toByteArray();
                try {
                    A0g.close();
                } catch (IOException e) {
                    e = e;
                }
            } catch (IOException e2) {
                e = e2;
                bArr = null;
                Log.e("ThumbnailGenerator/createThumbnailForThumbnailDownload/failed", e);
                return new AnonymousClass2QF((Pair) null, (Pair) null, bArr, (byte[]) null);
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
            return new AnonymousClass2QF((Pair) null, (Pair) null, bArr, (byte[]) null);
        } else if (C106695a0.A03(r1)) {
            if (r8.A03) {
                A042 = null;
            } else {
                C107105ah r5 = this.A02;
                A042 = r5.A04(r8.A01, r8.A02, 1.0f, r5.A01.A0O(C58422vE.A02, 6249));
            }
            return new AnonymousClass2QF((Pair) null, (Pair) null, A042, (byte[]) null);
        } else if (AnonymousClass36O.A09(r1)) {
            try {
                C104315Qm r12 = new C104315Qm(r8.A01);
                if (r12.A02()) {
                    i = r12.A01;
                    i2 = r12.A03;
                } else {
                    i = r12.A03;
                    i2 = r12.A01;
                }
                pair = C18300x5.A0E(Integer.valueOf(i), i2);
            } catch (C138066pi e3) {
                Log.w("thumbnailgenerator/video/unable to get video meta", e3);
                pair = null;
            }
            if (r8.A03) {
                A04 = null;
            } else {
                A04 = C107085af.A04(r8.A01);
            }
            return new AnonymousClass2QF(pair, (Pair) null, A04, (byte[]) null);
        } else if (!AnonymousClass36O.A06(r1)) {
            return null;
        } else {
            C153367bC A002 = this.A01.A00(r8.A01, r8.A02);
            if (r8.A03) {
                if (A002 != null) {
                    bArr2 = A002.A05();
                } else {
                    bArr2 = null;
                }
                return new AnonymousClass2QF((Pair) null, (Pair) null, (byte[]) null, bArr2);
            }
            if (A002 != null) {
                try {
                    Bitmap A003 = A002.A00();
                    if (A003 != null) {
                        ByteArrayOutputStream A0e = AnonymousClass0x9.A0e();
                        C18310x6.A12(A003, A0e);
                        byte[] byteArray = A0e.toByteArray();
                        A003.recycle();
                        return new AnonymousClass2QF(new Pair(64, 64), (Pair) null, byteArray, (byte[]) null);
                    }
                } catch (OutOfMemoryError e4) {
                    Log.e("ThumbnailGenerator/createThumbnailForSticker/failed", e4);
                }
            }
            return new AnonymousClass2QF((Pair) null, (Pair) null, (byte[]) null, (byte[]) null);
        }
        throw th;
    }

    public C46042az(C55682qk r1, C45122Yt r2, C107105ah r3, C107085af r4) {
        this.A00 = r1;
        this.A02 = r3;
        this.A03 = r4;
        this.A01 = r2;
    }
}
