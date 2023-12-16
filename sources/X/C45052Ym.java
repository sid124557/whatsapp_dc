package X;

import android.database.Cursor;
import com.whatsapp.jid.GroupJid;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2Ym  reason: invalid class name and case insensitive filesystem */
public final class C45052Ym {
    public final AnonymousClass1VX A00;
    public final C66363Lb A01;

    public final C48552f5 A00() {
        Cursor A0E;
        C66363Lb r5 = this.A01;
        int A0O = this.A00.A0O(C58422vE.A02, 1657);
        if (!C72303dV.A00(r5.A02) || !r5.A03.A02()) {
            return new C48552f5((List) null, false, false, false, false, false);
        }
        AnonymousClass1R1 r6 = r5.A04;
        ArrayList A0s = AnonymousClass001.A0s();
        AnonymousClass4GK A02 = C18630y0.A02(r6);
        try {
            C56862sg r4 = ((AnonymousClass3H0) A02).A03;
            String[] A1a = AnonymousClass0x9.A1a();
            A1a[0] = String.valueOf(0);
            C18270x1.A1R(A1a, System.currentTimeMillis());
            C18280x3.A1O(A1a, -1);
            A0E = r4.A0E("SELECT jid, mute_end FROM settings WHERE muted_notifications = ? AND (mute_end > ? OR mute_end = ? ) ORDER BY jid ASC", "GET_MUTED_CHAT_JID_WITH_END_TIME_SORTED", A1a);
            int columnIndex = A0E.getColumnIndex("jid");
            int columnIndex2 = A0E.getColumnIndex("mute_end");
            while (A0E.moveToNext()) {
                C95814uZ A0K = AnonymousClass0x2.A0K(A0E, columnIndex);
                if (A0K instanceof GroupJid) {
                    A0s.add(new C52362lM(A0K, C18280x3.A0T(A0E, columnIndex2)));
                }
            }
            A0E.close();
            ArrayList A0n = C18320x8.A0n(A02);
            Iterator it = A0s.iterator();
            while (it.hasNext()) {
                C52362lM r3 = (C52362lM) it.next();
                C95814uZ r2 = r3.A01;
                if (r2 instanceof GroupJid) {
                    C56892sj r1 = r5.A01;
                    if (r1.A0C((GroupJid) r2)) {
                        if (r1.A09.A03((C28011fL) r2) >= A0O) {
                            A0n.add(r3);
                        }
                    }
                }
            }
            C56802sa A0I = r6.A0I();
            C56802sa A0H = r6.A0H();
            if (A0n.isEmpty()) {
                A0n = null;
            }
            return new C48552f5(A0n, !new C05540Tx(r5.A00.A00).A01(), !A0H.A09(), A0H.A02().A0G, !A0I.A09(), A0I.A02().A0G);
        } catch (Throwable th) {
            try {
                A02.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    public C45052Ym(AnonymousClass1VX r1, C66363Lb r2) {
        C18260x0.A0Q(r1, r2);
        this.A00 = r1;
        this.A01 = r2;
    }
}
