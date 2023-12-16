package X;

import android.view.View;
import com.whatsapp.conversation.ConversationAttachmentContentView;

/* renamed from: X.7zR  reason: invalid class name and case insensitive filesystem */
public class C166897zR implements View.OnLongClickListener {
    public final /* synthetic */ ConversationAttachmentContentView A00;
    public final /* synthetic */ String A01;

    public C166897zR(ConversationAttachmentContentView conversationAttachmentContentView, String str) {
        this.A00 = conversationAttachmentContentView;
        this.A01 = str;
    }

    public boolean onLongClick(View view) {
        this.A00.A0G.A0E(this.A01, true);
        return true;
    }
}
