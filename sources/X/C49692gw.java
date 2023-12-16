package X;

import com.whatsapp.util.Log;
import java.io.File;

/* renamed from: X.2gw  reason: invalid class name and case insensitive filesystem */
public class C49692gw {
    public File A00;
    public final AnonymousClass5ZR A01;
    public final C61072zf A02;
    public final File A03;

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0036 A[Catch:{ IOException -> 0x00ed }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x014f A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0150  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.io.File A00(java.lang.String r8) {
        /*
            r7 = this;
            r6 = r7
            monitor-enter(r6)
            r7.A01()     // Catch:{ all -> 0x0157 }
            java.io.File r0 = r7.A00     // Catch:{ all -> 0x0157 }
            if (r0 == 0) goto L_0x000f
            boolean r0 = r0.exists()     // Catch:{ all -> 0x0157 }
            if (r0 != 0) goto L_0x00fb
        L_0x000f:
            java.io.File r2 = r7.A03     // Catch:{ all -> 0x0157 }
            java.lang.String r0 = X.C18280x3.A0Y()     // Catch:{ all -> 0x0157 }
            java.io.File r4 = X.AnonymousClass002.A0A(r2, r0)     // Catch:{ all -> 0x0157 }
            r7.A00 = r4     // Catch:{ all -> 0x0157 }
            r0 = 0
        L_0x001c:
            int r3 = r0 + 1
            r1 = 10
            if (r0 >= r1) goto L_0x0034
            boolean r0 = r4.mkdir()     // Catch:{ all -> 0x0157 }
            if (r0 != 0) goto L_0x0034
            java.lang.String r0 = X.C18280x3.A0Y()     // Catch:{ all -> 0x0157 }
            java.io.File r4 = X.AnonymousClass002.A0A(r2, r0)     // Catch:{ all -> 0x0157 }
            r7.A00 = r4     // Catch:{ all -> 0x0157 }
            r0 = r3
            goto L_0x001c
        L_0x0034:
            if (r3 <= r1) goto L_0x00fb
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0157 }
            java.lang.String r0 = "trash/createtempdir/failed "
            r1.append(r0)     // Catch:{ all -> 0x0157 }
            java.io.File r0 = r7.A00     // Catch:{ all -> 0x0157 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0157 }
            X.C18260x0.A1M(r1, r0)     // Catch:{ all -> 0x0157 }
            java.lang.StringBuilder r4 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0157 }
            java.lang.String r0 = "trash/createtempdir/failed total-storage:"
            r4.append(r0)     // Catch:{ all -> 0x0157 }
            X.2zf r3 = r7.A02     // Catch:{ all -> 0x0157 }
            long r0 = r3.A04()     // Catch:{ all -> 0x0157 }
            r4.append(r0)     // Catch:{ all -> 0x0157 }
            java.lang.String r0 = " free-storage:"
            r4.append(r0)     // Catch:{ all -> 0x0157 }
            long r0 = r3.A02()     // Catch:{ all -> 0x0157 }
            r4.append(r0)     // Catch:{ all -> 0x0157 }
            X.AnonymousClass0x2.A19(r4)     // Catch:{ all -> 0x0157 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0157 }
            java.lang.String r0 = "trash/createtempdir/failed external-storage-state:"
            r1.append(r0)     // Catch:{ all -> 0x0157 }
            java.lang.String r0 = android.os.Environment.getExternalStorageState()     // Catch:{ all -> 0x0157 }
            X.C18260x0.A1M(r1, r0)     // Catch:{ all -> 0x0157 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0157 }
            java.lang.String r0 = "trash/createtempdir/failed base-dir:"
            r1.append(r0)     // Catch:{ all -> 0x0157 }
            r1.append(r2)     // Catch:{ all -> 0x0157 }
            java.lang.String r4 = " exists:"
            r1.append(r4)     // Catch:{ all -> 0x0157 }
            boolean r0 = r2.exists()     // Catch:{ all -> 0x0157 }
            r1.append(r0)     // Catch:{ all -> 0x0157 }
            java.lang.String r3 = " writable:"
            r1.append(r3)     // Catch:{ all -> 0x0157 }
            boolean r0 = r2.canWrite()     // Catch:{ all -> 0x0157 }
            r1.append(r0)     // Catch:{ all -> 0x0157 }
            java.lang.String r0 = " directory:"
            r1.append(r0)     // Catch:{ all -> 0x0157 }
            boolean r0 = r2.isDirectory()     // Catch:{ all -> 0x0157 }
            r1.append(r0)     // Catch:{ all -> 0x0157 }
            X.AnonymousClass0x2.A19(r1)     // Catch:{ all -> 0x0157 }
            java.io.File r2 = r2.getCanonicalFile()     // Catch:{ IOException -> 0x00ed }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ IOException -> 0x00ed }
            java.lang.String r0 = "trash/createtempdir/failed canonical-base-dir:"
            X.AnonymousClass000.A17(r2, r0, r4, r1)     // Catch:{ IOException -> 0x00ed }
            boolean r0 = r2.exists()     // Catch:{ IOException -> 0x00ed }
            r1.append(r0)     // Catch:{ IOException -> 0x00ed }
            r1.append(r3)     // Catch:{ IOException -> 0x00ed }
            boolean r0 = r2.canWrite()     // Catch:{ IOException -> 0x00ed }
            r1.append(r0)     // Catch:{ IOException -> 0x00ed }
            X.AnonymousClass0x2.A19(r1)     // Catch:{ IOException -> 0x00ed }
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()     // Catch:{ IOException -> 0x00ed }
            java.lang.String r0 = "trash/createtempdir/failed StoragePermission?:"
            r2.append(r0)     // Catch:{ IOException -> 0x00ed }
            X.5ZR r1 = r7.A01     // Catch:{ IOException -> 0x00ed }
            java.lang.String r0 = android.os.Environment.getExternalStorageState()     // Catch:{ IOException -> 0x00ed }
            boolean r0 = r1.A0I(r0)     // Catch:{ IOException -> 0x00ed }
            r2.append(r0)     // Catch:{ IOException -> 0x00ed }
            X.AnonymousClass0x2.A19(r2)     // Catch:{ IOException -> 0x00ed }
            goto L_0x00f4
        L_0x00ed:
            r1 = move-exception
            java.lang.String r0 = "trash/createtempdir/failed unable to resolve trashDir"
            com.whatsapp.util.Log.w(r0, r1)     // Catch:{ all -> 0x0157 }
        L_0x00f4:
            java.lang.String r0 = "max retries reached while creating temp dir"
            java.io.IOException r0 = X.AnonymousClass002.A0C(r0)     // Catch:{ all -> 0x0157 }
            throw r0     // Catch:{ all -> 0x0157 }
        L_0x00fb:
            monitor-exit(r6)
            monitor-enter(r6)
            java.io.File r2 = r7.A00     // Catch:{ all -> 0x0157 }
            monitor-exit(r6)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.util.UUID r0 = java.util.UUID.randomUUID()
            X.AnonymousClass000.A1B(r0, r1)
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            java.lang.String r5 = ""
            java.lang.String r4 = "."
            if (r0 == 0) goto L_0x0148
            r0 = r5
        L_0x0116:
            java.io.File r2 = X.C18270x1.A0A(r2, r0, r1)
            r0 = 0
        L_0x011b:
            int r3 = r0 + 1
            r1 = 10
            if (r0 >= r1) goto L_0x014d
            boolean r0 = r2.createNewFile()
            if (r0 != 0) goto L_0x014d
            monitor-enter(r6)
            java.io.File r2 = r7.A00     // Catch:{ all -> 0x0157 }
            monitor-exit(r6)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.util.UUID r0 = java.util.UUID.randomUUID()
            X.AnonymousClass000.A1B(r0, r1)
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 == 0) goto L_0x0143
            r0 = r5
        L_0x013d:
            java.io.File r2 = X.C18270x1.A0A(r2, r0, r1)
            r0 = r3
            goto L_0x011b
        L_0x0143:
            java.lang.String r0 = X.AnonymousClass000.A0T(r4, r8)
            goto L_0x013d
        L_0x0148:
            java.lang.String r0 = X.AnonymousClass000.A0T(r4, r8)
            goto L_0x0116
        L_0x014d:
            if (r3 > r1) goto L_0x0150
            return r2
        L_0x0150:
            java.lang.String r0 = "max retries reached while creating temp file"
            java.io.IOException r0 = X.AnonymousClass002.A0C(r0)
            throw r0
        L_0x0157:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49692gw.A00(java.lang.String):java.io.File");
    }

    public final void A01() {
        File file = this.A03;
        if (file.exists() && !file.isDirectory()) {
            C18260x0.A1S(AnonymousClass001.A0o(), "trash/create-trash-dir/removing ", file);
            if (!file.delete() && file.exists()) {
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("trash/create-trash-dir/failed ");
                A0o.append(file);
                C18260x0.A1K(A0o, " is not a directory");
            }
        }
        if (!file.exists()) {
            file.mkdirs();
            if (!file.exists() && !file.mkdir()) {
                Log.w("trash/create-trash-dir/failed");
            }
        }
    }

    public C49692gw(AnonymousClass5ZR r1, C61072zf r2, File file) {
        this.A03 = file;
        this.A02 = r2;
        this.A01 = r1;
    }
}
