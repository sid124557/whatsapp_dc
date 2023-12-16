package X;

import android.view.ViewGroup;
import com.whatsapp.conversation.ConversationListView;
import com.whatsapp.jid.UserJid;
import java.util.Set;

/* renamed from: X.6AB  reason: invalid class name */
public class AnonymousClass6AB implements C1228766e {
    public Object A00;
    public final int A01;

    public AnonymousClass6AB(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void BOz() {
        if (this.A01 != 0) {
            C113245l7 r3 = (C113245l7) this.A00;
            AnonymousClass4FS A0G = C113245l7.A0G(r3);
            UserJid A03 = AnonymousClass32Y.A03(r3.A4J);
            if (A03 != null) {
                C71333bw.A00(A0G, r3, A03, 49);
            }
            AnonymousClass66v r1 = r3.A5l;
            if (r1 != null && r1.B8N()) {
                r1.Az5();
                ((ViewGroup) C113245l7.A03(r3).getDecorView()).removeView(r3.A5j);
                ConversationListView conversationListView = r3.A2f;
                C184278rX r2 = r3.A2H;
                Set set = conversationListView.A05.A00;
                synchronized (set) {
                    set.remove(r2);
                }
                r3.A5j = null;
            }
        }
    }
}
