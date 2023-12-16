package X;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteBlobTooBigException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteOutOfMemoryException;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.whatsapp.util.Log;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.31D  reason: invalid class name */
public abstract class AnonymousClass31D {
    public final int A00;
    public final C55682qk A01;
    public final C66663Mh A02;
    public final C61072zf A03;
    public final AnonymousClass2W1 A04;
    public final C72303dV A05;
    public final C56082rO A06;
    public final C41432Kf A07;
    public final C59412ws A08;
    public final C48602fA A09;
    public final C58602vW A0A;
    public final AnonymousClass4FV A0B;
    public final String A0C;

    public static final int A02(C44342Vr r2) {
        for (C84414Cg r1 : r2.A00) {
            if (!r1.isValid()) {
                Integer B1a = r1.B1a();
                if (B1a != null) {
                    return B1a.intValue();
                }
                return 0;
            }
        }
        return 0;
    }

    public static C85284Fq A03(AnonymousClass31D r0) {
        return r0.A05.A04();
    }

    public int A08() {
        if (this instanceof C23161Rn) {
            return EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH;
        }
        if (this instanceof AnonymousClass1RY) {
            return 0;
        }
        if (this instanceof C23251Rw) {
            return 200;
        }
        if ((this instanceof C23031Ra) || (this instanceof C23041Rb) || (this instanceof C23061Rd)) {
            return 0;
        }
        if (this instanceof C23221Rt) {
            return 200;
        }
        if (this instanceof C23181Rp) {
            return 10;
        }
        if (this instanceof C23121Rj) {
            return 256;
        }
        if (this instanceof C23211Rs) {
            return EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH;
        }
        if (this instanceof C23171Ro) {
            return 32;
        }
        if (this instanceof C23111Ri) {
            return EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH;
        }
        if (this instanceof C23271Ry) {
            return 25;
        }
        if (this instanceof C23261Rx) {
            return 10;
        }
        if (this instanceof AnonymousClass1RX) {
            return 512;
        }
        if (this instanceof C23101Rh) {
            return 32;
        }
        if (this instanceof C23081Rf) {
            return EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH;
        }
        if (this instanceof C23191Rq) {
            return 25;
        }
        if ((this instanceof C23151Rm) || (this instanceof C23281Rz) || (this instanceof C23241Rv) || (this instanceof C23141Rl) || (this instanceof C23201Rr)) {
            return EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH;
        }
        if (this instanceof C23131Rk) {
            return EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH;
        }
        if (this instanceof AnonymousClass1RZ) {
            return 512;
        }
        if (this instanceof C23051Rc) {
            return 128;
        }
        if (this instanceof C23231Ru) {
            return 32;
        }
        if (this instanceof C23091Rg) {
            return EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH;
        }
        return 0;
    }

    public int A09() {
        if ((this instanceof C23161Rn) || (this instanceof C23251Rw) || (this instanceof C23221Rt) || (this instanceof C23121Rj) || (this instanceof C23211Rs) || (this instanceof C23171Ro) || (this instanceof C23111Ri) || (this instanceof C23271Ry) || (this instanceof C23261Rx) || (this instanceof C23101Rh) || (this instanceof C23081Rf) || (this instanceof C23191Rq) || (this instanceof C23151Rm) || (this instanceof C23281Rz) || (this instanceof C23241Rv) || (this instanceof C23141Rl) || (this instanceof C23201Rr) || (this instanceof C23131Rk) || (this instanceof AnonymousClass1RZ) || (this instanceof C23051Rc) || (this instanceof C23231Ru) || (this instanceof C23091Rg) || (this instanceof C23071Re) || A0N() || A0O() || (this instanceof AnonymousClass1RY) || (this instanceof C23031Ra) || (this instanceof C23041Rb) || (this instanceof C23061Rd) || (this instanceof C23181Rp) || (this instanceof AnonymousClass1RX)) {
            return 3;
        }
        C58602vW r0 = this.A0A;
        String str = this.A0C;
        AnonymousClass1VX r2 = r0.A00;
        C58422vE r1 = C58422vE.A02;
        if (C58602vW.A00(r2.A0R(r1, 207), str)) {
            return 1;
        }
        if (C58602vW.A00(r2.A0R(r1, 208), str) || !C58602vW.A00(r2.A0R(r1, 209), str)) {
            return 2;
        }
        return 3;
    }

    public long A0B() {
        long j;
        if (this instanceof C23281Rz) {
            j = 1;
        } else {
            j = 0;
        }
        C56082rO r5 = this.A06;
        if (j == r5.A00(AnonymousClass000.A0X("_retry_revision", C23281Rz.A01(this)), 0)) {
            return r5.A00(A0F(), 0);
        }
        return 0;
    }

