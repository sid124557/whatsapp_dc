package X;

import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.2xP  reason: invalid class name and case insensitive filesystem */
public class C59742xP {
    public static final long A09 = TimeUnit.MINUTES.toMillis(15);
    public long A00;
    public boolean A01;
    public final C54292oU A02;
    public final AnonymousClass33K A03;
    public final AnonymousClass3FI A04;
    public final AnonymousClass4FS A05;
    public final List A06 = AnonymousClass001.A0s();
    public final List A07 = AnonymousClass001.A0s();
    public final List A08 = AnonymousClass001.A0s();

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005d, code lost:
        throw new java.lang.IllegalArgumentException();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        r4.close();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void A00() {
        /*
            r7 = this;
            monitor-enter(r7)
            boolean r0 = r7.A01     // Catch:{ all -> 0x007c }
            if (r0 != 0) goto L_0x007a
            java.util.List r5 = r7.A08     // Catch:{ all -> 0x007c }
            r5.clear()     // Catch:{ all -> 0x007c }
            java.util.List r0 = r7.A07     // Catch:{ all -> 0x007c }
            r0.clear()     // Catch:{ all -> 0x007c }
            java.util.List r0 = r7.A06     // Catch:{ all -> 0x007c }
            r0.clear()     // Catch:{ all -> 0x007c }
            X.2oU r0 = r7.A02     // Catch:{ all -> 0x007c }
            android.content.res.Resources r1 = X.C54292oU.A00(r0)     // Catch:{ all -> 0x007c }
            r0 = 2132017161(0x7f140009, float:1.9672593E38)
            java.io.InputStream r2 = r1.openRawResource(r0)     // Catch:{ all -> 0x007c }
            java.lang.String r1 = X.C58152un.A0B     // Catch:{ UnsupportedEncodingException -> 0x0077 }
            java.io.InputStreamReader r0 = new java.io.InputStreamReader     // Catch:{ UnsupportedEncodingException -> 0x0077 }
            r0.<init>(r2, r1)     // Catch:{ UnsupportedEncodingException -> 0x0077 }
            java.io.BufferedReader r4 = new java.io.BufferedReader     // Catch:{ UnsupportedEncodingException -> 0x0077 }
            r4.<init>(r0)     // Catch:{ UnsupportedEncodingException -> 0x0077 }
        L_0x002d:
            java.lang.String r3 = r4.readLine()     // Catch:{ all -> 0x006d }
            if (r3 == 0) goto L_0x0069
            java.lang.String r0 = "\t"
            java.lang.String r6 = " "
            java.lang.String r2 = r3.replaceAll(r0, r6)     // Catch:{ IllegalArgumentException -> 0x005e }
            java.lang.String r1 = "^ +| +$|( )+"
            java.lang.String r0 = "$1"
            java.lang.String r0 = r2.replaceAll(r1, r0)     // Catch:{ IllegalArgumentException -> 0x005e }
            java.lang.String[] r2 = android.text.TextUtils.split(r0, r6)     // Catch:{ IllegalArgumentException -> 0x005e }
            if (r2 == 0) goto L_0x0058
            int r1 = r2.length     // Catch:{ IllegalArgumentException -> 0x005e }
            r0 = 3
            if (r1 < r0) goto L_0x0058
            X.3FI r1 = r7.A04     // Catch:{ IllegalArgumentException -> 0x005e }
            X.2Q9 r0 = new X.2Q9     // Catch:{ IllegalArgumentException -> 0x005e }
            r0.<init>(r1, r2)     // Catch:{ IllegalArgumentException -> 0x005e }
            r5.add(r0)     // Catch:{ IllegalArgumentException -> 0x005e }
            goto L_0x002d
        L_0x0058:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x005e }
            r0.<init>()     // Catch:{ IllegalArgumentException -> 0x005e }
            throw r0     // Catch:{ IllegalArgumentException -> 0x005e }
        L_0x005e:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x006d }
            java.lang.String r0 = "domain-fronting-providers/load/bad-line: "
            X.C18260x0.A0u(r0, r3, r1, r2)     // Catch:{ all -> 0x006d }
            goto L_0x002d
        L_0x0069:
            r4.close()     // Catch:{ UnsupportedEncodingException -> 0x0077 }
            goto L_0x0077
        L_0x006d:
            r1 = move-exception
            r4.close()     // Catch:{ all -> 0x0072 }
            goto L_0x0076
        L_0x0072:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ UnsupportedEncodingException -> 0x0077 }
        L_0x0076:
            throw r1     // Catch:{ UnsupportedEncodingException -> 0x0077 }
        L_0x0077:
            r0 = 1
            r7.A01 = r0     // Catch:{ all -> 0x007c }
        L_0x007a:
            monitor-exit(r7)
            return
        L_0x007c:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59742xP.A00():void");
    }

    public C59742xP(C54292oU r2, AnonymousClass33K r3, AnonymousClass3FI r4, AnonymousClass4FS r5) {
        this.A02 = r2;
        this.A04 = r4;
        this.A05 = r5;
        this.A03 = r3;
    }
}
