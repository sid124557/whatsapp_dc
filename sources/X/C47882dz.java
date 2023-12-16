package X;

import android.content.ContentValues;
import android.database.Cursor;
import com.whatsapp.jid.Jid;

/* renamed from: X.2dz  reason: invalid class name and case insensitive filesystem */
public class C47882dz {
    public final C34411v7 A00;

    public synchronized void A01(C58702vg r7) {
        C85284Fq A07;
        C34411v7 r2 = this.A00;
        Jid jid = r7.A01;
        if (jid == null) {
            C626936e.A0D(false, "setOrUpdateLastEntryPoint/jid is null");
        } else {
            AnonymousClass33M A002 = AnonymousClass33M.A00();
            ContentValues A06 = C18300x5.A06();
            A06.put("jid", jid.getRawString());
            A06.put("entry_point_type", r7.A03);
            A06.put("entry_point_id", r7.A02);
            A06.put("entry_point_time", Long.valueOf(r7.A00));
            try {
                A07 = C18630y0.A07(r2);
                AnonymousClass361.A0B(A06, A07, "wa_last_entry_point");
                A07.close();
            } catch (IllegalArgumentException e) {
                C626936e.A08(AnonymousClass000.A0P(jid, "setOrUpdateLastEntryPoint/unable to update entry point for jid ", AnonymousClass001.A0o()), e);
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
            StringBuilder A0o = AnonymousClass001.A0o();
            C18280x3.A1I(A0o, "setOrUpdateLastEntryPoint/updated entry point for jid=", jid);
            A0o.append(A06);
            AnonymousClass33M.A04(A002, " | time: ", A0o);
        }
        return;
        throw th;
    }

    public C58702vg A00(C95814uZ r13) {
        Cursor A0A;
        C58702vg r6;
        C34411v7 r0 = this.A00;
        AnonymousClass33M A002 = AnonymousClass33M.A00();
        AnonymousClass4GK A03 = C18630y0.A03(r0);
        try {
            A0A = AnonymousClass361.A0A(A03, "SELECT jid, entry_point_type, entry_point_id, entry_point_time FROM wa_last_entry_point WHERE jid = ?", "CONTACT_ENTRY_POINT", C18270x1.A1a(r13));
            if (A0A.moveToNext()) {
                r6 = new C58702vg(AnonymousClass32W.A00(A0A.getString(AnonymousClass0x9.A01(A0A))), A0A.getString(A0A.getColumnIndexOrThrow("entry_point_type")), A0A.getString(A0A.getColumnIndexOrThrow("entry_point_id")), A0A.getLong(A0A.getColumnIndexOrThrow("entry_point_time")));
            } else {
                r6 = null;
            }
            A0A.close();
            StringBuilder A0f = C18280x3.A0f(A03);
            A0f.append("entry point fetched by jid=");
            A0f.append(r13);
            A0f.append(" result=");
            A0f.append(r6);
            AnonymousClass33M.A04(A002, " | time: ", A0f);
            return r6;
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

    public C47882dz(AnonymousClass1RI r2) {
        this.A00 = new C34411v7(r2);
    }
}
