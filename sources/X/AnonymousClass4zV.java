package X;

import android.content.Context;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.conversation.conversationrow.ConversationRowAudioPreview;
import com.whatsapp.search.views.itemviews.AudioPlayerView;

/* renamed from: X.4zV  reason: invalid class name */
public class AnonymousClass4zV extends C98044zj {
    public ConversationRowAudioPreview A00 = ((ConversationRowAudioPreview) C06560Yg.A02(this, R.id.search_row_audio_preview));
    public AnonymousClass5RC A01;
    public C620733j A02;
    public AudioPlayerView A03 = ((AudioPlayerView) C06560Yg.A02(this, R.id.search_row_audio_controls));
    public C183538qC A04;
    public boolean A05;

    public final void A04() {
        C30721mu r9 = this.A09;
        AnonymousClass6AA r3 = new AnonymousClass6AA(this, 1);
        C124306Bt r4 = new C124306Bt(this, 1);
        AudioPlayerView audioPlayerView = this.A03;
        AnonymousClass684 r1 = new AnonymousClass684(this.A00, r3, r4, audioPlayerView, this, r4, 1);
        C106515Zh r10 = new C106515Zh(this, 0);
        AnonymousClass684 r6 = r1;
        C107135al.A01(r6, this.A03, this.A02, r9, r10, audioPlayerView);
    }

    public AnonymousClass4zV(Context context) {
        super(context);
        A02();
        C86634Kw.A1H(this, 0);
        View.inflate(context, R.layout.f8nameremoved, this);
        AnonymousClass5Yj.A09(context, this);
        AnonymousClass68F r4 = new AnonymousClass68F(this, 1);
        AnonymousClass90O r3 = new AnonymousClass90O(this, 1);
        AudioPlayerView audioPlayerView = this.A03;
        audioPlayerView.setPlaybackListener(new C110295g0(this.A03, audioPlayerView, r3, r4, this.A04));
    }
}
