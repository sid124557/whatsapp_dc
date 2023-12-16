package X;

import java.io.File;
import java.io.IOException;

/* renamed from: X.7lV  reason: invalid class name and case insensitive filesystem */
public class C159247lV {
    public static long A00(File file) {
        int length;
        long j = 0;
        if (file.exists()) {
            if (file.isFile()) {
                return file.length();
            }
            if (file.isDirectory()) {
                try {
                    File[] listFiles = file.listFiles();
                    if (!(listFiles == null || (length = listFiles.length) == 0)) {
                        int i = 0;
                        do {
                            j += A00(listFiles[i]);
                            i++;
                        } while (i < length);
                    }
                } catch (Exception unused) {
                }
            }
        }
        return j;
    }

    public static AnonymousClass7JK A01(File file) {
        int length;
        if (file.exists()) {
            File file2 = file;
            try {
                if (file.getParent() != null) {
                    file2 = AnonymousClass002.A0A(file.getParentFile().getCanonicalFile(), file.getName());
                }
                if (!file2.getCanonicalFile().equals(file2.getAbsoluteFile())) {
                }
            } catch (IOException unused) {
            }
            if (!file.isDirectory()) {
                return A02(file, false);
            }
            AnonymousClass7JK A02 = A02(file, true);
            if (!file.isDirectory()) {
                return A02;
            }
            try {
                File[] listFiles = file.listFiles();
                if (listFiles == null || (length = listFiles.length) == 0) {
                    return A02;
                }
                long j = A02.A00;
                long j2 = A02.A02;
                long j3 = A02.A01;
                int i = 0;
                do {
                    AnonymousClass7JK A01 = A01(listFiles[i]);
                    j += A01.A00;
                    j2 += A01.A02;
                    j3 += A01.A01;
                    i++;
                } while (i < length);
                return new AnonymousClass7JK(j, j2, j3);
            } catch (Exception unused2) {
                return A02;
            }
        }
        return new AnonymousClass7JK(0, 0, 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0040, code lost:
        if (r4 == 0) goto L_0x0052;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002b */
    /* JADX WARNING: Removed duplicated region for block: B:19:? A[ExcHandler: ErrnoException | NoSuchMethodError (unused java.lang.Throwable), SYNTHETIC, Splitter:B:11:0x002b] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0054  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.AnonymousClass7JK A02(java.io.File r13, boolean r14) {
        /*
            long r9 = r13.length()
            r5 = 0
            int r4 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r4 >= 0) goto L_0x0013
            r9 = 1
            X.7JK r4 = new X.7JK
            r7 = r5
            r4.<init>(r5, r7, r9)
            return r4
        L_0x0013:
            r7 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r0 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r0 <= 0) goto L_0x0024
            r11 = 1
            X.7JK r4 = new X.7JK
            r6 = r4
            r9 = r7
            r6.<init>(r7, r9, r11)
            return r4
        L_0x0024:
            r2 = -1
            java.lang.String r0 = r13.getCanonicalPath()     // Catch:{ IOException -> 0x002b }
            goto L_0x002f
        L_0x002b:
            java.lang.String r0 = r13.getAbsolutePath()     // Catch:{ ErrnoException | NoSuchMethodError -> 0x0042, ErrnoException | NoSuchMethodError -> 0x0042 }
        L_0x002f:
            android.system.StructStat r0 = android.system.Os.lstat(r0)     // Catch:{ ErrnoException | NoSuchMethodError -> 0x0042, ErrnoException | NoSuchMethodError -> 0x0042 }
            long r11 = r0.st_blocks     // Catch:{ ErrnoException | NoSuchMethodError -> 0x0042, ErrnoException | NoSuchMethodError -> 0x0042 }
            r0 = 512(0x200, double:2.53E-321)
            long r11 = r11 * r0
            int r0 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x0042
            int r0 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r0 != 0) goto L_0x0052
            if (r4 == 0) goto L_0x0052
        L_0x0042:
            r0 = 1065353216(0x3f800000, float:1.0)
            float r1 = (float) r9
            float r1 = r1 * r0
            r0 = 1166016512(0x45800000, float:4096.0)
            float r1 = r1 / r0
            double r0 = (double) r1
            double r0 = java.lang.Math.ceil(r0)
            long r11 = (long) r0
            r0 = 4096(0x1000, double:2.0237E-320)
            long r11 = r11 * r0
        L_0x0052:
            if (r14 == 0) goto L_0x0056
            r9 = 0
        L_0x0056:
            r13 = 1
            X.7JK r4 = new X.7JK
            r8 = r4
            r8.<init>(r9, r11, r13)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C159247lV.A02(java.io.File, boolean):X.7JK");
    }
}
