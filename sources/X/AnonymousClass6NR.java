package X;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.6NR  reason: invalid class name */
public class AnonymousClass6NR extends AnonymousClass7Uk {
    public final int A00;
    public final File A01;
    public final List A02;

    /* JADX WARNING: Removed duplicated region for block: B:39:0x00df A[SYNTHETIC, Splitter:B:39:0x00df] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00e9 A[Catch:{ UnsatisfiedLinkError -> 0x00fd, all -> 0x00f8, all -> 0x0117 }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00f4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A04(android.os.StrictMode.ThreadPolicy r14, java.io.File r15, java.lang.String r16, int r17) {
        /*
            r13 = this;
            X.8qe r0 = com.facebook.soloader.SoLoader.A04
            if (r0 == 0) goto L_0x012b
            java.util.List r0 = r13.A02
            r7 = r16
            boolean r0 = r0.contains(r7)
            r8 = 0
            java.lang.String r4 = "SoLoader"
            if (r0 == 0) goto L_0x0026
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r7)
            java.lang.String r0 = " is on the denyList, skip loading from "
            r1.append(r0)
            java.lang.String r0 = r15.getCanonicalPath()
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)
            android.util.Log.d(r4, r0)
            return r8
        L_0x0026:
            java.io.File r0 = r13.A01
            java.io.File r6 = X.AnonymousClass002.A0A(r0, r7)
            boolean r0 = r6.exists()
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r7)
            if (r0 == 0) goto L_0x011e
            java.lang.String r0 = " found on "
            r1.append(r0)
            java.lang.String r0 = r15.getCanonicalPath()
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)
            android.util.Log.d(r4, r0)
            r5 = r17
            r0 = r17 & 1
            if (r0 == 0) goto L_0x0061
            int r0 = r13.A00
            r12 = 2
            r0 = r0 & 2
            if (r0 == 0) goto L_0x0061
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r7)
            java.lang.String r0 = " loaded implicitly"
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)
            android.util.Log.d(r4, r0)
        L_0x0060:
            return r12
        L_0x0061:
            int r0 = r13.A00
            r12 = 1
            r0 = r0 & 1
            if (r0 == 0) goto L_0x0069
            r8 = 1
        L_0x0069:
            java.lang.String r0 = r6.getName()
            boolean r11 = r0.equals(r7)
            r3 = 0
            if (r8 != 0) goto L_0x0076
            if (r11 != 0) goto L_0x00d4
        L_0x0076:
            X.84s r2 = new X.84s     // Catch:{ all -> 0x0117 }
            r2.<init>(r6)     // Catch:{ all -> 0x0117 }
            r3 = r2
            if (r8 == 0) goto L_0x00d4
            java.lang.String r1 = "SoLoader.getElfDependencies["
            java.lang.String r0 = "]"
            com.facebook.soloader.Api18TraceUtils.A01(r1, r7, r0)     // Catch:{ all -> 0x0117 }
            java.lang.String[] r10 = X.C160877oY.A03(r2)     // Catch:{ all -> 0x00f8 }
            com.facebook.soloader.Api18TraceUtils.A00()     // Catch:{ all -> 0x0117 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0117 }
            java.lang.String r0 = "Loading "
            r1.append(r0)     // Catch:{ all -> 0x0117 }
            r1.append(r7)     // Catch:{ all -> 0x0117 }
            java.lang.String r0 = "'s dependencies: "
            r1.append(r0)     // Catch:{ all -> 0x0117 }
            X.C18320x8.A1P(r1, r10)     // Catch:{ all -> 0x0117 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0117 }
            android.util.Log.d(r4, r0)     // Catch:{ all -> 0x0117 }
            int r9 = r10.length     // Catch:{ all -> 0x0117 }
            r8 = 0
        L_0x00a9:
            if (r8 >= r9) goto L_0x00dd
            r7 = r10[r8]     // Catch:{ all -> 0x0117 }
            java.lang.String r0 = "/"
            boolean r0 = r7.startsWith(r0)     // Catch:{ all -> 0x0117 }
            if (r0 != 0) goto L_0x00d1
            r0 = 46
            int r1 = r7.indexOf(r0)     // Catch:{ all -> 0x0117 }
            r0 = 3
            java.lang.String r2 = r7.substring(r0, r1)     // Catch:{ all -> 0x0117 }
            java.lang.String r1 = X.C1443571f.A00(r2)     // Catch:{ all -> 0x0117 }
            if (r1 != 0) goto L_0x00c8
            r2 = 0
            goto L_0x00cc
        L_0x00c8:
            java.lang.String r7 = java.lang.System.mapLibraryName(r1)     // Catch:{ all -> 0x0117 }
        L_0x00cc:
            r0 = r17 | 1
            com.facebook.soloader.SoLoader.A04(r14, r7, r2, r1, r0)     // Catch:{ all -> 0x0117 }
        L_0x00d1:
            int r8 = r8 + 1
            goto L_0x00a9
        L_0x00d4:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0117 }
            java.lang.String r0 = "Not resolving dependencies for "
            X.AnonymousClass6C7.A1G(r0, r7, r4, r1)     // Catch:{ all -> 0x0117 }
        L_0x00dd:
            if (r11 == 0) goto L_0x00e9
            X.8qe r1 = com.facebook.soloader.SoLoader.A04     // Catch:{ UnsatisfiedLinkError -> 0x00fd }
            java.lang.String r0 = r6.getAbsolutePath()     // Catch:{ UnsatisfiedLinkError -> 0x00fd }
            r1.BJm(r0, r5)     // Catch:{ UnsatisfiedLinkError -> 0x00fd }
            goto L_0x00f2
        L_0x00e9:
            X.8qe r1 = com.facebook.soloader.SoLoader.A04     // Catch:{ UnsatisfiedLinkError -> 0x00fd }
            java.lang.String r0 = r6.getAbsolutePath()     // Catch:{ UnsatisfiedLinkError -> 0x00fd }
            r1.BJo(r3, r0, r5)     // Catch:{ UnsatisfiedLinkError -> 0x00fd }
        L_0x00f2:
            if (r3 == 0) goto L_0x0060
            r3.close()
            return r12
        L_0x00f8:
            r0 = move-exception
            com.facebook.soloader.Api18TraceUtils.A00()     // Catch:{ all -> 0x0117 }
            throw r0     // Catch:{ all -> 0x0117 }
        L_0x00fd:
            r2 = move-exception
            java.lang.String r1 = r2.getMessage()     // Catch:{ all -> 0x0117 }
            java.lang.String r0 = "bad ELF magic"
            boolean r0 = r1.contains(r0)     // Catch:{ all -> 0x0117 }
            if (r0 == 0) goto L_0x0116
            java.lang.String r0 = "Corrupted lib file detected"
            android.util.Log.d(r4, r0)     // Catch:{ all -> 0x0117 }
            if (r3 == 0) goto L_0x0114
            r3.close()
        L_0x0114:
            r0 = 3
            return r0
        L_0x0116:
            throw r2     // Catch:{ all -> 0x0117 }
        L_0x0117:
            r0 = move-exception
            if (r3 == 0) goto L_0x0131
            r3.close()
            throw r0
        L_0x011e:
            java.lang.String r0 = " not found on "
            r1.append(r0)
            java.lang.String r0 = r15.getCanonicalPath()
            X.AnonymousClass000.A1E(r0, r4, r1)
            return r8
        L_0x012b:
            java.lang.String r0 = "SoLoader.init() not yet called"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r0)
        L_0x0131:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6NR.A04(android.os.StrictMode$ThreadPolicy, java.io.File, java.lang.String, int):int");
    }

    public String toString() {
        String str;
        try {
            str = String.valueOf(this.A01.getCanonicalPath());
        } catch (IOException unused) {
            str = this.A01.getName();
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append(AnonymousClass000.A0O(this));
        A0o.append("[root = ");
        A0o.append(str);
        A0o.append(" flags = ");
        A0o.append(this.A00);
        return AnonymousClass0x2.A0f(A0o);
    }

    public AnonymousClass6NR(File file, String[] strArr, int i) {
        this.A01 = file;
        this.A00 = i;
        this.A02 = Arrays.asList(strArr);
    }
}
