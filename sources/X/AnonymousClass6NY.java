package X;

import java.io.File;
import java.util.zip.ZipFile;

/* renamed from: X.6NY  reason: invalid class name */
public class AnonymousClass6NY extends AnonymousClass8KW {
    public AnonymousClass6NU[] A00;
    public final AnonymousClass6NP A01;
    public final File A02;
    public final ZipFile A03;
    public final /* synthetic */ C126226Na A04;
    public final /* synthetic */ C126226Na A05;

    public AnonymousClass6NY(C126226Na r3, C126226Na r4) {
        this.A04 = r3;
        this.A05 = r3;
        this.A03 = new ZipFile(r3.A00);
        this.A01 = r4;
        this.A02 = AnonymousClass002.A0B(r3.A03.getApplicationInfo().nativeLibraryDir);
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00c4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass6NU[] A00() {
        /*
            r15 = this;
            X.6NU[] r6 = r15.A00
            if (r6 != 0) goto L_0x0144
            java.util.LinkedHashSet r5 = X.AnonymousClass0x9.A17()
            java.util.HashMap r3 = X.AnonymousClass001.A0t()
            java.lang.String r0 = "^lib/([^/]+)/([^/]+\\.so)$"
            java.util.regex.Pattern r8 = java.util.regex.Pattern.compile(r0)
            java.lang.String[] r7 = X.C159237lU.A02()
            java.util.zip.ZipFile r0 = r15.A03
            java.util.Enumeration r9 = r0.entries()
        L_0x001c:
            boolean r0 = r9.hasMoreElements()
            if (r0 == 0) goto L_0x006b
            java.lang.Object r6 = r9.nextElement()
            java.util.zip.ZipEntry r6 = (java.util.zip.ZipEntry) r6
            java.lang.String r0 = r6.getName()
            java.util.regex.Matcher r1 = r8.matcher(r0)
            boolean r0 = r1.matches()
            if (r0 == 0) goto L_0x001c
            r0 = 1
            java.lang.String r4 = r1.group(r0)
            r0 = 2
            java.lang.String r2 = r1.group(r0)
            r1 = 0
        L_0x0041:
            int r0 = r7.length
            if (r1 >= r0) goto L_0x001c
            r0 = r7[r1]
            if (r0 == 0) goto L_0x0068
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0068
            if (r1 < 0) goto L_0x001c
            r5.add(r4)
            java.lang.Object r0 = r3.get(r2)
            X.6NU r0 = (X.AnonymousClass6NU) r0
            if (r0 == 0) goto L_0x005f
            int r0 = r0.A00
            if (r1 >= r0) goto L_0x001c
        L_0x005f:
            X.6NU r0 = new X.6NU
            r0.<init>(r2, r6, r1)
            r3.put(r2, r0)
            goto L_0x001c
        L_0x0068:
            int r1 = r1 + 1
            goto L_0x0041
        L_0x006b:
            X.6NP r1 = r15.A01
            int r0 = r5.size()
            java.lang.String[] r0 = new java.lang.String[r0]
            java.lang.Object[] r0 = r5.toArray(r0)
            java.lang.String[] r0 = (java.lang.String[]) r0
            r1.A02 = r0
            java.util.Collection r1 = r3.values()
            int r0 = r3.size()
            X.6NU[] r0 = new X.AnonymousClass6NU[r0]
            java.lang.Object[] r5 = r1.toArray(r0)
            X.6NU[] r5 = (X.AnonymousClass6NU[]) r5
            java.util.Arrays.sort(r5)
            r4 = 0
            r8 = 0
            r7 = 0
        L_0x0091:
            int r3 = r5.length
            if (r8 >= r3) goto L_0x0131
            r0 = r5[r8]
            java.util.zip.ZipEntry r1 = r0.A01
            java.lang.String r2 = r0.A01
            java.lang.String r9 = r1.getName()
            X.6Na r3 = r15.A04
            java.lang.String r0 = r3.A01
            boolean r0 = r2.equals(r0)
            r14 = 0
            r12 = 1
            if (r0 == 0) goto L_0x00c8
            r0 = 0
            r3.A01 = r0
            java.lang.Object[] r6 = new java.lang.Object[r12]
            r6[r4] = r2
            java.lang.String r0 = "allowing consideration of corrupted lib %s"
        L_0x00b3:
            java.lang.String r1 = java.lang.String.format(r0, r6)
            r14 = 1
        L_0x00b8:
            java.lang.String r0 = "ApkSoSource"
            android.util.Log.d(r0, r1)
            if (r14 == 0) goto L_0x00c4
            int r7 = r7 + 1
        L_0x00c1:
            int r8 = r8 + 1
            goto L_0x0091
        L_0x00c4:
            r0 = 0
            r5[r8] = r0
            goto L_0x00c1
        L_0x00c8:
            java.io.File r0 = r15.A02
            java.io.File r13 = X.AnonymousClass002.A0A(r0, r2)
            r11 = 3
            r10 = 2
            java.lang.String r3 = r13.getCanonicalPath()     // Catch:{ IOException -> 0x0122 }
            java.lang.String r0 = r0.getCanonicalPath()     // Catch:{ IOException -> 0x0122 }
            boolean r0 = r3.startsWith(r0)     // Catch:{ IOException -> 0x0122 }
            if (r0 != 0) goto L_0x00e9
            java.lang.String r1 = "not allowing consideration of %s: %s not in lib dir"
            java.lang.Object[] r0 = X.AnonymousClass4L0.A0V(r9, r2, r10)     // Catch:{ IOException -> 0x0122 }
            java.lang.String r1 = java.lang.String.format(r1, r0)     // Catch:{ IOException -> 0x0122 }
            goto L_0x00b8
        L_0x00e9:
            boolean r0 = r13.isFile()
            if (r0 != 0) goto L_0x00f6
            java.lang.Object[] r6 = X.AnonymousClass4L0.A0V(r9, r2, r10)
            java.lang.String r0 = "allowing consideration of %s: %s not in system lib dir"
            goto L_0x00b3
        L_0x00f6:
            long r2 = r13.length()
            long r0 = r1.getSize()
            int r6 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r6 == 0) goto L_0x010f
            java.lang.Object[] r6 = new java.lang.Object[r11]
            r6[r4] = r13
            X.AnonymousClass000.A1Q(r6, r12, r2)
            X.AnonymousClass000.A1Q(r6, r10, r0)
            java.lang.String r0 = "allowing consideration of %s: sysdir file length is %s, but the file is %s bytes long in the APK"
            goto L_0x00b3
        L_0x010f:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "not allowing consideration of "
            r1.append(r0)
            r1.append(r9)
            java.lang.String r0 = ": deferring to libdir"
            java.lang.String r1 = X.AnonymousClass000.A0X(r0, r1)
            goto L_0x00b8
        L_0x0122:
            r0 = move-exception
            java.lang.Object[] r1 = X.AnonymousClass4L0.A0V(r9, r2, r11)
            X.AnonymousClass0x7.A1E(r0, r1, r10)
            java.lang.String r0 = "not allowing consideration of %s: %s, IOException when constructing path: %s"
            java.lang.String r1 = java.lang.String.format(r0, r1)
            goto L_0x00b8
        L_0x0131:
            X.6NU[] r6 = new X.AnonymousClass6NU[r7]
            r2 = 0
        L_0x0134:
            if (r4 >= r3) goto L_0x0142
            r1 = r5[r4]
            if (r1 == 0) goto L_0x013f
            int r0 = r2 + 1
            r6[r2] = r1
            r2 = r0
        L_0x013f:
            int r4 = r4 + 1
            goto L_0x0134
        L_0x0142:
            r15.A00 = r6
        L_0x0144:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6NY.A00():X.6NU[]");
    }
}
