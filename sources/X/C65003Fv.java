package X;

import android.content.ContentValues;
import android.database.Cursor;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.3Fv  reason: invalid class name and case insensitive filesystem */
public class C65003Fv implements AnonymousClass664 {
    public final C56612sH A00;
    public final C55422qK A01;
    public final AnonymousClass2I3 A02;
    public final C183538qC A03;

    public void BQV() {
        Cursor A0E;
        C55422qK r3 = this.A01;
        ArrayList A0s = AnonymousClass001.A0s();
        String[] A1a = AnonymousClass0x9.A1a();
        C18270x1.A1O(A1a, 1);
        AnonymousClass0x2.A1S(A1a, 1, 0);
        AnonymousClass0x2.A1S(A1a, 2, System.currentTimeMillis() - 900000);
        C72303dV r6 = r3.A05;
        AnonymousClass4GK A032 = r6.get();
        try {
            A0E = ((AnonymousClass3H0) A032).A03.A0E(" SELECT creation_message_row_id, key_id, key_from_me, key_chat_row_id, call_type, scheduled_timestamp, call_title, creator_jid_row_id, is_upcoming, call_log_row_id FROM scheduled_calls WHERE is_upcoming = ?  AND scheduled_timestamp > ?  AND scheduled_timestamp <= ? ", "ScheduledCallsStoreSELECT_UPCOMING_SCHEDULED_CALLS_IN_TIMERANGE", A1a);
            while (A0E.moveToNext()) {
                C50392i6 A012 = r3.A01(A0E);
                if (A012 != null) {
                    A0s.add(A012);
                }
            }
            A0E.close();
            ArrayList A0n = C18320x8.A0n(A032);
            Iterator it = A0s.iterator();
            while (it.hasNext()) {
                long j = ((C50392i6) it.next()).A02;
                AnonymousClass0x2.A1Q(A0n, j);
                ((AnonymousClass30F) this.A03.get()).A00(j);
            }
            if (A0n.size() > 0) {
                AnonymousClass2I3 r2 = this.A02;
                C24381Xe r1 = new C24381Xe();
                r1.A00 = Long.valueOf((long) A0n.size());
                r2.A00.BhD(r1);
            }
            int size = A0n.size();
            String[] strArr = new String[size];
            for (int i = 0; i < size; i++) {
                strArr[i] = String.valueOf(A0n.get(i));
            }
            StringBuilder A0o = AnonymousClass001.A0o();
            C57212tH.A02("creation_message_row_id IN ", A0o, size);
            String obj = A0o.toString();
            C85284Fq A04 = r6.A04();
            try {
                ContentValues A07 = AnonymousClass0x9.A07(1);
                A07.put("is_upcoming", Boolean.FALSE);
                if (((AnonymousClass3H0) A04).A03.A05(A07, "scheduled_calls", obj, "ScheduledCallsStore/UPDATE_LIST_OF_SCHEDULED_CALLS_IS_UPCOMING_TO_FALSE", strArr) == 0) {
                    Log.w("ScheduledCallsStore/updateListOfScheduledCallsIsUpcomingToFalse (by row ID) failed to update");
                }
                A04.close();
                r3.A02.A01(C69983Zk.A00(r3, 24), 67);
                return;
            } catch (Throwable th) {
                th.addSuppressed(th);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            A032.close();
            throw th;
        }
        throw th;
    }

    public C65003Fv(C56612sH r1, C55422qK r2, AnonymousClass2I3 r3, C183538qC r4) {
        this.A00 = r1;
        this.A01 = r2;
        this.A03 = r4;
        this.A02 = r3;
    }

    public String BDW() {
        return "ScheduleCallDailyCron";
    }
}
