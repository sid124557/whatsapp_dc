package X;

import com.whatsapp.R;
import com.whatsapp.calling.calllink.view.CallLinkActivity;
import com.whatsapp.chatinfo.view.custom.ChatInfoLayoutV2;

/* renamed from: X.69O  reason: invalid class name */
public class AnonymousClass69O implements C1225264s {
    public Object A00;
    public final int A01;

    public AnonymousClass69O(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void Bfa(int i) {
        int A002;
        switch (this.A01) {
            case 0:
                CallLinkActivity callLinkActivity = (CallLinkActivity) this.A00;
                if (callLinkActivity.A0A.getVisibility() == 0) {
                    A002 = AnonymousClass5Yj.A02(callLinkActivity, R.attr.f3nameremoved, R.color.f5nameremoved);
                } else {
                    A002 = AnonymousClass34K.A00(callLinkActivity);
                }
                C107405bG.A07(callLinkActivity, A002);
                C107405bG.A03(callLinkActivity);
                return;
            case 1:
                ChatInfoLayoutV2 chatInfoLayoutV2 = (ChatInfoLayoutV2) ((C009707r) this.A00).findViewById(R.id.content);
                if (chatInfoLayoutV2 != null) {
                    chatInfoLayoutV2.A0F();
                    return;
                }
                return;
            default:
                C113245l7 r1 = (C113245l7) this.A00;
                if (C113245l7.A09(r1) != null) {
                    r1.A00 = i;
                    r1.A1V(i);
                    return;
                }
                return;
        }
    }
}
