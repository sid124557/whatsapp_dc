package X;

import com.whatsapp.util.Log;
import java.io.File;
import java.util.HashMap;

/* renamed from: X.6i2  reason: invalid class name and case insensitive filesystem */
public class C133846i2 extends C160827oN {
    public final HashMap A00 = AnonymousClass001.A0t();

    public synchronized HashMap A0F() {
        HashMap hashMap;
        String[] list;
        hashMap = this.A00;
        if (!hashMap.isEmpty()) {
            Log.d("FilterManager/getFiles/downloadedFiles has value");
        } else {
            C160627o1 A02 = A02();
            if (A02 == null) {
                Log.d("FilterManager/getFiles/localIdhash is null");
            } else {
                Log.d("FilterManager/getFiles/localIdhash is not null");
                File A0A = AnonymousClass002.A0A(this.A08.A00.getFilesDir(), AnonymousClass000.A0T("downloadable/filter_", A02.A01()));
                if (!A0A.exists() || (list = A0A.list()) == null) {
                    A06();
                } else {
                    String absolutePath = A0A.getAbsolutePath();
                    for (String str : list) {
                        hashMap.put(str, new File(absolutePath, str));
                    }
                }
            }
        }
        return hashMap;
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0091 A[SYNTHETIC, Splitter:B:42:0x0091] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void A0G(X.C184318rb r6, int r7) {
        /*
            r5 = this;
            r4 = r5
            monitor-enter(r4)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x00a5 }
            java.lang.String r0 = "FilterManager/getFilesAsync/preparing filter files with urgency = "
            X.C18260x0.A0w(r0, r1, r7)     // Catch:{ all -> 0x00a5 }
            r0 = -1
            int r3 = r5.A01(r0)     // Catch:{ all -> 0x00a3 }
            r1 = 5
            r2 = 1
            if (r3 == 0) goto L_0x0051
            if (r3 == r2) goto L_0x0036
            r0 = 2
            if (r3 == r0) goto L_0x0051
            r0 = 3
            if (r3 == r0) goto L_0x0036
            r0 = 4
            if (r3 == r0) goto L_0x0051
            if (r3 == r1) goto L_0x008f
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x00a3 }
            java.lang.String r0 = "FilterManager/getFilesAsync/Unexpected state "
            r1.append(r0)     // Catch:{ all -> 0x00a3 }
            java.util.HashMap r0 = X.C160827oN.A0J     // Catch:{ all -> 0x00a3 }
            java.lang.Object r0 = X.C18290x4.A0j(r0, r3)     // Catch:{ all -> 0x00a3 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x00a3 }
            X.C18260x0.A1K(r1, r0)     // Catch:{ all -> 0x00a3 }
            goto L_0x0085
        L_0x0036:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x00a3 }
            java.lang.String r0 = "FilterManager/getFilesAsync/State is "
            r1.append(r0)     // Catch:{ all -> 0x00a3 }
            java.util.HashMap r0 = X.C160827oN.A0J     // Catch:{ all -> 0x00a3 }
            java.lang.Object r0 = X.C18290x4.A0j(r0, r3)     // Catch:{ all -> 0x00a3 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x00a3 }
            X.C18260x0.A1J(r1, r0)     // Catch:{ all -> 0x00a3 }
            if (r6 == 0) goto L_0x009f
            r0 = -1
            r5.A0A(r6, r0)     // Catch:{ all -> 0x00a1 }
            goto L_0x009f
        L_0x0051:
            boolean r0 = r5.A0H()     // Catch:{ all -> 0x00a3 }
            if (r0 != 0) goto L_0x008b
            if (r7 != 0) goto L_0x006e
            X.33p r1 = r5.A0A     // Catch:{ all -> 0x00a3 }
            X.1ip r0 = r5.A06     // Catch:{ all -> 0x00a3 }
            int r0 = r0.A08(r2)     // Catch:{ all -> 0x00a3 }
            int r0 = X.C380425g.A00(r1, r0)     // Catch:{ all -> 0x00a3 }
            r0 = r0 & 1
            if (r0 == 0) goto L_0x0080
            java.lang.String r0 = "CategoryManager/fetchCategoryFiles/Fetch is network safe."
            com.whatsapp.util.Log.d((java.lang.String) r0)     // Catch:{ all -> 0x00a3 }
        L_0x006e:
            java.lang.String r0 = "FilterManager/getFilesAsync/No local info, will call manifest."
            com.whatsapp.util.Log.d((java.lang.String) r0)     // Catch:{ all -> 0x00a3 }
            r0 = -1
            r5.A09(r2, r0)     // Catch:{ all -> 0x00a1 }
            if (r6 == 0) goto L_0x007c
            r5.A0A(r6, r0)     // Catch:{ all -> 0x00a1 }
        L_0x007c:
            r5.A08(r7, r0)     // Catch:{ all -> 0x00a3 }
            goto L_0x009f
        L_0x0080:
            java.lang.String r0 = "CategoryManager/fetchCategoryFiles/Fetch is NOT network safe."
            com.whatsapp.util.Log.d((java.lang.String) r0)     // Catch:{ all -> 0x00a3 }
        L_0x0085:
            if (r6 == 0) goto L_0x009f
            r6.BRy()     // Catch:{ all -> 0x00a3 }
            goto L_0x009f
        L_0x008b:
            r0 = -1
            r5.A09(r1, r0)     // Catch:{ all -> 0x00a1 }
        L_0x008f:
            if (r6 == 0) goto L_0x009f
            boolean r0 = r5.A0H()     // Catch:{ all -> 0x00a3 }
            X.C626936e.A0C(r0)     // Catch:{ all -> 0x00a3 }
            java.util.HashMap r0 = r5.A0F()     // Catch:{ all -> 0x00a3 }
            r6.BZS(r0)     // Catch:{ all -> 0x00a3 }
        L_0x009f:
            monitor-exit(r4)
            return
        L_0x00a1:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x00a3 }
        L_0x00a3:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x00a5 }
        L_0x00a5:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C133846i2.A0G(X.8rb, int):void");
    }

    public synchronized boolean A0H() {
        return !A0F().isEmpty();
    }

    public C133846i2(C55682qk r2, C56492s4 r3, C29441ip r4, C56612sH r5, C54292oU r6, C57162tC r7, AnonymousClass33p r8, C159047l0 r9, AnonymousClass1VX r10, AnonymousClass4FV r11, AnonymousClass33K r12, C49912hI r13, C55132pq r14, AnonymousClass4FS r15) {
        super(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15);
    }
}
