package X;

import com.whatsapp.conversation.conversationrow.ConversationRowAudioPreview;
import com.whatsapp.search.views.itemviews.AudioPlayerView;

/* renamed from: X.5ku  reason: invalid class name and case insensitive filesystem */
public abstract class C113115ku implements C1229466l {
    public int A00 = -1;
    public final ConversationRowAudioPreview A01;
    public final C182298oB A02;
    public final C182308oC A03;
    public final AudioPlayerView A04;

    public abstract void BRl(boolean z);

    public void BXi(int i) {
        AudioPlayerView audioPlayerView = this.A04;
        audioPlayerView.setPlayButtonState(0);
        audioPlayerView.setSeekbarMax(B7W().A0B * 1000);
        audioPlayerView.setSeekbarProgress(i);
        audioPlayerView.setSeekbarContentDescription((long) i);
        this.A02.BRk(B7W().A0B);
        ConversationRowAudioPreview conversationRowAudioPreview = this.A01;
        if (conversationRowAudioPreview != null) {
            conversationRowAudioPreview.A00();
        }
    }

    public void BYz(int i) {
        int i2 = i / 1000;
        if (this.A00 != i2) {
            this.A00 = i2;
            this.A02.BRk(i2);
        }
        AudioPlayerView audioPlayerView = this.A04;
        audioPlayerView.setSeekbarProgress(i);
        audioPlayerView.setSeekbarContentDescription((long) i);
    }

    public void BaX() {
        this.A04.setPlayButtonState(1);
        ConversationRowAudioPreview conversationRowAudioPreview = this.A01;
        if (conversationRowAudioPreview != null) {
            C86644Kx.A15(conversationRowAudioPreview.A03, conversationRowAudioPreview);
        }
    }

    public void Bc6(int i) {
        AudioPlayerView audioPlayerView = this.A04;
        audioPlayerView.setPlayButtonState(1);
        audioPlayerView.setSeekbarMax(i);
        this.A00 = -1;
        ConversationRowAudioPreview conversationRowAudioPreview = this.A01;
        if (conversationRowAudioPreview != null) {
            C86644Kx.A15(conversationRowAudioPreview.A03, conversationRowAudioPreview);
        }
    }

    public void Bcm(int i, boolean z) {
        AudioPlayerView audioPlayerView = this.A04;
        audioPlayerView.setPlayButtonState(0);
        if (z) {
            audioPlayerView.setSeekbarProgress(0);
        }
        this.A02.BRk(i / 1000);
        ConversationRowAudioPreview conversationRowAudioPreview = this.A01;
        if (conversationRowAudioPreview != null) {
            conversationRowAudioPreview.A00();
        }
        this.A03.BbU(false);
    }

    public C113115ku(ConversationRowAudioPreview conversationRowAudioPreview, C182298oB r3, C182308oC r4, AudioPlayerView audioPlayerView) {
        this.A04 = audioPlayerView;
        this.A02 = r3;
        this.A03 = r4;
        this.A01 = conversationRowAudioPreview;
    }
}
