package X;

import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.Map;

/* renamed from: X.1Sw  reason: invalid class name and case insensitive filesystem */
public final class C23391Sw extends C56782sY {
    public String A00;
    public String A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C23391Sw(C56492s4 r10, C54292oU r11, AnonymousClass1VX r12, AnonymousClass33K r13, C55132pq r14, AnonymousClass4FS r15) {
        super(r10, r11, r13, r14, r15, 13);
        C18260x0.A0f(r11, r15, r10, r14, r13);
        C162457s7.A0J(r12, 6);
        int A0O = r12.A0O(C58422vE.A02, 3427);
        this.A00 = A0O;
        this.A01 = A0O;
    }

    public final void A0F(C85034Er r8, String str, String str2) {
        C162457s7.A0J(str2, 1);
        this.A00 = str2;
        this.A01 = str;
        super.A02(r8, (AnonymousClass486) null, (Object) null, str, (String) null, (Map) null);
    }

    public /* bridge */ /* synthetic */ void A02(C85034Er r2, AnonymousClass486 r3, Object obj, String str, String str2, Map map) {
        throw AnonymousClass002.A0G("Current fetch method is not supported for the bloks commerce flow");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        r9.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00a3, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        X.AnonymousClass2A8.A00(r9, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00a7, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00e4, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:?, code lost:
        X.AnonymousClass2A8.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00e8, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ boolean A0B(java.io.InputStream r17, java.lang.Object r18, java.util.Map r19) {
        /*
            r16 = this;
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
            java.lang.String r1 = "commerce_flow_"
            r3.append(r1)
            r2 = r16
            java.lang.String r0 = r2.A00
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r3)
            java.io.File r0 = r2.A01(r0)
            if (r0 == 0) goto L_0x001f
            X.C627536m.A0O(r0)
            java.lang.String r0 = "CommerceBloksAssetDownloader/removeMetadataAsset/ map removed"
            com.whatsapp.util.Log.d((java.lang.String) r0)
        L_0x001f:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r1)
            java.lang.String r0 = r2.A00
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)
            java.io.File r1 = super.A01(r0)
            java.lang.String r0 = X.AnonymousClass99P.A0G
            java.io.File r15 = r2.A01(r0)
            r8 = 0
            if (r1 == 0) goto L_0x00f1
            if (r15 == 0) goto L_0x00f1
            java.lang.String r0 = "CommerceBloksAssetDownloader/storeAssets/storing file"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            java.util.zip.ZipInputStream r5 = new java.util.zip.ZipInputStream     // Catch:{ Exception -> 0x00e9 }
            r0 = r17
            r5.<init>(r0)     // Catch:{ Exception -> 0x00e9 }
            java.lang.String r14 = r1.getCanonicalPath()     // Catch:{ all -> 0x00e2 }
            r7 = 8192(0x2000, float:1.14794E-41)
            byte[] r6 = new byte[r7]     // Catch:{ all -> 0x00e2 }
            r12 = 0
        L_0x004e:
            java.util.zip.ZipEntry r2 = r5.getNextEntry()     // Catch:{ all -> 0x00e2 }
            if (r2 == 0) goto L_0x00d8
            java.lang.String r0 = r2.getName()     // Catch:{ all -> 0x00e2 }
            java.lang.String r1 = X.C627536m.A08(r0)     // Catch:{ all -> 0x00e2 }
            java.lang.String r0 = "json"
            boolean r0 = X.C162457s7.A0P(r1, r0)     // Catch:{ all -> 0x00e2 }
            if (r0 == 0) goto L_0x00ca
            r1 = r14
            java.lang.String r0 = r2.getName()     // Catch:{ all -> 0x00e2 }
            java.io.File r0 = X.AnonymousClass002.A0B(r0)     // Catch:{ all -> 0x00e2 }
            java.lang.String r0 = r0.getName()     // Catch:{ all -> 0x00e2 }
        L_0x0071:
            java.io.File r1 = X.C627536m.A06(r1, r0)     // Catch:{ all -> 0x00e2 }
            if (r1 == 0) goto L_0x00b9
            java.io.File r0 = r1.getParentFile()     // Catch:{ all -> 0x00e2 }
            if (r0 == 0) goto L_0x0080
            X.C18280x3.A10(r0)     // Catch:{ all -> 0x00e2 }
        L_0x0080:
            r10 = 0
            java.io.FileOutputStream r9 = X.AnonymousClass0x9.A0h(r1)     // Catch:{ FileNotFoundException -> 0x00a8 }
        L_0x0086:
            int r1 = r5.read(r6)     // Catch:{ all -> 0x00a1 }
            r0 = -1
            if (r1 == r0) goto L_0x009d
            r9.write(r6, r8, r1)     // Catch:{ all -> 0x00a1 }
            long r0 = (long) r1     // Catch:{ all -> 0x00a1 }
            long r10 = r10 + r0
            r3 = 8192(0x2000, double:4.0474E-320)
            long r3 = r3 + r10
            r1 = 10485760(0xa00000, double:5.180654E-317)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x009d
            goto L_0x0086
        L_0x009d:
            r9.close()     // Catch:{ FileNotFoundException -> 0x00a8 }
            goto L_0x00ae
        L_0x00a1:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00a3 }
        L_0x00a3:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r9, r1)     // Catch:{ FileNotFoundException -> 0x00a8 }
            throw r0     // Catch:{ FileNotFoundException -> 0x00a8 }
        L_0x00a8:
            r1 = move-exception
            java.lang.String r0 = "CommerceBloksAssetZipEntrySaver/saveFile"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x00e2 }
        L_0x00ae:
            long r12 = r12 + r10
            long r3 = (long) r7     // Catch:{ all -> 0x00e2 }
            long r3 = r3 + r12
            r1 = 15728640(0xf00000, double:7.7709807E-317)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x004e
            goto L_0x00d3
        L_0x00b9:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x00e2 }
            java.lang.String r0 = "CommerceBloksAssetZipEntrySaver/saveInputStream: Zip entry is not valid: "
            r1.append(r0)     // Catch:{ all -> 0x00e2 }
            java.lang.String r0 = r2.getName()     // Catch:{ all -> 0x00e2 }
            X.C18260x0.A1J(r1, r0)     // Catch:{ all -> 0x00e2 }
            goto L_0x004e
        L_0x00ca:
            java.lang.String r1 = r15.getCanonicalPath()     // Catch:{ all -> 0x00e2 }
            java.lang.String r0 = r2.getName()     // Catch:{ all -> 0x00e2 }
            goto L_0x0071
        L_0x00d3:
            java.lang.String r0 = "CommerceBloksAssetZipEntrySaver/saveInputStream: File being unzipped is too big."
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x00e2 }
        L_0x00d8:
            java.lang.String r0 = "CommerceBloksAssetDownloader/storeAssets/stored"
            com.whatsapp.util.Log.d((java.lang.String) r0)     // Catch:{ all -> 0x00e2 }
            r5.close()     // Catch:{ Exception -> 0x00e9 }
            r0 = 1
            return r0
        L_0x00e2:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00e4 }
        L_0x00e4:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r5, r1)     // Catch:{ Exception -> 0x00e9 }
            throw r0     // Catch:{ Exception -> 0x00e9 }
        L_0x00e9:
            r1 = move-exception
            java.lang.String r0 = "CommerceBloksAssetDownloader/unzipBatchBackgrounds"
            com.whatsapp.util.Log.e(r0, r1)
            r0 = 0
            return r0
        L_0x00f1:
            java.lang.String r0 = "CommerceBloksAssetDownloader/storeAssets:: Could not prepare resource directory"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23391Sw.A0B(java.io.InputStream, java.lang.Object, java.util.Map):boolean");
    }

    public final String A0E(String str) {
        File[] listFiles;
        File A012 = A01(AnonymousClass000.A0V("commerce_flow_", str, AnonymousClass001.A0o()));
        if (A012 == null || (listFiles = A012.listFiles()) == null) {
            return null;
        }
        int length = listFiles.length;
        int i = 0;
        while (i < length) {
            File file = listFiles[i];
            if (C162457s7.A0P(C627536m.A08(file.getAbsolutePath()), "json")) {
                try {
                    byte[] A002 = C382926u.A00(file);
                    C162457s7.A0D(A002);
                    return new String(A002, AnonymousClass79X.A05);
                } catch (IOException e) {
                    Log.e("CommerceBloksAssetDownloader/readFile/ioerror", e);
                    return null;
                }
            } else {
                i++;
            }
        }
        throw C18320x8.A0t();
    }
}
