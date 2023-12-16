package X;

import com.whatsapp.R;
import com.whatsapp.wabloks.ui.WaBloksActivity;
import java.util.List;
import java.util.Map;

/* renamed from: X.9dr  reason: invalid class name and case insensitive filesystem */
public class C197779dr implements C84634Dc {
    public final /* synthetic */ C196249aX A00;
    public final /* synthetic */ WaBloksActivity A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ List A03;

    public C197779dr(C196249aX r1, WaBloksActivity waBloksActivity, String str, List list) {
        this.A00 = r1;
        this.A03 = list;
        this.A01 = waBloksActivity;
        this.A02 = str;
    }

    public void BTD(Map map) {
        C196249aX.A06(this.A01, this.A02);
    }

    public void BTE(C108865dg r12) {
        if (!r12.A00()) {
            List list = this.A03;
            String str = r12.A00;
            String str2 = r12.A04;
            String str3 = r12.A02;
            WaBloksActivity waBloksActivity = this.A01;
            ((C621033m) this.A00.A0Y.get()).A0U((C624134x) null, str, str2, str3, waBloksActivity.getString(R.string.f11nameremoved), list, r12.A01());
            if (list.size() == 1) {
                waBloksActivity.startActivity(new C627736r().A1N(waBloksActivity, (C95814uZ) C18290x4.A0k(list)));
                return;
            }
            return;
        }
        C196249aX.A06(this.A01, this.A02);
    }
}
