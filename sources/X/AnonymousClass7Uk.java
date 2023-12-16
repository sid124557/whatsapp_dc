package X;

import android.text.TextUtils;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* renamed from: X.7Uk  reason: invalid class name */
public abstract class AnonymousClass7Uk {
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0098, code lost:
        r13 = new X.C1682684t(r2, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:?, code lost:
        com.facebook.soloader.Api18TraceUtils.A01("SoLoader.getElfDependencies[", r6, "]");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:?, code lost:
        r14 = X.C160877oY.A03(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:?, code lost:
        com.facebook.soloader.Api18TraceUtils.A00();
        r12 = r14.length;
        r10 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00ad, code lost:
        if (r10 >= r12) goto L_0x00c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00af, code lost:
        r2 = r14[r10];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00b5, code lost:
        if (r2.startsWith("/") != false) goto L_0x00bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00b7, code lost:
        com.facebook.soloader.SoLoader.A05(r7, r2, (java.lang.String) null, (java.lang.String) null, r5 | 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00bd, code lost:
        r10 = r10 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:?, code lost:
        r13.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x00f4, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:?, code lost:
        com.facebook.soloader.Api18TraceUtils.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x00f8, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x00f9, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:?, code lost:
        r13.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0102, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A02(android.os.StrictMode.ThreadPolicy r18, java.lang.String r19, int r20) {
        /*
            r17 = this;
            r5 = r20
            r8 = r17
            boolean r0 = r8 instanceof X.AnonymousClass6NR
            r6 = r19
            r7 = r18
            if (r0 == 0) goto L_0x003b
            X.6NR r8 = (X.AnonymousClass6NR) r8
            boolean r0 = r8 instanceof X.AnonymousClass6NP
            if (r0 == 0) goto L_0x0034
            X.6NP r8 = (X.AnonymousClass6NP) r8
            java.util.Map r2 = r8.A04
            monitor-enter(r2)
            java.lang.Object r1 = r2.get(r6)     // Catch:{ all -> 0x0031 }
            if (r1 != 0) goto L_0x0024
            java.lang.Object r1 = X.AnonymousClass002.A0D()     // Catch:{ all -> 0x0031 }
            r2.put(r6, r1)     // Catch:{ all -> 0x0031 }
        L_0x0024:
            monitor-exit(r2)     // Catch:{ all -> 0x0031 }
            monitor-enter(r1)
            java.io.File r0 = r8.A01     // Catch:{ all -> 0x002e }
            int r0 = r8.A04(r7, r0, r6, r5)     // Catch:{ all -> 0x002e }
            monitor-exit(r1)     // Catch:{ all -> 0x002e }
            return r0
        L_0x002e:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x002e }
            throw r0
        L_0x0031:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0031 }
            throw r0
        L_0x0034:
            java.io.File r0 = r8.A01
            int r0 = r8.A04(r7, r0, r6, r5)
            return r0
        L_0x003b:
            boolean r0 = r8 instanceof X.AnonymousClass6NS
            if (r0 == 0) goto L_0x0121
            X.6NS r8 = (X.AnonymousClass6NS) r8
            X.8qe r0 = com.facebook.soloader.SoLoader.A04
            if (r0 == 0) goto L_0x011a
            java.util.Set r0 = r8.A02
            java.util.Iterator r16 = r0.iterator()
        L_0x004b:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x0118
            java.lang.String r4 = X.AnonymousClass001.A0m(r16)
            java.util.Map r0 = r8.A01
            java.lang.Object r1 = r0.get(r4)
            java.util.Set r1 = (java.util.Set) r1
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            java.lang.String r9 = " not found on "
            java.lang.String r3 = "SoLoader"
            if (r0 != 0) goto L_0x00eb
            if (r1 == 0) goto L_0x00eb
            boolean r0 = r1.contains(r6)
            if (r0 == 0) goto L_0x00eb
            java.lang.String r15 = "/"
            java.io.File r0 = r8.A00
            java.util.zip.ZipFile r11 = new java.util.zip.ZipFile
            r11.<init>(r0)
            java.util.Enumeration r10 = r11.entries()     // Catch:{ all -> 0x010e }
        L_0x007c:
            boolean r0 = r10.hasMoreElements()     // Catch:{ all -> 0x010e }
            if (r0 == 0) goto L_0x00c3
            java.lang.Object r2 = r10.nextElement()     // Catch:{ all -> 0x010e }
            java.util.zip.ZipEntry r2 = (java.util.zip.ZipEntry) r2     // Catch:{ all -> 0x010e }
            if (r2 == 0) goto L_0x007c
            java.lang.String r1 = r2.getName()     // Catch:{ all -> 0x010e }
            java.lang.String r0 = X.AnonymousClass000.A0T(r15, r6)     // Catch:{ all -> 0x010e }
            boolean r0 = r1.endsWith(r0)     // Catch:{ all -> 0x010e }
            if (r0 == 0) goto L_0x007c
            X.84t r13 = new X.84t     // Catch:{ all -> 0x010e }
            r13.<init>(r2, r11)     // Catch:{ all -> 0x010e }
            java.lang.String r1 = "SoLoader.getElfDependencies["
            java.lang.String r0 = "]"
            com.facebook.soloader.Api18TraceUtils.A01(r1, r6, r0)     // Catch:{ all -> 0x00f9 }
            java.lang.String[] r14 = X.C160877oY.A03(r13)     // Catch:{ all -> 0x00f4 }
            com.facebook.soloader.Api18TraceUtils.A00()     // Catch:{ all -> 0x00f9 }
            int r12 = r14.length     // Catch:{ all -> 0x00f9 }
            r10 = 0
        L_0x00ad:
            if (r10 >= r12) goto L_0x00c0
            r2 = r14[r10]     // Catch:{ all -> 0x00f9 }
            boolean r0 = r2.startsWith(r15)     // Catch:{ all -> 0x00f9 }
            if (r0 != 0) goto L_0x00bd
            r1 = r5 | 1
            r0 = 0
            com.facebook.soloader.SoLoader.A05(r7, r2, r0, r0, r1)     // Catch:{ all -> 0x00f9 }
        L_0x00bd:
            int r10 = r10 + 1
            goto L_0x00ad
        L_0x00c0:
            r13.close()     // Catch:{ all -> 0x010e }
        L_0x00c3:
            r11.close()
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r4)     // Catch:{ UnsatisfiedLinkError -> 0x00d8 }
            java.lang.String r0 = java.io.File.separator     // Catch:{ UnsatisfiedLinkError -> 0x00d8 }
            java.lang.String r1 = X.AnonymousClass000.A0V(r0, r6, r1)     // Catch:{ UnsatisfiedLinkError -> 0x00d8 }
            r5 = r5 | 4
            X.8qe r0 = com.facebook.soloader.SoLoader.A04     // Catch:{ UnsatisfiedLinkError -> 0x00d8 }
            r0.BJm(r1, r5)     // Catch:{ UnsatisfiedLinkError -> 0x00d8 }
            goto L_0x0103
        L_0x00d8:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            X.AnonymousClass001.A1K(r6, r9, r4, r1)
            java.lang.String r0 = " flag: "
            java.lang.String r0 = X.AnonymousClass000.A0Y(r0, r1, r5)
            android.util.Log.w(r3, r0, r2)
            goto L_0x004b
        L_0x00eb:
            java.lang.String r0 = X.C18260x0.A06(r6, r9, r4)
            android.util.Log.v(r3, r0)
            goto L_0x004b
        L_0x00f4:
            r0 = move-exception
            com.facebook.soloader.Api18TraceUtils.A00()     // Catch:{ all -> 0x00f9 }
            throw r0     // Catch:{ all -> 0x00f9 }
        L_0x00f9:
            r1 = move-exception
            r13.close()     // Catch:{ all -> 0x00fe }
            goto L_0x0102
        L_0x00fe:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x010e }
        L_0x0102:
            throw r1     // Catch:{ all -> 0x010e }
        L_0x0103:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r6)
            java.lang.String r0 = " found on "
            X.AnonymousClass6C7.A1G(r0, r4, r3, r1)
            r0 = 1
            return r0
        L_0x010e:
            r1 = move-exception
            r11.close()     // Catch:{ all -> 0x0113 }
            throw r1
        L_0x0113:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        L_0x0118:
            r0 = 0
            return r0
        L_0x011a:
            java.lang.String r0 = "SoLoader.init() not yet called"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r0)
            throw r0
        L_0x0121:
            X.6NQ r8 = (X.AnonymousClass6NQ) r8
            X.6NR r0 = r8.A02
            int r0 = r0.A02(r7, r6, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7Uk.A02(android.os.StrictMode$ThreadPolicy, java.lang.String, int):int");
    }

    public void A03(int i) {
        int indexOf;
        int i2;
        if (this instanceof AnonymousClass6NS) {
            AnonymousClass6NS r5 = (AnonymousClass6NS) this;
            Iterator it = r5.A02.iterator();
            String str = null;
            while (it.hasNext()) {
                String A0m = AnonymousClass001.A0m(it);
                if (!TextUtils.isEmpty(A0m) && (indexOf = A0m.indexOf(33)) >= 0 && (i2 = indexOf + 2) < A0m.length()) {
                    str = A0m.substring(i2);
                }
                if (!TextUtils.isEmpty(str)) {
                    ZipFile zipFile = new ZipFile(r5.A00);
                    try {
                        Enumeration<? extends ZipEntry> entries = zipFile.entries();
                        while (entries.hasMoreElements()) {
                            ZipEntry zipEntry = (ZipEntry) entries.nextElement();
                            if (zipEntry != null && zipEntry.getName().startsWith(str) && zipEntry.getName().endsWith(".so") && zipEntry.getMethod() == 0) {
                                String A0c = AnonymousClass6C9.A0c(str.length(), zipEntry.getName());
                                synchronized (r5) {
                                    Map map = r5.A01;
                                    if (!map.containsKey(A0m)) {
                                        map.put(A0m, AnonymousClass002.A0K());
                                    }
                                    ((Set) map.get(A0m)).add(A0c);
                                }
                            }
                        }
                        zipFile.close();
                    } catch (Throwable th) {
                        try {
                            zipFile.close();
                            throw th;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                            throw th;
                        }
                    }
                }
            }
        } else if (this instanceof AnonymousClass6NQ) {
            ((AnonymousClass6NQ) this).A02.A03(i);
        }
    }
}
