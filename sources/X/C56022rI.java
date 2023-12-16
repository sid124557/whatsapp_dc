package X;

import android.content.SharedPreferences;

/* renamed from: X.2rI  reason: invalid class name and case insensitive filesystem */
public class C56022rI {
    public final C55682qk A00;
    public final C60152y5 A01;
    public final C183538qC A02 = C72333dY.A05(this, 28);

    public AnonymousClass2SN A00() {
        SharedPreferences A0B = C18300x5.A0B(this.A02);
        String string = A0B.getString("/export/enc/active/owner", (String) null);
        String string2 = A0B.getString("/export/enc/active/version", (String) null);
        String string3 = A0B.getString("/export/enc/active/account_hash", (String) null);
        String string4 = A0B.getString("/export/enc/active/server_salt", (String) null);
        long A0B2 = AnonymousClass0x2.A0B(A0B, "/export/enc/active/last_fetch_time");
        String string5 = A0B.getString("/export/enc/active/seed", (String) null);
        if (!(string == null || string2 == null || string3 == null || string4 == null || string5 == null)) {
            try {
                return new AnonymousClass2SN(AnonymousClass32Y.A09(string), string2, string3, string4, string5, A0B2);
            } catch (AnonymousClass24P e) {
                this.A00.A09("xpm-export-preferences-active", AnonymousClass000.A0V("invalid jid: ", string, AnonymousClass001.A0o()), e);
            }
        }
        return null;
    }

    public AnonymousClass2SN A01() {
        SharedPreferences A0B = C18300x5.A0B(this.A02);
        String string = A0B.getString("/export/enc/prefetched/owner", (String) null);
        String string2 = A0B.getString("/export/enc/prefetched/version", (String) null);
        String string3 = A0B.getString("/export/enc/prefetched/account_hash", (String) null);
        String string4 = A0B.getString("/export/enc/prefetched/server_salt", (String) null);
        long A0B2 = AnonymousClass0x2.A0B(A0B, "/export/enc/prefetched/last_fetch_time");
        String string5 = A0B.getString("/export/enc/prefetched/seed", (String) null);
        if (!(string == null || string2 == null || string3 == null || string4 == null || string5 == null)) {
            try {
                return new AnonymousClass2SN(AnonymousClass32Y.A09(string), string2, string3, string4, string5, A0B2);
            } catch (AnonymousClass24P e) {
                this.A00.A09("xpm-export-preferences-prefetched", AnonymousClass000.A0V("invalid jid: ", string, AnonymousClass001.A0o()), e);
            }
        }
        return null;
    }

    public String A02() {
        C183538qC r3 = this.A02;
        String string = C18300x5.A0B(r3).getString("/export/logging/funnelId", (String) null);
        if (string != null) {
            return string;
        }
        String A0Y = C18280x3.A0Y();
        C18270x1.A0j(AnonymousClass0x2.A0E(r3), "/export/logging/funnelId", A0Y);
        return A0Y;
    }

    public void A03() {
        C18270x1.A0g(AnonymousClass0x2.A0E(this.A02), "/export/logging/funnelId");
    }

    public void A04() {
        C18270x1.A0g(AnonymousClass0x2.A0E(this.A02).remove("/export/enc/prefetched/owner").remove("/export/enc/prefetched/version").remove("/export/enc/prefetched/account_hash").remove("/export/enc/prefetched/server_salt").remove("/export/enc/prefetched/last_fetch_time"), "/export/enc/prefetched/seed");
    }

    public boolean A05() {
        return C18280x3.A1W(C18300x5.A0B(this.A02), "/export/usingDbForTransfer");
    }

    public C56022rI(C55682qk r2, C60152y5 r3) {
        this.A00 = r2;
        this.A01 = r3;
    }
}
