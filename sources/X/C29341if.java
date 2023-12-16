package X;

import com.whatsapp.conversation.ConversationListView;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.1if  reason: invalid class name and case insensitive filesystem */
public class C29341if extends C29451iq {
    public void A08() {
        Iterator A03 = C61102zi.A03(this);
        while (A03.hasNext()) {
            ConversationListView conversationListView = ((C58222uu) A03.next()).A00.A2f;
            conversationListView.post(new C117085rM(conversationListView, 7));
        }
    }

    public void A09() {
        Iterator A03 = C61102zi.A03(this);
        while (A03.hasNext()) {
            A03.next();
        }
    }

    public void A0A(Set set) {
        if (!set.isEmpty()) {
            Iterator A03 = C61102zi.A03(this);
            while (A03.hasNext()) {
                ConversationListView conversationListView = ((C58222uu) A03.next()).A00.A2f;
                conversationListView.post(new C117085rM(conversationListView, 7));
            }
        }
    }
}
