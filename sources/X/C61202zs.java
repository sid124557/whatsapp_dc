package X;

import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.2zs  reason: invalid class name and case insensitive filesystem */
public class C61202zs {
    public final C104635Rt A00;
    public final AnonymousClass5RT A01;
    public final AnonymousClass5RT A02;
    public final String A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C61202zs r5 = (C61202zs) obj;
            if (!AnonymousClass75J.A00(this.A02, r5.A02) || !AnonymousClass75J.A00(this.A00, r5.A00) || !AnonymousClass75J.A00(this.A01, r5.A01)) {
                return false;
            }
        }
        return true;
    }

    public C61202zs(C104635Rt r2, AnonymousClass5RT r3, AnonymousClass5RT r4, String str) {
        this.A02 = r3;
        this.A00 = r2;
        this.A01 = r4;
        if (str.isEmpty()) {
            this.A03 = "onDemand";
        } else {
            this.A03 = str;
        }
    }

    public static C61202zs A00(JSONObject jSONObject) {
        AnonymousClass5RT r3;
        long[] jArr;
        Long l;
        C104635Rt r2;
        AnonymousClass5RT r4 = null;
        if (jSONObject.has("start")) {
            r3 = new AnonymousClass5RT(jSONObject.getLong("start"));
        } else {
            r3 = null;
        }
        if (jSONObject.has("repeat")) {
            JSONArray jSONArray = jSONObject.getJSONArray("repeat");
            jArr = new long[jSONArray.length()];
            for (int i = 0; i < jSONArray.length(); i++) {
                jArr[i] = jSONArray.getLong(i);
            }
        } else {
            jArr = null;
        }
        if (jSONObject.has("static")) {
            l = Long.valueOf(jSONObject.getLong("static"));
        } else {
            l = null;
        }
        if (jArr == null || l == null) {
            r2 = null;
        } else {
            r2 = new C104635Rt(jArr, l.longValue());
        }
        if (jSONObject.has("end")) {
            r4 = new AnonymousClass5RT(jSONObject.getLong("end"));
        }
        return new C61202zs(r2, r3, r4, "onDemand");
    }

    public JSONObject A01() {
        JSONObject A1G = AnonymousClass0x9.A1G();
        AnonymousClass5RT r0 = this.A02;
        if (r0 != null) {
            A1G.put("start", r0.A00);
        }
        C104635Rt r7 = this.A00;
        if (r7 != null) {
            long[] jArr = r7.A01;
            if (jArr != null) {
                JSONArray A1F = AnonymousClass0x9.A1F();
                for (long valueOf : jArr) {
                    A1F.put(Long.valueOf(valueOf));
                }
                A1G.put("repeat", A1F);
            }
            A1G.put("static", r7.A00);
        }
        AnonymousClass5RT r02 = this.A01;
        if (r02 != null) {
            A1G.put("end", r02.A00);
        }
        return A1G;
    }

    public int hashCode() {
        Object[] A1X = AnonymousClass0x9.A1X();
        A1X[0] = this.A02;
        A1X[1] = this.A00;
        return C18310x6.A08(this.A01, A1X, 2);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("UserNoticeContentTiming{start=");
        A0o.append(this.A02);
        A0o.append(", duration=");
        A0o.append(this.A00);
        A0o.append(", end=");
        return AnonymousClass000.A0Q(this.A01, A0o);
    }
}
