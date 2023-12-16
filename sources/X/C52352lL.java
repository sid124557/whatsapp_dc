package X;

import android.content.ContentValues;
import android.database.Cursor;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;

/* renamed from: X.2lL  reason: invalid class name and case insensitive filesystem */
public class C52352lL {
    public final C56972sr A00;
    public final C623334p A01;
    public final C72303dV A02;

    public UserJid A01(C624134x r2) {
        DeviceJid A002;
        if (!r2.A1J.A02) {
            return r2.A0o();
        }
        C60432yY A10 = r2.A10();
        if (A10 != null) {
            A002 = A10.A00;
        } else {
            A002 = A00(r2);
        }
        if (A002 != null) {
            return A002.userJid;
        }
        return C56972sr.A05(this.A00);
    }

    public void A02(long j, long j2) {
        C85284Fq A04 = this.A02.A04();
        try {
            ContentValues A09 = C18280x3.A09();
            C18270x1.A0a(A09, j);
            AnonymousClass3H0.A02(A09, A04, "author_device_jid", j2).A08("message_details", "MessageDetailsStore/insertMessageDetails", A09);
            A04.close();
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }

    public C52352lL(C56972sr r1, C623334p r2, C72303dV r3) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = r3;
    }

    public DeviceJid A00(C624134x r8) {
        Cursor A0E;
        DeviceJid deviceJid;
        C60432yY A10 = r8.A10();
        if (A10 != null && (deviceJid = A10.A00) != null) {
            return deviceJid;
        }
        DeviceJid deviceJid2 = null;
        if (A10 != null || r8.A1L == -1) {
            return null;
        }
        AnonymousClass4GK A03 = this.A02.get();
        try {
            C56862sg r4 = ((AnonymousClass3H0) A03).A03;
            String[] A1Y = AnonymousClass0x9.A1Y();
            C18260x0.A1Y(A1Y, r8.A1L);
            A0E = r4.A0E("SELECT author_device_jid FROM message_details WHERE message_row_id = ?", "GET_MESSAGE_AUTHOR_SQL", A1Y);
            if (A0E.moveToLast()) {
                Jid A08 = this.A01.A08(AnonymousClass0x2.A0C(A0E, "author_device_jid"));
                if (A08 instanceof DeviceJid) {
                    deviceJid2 = DeviceJid.of(A08);
                }
            }
            A0E.close();
            A03.close();
            return deviceJid2;
        } catch (Throwable th) {
            try {
                A03.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }
}
