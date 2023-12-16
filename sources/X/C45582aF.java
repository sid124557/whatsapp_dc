package X;

import android.content.SharedPreferences;
import java.util.UUID;

/* renamed from: X.2aF  reason: invalid class name and case insensitive filesystem */
public final class C45582aF {
    public final long A00;
    public final C56612sH A01;
    public final C45152Yw A02;

    public final int A00() {
        long A0H = this.A01.A0H();
        C45152Yw r7 = this.A02;
        int i = ((A0H - AnonymousClass0x2.A0A(r7.A00(), "last_interaction_timestamp")) > this.A00 ? 1 : ((A0H - AnonymousClass0x2.A0A(r7.A00(), "last_interaction_timestamp")) == this.A00 ? 0 : -1));
        SharedPreferences A002 = r7.A00();
        if (i <= 0) {
            C18270x1.A0o(A002, "last_interaction_timestamp", A0H);
            return C18310x6.A03(r7.A00(), "session_id");
        }
        SharedPreferences.Editor edit = A002.edit();
        edit.putInt("session_id", -1);
        edit.putLong("last_interaction_timestamp", -1);
        edit.putLong("session_start_timestamp", -1);
        edit.putInt("bit_array_session_sequence", 0);
        edit.putInt("cumulative_bits", 0);
        edit.apply();
        int leastSignificantBits = (int) UUID.randomUUID().getLeastSignificantBits();
        C18270x1.A0h(r7.A00().edit(), "session_id", leastSignificantBits);
        C18270x1.A0o(r7.A00(), "session_start_timestamp", A0H);
        C18270x1.A0o(r7.A00(), "last_interaction_timestamp", A0H);
        return leastSignificantBits;
    }

    public C45582aF(C56612sH r3, AnonymousClass1VX r4, C45152Yw r5) {
        C18260x0.A0V(r4, r3, r5);
        this.A01 = r3;
        this.A02 = r5;
        this.A00 = C56952sp.A06(r4, 3860);
    }
}
