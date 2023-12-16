package X;

import com.whatsapp.conversation.ConversationSearchFragment;
import java.util.Calendar;

/* renamed from: X.5zT  reason: invalid class name and case insensitive filesystem */
public final class C120975zT extends C829045j implements AnonymousClass4GP {
    public final /* synthetic */ ConversationSearchFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C120975zT(ConversationSearchFragment conversationSearchFragment) {
        super(0);
        this.this$0 = conversationSearchFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        long timeInMillis = Calendar.getInstance().getTimeInMillis();
        AnonymousClass94W r2 = new AnonymousClass94W(this.this$0.A0G());
        ConversationSearchFragment conversationSearchFragment = this.this$0;
        r2.A04().setMaxDate(timeInMillis);
        r2.A05(conversationSearchFragment.A00);
        return r2;
    }
}
