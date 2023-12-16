package X;

import android.database.Cursor;
import android.database.sqlite.SQLiteDiskIOException;
import android.net.Uri;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.319  reason: invalid class name */
public class AnonymousClass319 {
    public static final String[] A0G = new String[0];
    public final C55682qk A00;
    public final C64393Dh A01;
    public final AnonymousClass310 A02;
    public final C54292oU A03;
    public final C56922sm A04;
    public final C66543Lv A05;
    public final C613830m A06;
    public final AnonymousClass2Y6 A07;
    public final C28761hj A08;
    public final C55272q5 A09;
    public final C72303dV A0A;
    public final C56362rr A0B;
    public final AnonymousClass1VX A0C;
    public final C60152y5 A0D;
    public final C55732qp A0E;
    public final C55832qz A0F;

    public C30471mV A0C(String str) {
        Cursor A0E2;
        if (str == null) {
            return null;
        }
        AnonymousClass4GK A002 = A00(this);
        try {
            A0E2 = ((AnonymousClass3H0) A002).A03.A0E("SELECT message_row_id, chat_row_id, autotransfer_retry_enabled, multicast_id, media_job_uuid, transferred, transcoded, file_path, file_size, suspicious_content, trim_from, trim_to, face_x, face_y, media_key, media_key_timestamp, width, height, has_streaming_sidecar, gif_attribution, thumbnail_height_width_ratio, direct_path, first_scan_sidecar, first_scan_length, message_url, mime_type, file_length, media_name, file_hash, media_duration, page_count, enc_file_hash, partial_media_hash, partial_media_enc_hash, is_animated_sticker, original_file_hash, mute_video, media_caption, media_upload_handle, sticker_flags FROM message_media WHERE original_file_hash = ?", "SELECT_ORIGINAL_MESSAGE_FROM_ORIGINAL_FILE_HASH", C18270x1.A1b(str));
            if (A0E2.moveToNext()) {
                C624134x A003 = C55122pp.A00(this.A0F, AnonymousClass0x2.A0C(A0E2, "message_row_id"));
                if (A003 instanceof C30471mV) {
                    C30471mV r1 = (C30471mV) A003;
                    A0E2.close();
                    A002.close();
                    return r1;
                }
            }
            A0E2.close();
            A002.close();
            return null;
        } catch (Throwable th) {
            try {
                A002.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    public Collection A0H(String str, byte b) {
        File file;
        Collection A0F2 = A0F((AnonymousClass0QU) null, str, b);
        ArrayList A0u = C18300x5.A0u(A0F2);
        Iterator it = A0F2.iterator();
        while (it.hasNext()) {
            C30471mV A0S = C18320x8.A0S(it);
            AnonymousClass33C r1 = A0S.A01;
            if (r1 != null && r1.A0R && (file = r1.A0F) != null && file.exists()) {
                A0u.add(A0S);
            }
        }
        return A0u;
    }

    public static AnonymousClass4GK A00(AnonymousClass319 r0) {
        return r0.A0A.get();
    }

    public AnonymousClass2z0 A0B(String str, String str2, byte[] bArr, boolean z) {
        String str3;
        Cursor A0E2;
        C613830m r7 = this.A06;
        C626936e.A00();
        AnonymousClass4GK A002 = A00(this);
        try {
            C56862sg r3 = ((AnonymousClass3H0) A002).A03;
            if (C56952sp.A0H(this.A0C)) {
                str3 = AnonymousClass2CE.A0H;
            } else {
                str3 = AnonymousClass2CE.A0G;
            }
            String[] A1Z = AnonymousClass0x9.A1Z();
            AnonymousClass001.A1I(str, str2, A1Z);
            A0E2 = r3.A0E(str3, "GET_MEDIA_MESSAGE_KEY_BY_HASHES_SQL", A1Z);
            int columnIndexOrThrow = A0E2.getColumnIndexOrThrow("from_me");
            int columnIndexOrThrow2 = A0E2.getColumnIndexOrThrow("key_id");
            AnonymousClass2z0 r10 = null;
            while (A0E2.moveToNext()) {
                C95814uZ A0C2 = this.A04.A0C(A0E2);
                if (A0C2 == null) {
                    Log.w("msgstore/getMediaMessageKeyByHashes/jid is null or invalid!");
                } else {
                    AnonymousClass2z0 r5 = new AnonymousClass2z0(A0C2, A0E2.getString(columnIndexOrThrow2), AnonymousClass000.A1U(A0E2.getInt(columnIndexOrThrow), 1));
                    AnonymousClass33C A012 = r7.A01(A0E2);
                    byte[] bArr2 = A012.A0W;
                    if (bArr2 != null && bArr2.length == 32 && A012.A0R && Arrays.equals(bArr2, bArr)) {
                        if (!z) {
                            A0E2.close();
                            A002.close();
                            return r5;
                        }
                        r10 = r5;
                    }
                }
            }
            A0E2.close();
            A002.close();
            return r10;
        } catch (SQLiteDiskIOException e) {
            try {
                this.A08.A08(1);
                throw e;
            } catch (Throwable th) {
                try {
                    A002.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        } catch (Throwable th3) {
            th.addSuppressed(th3);
        }
        throw th;
    }

    public AnonymousClass319(C55682qk r2, C64393Dh r3, AnonymousClass310 r4, C54292oU r5, C56922sm r6, C66543Lv r7, C613830m r8, AnonymousClass2Y6 r9, C28761hj r10, C55272q5 r11, C72303dV r12, C56362rr r13, AnonymousClass1VX r14, C60152y5 r15, C55732qp r16, C55832qz r17) {
        this.A0C = r14;
        this.A04 = r6;
        this.A03 = r5;
        this.A00 = r2;
        this.A01 = r3;
        this.A0B = r13;
        this.A02 = r4;
        this.A0E = r16;
        this.A07 = r9;
        this.A0F = r17;
        this.A05 = r7;
        this.A08 = r10;
        this.A0A = r12;
        this.A06 = r8;
        this.A0D = r15;
        this.A09 = r11;
    }

    public int A01(C837249n r9, C95814uZ r10, int i) {
        Cursor A0E2;
        AnonymousClass33C r1;
        File file;
        C18260x0.A1R(AnonymousClass001.A0o(), "mediamsgstore/getMediaMessagesCount:", r10);
        AnonymousClass33M r5 = new AnonymousClass33M(false);
        r5.A0A("mediamsgstore/getMediaMessagesCount/");
        String str = AnonymousClass2CE.A0A;
        int i2 = 0;
        String[] strArr = {String.valueOf(this.A04.A07(r10))};
        try {
            AnonymousClass4GK A002 = A00(this);
            try {
                A0E2 = ((AnonymousClass3H0) A002).A03.A0E(str, "GET_MEDIA_MESSAGES_SQL_ORDER_BY_SORT_ID", strArr);
                while (A0E2.moveToNext() && !r9.Boa()) {
                    C624134x A042 = this.A0F.A04(A0E2, r10);
                    if ((A042 instanceof C30471mV) && (r1 = ((C30471mV) A042).A01) != null) {
                        if ((A042.A1J.A02 || r1.A0R) && (file = r1.A0F) != null && C18310x6.A0a(Uri.fromFile(file)).exists() && (i2 = i2 + 1) > i) {
                            A0E2.close();
                            A002.close();
                            return i2;
                        }
                    }
                }
                A0E2.close();
                A002.close();
                r5.A07();
                C18260x0.A0y("mediamsgstore/getMediaMessagesCount/count:", AnonymousClass001.A0o(), i2);
                return i2;
            } catch (Throwable th) {
                A002.close();
                throw th;
            }
            throw th;
        } catch (SQLiteDiskIOException e) {
            this.A08.A08(1);
            throw e;
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
    }

    public long A02(Set set, long j, long j2) {
        Cursor A0E2;
        long j3;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("mediamsgstore/getSizeOfSpecifiedTypesOfMediaFilesFromTimestamp for message types ");
        A0o.append(set);
        A0o.append(" with maxDocumentSize");
        A0o.append(j);
        C18260x0.A12(" and maxMediaSize", A0o, j2);
        int size = set.size();
        StringBuilder A0o2 = AnonymousClass001.A0o();
        A0o2.append("SELECT SUM (file_size) as total_file_size  FROM (");
        A0o2.append("SELECT file_size FROM message_media AS message_media JOIN available_message_view AS message ON message_media.message_row_id = message._id JOIN chat_view AS chat ON message.chat_row_id = chat._id WHERE ");
        C57212tH.A02(" message.message_type IN ", A0o2, size);
        A0o2.append(" AND ");
        A0o2.append("(  CASE  WHEN  (message.message_type IN (26,9))");
        A0o2.append(" THEN message_media.file_size <= ");
        A0o2.append(j);
        A0o2.append(" ELSE message_media.");
        A0o2.append("file_size");
        A0o2.append(" <= ");
        A0o2.append(j2);
        A0o2.append(" END )");
        A0o2.append(" AND (message.from_me = 1 OR chat.group_type != 4)");
        A0o2.append(" GROUP BY message_media.");
        A0o2.append("file_hash");
        String A0e = AnonymousClass000.A0e(A0o2);
        ArrayList A0s = AnonymousClass001.A0s();
        for (Object A1I : set) {
            C18320x8.A1I(A1I, A0s);
        }
        AnonymousClass4GK A002 = A00(this);
        try {
            A0E2 = ((AnonymousClass3H0) A002).A03.A0E(A0e, "GET_SIZE_OF_SPECIFIED_TYPES_OF_MEDIA_FILES", (String[]) A0s.toArray(A0G));
            if (A0E2.moveToNext()) {
                j3 = AnonymousClass0x2.A0C(A0E2, "total_file_size");
            } else {
                j3 = 0;
            }
            A0E2.close();
            A002.close();
            return j3;
        } catch (Throwable th) {
            try {
                A002.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    public Cursor A03(C95814uZ r7, byte b) {
        C18260x0.A1P(AnonymousClass001.A0o(), "mediamsgstore/getMediaMessagesByTypeCursor:", r7);
        AnonymousClass4GK A002 = A00(this);
        try {
            C56862sg r4 = ((AnonymousClass3H0) A002).A03;
            String str = C58162uo.A09;
            String[] A1Z = AnonymousClass0x9.A1Z();
            C56922sm.A01(this.A04, r7, A1Z);
            A1Z[1] = Byte.toString(b);
            return C56862sg.A00(A002, r4, str, "GET_MEDIA_MESSAGES_BY_TYPE_SQL", A1Z);
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }

    public Cursor A04(C95814uZ r8, int i, long j) {
        C18260x0.A1R(AnonymousClass001.A0o(), "mediamsgstore/getMediaMessagesHeadCursor:", r8);
        AnonymousClass4GK A002 = A00(this);
        try {
            StringBuilder A0A2 = C18330xA.A0A(AnonymousClass2CE.A0B);
            AnonymousClass34U.A02(A0A2, true);
            if (i > 0) {
                A0A2.append(" LIMIT ");
                A0A2.append(i);
            }
            String obj = A0A2.toString();
            C56862sg r3 = ((AnonymousClass3H0) A002).A03;
            String[] A1Z = AnonymousClass0x9.A1Z();
            C56922sm.A01(this.A04, r8, A1Z);
            AnonymousClass0x2.A1S(A1Z, 1, this.A0B.A04(j));
            return C56862sg.A00(A002, r3, obj, "GET_MEDIA_MESSAGES_HEAD_CURSOR", A1Z);
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }

    public Cursor A05(C95814uZ r8, int i, long j) {
        C18260x0.A1R(AnonymousClass001.A0o(), "mediamsgstore/getMediaMessagesTailCursor:", r8);
        AnonymousClass4GK A002 = A00(this);
        try {
            StringBuilder A0A2 = C18330xA.A0A(AnonymousClass2CE.A0B);
            AnonymousClass34U.A02(A0A2, false);
            if (i > 0) {
                A0A2.append(" LIMIT ");
                A0A2.append(i);
            }
            String obj = A0A2.toString();
            C56862sg r3 = ((AnonymousClass3H0) A002).A03;
            String[] A1Z = AnonymousClass0x9.A1Z();
            C56922sm.A02(this.A04, r8, A1Z, 0);
            C18270x1.A1R(A1Z, this.A0B.A04(j));
            return C56862sg.A00(A002, r3, obj, "GET_MEDIA_MESSAGES_TAIL_CURSOR", A1Z);
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }

    public Cursor A06(C95814uZ r11, long j) {
        StringBuilder A0o;
        String str;
        StringBuilder A0o2 = AnonymousClass001.A0o();
        A0o2.append("mediamsgstore/getMediaMessagesOrderedBySizeCursor jid:");
        A0o2.append(r11);
        C18260x0.A12(", fileSize:", A0o2, j);
        AnonymousClass4GK A002 = A00(this);
        boolean A1W = AnonymousClass000.A1W(r11);
        try {
            String str2 = "";
            String str3 = " AND message.chat_row_id = ?";
            if (C56952sp.A0H(this.A0C)) {
                A0o = AnonymousClass001.A0o();
                str = AnonymousClass2CE.A01;
            } else {
                A0o = AnonymousClass001.A0o();
                str = AnonymousClass2CE.A00;
            }
            A0o.append(str);
            if (!A1W) {
                str3 = str2;
            }
            A0o.append(str3);
            if (j > 0) {
                str2 = " AND file_size > ?";
            }
            Cursor A032 = C56862sg.A03(A002, AnonymousClass000.A0V(str2, " ORDER BY file_size DESC", A0o), "GET_MEDIA_AND_DOC_MESSAGES_JOIN_MESSAGE_MEDIA_UNSORTED_ORDER_BY_FILE_SIZE_DESC", A0I(r11, j));
            A002.close();
            return A032;
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }

    public Cursor A07(C95814uZ r7, long j) {
        String str;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("mediamsgstore/getMediaMessagesOrderedByIDAscCursor jid:");
        A0o.append(r7);
        C18260x0.A12(", fileSize:", A0o, j);
        AnonymousClass4GK A002 = A00(this);
        try {
            String A003 = C66233Ko.A00(j, AnonymousClass000.A1W(r7), true);
            String[] A0I = A0I(r7, j);
            if (j > 0) {
                str = "GET_MEDIA_AND_DOC_MESSAGES_JOIN_MESSAGE_MEDIA_UNSORTED_ORDER_BY_SORT_ID_ASC";
            } else {
                str = "GET_MEDIA_AND_DOC_MESSAGES_UNSORTED_ORDER_BY_SORT_ID_ASC";
            }
            Cursor A032 = C56862sg.A03(A002, A003, str, A0I);
            A002.close();
            return A032;
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }

    public Cursor A08(C95814uZ r7, long j) {
        String str;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("mediamsgstore/getMediaAndDocMessagesOrderedByIDDescCursor jid:");
        A0o.append(r7);
        C18260x0.A12(", fileSize:", A0o, j);
        AnonymousClass4GK A002 = A00(this);
        try {
            String A003 = C66233Ko.A00(j, AnonymousClass000.A1W(r7), false);
            String[] A0I = A0I(r7, j);
            if (j > 0) {
                str = "GET_MEDIA_AND_DOC_MESSAGES_JOIN_MESSAGE_MEDIA_UNSORTED_ORDER_BY_SORT_ID_DESC";
            } else {
                str = "GET_MEDIA_AND_DOC_MESSAGES_UNSORTED_ORDER_BY_SORT_ID_DESC";
            }
            Cursor A032 = C56862sg.A03(A002, A003, str, A0I);
            A002.close();
            return A032;
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }

    public Cursor A09(Long l, Set set, long j) {
        String str;
        String str2;
        String str3;
        AnonymousClass4GK A002 = A00(this);
        try {
            boolean z = true;
            if (C56952sp.A0H(this.A0C)) {
                int size = set.size();
                if (l == null) {
                    z = false;
                }
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("SELECT file_path, message_row_id FROM message_media as msg_media JOIN available_message_view AS message JOIN chat_view AS chat WHERE message._id = msg_media.message_row_id AND message.chat_row_id = chat._id AND ");
                C57212tH.A02("message_type IN ", A0o, size);
                if (z) {
                    str3 = " AND message_row_id < ? ";
                } else {
                    str3 = "";
                }
                A0o.append(str3);
                C18320x8.A1L(A0o, " AND (message.from_me = 1 OR chat.group_type != 4)");
                A0o.append("message_row_id");
                str = AnonymousClass000.A0X(" DESC LIMIT ?", A0o);
            } else {
                int size2 = set.size();
                if (l == null) {
                    z = false;
                }
                StringBuilder A0o2 = AnonymousClass001.A0o();
                A0o2.append("SELECT file_path, message_row_id FROM message_media as msg_media JOIN available_message_view AS message ON message._id = msg_media.message_row_id JOIN chat_view AS chat ON message.chat_row_id = chat._id WHERE ");
                C57212tH.A02("message_type IN ", A0o2, size2);
                if (z) {
                    str2 = " AND message_row_id < ? ";
                } else {
                    str2 = "";
                }
                A0o2.append(str2);
                C18320x8.A1L(A0o2, " AND (message.from_me = 1 OR chat.group_type != 4)");
                A0o2.append("message_row_id");
                str = AnonymousClass000.A0X(" DESC LIMIT ?", A0o2);
            }
            ArrayList A0I = AnonymousClass002.A0I(set.size());
            Iterator it = set.iterator();
            while (it.hasNext()) {
                C18320x8.A1I((Byte) it.next(), A0I);
            }
            if (l != null) {
                C18320x8.A1I(l, A0I);
            }
            C18280x3.A1K(A0I, j);
            return C56862sg.A00(A002, ((AnonymousClass3H0) A002).A03, str, "GET_REFERENCED_MEDIA_PATHS", C18300x5.A1b(A0I));
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }

    public AnonymousClass2S8 A0A(String str, byte b, boolean z) {
        String str2;
        String str3;
        String[] strArr;
        Cursor A032;
        AnonymousClass2S8 r14;
        String str4;
        C626936e.A00();
        AnonymousClass4GK A002 = A00(this);
        try {
            C613830m r11 = this.A06;
            String str5 = str;
            byte b2 = b;
            if (b2 == -1 || b == 0) {
                if (C56952sp.A0H(this.A0C)) {
                    str4 = AnonymousClass2CE.A0F;
                } else {
                    str4 = AnonymousClass2CE.A0E;
                }
                str3 = "GET_MEDIA_MESSAGE_FILE_BY_HASH_SQL";
                strArr = new String[]{str};
            } else {
                if (C56952sp.A0H(this.A0C)) {
                    str2 = AnonymousClass2CE.A0D;
                } else {
                    str2 = AnonymousClass2CE.A0C;
                }
                str3 = "GET_MEDIA_MESSAGE_FILE_BY_HASH_AND_MEDIA_TYPE_SQL";
                strArr = AnonymousClass0x7.A1a(str5, 0);
                strArr[1] = Byte.toString(b2);
            }
            try {
                A032 = C56862sg.A03(A002, str2, str3, strArr);
                int columnIndexOrThrow = A032.getColumnIndexOrThrow("enc_file_hash");
                int columnIndexOrThrow2 = A032.getColumnIndexOrThrow("timestamp");
                int columnIndexOrThrow3 = A032.getColumnIndexOrThrow("file_hash");
                int columnIndexOrThrow4 = A032.getColumnIndexOrThrow("message_type");
                int columnIndexOrThrow5 = A032.getColumnIndexOrThrow("media_url");
                int columnIndexOrThrow6 = A032.getColumnIndexOrThrow("mime_type");
                while (A032.moveToNext()) {
                    AnonymousClass33C A012 = r11.A01(A032);
                    String string = A032.getString(columnIndexOrThrow);
                    long j = A032.getLong(columnIndexOrThrow2);
                    A032.getString(columnIndexOrThrow3);
                    byte b3 = (byte) ((int) A032.getLong(columnIndexOrThrow4));
                    String string2 = A032.getString(columnIndexOrThrow5);
                    String string3 = A032.getString(columnIndexOrThrow6);
                    File file = A012.A0F;
                    if (file != null) {
                        file.exists();
                        byte[] bArr = A012.A0W;
                        if (bArr != null && bArr.length == 32) {
                            if (A012.A0R) {
                                if (!A012.A0F.isAbsolute()) {
                                    AnonymousClass310 r10 = this.A02;
                                    A012.A0F = AnonymousClass002.A0A(AnonymousClass310.A00(r10), A012.A0F.getPath());
                                }
                                if (A012.A0F.exists()) {
                                    r14 = new AnonymousClass2S8(A012, string, string2, string3, b3, j);
                                    A032.close();
                                    return r14;
                                }
                            }
                        }
                    }
                    if (!z) {
                        r14 = new AnonymousClass2S8(A012, string, string2, string3, b3, j);
                        A032.close();
                        return r14;
                    }
                }
                A032.close();
                A002.close();
                return null;
            } catch (SQLiteDiskIOException e) {
                this.A08.A08(1);
                throw e;
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
            throw th;
        } finally {
            try {
                A002.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0061, code lost:
        r5 = (X.C30471mV) r5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.ArrayList A0D(X.C837249n r11, X.C95814uZ r12, int r13, int r14) {
        /*
            r10 = this;
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "mediamsgstore/getMediaMessages:"
            r1.append(r0)
            r1.append(r12)
            java.lang.String r0 = " limit:"
            X.C18260x0.A0y(r0, r1, r13)
            r8 = 0
            X.33M r1 = new X.33M
            r1.<init>((boolean) r8)
            java.lang.String r0 = "mediamsgstore/getMediaMessages/"
            r1.A0A(r0)
            java.util.ArrayList r3 = X.AnonymousClass001.A0s()
            X.2sm r0 = r10.A04
            long r4 = r0.A07(r12)
            java.lang.String r9 = java.lang.String.valueOf(r4)
            r0 = 2
            if (r14 != r0) goto L_0x0033
            java.lang.String r6 = X.AnonymousClass2CE.A09
            java.lang.String r5 = "GET_MEDIA_MESSAGES_FOR_EXPORT"
        L_0x0031:
            r2 = 1
            goto L_0x0038
        L_0x0033:
            java.lang.String r6 = X.AnonymousClass2CE.A0A
            java.lang.String r5 = "GET_MEDIA_MESSAGES_SQL_ORDER_BY_SORT_ID"
            goto L_0x0031
        L_0x0038:
            X.4GK r7 = A00(r10)     // Catch:{ SQLiteDiskIOException -> 0x00b5 }
            r0 = r7
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x00ab }
            X.2sg r4 = r0.A03     // Catch:{ all -> 0x00ab }
            java.lang.String[] r0 = new java.lang.String[r2]     // Catch:{ all -> 0x00ab }
            r0[r8] = r9     // Catch:{ all -> 0x00ab }
            android.database.Cursor r4 = r4.A0E(r6, r5, r0)     // Catch:{ all -> 0x00ab }
        L_0x0049:
            boolean r0 = r4.moveToNext()     // Catch:{ all -> 0x009f }
            if (r0 == 0) goto L_0x008c
            if (r11 == 0) goto L_0x0057
            boolean r0 = r11.Boa()     // Catch:{ all -> 0x009f }
            if (r0 != 0) goto L_0x008c
        L_0x0057:
            X.2qz r0 = r10.A0F     // Catch:{ all -> 0x009f }
            X.34x r5 = r0.A04(r4, r12)     // Catch:{ all -> 0x009f }
            boolean r0 = r5 instanceof X.C30471mV     // Catch:{ all -> 0x009f }
            if (r0 == 0) goto L_0x0049
            X.1mV r5 = (X.C30471mV) r5     // Catch:{ all -> 0x009f }
            X.33C r6 = r5.A01     // Catch:{ all -> 0x009f }
            if (r6 == 0) goto L_0x0049
            X.2z0 r0 = r5.A1J     // Catch:{ all -> 0x009f }
            boolean r0 = r0.A02     // Catch:{ all -> 0x009f }
            if (r0 != 0) goto L_0x0071
            boolean r0 = r6.A0R     // Catch:{ all -> 0x009f }
            if (r0 == 0) goto L_0x0049
        L_0x0071:
            java.io.File r0 = r6.A0F     // Catch:{ all -> 0x009f }
            if (r0 == 0) goto L_0x0049
            android.net.Uri r0 = android.net.Uri.fromFile(r0)     // Catch:{ all -> 0x009f }
            java.io.File r0 = X.C18310x6.A0a(r0)     // Catch:{ all -> 0x009f }
            boolean r0 = r0.exists()     // Catch:{ all -> 0x009f }
            if (r0 == 0) goto L_0x0049
            r3.add(r5)     // Catch:{ all -> 0x009f }
            int r0 = r3.size()     // Catch:{ all -> 0x009f }
            if (r0 < r13) goto L_0x0049
        L_0x008c:
            r4.close()     // Catch:{ all -> 0x00ab }
            r7.close()     // Catch:{ SQLiteDiskIOException -> 0x00b5 }
            r1.A07()
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "mediamsgstore/getMediaMessages/size:"
            X.C18260x0.A1B(r0, r1, r3)
            return r3
        L_0x009f:
            r1 = move-exception
            if (r4 == 0) goto L_0x00aa
            r4.close()     // Catch:{ all -> 0x00a6 }
            goto L_0x00aa
        L_0x00a6:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x00ab }
        L_0x00aa:
            throw r1     // Catch:{ all -> 0x00ab }
        L_0x00ab:
            r1 = move-exception
            r7.close()     // Catch:{ all -> 0x00b0 }
            goto L_0x00b4
        L_0x00b0:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ SQLiteDiskIOException -> 0x00b5 }
        L_0x00b4:
            throw r1     // Catch:{ SQLiteDiskIOException -> 0x00b5 }
        L_0x00b5:
            r1 = move-exception
            X.1hj r0 = r10.A08
            r0.A08(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass319.A0D(X.49n, X.4uZ, int, int):java.util.ArrayList");
    }

    public Collection A0E(AnonymousClass0QU r5, File file, String str) {
        ArrayList A0s = AnonymousClass001.A0s();
        Iterator it = A0F(r5, str, (byte) -1).iterator();
        while (it.hasNext()) {
            C30471mV A0S = C18320x8.A0S(it);
            AnonymousClass33C r0 = A0S.A01;
            if (r0 != null && file.equals(r0.A0F)) {
                A0s.add(A0S);
            }
        }
        return A0s;
    }

    public Collection A0F(AnonymousClass0QU r8, String str, byte b) {
        String str2;
        String str3;
        String str4;
        String[] A1a;
        Cursor A0D2;
        C626936e.A00();
        boolean A0H = C56952sp.A0H(this.A0C);
        if (b == -1) {
            if (A0H) {
                str3 = AnonymousClass2CE.A08;
            } else {
                str3 = AnonymousClass2CE.A07;
            }
            str4 = "GET_MEDIA_MESSAGES_BY_HASH_SQL";
            A1a = new String[]{str};
        } else {
            if (A0H) {
                str2 = AnonymousClass2CE.A06;
            } else {
                str2 = AnonymousClass2CE.A05;
            }
            str4 = "GET_MEDIA_MESSAGES_BY_HASH_AND_TYPE_SQL";
            A1a = AnonymousClass0x7.A1a(str, 0);
            A1a[1] = Byte.toString(b);
        }
        ArrayList A0s = AnonymousClass001.A0s();
        AnonymousClass4GK A002 = A00(this);
        try {
            A0D2 = ((AnonymousClass3H0) A002).A03.A0D(r8, str3, str4, A1a);
            while (A0D2.moveToNext()) {
                if (r8 != null) {
                    r8.A02();
                }
                C624134x A032 = this.A0F.A03(A0D2);
                if (A032 instanceof C30471mV) {
                    A0s.add((C30471mV) A032);
                }
            }
            A0D2.close();
            A002.close();
            return A0s;
        } catch (SQLiteDiskIOException e) {
            try {
                this.A08.A08(1);
                throw e;
            } catch (Throwable th) {
                try {
                    A002.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        } catch (Throwable th3) {
            th.addSuppressed(th3);
        }
        throw th;
    }

    public Collection A0G(File file) {
        C626936e.A00();
        try {
            return A0E((AnonymousClass0QU) null, file, C615131b.A00(this.A00, file));
        } catch (IOException e) {
            Log.e("mediamessagestore/getMediaMessagesForFile/could not get file hash;", e);
            return Collections.emptyList();
        }
    }

    public final String[] A0I(C95814uZ r5, long j) {
        ArrayList A0s = AnonymousClass001.A0s();
        if (r5 != null) {
            C18280x3.A1K(A0s, this.A04.A07(r5));
        }
        if (j > 0) {
            C18280x3.A1K(A0s, j);
        }
        if (A0s.size() == 0) {
            return null;
        }
        return (String[]) A0s.toArray(A0G);
    }
}
