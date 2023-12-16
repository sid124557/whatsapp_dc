package X;

import android.database.Cursor;
import com.whatsapp.jid.UserJid;
import java.io.File;
import java.util.Collections;
import java.util.List;

/* renamed from: X.3am  reason: invalid class name and case insensitive filesystem */
public class C70613am implements Runnable {
    public long A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public final int A05;

    public C70613am(Object obj, Object obj2, Object obj3, Object obj4, int i, long j) {
        this.A05 = i;
        this.A03 = obj;
        this.A01 = obj2;
        this.A00 = j;
        this.A04 = obj3;
        this.A02 = obj4;
    }

    public void run() {
        C30391mN r2;
        Cursor A0E;
        C30471mV r22;
        File file;
        C614630w A0y;
        String str;
        Cursor A0E2;
        long j;
        boolean z;
        switch (this.A05) {
            case 0:
                long A0H = ((C56612sH) this.A03).A0H();
                long A002 = ((C44762Xj) this.A02).A00((C59732xO) null, 2, false);
                long j2 = this.A00;
                long j3 = (long) 210;
                C66543Lv r12 = (C66543Lv) this.A01;
                AnonymousClass33M A012 = AnonymousClass33M.A01("CoreMessageStore/getNumMessagesSince");
                String[] A1a = AnonymousClass0x9.A1a();
                C18270x1.A1S(A1a, A0H - (86400000 * A002));
                AnonymousClass0x2.A1S(A1a, 1, A0H);
                AnonymousClass0x2.A1S(A1a, 2, (j2 / j3) + 1);
                try {
                    AnonymousClass4GK A032 = r12.A18.get();
                    try {
                        A0E2 = ((AnonymousClass3H0) A032).A03.A0E("SELECT COUNT(*) as count FROM (SELECT _id FROM available_message_view WHERE timestamp >= ?  AND (expire_timestamp IS NULL OR expire_timestamp >= ? OR keep_in_chat = 1)  LIMIT ?)", "SELECT_NUM_MESSAGES_SINCE_TIMESTAMP_SQL", A1a);
                        if (!A0E2.moveToFirst()) {
                            A0E2.close();
                            A032.close();
                            A012.A07();
                            j = -1;
                        } else {
                            j = AnonymousClass0x2.A0C(A0E2, "count");
                            A0E2.close();
                            A032.close();
                            A012.A07();
                        }
                        C18270x1.A0i(C18270x1.A03((AnonymousClass33p) this.A04), "md_initial_sync_estimate_bytes", Math.min(j * j3, j2));
                        return;
                    } catch (Throwable th) {
                        A032.close();
                        throw th;
                    }
                } catch (Throwable th2) {
                    A012.A07();
                    throw th2;
                }
                break;
            case 1:
                AnonymousClass2R3 r7 = (AnonymousClass2R3) this.A01;
                String[] strArr = (String[]) this.A02;
                long j4 = this.A00;
                C30791n7 r5 = (C30791n7) this.A03;
                List list = (List) this.A04;
                AnonymousClass4GK A033 = r7.A02.get();
                try {
                    A0E = ((AnonymousClass3H0) A033).A03.A0E("SELECT _id, message_row_id, addon_message_index, chat_row_id, file_path, file_size, media_key, media_key_timestamp, width, height, direct_path, message_url, mime_type, file_length, file_hash, enc_file_hash, partial_media_hash, partial_media_enc_hash, original_file_hash, thumbnail, thumbnail_direct_path, thumbnail_hash, enc_thumbnail_hash, scans_sidecar, transferred FROM addon_message_media WHERE message_row_id = ?", "GET_ADDON_MESSAGE_MEDIA_SQL", strArr);
                    while (A0E.moveToNext()) {
                        String A0Z = AnonymousClass0x2.A0Z(A0E, "mime_type");
                        if (A0Z == null) {
                            C18260x0.A11("AddonMessageMediaStore/createAddonMessagesForMessageRow; media type not found for message: id=", AnonymousClass001.A0o(), j4);
                        } else {
                            int A042 = AnonymousClass0x2.A04(A0E, "addon_message_index");
                            switch (A0Z.hashCode()) {
                                case -1487394660:
                                    str = "image/jpeg";
                                    break;
                                case -1487018032:
                                    str = "image/webp";
                                    break;
                                case -879264467:
                                    str = "image/jpg";
                                    break;
                                case -879258763:
                                    str = "image/png";
                                    break;
                                case 1331848029:
                                    if (A0Z.equals("video/mp4")) {
                                        C30611mj r11 = new C30611mj(r5.A1J, A042);
                                        long j5 = r5.A0K;
                                        C631638e r23 = r5.A00.A05;
                                        C626936e.A06(r23);
                                        r22 = new C31941p8(r11, (AnonymousClass39W) r23.A00.get(A042), j5);
                                        break;
                                    }
                                    break;
                            }
                            if (A0Z.equals(str)) {
                                C30611mj r112 = new C30611mj(r5.A1J, A042);
                                long j6 = r5.A0K;
                                C631638e r24 = r5.A00.A05;
                                C626936e.A06(r24);
                                r22 = new AnonymousClass1n1(r112, (AnonymousClass39W) r24.A00.get(A042), j6);
                                AnonymousClass33C r122 = new AnonymousClass33C();
                                r122.A0A = AnonymousClass0x2.A0C(A0E, "file_size");
                                r122.A0W = C18280x3.A1Z(A0E, "media_key");
                                r122.A0B = AnonymousClass0x2.A0C(A0E, "media_key_timestamp");
                                r122.A08 = AnonymousClass0x2.A04(A0E, "width");
                                r122.A06 = AnonymousClass0x2.A04(A0E, "height");
                                r122.A0G = AnonymousClass0x2.A0Z(A0E, "direct_path");
                                r122.A0T = C18280x3.A1Z(A0E, "scans_sidecar");
                                String A0Z2 = AnonymousClass0x2.A0Z(A0E, "file_path");
                                r122.A0L = AnonymousClass0x2.A0Z(A0E, "partial_media_hash");
                                r122.A0K = AnonymousClass0x2.A0Z(A0E, "partial_media_enc_hash");
                                r122.A0R = C626135u.A05(A0E, "transferred");
                                if (A0Z2 == null) {
                                    file = null;
                                } else {
                                    file = AnonymousClass002.A0B(A0Z2);
                                }
                                r122.A0F = r7.A00.A06(file);
                                r22.A01 = r122;
                                r22.A05 = AnonymousClass0x2.A0Z(A0E, "mime_type");
                                r22.A07 = AnonymousClass0x2.A0Z(A0E, "message_url");
                                r22.A00 = AnonymousClass0x2.A0C(A0E, "file_length");
                                r22.A04 = AnonymousClass0x2.A0Z(A0E, "file_hash");
                                r22.A03 = AnonymousClass0x2.A0Z(A0E, "enc_file_hash");
                                C55592qb r123 = new C55592qb();
                                r123.A04 = AnonymousClass0x2.A0Z(A0E, "thumbnail_direct_path");
                                r123.A08 = AnonymousClass0x2.A0Z(A0E, "thumbnail_hash");
                                r123.A05 = AnonymousClass0x2.A0Z(A0E, "enc_thumbnail_hash");
                                r123.A0A = C18280x3.A1Z(A0E, "media_key");
                                r123.A02 = AnonymousClass0x2.A0C(A0E, "media_key_timestamp");
                                byte[] A1Z = C18280x3.A1Z(A0E, "thumbnail");
                                if (!(A1Z == null || (A0y = r22.A0y()) == null)) {
                                    A0y.A03(A1Z);
                                }
                                r22.A1W(r123);
                                list.add(A042, r22);
                            }
                            StringBuilder A0o = AnonymousClass001.A0o();
                            C624134x.A0P(r5, "AddonMessageMediaStore/createAddonMessage; unsupported media type for message: id=", A0o);
                            C18260x0.A0r(", type=", A0Z, A0o);
                            continue;
                        }
                    }
                    if (list.isEmpty()) {
                        C18260x0.A11("AddonMessageMediaStore/createAddonMessagesForMessageRow; no addon message created for message: id=", AnonymousClass001.A0o(), j4);
                        A0E.close();
                        A033.close();
                        return;
                    }
                    A0E.close();
                    A033.close();
                    r5.A01 = list;
                    r5.A1x();
                    r5.A1w();
                    return;
                } catch (Throwable th3) {
                    try {
                        A033.close();
                        throw th3;
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                        throw th3;
                    }
                }
                break;
            case 2:
                C55672qj r25 = (C55672qj) this.A01;
                C95814uZ r52 = (C95814uZ) this.A02;
                Object obj = this.A03;
                AnonymousClass31A r72 = (AnonymousClass31A) this.A04;
                long j7 = this.A00;
                if (r25.A04.A00().A01(r52)) {
                    r25.A08.A09(r52, Collections.singletonList(obj), 1);
                    return;
                }
                C56922sm r6 = r25.A09;
                AnonymousClass31A A003 = C56982ss.A00(r6.A02, r52);
                C626936e.A06(A003);
                synchronized (A003) {
                    z = false;
                    if (j7 != -1) {
                        if (j7 > r72.A0M) {
                            r72.A0M = j7;
                            z = true;
                        }
                        if (j7 <= r72.A0T) {
                            r72.A0T = j7 - 1;
                            z = true;
                        }
                    }
                }
                if (z) {
                    r6.A05(r72);
                    return;
                }
                return;
            case 3:
                C46672c1 r8 = (C46672c1) this.A01;
                long j8 = this.A00;
                AnonymousClass39T r73 = (AnonymousClass39T) this.A04;
                long A004 = r8.A02.A00((C27991fJ) this.A02, (UserJid) this.A03);
                if (!(A004 == -1 || (r2 = (C30391mN) C55122pp.A00(r8.A04, A004)) == null)) {
                    r2.A07 = true;
                    r2.A01 = j8;
                    r8.A01.A0b(r2, 21);
                }
                r8.A03.A01(r73);
                return;
            default:
                long j9 = this.A00;
                ((C54772pG) this.A01).A01(C129526aS.of(this.A04), (C28011fL) this.A02, (UserJid) this.A03, j9);
                return;
        }
        throw th;
        throw th;
    }
}
