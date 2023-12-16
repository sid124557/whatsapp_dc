package X;

import android.content.SharedPreferences;

/* renamed from: X.2ZJ  reason: invalid class name */
public class AnonymousClass2ZJ {
    public C72423dh A00;
    public final AnonymousClass31B A01;
    public final AnonymousClass31C A02;

    public void A00() {
        AnonymousClass31B r3 = this.A01;
        if (r3.A0B.A0Y(C58422vE.A02, 1689)) {
            SharedPreferences A012 = C60152y5.A01(r3);
            if (A012.getInt("remaining_auth_key_rotation_attempts", 0) > 0) {
                long A0H = r3.A06.A0H();
                if (A0H - A012.getLong("last_succeeded_auth_key_rotation_attempt", -1) >= 86400000) {
                    long j = A012.getLong("last_failed_auth_key_rotation_attempt", -1);
                    if (j == -1 || A0H - j > 1800000) {
                        if (this.A00 == null) {
                            this.A00 = C72423dh.A00();
                        }
                        AnonymousClass31C r7 = this.A02;
                        String A03 = r7.A03();
                        byte[] bArr = this.A00.A02.A01;
                        C35351wj r5 = new C35351wj(A03, 4);
                        C56052rL A002 = C56052rL.A00();
                        C56052rL.A0D(A002, "xmlns", "w:auth:key");
                        C56052rL A04 = C56052rL.A04("key");
                        C626836d.A0H(bArr, 32, 32);
                        A04.A01 = bArr;
                        r7.A0K(new AnonymousClass3TH(r3, this, this.A00), C41032Ir.A03(A04, A002, r5), A03, 331, 32000);
                    }
                }
            }
        }
    }

    public AnonymousClass2ZJ(AnonymousClass31B r1, AnonymousClass31C r2) {
        this.A01 = r1;
        this.A02 = r2;
    }
}
