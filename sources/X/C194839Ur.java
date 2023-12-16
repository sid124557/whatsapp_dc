package X;

import org.json.JSONObject;

/* renamed from: X.9Ur  reason: invalid class name and case insensitive filesystem */
public class C194839Ur {
    public final int A00;
    public final int A01;
    public final long A02;
    public final long A03;
    public final boolean A04;

    public C194839Ur(String str) {
        JSONObject A1H = AnonymousClass0x9.A1H(str);
        this.A03 = A1H.getLong("offer_id");
        this.A04 = A1H.getBoolean("is_eligible");
        this.A00 = A1H.getInt("pending_count");
        this.A01 = A1H.getInt("redeemed_count");
        this.A02 = A1H.getLong("last_sync_time_ms");
    }

    public C194839Ur(AnonymousClass36K r3, long j, long j2) {
        this.A03 = j;
        this.A01 = r3.A0a("redeemed_count");
        this.A00 = r3.A0a("reserved_count");
        this.A04 = "1".equalsIgnoreCase(r3.A0q("is_eligible"));
        this.A02 = j2;
    }
}
