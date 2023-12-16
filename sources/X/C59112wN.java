package X;

import android.content.ContentValues;
import android.database.Cursor;

/* renamed from: X.2wN  reason: invalid class name and case insensitive filesystem */
public class C59112wN {
    public final C49112g0 A00;

    public C59112wN(C49112g0 r1) {
        this.A00 = r1;
    }

    public static AnonymousClass2SO A00(Cursor cursor) {
        int A02 = AnonymousClass0x7.A02(cursor);
        int columnIndexOrThrow = cursor.getColumnIndexOrThrow("local_path");
        int columnIndexOrThrow2 = cursor.getColumnIndexOrThrow("exported_path");
        int columnIndexOrThrow3 = cursor.getColumnIndexOrThrow("required");
        int columnIndexOrThrow4 = cursor.getColumnIndexOrThrow("file_size");
        int columnIndexOrThrow5 = cursor.getColumnIndexOrThrow("encryption_iv");
        long j = cursor.getLong(A02);
        String string = cursor.getString(columnIndexOrThrow);
        String string2 = cursor.getString(columnIndexOrThrow2);
        int i = cursor.getInt(columnIndexOrThrow3);
        long j2 = cursor.getLong(columnIndexOrThrow4);
        String string3 = cursor.getString(columnIndexOrThrow5);
        C626936e.A06(string);
        C626936e.A06(string2);
        C626936e.A06(string3);
        return new AnonymousClass2SO(AnonymousClass002.A0B(string), string2, string3, j, j2, AnonymousClass000.A1S(i));
    }

    public long A01(String str, String str2, String str3, long j, boolean z) {
        AnonymousClass1R5 r0;
        ContentValues A06 = AnonymousClass0x9.A06();
        A06.put("local_path", str);
        A06.put("exported_path", str2);
        AnonymousClass0x2.A0o(A06, "required", z);
        C18270x1.A0c(A06, "file_size", j);
        A06.put("encryption_iv", str3);
        C49112g0 r1 = this.A00;
        synchronized (r1) {
            r0 = r1.A00;
            if (r0 == null) {
                r0 = (AnonymousClass1R5) r1.A02.get();
                r1.A00 = r0;
            }
        }
        C85284Fq A0C = r0.A0C();
        try {
            long A08 = ((AnonymousClass3H0) A0C).A03.A08("exported_files_metadata", "XPM_EXPORT_FILE_METADATA_ADD", A06);
            A0C.close();
            return A08;
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }
}
