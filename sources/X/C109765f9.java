package X;

import android.view.View;
import android.widget.SeekBar;
import com.facebook.android.exoplayer2.Timeline;
import com.whatsapp.videoplayback.HeroPlaybackControlView;

/* renamed from: X.5f9  reason: invalid class name and case insensitive filesystem */
public final class C109765f9 implements View.OnClickListener, C186008ub, SeekBar.OnSeekBarChangeListener {
    public boolean A00;
    public final /* synthetic */ HeroPlaybackControlView A01;

    public C109765f9(HeroPlaybackControlView heroPlaybackControlView) {
        this.A01 = heroPlaybackControlView;
    }

    public void BYB() {
    }

    public void BYL(C143946zk r1, C142846xt r2) {
    }

    public void BYN(int i, boolean z, boolean z2) {
        C117095rN.A00(this.A01.A00, this, 37);
    }

    public void BYS(int i) {
        C117095rN.A00(this.A01.A00, this, 35);
    }

    public void Be4(Timeline timeline, Object obj, int i) {
        C117095rN.A00(this.A01.A00, this, 36);
    }

    public void BeR(C166607yy r1, AnonymousClass7VV r2) {
    }

    public void Bfi(C142846xt r1, String str) {
    }

    public void onClick(View view) {
        HeroPlaybackControlView heroPlaybackControlView = this.A01;
        C183368pv r0 = heroPlaybackControlView.A04;
        if (r0 != null) {
            r0.BP1();
        }
        AnonymousClass561.A01(heroPlaybackControlView, view);
        heroPlaybackControlView.A0E(300);
    }

    public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        if (z) {
            HeroPlaybackControlView heroPlaybackControlView = this.A01;
            heroPlaybackControlView.A0L.setText(AnonymousClass5VT.A01(heroPlaybackControlView.A0O, heroPlaybackControlView.A0P, heroPlaybackControlView.A03(i)));
        }
    }

    public void onStartTrackingTouch(SeekBar seekBar) {
        HeroPlaybackControlView heroPlaybackControlView = this.A01;
        heroPlaybackControlView.removeCallbacks(heroPlaybackControlView.A0M);
        C183378pw r0 = heroPlaybackControlView.A05;
        if (r0 != null) {
            r0.BcF();
        }
        C186478vP r02 = heroPlaybackControlView.A03;
        if (r02 != null && r02.BBP()) {
            heroPlaybackControlView.A03.Bmw(false);
            this.A00 = true;
        }
        heroPlaybackControlView.A0A = true;
    }

    public void onStopTrackingTouch(SeekBar seekBar) {
        HeroPlaybackControlView heroPlaybackControlView = this.A01;
        heroPlaybackControlView.A0A = false;
        C186478vP r2 = heroPlaybackControlView.A03;
        if (r2 != null) {
            r2.Bl2(heroPlaybackControlView.A03(seekBar.getProgress()));
        }
        C186478vP r1 = heroPlaybackControlView.A03;
        if (r1 != null && this.A00) {
            r1.Bmw(true);
        }
        this.A00 = false;
        heroPlaybackControlView.A0E(3000);
    }
}
