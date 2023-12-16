package X;

import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.7av  reason: invalid class name and case insensitive filesystem */
public class C153247av {
    public final long A00;
    public final long A01;
    public final TimeUnit A02;

    public boolean A01(long j, TimeUnit timeUnit) {
        if (j < 0) {
            return false;
        }
        long j2 = this.A01;
        TimeUnit timeUnit2 = this.A02;
        return (j >= timeUnit.convert(j2, timeUnit2) && j <= timeUnit.convert(this.A00, timeUnit2)) || (timeUnit.convert(this.A00, timeUnit2) < 0 && j >= timeUnit.convert(j2, timeUnit2));
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C153247av r10 = (C153247av) obj;
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            long j = this.A01;
            TimeUnit timeUnit2 = this.A02;
            long convert = timeUnit.convert(j, timeUnit2);
            long j2 = r10.A01;
            TimeUnit timeUnit3 = r10.A02;
            if (!(convert == timeUnit.convert(j2, timeUnit3) && timeUnit.convert(this.A00, timeUnit2) == timeUnit.convert(r10.A00, timeUnit3))) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0010, code lost:
        if (r5 < r7) goto L_0x0012;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C153247av(java.util.concurrent.TimeUnit r4, long r5, long r7) {
        /*
            r3 = this;
            r3.<init>()
            r1 = 0
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0012
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0012
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            r2 = 0
            if (r0 >= 0) goto L_0x0013
        L_0x0012:
            r2 = 1
        L_0x0013:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "startTime: "
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = " endTime: "
            java.lang.String r0 = X.AnonymousClass000.A0Z(r0, r1, r7)
            if (r2 == 0) goto L_0x002e
            r3.A01 = r5
            r3.A00 = r7
            r3.A02 = r4
            return
        L_0x002e:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass6C7.A0U(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C153247av.<init>(java.util.concurrent.TimeUnit, long, long):void");
    }

    public JSONObject A00() {
        String str;
        JSONObject A1G = AnonymousClass0x9.A1G();
        A1G.put("mStartTime", this.A01);
        A1G.put("mEndTime", this.A00);
        switch (AnonymousClass6CA.A04(this.A02, C1455576i.A00)) {
            case 1:
                str = "DAYS";
                break;
            case 2:
                str = "HOURS";
                break;
            case 3:
                str = "MINUTES";
                break;
            case 4:
                str = "SECONDS";
                break;
            case 5:
                str = "NANOSECONDS";
                break;
            case 6:
                str = "MICROSECONDS";
                break;
            case 7:
                str = "MILLISECONDS";
                break;
            default:
                str = "";
                break;
        }
        A1G.put("mTimeUnit", str);
        return A1G;
    }

    public int hashCode() {
        Object[] A1X = AnonymousClass0x9.A1X();
        C18280x3.A1S(A1X, this.A01);
        AnonymousClass001.A1Q(A1X, this.A00);
        return C18310x6.A08(this.A02, A1X, 2);
    }

    public String toString() {
        try {
            return A00().toString();
        } catch (JSONException unused) {
            return "";
        }
    }
}
