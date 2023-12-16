package X;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import com.whatsapp.util.Log;

/* renamed from: X.1R0  reason: invalid class name */
public class AnonymousClass1R0 extends C56772sX {
    public static final String[] A0C = {"wa_trusted_contacts", "wa_trusted_contacts_send"};
    public final C55682qk A00;
    public final C56972sr A01;
    public final C56512s6 A02;
    public final C54292oU A03;
    public final C54412og A04;
    public final C48502f0 A05;
    public final C60972zT A06;
    public final C45932ao A07;
    public final AnonymousClass2G4 A08;
    public final C48772fR A09;
    public final C622634i A0A;
    public final AnonymousClass1RI A0B;

    public static boolean A00(AnonymousClass1RI r15, AnonymousClass1RI r16) {
        Cursor A0E;
        try {
            C85284Fq A0C2 = r15.A0C();
            try {
                C85284Fq A0C3 = r16.A0C();
                try {
                    C69833Yo Axl = A0C2.Axl();
                    try {
                        C69833Yo Axl2 = A0C3.Axl();
                        try {
                            for (String str : A0C) {
                                C56862sg r4 = ((AnonymousClass3H0) A0C3).A03;
                                r4.A07(str, (String) null, AnonymousClass000.A0V("WaDatabaseBackupProducer/copyBackupTables/delete/", str, AnonymousClass001.A0o()), (String[]) null);
                                A0E = ((AnonymousClass3H0) A0C2).A03.A0E(AnonymousClass000.A0V("SELECT * FROM ", str, AnonymousClass001.A0o()), AnonymousClass000.A0V("WaDatabaseBackupProducer/copyBackupTables/read/", str, AnonymousClass001.A0o()), (String[]) null);
                                while (A0E.moveToNext()) {
                                    ContentValues A062 = AnonymousClass0x9.A06();
                                    DatabaseUtils.cursorRowToContentValues(A0E, A062);
                                    r4.A08(str, AnonymousClass000.A0V("WaDatabaseBackupProducer/copyBackupTables/write/", str, AnonymousClass001.A0o()), A062);
                                }
                                A0E.close();
                            }
                            Axl.A00();
                            Axl2.A00();
                            Axl2.close();
                            Axl.close();
                            A0C3.close();
                            A0C2.close();
                            return true;
                        } catch (Throwable th) {
                            Axl2.close();
                            throw th;
                        }
                        throw th;
                    } catch (Throwable th2) {
                        Axl.close();
                        throw th2;
                    }
                } catch (Throwable th3) {
                    A0C3.close();
                    throw th3;
                }
            } catch (Throwable th4) {
                A0C2.close();
                throw th4;
            }
        } catch (SQLiteDatabaseCorruptException e) {
            Log.e("WaDatabaseBackupProducer/copyBackupTables/exception", e);
            return false;
        } catch (Throwable th5) {
            th4.addSuppressed(th5);
        }
    }

    public AnonymousClass1R0(C55682qk r1, C56972sr r2, C56512s6 r3, C54292oU r4, C54412og r5, C48502f0 r6, C42822Pq r7, C60972zT r8, C45932ao r9, AnonymousClass2G4 r10, C48772fR r11, C622634i r12, AnonymousClass1RI r13) {
        super(r7);
        this.A03 = r4;
        this.A00 = r1;
        this.A0A = r12;
        this.A01 = r2;
        this.A07 = r9;
        this.A05 = r6;
        this.A08 = r10;
        this.A0B = r13;
        this.A02 = r3;
        this.A06 = r8;
        this.A09 = r11;
        this.A04 = r5;
    }
}
