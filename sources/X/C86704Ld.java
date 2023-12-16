package X;

import android.database.DataSetObserver;
import com.whatsapp.conversation.ConversationListView;

/* renamed from: X.4Ld  reason: invalid class name and case insensitive filesystem */
public class C86704Ld extends DataSetObserver {
    public final /* synthetic */ C113245l7 A00;

    public C86704Ld(C113245l7 r1) {
        this.A00 = r1;
    }

    public void onChanged() {
        Object valueOf;
        ConversationListView conversationListView = this.A00.A2f;
        if (conversationListView != null) {
            C87234On conversationCursorAdapter = conversationListView.getConversationCursorAdapter();
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("conversation/adapterobserver/changed cursor=");
            if (conversationCursorAdapter.getCursor() == null) {
                valueOf = "null";
            } else {
                valueOf = Integer.valueOf(conversationCursorAdapter.getCount());
            }
            A0o.append(valueOf);
            A0o.append(" appended=");
            C18260x0.A1F(A0o, conversationCursorAdapter.A08.size());
        }
    }
}
