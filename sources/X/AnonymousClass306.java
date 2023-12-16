package X;

import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.whatsapp.util.NativeUtils;
import com.whatsapp.util.StatResult;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;

/* renamed from: X.306  reason: invalid class name */
public class AnonymousClass306 {
    public final C183538qC A00 = C72333dY.A05(this, 32);
    public final C183538qC A01;
    public final Set A02 = AnonymousClass002.A0K();
    public volatile Set A03 = AnonymousClass002.A0K();

    public static Collection A00(File[] fileArr, int i) {
        if (fileArr == null || i == 0) {
            return Collections.emptyList();
        }
        ArrayList A0I = AnonymousClass002.A0I(r4);
        for (File file : fileArr) {
            try {
                StatResult lstatOpenFile = StatResult.lstatOpenFile(file.getPath());
                if (!lstatOpenFile.A05) {
                    if (file.isDirectory()) {
                        A0I.addAll(A00(file.listFiles(), i - 1));
                    } else if (lstatOpenFile.A01 == 1) {
                        AnonymousClass0x2.A1Q(A0I, lstatOpenFile.A04);
                    }
                }
            } catch (Exception e) {
                throw new IOException(e);
            } catch (IOException e2) {
                C18260x0.A0k(file, "externalfilevalidator/file read error: ", AnonymousClass001.A0o(), e2);
            }
        }
        return A0I;
    }

