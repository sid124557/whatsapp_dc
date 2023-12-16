package X;

import android.graphics.Bitmap;
import android.net.TrafficStats;
import android.util.Pair;
import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;

/* renamed from: X.1LV  reason: invalid class name */
public class AnonymousClass1LV extends C153117ah {
    public final C54132oE A00;

    public AnonymousClass1LV(C69263Wi r9, C185398ta r10, C54132oE r11, File file, long j) {
        super(r9, r10, file, "sticker", 4, j);
        this.A00 = r11;
    }

    public Pair A00(AnonymousClass7PR r14) {
        InputStream A0b;
        ByteArrayInputStream A0d;
        String A04 = C627236i.A04(r14.A03);
        StringBuilder A0u = C18290x4.A0u(A04);
        A0u.append("StickerThumbLoader/download ");
        String str = r14.A04;
        C18260x0.A1L(A0u, str);
        TrafficStats.setThreadStatsTag(11);
        Bitmap bitmap = null;
        try {
            C54132oE r7 = this.A00;
            C56612sH r6 = r7.A04;
            long A0H = r6.A0H();
            try {
                AnonymousClass4GL A03 = r7.A0A.A03(str);
                try {
                    long A032 = C56612sH.A03(r6, A0H);
                    HttpURLConnection httpURLConnection = ((AnonymousClass3PZ) A03).A01;
                    r7.A02(httpURLConnection.getURL(), (long) httpURLConnection.getResponseCode(), A032);
                    A0b = C18310x6.A0b(r7.A03, A03, (Integer) null, 26);
                    ByteArrayOutputStream A0e = AnonymousClass0x9.A0e();
                    byte[] bArr = new byte[ZipDecompressor.UNZIP_BUFFER_SIZE];
                    while (true) {
                        int read = A0b.read(bArr);
                        if (read == -1) {
                            break;
                        }
                        A0e.write(bArr, 0, read);
                    }
                    A0d = AnonymousClass0x9.A0d(A0e.toByteArray());
                    A0b.close();
                    A03.close();
                    AnonymousClass30R r62 = this.A03;
                    r62.A04(A0d, A04);
                    bitmap = r62.A01(A04, r14.A01, r14.A00, false);
                    if (bitmap == null) {
                        C18260x0.A0r("StickerThumbLoader/decode failed ", str, AnonymousClass001.A0o());
                    }
                    A0d.close();
                    TrafficStats.clearThreadStatsTag();
                    return AnonymousClass0x9.A0C(Boolean.TRUE, bitmap);
                    throw th;
                    throw th;
                } catch (Throwable th) {
                    A03.close();
                    throw th;
                }
            } catch (IOException e) {
                C18260x0.A0u("StickerPackNetworkProvider/preview thumbnail decode failed ", str, AnonymousClass001.A0o(), e);
                throw e;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
        } catch (IOException e2) {
            try {
                C18260x0.A0u("StickerThumbLoader/error downloading ", str, AnonymousClass001.A0o(), e2);
            } catch (Throwable th3) {
                TrafficStats.clearThreadStatsTag();
                throw th3;
            }
        } catch (Throwable th4) {
            th.addSuppressed(th4);
        }
    }
}
