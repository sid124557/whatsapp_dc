package X;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import com.whatsapp.InteractiveAnnotation;
import com.whatsapp.MediaData;
import com.whatsapp.SerializableLocation;
import com.whatsapp.SerializablePoint;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.LinkedList;

/* renamed from: X.30m  reason: invalid class name and case insensitive filesystem */
public class C613830m {
    public final C56352rq A00;
    public final AnonymousClass310 A01;
    public final C56922sm A02;
    public final C623334p A03;
    public final C72303dV A04;
    public final C56082rO A05;
    public final AnonymousClass1VX A06;

    public static void A00(ContentValues contentValues, Integer num, Integer num2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, long j, long j2, long j3, boolean z) {
        C18270x1.A0a(contentValues, j);
        C18270x1.A0c(contentValues, "chat_row_id", j2);
        C621833x.A02(contentValues, "multicast_id", str);
        C621833x.A02(contentValues, "message_url", str2);
        C621833x.A02(contentValues, "mime_type", str3);
        C18270x1.A0c(contentValues, "file_length", j3);
        C621833x.A02(contentValues, "media_name", str4);
        C621833x.A02(contentValues, "file_hash", str5);
        Integer A0Z = C18290x4.A0Z();
        if (num != null) {
            contentValues.put("page_count", num);
            contentValues.put("media_duration", A0Z);
        } else {
            contentValues.put("page_count", A0Z);
            C18270x1.A0b(contentValues, "media_duration", i);
        }
        C621833x.A02(contentValues, "media_caption", str8);
        C621833x.A02(contentValues, "enc_file_hash", str6);
        C621833x.A03(contentValues, "is_animated_sticker", z);
        contentValues.put("sticker_flags", num2);
        C621833x.A02(contentValues, "original_file_hash", str7);
    }

