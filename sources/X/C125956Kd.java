package X;

import android.content.Context;

/* renamed from: X.6Kd  reason: invalid class name and case insensitive filesystem */
public class C125956Kd extends C172748Mo {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C126006Ki A01;

    public C125956Kd(Context context, C126006Ki r2) {
        this.A01 = r2;
        this.A00 = context;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:81|82|83|84|(4:87|(2:89|121)(2:90|122)|119|85)|120|91) */
    /* JADX WARNING: Code restructure failed: missing block: B:82:?, code lost:
        r3 = r7.A0B;
        r7.A00 = r4 - r3.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:?, code lost:
        X.C172208Kc.A01(r0);
        X.C172208Kc.A03(r7.A0A);
        r11 = X.C18290x4.A10(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0199, code lost:
        if (r11.hasNext() != false) goto L_0x019b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x019b, code lost:
        r10 = (X.C151927Wv) r11.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01a4, code lost:
        if (r10.A01 == null) goto L_0x01a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01a6, code lost:
        r7.A03 += r10.A04[0];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01b0, code lost:
        r10.A01 = null;
        X.C172208Kc.A03(r10.A00());
        X.C172208Kc.A03(r10.A01());
        r11.remove();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01c5, code lost:
        r7.A04 = new java.io.BufferedWriter(new java.io.OutputStreamWriter(new java.io.FileOutputStream(r17, true), r5));
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:81:0x0180 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:81:0x0180=Splitter:B:81:0x0180, B:92:0x01d9=Splitter:B:92:0x01d9} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r18 = this;
            r0 = r18
            android.content.Context r0 = r0.A00
            java.io.File r5 = r0.getCacheDir()
            long r3 = r5.getFreeSpace()
            r1 = 30
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x024f
            r1 = 100
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            r1 = 2097152(0x200000, float:2.938736E-39)
            if (r0 < 0) goto L_0x001c
            r1 = 5242880(0x500000, float:7.34684E-39)
        L_0x001c:
            java.lang.String r0 = ".facebook_cache"
            java.io.File r6 = X.AnonymousClass002.A0A(r5, r0)
            long r1 = (long) r1
            r13 = 2
            r8 = 1
            r3 = 0
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x0243
            java.lang.String r0 = "journal.bkp"
            java.io.File r4 = X.AnonymousClass002.A0A(r6, r0)     // Catch:{ IOException -> 0x024a }
            boolean r0 = r4.exists()     // Catch:{ IOException -> 0x024a }
            if (r0 == 0) goto L_0x0046
            java.lang.String r0 = "journal"
            java.io.File r3 = X.AnonymousClass002.A0A(r6, r0)     // Catch:{ IOException -> 0x024a }
            boolean r0 = r3.exists()     // Catch:{ IOException -> 0x024a }
            if (r0 == 0) goto L_0x0056
            r4.delete()     // Catch:{ IOException -> 0x024a }
        L_0x0046:
            X.8Kc r7 = new X.8Kc     // Catch:{ IOException -> 0x024a }
            r7.<init>(r6, r1)     // Catch:{ IOException -> 0x024a }
            java.io.File r0 = r7.A08     // Catch:{ IOException -> 0x024a }
            r17 = r0
            boolean r0 = r17.exists()     // Catch:{ IOException -> 0x024a }
            if (r0 == 0) goto L_0x0225
            goto L_0x0063
        L_0x0056:
            boolean r0 = r4.renameTo(r3)     // Catch:{ IOException -> 0x024a }
            if (r0 != 0) goto L_0x0046
            java.io.IOException r0 = new java.io.IOException     // Catch:{ IOException -> 0x024a }
            r0.<init>()     // Catch:{ IOException -> 0x024a }
            goto L_0x0249
        L_0x0063:
            java.lang.String r11 = ", "
            java.io.FileInputStream r3 = X.AnonymousClass0x9.A0g(r17)     // Catch:{ IOException -> 0x01f9 }
            java.nio.charset.Charset r5 = X.C172208Kc.A0F     // Catch:{ IOException -> 0x01f9 }
            X.8KU r16 = new X.8KU     // Catch:{ IOException -> 0x01f9 }
            r0 = r16
            r0.<init>(r7, r3, r5)     // Catch:{ IOException -> 0x01f9 }
            java.lang.String r12 = r16.A00()     // Catch:{ all -> 0x01f4 }
            java.lang.String r10 = r16.A00()     // Catch:{ all -> 0x01f4 }
            java.lang.String r3 = r16.A00()     // Catch:{ all -> 0x01f4 }
            java.lang.String r9 = r16.A00()     // Catch:{ all -> 0x01f4 }
            java.lang.String r4 = r16.A00()     // Catch:{ all -> 0x01f4 }
            java.lang.String r0 = "libcore.io.DiskLruCache"
            boolean r0 = r0.equals(r12)     // Catch:{ all -> 0x01f4 }
            if (r0 == 0) goto L_0x01d9
            java.lang.String r0 = "1"
            boolean r0 = r0.equals(r10)     // Catch:{ all -> 0x01f4 }
            if (r0 == 0) goto L_0x01d9
            java.lang.String r0 = java.lang.Integer.toString(r13)     // Catch:{ all -> 0x01f4 }
            boolean r0 = r0.equals(r3)     // Catch:{ all -> 0x01f4 }
            if (r0 == 0) goto L_0x01d9
            java.lang.String r0 = java.lang.Integer.toString(r8)     // Catch:{ all -> 0x01f4 }
            boolean r0 = r0.equals(r9)     // Catch:{ all -> 0x01f4 }
            if (r0 == 0) goto L_0x01d9
            java.lang.String r0 = ""
            boolean r0 = r0.equals(r4)     // Catch:{ all -> 0x01f4 }
            if (r0 == 0) goto L_0x01d9
            r4 = 0
        L_0x00b3:
            java.lang.String r9 = r16.A00()     // Catch:{ EOFException -> 0x0180 }
            r10 = 32
            int r14 = r9.indexOf(r10)     // Catch:{ EOFException -> 0x0180 }
            java.lang.String r3 = "unexpected journal line: "
            r15 = -1
            if (r14 == r15) goto L_0x0167
            int r0 = r14 + 1
            int r13 = r9.indexOf(r10, r0)     // Catch:{ EOFException -> 0x0180 }
            if (r13 != r15) goto L_0x00df
            java.lang.String r10 = r9.substring(r0)     // Catch:{ EOFException -> 0x0180 }
            r0 = 6
            if (r14 != r0) goto L_0x00e3
            java.lang.String r0 = "REMOVE"
            boolean r0 = r9.startsWith(r0)     // Catch:{ EOFException -> 0x0180 }
            if (r0 == 0) goto L_0x00e3
            java.util.LinkedHashMap r0 = r7.A0B     // Catch:{ EOFException -> 0x0180 }
            r0.remove(r10)     // Catch:{ EOFException -> 0x0180 }
            goto L_0x014a
        L_0x00df:
            java.lang.String r10 = r9.substring(r0, r13)     // Catch:{ EOFException -> 0x0180 }
        L_0x00e3:
            java.util.LinkedHashMap r0 = r7.A0B     // Catch:{ EOFException -> 0x0180 }
            java.lang.Object r12 = r0.get(r10)     // Catch:{ EOFException -> 0x0180 }
            X.7Wv r12 = (X.C151927Wv) r12     // Catch:{ EOFException -> 0x0180 }
            r11 = 0
            if (r12 != 0) goto L_0x00f6
            X.7Wv r12 = new X.7Wv     // Catch:{ EOFException -> 0x0180 }
            r12.<init>(r7, r10)     // Catch:{ EOFException -> 0x0180 }
            r0.put(r10, r12)     // Catch:{ EOFException -> 0x0180 }
        L_0x00f6:
            r10 = 5
            if (r13 == r15) goto L_0x0127
            if (r14 != r10) goto L_0x012a
            java.lang.String r0 = "CLEAN"
            boolean r0 = r9.startsWith(r0)     // Catch:{ EOFException -> 0x0180 }
            if (r0 == 0) goto L_0x012a
            java.lang.String r9 = X.AnonymousClass6C9.A0c(r13, r9)     // Catch:{ EOFException -> 0x0180 }
            java.lang.String r0 = " "
            java.lang.String[] r13 = r9.split(r0)     // Catch:{ EOFException -> 0x0180 }
            r12.A02 = r8     // Catch:{ EOFException -> 0x0180 }
            r12.A01 = r11     // Catch:{ EOFException -> 0x0180 }
            int r15 = r13.length     // Catch:{ EOFException -> 0x0180 }
            X.8Kc r0 = r12.A05     // Catch:{ EOFException -> 0x0180 }
            int r0 = r0.A06     // Catch:{ EOFException -> 0x0180 }
            if (r15 != r0) goto L_0x0170
            r14 = 0
        L_0x0119:
            if (r14 >= r15) goto L_0x014a
            long[] r11 = r12.A04     // Catch:{ NumberFormatException -> 0x014e }
            r0 = r13[r14]     // Catch:{ NumberFormatException -> 0x014e }
            long r9 = java.lang.Long.parseLong(r0)     // Catch:{ NumberFormatException -> 0x014e }
            r11[r14] = r9     // Catch:{ NumberFormatException -> 0x014e }
            r14 = 1
            goto L_0x0119
        L_0x0127:
            if (r14 != r10) goto L_0x012e
            goto L_0x0132
        L_0x012a:
            if (r13 == r15) goto L_0x0127
            if (r13 != r15) goto L_0x015e
        L_0x012e:
            r0 = 4
            if (r14 != r0) goto L_0x015e
            goto L_0x0142
        L_0x0132:
            java.lang.String r0 = "DIRTY"
            boolean r0 = r9.startsWith(r0)     // Catch:{ EOFException -> 0x0180 }
            if (r0 == 0) goto L_0x015e
            X.7Tg r0 = new X.7Tg     // Catch:{ EOFException -> 0x0180 }
            r0.<init>(r12, r7)     // Catch:{ EOFException -> 0x0180 }
            r12.A01 = r0     // Catch:{ EOFException -> 0x0180 }
            goto L_0x014a
        L_0x0142:
            java.lang.String r0 = "READ"
            boolean r0 = r9.startsWith(r0)     // Catch:{ EOFException -> 0x0180 }
            if (r0 == 0) goto L_0x015e
        L_0x014a:
            int r4 = r4 + 1
            goto L_0x00b3
        L_0x014e:
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0l(r3)     // Catch:{ EOFException -> 0x0180 }
            X.C18320x8.A1P(r0, r13)     // Catch:{ EOFException -> 0x0180 }
            java.lang.String r0 = r0.toString()     // Catch:{ EOFException -> 0x0180 }
            java.io.IOException r0 = X.AnonymousClass002.A0C(r0)     // Catch:{ EOFException -> 0x0180 }
            goto L_0x017f
        L_0x015e:
            java.lang.String r0 = X.AnonymousClass000.A0T(r3, r9)     // Catch:{ EOFException -> 0x0180 }
            java.io.IOException r0 = X.AnonymousClass002.A0C(r0)     // Catch:{ EOFException -> 0x0180 }
            goto L_0x017f
        L_0x0167:
            java.lang.String r0 = X.AnonymousClass000.A0T(r3, r9)     // Catch:{ EOFException -> 0x0180 }
            java.io.IOException r0 = X.AnonymousClass002.A0C(r0)     // Catch:{ EOFException -> 0x0180 }
            goto L_0x017f
        L_0x0170:
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0l(r3)     // Catch:{ EOFException -> 0x0180 }
            X.C18320x8.A1P(r0, r13)     // Catch:{ EOFException -> 0x0180 }
            java.lang.String r0 = r0.toString()     // Catch:{ EOFException -> 0x0180 }
            java.io.IOException r0 = X.AnonymousClass002.A0C(r0)     // Catch:{ EOFException -> 0x0180 }
        L_0x017f:
            throw r0     // Catch:{ EOFException -> 0x0180 }
        L_0x0180:
            java.util.LinkedHashMap r3 = r7.A0B     // Catch:{ all -> 0x01f4 }
            int r0 = r3.size()     // Catch:{ all -> 0x01f4 }
            int r4 = r4 - r0
            r7.A00 = r4     // Catch:{ all -> 0x01f4 }
            X.C172208Kc.A01(r16)     // Catch:{ IOException -> 0x01f9 }
            java.io.File r0 = r7.A0A     // Catch:{ IOException -> 0x01f9 }
            X.C172208Kc.A03(r0)     // Catch:{ IOException -> 0x01f9 }
            java.util.Iterator r11 = X.C18290x4.A10(r3)     // Catch:{ IOException -> 0x01f9 }
        L_0x0195:
            boolean r0 = r11.hasNext()     // Catch:{ IOException -> 0x01f9 }
            if (r0 == 0) goto L_0x01c5
            java.lang.Object r10 = r11.next()     // Catch:{ IOException -> 0x01f9 }
            X.7Wv r10 = (X.C151927Wv) r10     // Catch:{ IOException -> 0x01f9 }
            X.7Tg r0 = r10.A01     // Catch:{ IOException -> 0x01f9 }
            r9 = 0
            if (r0 != 0) goto L_0x01b0
            long r3 = r7.A03     // Catch:{ IOException -> 0x01f9 }
            long[] r0 = r10.A04     // Catch:{ IOException -> 0x01f9 }
            r9 = r0[r9]     // Catch:{ IOException -> 0x01f9 }
            long r3 = r3 + r9
            r7.A03 = r3     // Catch:{ IOException -> 0x01f9 }
            goto L_0x0195
        L_0x01b0:
            r0 = 0
            r10.A01 = r0     // Catch:{ IOException -> 0x01f9 }
            java.io.File r0 = r10.A00()     // Catch:{ IOException -> 0x01f9 }
            X.C172208Kc.A03(r0)     // Catch:{ IOException -> 0x01f9 }
            java.io.File r0 = r10.A01()     // Catch:{ IOException -> 0x01f9 }
            X.C172208Kc.A03(r0)     // Catch:{ IOException -> 0x01f9 }
            r11.remove()     // Catch:{ IOException -> 0x01f9 }
            goto L_0x0195
        L_0x01c5:
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x01f9 }
            r0 = r17
            r4.<init>(r0, r8)     // Catch:{ IOException -> 0x01f9 }
            java.io.OutputStreamWriter r3 = new java.io.OutputStreamWriter     // Catch:{ IOException -> 0x01f9 }
            r3.<init>(r4, r5)     // Catch:{ IOException -> 0x01f9 }
            java.io.BufferedWriter r0 = new java.io.BufferedWriter     // Catch:{ IOException -> 0x01f9 }
            r0.<init>(r3)     // Catch:{ IOException -> 0x01f9 }
            r7.A04 = r0     // Catch:{ IOException -> 0x01f9 }
            goto L_0x0230
        L_0x01d9:
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x01f4 }
            java.lang.String r0 = "unexpected journal header: ["
            X.C18260x0.A0p(r0, r12, r11, r10, r3)     // Catch:{ all -> 0x01f4 }
            r3.append(r11)     // Catch:{ all -> 0x01f4 }
            r3.append(r9)     // Catch:{ all -> 0x01f4 }
            r3.append(r11)     // Catch:{ all -> 0x01f4 }
            java.lang.String r0 = X.AnonymousClass000.A0W(r4, r3)     // Catch:{ all -> 0x01f4 }
            java.io.IOException r0 = X.AnonymousClass002.A0C(r0)     // Catch:{ all -> 0x01f4 }
            throw r0     // Catch:{ all -> 0x01f4 }
        L_0x01f4:
            r0 = move-exception
            X.C172208Kc.A01(r16)     // Catch:{ IOException -> 0x01f9 }
            throw r0     // Catch:{ IOException -> 0x01f9 }
        L_0x01f9:
            r5 = move-exception
            java.io.PrintStream r4 = java.lang.System.out     // Catch:{ IOException -> 0x024a }
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()     // Catch:{ IOException -> 0x024a }
            java.lang.String r0 = "DiskLruCache "
            r3.append(r0)     // Catch:{ IOException -> 0x024a }
            r3.append(r6)     // Catch:{ IOException -> 0x024a }
            java.lang.String r0 = " is corrupt: "
            r3.append(r0)     // Catch:{ IOException -> 0x024a }
            java.lang.String r0 = r5.getMessage()     // Catch:{ IOException -> 0x024a }
            r3.append(r0)     // Catch:{ IOException -> 0x024a }
            java.lang.String r0 = ", removing"
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r3)     // Catch:{ IOException -> 0x024a }
            r4.println(r0)     // Catch:{ IOException -> 0x024a }
            r7.close()     // Catch:{ IOException -> 0x024a }
            java.io.File r0 = r7.A07     // Catch:{ IOException -> 0x024a }
            X.C172208Kc.A02(r0)     // Catch:{ IOException -> 0x024a }
        L_0x0225:
            r6.mkdirs()     // Catch:{ IOException -> 0x024a }
            X.8Kc r7 = new X.8Kc     // Catch:{ IOException -> 0x024a }
            r7.<init>(r6, r1)     // Catch:{ IOException -> 0x024a }
            r7.A05()     // Catch:{ IOException -> 0x024a }
        L_0x0230:
            X.C126006Ki.A05 = r7     // Catch:{ IOException -> 0x024a }
            r0 = 0
            X.8Lw r1 = new X.8Lw     // Catch:{ IOException -> 0x024a }
            r1.<init>(r0)     // Catch:{ IOException -> 0x024a }
            java.lang.Thread r0 = new java.lang.Thread     // Catch:{ IOException -> 0x024a }
            r0.<init>(r1)     // Catch:{ IOException -> 0x024a }
            X.C126006Ki.A02 = r0     // Catch:{ IOException -> 0x024a }
            r0.start()     // Catch:{ IOException -> 0x024a }
            return
        L_0x0243:
            java.lang.String r0 = "maxSize <= 0"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A0c(r0)     // Catch:{ IOException -> 0x024a }
        L_0x0249:
            throw r0     // Catch:{ IOException -> 0x024a }
        L_0x024a:
            X.7kc r0 = X.C158827kc.A08
            r0.A01()
        L_0x024f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C125956Kd.run():void");
    }
}
