package X;

import android.database.Cursor;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.2gd  reason: invalid class name and case insensitive filesystem */
public class C49502gd {
    public final C56612sH A00;
    public final C56922sm A01;
    public final C623334p A02;
    public final C72303dV A03;

    public C49502gd(C56612sH r1, C56922sm r2, C623334p r3, C72303dV r4) {
        this.A00 = r1;
        this.A02 = r3;
        this.A01 = r2;
        this.A03 = r4;
    }

    public List A00(AnonymousClass2z0 r19) {
        Cursor A0E;
        ArrayList A0s = AnonymousClass001.A0s();
        String[] A1a = AnonymousClass0x9.A1a();
        AnonymousClass2z0 r2 = r19;
        C56922sm.A01(this.A01, AnonymousClass2z0.A01(r2), A1a);
        C18270x1.A1P(A1a, r2.A02 ? 1 : 0);
        A1a[2] = r2.A01;
        AnonymousClass4GK A032 = this.A03.get();
        try {
            A0E = ((AnonymousClass3H0) A032).A03.A0E("SELECT receipt_device_jid_row_id, receipt_recipient_jid_row_id, status, timestamp FROM receipt_orphaned WHERE chat_row_id = ? AND from_me = ? AND key_id = ? ORDER BY _id ASC", "GET_ORPHANED_RECEIPTS_SQL", A1a);
            int columnIndexOrThrow = A0E.getColumnIndexOrThrow("receipt_device_jid_row_id");
            int columnIndexOrThrow2 = A0E.getColumnIndexOrThrow("receipt_recipient_jid_row_id");
            int columnIndexOrThrow3 = A0E.getColumnIndexOrThrow("status");
            int columnIndexOrThrow4 = A0E.getColumnIndexOrThrow("timestamp");
            while (A0E.moveToNext()) {
                C623334p r10 = this.A02;
                DeviceJid deviceJid = (DeviceJid) r10.A0B(DeviceJid.class, A0E.getLong(columnIndexOrThrow));
                if (deviceJid != null) {
                    A0s.add(new C52872mB(deviceJid, C623334p.A02(r10, UserJid.class, A0E.getLong(columnIndexOrThrow2)), A0E.getInt(columnIndexOrThrow3), A0E.getLong(columnIndexOrThrow4)));
                }
            }
            A0E.close();
            A032.close();
            return A0s;
        } catch (Throwable th) {
            try {
                A032.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    public void A01(AnonymousClass2z0 r7) {
        String[] A1a = AnonymousClass0x9.A1a();
        C56922sm.A01(this.A01, AnonymousClass2z0.A01(r7), A1a);
        C18270x1.A1P(A1a, r7.A02 ? 1 : 0);
        A1a[2] = r7.A01;
        C85284Fq A04 = this.A03.A04();
        try {
            ((AnonymousClass3H0) A04).A03.A07("receipt_orphaned", "chat_row_id = ? AND from_me = ? AND key_id = ?", "DELETE_ORPHANED_RECEIPTS_SQL", A1a);
            C18260x0.A1R(AnonymousClass001.A0o(), "orphanedreceiptstore/deleteOrphanedReceipts/key:", r7);
            A04.close();
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }
}
