package X;

import android.view.View;
import com.whatsapp.bridge.wfs.ui.LinkedUsersActivity;

/* renamed from: X.39o  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C635239o implements View.OnClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass0PJ A01;
    public final /* synthetic */ LinkedUsersActivity A02;
    public final /* synthetic */ Integer A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;

    public final void onClick(View view) {
        LinkedUsersActivity linkedUsersActivity = this.A02;
        String str = this.A04;
        String str2 = this.A05;
        String str3 = this.A06;
        AnonymousClass0PJ r2 = this.A01;
        Integer num = this.A03;
        int i = this.A00;
        String str4 = this.A07;
        C43842Tr r4 = linkedUsersActivity.A02;
        if (r4 != null) {
            int A062 = C18310x6.A06(num);
            if (str4 == null) {
                str4 = "";
            }
            r4.A0A.BkP(new C71023bR(r2, linkedUsersActivity, r4, str4, str3, str2, str, A062, i));
            return;
        }
        throw C18270x1.A0S("wfsManager");
    }

    public /* synthetic */ C635239o(AnonymousClass0PJ r1, LinkedUsersActivity linkedUsersActivity, Integer num, String str, String str2, String str3, String str4, int i) {
        this.A02 = linkedUsersActivity;
        this.A04 = str;
        this.A05 = str2;
        this.A06 = str3;
        this.A01 = r1;
        this.A03 = num;
        this.A00 = i;
        this.A07 = str4;
    }
}
