package X;

import org.json.JSONObject;

/* renamed from: X.6Nj  reason: invalid class name and case insensitive filesystem */
public final class C126316Nj extends C150297Qb implements C180558lG {
    public final long A00;
    public final long A01;
    public final long A02;
    public final boolean A03;
    public final boolean A04;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C126316Nj.class == obj.getClass()) {
            C126316Nj r8 = (C126316Nj) obj;
            return this.A00 == r8.A00 && this.A01 == r8.A01 && this.A02 == r8.A02 && this.A03 == r8.A03 && this.A04 == r8.A04;
        }
        return false;
    }

    public static C126316Nj A00(JSONObject jSONObject) {
        C151107Tl r9 = new C151107Tl();
        long optLong = jSONObject.optLong("max_size", 0);
        long optLong2 = jSONObject.optLong("max_size_low_space_bytes", 0);
        long optLong3 = jSONObject.optLong("max_size_very_low_space_bytes", 0);
        if (optLong <= 0 && optLong2 <= 0 && optLong3 <= 0) {
            return null;
        }
        r9.A00 = optLong;
        r9.A01 = optLong2;
        r9.A02 = optLong3;
        r9.A03 = jSONObject.optBoolean("delete_only_on_init", false);
        r9.A04 = jSONObject.optBoolean("is_itemized", false);
        return r9.A00();
    }

    public int hashCode() {
        long j = this.A00;
        return ((AnonymousClass6C7.A03(AnonymousClass6C7.A03(((int) (j ^ (j >>> 32))) * 31, this.A01), this.A02) + (this.A03 ? 1 : 0)) * 31) + (this.A04 ? 1 : 0);
    }

    public C126316Nj(long j, long j2, long j3, boolean z, boolean z2) {
        this.A00 = j;
        this.A01 = j2;
        this.A02 = j3;
        this.A03 = z;
        this.A04 = z2;
    }

    public JSONObject Bqp() {
        JSONObject A1G = AnonymousClass0x9.A1G();
        A1G.put("max_size", this.A00);
        A1G.put("max_size_low_space_bytes", this.A01);
        A1G.put("max_size_very_low_space_bytes", this.A02);
        A1G.put("delete_only_on_init", this.A03);
        A1G.put("is_itemized", this.A04);
        return A1G;
    }
}
