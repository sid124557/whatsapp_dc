package X;

import com.whatsapp.util.Log;
import java.util.List;

/* renamed from: X.3T5  reason: invalid class name */
public final class AnonymousClass3T5 implements AnonymousClass4EZ {
    public final /* synthetic */ C45462a3 A00;
    public final /* synthetic */ C35711xJ A01;
    public final /* synthetic */ C59492x0 A02;
    public final /* synthetic */ C833648c A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;

    public void BdM(AnonymousClass36K r14, String str) {
        List<AnonymousClass3YL> list;
        C162457s7.A0J(r14, 1);
        C626836d.A0E(C41032Ir.A02(r14, this.A01), r14, 13);
        C41932Md r0 = (C41932Md) C18290x4.A0k(new C47782do().A01((List) ((C34821vs) C626836d.A04(r14, C86304Jp.A00(94), new String[]{"surfaces"})).A00));
        if (r0 != null) {
            list = C18320x8.A0s("whatsapp_push_notification_event", r0.A01);
        } else {
            list = null;
        }
        C59492x0 r8 = this.A02;
        String str2 = this.A05;
        String str3 = this.A04;
        C45462a3 r5 = this.A00;
        C833648c r4 = this.A03;
        if (list == null || list.isEmpty()) {
            r5.A00((C833748d) null);
        } else {
            for (AnonymousClass3YL r9 : list) {
                if (C162457s7.A0P(r9.A0F, str2) && C162457s7.A0P(r9.A0D, str3)) {
                    r5.A00(C59492x0.A03.A00(r8.A01.A00(r4, 11231, Integer.valueOf(C18310x6.A06(r9.A0B)), C18300x5.A0x("whatsapp_push_notification_event")), C18300x5.A0s(r9)));
                }
            }
        }
        Log.i("OnDemandFetch/fetched");
    }

    public AnonymousClass3T5(C45462a3 r1, C35711xJ r2, C59492x0 r3, C833648c r4, String str, String str2) {
        this.A01 = r2;
        this.A02 = r3;
        this.A05 = str;
        this.A04 = str2;
        this.A00 = r1;
        this.A03 = r4;
    }

    public void BQs(String str) {
        Log.e("OnDemandFetch/delivery fail");
        this.A00.A00((C833748d) null);
    }

    public void BSN(AnonymousClass36K r4, String str) {
        C18260x0.A0x("OnDemandFetch/Error/", AnonymousClass001.A0o(), C57492tj.A00(r4));
        this.A00.A00((C833748d) null);
    }
}
