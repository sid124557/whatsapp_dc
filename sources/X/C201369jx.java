package X;

import com.whatsapp.util.Log;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.9jx  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C201369jx implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ C55502qS A01;
    public final /* synthetic */ C195909Zz A02;
    public final /* synthetic */ AnonymousClass2z0 A03;
    public final /* synthetic */ String A04;

    public final void run() {
        String str;
        C195909Zz r2 = this.A02;
        C55502qS r0 = this.A01;
        AnonymousClass2z0 r1 = this.A03;
        long j = this.A00;
        String str2 = this.A04;
        if (r0.A02()) {
            str = "ent";
        } else {
            str = "smb";
        }
        AnonymousClass9Th r02 = r2.A0C;
        C95814uZ r7 = r1.A00;
        int A002 = r02.A06.A00(r7.user, r1.A01, str2, j);
        AnonymousClass2YY r12 = r02.A04;
        AnonymousClass7WN r5 = r12.A01;
        C161307pP A003 = r5.A00();
        try {
            JSONArray A0f = C1899693i.A0f(A003);
            JSONObject A004 = r12.A00(r7.user, A0f);
            A004.put("business_owner_jid", r7.user);
            A004.put("biz_platform", str);
            A004.put("vpa_messages_viewed_count", A002);
            A0f.put(A004);
            C1899693i.A0s(r5, A003, A0f);
        } catch (JSONException unused) {
            Log.e("PaymentDailyUsageSync/onQrCodeReceived Error building json payload.");
            C1899693i.A0s(r5, A003, new JSONArray());
        }
    }

    public /* synthetic */ C201369jx(C55502qS r1, C195909Zz r2, AnonymousClass2z0 r3, String str, long j) {
        this.A02 = r2;
        this.A01 = r1;
        this.A03 = r3;
        this.A00 = j;
        this.A04 = str;
    }
}