    public AnonymousClass33C A02(byte[] bArr) {
        ObjectInputStream objectInputStream;
        AnonymousClass33C A002;
        File A0B;
        if (bArr != null) {
            try {
                ByteArrayInputStream A0d = AnonymousClass0x9.A0d(bArr);
                try {
                    objectInputStream = new ObjectInputStream(A0d);
                    Object readObject = objectInputStream.readObject();
                    objectInputStream.close();
                    A0d.close();
                    if (readObject instanceof AnonymousClass33C) {
                        C626936e.A06(readObject);
                        A002 = (AnonymousClass33C) readObject;
                    } else if (readObject instanceof MediaData) {
                        C626936e.A06(readObject);
                        A002 = AnonymousClass33C.A00((MediaData) readObject);
                    }
                    File file = A002.A0F;
                    if (file != null) {
                        String path = file.getPath();
                        if (path == null) {
                            A0B = null;
                        } else {
                            A0B = AnonymousClass002.A0B(path);
                        }
                        A002.A0F = this.A01.A06(A0B);
                    }
                    return A002;
                } catch (Throwable th) {
                    A0d.close();
                    throw th;
                }
            } catch (IOException | ClassCastException | ClassNotFoundException | IllegalArgumentException | IndexOutOfBoundsException | NegativeArraySizeException | NullPointerException e) {
                Log.e("CachedMessageStore/getMessageMediaData", e);
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
        }
        return null;
        throw th;
    }

    public AnonymousClass33C A01(Cursor cursor) {
        File A0B;
        AnonymousClass33C r2 = new AnonymousClass33C();
        r2.A0M = C626135u.A05(cursor, "autotransfer_retry_enabled");
        r2.A0I = AnonymousClass0x2.A0Z(cursor, "media_job_uuid");
        r2.A0R = C626135u.A05(cursor, "transferred");
        r2.A0Q = C626135u.A05(cursor, "transcoded");
        r2.A0A = AnonymousClass0x2.A0C(cursor, "file_size");
        r2.A07 = AnonymousClass0x2.A04(cursor, "suspicious_content");
        r2.A0D = AnonymousClass0x2.A0C(cursor, "trim_from");
        r2.A0E = AnonymousClass0x2.A0C(cursor, "trim_to");
        r2.A02 = AnonymousClass0x2.A04(cursor, "face_x");
        r2.A03 = AnonymousClass0x2.A04(cursor, "face_y");
        r2.A0W = C18280x3.A1Z(cursor, "media_key");
        r2.A0B = AnonymousClass0x2.A0C(cursor, "media_key_timestamp");
        r2.A08 = AnonymousClass0x2.A04(cursor, "width");
        r2.A06 = AnonymousClass0x2.A04(cursor, "height");
        r2.A0N = C626135u.A05(cursor, "has_streaming_sidecar");
        r2.A05 = AnonymousClass0x2.A04(cursor, "gif_attribution");
        r2.A00 = cursor.getFloat(cursor.getColumnIndexOrThrow("thumbnail_height_width_ratio"));
        r2.A0G = AnonymousClass0x2.A0Z(cursor, "direct_path");
        r2.A0T = C18280x3.A1Z(cursor, "first_scan_sidecar");
        r2.A04 = AnonymousClass0x2.A04(cursor, "first_scan_length");
        String A0Z = AnonymousClass0x2.A0Z(cursor, "file_path");
        r2.A0L = AnonymousClass0x2.A0Z(cursor, "partial_media_hash");
        r2.A0K = AnonymousClass0x2.A0Z(cursor, "partial_media_enc_hash");
        r2.A0J = AnonymousClass0x2.A0Z(cursor, "media_upload_handle");
        r2.A0P = C626135u.A05(cursor, "mute_video");
        if (A0Z == null) {
            A0B = null;
        } else {
            A0B = AnonymousClass002.A0B(A0Z);
        }
        r2.A0F = this.A01.A06(A0B);
        return r2;
    }

    public final AnonymousClass39K A03(C95814uZ r15) {
        String str;
        Throwable th;
        long j;
        long j2;
        File file;
        AnonymousClass39K r4 = new AnonymousClass39K();
        long j3 = Long.MIN_VALUE;
        while (true) {
            long j4 = j3 + 1;
            AnonymousClass33M A012 = AnonymousClass33M.A01(AnonymousClass000.A0P(r15, "msgstore/messages ", AnonymousClass001.A0o()));
            String[] A1a = AnonymousClass0x9.A1a();
            C56922sm.A02(this.A02, r15, A1a, 0);
            AnonymousClass0x2.A1S(A1a, 1, j4);
            C18280x3.A1Q(A1a, 3000, 2);
            if (C56952sp.A0H(this.A06)) {
                str = "SELECT _id, starred, sort_id, message_type,  message_media.file_size AS file_size,  message_media.file_path AS file_path, table_version FROM message_media AS message_media JOIN available_message_view AS message WHERE message_media.message_row_id = message._id AND message.message_type != 7 AND message.chat_row_id = ? AND sort_id >= ? ORDER BY sort_id ASC LIMIT ?";
            } else {
                str = "SELECT _id, starred, sort_id, message_type,  message_media.file_size AS file_size,  message_media.file_path AS file_path, table_version FROM message_media AS message_media JOIN available_message_view AS message ON message_media.message_row_id = message._id WHERE message.message_type != 7 AND message.chat_row_id = ? AND sort_id >= ? ORDER BY sort_id ASC LIMIT ?";
            }
            AnonymousClass4GK A032 = this.A04.get();
            try {
                Cursor A0E = ((AnonymousClass3H0) A032).A03.A0E(str, "GET_N_MEDIA_MESSAGES_FOR_JID_STORAGE_USAGE", A1a);
                if (A0E.moveToLast()) {
                    j = C18270x1.A01(A0E);
                    j2 = AnonymousClass0x2.A0C(A0E, "sort_id");
                } else {
                    j = 1;
                    j2 = Long.MIN_VALUE;
                }
                A0E.moveToFirst();
                A032.close();
                A012.A07();
                C42242Ni r8 = new C42242Ni(A0E, j, j2);
                long j5 = r8.A02;
                Cursor cursor = r8.A00;
                try {
                    if (!cursor.moveToFirst()) {
                        cursor.close();
                        break;
                    }
                    int columnIndexOrThrow = cursor.getColumnIndexOrThrow("message_type");
                    do {
                        byte b = (byte) cursor.getInt(columnIndexOrThrow);
                        r4.A06++;
                        long j6 = 0;
                        if (C627636p.A0H(b)) {
                            int columnIndex = cursor.getColumnIndex("thumb_image");
                            if (columnIndex >= 0) {
                                AnonymousClass33C A022 = A02(cursor.getBlob(columnIndex));
                                if (A022 != null) {
                                    file = A022.A0F;
                                }
                            } else {
                                String A0Z = AnonymousClass0x2.A0Z(cursor, "file_path");
                                if (A0Z != null) {
                                    file = this.A01.A06(AnonymousClass002.A0B(A0Z));
                                }
                            }
                            if (file != null && file.canRead()) {
                                j6 = file.length();
                            }
                        }
                        if (b == 0) {
                            r4.A09++;
                        } else if (b == 1) {
                            r4.A04++;
                            r4.A0E += j6;
                        } else if (b == 2) {
                            r4.A00++;
                            r4.A0B += j6;
                        } else if (b != 3) {
                            if (b != 4) {
                                if (b != 5) {
                                    if (b == 9) {
                                        r4.A02++;
                                        r4.A0C += j6;
                                    } else if (b != 16) {
                                        if (b == 20) {
                                            r4.A08++;
                                            r4.A0G += j6;
                                        } else if (b == 81) {
                                            r4.A07++;
                                            r4.A0F += j6;
                                        } else if (b == 13) {
                                            r4.A03++;
                                            r4.A0D += j6;
                                        } else if (b != 14) {
                                        }
                                    }
                                }
                                r4.A05++;
                            }
                            r4.A01++;
                        } else {
                            r4.A0A++;
                            r4.A0H += j6;
                        }
                    } while (cursor.moveToNext());
                    cursor.close();
                    if (j4 == j5) {
                        break;
                    }
                    j3 = j5;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                A032.close();
                throw th;
            }
        }
        r4.A06 = r4.A03 + r4.A09 + r4.A00 + r4.A04 + r4.A0A + r4.A07 + r4.A01 + r4.A02 + r4.A05 + r4.A08;
        r4.A0I = r4.A0D + r4.A0B + r4.A0E + r4.A0H + r4.A0F + r4.A0C + r4.A0G;
        return r4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x009c, code lost:
        if (r10 != false) goto L_0x009e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A06(X.C624134x r40) {
        /*
            r39 = this;
            r8 = r40
            boolean r0 = r8 instanceof X.C30471mV
            if (r0 == 0) goto L_0x0129
            X.2z0 r7 = r8.A1J
            X.4uZ r0 = r7.A00
            boolean r0 = r0 instanceof X.C135176kF
            if (r0 != 0) goto L_0x0129
            long r1 = r8.A1L
            r18 = 0
            r6 = 0
            r5 = 1
            int r0 = (r1 > r18 ? 1 : (r1 == r18 ? 0 : -1))
            boolean r2 = X.AnonymousClass001.A1W(r0)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "MediaCoreMessageStore/insertOrUpdateMessage/message must have row_id set; key="
            X.C18260x0.A0l(r7, r0, r1, r2)
            r9 = r8
            X.1mV r9 = (X.C30471mV) r9
            int r0 = r8.A0l()
            boolean r2 = X.AnonymousClass000.A1U(r0, r5)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "MediaCoreMessageStore/insertOrUpdateMessage/message in main storage; key="
            X.C18260x0.A0l(r7, r0, r1, r2)
            r4 = r39
            X.3dV r0 = r4.A04
            X.4Fq r17 = r0.A04()
            X.3Yo r16 = r17.Axl()     // Catch:{ all -> 0x011c }
            android.content.ContentValues r3 = X.AnonymousClass0x9.A06()     // Catch:{ all -> 0x0112 }
            X.33C r0 = r9.A01     // Catch:{ all -> 0x0112 }
            if (r0 == 0) goto L_0x004e
            r4.A04(r3, r0)     // Catch:{ all -> 0x0112 }
        L_0x004e:
            long r14 = r9.A1L     // Catch:{ all -> 0x0112 }
            X.2sm r1 = r4.A02     // Catch:{ all -> 0x0112 }
            X.4uZ r0 = X.AnonymousClass2z0.A00(r9)     // Catch:{ all -> 0x0112 }
            long r34 = r1.A07(r0)     // Catch:{ all -> 0x0112 }
            java.lang.String r0 = r9.A08     // Catch:{ all -> 0x0112 }
            r23 = r0
            java.lang.String r0 = r9.A07     // Catch:{ all -> 0x0112 }
            r24 = r0
            java.lang.String r0 = r9.A05     // Catch:{ all -> 0x0112 }
            r25 = r0
            long r11 = r9.A00     // Catch:{ all -> 0x0112 }
            java.lang.String r26 = r9.A1x()     // Catch:{ all -> 0x0112 }
            java.lang.String r0 = r9.A04     // Catch:{ all -> 0x0112 }
            r22 = r0
            boolean r0 = r9 instanceof X.AnonymousClass1nF     // Catch:{ all -> 0x0112 }
            r2 = 0
            if (r0 == 0) goto L_0x0093
            r1 = r9
            X.1nF r1 = (X.AnonymousClass1nF) r1     // Catch:{ all -> 0x0112 }
            int r0 = r1.A00     // Catch:{ all -> 0x0112 }
            java.lang.Integer r21 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0112 }
            java.lang.String r0 = r1.A01     // Catch:{ all -> 0x0112 }
            r20 = r0
            r1 = 0
        L_0x0083:
            java.lang.String r13 = r9.A03     // Catch:{ all -> 0x0112 }
            boolean r10 = r9 instanceof X.AnonymousClass1nE     // Catch:{ all -> 0x0112 }
            if (r10 == 0) goto L_0x009a
            r0 = r9
            X.1nE r0 = (X.AnonymousClass1nE) r0     // Catch:{ all -> 0x0112 }
            boolean r0 = r0.A02     // Catch:{ all -> 0x0112 }
            r38 = 1
            if (r0 != 0) goto L_0x009e
            goto L_0x009a
        L_0x0093:
            int r1 = r9.A0B     // Catch:{ all -> 0x0112 }
            r21 = r2
            r20 = r2
            goto L_0x0083
        L_0x009a:
            r38 = 0
            if (r10 == 0) goto L_0x00a3
        L_0x009e:
            r0 = r9
            X.1nE r0 = (X.AnonymousClass1nE) r0     // Catch:{ all -> 0x0112 }
            java.lang.Integer r2 = r0.A00     // Catch:{ all -> 0x0112 }
        L_0x00a3:
            java.lang.String r0 = r9.A09     // Catch:{ all -> 0x0112 }
            r27 = r22
            r28 = r13
            r29 = r0
            r30 = r20
            r31 = r1
            r32 = r14
            r36 = r11
            r20 = r3
            r22 = r2
            A00(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r34, r36, r38)     // Catch:{ all -> 0x0112 }
            r0 = r17
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x0112 }
            X.2sg r2 = r0.A03     // Catch:{ all -> 0x0112 }
            java.lang.String r1 = "message_media"
            java.lang.String r0 = "INSERT_MESSAGE_MEDIA_SQL"
            long r10 = r2.A08(r1, r0, r3)     // Catch:{ all -> 0x0112 }
            int r0 = (r10 > r18 ? 1 : (r10 == r18 ? 0 : -1))
            if (r0 <= 0) goto L_0x00d5
            long r1 = r8.A1L     // Catch:{ all -> 0x0112 }
            int r0 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x00ff
            r6 = 1
            goto L_0x00ff
        L_0x00d5:
            java.lang.String r0 = "message_row_id"
            r3.remove(r0)     // Catch:{ all -> 0x0112 }
            java.lang.String r11 = "message_row_id = ?"
            java.lang.String[] r0 = new java.lang.String[r5]     // Catch:{ all -> 0x0112 }
            X.C624134x.A0Y(r8, r0, r6)     // Catch:{ all -> 0x0112 }
            java.lang.String r12 = "UPDATE_MESSAGE_MEDIA_SQL"
            r9 = r3
            r10 = r1
            r13 = r0
            r8 = r2
            int r0 = r8.A05(r9, r10, r11, r12, r13)     // Catch:{ all -> 0x0112 }
            if (r0 == r5) goto L_0x010b
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0112 }
            java.lang.String r0 = "MediaCoreMessageStore/insertOrUpdateMessage/Failed to update message media; key="
            java.lang.String r1 = X.AnonymousClass000.A0P(r7, r0, r1)     // Catch:{ all -> 0x0112 }
            android.database.sqlite.SQLiteException r0 = new android.database.sqlite.SQLiteException     // Catch:{ all -> 0x0112 }
            r0.<init>(r1)     // Catch:{ all -> 0x0112 }
            throw r0     // Catch:{ all -> 0x0112 }
        L_0x00ff:
            java.lang.String r0 = "MediaCoreMessageStore/insertOrUpdateMessage/inserted row should have same row_id"
            X.C626936e.A0F(r6, r0)     // Catch:{ all -> 0x0112 }
            X.33C r2 = r9.A01     // Catch:{ all -> 0x0112 }
            long r0 = r9.A1L     // Catch:{ all -> 0x0112 }
            r4.A05(r2, r0)     // Catch:{ all -> 0x0112 }
        L_0x010b:
            r16.A00()     // Catch:{ all -> 0x0112 }
            r16.close()     // Catch:{ all -> 0x011c }
            goto L_0x0126
        L_0x0112:
            r1 = move-exception
            r16.close()     // Catch:{ all -> 0x0117 }
            goto L_0x011b
        L_0x0117:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x011c }
        L_0x011b:
            throw r1     // Catch:{ all -> 0x011c }
        L_0x011c:
            r1 = move-exception
            r17.close()     // Catch:{ all -> 0x0121 }
            throw r1
        L_0x0121:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        L_0x0126:
            r17.close()
        L_0x0129:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C613830m.A06(X.34x):void");
    }

    public void A07(C30471mV r35) {
        InteractiveAnnotation[] interactiveAnnotationArr;
        Cursor A0E;
        InteractiveAnnotation interactiveAnnotation;
        C95804uY r1;
        C30471mV r4 = r35;
        boolean z = false;
        C624134x.A0V(r4, "MediaCoreMessageStore/fillMediaInfo/message must have row_id set; key=", AnonymousClass001.A0o(), AnonymousClass001.A1W((r4.A1L > 0 ? 1 : (r4.A1L == 0 ? 0 : -1))));
        String[] strArr = new String[1];
        C624134x.A0X(r4, strArr);
        C72303dV r7 = this.A04;
        AnonymousClass4GK A032 = r7.get();
        try {
            Cursor A0E2 = ((AnonymousClass3H0) A032).A03.A0E("SELECT message_row_id, chat_row_id, autotransfer_retry_enabled, multicast_id, media_job_uuid, transferred, transcoded, file_path, file_size, suspicious_content, trim_from, trim_to, face_x, face_y, media_key, media_key_timestamp, width, height, has_streaming_sidecar, gif_attribution, thumbnail_height_width_ratio, direct_path, first_scan_sidecar, first_scan_length, message_url, mime_type, file_length, media_name, file_hash, media_duration, page_count, enc_file_hash, partial_media_hash, partial_media_enc_hash, is_animated_sticker, original_file_hash, mute_video, media_caption, media_upload_handle, sticker_flags FROM message_media WHERE message_row_id = ?", "GET_MESSAGE_MEDIA_SQL", strArr);
            try {
                if (A0E2.moveToNext()) {
                    AnonymousClass33C A012 = A01(A0E2);
                    long j = r4.A1L;
                    int i = 1;
                    int i2 = 0;
                    if (j > 0) {
                        z = true;
                    }
                    C626936e.A0E(z, "MediaCoreMessageStore/loadInteractiveAnnotations/invalid row_id");
                    LinkedList A18 = AnonymousClass0x9.A18();
                    AnonymousClass4GK A033 = r7.get();
                    try {
                        C56862sg r72 = ((AnonymousClass3H0) A033).A03;
                        String[] strArr2 = new String[1];
                        C18280x3.A1R(strArr2, 0, j);
                        Cursor A0E3 = r72.A0E("SELECT _id, message_row_id, skip_confirmation, location_latitude, location_longitude, location_name, newsletter_jid_row_id, newsletter_server_message_id, newsletter_name, newsletter_content_type, sort_order FROM message_media_interactive_annotation WHERE message_row_id = ? ORDER BY sort_order", "GET_MESSAGE_MEDIA_INTERACTIVE_ANNOTATION_SQL", strArr2);
                        while (A0E3.moveToNext()) {
                            try {
                                String[] strArr3 = new String[i];
                                C18280x3.A1R(strArr3, i2, C18270x1.A01(A0E3));
                                A0E = r72.A0E("SELECT message_media_interactive_annotation_row_id, x, y, sort_order FROM message_media_interactive_annotation_vertex WHERE message_media_interactive_annotation_row_id = ? ORDER BY sort_order", "GET_MESSAGE_MEDIA_INTERACTIVE_ANNOTATION_VERTEX_SQL", strArr3);
                                SerializablePoint[] serializablePointArr = new SerializablePoint[A0E.getCount()];
                                int i3 = 0;
                                while (A0E.moveToNext()) {
                                    serializablePointArr[i3] = new SerializablePoint(C18310x6.A00(A0E, "x"), C18310x6.A00(A0E, "y"));
                                    i3++;
                                }
                                A0E.close();
                                boolean A052 = C626135u.A05(A0E3, "skip_confirmation");
                                boolean A1W = AnonymousClass000.A1W(AnonymousClass0x2.A0Z(A0E3, "location_name"));
                                boolean A1S = AnonymousClass000.A1S(AnonymousClass0x2.A04(A0E3, "newsletter_jid_row_id"));
                                if (A1W) {
                                    interactiveAnnotation = new InteractiveAnnotation(AnonymousClass0x2.A0Z(A0E3, "location_name"), serializablePointArr, C18310x6.A00(A0E3, "location_latitude"), C18310x6.A00(A0E3, "location_longitude"), A052);
                                } else {
                                    if (A1S) {
                                        int A042 = AnonymousClass0x2.A04(A0E3, "newsletter_jid_row_id");
                                        int A043 = AnonymousClass0x2.A04(A0E3, "newsletter_server_message_id");
                                        String A0Z = AnonymousClass0x2.A0Z(A0E3, "newsletter_name");
                                        C372721p A002 = AnonymousClass28U.A00(Integer.valueOf(AnonymousClass0x2.A04(A0E3, "newsletter_content_type")));
                                        Jid A08 = this.A03.A08((long) A042);
                                        if ((A08 instanceof C95804uY) && (r1 = (C95804uY) A08) != null) {
                                            interactiveAnnotation = new InteractiveAnnotation(r1, A002, A0Z, serializablePointArr, A043, A052);
                                        }
                                    }
                                    i = 1;
                                    i2 = 0;
                                }
                                A18.add(interactiveAnnotation);
                                i = 1;
                                i2 = 0;
                            } catch (Throwable th) {
                                if (A0E3 != null) {
                                    A0E3.close();
                                }
                                throw th;
                            }
                        }
                        A0E3.close();
                        A033.close();
                        if (A18.isEmpty()) {
                            interactiveAnnotationArr = null;
                        } else {
                            interactiveAnnotationArr = (InteractiveAnnotation[]) A18.toArray(new InteractiveAnnotation[i2]);
                        }
                        A012.A0X = interactiveAnnotationArr;
                        r4.A1y(A0E2, A012);
                    } catch (Throwable th2) {
                        A033.close();
                        throw th2;
                    }
                }
                A0E2.close();
                A032.close();
                if (r4.A01 == null) {
                    StringBuilder A0o = AnonymousClass001.A0o();
                    C624134x.A0P(r4, "MediaCoreMessageStore/fillMediaInfo; media was not found for message: id=", A0o);
                    A0o.append(", type=");
                    C18270x1.A1F(A0o, r4.A1I);
                    r4.A01 = new AnonymousClass33C();
                    return;
                }
                return;
                throw th;
            } catch (Throwable th3) {
                if (A0E2 != null) {
                    A0E2.close();
                }
                throw th3;
            }
        } catch (Throwable th4) {
            try {
                A032.close();
                throw th4;
            } catch (Throwable th5) {
                th4.addSuppressed(th5);
                throw th4;
            }
        }
    }

    public void A08(C30471mV r25, long j) {
        C69833Yo Axl;
        int i;
        Integer num;
        String str;
        C30471mV r8 = r25;
        boolean z = false;
        AnonymousClass2z0 A09 = C624134x.A09(r8, "MediaCoreMessageStore/insertOrUpdateQuotedMediaMessage/message in main storage; key=", AnonymousClass001.A0o(), AnonymousClass000.A1U(r8.A0l(), 2));
        C85284Fq A042 = this.A04.A04();
        try {
            Axl = A042.Axl();
            ContentValues A062 = AnonymousClass0x9.A06();
            byte[] bArr = null;
            if (r8 instanceof AnonymousClass1nF) {
                AnonymousClass1nF r1 = (AnonymousClass1nF) r8;
                num = Integer.valueOf(r1.A00);
                str = r1.A01;
                i = 0;
            } else {
                i = r8.A0B;
                num = null;
                str = null;
            }
            C614630w A0y = r8.A0y();
            if (A0y != null) {
                bArr = A0y.A09();
            }
            String str2 = r8.A07;
            String str3 = r8.A05;
            long j2 = r8.A00;
            String A1x = r8.A1x();
            String str4 = r8.A04;
            String str5 = r8.A03;
            long j3 = j;
            C18270x1.A0c(A062, "message_row_id", j3);
            C621833x.A02(A062, "message_url", str2);
            C621833x.A02(A062, "mime_type", str3);
            C18270x1.A0c(A062, "file_length", j2);
            C621833x.A02(A062, "media_name", A1x);
            C621833x.A02(A062, "file_hash", str4);
            int i2 = 0;
            if (num != null) {
                A062.put("page_count", num);
            } else {
                A062.put("page_count", 0);
                i2 = Integer.valueOf(i);
            }
            A062.put("media_duration", i2);
            C621833x.A02(A062, "enc_file_hash", str5);
            C621833x.A04(A062, "thumbnail", bArr);
            C621833x.A02(A062, "media_caption", str);
            AnonymousClass33C r82 = r8.A01;
            if (r82 != null) {
                C626936e.A06(r82);
                C621833x.A02(A062, "media_job_uuid", r82.A0I);
                C621833x.A03(A062, "transferred", r82.A0R);
                A062.put("file_size", Long.valueOf(r82.A0A));
                AnonymousClass33C.A01(A062, r82);
                C621833x.A02(A062, "direct_path", r82.A0G);
                File file = r82.A0F;
                if (file != null) {
                    A062.put("file_path", this.A01.A08(file));
                } else {
                    A062.putNull("file_path");
                }
            }
            C56862sg r12 = ((AnonymousClass3H0) A042).A03;
            long A08 = r12.A08("message_quoted_media", "INSERT_MESSAGE_QUOTED_MEDIA_SQL", A062);
            if (A08 >= 0) {
                if (j == A08) {
                    z = true;
                }
                C626936e.A0F(z, "MediaCoreMessageStore/insertOrUpdateQuotedMediaMessage/inserted row should have same row_id");
            } else {
                A062.remove("message_row_id");
                String[] strArr = new String[1];
                AnonymousClass0x2.A1S(strArr, 0, j3);
                if (r12.A05(A062, "message_quoted_media", "message_row_id = ?", "UPDATE_MESSAGE_QUOTED_MEDIA_SQL", strArr) != 1) {
                    throw new SQLiteException(AnonymousClass000.A0P(A09, "MediaCoreMessageStore/insertOrUpdateQuotedMediaMessage/Failed to insert / update quoted media data; key=", AnonymousClass001.A0o()));
                }
            }
            Axl.A00();
            Axl.close();
            A042.close();
            return;
        } catch (Throwable th) {
            try {
                A042.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    public void A09(C30471mV r6, boolean z, boolean z2) {
        File file;
        AnonymousClass33C r0 = r6.A01;
        if (r0 != null && (file = r0.A0F) != null) {
            boolean A0y = z | C627636p.A0y(r6);
            C56352rq r3 = this.A00;
            byte b = r6.A1I;
            if (r3.A07(file)) {
                int A002 = r3.A00(file, 1);
                if (A0y && A002 < 0) {
                    if (z2) {
                        r3.A01.A02(new AnonymousClass47G(file, b));
                    } else {
                        r3.A03(file, b);
                    }
                }
            }
        }
    }

    public C613830m(C56352rq r1, AnonymousClass310 r2, C56922sm r3, C623334p r4, C72303dV r5, C56082rO r6, AnonymousClass1VX r7) {
        this.A06 = r7;
        this.A03 = r4;
        this.A02 = r3;
        this.A01 = r2;
        this.A05 = r6;
        this.A04 = r5;
        this.A00 = r1;
    }

    public void A04(ContentValues contentValues, AnonymousClass33C r5) {
        C626936e.A06(r5);
        C621833x.A03(contentValues, "autotransfer_retry_enabled", r5.A0M);
        C621833x.A02(contentValues, "media_job_uuid", r5.A0I);
        C621833x.A03(contentValues, "transferred", r5.A0R);
        C621833x.A03(contentValues, "transcoded", r5.A0Q);
        contentValues.put("file_size", Long.valueOf(r5.A0A));
        contentValues.put("suspicious_content", Integer.valueOf(r5.A07));
        contentValues.put("trim_from", Long.valueOf(r5.A0D));
        contentValues.put("trim_to", Long.valueOf(r5.A0E));
        contentValues.put("face_x", Integer.valueOf(r5.A02));
        contentValues.put("face_y", Integer.valueOf(r5.A03));
        AnonymousClass33C.A01(contentValues, r5);
        C621833x.A03(contentValues, "has_streaming_sidecar", r5.A0N);
        contentValues.put("gif_attribution", Integer.valueOf(r5.A05));
        contentValues.put("thumbnail_height_width_ratio", Float.valueOf(r5.A00));
        C621833x.A02(contentValues, "direct_path", r5.A0G);
        C621833x.A04(contentValues, "first_scan_sidecar", r5.A0T);
        contentValues.put("first_scan_length", Integer.valueOf(r5.A04));
        File file = r5.A0F;
        if (file != null) {
            contentValues.put("file_path", this.A01.A08(file));
        } else {
            contentValues.putNull("file_path");
        }
        C621833x.A02(contentValues, "partial_media_hash", r5.A0L);
        C621833x.A02(contentValues, "partial_media_enc_hash", r5.A0K);
        C621833x.A02(contentValues, "media_upload_handle", r5.A0J);
        C621833x.A03(contentValues, "mute_video", r5.A0P);
    }

    public void A05(AnonymousClass33C r21, long j) {
        C69833Yo Axl;
        int i;
        AnonymousClass33C r1 = r21;
        if (r21 != null && r1.A0X != null) {
            C85284Fq A042 = this.A04.A04();
            try {
                Axl = A042.Axl();
                int i2 = 0;
                for (InteractiveAnnotation interactiveAnnotation : r1.A0X) {
                    ContentValues A062 = AnonymousClass0x9.A06();
                    C18270x1.A0a(A062, j);
                    C621833x.A03(A062, "skip_confirmation", interactiveAnnotation.skipConfirmation);
                    Object obj = interactiveAnnotation.data;
                    if (obj instanceof SerializableLocation) {
                        SerializableLocation serializableLocation = (SerializableLocation) obj;
                        C18300x5.A12(A062, "location_latitude", serializableLocation.latitude);
                        C18300x5.A12(A062, "location_longitude", serializableLocation.longitude);
                        A062.put("location_name", serializableLocation.name);
                    } else if (obj instanceof C53042mS) {
                        C53042mS r4 = (C53042mS) obj;
                        C18270x1.A0c(A062, "newsletter_jid_row_id", this.A03.A05(r4.A01));
                        C18270x1.A0b(A062, "newsletter_server_message_id", r4.A00);
                        A062.put("newsletter_name", r4.A03);
                        C372721p r0 = r4.A02;
                        if (r0 != null) {
                            i = r0.value;
                        } else {
                            i = 0;
                        }
                        C18270x1.A0b(A062, "newsletter_content_type", i);
                    }
                    C56862sg A012 = AnonymousClass3H0.A01(A062, A042, "sort_order", i2);
                    long A08 = A012.A08("message_media_interactive_annotation", "INSERT_MESSAGE_MEDIA_INTERACTIVE_ANNOTATION_SQL", A062);
                    i2++;
                    SerializablePoint[] serializablePointArr = interactiveAnnotation.polygonVertices;
                    if (serializablePointArr != null) {
                        int i3 = 0;
                        for (SerializablePoint serializablePoint : serializablePointArr) {
                            ContentValues A063 = AnonymousClass0x9.A06();
                            C18270x1.A0c(A063, "message_media_interactive_annotation_row_id", A08);
                            C18300x5.A12(A063, "x", serializablePoint.x);
                            C18300x5.A12(A063, "y", serializablePoint.y);
                            C18270x1.A0b(A063, "sort_order", i3);
                            A012.A08("message_media_interactive_annotation_vertex", "INSERT_MESSAGE_MEDIA_INTERACTIVE_ANNOTATION_VERTEX_SQL", A063);
                            i3++;
                        }
                    }
                }
                Axl.A00();
                Axl.close();
                A042.close();
                return;
            } catch (Throwable th) {
                try {
                    A042.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        } else {
            return;
        }
        throw th;
    }
}