    public Cursor A0C(AnonymousClass4GK r6, int i, long j) {
        String str;
        C56862sg r1 = ((AnonymousClass3H0) r6).A03;
        if (this instanceof C23161Rn) {
            str = "SELECT _id, media_name, media_caption FROM messages WHERE _id > ? AND media_wa_type IN (15,64) ORDER BY _id ASC LIMIT ?";
        } else {
            if (!(this instanceof AnonymousClass1RY)) {
                if (this instanceof C23251Rw) {
                    str = "SELECT _id, gjid, jid, admin, pending, sent_sender_key FROM group_participants WHERE _id > ?  ORDER BY _id ASC LIMIT ?";
                } else if (!(this instanceof C23031Ra) && !(this instanceof C23041Rb) && !(this instanceof C23061Rd)) {
                    if (this instanceof C23221Rt) {
                        str = "SELECT group_participant_user._id, group_jid_row_id FROM group_participant_user LEFT JOIN jid ON group_jid_row_id = jid._id WHERE group_participant_user._id > ?  AND type = 3 GROUP BY group_jid_row_id ORDER BY group_participant_user._id LIMIT ? ";
                    } else if (this instanceof C23181Rp) {
                        str = "SELECT _id, raw_string, type FROM jid WHERE _id > ?  ORDER BY _id ASC LIMIT ? ";
                    } else if (this instanceof C23121Rj) {
                        str = "SELECT _id, media_wa_type, data, raw_data FROM messages WHERE _id > ?  AND media_wa_type IN (4, 14) ORDER BY _id ASC LIMIT ?";
                    } else if (this instanceof C23211Rs) {
                        str = "SELECT _id, key_remote_jid, key_from_me, key_id, media_name, media_caption, media_url, thumb_image, preview_type, status, media_duration  FROM messages WHERE _id > ? AND media_wa_type IN (0, 27) ORDER BY _id ASC LIMIT ?";
                    } else if (this instanceof C23171Ro) {
                        str = AnonymousClass2C7.A04;
                    } else if (this instanceof C23111Ri) {
                        str = "SELECT _id, send_count FROM messages WHERE _id > ? ORDER BY _id ASC LIMIT ?";
                    } else if (this instanceof C23271Ry) {
                        str = "SELECT _id, key_id, key_remote_jid, key_from_me, remote_resource, receipt_device_timestamp, read_device_timestamp, played_device_timestamp FROM messages WHERE _id > ?  AND (status IS NULL OR status!=6) ORDER BY _id ASC LIMIT ?";
                    } else if (this instanceof C23261Rx) {
                        str = "SELECT _id, key_remote_jid, key_from_me, key_id, remote_resource, status, receipt_device_timestamp, read_device_timestamp, played_device_timestamp, participant_hash FROM messages WHERE _id > ? ORDER BY _id ASC LIMIT ?";
                    } else if (this instanceof AnonymousClass1RX) {
                        str = "SELECT message_row_id, order_id, thumbnail, order_title, item_count, status, surface, message, seller_jid, token, currency_code, total_amount_1000, message_version FROM message_quoted_order WHERE message_row_id > ? ORDER BY message_row_id LIMIT ?";
                    } else if (this instanceof C23101Rh) {
                        str = AnonymousClass2C7.A03;
                    } else if (this instanceof C23081Rf) {
                        str = "SELECT pay_transactions.rowid AS _id, pay_transactions.key_remote_jid, (CASE WHEN pay_transactions.key_remote_jid IS NOT NULL THEN pay_transactions.key_id else NULL END) AS key_id,messages.rowid AS message_row_id, (CASE WHEN pay_transactions.key_remote_jid IS NULL THEN pay_transactions.key_id else NULL END) AS interop_id, id, pay_transactions.timestamp AS timestamp, pay_transactions.status AS status,error_code, sender, receiver, type, currency, amount_1000, credential_id, methods, bank_transaction_id, metadata, init_timestamp, request_key_id, country, version, future_data, service_id, background_id, purchase_initiator FROM pay_transactions LEFT JOIN messages ON pay_transactions.key_id = messages.key_id WHERE pay_transactions.rowid>? LIMIT ?";
                    } else if (this instanceof C23191Rq) {
                        str = AnonymousClass2C7.A02;
                    } else if (this instanceof C23151Rm) {
                        str = "SELECT _id, mentioned_jids FROM messages WHERE _id > ?  ORDER BY _id ASC LIMIT ?";
                    } else if (this instanceof C23281Rz) {
                        str = "SELECT _id, thumb_image, media_wa_type, key_remote_jid, multicast_id, media_url, media_mime_type, media_size, media_name, media_hash, media_duration, media_enc_hash, timestamp  FROM messages WHERE _id > ?  ORDER BY _id ASC LIMIT ?";
                    } else if (this instanceof C23241Rv) {
                        str = AnonymousClass2C7.A01;
                    } else if (this instanceof C23141Rl) {
                        str = "SELECT _id, key_remote_jid, media_wa_type, media_name, media_url, media_duration, media_size, latitude, longitude, thumb_image  FROM messages WHERE _id > ? AND media_wa_type IN (16, 5, 30) ORDER BY _id ASC LIMIT ?";
                    } else if (this instanceof C23201Rr) {
                        str = "SELECT _id, chat_row_id, data, media_caption, message_type FROM available_message_view WHERE _id > ? ORDER BY _id ASC LIMIT ?";
                    } else if (this instanceof C23131Rk) {
                        str = "SELECT _id, label_id, jid FROM labeled_jids WHERE _id > ? ORDER BY _id ASC LIMIT ?";
                    } else if (this instanceof AnonymousClass1RZ) {
                        str = "SELECT message_row_id, element_type, reply_values, reply_description FROM message_quoted_ui_elements_reply WHERE message_row_id > ? ORDER BY message_row_id LIMIT ?";
                    } else if (this instanceof C23051Rc) {
                        str = "SELECT _id, media_duration, raw_data, future_message_type  FROM messages WHERE _id > ?   AND media_wa_type IN (12) ORDER BY _id ASC LIMIT ?";
                    } else if (this instanceof C23231Ru) {
                        str = AnonymousClass2C7.A00;
                    } else if (this instanceof C23091Rg) {
                        str = "SELECT _id, jid, type, message_count FROM frequents WHERE _id > ? ORDER BY _id ASC LIMIT ?";
                    } else {
                        throw C18320x8.A0m();
                    }
                }
            }
            str = "";
        }
        String[] A1Z = AnonymousClass0x9.A1Z();
        C18260x0.A1W(A1Z, i, j);
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("MIGRATION_GET_QUERY_FOR_");
        return r1.A0E(str, AnonymousClass000.A0X(this.A0C, A0o), A1Z);
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Can't wrap try/catch for region: R(2:455|456) */
    /* JADX WARNING: Code restructure failed: missing block: B:271:0x062f, code lost:
        r2 = r0.getString(r17);
        r8 = X.C95814uZ.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:276:0x0646, code lost:
        if ((r3 instanceof X.C135166kE) != false) goto L_0x0648;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:381:0x08a5, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:383:?, code lost:
        r1.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:385:0x08aa, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:387:?, code lost:
        r12.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:388:0x08ae, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:404:0x08ef, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:405:0x08f0, code lost:
        com.whatsapp.util.Log.e(X.AnonymousClass000.A0Z("MissedCallsLogDatabaseMigration/processBatch/failed to read message with id = ", X.AnonymousClass001.A0o(), r3), r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:406:0x08fe, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:407:0x08ff, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:428:0x0979, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:430:?, code lost:
        r11.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:431:0x097d, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:456:?, code lost:
        X.C18260x0.A11("MainMessageDatabaseMigration/processBatch/failed to read message; rowId=", X.AnonymousClass001.A0o(), r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:603:0x0cc7, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:604:0x0cc8, code lost:
        r4 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:605:?, code lost:
        r1.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:607:0x0ccc, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:609:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:610:0x0cd0, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:624:0x0d34, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:625:0x0d35, code lost:
        r1.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:626:0x0d38, code lost:
        throw r1;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:189:0x0487, B:413:0x091e] */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:200:0x04b0, B:395:0x08c8] */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:253:0x0598, B:379:0x08a1] */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:264:0x05d1, B:601:0x0cc3] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:455:0x0a5e */
    /* JADX WARNING: Removed duplicated region for block: B:239:0x053e A[Catch:{ SQLException -> 0x08fe, Exception -> 0x056c }] */
    /* JADX WARNING: Removed duplicated region for block: B:244:0x0556 A[Catch:{ SQLException -> 0x08fe, Exception -> 0x056c }] */
    /* JADX WARNING: Removed duplicated region for block: B:406:0x08fe A[ExcHandler: SQLException (r0v3 'e' android.database.SQLException A[CUSTOM_DECLARE]), Splitter:B:200:0x04b0] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:435:0x0990=Splitter:B:435:0x0990, B:27:0x0092=Splitter:B:27:0x0092, B:467:0x0ab2=Splitter:B:467:0x0ab2, B:3:0x0025=Splitter:B:3:0x0025, B:439:0x099a=Splitter:B:439:0x099a} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass32H A0D(android.database.Cursor r41) {
        /*
            r40 = this;
            r1 = r40
            boolean r2 = r1 instanceof X.C23161Rn
            r0 = r41
            if (r2 == 0) goto L_0x00ae
            X.1Rn r1 = (X.C23161Rn) r1
            int r12 = X.AnonymousClass0x7.A02(r0)
            java.lang.String r2 = "media_name"
            int r11 = r0.getColumnIndexOrThrow(r2)
            java.lang.String r2 = "media_caption"
            int r10 = r0.getColumnIndexOrThrow(r2)
            X.4Fq r9 = A03(r1)
            r14 = -1
            r17 = 0
            r3 = -1
            r8 = 0
        L_0x0025:
            boolean r2 = r0.moveToNext()     // Catch:{ all -> 0x0b30 }
            if (r2 == 0) goto L_0x00a9
            android.content.ContentValues r7 = X.AnonymousClass0x9.A06()     // Catch:{ all -> 0x0b30 }
            long r3 = r0.getLong(r12)     // Catch:{ all -> 0x0b30 }
            X.C18270x1.A0a(r7, r3)     // Catch:{ all -> 0x0b30 }
            java.lang.String r5 = r0.getString(r11)     // Catch:{ all -> 0x0b30 }
            if (r5 != 0) goto L_0x003e
            java.lang.String r5 = ""
        L_0x003e:
            java.lang.String r2 = "revoked_key_id"
            r7.put(r2, r5)     // Catch:{ all -> 0x0b30 }
            java.lang.String r2 = r0.getString(r10)     // Catch:{ all -> 0x0b30 }
            com.whatsapp.jid.Jid r5 = X.AnonymousClass32W.A00(r2)     // Catch:{ all -> 0x0b30 }
            if (r5 != 0) goto L_0x004f
            goto L_0x0056
        L_0x004f:
            X.34p r2 = r1.A00     // Catch:{ all -> 0x0b30 }
            long r5 = r2.A05(r5)     // Catch:{ all -> 0x0b30 }
            goto L_0x0058
        L_0x0056:
            r5 = -1
        L_0x0058:
            java.lang.String r13 = "admin_jid_row_id"
            int r2 = (r5 > r14 ? 1 : (r5 == r14 ? 0 : -1))
            if (r2 != 0) goto L_0x005f
            goto L_0x0063
        L_0x005f:
            X.C18270x1.A0c(r7, r13, r5)     // Catch:{ all -> 0x0b30 }
            goto L_0x0066
        L_0x0063:
            r7.putNull(r13)     // Catch:{ all -> 0x0b30 }
        L_0x0066:
            r2 = r9
            X.3H0 r2 = (X.AnonymousClass3H0) r2     // Catch:{ all -> 0x0b30 }
            X.2sg r14 = r2.A03     // Catch:{ all -> 0x0b30 }
            java.lang.String r15 = "SELECT revoked_key_id,admin_jid_row_id,revoke_timestamp FROM message_revoked WHERE message_row_id = ?"
            r5 = 1
            java.lang.String[] r13 = new java.lang.String[r5]     // Catch:{ all -> 0x0b30 }
            java.lang.String r16 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x0b30 }
            r13[r17] = r16     // Catch:{ all -> 0x0b30 }
            java.lang.String r6 = "GET_REVOKED_MESSAGE_BY_ROW_ID_SQL"
            r2 = 0
            android.database.Cursor r15 = r14.A0D(r2, r15, r6, r13)     // Catch:{ all -> 0x0b30 }
            int r2 = r0.getCount()     // Catch:{ all -> 0x009f }
            java.lang.String r13 = "message_revoked"
            if (r2 <= 0) goto L_0x0092
            java.lang.String r6 = "message_row_id = ?"
            java.lang.String[] r5 = new java.lang.String[r5]     // Catch:{ all -> 0x009f }
            r5[r17] = r16     // Catch:{ all -> 0x009f }
            java.lang.String r2 = "DELETE_REVOKED_MESSAGE_BY_ID"
            r14.A07(r13, r6, r2, r5)     // Catch:{ all -> 0x009f }
        L_0x0092:
            r15.close()     // Catch:{ all -> 0x0b30 }
            java.lang.String r2 = "INSERT_MESSAGE_REVOKED_SQL"
            r14.A09(r13, r2, r7)     // Catch:{ all -> 0x0b30 }
            int r8 = r8 + 1
            r14 = -1
            goto L_0x0025
        L_0x009f:
            r1 = move-exception
            r15.close()     // Catch:{ all -> 0x00a4 }
            goto L_0x00a8
        L_0x00a4:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0b30 }
        L_0x00a8:
            throw r1     // Catch:{ all -> 0x0b30 }
        L_0x00a9:
            X.32H r0 = A04(r9, r8, r3)
            return r0
        L_0x00ae:
            boolean r2 = r1 instanceof X.AnonymousClass1RY
            if (r2 != 0) goto L_0x0e3f
            boolean r2 = r1 instanceof X.C23251Rw
            if (r2 == 0) goto L_0x0178
            X.1Rw r1 = (X.C23251Rw) r1
            int r15 = X.AnonymousClass0x7.A02(r0)
            java.lang.String r2 = "gjid"
            int r14 = r0.getColumnIndexOrThrow(r2)
            int r13 = X.AnonymousClass0x9.A01(r0)
            java.lang.String r2 = "admin"
            int r10 = r0.getColumnIndexOrThrow(r2)
            java.lang.String r2 = "pending"
            int r9 = r0.getColumnIndexOrThrow(r2)
            java.lang.String r2 = "sent_sender_key"
            int r8 = r0.getColumnIndexOrThrow(r2)
            r2 = -1
            r7 = 0
        L_0x00dd:
            boolean r4 = r0.moveToNext()
            if (r4 == 0) goto L_0x0172
            long r2 = r0.getLong(r15)
            int r7 = r7 + 1
            int r18 = r0.getInt(r10)
            int r4 = r0.getInt(r9)
            boolean r19 = X.AnonymousClass000.A1S(r4)
            int r4 = r0.getInt(r8)
            boolean r20 = X.AnonymousClass000.A1S(r4)
            java.lang.String r12 = X.C626135u.A01(r0, r14)
            X.1fL r6 = X.C28011fL.A01(r12)
            java.lang.String r11 = "participant-user-db-migration/process-batch: groupJid="
            java.lang.String r5 = ", rowId="
            if (r6 != 0) goto L_0x0120
            java.lang.StringBuilder r6 = X.AnonymousClass001.A0o()
            X.AnonymousClass001.A1K(r11, r12, r5, r6)
            r6.append(r2)
            java.lang.String r4 = " SKIP Due to invalid MultipleParticipantJid."
        L_0x0118:
            java.lang.String r4 = X.AnonymousClass000.A0X(r4, r6)
        L_0x011c:
            com.whatsapp.util.Log.w((java.lang.String) r4)
            goto L_0x00dd
        L_0x0120:
            if (r19 == 0) goto L_0x0137
            X.2ss r4 = r1.A01
            X.31A r4 = X.C56982ss.A00(r4, r6)
            if (r4 != 0) goto L_0x0137
            java.lang.StringBuilder r6 = X.AnonymousClass001.A0o()
            X.AnonymousClass001.A1K(r11, r12, r5, r6)
            r6.append(r2)
            java.lang.String r4 = " SKIP Due to pending group which no longer exists."
            goto L_0x0118
        L_0x0137:
            java.lang.String r4 = X.C626135u.A01(r0, r13)
            boolean r11 = android.text.TextUtils.isEmpty(r4)
            if (r11 == 0) goto L_0x015d
            X.2sr r11 = r1.A00
            com.whatsapp.jid.PhoneUserJid r17 = X.C56972sr.A04(r11)
        L_0x0147:
            if (r17 != 0) goto L_0x0162
            java.lang.StringBuilder r11 = X.AnonymousClass001.A0o()
            java.lang.String r6 = "participant-user-db-migration/process-batch: participantUserJid="
            X.AnonymousClass001.A1K(r6, r4, r5, r11)
            r11.append(r2)
            java.lang.String r4 = " SKIP Due to invalid UserJid."
            java.lang.String r4 = X.AnonymousClass000.A0X(r4, r11)
            goto L_0x011c
        L_0x015d:
            com.whatsapp.jid.UserJid r17 = X.AnonymousClass32Y.A08(r4)
            goto L_0x0147
        L_0x0162:
            r21 = 0
            X.2zG r4 = new X.2zG
            r16 = r4
            r16.<init>(r17, r18, r19, r20, r21)
            X.33h r5 = r1.A02
            r5.A0E(r4, r6)
            goto L_0x00dd
        L_0x0172:
            X.32H r0 = new X.32H
            r0.<init>(r2, r7)
            return r0
        L_0x0178:
            boolean r2 = r1 instanceof X.C23031Ra
            if (r2 != 0) goto L_0x0e3f
            boolean r2 = r1 instanceof X.C23041Rb
            if (r2 != 0) goto L_0x0e3f
            boolean r2 = r1 instanceof X.C23061Rd
            if (r2 != 0) goto L_0x0e3f
            boolean r2 = r1 instanceof X.C23221Rt
            if (r2 == 0) goto L_0x021d
            X.1Rt r1 = (X.C23221Rt) r1
            int r8 = X.AnonymousClass0x7.A02(r0)
            java.lang.String r2 = "group_jid_row_id"
            int r7 = r0.getColumnIndexOrThrow(r2)
            r2 = -1
            r6 = 0
        L_0x0197:
            boolean r4 = r0.moveToNext()
            if (r4 == 0) goto L_0x0217
            long r2 = r0.getLong(r8)
            int r6 = r6 + 1
            X.34p r10 = r1.A01
            java.lang.Class<X.1fI> r9 = X.AnonymousClass1fI.class
            int r4 = r0.getInt(r7)
            long r4 = (long) r4
            com.whatsapp.jid.Jid r9 = r10.A0B(r9, r4)
            X.1fL r9 = (X.C28011fL) r9
            java.lang.String r10 = ", rowId="
            java.lang.String r13 = "broadcast-me-jid-migration/process-batch: groupJidRowId="
            if (r9 != 0) goto L_0x01cf
            java.lang.StringBuilder r5 = X.AnonymousClass000.A0l(r13)
            int r4 = r0.getInt(r7)
            r5.append(r4)
            r5.append(r10)
            r5.append(r2)
            java.lang.String r4 = " SKIP Due to invalid BroadcastListJid"
            X.C18260x0.A1M(r5, r4)
            goto L_0x0197
        L_0x01cf:
            X.33h r5 = r1.A02
            X.34p r4 = r5.A09
            java.lang.String r12 = X.C623334p.A04(r4, r9)
            X.2sr r11 = r5.A01
            com.whatsapp.jid.PhoneUserJid r4 = X.C56972sr.A05(r11)
            boolean r4 = r5.A0P(r4, r12)
            if (r4 != 0) goto L_0x0200
            X.1fH r4 = r11.A0H()
            boolean r4 = r5.A0P(r4, r12)
            if (r4 != 0) goto L_0x0200
            X.2sr r4 = r1.A00
            com.whatsapp.jid.PhoneUserJid r11 = X.C56972sr.A05(r4)
            r12 = 2
            r13 = 0
            X.2zG r10 = new X.2zG
            r15 = r13
            r14 = r13
            r10.<init>(r11, r12, r13, r14, r15)
            r5.A0E(r10, r9)
            goto L_0x0197
        L_0x0200:
            java.lang.StringBuilder r5 = X.AnonymousClass000.A0l(r13)
            int r4 = r0.getInt(r7)
            r5.append(r4)
            r5.append(r10)
            r5.append(r2)
            java.lang.String r4 = " SKIP since it already has me jid"
            X.C18260x0.A1L(r5, r4)
            goto L_0x0197
        L_0x0217:
            X.32H r0 = new X.32H
            r0.<init>(r2, r6)
            return r0
        L_0x021d:
            boolean r2 = r1 instanceof X.C23181Rp
            if (r2 == 0) goto L_0x0260
            java.lang.String r1 = "BlankMeJidDatabaseMigration/processBatch"
            com.whatsapp.util.Log.i((java.lang.String) r1)
            int r7 = X.AnonymousClass0x7.A02(r0)
            java.lang.String r1 = "raw_string"
            int r6 = r0.getColumnIndexOrThrow(r1)
            java.lang.String r1 = "type"
            int r5 = r0.getColumnIndexOrThrow(r1)
            r2 = -1
            r4 = 0
        L_0x023b:
            boolean r1 = r0.moveToNext()
            if (r1 == 0) goto L_0x0255
            long r2 = r0.getLong(r7)
            int r4 = r4 + 1
            java.lang.String r1 = r0.getString(r6)
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L_0x023b
            r0.getInt(r5)
            goto L_0x023b
        L_0x0255:
            java.lang.String r0 = "BlankMeJidDatabaseMigration/processBatch/done"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.32H r0 = new X.32H
            r0.<init>(r2, r4)
            return r0
        L_0x0260:
            boolean r2 = r1 instanceof X.C23121Rj
            if (r2 == 0) goto L_0x02b1
            X.1Rj r1 = (X.C23121Rj) r1
            int r8 = X.AnonymousClass0x7.A02(r0)
            java.lang.String r2 = "media_wa_type"
            int r7 = r0.getColumnIndexOrThrow(r2)
            r3 = -1
            r6 = 0
        L_0x0273:
            boolean r2 = r0.moveToNext()
            if (r2 == 0) goto L_0x02ab
            long r3 = r0.getLong(r8)
            int r5 = r0.getInt(r7)
            r2 = 4
            if (r5 != r2) goto L_0x0296
            java.lang.String r2 = "data"
            java.lang.String r2 = X.AnonymousClass0x2.A0Z(r0, r2)
            X.30v r5 = r1.A00
            java.util.List r2 = java.util.Collections.singletonList(r2)
            X.C614530v.A00(r5, r2, r3)
        L_0x0293:
            int r6 = r6 + 1
            goto L_0x0273
        L_0x0296:
            r2 = 14
            if (r5 != r2) goto L_0x0293
            java.lang.String r2 = "raw_data"
            byte[] r2 = X.C18280x3.A1Z(r0, r2)
            java.util.List r5 = X.C624535b.A01(r2)
            X.30v r2 = r1.A00
            X.C614530v.A00(r2, r5, r3)
            goto L_0x0293
        L_0x02ab:
            X.32H r0 = new X.32H
            r0.<init>(r3, r6)
            return r0
        L_0x02b1:
            boolean r2 = r1 instanceof X.C23211Rs
            if (r2 == 0) goto L_0x048b
            X.1Rs r1 = (X.C23211Rs) r1
            int r26 = X.AnonymousClass0x7.A02(r0)
            java.lang.String r2 = "media_name"
            int r25 = r0.getColumnIndexOrThrow(r2)
            java.lang.String r2 = "media_caption"
            int r24 = r0.getColumnIndexOrThrow(r2)
            java.lang.String r2 = "media_url"
            int r23 = r0.getColumnIndexOrThrow(r2)
            java.lang.String r2 = "thumb_image"
            int r22 = r0.getColumnIndexOrThrow(r2)
            java.lang.String r12 = "preview_type"
            int r21 = r0.getColumnIndexOrThrow(r12)
            java.lang.String r2 = "status"
            int r20 = r0.getColumnIndexOrThrow(r2)
            java.lang.String r2 = "media_duration"
            int r19 = r0.getColumnIndexOrThrow(r2)
            X.4Fq r18 = A03(r1)
            r3 = -1
            r11 = 0
            r10 = 0
        L_0x02f0:
            boolean r2 = r0.moveToNext()     // Catch:{ all -> 0x0486 }
            if (r2 == 0) goto L_0x047d
            r2 = r26
            long r3 = r0.getLong(r2)     // Catch:{ all -> 0x0486 }
            r2 = r20
            int r5 = r0.getInt(r2)     // Catch:{ all -> 0x0486 }
            r2 = 6
            if (r5 != r2) goto L_0x0308
            int r11 = r11 + 1
            goto L_0x02f0
        L_0x0308:
            r2 = r18
            X.3H0 r2 = (X.AnonymousClass3H0) r2     // Catch:{ all -> 0x0486 }
            X.2sg r9 = r2.A03     // Catch:{ all -> 0x0486 }
            java.lang.String r7 = "SELECT description, page_title, url, font_style, text_color, background_color, preview_type, invite_link_group_type, counter_abuse_token FROM message_text WHERE message_row_id = ?"
            java.lang.String[] r6 = X.AnonymousClass0x9.A1Y()     // Catch:{ all -> 0x0486 }
            java.lang.String r14 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x0486 }
            r13 = 0
            r6[r13] = r14     // Catch:{ all -> 0x0486 }
            java.lang.String r5 = "GET_TEXT_MESSAGE_BY_ROW_ID_SQL"
            r2 = 0
            android.database.Cursor r7 = r9.A0D(r2, r7, r5, r6)     // Catch:{ all -> 0x0486 }
            int r2 = r0.getCount()     // Catch:{ all -> 0x0473 }
            java.lang.String r8 = "message_text"
            if (r2 <= 0) goto L_0x0339
            java.lang.String r6 = "message_row_id = ?"
            java.lang.String[] r5 = X.AnonymousClass0x9.A1Y()     // Catch:{ all -> 0x0473 }
            r5[r13] = r14     // Catch:{ all -> 0x0473 }
            java.lang.String r2 = "DELETE_TEXT_MESSAGE_BY_ID"
            r9.A07(r8, r6, r2, r5)     // Catch:{ all -> 0x0473 }
        L_0x0339:
            r7.close()     // Catch:{ all -> 0x0486 }
            android.content.ContentValues r7 = X.AnonymousClass0x9.A06()     // Catch:{ all -> 0x0486 }
            X.C18270x1.A0a(r7, r3)     // Catch:{ all -> 0x0486 }
            r2 = r25
            java.lang.String r6 = r0.getString(r2)     // Catch:{ all -> 0x0486 }
            boolean r5 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x0486 }
            java.lang.String r2 = "description"
            if (r5 != 0) goto L_0x0357
            r7.put(r2, r6)     // Catch:{ all -> 0x0486 }
            r17 = 1
            goto L_0x035c
        L_0x0357:
            r7.putNull(r2)     // Catch:{ all -> 0x0486 }
            r17 = 0
        L_0x035c:
            r2 = r24
            java.lang.String r6 = r0.getString(r2)     // Catch:{ all -> 0x0486 }
            boolean r5 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x0486 }
            java.lang.String r2 = "page_title"
            if (r5 != 0) goto L_0x0371
            r7.put(r2, r6)     // Catch:{ all -> 0x0486 }
            r17 = 1
            goto L_0x0374
        L_0x0371:
            r7.putNull(r2)     // Catch:{ all -> 0x0486 }
        L_0x0374:
            r2 = r23
            java.lang.String r6 = r0.getString(r2)     // Catch:{ all -> 0x0486 }
            boolean r5 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x0486 }
            java.lang.String r2 = "url"
            if (r5 != 0) goto L_0x0389
            r7.put(r2, r6)     // Catch:{ all -> 0x0486 }
            r17 = 1
            goto L_0x038c
        L_0x0389:
            r7.putNull(r2)     // Catch:{ all -> 0x0486 }
        L_0x038c:
            r2 = r22
            byte[] r2 = r0.getBlob(r2)     // Catch:{ all -> 0x0486 }
            java.lang.String r5 = "background_color"
            java.lang.String r6 = "text_color"
            java.lang.String r13 = "font_style"
            if (r2 != 0) goto L_0x039d
            goto L_0x044e
        L_0x039d:
            java.io.ByteArrayInputStream r14 = X.AnonymousClass0x9.A0d(r2)     // Catch:{ Exception -> 0x0451 }
            java.io.ObjectInputStream r16 = new java.io.ObjectInputStream     // Catch:{ Exception -> 0x0451 }
            r2 = r16
            r2.<init>(r14)     // Catch:{ Exception -> 0x0451 }
            java.lang.Object r15 = r16.readObject()     // Catch:{ all -> 0x0444 }
            boolean r2 = r15 instanceof com.whatsapp.TextData     // Catch:{ all -> 0x0444 }
            if (r2 == 0) goto L_0x0400
            com.whatsapp.TextData r15 = (com.whatsapp.TextData) r15     // Catch:{ all -> 0x0444 }
            int r2 = r15.fontStyle     // Catch:{ all -> 0x0444 }
            X.C18270x1.A0b(r7, r13, r2)     // Catch:{ all -> 0x0444 }
            int r2 = r15.textColor     // Catch:{ all -> 0x0444 }
            X.C18270x1.A0b(r7, r6, r2)     // Catch:{ all -> 0x0444 }
            int r2 = r15.backgroundColor     // Catch:{ all -> 0x0444 }
            X.C18270x1.A0b(r7, r5, r2)     // Catch:{ all -> 0x0444 }
            byte[] r15 = r15.thumbnail     // Catch:{ all -> 0x0444 }
            if (r15 == 0) goto L_0x03fd
            X.30a r14 = r1.A02     // Catch:{ all -> 0x0444 }
            java.lang.String r2 = "key_from_me"
            int r5 = r0.getColumnIndexOrThrow(r2)     // Catch:{ all -> 0x0444 }
            java.lang.String r2 = "key_id"
            int r13 = r0.getColumnIndexOrThrow(r2)     // Catch:{ all -> 0x0444 }
            X.2sm r2 = r1.A00     // Catch:{ all -> 0x0444 }
            X.4uZ r6 = r2.A0C(r0)     // Catch:{ all -> 0x0444 }
            int r2 = r0.getInt(r5)     // Catch:{ all -> 0x0444 }
            boolean r5 = X.AnonymousClass001.A1T(r2)     // Catch:{ all -> 0x0444 }
            java.lang.String r2 = r0.getString(r13)     // Catch:{ all -> 0x0444 }
            X.2z0 r13 = X.AnonymousClass2z0.A05(r6, r2, r5)     // Catch:{ all -> 0x0444 }
            r5 = 0
            int r2 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            boolean r6 = X.AnonymousClass001.A1W(r2)     // Catch:{ all -> 0x0444 }
            java.lang.StringBuilder r5 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0444 }
            java.lang.String r2 = "ThumbnailMessageStore/insertOrUpdateMessageThumbnail/message must have row_id set; key="
            X.C18260x0.A0l(r13, r2, r5, r6)     // Catch:{ all -> 0x0444 }
            r14.A01(r3, r15)     // Catch:{ all -> 0x0444 }
        L_0x03fd:
            r17 = 1
            goto L_0x0440
        L_0x0400:
            boolean r2 = r15 instanceof byte[]     // Catch:{ all -> 0x0444 }
            if (r2 == 0) goto L_0x0440
            X.30a r14 = r1.A02     // Catch:{ all -> 0x0444 }
            byte[] r15 = (byte[]) r15     // Catch:{ all -> 0x0444 }
            java.lang.String r2 = "key_from_me"
            int r5 = r0.getColumnIndexOrThrow(r2)     // Catch:{ all -> 0x0444 }
            java.lang.String r2 = "key_id"
            int r13 = r0.getColumnIndexOrThrow(r2)     // Catch:{ all -> 0x0444 }
            X.2sm r2 = r1.A00     // Catch:{ all -> 0x0444 }
            X.4uZ r6 = r2.A0C(r0)     // Catch:{ all -> 0x0444 }
            int r2 = r0.getInt(r5)     // Catch:{ all -> 0x0444 }
            boolean r5 = X.AnonymousClass001.A1T(r2)     // Catch:{ all -> 0x0444 }
            java.lang.String r2 = r0.getString(r13)     // Catch:{ all -> 0x0444 }
            X.2z0 r13 = X.AnonymousClass2z0.A05(r6, r2, r5)     // Catch:{ all -> 0x0444 }
            r5 = 0
            int r2 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            boolean r6 = X.AnonymousClass001.A1W(r2)     // Catch:{ all -> 0x0444 }
            java.lang.StringBuilder r5 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0444 }
            java.lang.String r2 = "ThumbnailMessageStore/insertOrUpdateMessageThumbnail/message must have row_id set; key="
            X.C18260x0.A0l(r13, r2, r5, r6)     // Catch:{ all -> 0x0444 }
            if (r15 == 0) goto L_0x0440
            r14.A01(r3, r15)     // Catch:{ all -> 0x0444 }
        L_0x0440:
            r16.close()     // Catch:{ Exception -> 0x0451 }
            goto L_0x0451
        L_0x0444:
            r5 = move-exception
            r16.close()     // Catch:{ all -> 0x0449 }
            goto L_0x044d
        L_0x0449:
            r2 = move-exception
            r5.addSuppressed(r2)     // Catch:{ Exception -> 0x0451 }
        L_0x044d:
            throw r5     // Catch:{ Exception -> 0x0451 }
        L_0x044e:
            X.C18310x6.A0w(r7, r13, r6, r5)     // Catch:{ all -> 0x0486 }
        L_0x0451:
            r2 = r21
            long r5 = r0.getLong(r2)     // Catch:{ all -> 0x0486 }
            int r13 = (int) r5     // Catch:{ all -> 0x0486 }
            X.C18270x1.A0b(r7, r12, r13)     // Catch:{ all -> 0x0486 }
            r2 = r19
            int r5 = r0.getInt(r2)     // Catch:{ all -> 0x0486 }
            java.lang.String r2 = "invite_link_group_type"
            X.C18270x1.A0b(r7, r2, r5)     // Catch:{ all -> 0x0486 }
            if (r17 != 0) goto L_0x046a
            if (r13 == 0) goto L_0x046f
        L_0x046a:
            java.lang.String r2 = "INSERT_MESSAGE_TEXT_SQL"
            r9.A09(r8, r2, r7)     // Catch:{ all -> 0x0486 }
        L_0x046f:
            int r10 = r10 + 1
            goto L_0x02f0
        L_0x0473:
            r1 = move-exception
            r7.close()     // Catch:{ all -> 0x0478 }
            goto L_0x047c
        L_0x0478:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0486 }
        L_0x047c:
            throw r1     // Catch:{ all -> 0x0486 }
        L_0x047d:
            r18.close()
            X.32H r0 = new X.32H
            r0.<init>(r10, r3, r11)
            return r0
        L_0x0486:
            r1 = move-exception
            r18.close()     // Catch:{ all -> 0x0d34 }
            throw r1
        L_0x048b:
            boolean r2 = r1 instanceof X.C23171Ro
            if (r2 == 0) goto L_0x0582
            X.1Ro r1 = (X.C23171Ro) r1
            java.lang.String r10 = "status"
            int r9 = r0.getColumnIndexOrThrow(r10)
            r3 = -1
            r8 = 0
            r7 = 0
        L_0x049c:
            boolean r2 = r0.moveToNext()
            if (r2 == 0) goto L_0x057c
            long r3 = X.C18270x1.A01(r0)
            int r5 = r0.getInt(r9)
            r2 = 6
            if (r5 == r2) goto L_0x04b0
            int r7 = r7 + 1
            goto L_0x049c
        L_0x04b0:
            X.2Nl r12 = r1.A00     // Catch:{ SQLException -> 0x08fe, Exception -> 0x056c }
            java.lang.String r2 = "key_id"
            java.lang.String r6 = X.AnonymousClass0x2.A0Z(r0, r2)     // Catch:{ SQLException -> 0x08fe, Exception -> 0x056c }
            java.lang.String r2 = "key_from_me"
            int r2 = X.AnonymousClass0x2.A04(r0, r2)     // Catch:{ SQLException -> 0x08fe, Exception -> 0x056c }
            boolean r5 = X.AnonymousClass001.A1T(r2)
            java.lang.String r2 = "key_remote_jid"
            int r2 = r0.getColumnIndexOrThrow(r2)     // Catch:{ SQLException -> 0x08fe, Exception -> 0x056c }
            X.4uZ r2 = X.AnonymousClass0x2.A0K(r0, r2)     // Catch:{ SQLException -> 0x08fe, Exception -> 0x056c }
            if (r2 != 0) goto L_0x04d1
            r5 = 0
            goto L_0x0551
        L_0x04d1:
            X.2z0 r11 = X.AnonymousClass2z0.A05(r2, r6, r5)     // Catch:{ SQLException -> 0x08fe, Exception -> 0x056c }
            java.lang.String r2 = "message_type"
            int r2 = r0.getColumnIndex(r2)     // Catch:{ SQLException -> 0x08fe, Exception -> 0x056c }
            if (r2 >= 0) goto L_0x04e4
            java.lang.String r2 = "media_wa_type"
            int r2 = r0.getColumnIndexOrThrow(r2)     // Catch:{ SQLException -> 0x08fe, Exception -> 0x056c }
        L_0x04e4:
            int r2 = r0.getInt(r2)     // Catch:{ SQLException -> 0x08fe, Exception -> 0x056c }
            byte r13 = (byte) r2     // Catch:{ SQLException -> 0x08fe, Exception -> 0x056c }
            java.lang.String r2 = "timestamp"
            long r5 = X.AnonymousClass0x2.A0C(r0, r2)     // Catch:{ SQLException -> 0x08fe, Exception -> 0x056c }
            int r14 = X.AnonymousClass0x2.A04(r0, r10)     // Catch:{ SQLException -> 0x08fe, Exception -> 0x056c }
            java.lang.String r2 = "thumb_image"
            byte[] r2 = X.C18280x3.A1Z(r0, r2)     // Catch:{ SQLException -> 0x08fe, Exception -> 0x056c }
            if (r2 == 0) goto L_0x051d
            java.io.ByteArrayInputStream r15 = X.AnonymousClass0x9.A0d(r2)     // Catch:{ IOException | ArrayIndexOutOfBoundsException | ClassNotFoundException -> 0x0517 }
            java.io.ObjectInputStream r2 = new java.io.ObjectInputStream     // Catch:{ IOException | ArrayIndexOutOfBoundsException | ClassNotFoundException -> 0x0517 }
            r2.<init>(r15)     // Catch:{ IOException | ArrayIndexOutOfBoundsException | ClassNotFoundException -> 0x0517 }
            r2.readObject()     // Catch:{ all -> 0x050d }
            r2.close()     // Catch:{ IOException | ArrayIndexOutOfBoundsException | ClassNotFoundException -> 0x0517 }
            goto L_0x051d
        L_0x050d:
            r15 = move-exception
            r2.close()     // Catch:{ all -> 0x0512 }
            goto L_0x0516
        L_0x0512:
            r2 = move-exception
            r15.addSuppressed(r2)     // Catch:{ IOException | ArrayIndexOutOfBoundsException | ClassNotFoundException -> 0x0517 }
        L_0x0516:
            throw r15     // Catch:{ IOException | ArrayIndexOutOfBoundsException | ClassNotFoundException -> 0x0517 }
        L_0x0517:
            r15 = move-exception
            java.lang.String r2 = "MessageStoreMessageUtils/readMessageFromCursor"
            com.whatsapp.util.Log.e(r2, r15)     // Catch:{ SQLException -> 0x08fe, Exception -> 0x056c }
        L_0x051d:
            if (r13 != 0) goto L_0x0523
            r2 = 6
            if (r14 == r2) goto L_0x0534
            goto L_0x0527
        L_0x0523:
            r2 = 7
            if (r13 != r2) goto L_0x0527
            goto L_0x0534
        L_0x0527:
            X.8qC r2 = r12.A01     // Catch:{ SQLException -> 0x08fe, Exception -> 0x056c }
            java.lang.Object r2 = r2.get()     // Catch:{ SQLException -> 0x08fe, Exception -> 0x056c }
            X.2YF r2 = (X.AnonymousClass2YF) r2     // Catch:{ SQLException -> 0x08fe, Exception -> 0x056c }
            X.34x r5 = r2.A00(r11, r13, r5)     // Catch:{ SQLException -> 0x08fe, Exception -> 0x056c }
            goto L_0x054c
        L_0x0534:
            java.lang.String r2 = "media_size"
            int r13 = X.AnonymousClass0x2.A04(r0, r2)     // Catch:{ SQLException -> 0x08fe, Exception -> 0x056c }
            r2 = 38
            if (r13 != r2) goto L_0x0556
            X.8qC r2 = r12.A01     // Catch:{ SQLException -> 0x08fe, Exception -> 0x056c }
            java.lang.Object r13 = r2.get()     // Catch:{ SQLException -> 0x08fe, Exception -> 0x056c }
            X.2YF r13 = (X.AnonymousClass2YF) r13     // Catch:{ SQLException -> 0x08fe, Exception -> 0x056c }
            r2 = 33
            X.34x r5 = r13.A00(r11, r2, r5)     // Catch:{ SQLException -> 0x08fe, Exception -> 0x056c }
        L_0x054c:
            X.34p r2 = r12.A00     // Catch:{ SQLException -> 0x08fe, Exception -> 0x056c }
            r5.A1I(r0, r2)     // Catch:{ SQLException -> 0x08fe, Exception -> 0x056c }
        L_0x0551:
            X.1mI r5 = (X.C30341mI) r5     // Catch:{ SQLException -> 0x08fe, Exception -> 0x056c }
            if (r5 == 0) goto L_0x049c
            goto L_0x0563
        L_0x0556:
            X.8qC r2 = r12.A02     // Catch:{ SQLException -> 0x08fe, Exception -> 0x056c }
            java.lang.Object r2 = r2.get()     // Catch:{ SQLException -> 0x08fe, Exception -> 0x056c }
            X.2aD r2 = (X.C45562aD) r2     // Catch:{ SQLException -> 0x08fe, Exception -> 0x056c }
            X.1mI r5 = r2.A00(r11, r13, r5)     // Catch:{ SQLException -> 0x08fe, Exception -> 0x056c }
            goto L_0x054c
        L_0x0563:
            X.2o0 r2 = r1.A01
            r2.A01(r5)
            int r8 = r8 + 1
            goto L_0x049c
        L_0x056c:
            r6 = move-exception
            java.lang.StringBuilder r5 = X.AnonymousClass001.A0o()
            java.lang.String r2 = "MissedCallsLogDatabaseMigration/processBatch/failed to read message with id = "
            java.lang.String r2 = X.AnonymousClass000.A0Z(r2, r5, r3)
            com.whatsapp.util.Log.e(r2, r6)
            goto L_0x049c
        L_0x057c:
            X.32H r0 = new X.32H
            r0.<init>(r8, r3, r7)
            return r0
        L_0x0582:
            boolean r2 = r1 instanceof X.C23111Ri
            if (r2 == 0) goto L_0x05c4
            int r11 = X.AnonymousClass0x7.A02(r0)
            java.lang.String r10 = "send_count"
            int r9 = r0.getColumnIndexOrThrow(r10)
            X.4Fq r12 = A03(r1)
            r3 = -1
            r8 = 0
        L_0x0598:
            boolean r1 = r0.moveToNext()     // Catch:{ all -> 0x08aa }
            if (r1 == 0) goto L_0x05bf
            long r3 = r0.getLong(r11)     // Catch:{ all -> 0x08aa }
            int r1 = r0.getInt(r9)     // Catch:{ all -> 0x08aa }
            if (r1 == 0) goto L_0x0598
            android.content.ContentValues r7 = X.AnonymousClass0x9.A06()     // Catch:{ all -> 0x08aa }
            X.C18270x1.A0a(r7, r3)     // Catch:{ all -> 0x08aa }
            X.2sg r6 = X.AnonymousClass3H0.A01(r7, r12, r10, r1)     // Catch:{ all -> 0x08aa }
            java.lang.String r5 = "message_send_count"
            r2 = 5
            java.lang.String r1 = "INSERT_MESSAGE_SEND_COUNT_SQL"
            r6.A0C(r5, r1, r7, r2)     // Catch:{ all -> 0x08aa }
            int r8 = r8 + 1
            goto L_0x0598
        L_0x05bf:
            X.32H r0 = A04(r12, r8, r3)
            return r0
        L_0x05c4:
            boolean r2 = r1 instanceof X.C23271Ry
            if (r2 == 0) goto L_0x06eb
            X.1Ry r1 = (X.C23271Ry) r1
            X.3dV r2 = r1.A05
            X.4GK r4 = r2.get()
            r2 = r4
            X.3H0 r2 = (X.AnonymousClass3H0) r2     // Catch:{ all -> 0x0ccc }
            X.2sg r5 = r2.A03     // Catch:{ all -> 0x0ccc }
            java.lang.String r3 = "INSERT OR IGNORE INTO receipt_user(message_row_id,receipt_user_jid_row_id,receipt_timestamp,read_timestamp,played_timestamp) VALUES (?, ?, ?, ?, ?)"
            java.lang.String r2 = "INSERT_RECEIPT_USER_MIGRATION_SQL"
            X.2sQ r21 = r5.A0G(r3, r2)     // Catch:{ all -> 0x0ccc }
            r4.close()
            int r18 = X.AnonymousClass0x7.A02(r0)
            java.lang.String r2 = "key_remote_jid"
            int r17 = r0.getColumnIndexOrThrow(r2)
            java.lang.String r2 = "key_from_me"
            int r16 = r0.getColumnIndexOrThrow(r2)
            java.lang.String r2 = "key_id"
            int r9 = r0.getColumnIndexOrThrow(r2)
            java.lang.String r2 = "remote_resource"
            int r15 = r0.getColumnIndexOrThrow(r2)
            java.lang.String r2 = "receipt_device_timestamp"
            int r14 = r0.getColumnIndexOrThrow(r2)
            java.lang.String r2 = "read_device_timestamp"
            int r13 = r0.getColumnIndexOrThrow(r2)
            java.lang.String r2 = "played_device_timestamp"
            int r10 = r0.getColumnIndexOrThrow(r2)
            r6 = 0
            r4 = -1
        L_0x0615:
            boolean r2 = r0.moveToNext()
            if (r2 == 0) goto L_0x06e5
            r2 = r18
            long r4 = r0.getLong(r2)
            int r6 = r6 + 1
            r2 = r16
            long r11 = r0.getLong(r2)
            r7 = 1
            int r2 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r2 != 0) goto L_0x0615
            r2 = r17
            java.lang.String r2 = r0.getString(r2)
            X.5Yw r8 = X.C95814uZ.A00
            X.4uZ r3 = r8.A05(r2)
            if (r3 == 0) goto L_0x0615
            boolean r2 = X.C627336j.A0K(r3)
            if (r2 != 0) goto L_0x0648
            boolean r7 = r3 instanceof X.C135166kE
            r2 = 0
            if (r7 == 0) goto L_0x0649
        L_0x0648:
            r2 = 1
        L_0x0649:
            r7 = 1
            if (r2 == 0) goto L_0x067f
            java.lang.String r2 = r0.getString(r9)
            X.2c3 r8 = r1.A04
            X.2z0 r3 = X.AnonymousClass2z0.A05(r3, r2, r7)
            r2 = 0
            X.2W3 r2 = r8.A00(r3, r2)
            java.util.concurrent.ConcurrentHashMap r2 = r2.A00
            java.util.Iterator r3 = X.AnonymousClass001.A0u(r2)
        L_0x0661:
            boolean r2 = r3.hasNext()
            if (r2 == 0) goto L_0x0615
            java.util.Map$Entry r2 = X.AnonymousClass001.A0w(r3)
            com.whatsapp.jid.UserJid r22 = X.C18320x8.A0P(r2)
            java.lang.Object r2 = r2.getValue()
            X.2z3 r2 = (X.C60722z3) r2
            r19 = r1
            r20 = r2
            r23 = r4
            r19.A0V(r20, r21, r22, r23)
            goto L_0x0661
        L_0x067f:
            boolean r2 = r3 instanceof com.whatsapp.jid.UserJid
            if (r2 == 0) goto L_0x0615
            com.whatsapp.jid.UserJid r22 = X.AnonymousClass32Y.A03(r3)
            long r24 = r0.getLong(r14)
            long r26 = r0.getLong(r13)
            long r28 = r0.getLong(r10)
            X.2z3 r20 = new X.2z3
            r23 = r20
            r23.<init>(r24, r26, r28)
            r2 = -1
            r19 = r1
            r23 = r4
            r19.A0V(r20, r21, r22, r23)
            java.lang.String r11 = r0.getString(r15)
            X.4uZ r12 = r8.A05(r11)
            boolean r8 = r12 instanceof X.AnonymousClass1fS
            if (r8 == 0) goto L_0x0615
            java.lang.String r11 = r0.getString(r9)
            X.2qz r8 = r1.A05     // Catch:{ SQLiteException -> 0x06c8 }
            X.2z0 r7 = X.AnonymousClass2z0.A05(r12, r11, r7)     // Catch:{ SQLiteException -> 0x06c8 }
            X.34x r2 = r8.A05(r7)     // Catch:{ SQLiteException -> 0x06c8 }
            if (r2 == 0) goto L_0x0615
            long r2 = r2.A1L
            r23 = r2
            r19.A0V(r20, r21, r22, r23)
            goto L_0x0615
        L_0x06c8:
            r8 = move-exception
            java.lang.StringBuilder r4 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "receipt-user-db-migration/process-batch fail to read from message store, e="
            X.C18260x0.A16(r0, r4, r8)
            long r6 = r1.A0B()
            r4 = 20
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 < 0) goto L_0x06e4
            r1 = 0
            X.32H r0 = new X.32H
            r0.<init>(r2, r1)
            return r0
        L_0x06e4:
            throw r8
        L_0x06e5:
            X.32H r0 = new X.32H
            r0.<init>(r4, r6)
            return r0
        L_0x06eb:
            boolean r2 = r1 instanceof X.AnonymousClass1RX
            if (r2 == 0) goto L_0x08af
            java.lang.String r38 = "message_row_id"
            r2 = r38
            int r37 = r0.getColumnIndexOrThrow(r2)
            java.lang.String r36 = "order_id"
            r2 = r36
            int r35 = r0.getColumnIndexOrThrow(r2)
            java.lang.String r34 = "thumbnail"
            r2 = r34
            int r33 = r0.getColumnIndexOrThrow(r2)
            java.lang.String r32 = "order_title"
            r2 = r32
            int r31 = r0.getColumnIndexOrThrow(r2)
            java.lang.String r30 = "item_count"
            r2 = r30
            int r29 = r0.getColumnIndexOrThrow(r2)
            java.lang.String r28 = "status"
            r2 = r28
            int r27 = r0.getColumnIndexOrThrow(r2)
            java.lang.String r26 = "surface"
            r2 = r26
            int r25 = r0.getColumnIndexOrThrow(r2)
            java.lang.String r24 = "message"
            r2 = r24
            int r23 = r0.getColumnIndexOrThrow(r2)
            java.lang.String r11 = "seller_jid"
            int r22 = r0.getColumnIndexOrThrow(r11)
            java.lang.String r10 = "token"
            int r21 = r0.getColumnIndexOrThrow(r10)
            java.lang.String r9 = "currency_code"
            int r20 = r0.getColumnIndexOrThrow(r9)
            java.lang.String r8 = "total_amount_1000"
            int r19 = r0.getColumnIndexOrThrow(r8)
            X.3dV r1 = r1.A05
            r39 = r1
            X.4Fq r12 = r39.A04()
            X.3Yo r18 = r12.Axl()     // Catch:{ all -> 0x08aa }
            r2 = -1
            r7 = 0
        L_0x075f:
            boolean r1 = r0.moveToNext()     // Catch:{ all -> 0x08a0 }
            if (r1 == 0) goto L_0x0895
            r1 = r37
            long r2 = r0.getLong(r1)     // Catch:{ all -> 0x08a0 }
            X.4GK r13 = r39.get()     // Catch:{ all -> 0x08a0 }
            r1 = r13
            X.3H0 r1 = (X.AnonymousClass3H0) r1     // Catch:{ all -> 0x088b }
            X.2sg r6 = r1.A03     // Catch:{ all -> 0x088b }
            java.lang.String r5 = "SELECT _id, quoted_row_id FROM messages WHERE _id = ?"
            java.lang.String[] r4 = X.AnonymousClass0x9.A1Y()     // Catch:{ all -> 0x088b }
            java.lang.String r17 = java.lang.Long.toString(r2)     // Catch:{ all -> 0x088b }
            r1 = 0
            r4[r1] = r17     // Catch:{ all -> 0x088b }
            java.lang.String r1 = "QUOTED_MESSAGE_RECOVERY_MESSAGES_TABLE_SQL"
            android.database.Cursor r6 = r6.A0E(r5, r1, r4)     // Catch:{ all -> 0x088b }
            boolean r1 = r6.moveToNext()     // Catch:{ all -> 0x087f }
            if (r1 == 0) goto L_0x0852
            java.lang.String r1 = "quoted_row_id"
            long r4 = X.AnonymousClass0x2.A0C(r6, r1)     // Catch:{ all -> 0x087f }
            r6.close()     // Catch:{ all -> 0x088b }
            r13.close()     // Catch:{ all -> 0x08a0 }
            r13 = 0
            int r1 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r1 == 0) goto L_0x0858
            X.4GK r16 = r39.get()     // Catch:{ all -> 0x08a0 }
            r1 = r16
            X.3H0 r1 = (X.AnonymousClass3H0) r1     // Catch:{ all -> 0x087a }
            X.2sg r1 = r1.A03     // Catch:{ all -> 0x087a }
            r13 = r1
            java.lang.String r6 = "SELECT media_wa_type FROM messages_quotes WHERE _id = ?"
            r14 = 1
            java.lang.String[] r15 = new java.lang.String[r14]     // Catch:{ all -> 0x087a }
            X.C18260x0.A1Y(r15, r4)     // Catch:{ all -> 0x087a }
            java.lang.String r1 = "QUOTED_MESSAGE_RECOVERY_MESSAGES_QUOTES_TABLE_SQL"
            android.database.Cursor r13 = r13.A0E(r6, r1, r15)     // Catch:{ all -> 0x087a }
            boolean r1 = r13.moveToNext()     // Catch:{ all -> 0x086e }
            if (r1 == 0) goto L_0x084b
            java.lang.String r1 = "media_wa_type"
            int r1 = X.AnonymousClass0x2.A04(r13, r1)     // Catch:{ all -> 0x086e }
            r6 = 44
            if (r1 == r6) goto L_0x07ca
            r14 = 0
        L_0x07ca:
            r13.close()     // Catch:{ all -> 0x087a }
            r16.close()     // Catch:{ all -> 0x08a0 }
            if (r14 == 0) goto L_0x0858
            r1 = 12
            android.content.ContentValues r6 = X.AnonymousClass0x9.A07(r1)     // Catch:{ all -> 0x08a0 }
            r1 = r38
            X.C18270x1.A0c(r6, r1, r4)     // Catch:{ all -> 0x08a0 }
            r1 = r35
            java.lang.String r4 = r0.getString(r1)     // Catch:{ all -> 0x08a0 }
            r1 = r36
            r6.put(r1, r4)     // Catch:{ all -> 0x08a0 }
            r1 = r33
            byte[] r4 = r0.getBlob(r1)     // Catch:{ all -> 0x08a0 }
            r1 = r34
            r6.put(r1, r4)     // Catch:{ all -> 0x08a0 }
            r1 = r31
            java.lang.String r4 = r0.getString(r1)     // Catch:{ all -> 0x08a0 }
            r1 = r32
            r6.put(r1, r4)     // Catch:{ all -> 0x08a0 }
            r4 = r30
            r1 = r29
            A06(r6, r0, r4, r1)     // Catch:{ all -> 0x08a0 }
            r4 = r28
            r1 = r27
            A06(r6, r0, r4, r1)     // Catch:{ all -> 0x08a0 }
            r4 = r25
            r1 = r26
            A06(r6, r0, r1, r4)     // Catch:{ all -> 0x08a0 }
            r1 = r23
            java.lang.String r4 = r0.getString(r1)     // Catch:{ all -> 0x08a0 }
            r1 = r24
            r6.put(r1, r4)     // Catch:{ all -> 0x08a0 }
            r1 = r22
            A06(r6, r0, r11, r1)     // Catch:{ all -> 0x08a0 }
            r1 = r21
            java.lang.String r1 = r0.getString(r1)     // Catch:{ all -> 0x08a0 }
            r6.put(r10, r1)     // Catch:{ all -> 0x08a0 }
            r1 = r20
            java.lang.String r1 = r0.getString(r1)     // Catch:{ all -> 0x08a0 }
            r6.put(r9, r1)     // Catch:{ all -> 0x08a0 }
            r1 = r19
            A06(r6, r0, r8, r1)     // Catch:{ all -> 0x08a0 }
            r1 = r12
            X.3H0 r1 = (X.AnonymousClass3H0) r1     // Catch:{ all -> 0x08a0 }
            X.2sg r5 = r1.A03     // Catch:{ all -> 0x08a0 }
            java.lang.String r4 = "quoted_message_order"
            java.lang.String r1 = "INSERT_QUOTED_TABLE_MESSAGE_ORDER_LEGACY"
            r5.A08(r4, r1, r6)     // Catch:{ all -> 0x08a0 }
            int r7 = r7 + 1
            goto L_0x075f
        L_0x084b:
            r13.close()     // Catch:{ all -> 0x087a }
            r16.close()     // Catch:{ all -> 0x08a0 }
            goto L_0x0858
        L_0x0852:
            r6.close()     // Catch:{ all -> 0x088b }
            r13.close()     // Catch:{ all -> 0x08a0 }
        L_0x0858:
            r1 = r12
            X.3H0 r1 = (X.AnonymousClass3H0) r1     // Catch:{ all -> 0x08a0 }
            X.2sg r13 = r1.A03     // Catch:{ all -> 0x08a0 }
            java.lang.String[] r6 = X.C18270x1.A1b(r17)     // Catch:{ all -> 0x08a0 }
            java.lang.String r5 = "DELETE_QUOTED_ORDER_MESSAGE_BY_ROW_ID_SQL"
            java.lang.String r4 = "message_quoted_order"
            java.lang.String r1 = "message_row_id = ?"
            r13.A07(r4, r1, r5, r6)     // Catch:{ all -> 0x08a0 }
            goto L_0x075f
        L_0x086e:
            r1 = move-exception
            if (r13 == 0) goto L_0x0879
            r13.close()     // Catch:{ all -> 0x0875 }
            goto L_0x0879
        L_0x0875:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x087a }
        L_0x0879:
            throw r1     // Catch:{ all -> 0x087a }
        L_0x087a:
            r1 = move-exception
            r16.close()     // Catch:{ all -> 0x0890 }
            goto L_0x0894
        L_0x087f:
            r1 = move-exception
            if (r6 == 0) goto L_0x088a
            r6.close()     // Catch:{ all -> 0x0886 }
            goto L_0x088a
        L_0x0886:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x088b }
        L_0x088a:
            throw r1     // Catch:{ all -> 0x088b }
        L_0x088b:
            r1 = move-exception
            r13.close()     // Catch:{ all -> 0x0890 }
            goto L_0x0894
        L_0x0890:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x08a0 }
        L_0x0894:
            throw r1     // Catch:{ all -> 0x08a0 }
        L_0x0895:
            r18.A00()     // Catch:{ all -> 0x08a0 }
            r18.close()     // Catch:{ all -> 0x08aa }
            X.32H r0 = A04(r12, r7, r2)
            return r0
        L_0x08a0:
            r1 = move-exception
            r18.close()     // Catch:{ all -> 0x08a5 }
            goto L_0x08a9
        L_0x08a5:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x08aa }
        L_0x08a9:
            throw r1     // Catch:{ all -> 0x08aa }
        L_0x08aa:
            r1 = move-exception
            r12.close()     // Catch:{ all -> 0x0d34 }
            throw r1
        L_0x08af:
            boolean r2 = r1 instanceof X.C23191Rq
            if (r2 == 0) goto L_0x0906
            X.1Rq r1 = (X.C23191Rq) r1
            int r9 = X.AnonymousClass0x7.A02(r0)
            r3 = -1
            r8 = 0
            r7 = 0
        L_0x08bd:
            boolean r2 = r0.moveToNext()
            if (r2 == 0) goto L_0x0900
            long r3 = r0.getLong(r9)
            r5 = 0
            X.2qz r2 = r1.A03     // Catch:{ SQLException -> 0x08fe, Exception -> 0x08ef }
            X.34x r6 = r2.A03(r0)     // Catch:{ SQLException -> 0x08fe, Exception -> 0x08ef }
            X.1mr r6 = (X.C30691mr) r6     // Catch:{ SQLException -> 0x08fe, Exception -> 0x08ef }
            if (r6 == 0) goto L_0x08bd
            X.2f4 r2 = r1.A02
            r2.A01(r6)
            r6.A1c(r5)
            X.2sC r2 = r1.A01     // Catch:{ IOException -> 0x08e0 }
            r2.A07(r6, r8)     // Catch:{ IOException -> 0x08e0 }
            goto L_0x08e5
        L_0x08e0:
            java.lang.String r2 = "MissedCallsLogDatabaseMigration/processBatch/failed to update missed call message in main message store."
            com.whatsapp.util.Log.e((java.lang.String) r2)
        L_0x08e5:
            X.2iV r5 = r1.A00
            X.2z0 r2 = r6.A1J
            r5.A01(r2)
            int r7 = r7 + 1
            goto L_0x08bd
        L_0x08ef:
            r6 = move-exception
            java.lang.StringBuilder r5 = X.AnonymousClass001.A0o()
            java.lang.String r2 = "MissedCallsLogDatabaseMigration/processBatch/failed to read message with id = "
            java.lang.String r2 = X.AnonymousClass000.A0Z(r2, r5, r3)
            com.whatsapp.util.Log.e(r2, r6)
            goto L_0x08bd
        L_0x08fe:
            r0 = move-exception
            throw r0
        L_0x0900:
            X.32H r0 = new X.32H
            r0.<init>(r3, r7)
            return r0
        L_0x0906:
            boolean r2 = r1 instanceof X.C23151Rm
            if (r2 == 0) goto L_0x097e
            X.1Rm r1 = (X.C23151Rm) r1
            int r13 = X.AnonymousClass0x7.A02(r0)
            java.lang.String r2 = "mentioned_jids"
            int r12 = r0.getColumnIndexOrThrow(r2)
            X.4Fq r11 = A03(r1)
            r3 = -1
            r10 = 0
            r9 = 0
        L_0x091e:
            boolean r2 = r0.moveToNext()     // Catch:{ all -> 0x0979 }
            if (r2 == 0) goto L_0x0970
            long r3 = r0.getLong(r13)     // Catch:{ all -> 0x0979 }
            java.lang.String r2 = r0.getString(r12)     // Catch:{ all -> 0x0979 }
            java.util.List r2 = X.C624435a.A03(r2)     // Catch:{ all -> 0x0979 }
            if (r2 != 0) goto L_0x0935
            int r9 = r9 + 1
            goto L_0x091e
        L_0x0935:
            java.util.Iterator r15 = r2.iterator()     // Catch:{ all -> 0x0979 }
        L_0x0939:
            boolean r2 = r15.hasNext()     // Catch:{ all -> 0x0979 }
            if (r2 == 0) goto L_0x096d
            java.lang.Object r7 = r15.next()     // Catch:{ all -> 0x0979 }
            X.3ZM r7 = (X.AnonymousClass3ZM) r7     // Catch:{ all -> 0x0979 }
            if (r7 == 0) goto L_0x0939
            android.content.ContentValues r8 = X.AnonymousClass0x9.A06()     // Catch:{ all -> 0x0979 }
            X.C18270x1.A0a(r8, r3)     // Catch:{ all -> 0x0979 }
            java.lang.String r14 = "jid_row_id"
            X.34p r5 = r1.A00     // Catch:{ all -> 0x0979 }
            X.4uZ r2 = r7.A00     // Catch:{ all -> 0x0979 }
            long r5 = r5.A05(r2)     // Catch:{ all -> 0x0979 }
            X.C18270x1.A0c(r8, r14, r5)     // Catch:{ all -> 0x0979 }
            java.lang.String r5 = "display_name"
            java.lang.String r2 = r7.A01     // Catch:{ all -> 0x0979 }
            X.2sg r7 = X.AnonymousClass3H0.A03(r8, r11, r5, r2)     // Catch:{ all -> 0x0979 }
            java.lang.String r6 = "message_mentions"
            r5 = 4
            java.lang.String r2 = "INSERT_TABLE_MESSAGE_MENTIONS"
            r7.A0C(r6, r2, r8, r5)     // Catch:{ all -> 0x0979 }
            goto L_0x0939
        L_0x096d:
            int r10 = r10 + 1
            goto L_0x091e
        L_0x0970:
            r11.close()
            X.32H r0 = new X.32H
            r0.<init>(r10, r3, r9)
            return r0
        L_0x0979:
            r1 = move-exception
            r11.close()     // Catch:{ all -> 0x0d34 }
            throw r1
        L_0x097e:
            boolean r2 = r1 instanceof X.C23241Rv
            if (r2 == 0) goto L_0x0a88
            X.1Rv r1 = (X.C23241Rv) r1
            int r11 = X.AnonymousClass0x7.A02(r0)
            X.4Fq r9 = A03(r1)
            r2 = -1
            r10 = 0
            r8 = 0
        L_0x0990:
            boolean r4 = r0.moveToNext()     // Catch:{ all -> 0x0b30 }
            if (r4 == 0) goto L_0x0a83
            long r2 = r0.getLong(r11)     // Catch:{ all -> 0x0b30 }
            X.2sC r7 = r1.A02     // Catch:{ Exception -> 0x0a5e }
            X.34x r6 = r7.A00(r0)     // Catch:{ Exception -> 0x0a5e }
            if (r6 == 0) goto L_0x0a67
            android.content.ContentValues r15 = X.AnonymousClass0x9.A06()     // Catch:{ all -> 0x0b30 }
            X.C624134x.A0G(r15, r6)     // Catch:{ all -> 0x0b30 }
            int r4 = r6.A0D     // Catch:{ all -> 0x0b30 }
            X.C18280x3.A0m(r15, r4)     // Catch:{ all -> 0x0b30 }
            java.lang.String r5 = "broadcast"
            boolean r4 = r6.A1B     // Catch:{ all -> 0x0b30 }
            X.C621833x.A03(r15, r5, r4)     // Catch:{ all -> 0x0b30 }
            java.lang.String r5 = "text_data"
            java.lang.String r4 = r6.A18()     // Catch:{ all -> 0x0b30 }
            X.C621833x.A02(r15, r5, r4)     // Catch:{ all -> 0x0b30 }
            long r4 = r6.A0K     // Catch:{ all -> 0x0b30 }
            X.C18290x4.A19(r15, r4)     // Catch:{ all -> 0x0b30 }
            byte r4 = r6.A1I     // Catch:{ all -> 0x0b30 }
            java.lang.Byte r5 = java.lang.Byte.valueOf(r4)     // Catch:{ all -> 0x0b30 }
            java.lang.String r4 = "message_type"
            r15.put(r4, r5)     // Catch:{ all -> 0x0b30 }
            long r4 = r6.A0I     // Catch:{ all -> 0x0b30 }
            r13 = 0
            int r12 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r12 != 0) goto L_0x09de
            X.2sH r4 = r1.A00     // Catch:{ all -> 0x0b30 }
            long r4 = r4.A0H()     // Catch:{ all -> 0x0b30 }
        L_0x09de:
            java.lang.Long r5 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x0b30 }
            java.lang.String r4 = "received_timestamp"
            r15.put(r4, r5)     // Catch:{ all -> 0x0b30 }
            long r4 = r6.A0J     // Catch:{ all -> 0x0b30 }
            java.lang.Long r5 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x0b30 }
            java.lang.String r4 = "receipt_server_timestamp"
            r15.put(r4, r5)     // Catch:{ all -> 0x0b30 }
            X.C624134x.A0I(r15, r6)     // Catch:{ all -> 0x0b30 }
            java.lang.String r5 = "participant_hash"
            java.lang.String r4 = r6.A14     // Catch:{ all -> 0x0b30 }
            X.C621833x.A02(r15, r5, r4)     // Catch:{ all -> 0x0b30 }
            java.lang.String r5 = "starred"
            boolean r4 = r6.A1F     // Catch:{ all -> 0x0b30 }
            X.C621833x.A03(r15, r5, r4)     // Catch:{ all -> 0x0b30 }
            int r4 = r6.A0k()     // Catch:{ all -> 0x0b30 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x0b30 }
            java.lang.String r4 = "origination_flags"
            r15.put(r4, r5)     // Catch:{ all -> 0x0b30 }
            int r4 = r6.A09     // Catch:{ all -> 0x0b30 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x0b30 }
            java.lang.String r4 = "origin"
            r15.put(r4, r5)     // Catch:{ all -> 0x0b30 }
            long r4 = r6.A0m()     // Catch:{ all -> 0x0b30 }
            java.lang.Long r5 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x0b30 }
            java.lang.String r4 = "lookup_tables"
            r15.put(r4, r5)     // Catch:{ all -> 0x0b30 }
            X.C624134x.A0J(r15, r6)     // Catch:{ all -> 0x0b30 }
            java.lang.String[] r4 = X.AnonymousClass0x9.A1Y()     // Catch:{ all -> 0x0b30 }
            X.C624134x.A0Y(r6, r4, r10)     // Catch:{ all -> 0x0b30 }
            r5 = r9
            X.3H0 r5 = (X.AnonymousClass3H0) r5     // Catch:{ SQLiteConstraintException -> 0x0a72 }
            X.2sg r14 = r5.A03     // Catch:{ SQLiteConstraintException -> 0x0a72 }
            java.lang.String r5 = "message"
            java.lang.String r17 = "_id = ?"
            java.lang.String r18 = "UPDATE_MESSAGE_MAIN_WITH_ROW_ID_SQL"
            r19 = r4
            r16 = r5
            int r4 = r14.A05(r15, r16, r17, r18, r19)     // Catch:{ SQLiteConstraintException -> 0x0a72 }
            if (r4 != 0) goto L_0x0a7f
            android.content.ContentValues r12 = X.AnonymousClass0x9.A06()     // Catch:{ SQLiteConstraintException -> 0x0a5b }
            r7.A03(r12, r6)     // Catch:{ SQLiteConstraintException -> 0x0a5b }
            r6 = 4
            java.lang.String r4 = "INSERT_MESSAGE_MAIN_WITH_ROW_ID_SQL"
            r14.A0C(r5, r4, r12, r6)     // Catch:{ SQLiteConstraintException -> 0x0a5b }
            goto L_0x0a7f
        L_0x0a5b:
            java.lang.String r4 = "MainMessageDatabaseMigration/Failed to insert an record - the same message already exists. Skipping message."
            goto L_0x0a7c
        L_0x0a5e:
            java.lang.StringBuilder r5 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0b30 }
            java.lang.String r4 = "MainMessageDatabaseMigration/processBatch/failed to read message; rowId="
            X.C18260x0.A11(r4, r5, r2)     // Catch:{ all -> 0x0b30 }
        L_0x0a67:
            java.lang.StringBuilder r5 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0b30 }
            java.lang.String r4 = "MainMessageDatabaseMigration/processBatch/missing message; rowId="
            java.lang.String r4 = X.AnonymousClass000.A0Z(r4, r5, r2)     // Catch:{ all -> 0x0b30 }
            goto L_0x0a7c
        L_0x0a72:
            java.lang.StringBuilder r5 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0b30 }
            java.lang.String r4 = "MainMessageDatabaseMigration/processBatch/row is already present in new table; rowId="
            java.lang.String r4 = X.AnonymousClass000.A0Z(r4, r5, r2)     // Catch:{ all -> 0x0b30 }
        L_0x0a7c:
            com.whatsapp.util.Log.e((java.lang.String) r4)     // Catch:{ all -> 0x0b30 }
        L_0x0a7f:
            int r8 = r8 + 1
            goto L_0x0990
        L_0x0a83:
            X.32H r0 = A04(r9, r8, r2)
            return r0
        L_0x0a88:
            boolean r2 = r1 instanceof X.C23201Rr
            if (r2 == 0) goto L_0x0b35
            X.1Rr r1 = (X.C23201Rr) r1
            int r20 = X.AnonymousClass0x7.A02(r0)
            java.lang.String r11 = "chat_row_id"
            int r19 = r0.getColumnIndexOrThrow(r11)
            java.lang.String r2 = "data"
            int r18 = r0.getColumnIndexOrThrow(r2)
            java.lang.String r2 = "media_caption"
            int r17 = r0.getColumnIndexOrThrow(r2)
            java.lang.String r2 = "message_type"
            int r10 = r0.getColumnIndexOrThrow(r2)
            X.4Fq r9 = A03(r1)
            r3 = -1
            r8 = 0
        L_0x0ab2:
            boolean r2 = r0.moveToNext()     // Catch:{ all -> 0x0b30 }
            if (r2 == 0) goto L_0x0b2b
            int r3 = r0.getInt(r10)     // Catch:{ all -> 0x0b30 }
            if (r3 == 0) goto L_0x0ade
            r2 = 1
            if (r3 == r2) goto L_0x0ae5
            r2 = 3
            if (r3 == r2) goto L_0x0ae5
            r2 = 13
            if (r3 == r2) goto L_0x0ae5
            r2 = 23
            if (r3 == r2) goto L_0x0ae5
            r2 = 25
            if (r3 == r2) goto L_0x0ae5
            r2 = 37
            if (r3 == r2) goto L_0x0ae5
            r2 = 28
            if (r3 == r2) goto L_0x0ae5
            r2 = 29
            if (r3 == r2) goto L_0x0ae5
            r5 = 0
            goto L_0x0aeb
        L_0x0ade:
            r2 = r18
            java.lang.String r5 = r0.getString(r2)     // Catch:{ all -> 0x0b30 }
            goto L_0x0aeb
        L_0x0ae5:
            r2 = r17
            java.lang.String r5 = r0.getString(r2)     // Catch:{ all -> 0x0b30 }
        L_0x0aeb:
            r2 = r20
            long r3 = r0.getLong(r2)     // Catch:{ all -> 0x0b30 }
            X.5Zz r2 = r1.A01     // Catch:{ all -> 0x0b30 }
            java.util.ArrayList r16 = r2.A04(r5)     // Catch:{ all -> 0x0b30 }
            r2 = r19
            long r5 = r0.getLong(r2)     // Catch:{ all -> 0x0b30 }
            r12 = 0
            int r2 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r2 < 0) goto L_0x0ab2
            if (r16 == 0) goto L_0x0b28
            r15 = 0
        L_0x0b06:
            int r2 = r16.size()     // Catch:{ all -> 0x0b30 }
            if (r15 >= r2) goto L_0x0b28
            android.content.ContentValues r14 = X.AnonymousClass0x9.A06()     // Catch:{ all -> 0x0b30 }
            X.C18270x1.A0c(r14, r11, r5)     // Catch:{ all -> 0x0b30 }
            X.C18270x1.A0a(r14, r3)     // Catch:{ all -> 0x0b30 }
            java.lang.String r2 = "link_index"
            X.2sg r13 = X.AnonymousClass3H0.A01(r14, r9, r2, r15)     // Catch:{ all -> 0x0b30 }
            java.lang.String r12 = "message_link"
            r7 = 4
            java.lang.String r2 = "INSERT_MESSAGE_LINK_TABLE"
            r13.A0C(r12, r2, r14, r7)     // Catch:{ all -> 0x0b30 }
            int r15 = r15 + 1
            goto L_0x0b06
        L_0x0b28:
            int r8 = r8 + 1
            goto L_0x0ab2
        L_0x0b2b:
            X.32H r0 = A04(r9, r8, r3)
            return r0
        L_0x0b30:
            r1 = move-exception
            r9.close()     // Catch:{ all -> 0x0d34 }
            throw r1
        L_0x0b35:
            boolean r2 = r1 instanceof X.C23131Rk
            if (r2 == 0) goto L_0x0ba2
            X.1Rk r1 = (X.C23131Rk) r1
            int r11 = X.AnonymousClass0x7.A02(r0)
            java.lang.String r10 = "label_id"
            int r9 = r0.getColumnIndexOrThrow(r10)
            int r8 = X.AnonymousClass0x9.A01(r0)
            r4 = -1
            r7 = 0
        L_0x0b4c:
            boolean r2 = r0.moveToNext()
            if (r2 == 0) goto L_0x0b9c
            long r4 = r0.getLong(r11)
            long r2 = r0.getLong(r9)
            java.lang.String r12 = r0.getString(r8)
            X.4uZ r6 = X.C18310x6.A0S(r12)
            if (r6 == 0) goto L_0x0b8d
            android.content.ContentValues r13 = X.AnonymousClass0x9.A06()
            X.C18270x1.A0c(r13, r10, r2)
            X.34p r2 = r1.A00
            java.lang.Long r3 = X.C623334p.A03(r2, r6)
            java.lang.String r2 = "jid_row_id"
            r13.put(r2, r3)
            X.4Fq r14 = A03(r1)
            r2 = r14
            X.3H0 r2 = (X.AnonymousClass3H0) r2     // Catch:{ all -> 0x0b97 }
            X.2sg r12 = r2.A03     // Catch:{ all -> 0x0b97 }
            java.lang.String r6 = "labeled_jid"
            r3 = 5
            java.lang.String r2 = "INSERT_LABELED_JID"
            r12.A0C(r6, r2, r13, r3)     // Catch:{ all -> 0x0b97 }
            r14.close()
            int r7 = r7 + 1
            goto L_0x0b4c
        L_0x0b8d:
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
            java.lang.String r2 = "LabelJidStore/processBatch/invalid jid in original table, jid="
            X.C18260x0.A0r(r2, r12, r3)
            goto L_0x0b4c
        L_0x0b97:
            r1 = move-exception
            r14.close()     // Catch:{ all -> 0x0d34 }
            throw r1
        L_0x0b9c:
            X.32H r0 = new X.32H
            r0.<init>(r4, r7)
            return r0
        L_0x0ba2:
            boolean r2 = r1 instanceof X.AnonymousClass1RZ
            if (r2 == 0) goto L_0x0cd1
            java.lang.String r10 = "message_row_id"
            int r22 = r0.getColumnIndexOrThrow(r10)
            java.lang.String r9 = "element_type"
            int r21 = r0.getColumnIndexOrThrow(r9)
            java.lang.String r8 = "reply_values"
            int r20 = r0.getColumnIndexOrThrow(r8)
            java.lang.String r7 = "reply_description"
            int r19 = r0.getColumnIndexOrThrow(r7)
            X.3dV r1 = r1.A05
            r23 = r1
            X.4Fq r4 = r23.A04()
            X.3Yo r18 = r4.Axl()     // Catch:{ all -> 0x0ccc }
            r2 = -1
            r11 = 0
        L_0x0bd0:
            boolean r1 = r0.moveToNext()     // Catch:{ all -> 0x0cc2 }
            if (r1 == 0) goto L_0x0cb7
            r1 = r22
            long r2 = r0.getLong(r1)     // Catch:{ all -> 0x0cc2 }
            X.4GK r13 = r23.get()     // Catch:{ all -> 0x0cc2 }
            r1 = r13
            X.3H0 r1 = (X.AnonymousClass3H0) r1     // Catch:{ all -> 0x0cad }
            X.2sg r12 = r1.A03     // Catch:{ all -> 0x0cad }
            java.lang.String r6 = "SELECT _id, quoted_row_id FROM messages WHERE _id = ?"
            java.lang.String[] r5 = X.AnonymousClass0x9.A1Y()     // Catch:{ all -> 0x0cad }
            java.lang.String r17 = java.lang.Long.toString(r2)     // Catch:{ all -> 0x0cad }
            r1 = 0
            r5[r1] = r17     // Catch:{ all -> 0x0cad }
            java.lang.String r1 = "QUOTED_MESSAGE_RECOVERY_MESSAGES_TABLE_SQL"
            android.database.Cursor r12 = r12.A0E(r6, r1, r5)     // Catch:{ all -> 0x0cad }
            boolean r1 = r12.moveToNext()     // Catch:{ all -> 0x0ca1 }
            if (r1 == 0) goto L_0x0c78
            java.lang.String r1 = "quoted_row_id"
            long r5 = X.AnonymousClass0x2.A0C(r12, r1)     // Catch:{ all -> 0x0ca1 }
            r12.close()     // Catch:{ all -> 0x0cad }
            r13.close()     // Catch:{ all -> 0x0cc2 }
            r12 = 0
            int r1 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r1 == 0) goto L_0x0c7e
            X.4GK r16 = r23.get()     // Catch:{ all -> 0x0cc2 }
            r1 = r16
            X.3H0 r1 = (X.AnonymousClass3H0) r1     // Catch:{ all -> 0x0c9c }
            X.2sg r15 = r1.A03     // Catch:{ all -> 0x0c9c }
            java.lang.String r13 = "SELECT media_wa_type FROM messages_quotes WHERE _id = ?"
            r14 = 1
            java.lang.String[] r12 = new java.lang.String[r14]     // Catch:{ all -> 0x0c9c }
            X.C18260x0.A1Y(r12, r5)     // Catch:{ all -> 0x0c9c }
            java.lang.String r1 = "QUOTED_MESSAGE_RECOVERY_MESSAGES_QUOTES_TABLE_SQL"
            android.database.Cursor r13 = r15.A0E(r13, r1, r12)     // Catch:{ all -> 0x0c9c }
            boolean r1 = r13.moveToNext()     // Catch:{ all -> 0x0c90 }
            if (r1 == 0) goto L_0x0c71
            java.lang.String r1 = "media_wa_type"
            int r12 = X.AnonymousClass0x2.A04(r13, r1)     // Catch:{ all -> 0x0c90 }
            r1 = 46
            if (r12 == r1) goto L_0x0c3a
            r14 = 0
        L_0x0c3a:
            r13.close()     // Catch:{ all -> 0x0c9c }
            r16.close()     // Catch:{ all -> 0x0cc2 }
            if (r14 == 0) goto L_0x0c7e
            android.content.ContentValues r12 = X.C18300x5.A06()     // Catch:{ all -> 0x0cc2 }
            X.C18270x1.A0c(r12, r10, r5)     // Catch:{ all -> 0x0cc2 }
            r1 = r21
            java.lang.String r1 = r0.getString(r1)     // Catch:{ all -> 0x0cc2 }
            r12.put(r9, r1)     // Catch:{ all -> 0x0cc2 }
            r1 = r20
            byte[] r1 = r0.getBlob(r1)     // Catch:{ all -> 0x0cc2 }
            r12.put(r8, r1)     // Catch:{ all -> 0x0cc2 }
            r1 = r19
            java.lang.String r1 = r0.getString(r1)     // Catch:{ all -> 0x0cc2 }
            X.2sg r6 = X.AnonymousClass3H0.A03(r12, r4, r7, r1)     // Catch:{ all -> 0x0cc2 }
            java.lang.String r5 = "message_quoted_ui_elements_reply_legacy"
            java.lang.String r1 = "INSERT_LEGACY_QUOTED_TABLE_NAME"
            r6.A08(r5, r1, r12)     // Catch:{ all -> 0x0cc2 }
            int r11 = r11 + 1
            goto L_0x0bd0
        L_0x0c71:
            r13.close()     // Catch:{ all -> 0x0c9c }
            r16.close()     // Catch:{ all -> 0x0cc2 }
            goto L_0x0c7e
        L_0x0c78:
            r12.close()     // Catch:{ all -> 0x0cad }
            r13.close()     // Catch:{ all -> 0x0cc2 }
        L_0x0c7e:
            r1 = r4
            X.3H0 r1 = (X.AnonymousClass3H0) r1     // Catch:{ all -> 0x0cc2 }
            X.2sg r12 = r1.A03     // Catch:{ all -> 0x0cc2 }
            java.lang.String[] r6 = X.C18270x1.A1b(r17)     // Catch:{ all -> 0x0cc2 }
            java.lang.String r5 = "DELETE_QUOTED_REPLY_MESSAGE_BY_ROW_ID_SQL"
            java.lang.String r1 = "DELETE FROM message_quoted_ui_elements_reply WHERE message_row_id = ?"
            r12.A0I(r1, r5, r6)     // Catch:{ all -> 0x0cc2 }
            goto L_0x0bd0
        L_0x0c90:
            r1 = move-exception
            if (r13 == 0) goto L_0x0c9b
            r13.close()     // Catch:{ all -> 0x0c97 }
            goto L_0x0c9b
        L_0x0c97:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0c9c }
        L_0x0c9b:
            throw r1     // Catch:{ all -> 0x0c9c }
        L_0x0c9c:
            r1 = move-exception
            r16.close()     // Catch:{ all -> 0x0cb2 }
            goto L_0x0cb6
        L_0x0ca1:
            r1 = move-exception
            if (r12 == 0) goto L_0x0cac
            r12.close()     // Catch:{ all -> 0x0ca8 }
            goto L_0x0cac
        L_0x0ca8:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0cad }
        L_0x0cac:
            throw r1     // Catch:{ all -> 0x0cad }
        L_0x0cad:
            r1 = move-exception
            r13.close()     // Catch:{ all -> 0x0cb2 }
            goto L_0x0cb6
        L_0x0cb2:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0cc2 }
        L_0x0cb6:
            throw r1     // Catch:{ all -> 0x0cc2 }
        L_0x0cb7:
            r18.A00()     // Catch:{ all -> 0x0cc2 }
            r18.close()     // Catch:{ all -> 0x0ccc }
            X.32H r0 = A04(r4, r11, r2)
            return r0
        L_0x0cc2:
            r1 = move-exception
            r18.close()     // Catch:{ all -> 0x0cc7 }
            goto L_0x0ccb
        L_0x0cc7:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0ccc }
        L_0x0ccb:
            throw r1     // Catch:{ all -> 0x0ccc }
        L_0x0ccc:
            r1 = move-exception
            r4.close()     // Catch:{ all -> 0x0d34 }
            throw r1
        L_0x0cd1:
            boolean r2 = r1 instanceof X.C23051Rc
            if (r2 == 0) goto L_0x0d39
            int r12 = X.AnonymousClass0x7.A02(r0)
            java.lang.String r2 = "media_duration"
            int r11 = r0.getColumnIndexOrThrow(r2)
            java.lang.String r2 = "raw_data"
            int r10 = r0.getColumnIndexOrThrow(r2)
            java.lang.String r9 = "future_message_type"
            int r8 = r0.getColumnIndexOrThrow(r9)
            X.4Fq r13 = A03(r1)
            r4 = -1
            r7 = 0
        L_0x0cf3:
            boolean r1 = r0.moveToNext()     // Catch:{ all -> 0x0d2f }
            if (r1 == 0) goto L_0x0d2a
            long r4 = r0.getLong(r12)     // Catch:{ all -> 0x0d2f }
            int r14 = r0.getInt(r11)     // Catch:{ all -> 0x0d2f }
            byte[] r3 = r0.getBlob(r10)     // Catch:{ all -> 0x0d2f }
            int r2 = r0.getInt(r8)     // Catch:{ all -> 0x0d2f }
            android.content.ContentValues r6 = X.AnonymousClass0x9.A06()     // Catch:{ all -> 0x0d2f }
            X.C18270x1.A0a(r6, r4)     // Catch:{ all -> 0x0d2f }
            java.lang.String r1 = "version"
            X.C18270x1.A0b(r6, r1, r14)     // Catch:{ all -> 0x0d2f }
            java.lang.String r1 = "data"
            X.C621833x.A04(r6, r1, r3)     // Catch:{ all -> 0x0d2f }
            X.2sg r3 = X.AnonymousClass3H0.A01(r6, r13, r9, r2)     // Catch:{ all -> 0x0d2f }
            java.lang.String r2 = "message_future"
            java.lang.String r1 = "INSERT_MESSAGE_FUTURE_SQL"
            r3.A08(r2, r1, r6)     // Catch:{ all -> 0x0d2f }
            int r7 = r7 + 1
            goto L_0x0cf3
        L_0x0d2a:
            X.32H r0 = A04(r13, r7, r4)
            return r0
        L_0x0d2f:
            r1 = move-exception
            r13.close()     // Catch:{ all -> 0x0d34 }
            throw r1
        L_0x0d34:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        L_0x0d39:
            boolean r2 = r1 instanceof X.C23231Ru
            if (r2 == 0) goto L_0x0db0
            X.1Ru r1 = (X.C23231Ru) r1
            r4 = 0
            int r2 = r0.getCount()     // Catch:{ SQLiteBindOrColumnIndexOutOfRangeException | SQLiteBlobTooBigException | SQLiteConstraintException | SQLiteDatatypeMismatchException | SQLiteFullException | SQLiteOutOfMemoryException -> 0x0da8 }
            boolean r7 = X.AnonymousClass001.A1T(r2)
            X.3Lu r8 = r1.A00     // Catch:{ SQLiteBindOrColumnIndexOutOfRangeException | SQLiteBlobTooBigException | SQLiteConstraintException | SQLiteDatatypeMismatchException | SQLiteFullException | SQLiteOutOfMemoryException -> 0x0da1 }
            java.util.Map r10 = r1.A01     // Catch:{ SQLiteBindOrColumnIndexOutOfRangeException | SQLiteBlobTooBigException | SQLiteConstraintException | SQLiteDatatypeMismatchException | SQLiteFullException | SQLiteOutOfMemoryException -> 0x0da1 }
            r11 = 5
            r1 = -5
            X.2vV r13 = X.C58592vV.A00(r1)     // Catch:{ SQLiteBindOrColumnIndexOutOfRangeException | SQLiteBlobTooBigException | SQLiteConstraintException | SQLiteDatatypeMismatchException | SQLiteFullException | SQLiteOutOfMemoryException -> 0x0da1 }
            int r2 = X.AnonymousClass0x7.A02(r0)     // Catch:{ SQLiteBindOrColumnIndexOutOfRangeException | SQLiteBlobTooBigException | SQLiteConstraintException | SQLiteDatatypeMismatchException | SQLiteFullException | SQLiteOutOfMemoryException -> 0x0da1 }
            java.lang.String r1 = "chat_row_id"
            int r3 = r0.getColumnIndexOrThrow(r1)     // Catch:{ SQLiteBindOrColumnIndexOutOfRangeException | SQLiteBlobTooBigException | SQLiteConstraintException | SQLiteDatatypeMismatchException | SQLiteFullException | SQLiteOutOfMemoryException -> 0x0da1 }
            r1 = 0
        L_0x0d5e:
            boolean r5 = r0.moveToNext()     // Catch:{ SQLiteBindOrColumnIndexOutOfRangeException | SQLiteBlobTooBigException | SQLiteConstraintException | SQLiteDatatypeMismatchException | SQLiteFullException | SQLiteOutOfMemoryException -> 0x0da1 }
            if (r5 == 0) goto L_0x0d99
            X.34x r9 = r8.A08(r0, r3, r2)     // Catch:{ SQLiteBindOrColumnIndexOutOfRangeException | SQLiteBlobTooBigException | SQLiteConstraintException | SQLiteDatatypeMismatchException | SQLiteFullException | SQLiteOutOfMemoryException -> 0x0da1 }
            if (r9 != 0) goto L_0x0d79
            int r1 = r1 + 1
            long r17 = r0.getLong(r2)     // Catch:{ SQLiteBindOrColumnIndexOutOfRangeException | SQLiteBlobTooBigException | SQLiteConstraintException | SQLiteDatatypeMismatchException | SQLiteFullException | SQLiteOutOfMemoryException -> 0x0da1 }
            r15 = -9223372036854775808
            r14 = -6
            X.2vV r13 = new X.2vV     // Catch:{ SQLiteBindOrColumnIndexOutOfRangeException | SQLiteBlobTooBigException | SQLiteConstraintException | SQLiteDatatypeMismatchException | SQLiteFullException | SQLiteOutOfMemoryException -> 0x0da1 }
            r13.<init>(r14, r15, r17)     // Catch:{ SQLiteBindOrColumnIndexOutOfRangeException | SQLiteBlobTooBigException | SQLiteConstraintException | SQLiteDatatypeMismatchException | SQLiteFullException | SQLiteOutOfMemoryException -> 0x0da1 }
            goto L_0x0d5e
        L_0x0d79:
            r13 = 1
            X.2vV r13 = r8.A06(r9, r10, r11, r13)     // Catch:{ SQLiteBindOrColumnIndexOutOfRangeException | SQLiteBlobTooBigException | SQLiteConstraintException | SQLiteDatatypeMismatchException | SQLiteFullException | SQLiteOutOfMemoryException -> 0x0da1 }
            int r6 = r13.A00     // Catch:{ SQLiteBindOrColumnIndexOutOfRangeException | SQLiteBlobTooBigException | SQLiteConstraintException | SQLiteDatatypeMismatchException | SQLiteFullException | SQLiteOutOfMemoryException -> 0x0da1 }
            r5 = -6
            if (r6 != r5) goto L_0x0d8f
            long r15 = r9.A1M     // Catch:{ SQLiteBindOrColumnIndexOutOfRangeException | SQLiteBlobTooBigException | SQLiteConstraintException | SQLiteDatatypeMismatchException | SQLiteFullException | SQLiteOutOfMemoryException -> 0x0da1 }
            long r5 = r9.A1L     // Catch:{ SQLiteBindOrColumnIndexOutOfRangeException | SQLiteBlobTooBigException | SQLiteConstraintException | SQLiteDatatypeMismatchException | SQLiteFullException | SQLiteOutOfMemoryException -> 0x0da1 }
            X.2vV r13 = new X.2vV     // Catch:{ SQLiteBindOrColumnIndexOutOfRangeException | SQLiteBlobTooBigException | SQLiteConstraintException | SQLiteDatatypeMismatchException | SQLiteFullException | SQLiteOutOfMemoryException -> 0x0da1 }
            r14 = 1
            r17 = r5
            r13.<init>(r14, r15, r17)     // Catch:{ SQLiteBindOrColumnIndexOutOfRangeException | SQLiteBlobTooBigException | SQLiteConstraintException | SQLiteDatatypeMismatchException | SQLiteFullException | SQLiteOutOfMemoryException -> 0x0da1 }
        L_0x0d8f:
            X.2iV r6 = r8.A07     // Catch:{ SQLiteBindOrColumnIndexOutOfRangeException | SQLiteBlobTooBigException | SQLiteConstraintException | SQLiteDatatypeMismatchException | SQLiteFullException | SQLiteOutOfMemoryException -> 0x0da1 }
            X.2z0 r5 = r9.A1J     // Catch:{ SQLiteBindOrColumnIndexOutOfRangeException | SQLiteBlobTooBigException | SQLiteConstraintException | SQLiteDatatypeMismatchException | SQLiteFullException | SQLiteOutOfMemoryException -> 0x0da1 }
            r6.A01(r5)     // Catch:{ SQLiteBindOrColumnIndexOutOfRangeException | SQLiteBlobTooBigException | SQLiteConstraintException | SQLiteDatatypeMismatchException | SQLiteFullException | SQLiteOutOfMemoryException -> 0x0da1 }
            int r1 = r1 + 1
            goto L_0x0d5e
        L_0x0d99:
            long r5 = r13.A01     // Catch:{ SQLiteBindOrColumnIndexOutOfRangeException | SQLiteBlobTooBigException | SQLiteConstraintException | SQLiteDatatypeMismatchException | SQLiteFullException | SQLiteOutOfMemoryException -> 0x0da1 }
            X.32H r2 = new X.32H     // Catch:{ SQLiteBindOrColumnIndexOutOfRangeException | SQLiteBlobTooBigException | SQLiteConstraintException | SQLiteDatatypeMismatchException | SQLiteFullException | SQLiteOutOfMemoryException -> 0x0da1 }
            r2.<init>(r5, r1)     // Catch:{ SQLiteBindOrColumnIndexOutOfRangeException | SQLiteBlobTooBigException | SQLiteConstraintException | SQLiteDatatypeMismatchException | SQLiteFullException | SQLiteOutOfMemoryException -> 0x0da1 }
            return r2
        L_0x0da1:
            if (r7 == 0) goto L_0x0da8
            java.lang.String r0 = "FtsDatabaseMigration/skipping single row"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0da8:
            r0 = -1
            X.32H r2 = new X.32H
            r2.<init>(r0, r4)
            return r2
        L_0x0db0:
            boolean r2 = r1 instanceof X.C23091Rg
            if (r2 == 0) goto L_0x0e3a
            X.1Rg r1 = (X.C23091Rg) r1
            int r19 = X.AnonymousClass0x7.A02(r0)
            int r18 = X.AnonymousClass0x9.A01(r0)
            java.lang.String r2 = "type"
            int r17 = r0.getColumnIndexOrThrow(r2)
            java.lang.String r2 = "message_count"
            int r16 = r0.getColumnIndexOrThrow(r2)
            r8 = -1
            r12 = 0
        L_0x0dce:
            boolean r2 = r0.moveToNext()
            if (r2 == 0) goto L_0x0e34
            X.2fp r11 = r1.A02
            java.lang.String r3 = "INSERT INTO frequent(jid_row_id, type, message_count) VALUES (?, ?, ?)"
            java.lang.String r2 = "INSERT_FREQUENT"
            X.2sQ r10 = r11.A00(r3, r2)
            r2 = r19
            long r8 = r0.getLong(r2)
            r2 = r18
            java.lang.String r13 = r0.getString(r2)
            r2 = r17
            long r6 = r0.getLong(r2)
            r2 = r16
            long r4 = r0.getLong(r2)
            X.4uZ r3 = X.C18310x6.A0S(r13)
            if (r3 == 0) goto L_0x0e2a
            X.34p r2 = r1.A01
            long r2 = r2.A05(r3)
            r13 = 1
            r10.A06(r13, r2)
            r14 = 2
            r10.A06(r14, r6)
            r13 = 3
            r10.A06(r13, r4)
            r10.A01()     // Catch:{ SQLiteConstraintException -> 0x0e12 }
            goto L_0x0e27
        L_0x0e12:
            java.lang.String r15 = "UPDATE frequent   SET message_count = ? WHERE jid_row_id = ? AND type = ?"
            java.lang.String r10 = "UPDATE_FREQUENT"
            X.2sQ r10 = r11.A00(r15, r10)
            r10.A06(r14, r2)
            r10.A06(r13, r6)
            r2 = 1
            r10.A06(r2, r4)
            r10.A00()
        L_0x0e27:
            int r12 = r12 + 1
            goto L_0x0dce
        L_0x0e2a:
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
            java.lang.String r2 = "FrequentMessageStore/processBatch/invalid jid in original table, jid="
            X.C18260x0.A0r(r2, r13, r3)
            goto L_0x0dce
        L_0x0e34:
            X.32H r0 = new X.32H
            r0.<init>(r8, r12)
            return r0
        L_0x0e3a:
            java.lang.UnsupportedOperationException r0 = X.C18320x8.A0m()
            throw r0
        L_0x0e3f:
            r2 = 0
            r1 = 0
            X.32H r0 = new X.32H
            r0.<init>(r2, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass31D.A0D(android.database.Cursor):X.32H");
    }

    public String A0E() {
        if (this instanceof C23161Rn) {
            return "revoked_ready";
        }
        if (this instanceof C23121Rj) {
            return "new_vcards_ready";
        }
        if (this instanceof C23211Rs) {
            return "text_ready";
        }
        if (this instanceof C23171Ro) {
            return "system_message_ready";
        }
        if (this instanceof C23111Ri) {
            return "send_count_ready";
        }
        if (this instanceof AnonymousClass1RX) {
            return "quoted_order_message_v2_migration_ready";
        }
        if (this instanceof C23101Rh) {
            return "quoted_message_ready";
        }
        if (this instanceof C23081Rf) {
            return "new_pay_transaction_ready";
        }
        if (this instanceof C23151Rm) {
            return "mention_message_ready";
        }
        if (this instanceof C23241Rv) {
            return "main_message_ready";
        }
        if (this instanceof C23141Rl) {
            return "location_ready";
        }
        if (this instanceof C23201Rr) {
            return "links_ready";
        }
        if (this instanceof C23131Rk) {
            return "labeled_jids_ready";
        }
        if (this instanceof AnonymousClass1RZ) {
            return "quoted_ui_elements_reply_message_migration_ready";
        }
        if (this instanceof C23051Rc) {
            return "future_ready";
        }
        if (this instanceof C23091Rg) {
            return "frequent_ready";
        }
        return AnonymousClass000.A0X("_complete", C23281Rz.A01(this));
    }

    public String A0F() {
        if (this instanceof C23161Rn) {
            return "migration_message_revoked_retry";
        }
        if (this instanceof AnonymousClass1RY) {
            return "rename_deprecated_tables_retry_count";
        }
        if (this instanceof C23251Rw) {
            return "migration_participant_user_retry";
        }
        if (this instanceof C23031Ra) {
            return "migration_jid_store_retry_count";
        }
        if (this instanceof C23041Rb) {
            return "drop_deprecated_tables_retry_count";
        }
        if (this instanceof C23061Rd) {
            return "migration_chat_store_retry_count";
        }
        if (this instanceof C23221Rt) {
            return "migration_broadcast_me_jid_retry";
        }
        if (this instanceof C23181Rp) {
            return "migration_blank_me_jid_retry";
        }
        if (this instanceof C23121Rj) {
            return "migration_vcard_retry";
        }
        if (this instanceof C23211Rs) {
            return "migration_message_text_retry";
        }
        if (this instanceof C23171Ro) {
            return "migration_message_system_retry";
        }
        if (this instanceof C23111Ri) {
            return "migration_message_send_count_retry";
        }
        if (this instanceof C23271Ry) {
            return "migration_receipt_retry";
        }
        if (this instanceof C23261Rx) {
            return "migration_receipt_device_retry";
        }
        if (this instanceof AnonymousClass1RX) {
            return "quoted_order_message_v2_retry_count";
        }
        if (this instanceof C23101Rh) {
            return "migration_message_quoted_retry";
        }
        if (this instanceof C23081Rf) {
            return "migration_pay_transaction_retry";
        }
        if (this instanceof C23191Rq) {
            return "migration_missed_calls_log_retry";
        }
        if (this instanceof C23151Rm) {
            return "migration_message_mention_retry";
        }
        if (this instanceof C23281Rz) {
            return "migration_message_media_retry";
        }
        if (this instanceof C23241Rv) {
            return "migration_message_main_retry";
        }
        if (this instanceof C23141Rl) {
            return "migration_message_location_retry";
        }
        if (this instanceof C23201Rr) {
            return "migration_link_retry";
        }
        if (this instanceof C23131Rk) {
            return "migration_labeled_jid_retry";
        }
        if (this instanceof AnonymousClass1RZ) {
            return "quoted_ui_elements_reply_message_retry_count";
        }
        if (this instanceof C23051Rc) {
            return "migration_message_future_retry";
        }
        if (this instanceof C23231Ru) {
            return "migration_fts_retry";
        }
        if (this instanceof C23091Rg) {
            return "migration_frequent_retry";
        }
        return "call_log_retry_count";
    }

    public String A0G() {
        if (this instanceof C23161Rn) {
            return "migration_message_revoked_index";
        }
        if (this instanceof AnonymousClass1RY) {
            return "rename_deprecated_tables_start_index";
        }
        if (this instanceof C23251Rw) {
            return "migration_participant_user_index";
        }
        if (this instanceof C23031Ra) {
            return "migration_jid_store_start_index";
        }
        if (this instanceof C23041Rb) {
            return "drop_deprecated_tables_start_index";
        }
        if (this instanceof C23061Rd) {
            return "migration_chat_store_start_index";
        }
        if (this instanceof C23221Rt) {
            return "migration_broadcast_me_jid_index";
        }
        if (this instanceof C23181Rp) {
            return "migration_blank_me_jid_index";
        }
        if (this instanceof C23121Rj) {
            return "migration_vcard_index";
        }
        if (this instanceof C23211Rs) {
            return "migration_message_text_index";
        }
        if (this instanceof C23171Ro) {
            return "migration_message_system_index";
        }
        if (this instanceof C23111Ri) {
            return "migration_message_send_count_index";
        }
        if (this instanceof C23271Ry) {
            return "migration_receipt_index";
        }
        if (this instanceof C23261Rx) {
            return "migration_receipt_device_index";
        }
        if (this instanceof AnonymousClass1RX) {
            return "quoted_order_message_v2_start_index";
        }
        if (this instanceof C23101Rh) {
            return "migration_message_quoted_index";
        }
        if (this instanceof C23081Rf) {
            return "migration_pay_transaction_index";
        }
        if (this instanceof C23191Rq) {
            return "migration_missed_calls_log_index";
        }
        if (this instanceof C23151Rm) {
            return "migration_message_mention_index";
        }
        if (this instanceof C23281Rz) {
            return "migration_message_media_index";
        }
        if (this instanceof C23241Rv) {
            return "migration_message_main_index";
        }
        if (this instanceof C23141Rl) {
            return "migration_message_location_index";
        }
        if (this instanceof C23201Rr) {
            return "migration_link_index";
        }
        if (this instanceof C23131Rk) {
            return "migration_labeled_jid_index";
        }
        if (this instanceof AnonymousClass1RZ) {
            return "quoted_ui_elements_reply_message_start_index";
        }
        if (this instanceof C23051Rc) {
            return "migration_message_future_index";
        }
        if (this instanceof C23231Ru) {
            return "migration_fts_index";
        }
        if (this instanceof C23091Rg) {
            return "migration_frequent_index";
        }
        return "call_log_start_index";
    }

    public Set A0H() {
        if (this instanceof C23161Rn) {
            return C18260x0.A0D();
        }
        if (this instanceof AnonymousClass1RY) {
            HashSet A0K = AnonymousClass002.A0K();
            A0K.add("message_main");
            A0K.add("quoted_order_message_v2");
            A0K.add("receipt_user");
            A0K.add("receipt_device");
            return A0K;
        } else if (this instanceof C23251Rw) {
            HashSet A0D = C18260x0.A0D();
            A0D.add("blank_me_jid");
            return A0D;
        } else if (this instanceof C23041Rb) {
            HashSet A0K2 = AnonymousClass002.A0K();
            A0K2.add("rename_deprecated_tables");
            return A0K2;
        } else if (this instanceof C23061Rd) {
            return Collections.singleton("migration_jid_store");
        } else {
            if (this instanceof C23221Rt) {
                HashSet A0D2 = C18260x0.A0D();
                A0D2.add("participant_user");
                return A0D2;
            } else if (this instanceof C23181Rp) {
                return C18260x0.A0D();
            } else {
                if (this instanceof C23121Rj) {
                    return C18260x0.A0D();
                }
                if (this instanceof C23211Rs) {
                    return C18260x0.A0D();
                }
                if (this instanceof C23171Ro) {
                    return C18260x0.A0D();
                }
                if (this instanceof C23111Ri) {
                    return C18260x0.A0D();
                }
                if (this instanceof C23271Ry) {
                    return C18260x0.A0D();
                }
                if (this instanceof C23261Rx) {
                    return C18260x0.A0D();
                }
                if (this instanceof C23101Rh) {
                    return C18260x0.A0D();
                }
                if (this instanceof C23081Rf) {
                    return C18260x0.A0D();
                }
                if (this instanceof C23191Rq) {
                    return C18260x0.A0D();
                }
                if (this instanceof C23151Rm) {
                    return C18260x0.A0D();
                }
                if (this instanceof C23281Rz) {
                    return C18260x0.A0D();
                }
                if (this instanceof C23241Rv) {
                    HashSet A0D3 = C18260x0.A0D();
                    A0D3.add("message_frequent");
                    A0D3.add("message_future");
                    A0D3.add("labeled_jid");
                    A0D3.add("message_link");
                    A0D3.add("message_location");
                    A0D3.add("message_media");
                    A0D3.add("message_mention");
                    A0D3.add("missed_calls");
                    A0D3.add("payment_transaction");
                    A0D3.add("message_quoted");
                    A0D3.add("message_revoked");
                    A0D3.add("message_send_count");
                    A0D3.add("message_system");
                    A0D3.add("message_text");
                    A0D3.add("message_vcard");
                    A0D3.add("call_log");
                    return A0D3;
                } else if (this instanceof C23141Rl) {
                    return C18260x0.A0D();
                } else {
                    if (this instanceof C23201Rr) {
                        return C18260x0.A0D();
                    }
                    if (this instanceof C23131Rk) {
                        return C18260x0.A0D();
                    }
                    if (this instanceof C23051Rc) {
                        return C18260x0.A0D();
                    }
                    if (this instanceof C23091Rg) {
                        return C18260x0.A0D();
                    }
                    return AnonymousClass002.A0K();
                }
            }
        }
    }

    public void A0I() {
        C56082rO r3 = this.A06;
        r3.A02(A0G());
        r3.A02(A0F());
        r3.A02(AnonymousClass000.A0X("_retry_revision", C23281Rz.A01(this)));
        int i = this.A00;
        if (Integer.MIN_VALUE != i) {
            r3.A02(AnonymousClass000.A0X("_in_progress", C23281Rz.A01(this)));
            r3.A03(A0E(), i);
        }
    }

    public final void A0J(AnonymousClass2R9 r7) {
        String str;
        C56082rO r4 = this.A06;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("migration_stats_");
        String A0X = AnonymousClass000.A0X(this.A0C, A0o);
        try {
            JSONObject A1G = AnonymousClass0x9.A1G();
            A1G.put("row_processed", r7.A03);
            A1G.put("row_skipped", r7.A04);
            A1G.put("db_size_change", r7.A00);
            A1G.put("migration_time_spent", r7.A01);
            A1G.put("retry_count", r7.A02);
            str = A1G.toString();
        } catch (JSONException e) {
            Log.e("Failed to save migration statistics to JSON object.", e);
            str = null;
        }
        r4.A05(A0X, str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x007d, code lost:
        if (r3 != -1) goto L_0x0026;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0K() {
        /*
            r15 = this;
            X.2zf r0 = r15.A03
            long r5 = r0.A03()
            X.2vW r0 = r15.A0A
            java.lang.String r10 = r15.A0C
            X.1VX r2 = r0.A00
            r1 = 402(0x192, float:5.63E-43)
            X.2vE r0 = X.C58422vE.A02
            java.lang.String r0 = r2.A0R(r0, r1)
            java.lang.String r0 = X.AnonymousClass0x9.A0z(r0)
            java.lang.String r1 = r0.trim()
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            r13 = 0
            if (r0 == 0) goto L_0x0045
            r3 = 0
        L_0x0026:
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 > 0) goto L_0x0087
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "DatabaseMigration/hasEnoughStorageForMigration/insufficient storage for migration; name="
            r1.append(r0)
            r1.append(r10)
            java.lang.String r0 = "; availableInternalPhoneStorage="
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = "; minInternalStorageRequired="
            X.C18270x1.A1B(r0, r1, r3)
            r0 = 0
            return r0
        L_0x0045:
            java.lang.String r0 = ";"
            java.lang.String[] r11 = r1.split(r0)
            int r9 = r11.length
            r12 = 0
            r8 = 0
        L_0x004e:
            r1 = -1
            if (r8 >= r9) goto L_0x0083
            r0 = r11[r8]
            java.lang.String r3 = r0.trim()
            boolean r0 = r3.startsWith(r10)
            if (r0 == 0) goto L_0x0080
            java.lang.String r0 = ":"
            java.lang.String[] r4 = r3.split(r0)
            int r3 = r4.length
            r0 = 2
            if (r3 != r0) goto L_0x0080
            r7 = r4[r12]
            r0 = 1
            r0 = r4[r0]
            long r3 = X.C615531h.A04(r0, r1)
            boolean r0 = r10.equals(r7)
            if (r0 == 0) goto L_0x0080
            int r0 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r0 < 0) goto L_0x0080
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0083
            goto L_0x0026
        L_0x0080:
            int r8 = r8 + 1
            goto L_0x004e
        L_0x0083:
            r3 = 10485760(0xa00000, double:5.180654E-317)
            goto L_0x0026
        L_0x0087:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass31D.A0K():boolean");
    }

    public boolean A0L() {
        return AnonymousClass001.A1U((this.A06.A00(A0G(), -1) > 0 ? 1 : (this.A06.A00(A0G(), -1) == 0 ? 0 : -1)));
    }

    public boolean A0M() {
        if ((this instanceof C23161Rn) || (this instanceof AnonymousClass1RY) || (this instanceof C23251Rw) || (this instanceof C23031Ra)) {
            return true;
        }
        if (this instanceof C23041Rb) {
            String A012 = this.A06.A01("drop_deprecated_tables_status");
            if (A012 != null) {
                return C18310x6.A1W(Integer.parseInt(A012));
            }
            return false;
        } else if ((this instanceof C23061Rd) || (this instanceof C23221Rt) || (this instanceof C23181Rp) || (this instanceof C23121Rj) || (this instanceof C23211Rs) || (this instanceof C23171Ro) || (this instanceof C23111Ri) || (this instanceof C23271Ry) || (this instanceof C23261Rx) || (this instanceof AnonymousClass1RX) || (this instanceof C23101Rh) || (this instanceof C23081Rf) || (this instanceof C23191Rq) || (this instanceof C23151Rm) || (this instanceof C23281Rz) || (this instanceof C23241Rv) || (this instanceof C23141Rl) || (this instanceof C23201Rr) || (this instanceof C23131Rk) || (this instanceof AnonymousClass1RZ) || (this instanceof C23051Rc) || !(this instanceof C23231Ru)) {
            return true;
        } else {
            C66533Lu r1 = ((C23231Ru) this).A00;
            if (!r1.A0N() || r1.A03() != 5) {
                return false;
            }
            return true;
        }
    }

    public boolean A0N() {
        if ((this instanceof C23251Rw) || (this instanceof C23031Ra) || (this instanceof C23061Rd) || (this instanceof C23181Rp)) {
            return true;
        }
        C58602vW r1 = this.A0A;
        String str = this.A0C;
        if (!r1.A02.contains(str)) {
            return C58602vW.A00(r1.A00.A0R(C58422vE.A02, 242), str);
        }
        return true;
    }

    public boolean A0O() {
        C41432Kf r1 = this.A07;
        String str = this.A0C;
        if (r1.A01.contains(str) || C58602vW.A00(r1.A00.A00.A0R(C58422vE.A02, 404), str)) {
            return true;
        }
        return false;
    }

    public boolean A0P() {
        int parseInt;
        int parseInt2;
        StringBuilder A0l;
        String str;
        StringBuilder A0l2;
        if ((this instanceof C23161Rn) || (this instanceof AnonymousClass1RY) || (this instanceof C23251Rw) || (this instanceof C23041Rb) || (this instanceof C23221Rt) || (this instanceof C23121Rj) || (this instanceof C23211Rs) || (this instanceof C23171Ro) || (this instanceof C23111Ri) || (this instanceof C23271Ry) || (this instanceof C23261Rx) || (this instanceof C23101Rh) || (this instanceof C23081Rf) || (this instanceof C23191Rq) || (this instanceof C23151Rm) || (this instanceof C23281Rz) || (this instanceof C23241Rv) || (this instanceof C23141Rl) || (this instanceof C23201Rr) || (this instanceof C23131Rk) || (this instanceof AnonymousClass1RZ) || (this instanceof C23051Rc) || (this instanceof C23231Ru) || (this instanceof C23091Rg) || (this instanceof C23071Re)) {
            return false;
        }
        if ((A0M() || A0L()) && !A0R()) {
            A0l = AnonymousClass000.A0l("DatabaseMigration/isStale, migration '");
            A0l.append(this.A0C);
            str = "' doesn't met dependency requirements, mark as stale.";
        } else {
            int i = this.A00;
            if (Integer.MIN_VALUE != i) {
                C56082rO r6 = this.A06;
                String A012 = r6.A01(AnonymousClass000.A0X("_in_progress", C23281Rz.A01(this)));
                if (A012 == null) {
                    parseInt = -1;
                } else {
                    parseInt = Integer.parseInt(A012);
                }
                if (A0L() && parseInt == -1) {
                    A0l2 = AnonymousClass000.A0l("DatabaseMigration/isStale, migration '");
                    A0l2.append(this.A0C);
                    A0l2.append("' started, but its version = ");
                    A0l2.append(parseInt);
                } else if (parseInt == -1 || parseInt == i) {
                    String A013 = r6.A01(A0E());
                    if (!(A013 == null || (parseInt2 = Integer.parseInt(A013)) == -1 || parseInt2 == i)) {
                        A0l = AnonymousClass000.A0l("DatabaseMigration/isStale, migration '");
                        A0l.append(this.A0C);
                        C18270x1.A19("' completed, but has version = ", ", expected version = ", A0l, parseInt2);
                        A0l.append(i);
                        str = ", mark as stale to re-run.";
                    }
                } else {
                    A0l2 = AnonymousClass000.A0l("DatabaseMigration/isStale, migration '");
                    A0l2.append(this.A0C);
                    C18270x1.A19("' started, but has version = ", ", expected version = ", A0l2, parseInt);
                    A0l2.append(i);
                }
                A0l2.append(", mark as stale.");
                C18280x3.A14(A0l2);
                return true;
            }
            return false;
        }
        A0l2.append(str);
        C18280x3.A14(A0l2);
        return true;
    }

    public boolean A0Q() {
        if ((this instanceof C23161Rn) || (this instanceof C23251Rw) || (this instanceof C23031Ra) || (this instanceof C23061Rd) || (this instanceof C23221Rt) || (this instanceof C23121Rj) || (this instanceof C23211Rs) || (this instanceof C23171Ro) || (this instanceof C23111Ri) || (this instanceof C23271Ry) || (this instanceof C23261Rx) || (this instanceof C23101Rh) || (this instanceof C23081Rf) || (this instanceof C23191Rq) || (this instanceof C23151Rm) || (this instanceof C23281Rz) || (this instanceof C23241Rv) || (this instanceof C23141Rl) || (this instanceof C23201Rr) || (this instanceof C23131Rk) || (this instanceof AnonymousClass1RZ) || (this instanceof C23051Rc) || (this instanceof C23231Ru) || (this instanceof C23091Rg) || (this instanceof C23071Re)) {
            return false;
        }
        return AnonymousClass001.A1W((A0B() > 100 ? 1 : (A0B() == 100 ? 0 : -1)));
    }

    public boolean A0S() {
        if (this instanceof C23251Rw) {
            return AnonymousClass000.A1W(C56972sr.A04(((C23251Rw) this).A00));
        }
        if (this instanceof C23221Rt) {
            return AnonymousClass000.A1W(C56972sr.A04(((C23221Rt) this).A00));
        }
        if (this instanceof C23181Rp) {
            return AnonymousClass000.A1W(C56972sr.A04(((C23181Rp) this).A00));
        }
        if (this instanceof C23271Ry) {
            return AnonymousClass000.A1W(C56972sr.A04(((C23271Ry) this).A00));
        }
        if (this instanceof C23261Rx) {
            return AnonymousClass000.A1W(C56972sr.A04(((C23261Rx) this).A00));
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:151:0x0293, code lost:
        X.C18260x0.A0s("DatabaseMigration/doMigration/conditions check requires to stop migration process; name = ", r7, X.AnonymousClass001.A0o());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x02c2, code lost:
        if (r1 == 0) goto L_0x02c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:344:?, code lost:
        r21 = A02(r37);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:345:0x067e, code lost:
        r9 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:346:0x067f, code lost:
        r20 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:372:0x06ae, code lost:
        r20 = true;
     */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x028d A[Catch:{ Exception -> 0x06a1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:404:0x07e7  */
    /* JADX WARNING: Removed duplicated region for block: B:407:0x07fb  */
    /* JADX WARNING: Removed duplicated region for block: B:409:0x0800  */
    /* JADX WARNING: Removed duplicated region for block: B:415:0x0827  */
    /* JADX WARNING: Removed duplicated region for block: B:416:0x082b  */
    /* JADX WARNING: Removed duplicated region for block: B:420:0x0839  */
    /* JADX WARNING: Removed duplicated region for block: B:443:0x028b A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0T(X.C44342Vr r37) {
        /*
            r36 = this;
            java.lang.String r26 = "DatabaseMigration/afterMigration/error; name="
            java.lang.String r25 = "; time spent="
            java.lang.String r23 = "; current_index="
            r8 = r36
            boolean r0 = r8.A0P()
            java.lang.String r2 = "DatabaseMigration/doMigration/begin; name="
            r4 = 0
            if (r0 == 0) goto L_0x0024
            X.2qk r3 = r8.A01
            java.lang.String r1 = "db-migration-stale"
            java.lang.String r0 = r8.A0C
            r3.A0A(r1, r4, r0)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0m(r2, r0)
            java.lang.String r0 = " is stale, should be rolled back first."
            X.C18260x0.A1L(r1, r0)
            return r4
        L_0x0024:
            X.2rO r12 = r8.A06
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "migration_stats_"
            r1.append(r0)
            java.lang.String r7 = r8.A0C
            java.lang.String r0 = X.AnonymousClass000.A0X(r7, r1)
            java.lang.String r3 = r12.A01(r0)
            java.lang.String r5 = "retry_count"
            java.lang.String r9 = "migration_time_spent"
            java.lang.String r10 = "db_size_change"
            java.lang.String r11 = "row_skipped"
            java.lang.String r1 = "row_processed"
            if (r3 != 0) goto L_0x00a5
            X.2R9 r6 = new X.2R9
            r6.<init>()
        L_0x004f:
            long r0 = r6.A02
            r4 = 0
            int r3 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r3 != 0) goto L_0x005d
            long r0 = r8.A0B()
            r6.A02 = r0
        L_0x005d:
            X.3dV r0 = r8.A05
            r35 = r0
            r35.A05()
            java.io.File r0 = r0.A05
            r34 = r0
            long r16 = r34.length()
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0m(r2, r7)
            java.lang.String r0 = "; before_size="
            r2.append(r0)
            r0 = r16
            r2.append(r0)
            java.lang.String r0 = "; start_index="
            r2.append(r0)
            java.lang.String r24 = r8.A0G()
            r0 = -1
            r3 = r24
            long r0 = r12.A00(r3, r0)
            X.C18260x0.A1I(r2, r0)
            r18 = 0
            X.33M r22 = X.AnonymousClass33M.A02(r18)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r7)
            java.lang.String r0 = "/before_migrate"
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)
            X.33M r14 = X.AnonymousClass33M.A01(r0)
            r19 = 1
            goto L_0x00fd
        L_0x00a5:
            org.json.JSONObject r4 = X.AnonymousClass0x9.A1H(r3)     // Catch:{ JSONException -> 0x00ec }
            X.2R9 r6 = new X.2R9     // Catch:{ JSONException -> 0x00ec }
            r6.<init>()     // Catch:{ JSONException -> 0x00ec }
            boolean r0 = r4.has(r1)     // Catch:{ JSONException -> 0x00ec }
            if (r0 == 0) goto L_0x00ba
            long r0 = r4.getLong(r1)     // Catch:{ JSONException -> 0x00ec }
            r6.A03 = r0     // Catch:{ JSONException -> 0x00ec }
        L_0x00ba:
            boolean r0 = r4.has(r11)     // Catch:{ JSONException -> 0x00ec }
            if (r0 == 0) goto L_0x00c6
            long r0 = r4.getLong(r11)     // Catch:{ JSONException -> 0x00ec }
            r6.A04 = r0     // Catch:{ JSONException -> 0x00ec }
        L_0x00c6:
            boolean r0 = r4.has(r10)     // Catch:{ JSONException -> 0x00ec }
            if (r0 == 0) goto L_0x00d2
            long r0 = r4.getLong(r10)     // Catch:{ JSONException -> 0x00ec }
            r6.A00 = r0     // Catch:{ JSONException -> 0x00ec }
        L_0x00d2:
            boolean r0 = r4.has(r9)     // Catch:{ JSONException -> 0x00ec }
            if (r0 == 0) goto L_0x00de
            long r0 = r4.getLong(r9)     // Catch:{ JSONException -> 0x00ec }
            r6.A01 = r0     // Catch:{ JSONException -> 0x00ec }
        L_0x00de:
            boolean r0 = r4.has(r5)     // Catch:{ JSONException -> 0x00ec }
            if (r0 == 0) goto L_0x004f
            long r0 = r4.getLong(r5)     // Catch:{ JSONException -> 0x00ec }
            r6.A02 = r0     // Catch:{ JSONException -> 0x00ec }
            goto L_0x004f
        L_0x00ec:
            r4 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Failed to read migration statistics from stored data; reset to default values. Data: "
            X.C18260x0.A0u(r0, r3, r1, r4)
            X.2R9 r6 = new X.2R9
            r6.<init>()
            goto L_0x004f
        L_0x00fd:
            boolean r0 = r8.A0K()     // Catch:{ Exception -> 0x0263 }
            if (r0 != 0) goto L_0x0104
            goto L_0x0118
        L_0x0104:
            boolean r0 = r37.A00()     // Catch:{ Exception -> 0x0263 }
            if (r0 != 0) goto L_0x0123
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ Exception -> 0x0263 }
            java.lang.String r0 = "DatabaseMigration/doMigration/conditions check requires to stop migration process; name="
            X.C18260x0.A0s(r0, r7, r1)     // Catch:{ Exception -> 0x0263 }
            int r21 = A02(r37)     // Catch:{ Exception -> 0x011e }
            goto L_0x011a
        L_0x0118:
            r21 = 2
        L_0x011a:
            r20 = 1
            goto L_0x027d
        L_0x011e:
            r9 = move-exception
            r20 = 1
            goto L_0x0266
        L_0x0123:
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = r8.A00     // Catch:{ Exception -> 0x0263 }
            if (r0 == r1) goto L_0x0136
            java.lang.StringBuilder r2 = X.C23281Rz.A01(r8)     // Catch:{ Exception -> 0x0263 }
            java.lang.String r0 = "_in_progress"
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r2)     // Catch:{ Exception -> 0x0263 }
            r12.A03(r0, r1)     // Catch:{ Exception -> 0x0263 }
        L_0x0136:
            r0 = -1
            long r4 = r12.A00(r3, r0)     // Catch:{ Exception -> 0x0263 }
            r2 = 0
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x0147
            r0 = r24
            r12.A04(r0, r2)     // Catch:{ Exception -> 0x0263 }
        L_0x0147:
            boolean r0 = r8 instanceof X.C23251Rw     // Catch:{ Exception -> 0x0263 }
            if (r0 == 0) goto L_0x01f5
            r1 = r8
            X.1Rw r1 = (X.C23251Rw) r1     // Catch:{ Exception -> 0x0263 }
            X.2rO r5 = r1.A06     // Catch:{ Exception -> 0x0263 }
            java.lang.String r4 = "participant_user_ready"
            java.lang.String r0 = r5.A01(r4)     // Catch:{ Exception -> 0x0263 }
            if (r0 == 0) goto L_0x0279
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ Exception -> 0x0263 }
            r2 = r19
            if (r0 != r2) goto L_0x0279
            java.lang.String r0 = "ParticipantUserDatabaseMigration/resetMigration"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ Exception -> 0x0263 }
            X.4Fq r13 = A03(r1)     // Catch:{ SQLException -> 0x01ed }
            X.3Yo r11 = r13.Axl()     // Catch:{ all -> 0x01e3 }
            X.33h r0 = r1.A02     // Catch:{ all -> 0x01d9 }
            X.4Fq r10 = X.C620533h.A02(r0)     // Catch:{ all -> 0x01d9 }
            X.3Yo r9 = r10.Axl()     // Catch:{ all -> 0x01cf }
            r0 = r10
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x01c5 }
            X.2sg r3 = r0.A03     // Catch:{ all -> 0x01c5 }
            java.lang.String r1 = "group_participant_user"
            java.lang.String r0 = "CLEAR_TABLE_GROUP_PARTICIPANT_USER"
            r2 = 0
            r3.A07(r1, r2, r0, r2)     // Catch:{ all -> 0x01c5 }
            java.lang.String r1 = "group_participant_device"
            java.lang.String r0 = "CLEAR_TABLE_GROUP_PARTICIPANT_DEVICE"
            r3.A07(r1, r2, r0, r2)     // Catch:{ all -> 0x01c5 }
            r9.A00()     // Catch:{ all -> 0x01c5 }
            r9.close()     // Catch:{ all -> 0x01cf }
            r10.close()     // Catch:{ all -> 0x01d9 }
            r5.A02(r4)     // Catch:{ all -> 0x01d9 }
            java.lang.String r0 = "migration_participant_user_index"
            r5.A02(r0)     // Catch:{ all -> 0x01d9 }
            java.lang.String r0 = "migration_participant_user_retry"
            r5.A02(r0)     // Catch:{ all -> 0x01d9 }
            java.lang.String r0 = "broadcast_me_jid_ready"
            r5.A02(r0)     // Catch:{ all -> 0x01d9 }
            java.lang.String r0 = "migration_broadcast_me_jid_index"
            r5.A02(r0)     // Catch:{ all -> 0x01d9 }
            java.lang.String r0 = "migration_broadcast_me_jid_retry"
            r5.A02(r0)     // Catch:{ all -> 0x01d9 }
            r11.A00()     // Catch:{ all -> 0x01d9 }
            java.lang.String r0 = "ParticipantUserDatabaseMigration/resetMigration success"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x01d9 }
            r11.close()     // Catch:{ all -> 0x01e3 }
            r13.close()     // Catch:{ SQLException -> 0x01ed }
            goto L_0x0279
        L_0x01c5:
            r1 = move-exception
            r9.close()     // Catch:{ all -> 0x01ca }
            goto L_0x01ce
        L_0x01ca:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x01cf }
        L_0x01ce:
            throw r1     // Catch:{ all -> 0x01cf }
        L_0x01cf:
            r1 = move-exception
            r10.close()     // Catch:{ all -> 0x01d4 }
            goto L_0x01d8
        L_0x01d4:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x01d9 }
        L_0x01d8:
            throw r1     // Catch:{ all -> 0x01d9 }
        L_0x01d9:
            r1 = move-exception
            r11.close()     // Catch:{ all -> 0x01de }
            goto L_0x01e2
        L_0x01de:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x01e3 }
        L_0x01e2:
            throw r1     // Catch:{ all -> 0x01e3 }
        L_0x01e3:
            r1 = move-exception
            r13.close()     // Catch:{ all -> 0x01e8 }
            goto L_0x01ec
        L_0x01e8:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ SQLException -> 0x01ed }
        L_0x01ec:
            throw r1     // Catch:{ SQLException -> 0x01ed }
        L_0x01ed:
            r1 = move-exception
            java.lang.String r0 = "ParticipantUserDatabaseMigration/resetMigration failed"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ Exception -> 0x0263 }
            goto L_0x0279
        L_0x01f5:
            boolean r0 = r8 instanceof X.C23261Rx     // Catch:{ Exception -> 0x0263 }
            if (r0 == 0) goto L_0x020a
            X.4Fq r3 = A03(r8)     // Catch:{ Exception -> 0x0263 }
            java.lang.String r2 = "ReceiptDeviceDatabaseMigration"
            r0 = r3
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x024c }
            X.2sg r1 = r0.A03     // Catch:{ all -> 0x024c }
            java.lang.String r0 = "jid_key_index"
            X.C626235v.A02(r1, r2, r0)     // Catch:{ all -> 0x024c }
            goto L_0x0248
        L_0x020a:
            boolean r0 = r8 instanceof X.C23241Rv     // Catch:{ Exception -> 0x0263 }
            if (r0 == 0) goto L_0x0256
            r9 = r8
            X.1Rv r9 = (X.C23241Rv) r9     // Catch:{ Exception -> 0x0263 }
            X.2rO r5 = r9.A06     // Catch:{ Exception -> 0x0263 }
            java.lang.String r4 = "migration_message_main_index"
            r0 = -1
            long r4 = r5.A00(r4, r0)     // Catch:{ Exception -> 0x0263 }
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 > 0) goto L_0x0279
            X.1VX r2 = r9.A03     // Catch:{ Exception -> 0x0263 }
            r1 = 1350(0x546, float:1.892E-42)
            X.2vE r0 = X.C58422vE.A02     // Catch:{ Exception -> 0x0263 }
            boolean r0 = r2.A0Y(r0, r1)     // Catch:{ Exception -> 0x0263 }
            if (r0 == 0) goto L_0x0279
            X.4Fq r3 = A03(r9)     // Catch:{ Exception -> 0x0263 }
            r0 = r3
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x024c }
            X.2sg r2 = r0.A03     // Catch:{ all -> 0x024c }
            java.lang.String r1 = "CREATE INDEX IF NOT EXISTS message_chat_sort_id_index ON message (chat_row_id, sort_id)"
            java.lang.String r0 = "CREATE_MESSAGE_JID_SORT_ID_INDEX"
            r2.A0H(r1, r0)     // Catch:{ all -> 0x024c }
            java.lang.String r1 = "CREATE INDEX IF NOT EXISTS message_starred_sort_id_index ON message (starred, sort_id)"
            java.lang.String r0 = "CREATE_MESSAGE_STARRED_SORT_ID_INDEX"
            r2.A0H(r1, r0)     // Catch:{ all -> 0x024c }
            java.lang.String r0 = "MainMessageDatabaseMigration/onBeforeMigration/ Create chat sort_id index"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x024c }
        L_0x0248:
            r3.close()     // Catch:{ Exception -> 0x0263 }
            goto L_0x0279
        L_0x024c:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x0251 }
            goto L_0x0255
        L_0x0251:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ Exception -> 0x0263 }
        L_0x0255:
            throw r1     // Catch:{ Exception -> 0x0263 }
        L_0x0256:
            boolean r0 = r8 instanceof X.C23231Ru     // Catch:{ Exception -> 0x0263 }
            if (r0 == 0) goto L_0x0279
            r0 = r8
            X.1Ru r0 = (X.C23231Ru) r0     // Catch:{ Exception -> 0x0263 }
            X.3Lu r0 = r0.A00     // Catch:{ Exception -> 0x0263 }
            r0.A0I()     // Catch:{ Exception -> 0x0263 }
            goto L_0x0279
        L_0x0263:
            r9 = move-exception
            r20 = 0
        L_0x0266:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "DatabaseMigration/beforeMigration/error; name="
            X.C18260x0.A0u(r0, r7, r1, r9)
            X.2qk r1 = r8.A01
            java.lang.String r0 = "before-migration"
            X.AnonymousClass266.A00(r1, r7, r0, r9)
            r21 = 0
            goto L_0x027e
        L_0x0279:
            r21 = 0
            r20 = 0
        L_0x027d:
            r9 = 0
        L_0x027e:
            r14.A07()
            if (r9 != 0) goto L_0x074b
            if (r20 != 0) goto L_0x074b
        L_0x0285:
            boolean r0 = r8.A0K()     // Catch:{ Exception -> 0x06a1 }
            if (r0 != 0) goto L_0x028d
            goto L_0x06ac
        L_0x028d:
            boolean r0 = r37.A00()     // Catch:{ Exception -> 0x06a1 }
            if (r0 != 0) goto L_0x029e
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ Exception -> 0x06a1 }
            java.lang.String r0 = "DatabaseMigration/doMigration/conditions check requires to stop migration process; name = "
            X.C18260x0.A0s(r0, r7, r1)     // Catch:{ Exception -> 0x06a1 }
            goto L_0x0679
        L_0x029e:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r7)     // Catch:{ Exception -> 0x06a1 }
            java.lang.String r0 = "/doMigrationInSmallBatch/processBatch"
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)     // Catch:{ Exception -> 0x06a1 }
            X.33M r32 = X.AnonymousClass33M.A01(r0)     // Catch:{ Exception -> 0x06a1 }
            r32.A09()     // Catch:{ Exception -> 0x06a1 }
            boolean r0 = r8 instanceof X.AnonymousClass1RY     // Catch:{ Exception -> 0x06a1 }
            if (r0 == 0) goto L_0x02f7
            r0 = r35
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = r0.A07     // Catch:{ Exception -> 0x06a1 }
            int r1 = r0.getWriteHoldCount()     // Catch:{ Exception -> 0x06a1 }
            if (r1 > 0) goto L_0x02c4
            int r1 = r0.getReadHoldCount()     // Catch:{ Exception -> 0x06a1 }
            r0 = 0
            if (r1 != 0) goto L_0x02c5
        L_0x02c4:
            r0 = 1
        L_0x02c5:
            X.C626936e.A0C(r0)     // Catch:{ Exception -> 0x06a1 }
            r35.A05()     // Catch:{ Exception -> 0x06a1 }
            r0 = r35
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r2 = r0.A06     // Catch:{ Exception -> 0x06a1 }
            r2.lock()     // Catch:{ Exception -> 0x06a1 }
            X.4Fq r4 = r35.A04()     // Catch:{ all -> 0x068c }
            r0 = r4
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x0682 }
            X.2sg r3 = r0.A03     // Catch:{ all -> 0x0682 }
            java.lang.String r1 = "DROP VIEW IF EXISTS message_view_old_schema"
            java.lang.String r0 = "DROP_MESSAGE_VIEW_OLD_SCHEMA_FROM_V1"
            r3.A0H(r1, r0)     // Catch:{ all -> 0x0682 }
            r4.close()     // Catch:{ all -> 0x068c }
            r2.unlock()     // Catch:{ Exception -> 0x06a1 }
            X.32H r5 = new X.32H     // Catch:{ Exception -> 0x06a1 }
            r5.<init>()     // Catch:{ Exception -> 0x06a1 }
            r0 = 0
            r5.A04 = r0     // Catch:{ Exception -> 0x06a1 }
            r0 = r18
            r5.A01 = r0     // Catch:{ Exception -> 0x06a1 }
            goto L_0x05e8
        L_0x02f7:
            boolean r0 = r8 instanceof X.C23041Rb     // Catch:{ Exception -> 0x06a1 }
            if (r0 == 0) goto L_0x0354
            X.32H r5 = new X.32H     // Catch:{ Exception -> 0x06a1 }
            r5.<init>()     // Catch:{ Exception -> 0x06a1 }
            r0 = 0
            r5.A04 = r0     // Catch:{ Exception -> 0x06a1 }
            r0 = r18
            r5.A01 = r0     // Catch:{ Exception -> 0x06a1 }
            X.4Fq r27 = A03(r8)     // Catch:{ Exception -> 0x06a1 }
            java.lang.String[] r11 = X.C18620xz.A0C     // Catch:{ all -> 0x0691 }
            int r10 = r11.length     // Catch:{ all -> 0x0691 }
            r4 = 0
        L_0x0310:
            if (r4 >= r10) goto L_0x05e5
            r0 = r11[r4]     // Catch:{ all -> 0x0691 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r0)     // Catch:{ all -> 0x0691 }
            java.lang.String r0 = "_old"
            java.lang.String r3 = X.AnonymousClass000.A0X(r0, r1)     // Catch:{ all -> 0x0691 }
            r0 = r27
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x0691 }
            X.2sg r2 = r0.A03     // Catch:{ all -> 0x0691 }
            java.lang.String r0 = "table"
            java.lang.String r15 = X.C626235v.A00(r2, r0, r3)     // Catch:{ all -> 0x0691 }
            long r0 = r5.A04     // Catch:{ all -> 0x0691 }
            r13 = 1
            long r0 = r0 + r13
            r5.A04 = r0     // Catch:{ all -> 0x0691 }
            boolean r0 = android.text.TextUtils.isEmpty(r15)     // Catch:{ all -> 0x0691 }
            if (r0 == 0) goto L_0x033b
            int r4 = r4 + 1
            goto L_0x0310
        L_0x033b:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0691 }
            java.lang.String r0 = "DROP TABLE IF EXISTS "
            java.lang.String r1 = X.AnonymousClass000.A0V(r0, r3, r1)     // Catch:{ all -> 0x0691 }
            r0 = r18
            java.lang.String[] r3 = new java.lang.String[r0]     // Catch:{ all -> 0x0691 }
            java.lang.String r0 = "DropDeprecatedTablesMigration/DROP_TABLE"
            r2.A0I(r1, r0, r3)     // Catch:{ all -> 0x0691 }
            r0 = r19
            r5.A01 = r0     // Catch:{ all -> 0x0691 }
            goto L_0x05e5
        L_0x0354:
            java.lang.String r31 = "; batchSize="
            java.lang.String r30 = "DatabaseMigration/doMigrationInSmallBatch/error; name="
            X.32H r5 = new X.32H     // Catch:{ Exception -> 0x06a1 }
            r5.<init>()     // Catch:{ Exception -> 0x06a1 }
            X.2vW r0 = r8.A0A     // Catch:{ Exception -> 0x06a1 }
            X.1VX r3 = r0.A00     // Catch:{ Exception -> 0x06a1 }
            r0 = 607(0x25f, float:8.5E-43)
            X.2vE r1 = X.C58422vE.A02     // Catch:{ Exception -> 0x06a1 }
            int r2 = r3.A0O(r1, r0)     // Catch:{ Exception -> 0x06a1 }
            r35.A05()     // Catch:{ Exception -> 0x06a1 }
            long r10 = r34.length()     // Catch:{ Exception -> 0x06a1 }
            r0 = 780(0x30c, float:1.093E-42)
            int r0 = r3.A0O(r1, r0)     // Catch:{ Exception -> 0x06a1 }
            int r0 = r0 * 1024
            int r0 = r0 * 1024
            long r0 = (long) r0     // Catch:{ Exception -> 0x06a1 }
            int r3 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r3 <= 0) goto L_0x0382
            if (r2 <= 0) goto L_0x0382
            goto L_0x0387
        L_0x0382:
            int r4 = r8.A08()     // Catch:{ Exception -> 0x06a1 }
            goto L_0x038f
        L_0x0387:
            int r0 = r8.A08()     // Catch:{ Exception -> 0x06a1 }
            int r4 = java.lang.Math.min(r0, r2)     // Catch:{ Exception -> 0x06a1 }
        L_0x038f:
            r5.A02 = r4     // Catch:{ Exception -> 0x06a1 }
            java.lang.String r29 = r8.A0G()     // Catch:{ Exception -> 0x06a1 }
            r0 = -1
            r2 = r29
            long r2 = r12.A00(r2, r0)     // Catch:{ Exception -> 0x06a1 }
            r5.A04 = r2     // Catch:{ Exception -> 0x06a1 }
            r0 = 0
            int r10 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r10 >= 0) goto L_0x03b1
            java.lang.String r2 = "DatabaseMigration/doMigrationInSmallBatch/start index was not set to 0."
            com.whatsapp.util.Log.e((java.lang.String) r2)     // Catch:{ Exception -> 0x06a1 }
            r5.A04 = r0     // Catch:{ Exception -> 0x06a1 }
            r2 = r29
            r12.A04(r2, r0)     // Catch:{ Exception -> 0x06a1 }
        L_0x03b1:
            int r1 = r5.A01     // Catch:{ Exception -> 0x06a1 }
            int r0 = r5.A03     // Catch:{ Exception -> 0x06a1 }
            int r1 = r1 + r0
            int r0 = r5.A00     // Catch:{ Exception -> 0x06a1 }
            int r1 = r1 + r0
            int r0 = r5.A02     // Catch:{ Exception -> 0x06a1 }
            if (r1 >= r0) goto L_0x05e8
            boolean r0 = r37.A00()     // Catch:{ Exception -> 0x06a1 }
            if (r0 != 0) goto L_0x03d1
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ Exception -> 0x06a1 }
            java.lang.String r0 = "DatabaseMigration/doMigrationInSmallBatch/conditions check requires to stop migration process; name="
            r1.append(r0)     // Catch:{ Exception -> 0x06a1 }
            X.C18260x0.A1L(r1, r7)     // Catch:{ Exception -> 0x06a1 }
            goto L_0x05e8
        L_0x03d1:
            r35.A05()     // Catch:{ Exception -> 0x06a1 }
            r0 = r35
            X.0xz r0 = r0.A04     // Catch:{ Exception -> 0x06a1 }
            X.2sg r0 = r0.BEc()     // Catch:{ Exception -> 0x06a1 }
            android.database.sqlite.SQLiteDatabase r0 = r0.A00     // Catch:{ Exception -> 0x06a1 }
            boolean r0 = r0.inTransaction()     // Catch:{ Exception -> 0x06a1 }
            r1 = r0 ^ 1
            java.lang.String r0 = "Database migration shouldn't be wrapped to a transaction."
            X.C626936e.A0D(r1, r0)     // Catch:{ Exception -> 0x06a1 }
            X.4GK r28 = r35.get()     // Catch:{ Exception -> 0x0494 }
            long r0 = r5.A04     // Catch:{ all -> 0x048a }
            boolean r2 = r8 instanceof X.C23231Ru     // Catch:{ all -> 0x048a }
            if (r2 == 0) goto L_0x0486
            r10 = r8
            X.1Ru r10 = (X.C23231Ru) r10     // Catch:{ all -> 0x048a }
            java.util.Map r2 = r10.A01     // Catch:{ all -> 0x048a }
            r33 = r2
            r33.clear()     // Catch:{ all -> 0x048a }
            r2 = r28
            X.3H0 r2 = (X.AnonymousClass3H0) r2     // Catch:{ Exception -> 0x0479 }
            X.2sg r11 = r2.A03     // Catch:{ Exception -> 0x0479 }
            java.lang.String r3 = X.AnonymousClass2C7.A00     // Catch:{ Exception -> 0x0479 }
            java.lang.String[] r2 = X.AnonymousClass0x9.A1Z()     // Catch:{ Exception -> 0x0479 }
            boolean r27 = X.AnonymousClass0x7.A1W(r2, r0)     // Catch:{ Exception -> 0x0479 }
            X.C18270x1.A1P(r2, r4)     // Catch:{ Exception -> 0x0479 }
            java.lang.String r0 = "MIGRATION_GET_PRE_BATCH_QUERY_FOR_message_fts"
            android.database.Cursor r13 = r11.A0E(r3, r0, r2)     // Catch:{ Exception -> 0x0479 }
            java.lang.String r0 = "chat_row_id"
            int r11 = r13.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x046d }
            int r3 = X.AnonymousClass0x7.A02(r13)     // Catch:{ all -> 0x046d }
        L_0x0420:
            boolean r0 = r13.moveToNext()     // Catch:{ all -> 0x046d }
            if (r0 == 0) goto L_0x0469
            X.3Lu r2 = r10.A00     // Catch:{ Exception -> 0x0462 }
            X.34x r1 = r2.A08(r13, r11, r3)     // Catch:{ Exception -> 0x0462 }
            if (r1 == 0) goto L_0x0420
            r0 = r27
            boolean r0 = X.C66533Lu.A02(r1, r0)     // Catch:{ Exception -> 0x0462 }
            if (r0 != 0) goto L_0x0420
            java.lang.String r14 = r2.A0D(r1)     // Catch:{ Exception -> 0x0462 }
            int r15 = r14.length()     // Catch:{ Exception -> 0x0462 }
            r0 = 4096(0x1000, float:5.74E-42)
            if (r15 >= r0) goto L_0x0420
            java.util.regex.Pattern r0 = X.AnonymousClass2BP.A00     // Catch:{ Exception -> 0x0462 }
            java.util.regex.Matcher r0 = r0.matcher(r14)     // Catch:{ Exception -> 0x0462 }
            boolean r0 = r0.find()     // Catch:{ Exception -> 0x0462 }
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0420
            X.33j r0 = r2.A06     // Catch:{ Exception -> 0x0462 }
            java.lang.String r2 = X.C107155an.A01(r0, r14)     // Catch:{ Exception -> 0x0462 }
            long r0 = r1.A1M     // Catch:{ Exception -> 0x0462 }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ Exception -> 0x0462 }
            r0 = r33
            r0.put(r1, r2)     // Catch:{ Exception -> 0x0462 }
            goto L_0x0420
        L_0x0462:
            r1 = move-exception
            java.lang.String r0 = "FtsDatabaseMigration/preProcessBatch/single fail to preTokenize"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x046d }
            goto L_0x0420
        L_0x0469:
            r13.close()     // Catch:{ Exception -> 0x0479 }
            goto L_0x0486
        L_0x046d:
            r1 = move-exception
            if (r13 == 0) goto L_0x0478
            r13.close()     // Catch:{ all -> 0x0474 }
            goto L_0x0478
        L_0x0474:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ Exception -> 0x0479 }
        L_0x0478:
            throw r1     // Catch:{ Exception -> 0x0479 }
        L_0x0479:
            r1 = move-exception
            java.lang.String r0 = "FtsDatabaseMigration/preProcessBatch/inner fail to preTokenize"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ Exception -> 0x0480 }
            goto L_0x0486
        L_0x0480:
            r1 = move-exception
            java.lang.String r0 = "FtsDatabaseMigration/preProcessBatch/failed to preTokenize"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x048a }
        L_0x0486:
            r28.close()     // Catch:{ Exception -> 0x0494 }
            goto L_0x04af
        L_0x048a:
            r1 = move-exception
            r28.close()     // Catch:{ all -> 0x048f }
            goto L_0x0493
        L_0x048f:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ Exception -> 0x0494 }
        L_0x0493:
            throw r1     // Catch:{ Exception -> 0x0494 }
        L_0x0494:
            r3 = move-exception
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0l(r30)     // Catch:{ Exception -> 0x06a1 }
            r2.append(r7)     // Catch:{ Exception -> 0x06a1 }
            java.lang.String r0 = "; failed preBatchWork; startIndex="
            r2.append(r0)     // Catch:{ Exception -> 0x06a1 }
            long r0 = r5.A04     // Catch:{ Exception -> 0x06a1 }
            r2.append(r0)     // Catch:{ Exception -> 0x06a1 }
            r0 = r31
            java.lang.String r0 = X.AnonymousClass000.A0Y(r0, r2, r4)     // Catch:{ Exception -> 0x06a1 }
            com.whatsapp.util.Log.e(r0, r3)     // Catch:{ Exception -> 0x06a1 }
        L_0x04af:
            X.4Fq r10 = r35.A04()     // Catch:{ Exception -> 0x06a1 }
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0697 }
            java.lang.String r0 = "DatabaseMigration/doMigrationInSmallBatch; name="
            r2.append(r0)     // Catch:{ all -> 0x0697 }
            r2.append(r7)     // Catch:{ all -> 0x0697 }
            java.lang.String r0 = "; startIndex="
            r2.append(r0)     // Catch:{ all -> 0x0697 }
            long r0 = r5.A04     // Catch:{ all -> 0x0697 }
            r2.append(r0)     // Catch:{ all -> 0x0697 }
            r0 = r31
            X.C18260x0.A0y(r0, r2, r4)     // Catch:{ all -> 0x0697 }
            java.util.concurrent.atomic.AtomicBoolean r3 = new java.util.concurrent.atomic.AtomicBoolean     // Catch:{ all -> 0x0697 }
            r0 = r18
            r3.<init>(r0)     // Catch:{ all -> 0x0697 }
            X.32H r2 = new X.32H     // Catch:{ all -> 0x0697 }
            r2.<init>()     // Catch:{ all -> 0x0697 }
            r0 = 2
            X.31L r13 = new X.31L     // Catch:{ all -> 0x053f }
            r13.<init>(r8, r0, r3)     // Catch:{ all -> 0x053f }
            r0 = r10
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x053f }
            X.2sg r1 = r0.A03     // Catch:{ all -> 0x053f }
            X.37P r0 = r0.A02     // Catch:{ all -> 0x053f }
            X.3Yo r11 = new X.3Yo     // Catch:{ all -> 0x053f }
            r11.<init>(r13, r0, r1)     // Catch:{ all -> 0x053f }
            long r0 = r5.A04     // Catch:{ all -> 0x0535 }
            android.database.Cursor r14 = r8.A0C(r10, r4, r0)     // Catch:{ all -> 0x0535 }
            int r0 = r14.getCount()     // Catch:{ all -> 0x0529 }
            int r4 = java.lang.Math.min(r4, r0)     // Catch:{ all -> 0x0529 }
            if (r4 != 0) goto L_0x0509
            r11.A00()     // Catch:{ all -> 0x0507 }
            r14.close()     // Catch:{ all -> 0x0535 }
            r11.close()     // Catch:{ all -> 0x053f }
            goto L_0x05e1
        L_0x0507:
            r1 = move-exception
            goto L_0x052c
        L_0x0509:
            X.32H r2 = r8.A0D(r14)     // Catch:{ all -> 0x0529 }
            long r0 = r2.A04     // Catch:{ all -> 0x0529 }
            r27 = 0
            int r13 = (r0 > r27 ? 1 : (r0 == r27 ? 0 : -1))
            if (r13 <= 0) goto L_0x0522
            r13 = r29
            r12.A04(r13, r0)     // Catch:{ all -> 0x0529 }
            r11.A00()     // Catch:{ all -> 0x0529 }
            r0 = r19
            r3.set(r0)     // Catch:{ all -> 0x0529 }
        L_0x0522:
            r14.close()     // Catch:{ all -> 0x0535 }
            r11.close()     // Catch:{ all -> 0x053f }
            goto L_0x0551
        L_0x0529:
            r1 = move-exception
            if (r14 == 0) goto L_0x0534
        L_0x052c:
            r14.close()     // Catch:{ all -> 0x0530 }
            goto L_0x0534
        L_0x0530:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0535 }
        L_0x0534:
            throw r1     // Catch:{ all -> 0x0535 }
        L_0x0535:
            r1 = move-exception
            r11.close()     // Catch:{ all -> 0x053a }
            goto L_0x053e
        L_0x053a:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x053f }
        L_0x053e:
            throw r1     // Catch:{ all -> 0x053f }
        L_0x053f:
            r11 = move-exception
            boolean r13 = r8.A0U(r11, r4)     // Catch:{ all -> 0x0697 }
            r0 = -1
            if (r13 == 0) goto L_0x0696
            r11 = r18
            r3.set(r11)     // Catch:{ all -> 0x0697 }
            r2.A04 = r0     // Catch:{ all -> 0x0697 }
            r2.A01 = r11     // Catch:{ all -> 0x0697 }
        L_0x0551:
            boolean r0 = r3.get()     // Catch:{ all -> 0x0697 }
            if (r0 == 0) goto L_0x0581
            long r0 = r2.A04     // Catch:{ all -> 0x0697 }
            r5.A04 = r0     // Catch:{ all -> 0x0697 }
            r3 = r29
            r12.A04(r3, r0)     // Catch:{ all -> 0x0697 }
            int r13 = r5.A01     // Catch:{ all -> 0x0697 }
            int r0 = r2.A01     // Catch:{ all -> 0x0697 }
            int r13 = r13 + r0
            r5.A01 = r13     // Catch:{ all -> 0x0697 }
            int r11 = r5.A03     // Catch:{ all -> 0x0697 }
            int r0 = r2.A03     // Catch:{ all -> 0x0697 }
            int r11 = r11 + r0
            r5.A03 = r11     // Catch:{ all -> 0x0697 }
            int r3 = r5.A00     // Catch:{ all -> 0x0697 }
            int r0 = r2.A00     // Catch:{ all -> 0x0697 }
            int r3 = r3 + r0
            r5.A00 = r3     // Catch:{ all -> 0x0697 }
            int r1 = r5.A02     // Catch:{ all -> 0x0697 }
            int r1 = r1 - r13
            int r1 = r1 - r11
            int r1 = r1 - r3
            int r0 = r4 * 2
            int r4 = java.lang.Math.min(r1, r0)     // Catch:{ all -> 0x0697 }
            goto L_0x05dc
        L_0x0581:
            r0 = r19
            if (r4 != r0) goto L_0x05da
            long r0 = r5.A04     // Catch:{ SQLException -> 0x05b4 }
            r2 = r19
            android.database.Cursor r11 = r8.A0C(r10, r2, r0)     // Catch:{ SQLException -> 0x05b4 }
            boolean r0 = r11.moveToNext()     // Catch:{ all -> 0x05a8 }
            if (r0 == 0) goto L_0x05a4
            long r2 = r5.A04     // Catch:{ all -> 0x05a8 }
            java.lang.String r0 = "_id"
            int r0 = X.AnonymousClass0x2.A04(r11, r0)     // Catch:{ all -> 0x05a8 }
            int r0 = r0 - r19
            long r0 = (long) r0     // Catch:{ all -> 0x05a8 }
            long r0 = java.lang.Math.max(r2, r0)     // Catch:{ all -> 0x05a8 }
            r5.A04 = r0     // Catch:{ all -> 0x05a8 }
        L_0x05a4:
            r11.close()     // Catch:{ SQLException -> 0x05b4 }
            goto L_0x05b4
        L_0x05a8:
            r1 = move-exception
            if (r11 == 0) goto L_0x05b3
            r11.close()     // Catch:{ all -> 0x05af }
            goto L_0x05b3
        L_0x05af:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ SQLException -> 0x05b4 }
        L_0x05b3:
            throw r1     // Catch:{ SQLException -> 0x05b4 }
        L_0x05b4:
            r0 = r30
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0m(r0, r7)     // Catch:{ all -> 0x0697 }
            java.lang.String r0 = "; failed record - skipping row; index="
            r2.append(r0)     // Catch:{ all -> 0x0697 }
            long r0 = r5.A04     // Catch:{ all -> 0x0697 }
            r2.append(r0)     // Catch:{ all -> 0x0697 }
            X.C18280x3.A13(r2)     // Catch:{ all -> 0x0697 }
            long r0 = r5.A04     // Catch:{ all -> 0x0697 }
            r2 = 1
            long r0 = r0 + r2
            r5.A04 = r0     // Catch:{ all -> 0x0697 }
            int r2 = r5.A03     // Catch:{ all -> 0x0697 }
            int r2 = r2 + 1
            r5.A03 = r2     // Catch:{ all -> 0x0697 }
            r2 = r29
            r12.A04(r2, r0)     // Catch:{ all -> 0x0697 }
            goto L_0x05dc
        L_0x05da:
            int r4 = r4 / 2
        L_0x05dc:
            r10.close()     // Catch:{ Exception -> 0x06a1 }
            goto L_0x03b1
        L_0x05e1:
            r10.close()     // Catch:{ Exception -> 0x06a1 }
            goto L_0x05e8
        L_0x05e5:
            r27.close()     // Catch:{ Exception -> 0x06a1 }
        L_0x05e8:
            int r0 = r5.A01     // Catch:{ Exception -> 0x06a1 }
            long r2 = (long) r0     // Catch:{ Exception -> 0x06a1 }
            long r0 = r6.A03     // Catch:{ Exception -> 0x06a1 }
            long r0 = r0 + r2
            r6.A03 = r0     // Catch:{ Exception -> 0x06a1 }
            int r0 = r5.A03     // Catch:{ Exception -> 0x06a1 }
            long r2 = (long) r0     // Catch:{ Exception -> 0x06a1 }
            long r0 = r6.A04     // Catch:{ Exception -> 0x06a1 }
            long r0 = r0 + r2
            r6.A04 = r0     // Catch:{ Exception -> 0x06a1 }
            r8.A0J(r6)     // Catch:{ Exception -> 0x06a1 }
            int r1 = r5.A01     // Catch:{ Exception -> 0x06a1 }
            int r0 = r5.A03     // Catch:{ Exception -> 0x06a1 }
            int r1 = r1 + r0
            int r0 = r5.A00     // Catch:{ Exception -> 0x06a1 }
            int r1 = r1 + r0
            boolean r3 = X.AnonymousClass001.A1W(r1)
            r32.A07()     // Catch:{ Exception -> 0x06a1 }
            r0 = -1
            r2 = r24
            r12.A00(r2, r0)     // Catch:{ Exception -> 0x06a1 }
            r22.A06()     // Catch:{ Exception -> 0x06a1 }
            if (r3 == 0) goto L_0x06b0
            long r0 = r32.A06()     // Catch:{ Exception -> 0x06a1 }
            X.2vW r2 = r8.A0A     // Catch:{ Exception -> 0x06a1 }
            X.1VX r5 = r2.A00     // Catch:{ Exception -> 0x06a1 }
            r2 = 608(0x260, float:8.52E-43)
            X.2vE r4 = X.C58422vE.A02     // Catch:{ Exception -> 0x06a1 }
            int r2 = r5.A0O(r4, r2)     // Catch:{ Exception -> 0x06a1 }
            int r2 = r2 * 1000
            if (r2 <= 0) goto L_0x0285
            long r2 = (long) r2     // Catch:{ Exception -> 0x06a1 }
            int r10 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r10 <= 0) goto L_0x0285
            r35.A05()     // Catch:{ Exception -> 0x06a1 }
            long r13 = r34.length()     // Catch:{ Exception -> 0x06a1 }
            r2 = 780(0x30c, float:1.093E-42)
            int r2 = r5.A0O(r4, r2)     // Catch:{ Exception -> 0x06a1 }
            int r2 = r2 * 1024
            int r2 = r2 * 1024
            long r2 = (long) r2     // Catch:{ Exception -> 0x06a1 }
            int r10 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r10 <= 0) goto L_0x0653
            r0 = 779(0x30b, float:1.092E-42)
            int r0 = r5.A0O(r4, r0)     // Catch:{ Exception -> 0x06a1 }
            int r0 = r0 * 1000
            long r0 = (long) r0     // Catch:{ Exception -> 0x06a1 }
            android.os.SystemClock.sleep(r0)     // Catch:{ Exception -> 0x06a1 }
            goto L_0x0285
        L_0x0653:
            X.2qk r5 = r8.A01     // Catch:{ Exception -> 0x06a1 }
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()     // Catch:{ Exception -> 0x06a1 }
            java.lang.String r2 = "db-long-running-process-batch/"
            java.lang.String r4 = X.AnonymousClass000.A0V(r2, r7, r3)     // Catch:{ Exception -> 0x06a1 }
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()     // Catch:{ Exception -> 0x06a1 }
            java.lang.String r2 = "name="
            r3.append(r2)     // Catch:{ Exception -> 0x06a1 }
            r3.append(r7)     // Catch:{ Exception -> 0x06a1 }
            java.lang.String r2 = ", duration="
            java.lang.String r1 = X.AnonymousClass000.A0Z(r2, r3, r0)     // Catch:{ Exception -> 0x06a1 }
            r0 = r18
            r5.A0A(r4, r0, r1)     // Catch:{ Exception -> 0x06a1 }
            goto L_0x0285
        L_0x0679:
            int r21 = A02(r37)     // Catch:{ Exception -> 0x067e }
            goto L_0x06ae
        L_0x067e:
            r9 = move-exception
            r20 = 1
            goto L_0x06a2
        L_0x0682:
            r1 = move-exception
            r4.close()     // Catch:{ all -> 0x0687 }
            goto L_0x068b
        L_0x0687:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x068c }
        L_0x068b:
            throw r1     // Catch:{ all -> 0x068c }
        L_0x068c:
            r0 = move-exception
            r2.unlock()     // Catch:{ Exception -> 0x06a1 }
            goto L_0x06a0
        L_0x0691:
            r0 = move-exception
            r27.close()     // Catch:{ all -> 0x069c }
            goto L_0x06a0
        L_0x0696:
            throw r11     // Catch:{ all -> 0x0697 }
        L_0x0697:
            r0 = move-exception
            r10.close()     // Catch:{ all -> 0x069c }
            goto L_0x06a0
        L_0x069c:
            r1 = move-exception
            r0.addSuppressed(r1)     // Catch:{ Exception -> 0x06a1 }
        L_0x06a0:
            throw r0     // Catch:{ Exception -> 0x06a1 }
        L_0x06a1:
            r9 = move-exception
        L_0x06a2:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "DatabaseMigration/doMigration/error; name="
            X.C18260x0.A0u(r0, r7, r1, r9)
            goto L_0x06b0
        L_0x06ac:
            r21 = 2
        L_0x06ae:
            r20 = 1
        L_0x06b0:
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
            java.lang.String r1 = "DatabaseMigration/doMigration/migrated; name="
            r0 = r23
            X.AnonymousClass001.A1K(r1, r7, r0, r3)
            r0 = -1
            r2 = r24
            long r0 = r12.A00(r2, r0)
            r3.append(r0)
            r1 = r22
            r0 = r25
            X.AnonymousClass33M.A05(r1, r0, r3)
            if (r9 != 0) goto L_0x074b
            if (r20 != 0) goto L_0x074b
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r7)
            java.lang.String r0 = "/after_migrate"
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)
            X.33M r11 = X.AnonymousClass33M.A01(r0)
            boolean r0 = r8 instanceof X.C23181Rp     // Catch:{ 3ex -> 0x073e, Exception -> 0x072c }
            if (r0 == 0) goto L_0x0748
            r0 = r8
            X.1Rp r0 = (X.C23181Rp) r0     // Catch:{ 3ex -> 0x073e, Exception -> 0x072c }
            X.34p r5 = r0.A01     // Catch:{ 3ex -> 0x073e, Exception -> 0x072c }
            X.3dV r0 = r5.A01     // Catch:{ 3ex -> 0x073e, Exception -> 0x072c }
            X.4Fq r10 = r0.A04()     // Catch:{ 3ex -> 0x073e, Exception -> 0x072c }
            r0 = r10
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x0722 }
            X.2sg r4 = r0.A03     // Catch:{ all -> 0x0722 }
            java.lang.String r3 = "jid"
            java.lang.String r2 = "raw_string = ? AND type = ?"
            java.lang.String[] r1 = X.AnonymousClass0x9.A1Z()     // Catch:{ all -> 0x0722 }
            java.lang.String r0 = ""
            r1[r18] = r0     // Catch:{ all -> 0x0722 }
            r0 = 11
            X.C18270x1.A1P(r1, r0)     // Catch:{ all -> 0x0722 }
            java.lang.String r0 = "deleteBlankMeJid/DELETE_BLANK_ME_JID_SQL"
            int r0 = r4.A07(r3, r2, r0, r1)     // Catch:{ all -> 0x0722 }
            if (r0 <= 0) goto L_0x071e
            java.util.Map r1 = r5.A03     // Catch:{ all -> 0x0722 }
            X.1fY r0 = X.AnonymousClass1fY.A00     // Catch:{ all -> 0x0722 }
            java.lang.Object r1 = r1.remove(r0)     // Catch:{ all -> 0x0722 }
            java.lang.Long r1 = (java.lang.Long) r1     // Catch:{ all -> 0x0722 }
            if (r1 == 0) goto L_0x071e
            java.util.Map r0 = r5.A04     // Catch:{ all -> 0x0722 }
            r0.remove(r1)     // Catch:{ all -> 0x0722 }
        L_0x071e:
            r10.close()     // Catch:{ 3ex -> 0x073e, Exception -> 0x072c }
            goto L_0x0748
        L_0x0722:
            r1 = move-exception
            r10.close()     // Catch:{ all -> 0x0727 }
            goto L_0x072b
        L_0x0727:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ 3ex -> 0x073e, Exception -> 0x072c }
        L_0x072b:
            throw r1     // Catch:{ 3ex -> 0x073e, Exception -> 0x072c }
        L_0x072c:
            r9 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            r0 = r26
            X.C18260x0.A0u(r0, r7, r1, r9)
            X.2qk r1 = r8.A01
            java.lang.String r0 = "after-migration"
            X.AnonymousClass266.A00(r1, r7, r0, r9)
            goto L_0x0748
        L_0x073e:
            r9 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            r0 = r26
            X.C18260x0.A0u(r0, r7, r1, r9)
        L_0x0748:
            r11.A07()
        L_0x074b:
            r35.A05()
            long r0 = r34.length()
            long r4 = r0 - r16
            long r2 = r6.A00
            long r2 = r2 + r4
            r6.A00 = r2
            r8.A0J(r6)
            java.lang.StringBuilder r4 = X.AnonymousClass001.A0o()
            java.lang.String r2 = "DatabaseMigration/doMigration; name="
            r4.append(r2)
            r4.append(r7)
            java.lang.String r2 = "; db size:"
            r4.append(r2)
            r4.append(r0)
            java.lang.String r2 = " increase:"
            r4.append(r2)
            double r10 = (double) r0
            r0 = r16
            double r2 = (double) r0
            double r0 = r10 / r2
            r4.append(r0)
            X.C18280x3.A14(r4)
            boolean r23 = X.AnonymousClass000.A1W(r9)
            long r16 = r22.A07()
            long r14 = r6.A03
            long r0 = r6.A04
            r24 = r0
            X.1al r4 = new X.1al
            r4.<init>()
            X.2ws r13 = r8.A08
            long r0 = (long) r2
            java.util.List r5 = r13.A00
            long r0 = X.C59412ws.A00(r5, r0)
            java.lang.Double r0 = X.C18330xA.A07(r0)
            r4.A01 = r0
            long r0 = (long) r10
            long r0 = X.C59412ws.A00(r5, r0)
            java.lang.Double r0 = X.C18330xA.A07(r0)
            r4.A00 = r0
            r4.A09 = r7
            X.2zf r0 = r8.A03
            long r0 = r0.A03()
            double r2 = (double) r0
            long r0 = (long) r2
            long r0 = X.C59412ws.A00(r5, r0)
            java.lang.Double r0 = X.C18330xA.A07(r0)
            r4.A02 = r0
            java.lang.Long r0 = java.lang.Long.valueOf(r16)
            r4.A05 = r0
            java.util.List r0 = r13.A02
            long r0 = X.C59412ws.A00(r0, r14)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r4.A07 = r0
            java.lang.Long r0 = java.lang.Long.valueOf(r24)
            r4.A08 = r0
            long r0 = r8.A0B()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r4.A06 = r0
            r2 = 2
            if (r20 == 0) goto L_0x082b
            java.lang.Integer r1 = java.lang.Integer.valueOf(r19)
            r4.A04 = r1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r21)
            r4.A03 = r0
        L_0x07f3:
            int r1 = r1.intValue()
            X.4FV r0 = r8.A0B
            if (r1 != r2) goto L_0x0827
            r0.BhB(r4)
        L_0x07fe:
            if (r9 != 0) goto L_0x0839
            if (r20 != 0) goto L_0x0886
            long r3 = r6.A04
            double r1 = (double) r3
            long r3 = r6.A03
            double r5 = (double) r3
            r3 = 4587366580439587226(0x3fa999999999999a, double:0.05)
            double r5 = r5 * r3
            double r3 = java.lang.Math.floor(r5)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x0823
            X.2qk r2 = r8.A01
            java.lang.Throwable r1 = new java.lang.Throwable
            r1.<init>()
            java.lang.String r0 = "skipped"
            X.AnonymousClass266.A00(r2, r7, r0, r1)
        L_0x0823:
            r8.A0I()
            return r19
        L_0x0827:
            r0.BhD(r4)
            goto L_0x07fe
        L_0x082b:
            if (r23 == 0) goto L_0x0834
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
        L_0x0831:
            r4.A04 = r1
            goto L_0x07f3
        L_0x0834:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r18)
            goto L_0x0831
        L_0x0839:
            long r0 = r6.A02
            r3 = 1
            long r0 = r0 + r3
            r6.A02 = r0
            r8.A0J(r6)
            java.lang.String r2 = r8.A0F()
            long r0 = r8.A0B()
            long r0 = r0 + r3
            r12.A04(r2, r0)
            java.lang.StringBuilder r1 = X.C23281Rz.A01(r8)
            java.lang.String r0 = "_retry_revision"
            java.lang.String r2 = X.AnonymousClass000.A0X(r0, r1)
            boolean r0 = r8 instanceof X.C23281Rz
            if (r0 == 0) goto L_0x0892
            r0 = 1
        L_0x085f:
            r12.A04(r2, r0)
            java.lang.String r0 = "receipt_device"
            boolean r0 = r0.equals(r7)
            java.lang.String r5 = "stuck"
            if (r0 != 0) goto L_0x0877
            java.lang.String r0 = "receipt_user"
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x0887
        L_0x0877:
            long r3 = r8.A0B()
            r1 = 20
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0887
        L_0x0881:
            X.2qk r0 = r8.A01
            X.AnonymousClass266.A00(r0, r7, r5, r9)
        L_0x0886:
            return r18
        L_0x0887:
            long r3 = r8.A0B()
            r1 = 100
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0886
            goto L_0x0881
        L_0x0892:
            r0 = 0
            goto L_0x085f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass31D.A0T(X.2Vr):boolean");
    }

    public boolean A0U(Throwable th, int i) {
        StringBuilder A0l;
        String str;
        if (th instanceof SQLiteDatabaseCorruptException) {
            return false;
        }
        boolean z = th instanceof SQLiteBlobTooBigException;
        if (i == 1) {
            if (z) {
                A0l = AnonymousClass000.A0l("DatabaseMigration/shouldRetryWithSmallerBatch/error; name=");
                A0l.append(this.A0C);
                str = "; BlobTooBigException - skipping row";
            } else if (!(th instanceof IllegalStateException)) {
                return false;
            } else {
                A0l = AnonymousClass000.A0l("DatabaseMigration/shouldRetryWithSmallerBatch/error; name=");
                A0l.append(this.A0C);
                str = "; IllegalStateException - skipping row";
            }
            C18260x0.A1K(A0l, str);
            return true;
        } else if (z || (th instanceof SQLiteOutOfMemoryException) || (th instanceof IllegalStateException)) {
            return true;
        } else {
            return false;
        }
    }

    public AnonymousClass31D(AnonymousClass2U4 r2, String str, int i) {
        this.A0C = str;
        this.A00 = i;
        this.A01 = r2.A00;
        this.A0B = r2.A0E;
        this.A02 = r2.A01;
        this.A03 = r2.A04;
        this.A09 = r2.A0C;
        this.A06 = r2.A08;
        this.A0A = r2.A0D;
        this.A05 = r2.A07;
        this.A08 = r2.A0B;
        this.A07 = r2.A09;
        this.A04 = r2.A06;
    }

    public static AnonymousClass32H A04(AnonymousClass4GK r0, int i, long j) {
        r0.close();
        return new AnonymousClass32H(j, i);
    }

    public static Integer A05(AnonymousClass31D r0) {
        return Integer.valueOf(r0.A0A());
    }

    public static void A06(ContentValues contentValues, Cursor cursor, String str, int i) {
        contentValues.put(str, Long.valueOf(cursor.getLong(i)));
    }

    public static void A07(ContentValues contentValues, Cursor cursor, String str, int i) {
        C621833x.A02(contentValues, str, cursor.getString(i));
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x0075 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A0A() {
        /*
            r5 = this;
            boolean r0 = r5.A0P()
            if (r0 == 0) goto L_0x0011
            boolean r1 = r5.A0R()
            r0 = 11
            if (r1 != 0) goto L_0x0010
            r0 = 13
        L_0x0010:
            return r0
        L_0x0011:
            int r0 = r5.A09()
            r4 = 4
            r3 = 2
            r2 = 1
            if (r0 != r3) goto L_0x0028
            boolean r0 = r5.A0M()
            if (r0 != 0) goto L_0x0060
            boolean r0 = r5.A0L()
            if (r0 == 0) goto L_0x0075
            r0 = 0
            return r0
        L_0x0028:
            int r0 = r5.A09()
            r1 = 3
            if (r0 != r1) goto L_0x0061
            boolean r0 = r5.A0M()
            if (r0 != 0) goto L_0x0060
            boolean r0 = r5.A0Q()
            if (r0 == 0) goto L_0x003c
            return r3
        L_0x003c:
            boolean r0 = r5.A0R()
            if (r0 != 0) goto L_0x0045
            r0 = 12
            return r0
        L_0x0045:
            boolean r0 = r5.A0K()
            if (r0 == 0) goto L_0x005d
            r5.A0L()
            boolean r0 = r5.A0S()
            if (r0 == 0) goto L_0x005d
            boolean r0 = r5.A0L()
            if (r0 == 0) goto L_0x005b
            return r1
        L_0x005b:
            r0 = 5
            return r0
        L_0x005d:
            r0 = 10
            return r0
        L_0x0060:
            return r2
        L_0x0061:
            int r0 = r5.A09()
            if (r0 != r2) goto L_0x0076
            boolean r0 = r5.A0M()
            if (r0 != 0) goto L_0x0073
            boolean r0 = r5.A0L()
            if (r0 == 0) goto L_0x0075
        L_0x0073:
            r0 = 7
            return r0
        L_0x0075:
            return r4
        L_0x0076:
            r0 = 9
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass31D.A0A():int");
    }

    /* JADX WARNING: Removed duplicated region for block: B:3:0x000e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0R() {
        /*
            r5 = this;
            java.util.Set r0 = r5.A0H()
            java.util.Iterator r2 = r0.iterator()
        L_0x0008:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0042
            java.lang.String r4 = X.AnonymousClass001.A0m(r2)
            X.2fA r0 = r5.A09
            X.31D r1 = r0.A02(r4)
            r3 = 0
            if (r1 != 0) goto L_0x0035
            X.2qk r2 = r5.A01
            java.lang.StringBuilder r1 = X.C23281Rz.A01(r5)
            java.lang.String r0 = " depends on "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = " (missing)"
            java.lang.String r1 = X.AnonymousClass000.A0X(r0, r1)
            java.lang.String r0 = "db-migration-missing-dep"
            r2.A0A(r0, r3, r1)
        L_0x0034:
            return r3
        L_0x0035:
            boolean r0 = r1.A0M()
            if (r0 == 0) goto L_0x0034
            boolean r0 = r1.A0P()
            if (r0 == 0) goto L_0x0008
            return r3
        L_0x0042:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass31D.A0R():boolean");
    }
}
