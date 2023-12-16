package X;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

/* renamed from: X.0WX  reason: invalid class name */
public class AnonymousClass0WX {
    public static ByteBuffer A01(Context context, Uri uri) {
        FileInputStream fileInputStream;
        try {
            ParcelFileDescriptor A00 = C02750Hl.A00(context.getContentResolver(), uri, (CancellationSignal) null, "r");
            if (A00 == null) {
                return null;
            }
            try {
                fileInputStream = new FileInputStream(A00.getFileDescriptor());
                FileChannel channel = fileInputStream.getChannel();
                MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0, channel.size());
                fileInputStream.close();
                A00.close();
                return map;
            } catch (Throwable th) {
                A00.close();
                throw th;
            }
            throw th;
        } catch (IOException unused) {
            return null;
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
    }

    public static File A00(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir != null) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append(".font");
            A0o.append(Process.myPid());
            A0o.append("-");
            A0o.append(Process.myTid());
            String A0X = AnonymousClass000.A0X("-", A0o);
            int i = 0;
            while (i < 100) {
                File A0A = AnonymousClass002.A0A(cacheDir, AnonymousClass000.A0Y(A0X, AnonymousClass001.A0o(), i));
                try {
                    if (A0A.createNewFile()) {
                        return A0A;
                    }
                    i++;
                } catch (IOException unused) {
                }
            }
        }
        return null;
    }

    public static boolean A02(Resources resources, File file, int i) {
        try {
            InputStream openRawResource = resources.openRawResource(i);
            try {
                boolean A03 = A03(file, openRawResource);
                if (openRawResource != null) {
                    try {
                        openRawResource.close();
                    } catch (IOException unused) {
                    }
                }
                return A03;
            } catch (Throwable th) {
                th = th;
                if (openRawResource != null) {
                    try {
                        openRawResource.close();
                        throw th;
                    } catch (IOException unused2) {
                        throw th;
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0042, code lost:
        if (r5 == null) goto L_0x0047;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x003a A[SYNTHETIC, Splitter:B:22:0x003a] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A03(java.io.File r8, java.io.InputStream r9) {
        /*
            android.os.StrictMode$ThreadPolicy r7 = android.os.StrictMode.allowThreadDiskWrites()
            r6 = 0
            r5 = 0
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0028 }
            r4.<init>(r8, r6)     // Catch:{ IOException -> 0x0028 }
            r0 = 1024(0x400, float:1.435E-42)
            byte[] r2 = new byte[r0]     // Catch:{ IOException -> 0x0025, all -> 0x0022 }
        L_0x000f:
            int r1 = r9.read(r2)     // Catch:{ IOException -> 0x0025, all -> 0x0022 }
            r0 = -1
            if (r1 == r0) goto L_0x001a
            r4.write(r2, r6, r1)     // Catch:{ IOException -> 0x0025, all -> 0x0022 }
            goto L_0x000f
        L_0x001a:
            r4.close()     // Catch:{ IOException -> 0x001d }
        L_0x001d:
            android.os.StrictMode.setThreadPolicy(r7)
            r0 = 1
            return r0
        L_0x0022:
            r0 = move-exception
            r5 = r4
            goto L_0x0044
        L_0x0025:
            r3 = move-exception
            r5 = r4
            goto L_0x0029
        L_0x0028:
            r3 = move-exception
        L_0x0029:
            java.lang.String r2 = "TypefaceCompatUtil"
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0041 }
            java.lang.String r0 = "Error copying resource contents to temp file: "
            java.lang.String r0 = X.AnonymousClass000.A0a(r0, r1, r3)     // Catch:{ all -> 0x0041 }
            android.util.Log.e(r2, r0)     // Catch:{ all -> 0x0041 }
            if (r5 == 0) goto L_0x003d
            r5.close()     // Catch:{ IOException -> 0x003d }
        L_0x003d:
            android.os.StrictMode.setThreadPolicy(r7)
            return r6
        L_0x0041:
            r0 = move-exception
            if (r5 == 0) goto L_0x0047
        L_0x0044:
            r5.close()     // Catch:{ IOException -> 0x0047 }
        L_0x0047:
            android.os.StrictMode.setThreadPolicy(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0WX.A03(java.io.File, java.io.InputStream):boolean");
    }
}
