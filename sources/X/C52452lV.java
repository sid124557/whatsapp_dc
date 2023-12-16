package X;

import com.facebook.msys.mci.DefaultCrypto;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/* renamed from: X.2lV  reason: invalid class name and case insensitive filesystem */
public abstract class C52452lV {
    public final int A00;
    public final long A01;
    public final String A02;

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0015, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0016, code lost:
        X.AnonymousClass2A8.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0019, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0053, code lost:
        return r6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long A00(java.io.File r9, java.util.zip.ZipInputStream r10, byte[] r11) {
        /*
            r8 = this;
            boolean r0 = r8 instanceof X.C26181bi
            if (r0 == 0) goto L_0x001a
            r0 = r8
            X.1bi r0 = (X.C26181bi) r0
            java.io.FileOutputStream r2 = X.AnonymousClass0x9.A0h(r9)
            long r0 = r0.A03(r2, r10)     // Catch:{ all -> 0x0013 }
            r2.close()
            return r0
        L_0x0013:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0015 }
        L_0x0015:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r2, r1)
            throw r0
        L_0x001a:
            java.io.File r2 = r9.getParentFile()
            if (r2 == 0) goto L_0x0032
            boolean r0 = r2.exists()
            if (r0 != 0) goto L_0x0032
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "DownloadableWallpaperZipEntrySaver/saveFile/creating folder: "
            X.C18260x0.A1P(r1, r0, r2)
            r2.mkdirs()
        L_0x0032:
            r6 = 0
            java.io.FileOutputStream r5 = X.AnonymousClass0x9.A0h(r9)     // Catch:{ FileNotFoundException -> 0x005e }
        L_0x0038:
            int r1 = r10.read(r11)     // Catch:{ all -> 0x0054 }
            r0 = -1
            if (r1 == r0) goto L_0x0050
            r0 = 0
            r5.write(r11, r0, r1)     // Catch:{ all -> 0x0054 }
            long r0 = (long) r1     // Catch:{ all -> 0x0054 }
            long r6 = r6 + r0
            r3 = 8192(0x2000, double:4.0474E-320)
            long r3 = r3 + r6
            r1 = 5242880(0x500000, double:2.590327E-317)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0050
            goto L_0x0038
        L_0x0050:
            r5.close()     // Catch:{ FileNotFoundException -> 0x005e }
            return r6
        L_0x0054:
            r1 = move-exception
            r5.close()     // Catch:{ all -> 0x0059 }
            goto L_0x005d
        L_0x0059:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ FileNotFoundException -> 0x005e }
        L_0x005d:
            throw r1     // Catch:{ FileNotFoundException -> 0x005e }
        L_0x005e:
            r1 = move-exception
            java.lang.String r0 = "DownloadableWallpaperZipEntrySaver"
            com.whatsapp.util.Log.e(r0, r1)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52452lV.A00(java.io.File, java.util.zip.ZipInputStream, byte[]):long");
    }

    public boolean A01(File file) {
        String str;
        if (this instanceof C26181bi) {
            return true;
        }
        String canonicalPath = file.getCanonicalPath();
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append(this.A02);
        A0o.append('/');
        if (!canonicalPath.startsWith(AnonymousClass000.A0X("thumbnails", A0o))) {
            str = "DownloadableWallpaperZipEntrySaver/invalid zip content";
        } else if ("jpg".equals(C627536m.A08(file.getAbsolutePath())) || file.isDirectory()) {
            return true;
        } else {
            str = "DownloadableWallpaperZipEntrySaver/store: Zip entry not jpg";
        }
        Log.d(str);
        return false;
    }

    public boolean A02(ZipInputStream zipInputStream) {
        String str;
        StringBuilder A0o;
        String str2;
        if (this instanceof C26181bi) {
            C26181bi r2 = (C26181bi) this;
            if (r2.A04(zipInputStream)) {
                r2.A01.A0D();
                Log.e("fmessageio/getDownloadFile/no_url");
                Log.w("LottieStickerZipEntrySaver/saveInputStream unable to create temp lottie file");
            }
            return false;
        }
        byte[] bArr = new byte[DefaultCrypto.BUFFER_SIZE];
        long j = 0;
        int i = 0;
        while (true) {
            ZipEntry nextEntry = zipInputStream.getNextEntry();
            if (nextEntry == null) {
                return true;
            }
            File A06 = C627536m.A06(this.A02, nextEntry.getName());
            if (A06 == null) {
                A0o = AnonymousClass001.A0o();
                str2 = "SafeZipEntrySaver/store: Zip entry is attempting to save outside of current directory: ";
            } else if (!A01(A06)) {
                A0o = AnonymousClass001.A0o();
                str2 = "SafeZipEntrySaver/store: Zip entry is not valid: ";
            } else {
                j += A00(A06, zipInputStream, bArr);
                if (((long) DefaultCrypto.BUFFER_SIZE) + j > this.A01) {
                    str = "SafeZipEntrySaver: File being unzipped is too big.";
                    break;
                }
                i++;
                if (i > this.A00) {
                    str = "SafeZipEntrySaver: Too many files to unzip.";
                    break;
                }
            }
            A0o.append(str2);
            C18260x0.A1J(A0o, nextEntry.getName());
        }
        Log.e(str);
        return false;
    }

    public C52452lV(File file, int i, long j) {
        this.A01 = j;
        this.A00 = i;
        this.A02 = file.getCanonicalPath();
    }
}
