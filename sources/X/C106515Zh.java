package X;

import com.whatsapp.conversation.conversationrow.ConversationRowAudioPreview;
import com.whatsapp.conversation.ui.AudioPlayerMetadataView;

/* renamed from: X.5Zh  reason: invalid class name and case insensitive filesystem */
public class C106515Zh implements C183028pN {
    public Object A00;
    public final int A01;

    public C106515Zh(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void BYH(int i, String str) {
        if (this.A01 != 0) {
            C162457s7.A0J(str, 2);
            AudioPlayerMetadataView audioPlayerMetadataView = ((AnonymousClass4zX) this.A00).A04;
            if (audioPlayerMetadataView == null) {
                throw C18270x1.A0S("audioPlayerMetadataView");
            }
            audioPlayerMetadataView.setDescription(str);
            return;
        }
        ConversationRowAudioPreview conversationRowAudioPreview = ((AnonymousClass4zV) this.A00).A00;
        conversationRowAudioPreview.setDuration(str);
        if (i != 0) {
            conversationRowAudioPreview.A00();
        } else {
            C86644Kx.A15(conversationRowAudioPreview.A03, conversationRowAudioPreview);
        }
    }
}
