package X;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.7nS  reason: invalid class name and case insensitive filesystem */
public final class C160327nS {
    public final List A00;

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0063  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C185078t1 A00() {
        /*
            r8 = this;
            java.util.List r0 = r8.A00
            java.util.Iterator r7 = r0.iterator()
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0074
            java.lang.Object r5 = r7.next()
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0054
            r3 = r5
            X.8t1 r3 = (X.C185078t1) r3
            boolean r0 = r3 instanceof X.AnonymousClass8H6
            if (r0 == 0) goto L_0x006d
            r2 = r3
            X.8H6 r2 = (X.AnonymousClass8H6) r2
            org.json.JSONObject r1 = r2.A00
            if (r1 == 0) goto L_0x0065
            java.lang.String r0 = "summary"
            boolean r1 = r1.optBoolean(r0)
            r0 = 1
            if (r1 != r0) goto L_0x0065
            r6 = 0
        L_0x002e:
            java.lang.Object r4 = r7.next()
            r3 = r4
            X.8t1 r3 = (X.C185078t1) r3
            boolean r0 = r3 instanceof X.AnonymousClass8H6
            if (r0 == 0) goto L_0x005f
            r2 = r3
            X.8H6 r2 = (X.AnonymousClass8H6) r2
            org.json.JSONObject r1 = r2.A00
            if (r1 == 0) goto L_0x0057
            java.lang.String r0 = "summary"
            boolean r1 = r1.optBoolean(r0)
            r0 = 1
            if (r1 != r0) goto L_0x0057
            r0 = 0
        L_0x004a:
            if (r6 <= r0) goto L_0x004e
            r5 = r4
            r6 = r0
        L_0x004e:
            boolean r0 = r7.hasNext()
            if (r0 != 0) goto L_0x002e
        L_0x0054:
            X.8t1 r5 = (X.C185078t1) r5
            return r5
        L_0x0057:
            boolean r0 = r2.A00()
            if (r0 == 0) goto L_0x005f
            r0 = 1
            goto L_0x004a
        L_0x005f:
            boolean r0 = r3 instanceof X.C143956zl
            if (r0 == 0) goto L_0x004e
            r0 = 2
            goto L_0x004a
        L_0x0065:
            boolean r0 = r2.A00()
            if (r0 == 0) goto L_0x006d
            r6 = 1
            goto L_0x002e
        L_0x006d:
            boolean r0 = r3 instanceof X.C143956zl
            r6 = 3
            if (r0 == 0) goto L_0x002e
            r6 = 2
            goto L_0x002e
        L_0x0074:
            java.util.NoSuchElementException r0 = X.AnonymousClass6CA.A0c()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C160327nS.A00():X.8t1");
    }

    public String toString() {
        List list = this.A00;
        if (!list.isEmpty()) {
            String A0V = AnonymousClass000.A0V("Response errors: ", C73723fy.A07(",", "", "", "...", list, new AnonymousClass8YF(this), -1), AnonymousClass001.A0o());
            if (A0V == null) {
                return "";
            }
            return A0V;
        }
        return "";
    }

    public C160327nS(Throwable th, JSONArray jSONArray) {
        Throwable r1;
        ArrayList A0s = AnonymousClass001.A0s();
        this.A00 = A0s;
        if (th != null) {
            if (th instanceof C143956zl) {
                r1 = th;
            } else {
                r1 = new C135066k4("Unknown error", th);
            }
            A0s.add(r1);
        }
        if (jSONArray != null) {
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                List list = this.A00;
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                C162457s7.A0D(jSONObject);
                list.add(new AnonymousClass8H6(jSONObject));
            }
        }
        if (!C18310x6.A1X(this.A00)) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("MexErrorSummary was used but there are no errors. Failure and rawErrors should not both be null. Failure: ");
            A0o.append(th);
            throw AnonymousClass000.A0H(jSONArray, "  rawErrors: ", A0o);
        }
    }

    public C160327nS() {
        this((Throwable) null, (JSONArray) null);
    }
}
