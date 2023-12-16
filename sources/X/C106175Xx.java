package X;

import android.content.Context;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.5Xx  reason: invalid class name and case insensitive filesystem */
public class C106175Xx {
    public static volatile C106175Xx A04;
    public C160507nm A00 = null;
    public ArrayList A01;
    public boolean A02 = false;
    public final Context A03;

    public C103905Ow A01(String str) {
        synchronized (this) {
            if (this.A00 == null) {
                try {
                    A05();
                    C160507nm r3 = new C160507nm(this.A01.size());
                    Iterator it = this.A01.iterator();
                    while (it.hasNext()) {
                        C103905Ow r1 = (C103905Ow) it.next();
                        r3.A03(r1.A02, r1);
                    }
                    this.A00 = r3;
                } catch (IOException unused) {
                    throw new RuntimeException("empty metadata");
                }
            }
        }
        try {
            return (C103905Ow) this.A00.A01(str);
        } catch (IllegalArgumentException unused2) {
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        r3.close();
        r5.A02 = true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void A05() {
        /*
            r5 = this;
            monitor-enter(r5)
            boolean r0 = r5.A02     // Catch:{ all -> 0x0073 }
            if (r0 != 0) goto L_0x0071
            r0 = 243(0xf3, float:3.4E-43)
            java.util.ArrayList r0 = X.AnonymousClass002.A0I(r0)     // Catch:{ all -> 0x0073 }
            r5.A01 = r0     // Catch:{ all -> 0x0073 }
            android.content.Context r0 = r5.A03     // Catch:{ all -> 0x0073 }
            android.content.res.Resources r1 = r0.getResources()     // Catch:{ all -> 0x0073 }
            r0 = 2132017160(0x7f140008, float:1.967259E38)
            java.io.InputStream r2 = r1.openRawResource(r0)     // Catch:{ all -> 0x0073 }
            java.lang.String r1 = X.C58152un.A0B     // Catch:{ all -> 0x0073 }
            java.io.InputStreamReader r0 = new java.io.InputStreamReader     // Catch:{ all -> 0x0073 }
            r0.<init>(r2, r1)     // Catch:{ all -> 0x0073 }
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch:{ all -> 0x0073 }
            r3.<init>(r0)     // Catch:{ all -> 0x0073 }
        L_0x0026:
            java.lang.String r4 = r3.readLine()     // Catch:{ all -> 0x0067 }
            if (r4 == 0) goto L_0x0060
            java.lang.String r0 = "\t"
            java.lang.String[] r2 = android.text.TextUtils.split(r4, r0)     // Catch:{ NumberFormatException -> 0x0055, IllegalArgumentException -> 0x004a }
            if (r2 == 0) goto L_0x0044
            int r1 = r2.length     // Catch:{ NumberFormatException -> 0x0055, IllegalArgumentException -> 0x004a }
            r0 = 12
            if (r1 < r0) goto L_0x0044
            java.util.ArrayList r1 = r5.A01     // Catch:{ NumberFormatException -> 0x0055, IllegalArgumentException -> 0x004a }
            X.5Ow r0 = new X.5Ow     // Catch:{ NumberFormatException -> 0x0055, IllegalArgumentException -> 0x004a }
            r0.<init>(r2)     // Catch:{ NumberFormatException -> 0x0055, IllegalArgumentException -> 0x004a }
            r1.add(r0)     // Catch:{ NumberFormatException -> 0x0055, IllegalArgumentException -> 0x004a }
            goto L_0x0026
        L_0x0044:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ NumberFormatException -> 0x0055, IllegalArgumentException -> 0x004a }
            r0.<init>()     // Catch:{ NumberFormatException -> 0x0055, IllegalArgumentException -> 0x004a }
            throw r0     // Catch:{ NumberFormatException -> 0x0055, IllegalArgumentException -> 0x004a }
        L_0x004a:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0067 }
            java.lang.String r0 = "countries/load/bad-line: "
            X.C18260x0.A0u(r0, r4, r1, r2)     // Catch:{ all -> 0x0067 }
            goto L_0x0026
        L_0x0055:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0067 }
            java.lang.String r0 = "countries/load/bad-number: "
            X.C18260x0.A0u(r0, r4, r1, r2)     // Catch:{ all -> 0x0067 }
            goto L_0x0026
        L_0x0060:
            r3.close()     // Catch:{ all -> 0x0073 }
            r0 = 1
            r5.A02 = r0     // Catch:{ all -> 0x0073 }
            goto L_0x0071
        L_0x0067:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x006c }
            goto L_0x0070
        L_0x006c:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0073 }
        L_0x0070:
            throw r1     // Catch:{ all -> 0x0073 }
        L_0x0071:
            monitor-exit(r5)
            return
        L_0x0073:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C106175Xx.A05():void");
    }

    public static C106175Xx A00() {
        if (A04 == null) {
            synchronized (C106175Xx.class) {
                if (A04 == null) {
                    Context context = C1441570g.A00;
                    if (context != null) {
                        A04 = new C106175Xx(context);
                    } else {
                        throw AnonymousClass001.A0e("CountryPhoneInfoContext.setApplicationContext() was not initialized!");
                    }
                }
            }
        }
        return A04;
    }

    public C106175Xx(Context context) {
        this.A03 = context;
    }

    public String A02(int i, String str) {
        int i2;
        String[] strArr;
        A05();
        Iterator it = this.A01.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C103905Ow r4 = (C103905Ow) it.next();
            int i3 = r4.A00;
            if (i3 == i) {
                if (i3 == 7 || i3 == 241 || i3 == 998) {
                    int length = str.length();
                    int i4 = 0;
                    while (i2 < length) {
                        String[] strArr2 = r4.A0A;
                        if (strArr2 == null) {
                            break;
                        } else if (r4.A00(length - i2) > 0) {
                            int length2 = strArr2.length;
                            int i5 = 0;
                            while (i5 < length2) {
                                if (strArr2[i5].charAt(0) == str.charAt(i2)) {
                                    i4 = i2 + 1;
                                } else {
                                    i5++;
                                }
                            }
                        }
                    }
                } else {
                    i2 = 0;
                    while (i2 < str.length() && (strArr = r4.A0A) != null) {
                        int i6 = 0;
                        boolean z = false;
                        while (true) {
                            if (i6 < strArr.length) {
                                if (z) {
                                    break;
                                }
                                if (strArr[i6].charAt(0) == str.charAt(i2)) {
                                    z = true;
                                }
                                i6++;
                            } else if (!z) {
                            }
                        }
                        i2++;
                    }
                }
                return str.substring(i2);
            }
        }
        return str;
    }

    public String A03(String str) {
        if (!TextUtils.isEmpty(str)) {
            A05();
            try {
                int parseInt = Integer.parseInt(str);
                Iterator it = this.A01.iterator();
                while (it.hasNext()) {
                    C103905Ow r1 = (C103905Ow) it.next();
                    if (r1.A00 == parseInt) {
                        return r1.A04;
                    }
                }
            } catch (NumberFormatException e) {
                Log.i("countries/get-tos-region", e);
                return "";
            }
        }
        return "";
    }

    public String A04(String str) {
        int i;
        A05();
        if (str != null) {
            int length = str.length();
            if (length == 2) {
                C103905Ow A012 = A01(C86664Kz.A1L(str));
                if (A012 != null) {
                    i = A012.A00;
                }
            } else if (length == 3 && !str.equals("999")) {
                Iterator it = this.A01.iterator();
                while (it.hasNext()) {
                    C103905Ow r4 = (C103905Ow) it.next();
                    int[] iArr = r4.A06;
                    if (iArr != null) {
                        int i2 = 0;
                        while (i2 < iArr.length) {
                            StringBuilder A0o = AnonymousClass001.A0o();
                            A0o.append(iArr[i2]);
                            if (str.equals(AnonymousClass000.A0X("", A0o))) {
                                i = r4.A00;
                            } else {
                                i2++;
                            }
                        }
                        continue;
                    }
                }
            }
            return Integer.toString(i);
        }
        return null;
    }
}
