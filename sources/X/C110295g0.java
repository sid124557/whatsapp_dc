package X;

import android.widget.SeekBar;
import com.whatsapp.search.views.itemviews.AudioPlayerView;

/* renamed from: X.5g0  reason: invalid class name and case insensitive filesystem */
public class C110295g0 implements SeekBar.OnSeekBarChangeListener {
    public C167197zv A00;
    public boolean A01;
    public final C113895mA A02;
    public final AudioPlayerView A03;
    public final C183058pQ A04;
    public final C183538qC A05;

    public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        if (z) {
            C167197zv r0 = this.A00;
            r0.onProgressChanged(seekBar, i, z);
            r0.A00(i / 1000);
            AudioPlayerView audioPlayerView = this.A03;
            audioPlayerView.setSeekbarContentDescription((long) audioPlayerView.A07.getProgress());
        }
        AudioPlayerView audioPlayerView2 = this.A03;
        if (audioPlayerView2.A03.isEnabled()) {
            audioPlayerView2.A03.setPlaybackPercentage((((float) i) * 1.0f) / ((float) audioPlayerView2.A00));
        }
        C30721mu B7Y = this.A04.B7Y();
        int progress = audioPlayerView2.A07.getProgress();
        AnonymousClass0x2.A1I(B7Y.A1J, C116095pj.A13, progress);
    }

    public void onStartTrackingTouch(SeekBar seekBar) {
        C30721mu B7Y = this.A04.B7Y();
        this.A01 = false;
        C113895mA r2 = this.A02;
        C116095pj A002 = r2.A00();
        if (r2.A0D(B7Y) && r2.A0B() && A002 != null) {
            A002.A0D(true);
            this.A01 = true;
        }
    }

    public void onStopTrackingTouch(SeekBar seekBar) {
        C30721mu B7Y = this.A04.B7Y();
        C167197zv r2 = this.A00;
        r2.onStopTrackingTouch(seekBar);
        C113895mA r1 = this.A02;
        if (!r1.A0D(B7Y) || r1.A0B() || !this.A01) {
            r2.A00(B7Y.A0B);
            int progress = this.A03.A07.getProgress();
            ((C185738uA) this.A05.get()).Bn9(B7Y.A1L, progress);
            AnonymousClass0x2.A1I(B7Y.A1J, C116095pj.A13, progress);
            return;
        }
        int i = 0;
        this.A01 = false;
        C116095pj A002 = r1.A00();
        if (A002 != null) {
            A002.A08(this.A03.A07.getProgress());
            if (B7Y.A25()) {
                i = C116095pj.A12;
            }
            A002.A09(i, true, false);
        }
    }

    public C110295g0(C113895mA r1, AudioPlayerView audioPlayerView, C183058pQ r3, C167197zv r4, C183538qC r5) {
        this.A03 = audioPlayerView;
        this.A04 = r3;
        this.A02 = r1;
        this.A05 = r5;
        this.A00 = r4;
    }
}