    public void A01(Uri uri) {
        if (this.A02.contains(uri.getAuthority())) {
            throw AnonymousClass002.A0C(AnonymousClass000.A0P(uri, "externalfilevalidator/don't allow sharing ", AnonymousClass001.A0o()));
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:16|17|18|(2:20|21)) */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0046, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        X.C18260x0.A1Q(X.AnonymousClass001.A0o(), "externalfilevalidator/getProcDeviceId/proc file not found: ", r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0050, code lost:
        if (r6 != null) goto L_0x0052;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0056, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0057, code lost:
        X.C18260x0.A1Q(X.AnonymousClass001.A0o(), "externalfilevalidator/getProcDeviceId/close failed: ", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0100, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0101, code lost:
        if (r6 != null) goto L_0x0103;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:?, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0106, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0107, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0108, code lost:
        X.C18260x0.A1Q(X.AnonymousClass001.A0o(), "externalfilevalidator/getProcDeviceId/close failed: ", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x010f, code lost:
        throw r2;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A03(com.whatsapp.util.StatResult r10, java.lang.String r11) {
        /*
            r9 = this;
            java.lang.String r5 = "externalfilevalidator/getProcDeviceId/close failed: "
            java.lang.String r0 = "/proc/self"
            java.io.File r1 = X.AnonymousClass002.A0B(r0)
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            r6 = 0
            android.os.ParcelFileDescriptor r6 = android.os.ParcelFileDescriptor.open(r1, r0)     // Catch:{ FileNotFoundException -> 0x0046, all -> 0x0044 }
            java.io.FileDescriptor r0 = r6.getFileDescriptor()     // Catch:{ FileNotFoundException -> 0x0046 }
            int r0 = com.whatsapp.util.NativeUtils.getFileDescriptorForFileDescriptor(r0)     // Catch:{ FileNotFoundException -> 0x0046 }
            com.whatsapp.util.StatResult r0 = com.whatsapp.util.StatResult.statOpenFile(r0)     // Catch:{ FileNotFoundException -> 0x0046 }
            long r3 = r0.A03     // Catch:{ FileNotFoundException -> 0x0046 }
            java.lang.Long r2 = java.lang.Long.valueOf(r3)     // Catch:{ FileNotFoundException -> 0x0046 }
            r6.close()     // Catch:{ IOException -> 0x0025 }
            goto L_0x002d
        L_0x0025:
            r1 = move-exception
            java.lang.StringBuilder r0 = X.AnonymousClass001.A0o()
            X.C18260x0.A1Q(r0, r5, r1)
        L_0x002d:
            if (r2 == 0) goto L_0x005e
            long r1 = r10.A03
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x005e
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "file is on the proc filesystem; not permitting nefarious file share operation; "
            java.lang.String r0 = X.AnonymousClass000.A0V(r0, r11, r1)
            java.io.IOException r0 = X.AnonymousClass002.A0C(r0)
            throw r0
        L_0x0044:
            r2 = move-exception
            throw r2
        L_0x0046:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0100 }
            java.lang.String r0 = "externalfilevalidator/getProcDeviceId/proc file not found: "
            X.C18260x0.A1Q(r1, r0, r2)     // Catch:{ all -> 0x0100 }
            if (r6 == 0) goto L_0x005e
            r6.close()     // Catch:{ IOException -> 0x0056 }
            goto L_0x005e
        L_0x0056:
            r1 = move-exception
            java.lang.StringBuilder r0 = X.AnonymousClass001.A0o()
            X.C18260x0.A1Q(r0, r5, r1)
        L_0x005e:
            int r0 = android.os.Process.myUid()
            int r2 = r10.A02
            if (r0 != r2) goto L_0x0099
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ IOException -> 0x009a }
            java.io.File r0 = android.os.Environment.getExternalStorageDirectory()     // Catch:{ IOException -> 0x009a }
            java.lang.String r0 = r0.getCanonicalPath()     // Catch:{ IOException -> 0x009a }
            r1.append(r0)     // Catch:{ IOException -> 0x009a }
            java.lang.String r0 = "/."
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)     // Catch:{ IOException -> 0x009a }
            com.whatsapp.util.StatResult r0 = com.whatsapp.util.StatResult.lstatOpenFile(r0)     // Catch:{ Exception -> 0x0088 }
            int r1 = r0.A00     // Catch:{ IOException -> 0x009a }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)     // Catch:{ IOException -> 0x009a }
            if (r0 == 0) goto L_0x00a0
            goto L_0x008f
        L_0x0088:
            r1 = move-exception
            java.io.IOException r0 = new java.io.IOException     // Catch:{ IOException -> 0x009a }
            r0.<init>(r1)     // Catch:{ IOException -> 0x009a }
            throw r0     // Catch:{ IOException -> 0x009a }
        L_0x008f:
            if (r1 == r2) goto L_0x00a0
            int r0 = r10.A00
            if (r1 != r0) goto L_0x00a0
            boolean r0 = r10.A05
            if (r0 != 0) goto L_0x00a0
        L_0x0099:
            return
        L_0x009a:
            r1 = move-exception
            java.lang.String r0 = "externalfilevalidator/getExternalStorageGid/unable to read external storage dir"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x00a0:
            java.util.Set r2 = r9.A03
            long r0 = r10.A04
            java.lang.Long r8 = java.lang.Long.valueOf(r0)
            boolean r0 = r2.contains(r8)
            r7 = 1
            if (r0 != 0) goto L_0x0099
            java.lang.String r0 = "externalfilevalidator/update allowlist"
            X.33M r6 = X.AnonymousClass33M.A01(r0)
            java.util.HashSet r5 = X.AnonymousClass002.A0K()
            X.8qC r0 = r9.A00
            java.util.Iterator r4 = X.AnonymousClass0x2.A0j(r0)
        L_0x00bf:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x00e6
            java.io.File r3 = X.AnonymousClass0x9.A0f(r4)
            boolean r0 = r3.isFile()
            r2 = 3
            if (r0 == 0) goto L_0x00dd
            java.io.File[] r1 = new java.io.File[r7]
            r0 = 0
            r1[r0] = r3
            java.util.Collection r0 = A00(r1, r2)
        L_0x00d9:
            r5.addAll(r0)
            goto L_0x00bf
        L_0x00dd:
            java.io.File[] r0 = r3.listFiles()
            java.util.Collection r0 = A00(r0, r2)
            goto L_0x00d9
        L_0x00e6:
            r9.A03 = r5
            r6.A07()
            boolean r0 = r5.contains(r8)
            if (r0 != 0) goto L_0x0099
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "file is owned by our application; not permitting nefarious file share operation; "
            java.lang.String r0 = X.AnonymousClass000.A0V(r0, r11, r1)
            java.io.IOException r0 = X.AnonymousClass002.A0C(r0)
            throw r0
        L_0x0100:
            r2 = move-exception
            if (r6 == 0) goto L_0x010f
            r6.close()     // Catch:{ IOException -> 0x0107 }
            throw r2
        L_0x0107:
            r1 = move-exception
            java.lang.StringBuilder r0 = X.AnonymousClass001.A0o()
            X.C18260x0.A1Q(r0, r5, r1)
        L_0x010f:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass306.A03(com.whatsapp.util.StatResult, java.lang.String):void");
    }

    public AnonymousClass306(C48062eH r4) {
        Class<C64393Dh> cls = C64393Dh.class;
        C183538qC r0 = (C183538qC) r4.A00.get(cls);
        if (r0 != null) {
            this.A01 = r0;
            return;
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("No bridge with type ");
        A0o.append(cls);
        throw AnonymousClass000.A0I(" was registered.", A0o);
    }

    public void A02(ParcelFileDescriptor parcelFileDescriptor) {
        A03(StatResult.statOpenFile(NativeUtils.getFileDescriptorForFileDescriptor(parcelFileDescriptor.getFileDescriptor())), AnonymousClass000.A0P(parcelFileDescriptor, "parcelFileDescriptor=", AnonymousClass001.A0o()));
    }

    public void A04(File file) {
        String canonicalPath = file.getCanonicalPath();
        try {
            A03(StatResult.lstatOpenFile(canonicalPath), AnonymousClass000.A0V("canonicalFilePath=", canonicalPath, AnonymousClass001.A0o()));
        } catch (Exception e) {
            throw new IOException(e);
        }
    }

    public void A05(FileInputStream fileInputStream) {
        A03(StatResult.statOpenFile(NativeUtils.getFileDescriptorForFileDescriptor(fileInputStream.getFD())), AnonymousClass000.A0P(fileInputStream, "fileInputStream=", AnonymousClass001.A0o()));
    }
}
