package X;

import java.util.Collections;
import java.util.Map;
import java.util.Set;

/* renamed from: X.0Dj  reason: invalid class name and case insensitive filesystem */
public class C02030Dj extends AnonymousClass0UH {
    public Map A00;
    public final C05580Ub A01;
    public final C06320Xc A02;

    public synchronized Set A02() {
        Set set;
        Map map = this.A00;
        if (map != null) {
            set = map.keySet();
        } else {
            set = Collections.emptySet();
        }
        return set;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C02030Dj(X.C05580Ub r11, X.C06320Xc r12) {
        /*
            r10 = this;
            X.0Y7 r0 = r11.A09
            java.lang.String r2 = r0.A0G
            long r3 = r11.A05
            org.json.JSONObject r1 = r11.A0C
            r7 = 0
            if (r1 != 0) goto L_0x0018
            r9 = 0
        L_0x000c:
            r5 = -1
            r1 = r10
            r8 = r7
            r1.<init>(r2, r3, r5, r7, r8, r9)
            r10.A02 = r12
            r10.A01 = r11
            return
        L_0x0018:
            java.lang.String r0 = "encryptedBackupEnabled"
            boolean r9 = r1.optBoolean(r0, r7)
            goto L_0x000c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C02030Dj.<init>(X.0Ub, X.0Xc):void");
    }

    public boolean A03() {
        return this.A02.A09(this);
    }
}
