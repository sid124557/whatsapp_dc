package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.whatsapp.conversation.ConversationListView;

/* renamed from: X.4MK  reason: invalid class name */
public class AnonymousClass4MK extends Handler {
    public final /* synthetic */ ConversationListView A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4MK(Looper looper, ConversationListView conversationListView) {
        super(looper);
        this.A00 = conversationListView;
    }

    public void handleMessage(Message message) {
        if (message.what == 0) {
            this.A00.A0A(true);
        }
        this.A00.setTranscriptMode(0);
    }

    public static AnonymousClass4MK A00(ConversationListView conversationListView) {
        conversationListView.A02();
        conversationListView.A0K = true;
        conversationListView.A0O = true;
        return new AnonymousClass4MK(Looper.getMainLooper(), conversationListView);
    }
}
