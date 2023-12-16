package X;

import android.content.ContentValues;
import android.database.Cursor;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.whatsapp.jid.DeviceJid;

/* renamed from: X.2qw  reason: invalid class name and case insensitive filesystem */
public class C55802qw {
    public final AnonymousClass3XB A00 = AnonymousClass3XB.A00();
    public final C44762Xj A01;
    public final AnonymousClass1RE A02;
    public final C72173dI A03;

    public final void A01(AnonymousClass4GK r3, DeviceJid deviceJid) {
        if (((AnonymousClass3H0) r3).A03.A00.inTransaction()) {
            r3.B25(new C71343bx(this, 22, deviceJid));
        } else {
            A03(deviceJid);
        }
    }

    public C55802qw(C44762Xj r2, AnonymousClass1RE r3, AnonymousClass4FS r4) {
        this.A02 = r3;
        this.A01 = r2;
        this.A03 = C72173dI.A00(r4);
    }

    public C54082o9 A00() {
        Cursor A0E;
        long j;
        C51442jp r4;
        C626936e.A00();
        AnonymousClass4GK A0B = this.A02.get();
        try {
            A0E = ((AnonymousClass3H0) A0B).A03.A0E("SELECT _id, device_id, sync_type, last_processed_msg_row_id, oldest_msg_row_id, oldest_message_to_sync_row_id, sent_msgs_count, chunk_order, sent_bytes, last_chunk_timestamp, status, peer_msg_row_id, session_id, md_reg_attempt_id, size_limit_bytes FROM msg_history_sync WHERE status=1 OR status=3 ORDER BY sync_type ASC, chunk_order ASC, last_chunk_timestamp ASC LIMIT 1", "MessageHistorySyncTable.SELECT_SYNC_TO_PROCESS", (String[]) null);
            if (!A0E.moveToNext()) {
                A0E.close();
                A0B.close();
                return null;
            }
            DeviceJid nullable = DeviceJid.getNullable(AnonymousClass0x2.A0Z(A0E, "device_id"));
            if (nullable == null) {
                A0E.close();
                A0B.close();
                return null;
            }
            int A04 = AnonymousClass0x2.A04(A0E, "sync_type");
            long A012 = C18270x1.A01(A0E);
            long A0C = AnonymousClass0x2.A0C(A0E, "last_processed_msg_row_id");
            long A0C2 = AnonymousClass0x2.A0C(A0E, "oldest_msg_row_id");
            long A0C3 = AnonymousClass0x2.A0C(A0E, "oldest_message_to_sync_row_id");
            long A0C4 = AnonymousClass0x2.A0C(A0E, "sent_msgs_count");
            int A042 = AnonymousClass0x2.A04(A0E, "chunk_order");
            long A043 = (long) AnonymousClass0x2.A04(A0E, "sent_bytes");
            long A044 = (long) AnonymousClass0x2.A04(A0E, "last_chunk_timestamp");
            int A045 = AnonymousClass0x2.A04(A0E, "status");
            long A0C5 = AnonymousClass0x2.A0C(A0E, "peer_msg_row_id");
            String A0Z = AnonymousClass0x2.A0Z(A0E, "session_id");
            String A0Z2 = AnonymousClass0x2.A0Z(A0E, "md_reg_attempt_id");
            int columnIndexOrThrow = A0E.getColumnIndexOrThrow("size_limit_bytes");
            if (!A0E.isNull(columnIndexOrThrow)) {
                j = A0E.getLong(columnIndexOrThrow);
            } else {
                C44762Xj r42 = this.A01;
                j = -1;
                if (A04 == 2) {
                    r42.A01.A0N(2645);
                } else if (A04 != 3) {
                    C18260x0.A0z("HistorySyncUtil/getSizeLimitBytes unexpected sync type ", AnonymousClass001.A0o(), A04);
                } else {
                    j = ((long) r42.A00.A03(C66663Mh.A1J)) * SearchActionVerificationClientService.MS_TO_NS;
                }
            }
            if (A0Z == null || A0Z2 == null) {
                r4 = null;
            } else {
                r4 = new C51442jp(A0Z, A0Z2);
            }
            C51442jp r16 = r4;
            C54082o9 r15 = new C54082o9(r16, nullable, A04, A042, A045, A012, A0C, A0C2, A0C3, A0C4, A043, A044, A0C5, j);
            A0E.close();
            A0B.close();
            return r15;
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

    public void A02(C54082o9 r8) {
        C626936e.A00();
        C85284Fq A0C = this.A02.A0C();
        try {
            ContentValues A06 = AnonymousClass0x9.A06();
            DeviceJid deviceJid = r8.A0D;
            AnonymousClass0x2.A0n(A06, deviceJid, "device_id");
            C18270x1.A0b(A06, "sync_type", r8.A02);
            C18270x1.A0c(A06, "last_processed_msg_row_id", r8.A04);
            C18270x1.A0c(A06, "oldest_msg_row_id", r8.A0A);
            C18270x1.A0c(A06, "sent_msgs_count", r8.A08);
            C18270x1.A0b(A06, "chunk_order", r8.A00);
            C18270x1.A0c(A06, "sent_bytes", r8.A07);
            C18270x1.A0c(A06, "last_chunk_timestamp", r8.A03);
            C18270x1.A0b(A06, "status", r8.A01);
            C18270x1.A0c(A06, "peer_msg_row_id", r8.A05);
            C18270x1.A0c(A06, "oldest_message_to_sync_row_id", r8.A0B);
            C51442jp r6 = r8.A0C;
            if (r6 != null) {
                A06.put("session_id", r6.A01);
                A06.put("md_reg_attempt_id", r6.A00);
            } else {
                A06.putNull("session_id");
                A06.putNull("md_reg_attempt_id");
            }
            AnonymousClass3H0.A02(A06, A0C, "size_limit_bytes", r8.A09).A08("msg_history_sync", "MessageHistorySyncTable.INSERT_SYNC_STATE", A06);
            A01(A0C, deviceJid);
            A0C.close();
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }

    public final void A03(DeviceJid deviceJid) {
        Cursor A0E;
        C626936e.A00();
        AnonymousClass4GK A0B = this.A02.get();
        try {
            C56862sg r5 = ((AnonymousClass3H0) A0B).A03;
            String[] A1Z = AnonymousClass0x9.A1Z();
            boolean z = false;
            A1Z[0] = deviceJid.getRawString();
            A1Z[1] = String.valueOf(1);
            A0E = r5.A0E("SELECT device_id, status FROM msg_history_sync WHERE device_id=? AND status=? LIMIT 1", "MessageHistorySyncTable.SELECT_SYNC_STATUS_FOR_DEVICE_ID", A1Z);
            if (A0E.getCount() > 0) {
                z = true;
            }
            A0E.close();
            A0B.close();
            this.A03.execute(new C117665sI(this, deviceJid, 27, z));
            return;
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

    public void A04(DeviceJid deviceJid, int i) {
        C626936e.A00();
        C85284Fq A0C = this.A02.A0C();
        try {
            C56862sg r3 = ((AnonymousClass3H0) A0C).A03;
            String[] A1Z = AnonymousClass0x9.A1Z();
            C18280x3.A0v(deviceJid, A1Z);
            C18270x1.A1P(A1Z, i);
            r3.A0I("DELETE FROM msg_history_sync WHERE device_id=? AND sync_type=?", "MessageHistorySyncTable.DELETE_SYNC_STATE_BY_DEVICE_AND_TYPE", A1Z);
            A0C.close();
            A03(deviceJid);
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }
}
