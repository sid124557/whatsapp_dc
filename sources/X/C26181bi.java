package X;

import com.whatsapp.util.Log;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/* renamed from: X.1bi  reason: invalid class name and case insensitive filesystem */
public final class C26181bi extends C52452lV {
    public final long A00;
    public final C64393Dh A01;
    public final C116975rB A02 = new C116975rB("^animation/.*\\.json$");

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0020, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0023, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        X.AnonymousClass2A8.A00(r9, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0027, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
        r9.close();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long A03(java.io.OutputStream r9, java.util.zip.ZipInputStream r10) {
        /*
            r8 = this;
            r0 = 8192(0x2000, float:1.14794E-41)
            byte[] r7 = new byte[r0]
            r5 = 0
        L_0x0006:
            r3 = 8192(0x2000, double:4.0474E-320)
            long r3 = r3 + r5
            long r1 = r8.A00     // Catch:{ all -> 0x0021 }
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x001d
            int r1 = r10.read(r7)     // Catch:{ all -> 0x0021 }
            r0 = -1
            if (r1 == r0) goto L_0x001d
            r0 = 0
            r9.write(r7, r0, r1)     // Catch:{ all -> 0x0021 }
            long r0 = (long) r1     // Catch:{ all -> 0x0021 }
            long r5 = r5 + r0
            goto L_0x0006
        L_0x001d:
            r9.close()     // Catch:{ IOException -> 0x0028 }
            return r5
        L_0x0021:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0023 }
        L_0x0023:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r9, r1)     // Catch:{ IOException -> 0x0028 }
            throw r0     // Catch:{ IOException -> 0x0028 }
        L_0x0028:
            r1 = move-exception
            java.lang.String r0 = "LottieStickerZipEntrySaver/saveToOutputStream "
            com.whatsapp.util.Log.e(r0, r1)
            r0 = -1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26181bi.A03(java.io.OutputStream, java.util.zip.ZipInputStream):long");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C26181bi(C64393Dh r8, AnonymousClass1VX r9) {
        super(r8.A0D(), 5, C56952sp.A06(r9, 1900) * 1024);
        C18260x0.A0Q(r9, r8);
        this.A01 = r8;
        this.A00 = C56952sp.A06(r9, 1900) * 1024;
    }

    public final boolean A04(ZipInputStream zipInputStream) {
        String str;
        ZipEntry nextEntry = zipInputStream.getNextEntry();
        int i = 0;
        while (true) {
            if (nextEntry == null) {
                str = "LottieStickerZipEntrySaver/findAnimationEntry unable to find right entry";
                break;
            }
            C116975rB r0 = this.A02;
            String name = nextEntry.getName();
            C162457s7.A0D(name);
            if (!C18280x3.A1X(name, r0.nativePattern)) {
                nextEntry = zipInputStream.getNextEntry();
                i++;
                if (i > 5) {
                    str = "LottieStickerZipEntrySaver/findAnimationEntry too many files to unzip";
                    break;
                }
            } else {
                return true;
            }
        }
        Log.e(str);
        return false;
    }
}
