package X;

import android.database.Cursor;
import android.text.TextUtils;

/* renamed from: X.2w2  reason: invalid class name and case insensitive filesystem */
public class C58922w2 {
    public final int A00;
    public final int A01;
    public final long A02;
    public final long A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final byte[] A09;
    public final byte[] A0A;

    public static C58922w2 A00(Cursor cursor) {
        String str;
        int columnIndexOrThrow = cursor.getColumnIndexOrThrow("local_path");
        byte[] bArr = null;
        if (!cursor.isNull(columnIndexOrThrow)) {
            str = cursor.getString(columnIndexOrThrow);
        } else {
            str = null;
        }
        byte[] A1Z = C18280x3.A1Z(cursor, "media_key");
        if (A1Z.length == 0) {
            A1Z = null;
        }
        String A0Z = AnonymousClass0x2.A0Z(cursor, "media_hash");
        if (TextUtils.isEmpty(A0Z)) {
            A0Z = null;
        }
        String A0Z2 = AnonymousClass0x2.A0Z(cursor, "direct_path");
        if (TextUtils.isEmpty(A0Z2)) {
            A0Z2 = null;
        }
        String A0Z3 = AnonymousClass0x2.A0Z(cursor, "media_enc_hash");
        if (TextUtils.isEmpty(A0Z3)) {
            A0Z3 = null;
        }
        int columnIndexOrThrow2 = cursor.getColumnIndexOrThrow("inline_payload");
        if (!cursor.isNull(columnIndexOrThrow2)) {
            bArr = cursor.getBlob(columnIndexOrThrow2);
        }
        return new C58922w2(str, A0Z, A0Z2, A0Z3, AnonymousClass0x2.A0Z(cursor, "message_id"), A1Z, bArr, AnonymousClass0x2.A04(cursor, "sync_type"), AnonymousClass0x2.A04(cursor, "chunk_order"), AnonymousClass0x2.A0C(cursor, "file_size"), AnonymousClass0x2.A0C(cursor, "start_time"));
    }

    public C58922w2(String str, String str2, String str3, String str4, String str5, byte[] bArr, byte[] bArr2, int i, int i2, long j, long j2) {
        this.A01 = i;
        this.A02 = j;
        this.A00 = i2;
        this.A0A = bArr;
        this.A05 = str;
        this.A07 = str2;
        this.A04 = str3;
        this.A06 = str4;
        this.A09 = bArr2;
        this.A08 = str5;
        this.A03 = j2;
    }
}
