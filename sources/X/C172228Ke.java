package X;

import com.facebook.msys.mci.DefaultCrypto;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.Writer;
import java.nio.charset.Charset;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: X.8Ke  reason: invalid class name and case insensitive filesystem */
public final class C172228Ke implements Closeable {
    public static final Charset A0E = C58152un.A0D;
    public int A00;
    public long A01 = 0;
    public long A02 = 0;
    public Writer A03;
    public final int A04;
    public final int A05;
    public final long A06;
    public final AnonymousClass7EN A07;
    public final File A08;
    public final File A09;
    public final File A0A;
    public final LinkedHashMap A0B = new LinkedHashMap(0, 0.75f, true);
    public final Callable A0C = new AnonymousClass91H(this, 3);
    public final ExecutorService A0D = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue());

    public C172228Ke(AnonymousClass7EN r11, File file, long j) {
        this.A08 = file;
        this.A04 = 1;
        this.A09 = AnonymousClass002.A0A(file, "journal");
        this.A0A = AnonymousClass002.A0A(file, "journal.tmp");
        this.A05 = 1;
        this.A06 = j;
        this.A07 = r11;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:53|54|(4:57|(2:59|87)(2:60|88)|85|55)|86|61|62) */
    /* JADX WARNING: Code restructure failed: missing block: B:54:?, code lost:
        A03(r4);
        A05(r5.A0A);
        r10 = X.C18290x4.A10(r5.A0B);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x013b, code lost:
        if (r10.hasNext() != false) goto L_0x013d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x013d, code lost:
        r4 = (X.C151967Wz) r10.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0146, code lost:
        if (r4.A01 == null) goto L_0x0148;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0148, code lost:
        r5.A02 += r4.A04[0];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0152, code lost:
        r4.A01 = null;
        A05(r4.A00());
        A05(r4.A01());
        r10.remove();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0167, code lost:
        r5.A03 = new java.io.BufferedWriter(new java.io.FileWriter(r9, true), com.facebook.msys.mci.DefaultCrypto.BUFFER_SIZE);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0175, code lost:
        return r5;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:53:0x0129 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C172228Ke A00(X.AnonymousClass7EN r14, java.io.File r15, long r16) {
        /*
            r8 = 1
            r4 = 0
            r2 = r16
            int r0 = (r16 > r4 ? 1 : (r16 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x01ae
            X.8Ke r5 = new X.8Ke
            r17 = r14
            r16 = r15
            r5.<init>(r14, r15, r2)
            java.io.File r9 = r5.A09
            boolean r0 = r9.exists()
            if (r0 == 0) goto L_0x019e
            java.lang.String r12 = ", "
            java.io.FileInputStream r1 = X.AnonymousClass0x9.A0g(r9)     // Catch:{ IOException -> 0x0196 }
            r0 = 8192(0x2000, float:1.14794E-41)
            java.io.BufferedInputStream r4 = new java.io.BufferedInputStream     // Catch:{ IOException -> 0x0196 }
            r4.<init>(r1, r0)     // Catch:{ IOException -> 0x0196 }
            java.lang.String r11 = A01(r4)     // Catch:{ all -> 0x0191 }
            java.lang.String r10 = A01(r4)     // Catch:{ all -> 0x0191 }
            java.lang.String r13 = A01(r4)     // Catch:{ all -> 0x0191 }
            java.lang.String r7 = A01(r4)     // Catch:{ all -> 0x0191 }
            java.lang.String r6 = A01(r4)     // Catch:{ all -> 0x0191 }
            java.lang.String r0 = "libcore.io.DiskLruCache"
            boolean r0 = r0.equals(r11)     // Catch:{ all -> 0x0191 }
            if (r0 == 0) goto L_0x0176
            java.lang.String r0 = "1"
            boolean r0 = r0.equals(r10)     // Catch:{ all -> 0x0191 }
            if (r0 == 0) goto L_0x0176
            java.lang.String r1 = java.lang.Integer.toString(r8)     // Catch:{ all -> 0x0191 }
            boolean r0 = r1.equals(r13)     // Catch:{ all -> 0x0191 }
            if (r0 == 0) goto L_0x0176
            boolean r0 = r1.equals(r7)     // Catch:{ all -> 0x0191 }
            if (r0 == 0) goto L_0x0176
            java.lang.String r0 = ""
            boolean r0 = r0.equals(r6)     // Catch:{ all -> 0x0191 }
            if (r0 == 0) goto L_0x0176
        L_0x0063:
            java.lang.String r11 = A01(r4)     // Catch:{ EOFException -> 0x0129 }
            java.lang.String r0 = " "
            java.lang.String[] r14 = r11.split(r0)     // Catch:{ EOFException -> 0x0129 }
            int r6 = r14.length     // Catch:{ EOFException -> 0x0129 }
            java.lang.String r7 = "unexpected journal line: "
            r1 = 2
            if (r6 < r1) goto L_0x0117
            r12 = r14[r8]     // Catch:{ EOFException -> 0x0129 }
            r13 = 0
            r10 = r14[r13]     // Catch:{ EOFException -> 0x0129 }
            java.lang.String r0 = "REMOVE"
            boolean r0 = r10.equals(r0)     // Catch:{ EOFException -> 0x0129 }
            if (r0 == 0) goto L_0x0088
            if (r6 != r1) goto L_0x0088
            java.util.LinkedHashMap r0 = r5.A0B     // Catch:{ EOFException -> 0x0129 }
            r0.remove(r12)     // Catch:{ EOFException -> 0x0129 }
            goto L_0x0063
        L_0x0088:
            java.util.LinkedHashMap r0 = r5.A0B     // Catch:{ EOFException -> 0x0129 }
            java.lang.Object r10 = r0.get(r12)     // Catch:{ EOFException -> 0x0129 }
            X.7Wz r10 = (X.C151967Wz) r10     // Catch:{ EOFException -> 0x0129 }
            r15 = 0
            if (r10 != 0) goto L_0x009b
            X.7Wz r10 = new X.7Wz     // Catch:{ EOFException -> 0x0129 }
            r10.<init>(r5, r12)     // Catch:{ EOFException -> 0x0129 }
            r0.put(r12, r10)     // Catch:{ EOFException -> 0x0129 }
        L_0x009b:
            r12 = r14[r13]     // Catch:{ EOFException -> 0x0129 }
            java.lang.String r0 = "CLEAN"
            boolean r0 = r12.equals(r0)     // Catch:{ EOFException -> 0x0129 }
            if (r0 == 0) goto L_0x00e8
            r0 = 3
            if (r6 != r0) goto L_0x00e8
            r10.A02 = r8     // Catch:{ EOFException -> 0x0129 }
            r10.A01 = r15     // Catch:{ EOFException -> 0x0129 }
            int r6 = java.lang.Math.min(r8, r8)     // Catch:{ EOFException -> 0x0129 }
            java.lang.Class r0 = r14.getClass()     // Catch:{ EOFException -> 0x0129 }
            java.lang.Class r0 = r0.getComponentType()     // Catch:{ EOFException -> 0x0129 }
            java.lang.Object r11 = java.lang.reflect.Array.newInstance(r0, r8)     // Catch:{ EOFException -> 0x0129 }
            java.lang.Object[] r11 = (java.lang.Object[]) r11     // Catch:{ EOFException -> 0x0129 }
            java.lang.System.arraycopy(r14, r1, r11, r13, r6)     // Catch:{ EOFException -> 0x0129 }
            java.lang.String[] r11 = (java.lang.String[]) r11     // Catch:{ EOFException -> 0x0129 }
            int r12 = r11.length     // Catch:{ EOFException -> 0x0129 }
            X.8Ke r0 = r10.A05     // Catch:{ EOFException -> 0x0129 }
            int r0 = r0.A05     // Catch:{ EOFException -> 0x0129 }
            if (r12 == r0) goto L_0x00da
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0l(r7)     // Catch:{ EOFException -> 0x0129 }
            X.C18320x8.A1P(r0, r11)     // Catch:{ EOFException -> 0x0129 }
            java.lang.String r0 = r0.toString()     // Catch:{ EOFException -> 0x0129 }
            java.io.IOException r0 = X.AnonymousClass002.A0C(r0)     // Catch:{ EOFException -> 0x0129 }
            goto L_0x0128
        L_0x00da:
            if (r13 >= r12) goto L_0x0063
            long[] r6 = r10.A04     // Catch:{ NumberFormatException -> 0x0107 }
            r0 = r11[r13]     // Catch:{ NumberFormatException -> 0x0107 }
            long r0 = java.lang.Long.parseLong(r0)     // Catch:{ NumberFormatException -> 0x0107 }
            r6[r13] = r0     // Catch:{ NumberFormatException -> 0x0107 }
            r13 = 1
            goto L_0x00da
        L_0x00e8:
            java.lang.String r0 = "DIRTY"
            boolean r0 = r12.equals(r0)     // Catch:{ EOFException -> 0x0129 }
            if (r0 == 0) goto L_0x00fb
            if (r6 != r1) goto L_0x00fb
            X.7WJ r0 = new X.7WJ     // Catch:{ EOFException -> 0x0129 }
            r0.<init>(r10, r5)     // Catch:{ EOFException -> 0x0129 }
            r10.A01 = r0     // Catch:{ EOFException -> 0x0129 }
            goto L_0x0063
        L_0x00fb:
            java.lang.String r0 = "READ"
            boolean r0 = r12.equals(r0)     // Catch:{ EOFException -> 0x0129 }
            if (r0 == 0) goto L_0x0120
            if (r6 != r1) goto L_0x0120
            goto L_0x0063
        L_0x0107:
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0l(r7)     // Catch:{ EOFException -> 0x0129 }
            X.C18320x8.A1P(r0, r11)     // Catch:{ EOFException -> 0x0129 }
            java.lang.String r0 = r0.toString()     // Catch:{ EOFException -> 0x0129 }
            java.io.IOException r0 = X.AnonymousClass002.A0C(r0)     // Catch:{ EOFException -> 0x0129 }
            goto L_0x0128
        L_0x0117:
            java.lang.String r0 = X.AnonymousClass000.A0T(r7, r11)     // Catch:{ EOFException -> 0x0129 }
            java.io.IOException r0 = X.AnonymousClass002.A0C(r0)     // Catch:{ EOFException -> 0x0129 }
            goto L_0x0128
        L_0x0120:
            java.lang.String r0 = X.AnonymousClass000.A0T(r7, r11)     // Catch:{ EOFException -> 0x0129 }
            java.io.IOException r0 = X.AnonymousClass002.A0C(r0)     // Catch:{ EOFException -> 0x0129 }
        L_0x0128:
            throw r0     // Catch:{ EOFException -> 0x0129 }
        L_0x0129:
            A03(r4)     // Catch:{ IOException -> 0x0196 }
            java.io.File r0 = r5.A0A     // Catch:{ IOException -> 0x0196 }
            A05(r0)     // Catch:{ IOException -> 0x0196 }
            java.util.LinkedHashMap r0 = r5.A0B     // Catch:{ IOException -> 0x0196 }
            java.util.Iterator r10 = X.C18290x4.A10(r0)     // Catch:{ IOException -> 0x0196 }
        L_0x0137:
            boolean r0 = r10.hasNext()     // Catch:{ IOException -> 0x0196 }
            if (r0 == 0) goto L_0x0167
            java.lang.Object r4 = r10.next()     // Catch:{ IOException -> 0x0196 }
            X.7Wz r4 = (X.C151967Wz) r4     // Catch:{ IOException -> 0x0196 }
            X.7WJ r0 = r4.A01     // Catch:{ IOException -> 0x0196 }
            r1 = 0
            if (r0 != 0) goto L_0x0152
            long r6 = r5.A02     // Catch:{ IOException -> 0x0196 }
            long[] r0 = r4.A04     // Catch:{ IOException -> 0x0196 }
            r0 = r0[r1]     // Catch:{ IOException -> 0x0196 }
            long r6 = r6 + r0
            r5.A02 = r6     // Catch:{ IOException -> 0x0196 }
            goto L_0x0137
        L_0x0152:
            r0 = 0
            r4.A01 = r0     // Catch:{ IOException -> 0x0196 }
            java.io.File r0 = r4.A00()     // Catch:{ IOException -> 0x0196 }
            A05(r0)     // Catch:{ IOException -> 0x0196 }
            java.io.File r0 = r4.A01()     // Catch:{ IOException -> 0x0196 }
            A05(r0)     // Catch:{ IOException -> 0x0196 }
            r10.remove()     // Catch:{ IOException -> 0x0196 }
            goto L_0x0137
        L_0x0167:
            java.io.FileWriter r4 = new java.io.FileWriter     // Catch:{ IOException -> 0x0196 }
            r4.<init>(r9, r8)     // Catch:{ IOException -> 0x0196 }
            r1 = 8192(0x2000, float:1.14794E-41)
            java.io.BufferedWriter r0 = new java.io.BufferedWriter     // Catch:{ IOException -> 0x0196 }
            r0.<init>(r4, r1)     // Catch:{ IOException -> 0x0196 }
            r5.A03 = r0     // Catch:{ IOException -> 0x0196 }
            return r5
        L_0x0176:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0191 }
            java.lang.String r0 = "unexpected journal header: ["
            X.C18260x0.A0p(r0, r11, r12, r10, r1)     // Catch:{ all -> 0x0191 }
            r1.append(r12)     // Catch:{ all -> 0x0191 }
            r1.append(r7)     // Catch:{ all -> 0x0191 }
            r1.append(r12)     // Catch:{ all -> 0x0191 }
            java.lang.String r0 = X.AnonymousClass000.A0W(r6, r1)     // Catch:{ all -> 0x0191 }
            java.io.IOException r0 = X.AnonymousClass002.A0C(r0)     // Catch:{ all -> 0x0191 }
            throw r0     // Catch:{ all -> 0x0191 }
        L_0x0191:
            r0 = move-exception
            A03(r4)     // Catch:{ IOException -> 0x0196 }
            throw r0     // Catch:{ IOException -> 0x0196 }
        L_0x0196:
            r5.close()
            java.io.File r0 = r5.A08
            A04(r0)
        L_0x019e:
            r16.mkdirs()
            X.8Ke r5 = new X.8Ke
            r1 = r17
            r0 = r16
            r5.<init>(r1, r0, r2)
            r5.A0B()
            return r5
        L_0x01ae:
            java.lang.String r0 = "maxSize <= 0"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A0c(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C172228Ke.A00(X.7EN, java.io.File, long):X.8Ke");
    }

    public static /* synthetic */ void A02(AnonymousClass7WJ r9, C172228Ke r10, boolean z) {
        IllegalStateException illegalStateException;
        synchronized (r10) {
            C151967Wz r7 = r9.A01;
            if (r7.A01 == r9) {
                if (z && !r7.A02) {
                    int i = 0;
                    while (i < r10.A05) {
                        if (r7.A01().exists()) {
                            i = 1;
                        } else {
                            A02(r9, r9.A02, false);
                            illegalStateException = C86604Kt.A0h("edit didn't create file ", AnonymousClass001.A0o(), i);
                        }
                    }
                }
                for (int i2 = 0; i2 < r10.A05; i2 = 1) {
                    File A012 = r7.A01();
                    if (!z) {
                        A05(A012);
                    } else if (A012.exists()) {
                        File A002 = r7.A00();
                        A012.renameTo(A002);
                        long[] jArr = r7.A04;
                        long j = jArr[i2];
                        long length = A002.length();
                        jArr[i2] = length;
                        r10.A02 = (r10.A02 - j) + length;
                    }
                }
                r10.A00++;
                r7.A01 = null;
                if (r7.A02 || z) {
                    r7.A02 = true;
                    Writer writer = r10.A03;
                    StringBuilder A0o = AnonymousClass001.A0o();
                    A0o.append("CLEAN ");
                    StringBuilder A0w = C18290x4.A0w(r7.A03, A0o);
                    for (long append : r7.A04) {
                        A0w.append(' ');
                        A0w.append(append);
                    }
                    AnonymousClass000.A1B(A0w, A0o);
                    AnonymousClass6C7.A12(writer, A0o);
                    if (z) {
                        long j2 = r10.A01;
                        r10.A01 = 1 + j2;
                        r7.A00 = j2;
                    }
                } else {
                    LinkedHashMap linkedHashMap = r10.A0B;
                    String str = r7.A03;
                    linkedHashMap.remove(str);
                    Writer writer2 = r10.A03;
                    StringBuilder A0o2 = AnonymousClass001.A0o();
                    A0o2.append("REMOVE ");
                    A0o2.append(str);
                    AnonymousClass6C7.A12(writer2, A0o2);
                }
                Writer writer3 = r10.A03;
                if (writer3 != null) {
                    writer3.flush();
                }
                if (r10.A02 > r10.A06 || r10.A0C()) {
                    r10.A0D.submit(r10.A0C);
                }
            } else {
                illegalStateException = AnonymousClass6CA.A0O();
            }
            throw illegalStateException;
        }
    }

    public synchronized long A07() {
        return this.A02;
    }

    public final synchronized AnonymousClass7WJ A08(String str) {
        if (this.A03 != null) {
            A06(str);
            LinkedHashMap linkedHashMap = this.A0B;
            C151967Wz r2 = (C151967Wz) linkedHashMap.get(str);
            if (r2 == null) {
                r2 = new C151967Wz(this, str);
                linkedHashMap.put(str, r2);
            } else if (r2.A01 != null) {
                return null;
            }
            AnonymousClass7WJ r3 = new AnonymousClass7WJ(r2, this);
            r2.A01 = r3;
            Writer writer = this.A03;
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("DIRTY ");
            A0o.append(str);
            AnonymousClass6C7.A12(writer, A0o);
            this.A03.flush();
            return r3;
        }
        throw AnonymousClass001.A0e("cache is closed");
    }

    public synchronized AnonymousClass8KP A09(String str) {
        AnonymousClass8KP r4;
        synchronized (this) {
            if (this.A03 != null) {
                A06(str);
                C151967Wz r5 = (C151967Wz) this.A0B.get(str);
                r4 = null;
                if (r5 != null && r5.A02) {
                    int i = this.A05;
                    InputStream[] inputStreamArr = new InputStream[i];
                    int i2 = 0;
                    while (i2 < i) {
                        try {
                            inputStreamArr[i2] = AnonymousClass0x9.A0g(r5.A00());
                            i2 = 1;
                        } catch (FileNotFoundException unused) {
                            return null;
                        }
                    }
                    this.A00++;
                    this.A03.append("READ").append(' ').append(str).append(10);
                    if (A0C()) {
                        this.A0D.submit(this.A0C);
                    }
                    r4 = new AnonymousClass8KP(this, inputStreamArr);
                }
            } else {
                throw AnonymousClass001.A0e("cache is closed");
            }
        }
        return r4;
    }

    public final synchronized void A0B() {
        Writer writer = this.A03;
        if (writer != null) {
            writer.close();
        }
        File file = this.A0A;
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file), DefaultCrypto.BUFFER_SIZE);
        try {
            bufferedWriter.write("libcore.io.DiskLruCache");
            bufferedWriter.write("\n");
            bufferedWriter.write("1");
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.A04));
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.A05));
            bufferedWriter.write("\n");
            bufferedWriter.write("\n");
            Iterator A10 = C18290x4.A10(this.A0B);
            while (A10.hasNext()) {
                C151967Wz r2 = (C151967Wz) A10.next();
                if (r2.A01 != null) {
                    StringBuilder A0o = AnonymousClass001.A0o();
                    A0o.append("DIRTY ");
                    A0o.append(r2.A03);
                    AnonymousClass6C7.A12(bufferedWriter, A0o);
                } else {
                    StringBuilder A0o2 = AnonymousClass001.A0o();
                    A0o2.append("CLEAN ");
                    StringBuilder A0w = C18290x4.A0w(r2.A03, A0o2);
                    for (long append : r2.A04) {
                        A0w.append(' ');
                        A0w.append(append);
                    }
                    AnonymousClass000.A1B(A0w, A0o2);
                    AnonymousClass6C7.A12(bufferedWriter, A0o2);
                }
            }
            bufferedWriter.close();
            File file2 = this.A09;
            file.renameTo(file2);
            this.A03 = new BufferedWriter(new FileWriter(file2, true), DefaultCrypto.BUFFER_SIZE);
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        return;
        throw th;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v2 */
    /* JADX WARNING: type inference failed for: r2v3 */
    /* JADX WARNING: type inference failed for: r2v4 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean A0D(java.lang.String r9) {
        /*
            r8 = this;
            monitor-enter(r8)
            java.io.Writer r0 = r8.A03     // Catch:{ all -> 0x007b }
            if (r0 == 0) goto L_0x0065
            A06(r9)     // Catch:{ all -> 0x007b }
            java.util.LinkedHashMap r3 = r8.A0B     // Catch:{ all -> 0x007b }
            java.lang.Object r7 = r3.get(r9)     // Catch:{ all -> 0x007b }
            X.7Wz r7 = (X.C151967Wz) r7     // Catch:{ all -> 0x007b }
            r2 = 0
            if (r7 == 0) goto L_0x0063
            X.7WJ r0 = r7.A01     // Catch:{ all -> 0x007b }
            if (r0 == 0) goto L_0x0018
            goto L_0x0063
        L_0x0018:
            int r0 = r8.A05     // Catch:{ all -> 0x007b }
            if (r2 >= r0) goto L_0x0035
            java.io.File r4 = r7.A00()     // Catch:{ all -> 0x007b }
            boolean r0 = r4.delete()     // Catch:{ all -> 0x007b }
            if (r0 == 0) goto L_0x006c
            long r4 = r8.A02     // Catch:{ all -> 0x007b }
            long[] r6 = r7.A04     // Catch:{ all -> 0x007b }
            r0 = r6[r2]     // Catch:{ all -> 0x007b }
            long r4 = r4 - r0
            r8.A02 = r4     // Catch:{ all -> 0x007b }
            r0 = 0
            r6[r2] = r0     // Catch:{ all -> 0x007b }
            r2 = 1
            goto L_0x0018
        L_0x0035:
            int r0 = r8.A00     // Catch:{ all -> 0x007b }
            r2 = 1
            int r0 = r0 + 1
            r8.A00 = r0     // Catch:{ all -> 0x007b }
            java.io.Writer r1 = r8.A03     // Catch:{ all -> 0x007b }
            java.lang.String r0 = "REMOVE"
            java.io.Writer r1 = r1.append(r0)     // Catch:{ all -> 0x007b }
            r0 = 32
            java.io.Writer r0 = r1.append(r0)     // Catch:{ all -> 0x007b }
            java.io.Writer r1 = r0.append(r9)     // Catch:{ all -> 0x007b }
            r0 = 10
            r1.append(r0)     // Catch:{ all -> 0x007b }
            r3.remove(r9)     // Catch:{ all -> 0x007b }
            boolean r0 = r8.A0C()     // Catch:{ all -> 0x007b }
            if (r0 == 0) goto L_0x0063
            java.util.concurrent.ExecutorService r1 = r8.A0D     // Catch:{ all -> 0x007b }
            java.util.concurrent.Callable r0 = r8.A0C     // Catch:{ all -> 0x007b }
            r1.submit(r0)     // Catch:{ all -> 0x007b }
        L_0x0063:
            monitor-exit(r8)
            return r2
        L_0x0065:
            java.lang.String r0 = "cache is closed"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r0)     // Catch:{ all -> 0x007b }
            goto L_0x007a
        L_0x006c:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x007b }
            java.lang.String r0 = "failed to delete "
            java.lang.String r0 = X.AnonymousClass000.A0P(r4, r0, r1)     // Catch:{ all -> 0x007b }
            java.io.IOException r0 = X.AnonymousClass002.A0C(r0)     // Catch:{ all -> 0x007b }
        L_0x007a:
            throw r0     // Catch:{ all -> 0x007b }
        L_0x007b:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C172228Ke.A0D(java.lang.String):boolean");
    }

    public synchronized void close() {
        if (this.A03 != null) {
            Iterator A0u = AnonymousClass6C7.A0u(this.A0B.values());
            while (A0u.hasNext()) {
                AnonymousClass7WJ r2 = ((C151967Wz) A0u.next()).A01;
                if (r2 != null) {
                    A02(r2, r2.A02, false);
                }
            }
            A0A();
            this.A03.close();
            this.A03 = null;
        }
    }

    public static String A01(InputStream inputStream) {
        StringBuilder A0Y = AnonymousClass6CA.A0Y(80);
        while (true) {
            int read = inputStream.read();
            if (read == -1) {
                throw AnonymousClass6CA.A0M();
            } else if (read == 10) {
                int length = A0Y.length();
                if (length > 0) {
                    int i = length - 1;
                    if (A0Y.charAt(i) == 13) {
                        A0Y.setLength(i);
                    }
                }
                return A0Y.toString();
            } else {
                A0Y.append((char) read);
            }
        }
    }

    public static void A03(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    public static final void A06(String str) {
        if (str.contains(" ") || str.contains("\n") || str.contains("\r")) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("keys must not contain spaces or newlines: \"");
            A0o.append(str);
            throw AnonymousClass000.A0F("\"", A0o);
        }
    }

    public final boolean A0C() {
        int i = this.A00;
        if (i < 2000 || i < this.A0B.size()) {
            return false;
        }
        return true;
    }

    public static void A04(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            int length = listFiles.length;
            int i = 0;
            while (i < length) {
                File file2 = listFiles[i];
                if (file2.isDirectory()) {
                    A04(file2);
                }
                if (file2.delete()) {
                    i++;
                } else {
                    throw AnonymousClass002.A0C(AnonymousClass000.A0P(file2, "failed to delete file: ", AnonymousClass001.A0o()));
                }
            }
            return;
        }
        throw AnonymousClass000.A0E(file, "not a directory: ", AnonymousClass001.A0o());
    }

    public static void A05(File file) {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    public final void A0A() {
        HashSet A0K = AnonymousClass002.A0K();
        while (this.A02 > this.A06) {
            String A0q = C18310x6.A0q(AnonymousClass001.A0w(AnonymousClass001.A0u(this.A0B)));
            if (A0D(A0q)) {
                A0K.add(A0q);
            }
        }
        AnonymousClass7EN r0 = this.A07;
        if (r0 != null) {
            C49642gr r3 = r0.A00;
            Set set = r3.A03;
            synchronized (set) {
                Iterator it = A0K.iterator();
                while (it.hasNext()) {
                    set.remove(AnonymousClass001.A0m(it));
                }
                r3.A00();
            }
        }
    }
}
