package X;

import android.content.ContentValues;
import android.database.Cursor;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;

/* renamed from: X.2ge  reason: invalid class name and case insensitive filesystem */
public class C49512ge {
    public final C04840Qw A00 = new C04840Qw(250);
    public final C623334p A01;
    public final C72303dV A02;
    public final C56082rO A03;

    /* JADX INFO: finally extract failed */
    public AnonymousClass2W3 A00(long j) {
        Long valueOf;
        AnonymousClass2W3 r0;
        AnonymousClass2W3 r5;
        Cursor A0E;
        C04840Qw r7 = this.A00;
        synchronized (r7) {
            valueOf = Long.valueOf(j);
            r0 = (AnonymousClass2W3) r7.A04(valueOf);
        }
        if (r0 != null) {
            return r0;
        }
        C72303dV r02 = this.A02;
        AnonymousClass4GK A032 = r02.get();
        try {
            synchronized (r7) {
                r5 = new AnonymousClass2W3();
                AnonymousClass4GK A033 = r02.get();
                try {
                    A0E = ((AnonymousClass3H0) A033).A03.A0E("SELECT receipt_user_jid_row_id,receipt_timestamp,read_timestamp,played_timestamp FROM receipt_user WHERE message_row_id = ?", "GET_MESSAGE_RECEIPTS_SQL", C18260x0.A1b(j));
                    int columnIndexOrThrow = A0E.getColumnIndexOrThrow("receipt_user_jid_row_id");
                    int columnIndexOrThrow2 = A0E.getColumnIndexOrThrow("receipt_timestamp");
                    int columnIndexOrThrow3 = A0E.getColumnIndexOrThrow("read_timestamp");
                    int columnIndexOrThrow4 = A0E.getColumnIndexOrThrow("played_timestamp");
                    while (A0E.moveToNext()) {
                        UserJid A022 = C623334p.A02(this.A01, UserJid.class, A0E.getLong(columnIndexOrThrow));
                        if (A022 != null) {
                            r5.A00.put(A022, new C60722z3(A0E.getLong(columnIndexOrThrow2), A0E.getLong(columnIndexOrThrow3), A0E.getLong(columnIndexOrThrow4)));
                        }
                    }
                    A0E.close();
                    A033.close();
                    r7.A08(valueOf, r5);
                } catch (Throwable th) {
                    try {
                        A033.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            A032.close();
            return r5;
        } catch (Throwable th3) {
            try {
                A032.close();
                throw th3;
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
                throw th3;
            }
        }
        throw th;
    }

    public void A01(UserJid userJid, int i, long j, long j2) {
        String str;
        C69833Yo Axl;
        long j3 = j;
        UserJid userJid2 = userJid;
        int i2 = i;
        long j4 = j2;
        if (!A00(j3).A00(userJid2, i2, j4)) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("ReceiptUserStore/insertOrUpdateUserReceiptForMessage/should not store; messageRowId=");
            A0o.append(j3);
            AnonymousClass000.A17(userJid2, "; user=", "; status=", A0o);
            A0o.append(i2);
            C18260x0.A10("; timestamp=", A0o, j4);
            return;
        }
        StringBuilder A0o2 = AnonymousClass001.A0o();
        C18310x6.A1N("receiptuserstore/insertOrUpdateUserReceiptForMessage/rowId=", "; status=", A0o2, j3);
        A0o2.append(i2);
        C18260x0.A12(" timestamp=", A0o2, j4);
        ContentValues A07 = AnonymousClass0x9.A07(1);
        if (i2 == 5) {
            str = "receipt_timestamp";
        } else if (i2 == 8) {
            str = "played_timestamp";
        } else if (i2 == 13) {
            str = "read_timestamp";
        } else {
            StringBuilder A0o3 = AnonymousClass001.A0o();
            A0o3.append("Unexpected message status ");
            A0o3.append(i2);
            throw AnonymousClass000.A0F(" for user receipt", A0o3);
        }
        C18270x1.A0c(A07, str, j4);
        C85284Fq A04 = this.A02.A04();
        try {
            Axl = A04.Axl();
            long A05 = this.A01.A05(userJid2);
            C626936e.A0F(AnonymousClass000.A1S((A05 > -1 ? 1 : (A05 == -1 ? 0 : -1))), "invalid jid");
            C56862sg r9 = ((AnonymousClass3H0) A04).A03;
            String[] A1Z = AnonymousClass0x9.A1Z();
            AnonymousClass0x2.A1S(A1Z, 0, j3);
            C18270x1.A1R(A1Z, A05);
            if (((long) r9.A05(A07, "receipt_user", "message_row_id=? AND receipt_user_jid_row_id=?", "insertOrUpdateUserReceiptForMessage/UPDATE_RECEIPT_USER", A1Z)) == 0) {
                C18270x1.A0a(A07, j3);
                C18270x1.A0c(A07, "receipt_user_jid_row_id", A05);
                if (r9.A08("receipt_user", "insertOrUpdateUserReceiptForMessage/INSERT_RECEIPT_USER", A07) == -1) {
                    Log.e("ReceiptUserStore/insertOrUpdateUserReceiptForMessage/insert failed");
                } else {
                    StringBuilder A0o4 = AnonymousClass001.A0o();
                    C18310x6.A1N("ReceiptUserStore/insertOrUpdateUserReceiptForMessage/inserted; messageRowId=", "; userJidRowId=", A0o4, j3);
                    A0o4.append(A05);
                    A0o4.append("; status=");
                    A0o4.append(i2);
                    C18260x0.A10("; timestamp=", A0o4, j4);
                }
            } else {
                StringBuilder A0o5 = AnonymousClass001.A0o();
                C18310x6.A1N("ReceiptUserStore/insertOrUpdateUserReceiptForMessage/updated; messageRowId=", "; userJidRowId=", A0o5, j3);
                A0o5.append(A05);
                A0o5.append("; status=");
                A0o5.append(i2);
                C18260x0.A10("; timestamp=", A0o5, j4);
            }
            Axl.A00();
            Axl.close();
            A04.close();
            return;
        } catch (Throwable th) {
            try {
                A04.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    public C49512ge(C623334p r3, C72303dV r4, C56082rO r5) {
        this.A01 = r3;
        this.A03 = r5;
        this.A02 = r4;
    }
}
