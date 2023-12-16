package X;

import android.content.Context;
import com.whatsapp.conversation.ConversationAttachmentContentView;

/* renamed from: X.6hE  reason: invalid class name and case insensitive filesystem */
public class C133366hE extends C124926El {
    public int A00;
    public int A01;
    public final /* synthetic */ ConversationAttachmentContentView A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C133366hE(Context context, ConversationAttachmentContentView conversationAttachmentContentView) {
        super(context);
        this.A02 = conversationAttachmentContentView;
    }

    public int getBaseHeightPx() {
        return this.A00;
    }

    public int getBaseWidthPx() {
        return this.A01;
    }

    public void onMeasure(int i, int i2) {
        setMeasuredDimension(this.A01, this.A00 + this.A02.A05);
    }

    public void setBaseHeightPx(int i) {
        this.A00 = i;
    }

    public void setBaseWidthPx(int i) {
        this.A01 = i;
    }
}
