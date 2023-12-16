package X;

import com.whatsapp.util.Log;
import org.json.JSONException;

/* renamed from: X.5MT  reason: invalid class name */
public final /* synthetic */ class AnonymousClass5MT {
    public final /* synthetic */ C93314oJ A00;

    public final void A00(C46532bn r6, int i) {
        C93314oJ r4 = this.A00;
        AnonymousClass67A A0b = C86634Kw.A0b(r4);
        if (A0b == null) {
            Log.e("ConversationRow/dynamicReplyOnClickCallback/error: not click in Conversation");
        } else {
            AnonymousClass398 r3 = r6.A02;
            if (r3 != null) {
                try {
                    ((AnonymousClass30C) r4.A2D.get()).A02(A0b.getActivity(), r4.getFMessage(), r3, i);
                } catch (JSONException unused) {
                    Log.e("[PAY] : ConversationRow exception processing NFM message");
                }
            } else {
                A0b.BlH(r4.getFMessage(), r6);
            }
        }
        r4.A1H();
    }

    public /* synthetic */ AnonymousClass5MT(C93314oJ r1) {
        this.A00 = r1;
    }
}
