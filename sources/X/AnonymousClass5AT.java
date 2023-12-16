package X;

import com.whatsapp.conversation.conversationrow.ConversationRowAudioPreview;
import com.whatsapp.conversation.conversationrow.WaveformVisualizerView;

/* renamed from: X.5AT  reason: invalid class name */
public class AnonymousClass5AT implements C182288oA {
    public Object A00;
    public final int A01;

    public AnonymousClass5AT(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void Bfj(byte[] bArr) {
        ConversationRowAudioPreview conversationRowAudioPreview;
        int i = this.A01;
        Object obj = this.A00;
        if (i != 0) {
            conversationRowAudioPreview = ((AnonymousClass4zV) obj).A00;
        } else {
            conversationRowAudioPreview = ((C93074nr) obj).A05;
            if (conversationRowAudioPreview == null) {
                return;
            }
        }
        WaveformVisualizerView waveformVisualizerView = conversationRowAudioPreview.A03;
        waveformVisualizerView.A02 = bArr;
        waveformVisualizerView.invalidate();
    }
}
