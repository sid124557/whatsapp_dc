package X;

import android.os.Build;
import android.text.TextUtils;
import com.whatsapp.Me;
import java.util.Date;

/* renamed from: X.5XU  reason: invalid class name */
public class AnonymousClass5XU {
    public Date A00;
    public boolean A01;
    public final C56972sr A02;
    public final AnonymousClass33p A03;

    public static boolean A00() {
        if (!"chromium".equals(Build.MANUFACTURER) || !"chromium".equals(Build.BRAND)) {
            return false;
        }
        return true;
    }

    public Date A01() {
        C183538qC r6 = this.A03.A01;
        long j = C18300x5.A0B(r6).getLong("software_forced_expiration", 0);
        if (j <= 0) {
            j = C18300x5.A0B(r6).getLong("client_expiration_time", 0);
            if (j <= 0) {
                C56972sr r0 = this.A02;
                r0.A0P();
                Me me = r0.A00;
                int i = -1;
                if (me != null) {
                    try {
                        if (!TextUtils.isEmpty(me.number)) {
                            i = (int) (Long.valueOf(me.number).longValue() % 14);
                        }
                    } catch (NumberFormatException e) {
                        StringBuilder A0o = AnonymousClass001.A0o();
                        A0o.append("number format not valid: ");
                        C18260x0.A14(me.number, A0o, e);
                    }
                }
                Date date = new Date(1706416694000L);
                StringBuilder A0o2 = AnonymousClass001.A0o();
                A0o2.append("software/expiration/date ");
                A0o2.append(date);
                C18260x0.A0w(" bucket: ", A0o2, i);
                return date;
            }
        }
        return new Date(j);
    }

    public boolean A02() {
        if (this.A01) {
            return true;
        }
        boolean after = new Date().after(A01());
        this.A01 = after;
        return after;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x001a, code lost:
        r3 = r4.after(new java.util.Date(A01().getTime() + 31536000000L));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A03() {
        /*
            r5 = this;
            java.util.Date r0 = r5.A00
            r3 = 1
            if (r0 != 0) goto L_0x0035
            java.util.Date r4 = new java.util.Date
            r4.<init>()
            r1 = 1702355894000(0x18c5c517ef0, double:8.41075564221E-312)
            java.util.Date r0 = new java.util.Date
            r0.<init>(r1)
            boolean r0 = r4.before(r0)
            if (r0 != 0) goto L_0x0033
            java.util.Date r0 = r5.A01()
            long r2 = r0.getTime()
            r0 = 31536000000(0x757b12c00, double:1.55808542072E-313)
            long r2 = r2 + r0
            java.util.Date r0 = new java.util.Date
            r0.<init>(r2)
            boolean r3 = r4.after(r0)
            if (r3 == 0) goto L_0x0035
        L_0x0033:
            r5.A00 = r4
        L_0x0035:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5XU.A03():boolean");
    }

    public AnonymousClass5XU(C56972sr r1, AnonymousClass33p r2) {
        this.A02 = r1;
        this.A03 = r2;
    }
}
