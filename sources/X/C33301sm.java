package X;

import android.database.Cursor;
import android.util.Pair;
import com.whatsapp.calling.callhistory.viewmodel.CallsHistoryFragmentV2ViewModel;
import com.whatsapp.util.Log;

/* renamed from: X.1sm  reason: invalid class name and case insensitive filesystem */
public class C33301sm extends AnonymousClass5ZM {
    public final /* synthetic */ AnonymousClass5XL A00;

    public C33301sm(AnonymousClass5XL r1) {
        this.A00 = r1;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        Cursor A0E;
        C50392i6 r7;
        int i;
        C55422qK r72 = this.A00.A0I;
        C72303dV r9 = r72.A05;
        AnonymousClass4GK A03 = r9.get();
        try {
            C56862sg r6 = ((AnonymousClass3H0) A03).A03;
            String[] A1Y = AnonymousClass0x9.A1Y();
            C18260x0.A1Y(A1Y, System.currentTimeMillis() - 900000);
            A0E = r6.A0E("SELECT creation_message_row_id, key_id, key_from_me, key_chat_row_id, call_type, scheduled_timestamp, call_title, creator_jid_row_id, is_upcoming, call_log_row_id FROM scheduled_calls WHERE is_upcoming = 1  AND scheduled_timestamp >= ?  ORDER BY scheduled_timestamp ASC  LIMIT 1", "ScheduledCallsStore/GET_NEAREST_UPCOMING_CALL", A1Y);
            if (!A0E.moveToFirst()) {
                A0E.close();
                A03.close();
                r7 = null;
            } else {
                r7 = r72.A01(A0E);
                A0E.close();
                A03.close();
            }
            A03 = r9.get();
            C56862sg r62 = ((AnonymousClass3H0) A03).A03;
            String[] A1Y2 = AnonymousClass0x9.A1Y();
            C18260x0.A1Y(A1Y2, System.currentTimeMillis() - 900000);
            A0E = r62.A0E("SELECT COUNT(*) as count FROM scheduled_calls WHERE is_upcoming = 1  AND scheduled_timestamp >= ? ", "ScheduledCallsStore/GET_NUM_UPCOMING_CALLS", A1Y2);
            if (A0E.moveToNext()) {
                i = AnonymousClass0x2.A03(A0E);
                A0E.close();
                A03.close();
            } else {
                A0E.close();
                A03.close();
                i = 0;
            }
            return C18290x4.A0K(r7, i);
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

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        Pair pair = (Pair) obj;
        AnonymousClass5XL r3 = this.A00;
        r3.A04 = null;
        Object obj2 = pair.first;
        if (obj2 != null || C18290x4.A03(pair) <= 0) {
            C50392i6 r2 = (C50392i6) obj2;
            int A03 = C18290x4.A03(pair);
            AnonymousClass7DD r0 = r3.A06;
            if (r0 != null) {
                CallsHistoryFragmentV2ViewModel callsHistoryFragmentV2ViewModel = r0.A00;
                callsHistoryFragmentV2ViewModel.A00 = A03;
                CallsHistoryFragmentV2ViewModel.A03(callsHistoryFragmentV2ViewModel, r2);
                CallsHistoryFragmentV2ViewModel.A02(callsHistoryFragmentV2ViewModel);
                return;
            }
            return;
        }
        Log.w("CallsHistoryDataSource/RefreshScheduledCallsTask/onPostExecute mismatch between data");
    }
}
