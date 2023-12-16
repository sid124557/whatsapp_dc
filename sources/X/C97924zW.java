package X;

import android.content.Context;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.conversation.ui.AudioPlayerMetadataView;
import com.whatsapp.search.views.itemviews.AudioPlayerView;
import com.whatsapp.search.views.itemviews.VoiceNoteProfileAvatarView;

/* renamed from: X.4zW  reason: invalid class name and case insensitive filesystem */
public class C97924zW extends C98044zj {
    public C56972sr A00;
    public C64773Ex A01;
    public C114015mM A02;
    public AnonymousClass5RC A03;
    public AudioPlayerMetadataView A04 = ((AudioPlayerMetadataView) C06560Yg.A02(this, R.id.search_row_voice_note_metadata));
    public C620733j A05;
    public C54602oz A06;
    public C182938pE A07;
    public AnonymousClass5NZ A08;
    public AudioPlayerView A09 = ((AudioPlayerView) C06560Yg.A02(this, R.id.search_row_voice_note_controls));
    public VoiceNoteProfileAvatarView A0A = ((VoiceNoteProfileAvatarView) C06560Yg.A02(this, R.id.search_row_voice_note_preview));
    public C183538qC A0B;
    public boolean A0C;
    public boolean A0D;
    public final C105365Uq A0E;

    public final void A04() {
        AnonymousClass6AA r1 = new AnonymousClass6AA(this, 3);
        C124306Bt r2 = new C124306Bt(this, 3);
        AudioPlayerView audioPlayerView = this.A09;
        AnonymousClass684 r0 = new AnonymousClass684(r1, r2, r2, this, audioPlayerView);
        C30721mu r9 = this.A09;
        AnonymousClass8JX r10 = new AnonymousClass8JX(this);
        AnonymousClass684 r6 = r0;
        C107135al.A01(r6, this.A03, this.A05, r9, r10, audioPlayerView);
    }

    public C97924zW(Context context) {
        super(context);
        A02();
        this.A0E = this.A02.A05(context, "attachment-voice-note-audio-view");
        C86634Kw.A1H(this, 0);
        View.inflate(context, R.layout.f8nameremoved, this);
        AnonymousClass5Yj.A09(context, this);
        AnonymousClass68F r4 = new AnonymousClass68F(this, 3);
        AnonymousClass90O r3 = new AnonymousClass90O(this, 3);
        AudioPlayerView audioPlayerView = this.A09;
        audioPlayerView.setPlaybackListener(new C110295g0(this.A03, audioPlayerView, r3, r4, this.A0B));
        boolean A0X = this.A05.A0X(1316);
        this.A0D = A0X;
        if (A0X) {
            this.A08 = this.A07.B04(this.A0A);
            this.A0A.setOnFastPlaybackButtonClickListener(new C109745f7((Object) this, 41));
        }
    }
}
