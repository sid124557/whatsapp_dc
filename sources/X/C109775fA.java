package X;

import android.view.View;
import android.widget.SeekBar;
import com.google.android.exoplayer2.Timeline;
import com.whatsapp.videoplayback.ExoPlaybackControlView;
import java.util.List;

/* renamed from: X.5fA  reason: invalid class name and case insensitive filesystem */
public final class C109775fA implements View.OnClickListener, C186488vR, SeekBar.OnSeekBarChangeListener {
    public boolean A00;
    public final /* synthetic */ ExoPlaybackControlView A01;

    public C109775fA(ExoPlaybackControlView exoPlaybackControlView) {
        this.A01 = exoPlaybackControlView;
    }

    public /* synthetic */ void BW7(C151877Wq r1, int i) {
    }

    public /* synthetic */ void BYA(boolean z, int i) {
    }

    public void BYM(boolean z, int i) {
        ExoPlaybackControlView exoPlaybackControlView = this.A01;
        exoPlaybackControlView.A0A();
        exoPlaybackControlView.A0B();
    }

    public void BYS(int i) {
        ExoPlaybackControlView exoPlaybackControlView = this.A01;
        exoPlaybackControlView.A09();
        exoPlaybackControlView.A0B();
    }

    public /* synthetic */ void Bb4() {
    }

    public void Be6(Timeline timeline, Object obj, int i) {
        ExoPlaybackControlView exoPlaybackControlView = this.A01;
        exoPlaybackControlView.A09();
        exoPlaybackControlView.A0B();
    }

    public void BeS(C166387yb r1, C151537Ve r2) {
    }

    public void onClick(View view) {
        ExoPlaybackControlView exoPlaybackControlView = this.A01;
        C183368pv r0 = exoPlaybackControlView.A04;
        if (r0 != null) {
            r0.BP1();
        }
        AnonymousClass561.A01(exoPlaybackControlView, view);
        exoPlaybackControlView.A0E(300);
    }

    public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        if (z) {
            ExoPlaybackControlView exoPlaybackControlView = this.A01;
            exoPlaybackControlView.A0L.setText(AnonymousClass5VT.A01(exoPlaybackControlView.A0O, exoPlaybackControlView.A0P, exoPlaybackControlView.A03(i)));
        }
    }

    public void onStartTrackingTouch(SeekBar seekBar) {
        ExoPlaybackControlView exoPlaybackControlView = this.A01;
        exoPlaybackControlView.removeCallbacks(exoPlaybackControlView.A0M);
        C183378pw r0 = exoPlaybackControlView.A05;
        if (r0 != null) {
            r0.BcF();
        }
        C186478vP r02 = exoPlaybackControlView.A03;
        if (r02 != null && r02.BBP()) {
            exoPlaybackControlView.A03.Bmw(false);
            this.A00 = true;
        }
        exoPlaybackControlView.A0A = true;
    }

    public void onStopTrackingTouch(SeekBar seekBar) {
        ExoPlaybackControlView exoPlaybackControlView = this.A01;
        exoPlaybackControlView.A0A = false;
        C186478vP r2 = exoPlaybackControlView.A03;
        if (r2 != null) {
            r2.Bl2(exoPlaybackControlView.A03(seekBar.getProgress()));
        }
        C186478vP r1 = exoPlaybackControlView.A03;
        if (r1 != null && this.A00) {
            r1.Bmw(true);
        }
        this.A00 = false;
        exoPlaybackControlView.A0E(3000);
    }

    public /* synthetic */ void BSZ(boolean z) {
    }

    public /* synthetic */ void BUm(boolean z) {
    }

    public /* synthetic */ void BUn(boolean z) {
    }

    public void BYE(C158477k2 r1) {
    }

    public /* synthetic */ void BYI(int i) {
    }

    public /* synthetic */ void BYJ(int i) {
    }

    public void BYK(C143886zd r1) {
    }

    public /* synthetic */ void BcO(List list) {
    }

    public /* synthetic */ void Be5(Timeline timeline, int i) {
        AnonymousClass727.A00(this, timeline, i);
    }
}
