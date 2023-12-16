package X;

import android.database.Cursor;

/* renamed from: X.2ZK  reason: invalid class name */
public class AnonymousClass2ZK {
    public final C56612sH A00;
    public final C46392bY A01;
    public final AnonymousClass1RJ A02;

    public AnonymousClass2JM A00(C54422oh r7) {
        Cursor A0E;
        AnonymousClass4GK A0B = this.A02.get();
        try {
            A0E = ((AnonymousClass3H0) A0B).A03.A0E("SELECT record  FROM fast_ratchet_sender_keys WHERE group_id = ? AND sender_id = ? AND sender_type = ? AND device_id = ?", "SignalFastRatchetSenderKeyStore/getFastRatchetSenderKey", r7.A01());
            if (!A0E.moveToNext()) {
                A0E.close();
                A0B.close();
                return null;
            }
            AnonymousClass2JM r0 = new AnonymousClass2JM(C18280x3.A1Z(A0E, "record"), C56612sH.A00(this.A00));
            A0E.close();
            A0B.close();
            return r0;
        } catch (Throwable th) {
            try {
                A0B.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    public AnonymousClass2ZK(C56612sH r1, C46392bY r2, AnonymousClass1RJ r3) {
        this.A00 = r1;
        this.A02 = r3;
        this.A01 = r2;
    }
}
