package X;

import android.content.ContentValues;

/* renamed from: X.33x  reason: invalid class name and case insensitive filesystem */
public class C621833x {
    public static void A01(ContentValues contentValues, Long l, String str) {
        if (l == null) {
            contentValues.putNull(str);
        } else {
            contentValues.put(str, l);
        }
    }

    public static void A02(ContentValues contentValues, String str, String str2) {
        if (str2 == null) {
            contentValues.putNull(str);
        } else {
            contentValues.put(str, str2);
        }
    }

    public static void A04(ContentValues contentValues, String str, byte[] bArr) {
        if (bArr == null) {
            contentValues.putNull(str);
        } else {
            contentValues.put(str, bArr);
        }
    }

    public static void A00(ContentValues contentValues, C624134x r3, long j) {
        contentValues.put("received_timestamp", Long.valueOf(j));
        contentValues.put("receipt_server_timestamp", Long.valueOf(r3.A0J));
        contentValues.put("message_type", Byte.valueOf(r3.A1I));
        A02(contentValues, "text_data", r3.A18());
        contentValues.put("lookup_tables", Long.valueOf(r3.A0m()));
    }

    public static void A03(ContentValues contentValues, String str, boolean z) {
        C18270x1.A0c(contentValues, str, C18290x4.A09(z ? 1 : 0));
    }
}
