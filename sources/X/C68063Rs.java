package X;

import com.whatsapp.HomeActivity;
import com.whatsapp.util.Log;

/* renamed from: X.3Rs  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C68063Rs implements AnonymousClass8s5 {
    public final /* synthetic */ HomeActivity A00;

    public final boolean BMG() {
        String str;
        HomeActivity homeActivity = this.A00;
        Log.d("[Perf][Render] Completed rendering the conversation list and received the callback on HomeActivity");
        C56592sF r5 = homeActivity.A02;
        int i = homeActivity.A06;
        if (i == 300) {
            str = "status";
        } else if (i == 400) {
            str = "calls";
        } else if (i == 600) {
            str = "community";
        } else if (i != 700) {
            str = "chat";
        } else {
            str = "biz_tools";
        }
        if (r5.A03 != null && r5.A0I.A0Y(C58422vE.A02, 1807)) {
            r5.A03.A0C("tabs", true, str);
        }
        homeActivity.A02.A00();
        return false;
    }

    public /* synthetic */ C68063Rs(HomeActivity homeActivity) {
        this.A00 = homeActivity;
    }

    public /* synthetic */ void BNZ() {
    }
}
