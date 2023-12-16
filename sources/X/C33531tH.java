package X;

import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.text.TextUtils;
import com.whatsapp.util.Log;

/* renamed from: X.1tH  reason: invalid class name and case insensitive filesystem */
public final class C33531tH extends AnonymousClass5ZM {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ C614930z A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ boolean A05;

    public C33531tH(Context context, C614930z r2, String str, String str2, int i, boolean z) {
        this.A02 = r2;
        this.A03 = str;
        this.A01 = context;
        this.A05 = z;
        this.A00 = i;
        this.A04 = str2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002d, code lost:
        if (r1 == -1) goto L_0x002f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A08(java.lang.Object[] r5) {
        /*
            r4 = this;
            X.30z r0 = r4.A02
            X.8qC r0 = r0.A0G
            java.lang.Object r0 = r0.get()
            X.30k r0 = (X.C613630k) r0
            java.lang.String r3 = r4.A03
            X.5SO r0 = r0.A02()
            java.util.List r0 = r0.A01
            java.util.Iterator r2 = r0.iterator()
        L_0x0016:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x003b
            java.lang.Object r1 = r2.next()
            boolean r0 = X.C53892nq.A00(r1, r3)
            if (r0 == 0) goto L_0x0016
        L_0x0026:
            X.2nq r1 = (X.C53892nq) r1
            r0 = -1
            if (r1 == 0) goto L_0x0039
            int r1 = r1.A01
            if (r1 != r0) goto L_0x0034
        L_0x002f:
            java.lang.String r0 = "AccountSwitchingDataRepo/getInactivePushMessageCount/Account doesn't exists"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0034:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            return r0
        L_0x0039:
            r1 = -1
            goto L_0x002f
        L_0x003b:
            r1 = 0
            goto L_0x0026
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C33531tH.A08(java.lang.Object[]):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        int A0K = AnonymousClass001.A0K(obj);
        C614930z r5 = this.A02;
        Log.i("AccountSwitcher/clearExistingNotifications");
        r5.A09.A05(57, "clearNotificationsBeforeAccountSwitching");
        Context context = this.A01;
        String str = this.A03;
        boolean z = this.A05;
        int i = this.A00;
        String str2 = this.A04;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        String A022 = r5.A0B.A02();
        Intent A07 = C18320x8.A07();
        A07.setClassName(context.getPackageName(), "com.whatsapp.accountswitching.secondaryprocess.AccountSwitchingActivity");
        A07.putExtra("request_type", 2);
        A07.putExtra("switch_to_account_lid", str);
        A07.putExtra("is_missed_call_notification", z);
        A07.putExtra("source", i);
        A07.putExtra("inactive_account_num_pending_message_notifs", A0K);
        A07.putExtra("switching_start_time_ms", elapsedRealtime);
        if (!TextUtils.isEmpty(str2)) {
            A07.putExtra("account_switching_sender_jid", str2);
        }
        if (!TextUtils.isEmpty(A022)) {
            A07.putExtra("account_language", A022);
        }
        A07.addFlags(268468224);
        r5.A09(context, A07);
    }
}
