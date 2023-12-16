package X;

import org.json.JSONObject;

/* renamed from: X.6Nh  reason: invalid class name and case insensitive filesystem */
public final class C126296Nh extends C150297Qb implements C180558lG {
    public final long A00;
    public final boolean A01;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C126296Nh.class == obj.getClass()) {
            C126296Nh r8 = (C126296Nh) obj;
            return this.A00 == r8.A00 && this.A01 == r8.A01;
        }
        return false;
    }

    public int hashCode() {
        return AnonymousClass0x2.A02(this.A00) + (this.A01 ? 1 : 0);
    }

    public C126296Nh(long j, boolean z) {
        this.A00 = j;
        this.A01 = z;
    }

    public JSONObject Bqp() {
        JSONObject A1G = AnonymousClass0x9.A1G();
        A1G.put("stale_age_s", this.A00);
        A1G.put("is_itemized", this.A01);
        return A1G;
    }
}
