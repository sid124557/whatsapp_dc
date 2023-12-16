package X;

import android.view.ViewTreeObserver;
import com.whatsapp.conversation.ConversationListView;

/* renamed from: X.5fW  reason: invalid class name and case insensitive filesystem */
public class C109995fW implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C87234On A01;
    public final /* synthetic */ ConversationListView A02;
    public final /* synthetic */ C104415Qw A03;
    public final /* synthetic */ AnonymousClass5UY A04;

    public C109995fW(C87234On r1, ConversationListView conversationListView, C104415Qw r3, AnonymousClass5UY r4, int i) {
        this.A02 = conversationListView;
        this.A01 = r1;
        this.A03 = r3;
        this.A00 = i;
        this.A04 = r4;
    }

    public void onGlobalLayout() {
        ConversationListView conversationListView = this.A02;
        C86624Kv.A16(conversationListView, this);
        C87234On r2 = this.A01;
        C104415Qw r4 = this.A03;
        r2.A0b.add(r4.A09.A1J);
        conversationListView.A03();
        conversationListView.A09(this.A04, this.A00, r4.A05, r4.A01);
    }
}
