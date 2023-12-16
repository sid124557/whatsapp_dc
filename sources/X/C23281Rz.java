package X;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.1Rz  reason: invalid class name and case insensitive filesystem */
public class C23281Rz extends AnonymousClass31D {
    public static final Set A02;
    public final C56922sm A00;
    public final C613830m A01;

    public static String A00(Long l) {
        if (l == null) {
            return "null";
        }
        return AnonymousClass0x7.A0u("yyyy-MM-dd").format(new Date(l.longValue()));
    }

    public static StringBuilder A01(AnonymousClass31D r2) {
        StringBuilder sb = new StringBuilder();
        sb.append(r2.A0C);
        return sb;
    }

    public AnonymousClass32H A0D(Cursor cursor) {
        String str;
        C55682qk r6;
        String str2;
        long j;
        Integer A0a;
        int i;
        C69833Yo Axl;
        Cursor cursor2 = cursor;
        int A022 = AnonymousClass0x7.A02(cursor2);
        int columnIndexOrThrow = cursor2.getColumnIndexOrThrow("thumb_image");
        int columnIndexOrThrow2 = cursor2.getColumnIndexOrThrow("media_wa_type");
        int columnIndexOrThrow3 = cursor2.getColumnIndexOrThrow("key_remote_jid");
        int columnIndexOrThrow4 = cursor2.getColumnIndexOrThrow("multicast_id");
        int columnIndexOrThrow5 = cursor2.getColumnIndexOrThrow("media_url");
        int columnIndexOrThrow6 = cursor2.getColumnIndexOrThrow("media_mime_type");
        int columnIndexOrThrow7 = cursor2.getColumnIndexOrThrow("media_size");
        int columnIndexOrThrow8 = cursor2.getColumnIndexOrThrow("media_name");
        int columnIndexOrThrow9 = cursor2.getColumnIndexOrThrow("media_hash");
        int columnIndexOrThrow10 = cursor2.getColumnIndexOrThrow("media_duration");
        int columnIndexOrThrow11 = cursor2.getColumnIndexOrThrow("media_enc_hash");
        int columnIndexOrThrow12 = cursor2.getColumnIndexOrThrow("timestamp");
        int i2 = 0;
        long j2 = -1;
        while (cursor2.moveToNext()) {
            j2 = cursor2.getLong(A022);
            i2++;
            if (A02.contains(Long.valueOf(cursor2.getLong(columnIndexOrThrow2)))) {
                if (j2 < 1) {
                    Long A0T = C18280x3.A0T(cursor2, columnIndexOrThrow12);
                    C55682qk r62 = this.A01;
                    String A0X = AnonymousClass000.A0X("-invalid-row-id", A01(this));
                    StringBuilder A0l = AnonymousClass000.A0l("row_id=");
                    A0l.append(j2);
                    A0l.append(", time=");
                    r62.A0A(A0X, false, AnonymousClass000.A0X(A00(A0T), A0l));
                } else {
                    C95814uZ A0S = C18310x6.A0S(C626135u.A01(cursor2, columnIndexOrThrow3));
                    if (A0S != null) {
                        j = this.A00.A07(A0S);
                        if (j < 1) {
                            C18260x0.A1Q(AnonymousClass001.A0o(), "MediaCoreMessageStore/MediaMessageDatabaseMigration/processBatch/missing chat row_id; jid=", A0S);
                        } else {
                            if (j >= 1) {
                                byte[] blob = cursor2.getBlob(columnIndexOrThrow);
                                C613830m r7 = this.A01;
                                AnonymousClass33C A023 = r7.A02(blob);
                                if (A023 == null) {
                                    Long A0T2 = C18280x3.A0T(cursor2, columnIndexOrThrow12);
                                    StringBuilder A0o = AnonymousClass001.A0o();
                                    A0o.append("row_id= ");
                                    A0o.append(j2);
                                    StringBuilder A0l2 = AnonymousClass000.A0l(AnonymousClass000.A0X(", media_blob", A0o));
                                    if (blob == null) {
                                        A0l2.append("=null");
                                    } else {
                                        A0l2.append("=non-null, size=");
                                        A0l2.append(blob.length);
                                    }
                                    str = AnonymousClass000.A0X(A00(A0T2), AnonymousClass000.A0m(A0l2.toString(), ", time="));
                                    r6 = this.A01;
                                    str2 = AnonymousClass000.A0X("-no-media-blob", A01(this));
                                    r6.A0A(str2, false, str);
                                } else {
                                    int i3 = cursor2.getInt(columnIndexOrThrow2);
                                    long j3 = cursor2.getLong(columnIndexOrThrow7);
                                    String A012 = C626135u.A01(cursor2, columnIndexOrThrow4);
                                    String A013 = C626135u.A01(cursor2, columnIndexOrThrow5);
                                    String A014 = C626135u.A01(cursor2, columnIndexOrThrow6);
                                    String A015 = C626135u.A01(cursor2, columnIndexOrThrow8);
                                    String A016 = C626135u.A01(cursor2, columnIndexOrThrow9);
                                    String A017 = C626135u.A01(cursor2, columnIndexOrThrow11);
                                    if (i3 == 9 || i3 == 26) {
                                        A0a = C18300x5.A0a(cursor2, columnIndexOrThrow10);
                                        i = 0;
                                    } else {
                                        i = cursor2.getInt(columnIndexOrThrow10);
                                        A0a = null;
                                    }
                                    ContentValues A06 = AnonymousClass0x9.A06();
                                    r7.A04(A06, A023);
                                    C613830m.A00(A06, A0a, (Integer) null, A012, A013, A014, A015, A016, A017, (String) null, (String) null, i, j2, j, j3, false);
                                    C85284Fq A03 = AnonymousClass31D.A03(this);
                                    try {
                                        Axl = A03.Axl();
                                        C56862sg r5 = ((AnonymousClass3H0) A03).A03;
                                        long A08 = r5.A08("message_media", "INSERT_MESSAGE_MEDIA_SQL", A06);
                                        boolean z = true;
                                        if (A08 > 0) {
                                            if (j2 != A08) {
                                                z = false;
                                            }
                                            C626936e.A0F(z, "MediaCoreMessageStore/processBatch/inserted row should have same row_id");
                                            r7.A05(A023, j2);
                                        } else {
                                            A06.remove("message_row_id");
                                            String[] strArr = new String[1];
                                            AnonymousClass0x2.A1S(strArr, 0, j2);
                                            if (r5.A05(A06, "message_media", "message_row_id = ?", "UPDATE_MESSAGE_MEDIA_SQL", strArr) != 1) {
                                                throw new SQLiteException("MediaCoreMessageStore/processBatch/Failed to update message media.");
                                            }
                                        }
                                        Axl.A00();
                                        Axl.close();
                                        A03.close();
                                    } catch (Throwable th) {
                                        try {
                                            A03.close();
                                            throw th;
                                        } catch (Throwable th2) {
                                            th.addSuppressed(th2);
                                            throw th;
                                        }
                                    }
                                }
                            }
                            Long A0T3 = C18280x3.A0T(cursor2, columnIndexOrThrow12);
                            r6 = this.A01;
                            str2 = AnonymousClass000.A0X("-invalid-chat-row-id", A01(this));
                            StringBuilder A0l3 = AnonymousClass000.A0l("row_id=");
                            A0l3.append(j2);
                            C18310x6.A1N(", chat_row_id=", ", time=", A0l3, j);
                            str = AnonymousClass000.A0X(A00(A0T3), A0l3);
                            r6.A0A(str2, false, str);
                        }
                    }
                    j = -1;
                    Long A0T32 = C18280x3.A0T(cursor2, columnIndexOrThrow12);
                    r6 = this.A01;
                    str2 = AnonymousClass000.A0X("-invalid-chat-row-id", A01(this));
                    StringBuilder A0l32 = AnonymousClass000.A0l("row_id=");
                    A0l32.append(j2);
                    C18310x6.A1N(", chat_row_id=", ", time=", A0l32, j);
                    str = AnonymousClass000.A0X(A00(A0T32), A0l32);
                    r6.A0A(str2, false, str);
                }
            }
        }
        return new AnonymousClass32H(j2, i2);
        throw th;
    }

    static {
        HashSet A0K = AnonymousClass002.A0K();
        AnonymousClass0x2.A1Q(A0K, 2);
        AnonymousClass0x2.A1Q(A0K, 1);
        AnonymousClass0x2.A1Q(A0K, 25);
        AnonymousClass0x2.A1Q(A0K, 3);
        AnonymousClass0x2.A1Q(A0K, 28);
        AnonymousClass0x2.A1Q(A0K, 13);
        AnonymousClass0x2.A1Q(A0K, 29);
        AnonymousClass0x2.A1Q(A0K, 20);
        AnonymousClass0x2.A1Q(A0K, 9);
        AnonymousClass0x2.A1Q(A0K, 26);
        AnonymousClass0x2.A1Q(A0K, 23);
        AnonymousClass0x2.A1Q(A0K, 37);
        AnonymousClass0x2.A1Q(A0K, 81);
        A02 = Collections.unmodifiableSet(A0K);
    }

    public C23281Rz(C56922sm r3, C613830m r4, AnonymousClass2U4 r5) {
        super(r5, "message_media", Integer.MIN_VALUE);
        this.A00 = r3;
        this.A01 = r4;
    }

    public void A0I() {
        super.A0I();
        this.A06.A03("media_message_ready", 2);
    }
}
