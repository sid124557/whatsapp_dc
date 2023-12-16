package com.whatsapp.textstatuscomposer.voice;

import X.AnonymousClass0AN;
import X.AnonymousClass0XC;
import X.AnonymousClass1RR;
import X.AnonymousClass4GJ;
import X.AnonymousClass4L0;
import X.AnonymousClass69M;
import X.AnonymousClass6B0;
import X.AnonymousClass6BG;
import X.C06560Yg;
import X.C105365Uq;
import X.C107565bW;
import X.C114015mM;
import X.C116155pp;
import X.C116165pq;
import X.C116175pr;
import X.C116855qy;
import X.C179728jc;
import X.C179748je;
import X.C18280x3;
import X.C18290x4;
import X.C18300x5;
import X.C183198pe;
import X.C183538qC;
import X.C185148tA;
import X.C187958y5;
import X.C33331sp;
import X.C56972sr;
import X.C59862xc;
import X.C620733j;
import X.C64333Db;
import X.C72343dZ;
import X.C86604Kt;
import X.C86614Ku;
import X.C86664Kz;
import X.C86874Me;
import X.C88864av;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.whatsapp.R;
import com.whatsapp.WaImageButton;
import com.whatsapp.WaImageView;
import com.whatsapp.conversation.waveforms.VoiceVisualizer;
import com.whatsapp.status.playback.widget.VoiceStatusProfileAvatarView;
import com.whatsapp.voicerecorder.VoiceNoteSeekBar;

public class VoiceRecordingView extends ConstraintLayout implements C185148tA, C183198pe, AnonymousClass4GJ {
    public View A00;
    public View A01;
    public Animation A02;
    public TextView A03;
    public C56972sr A04;
    public WaImageButton A05;
    public C105365Uq A06;
    public C114015mM A07;
    public VoiceVisualizer A08;
    public C59862xc A09;
    public VoiceStatusProfileAvatarView A0A;
    public C179728jc A0B;
    public VoiceStatusRecordingVisualizer A0C;
    public C179748je A0D;
    public C187958y5 A0E;
    public VoiceNoteSeekBar A0F;
    public C183538qC A0G;
    public C183538qC A0H;
    public C116855qy A0I;
    public boolean A0J;
    public final ViewTreeObserver.OnGlobalLayoutListener A0K;

    /* access modifiers changed from: private */
    public int getPreviewWavesSegmentsCount() {
        return (int) Math.floor((double) (AnonymousClass4L0.A00(this.A08) / this.A08.A0D));
    }

    public void A05() {
        if (!this.A0J) {
            this.A0J = true;
            C64333Db A002 = C88864av.A00(generatedComponent());
            this.A04 = C64333Db.A06(A002);
            this.A07 = C64333Db.A29(A002);
            this.A0E = C86614Ku.A0o(A002);
            this.A09 = (C59862xc) A002.APF.get();
            this.A0G = C72343dZ.A00(A002.AYG);
            this.A0H = C72343dZ.A00(A002.AbU);
        }
    }

    public void BEh() {
        this.A00.setVisibility(8);
        Animation animation = this.A02;
        if (animation != null) {
            animation.cancel();
            this.A02 = null;
        }
        AnonymousClass0AN r3 = new AnonymousClass0AN(3);
        r3.A07(200);
        r3.A02 = 0;
        r3.A08(new DecelerateInterpolator());
        AnonymousClass0XC.A02(this, r3);
        this.A03.setVisibility(4);
        this.A0C.setVisibility(4);
        this.A01.setVisibility(0);
        this.A05.setVisibility(0);
        this.A08.setVisibility(0);
        this.A0F.setVisibility(0);
        setSeekbarContentDescription(0);
    }

    public void BEi() {
        this.A00.setVisibility(8);
        Animation animation = this.A02;
        if (animation != null) {
            animation.cancel();
            this.A02 = null;
        }
        this.A03.setVisibility(0);
        this.A0C.setVisibility(0);
        this.A08.setVisibility(4);
        this.A05.setVisibility(4);
        this.A01.setVisibility(4);
    }

    public final Object generatedComponent() {
        C116855qy r0 = this.A0I;
        if (r0 == null) {
            r0 = C116855qy.A00(this);
            this.A0I = r0;
        }
        return r0.generatedComponent();
    }

    public void setRemainingSeconds(int i) {
        this.A03.setText(C107565bW.A0A((C620733j) this.A0H.get(), (long) i));
    }

    public void setSeekbarContentDescription(long j) {
        this.A0F.setContentDescription(C86604Kt.A0m(getContext(), C107565bW.A0B((C620733j) this.A0H.get(), j), R.string.f11nameremoved));
    }

    public VoiceRecordingView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A05();
        this.A0K = new AnonymousClass6BG((Object) this, 37);
        A06(context);
    }

    /* access modifiers changed from: private */
    public void setupPreviewProgressIndicatorSizes(boolean z) {
        int dimensionPixelSize;
        int i;
        Resources A0G2 = C18290x4.A0G(this);
        if (z) {
            dimensionPixelSize = A0G2.getDimensionPixelSize(R.dimen.f6nameremoved);
            i = R.dimen.f6nameremoved;
        } else {
            dimensionPixelSize = A0G2.getDimensionPixelSize(R.dimen.f6nameremoved);
            i = R.dimen.f6nameremoved;
        }
        int dimensionPixelSize2 = A0G2.getDimensionPixelSize(i);
        this.A08.setProgressBubbleRadius((float) dimensionPixelSize);
        this.A08.setProgressBubbleStokeWidth((float) dimensionPixelSize2);
    }

    public final void A06(Context context) {
        View.inflate(context, R.layout.f8nameremoved, this);
        this.A0A = (VoiceStatusProfileAvatarView) C06560Yg.A02(this, R.id.voice_status_profile_avatar);
        this.A03 = C18300x5.A0G(this, R.id.voice_status_remaining_seconds_view);
        this.A0C = (VoiceStatusRecordingVisualizer) C06560Yg.A02(this, R.id.voice_status_recording_visualizer);
        this.A00 = C06560Yg.A02(this, R.id.voice_status_flashing_recording_view);
        this.A08 = (VoiceVisualizer) C06560Yg.A02(this, R.id.voice_status_preview_visualizer);
        this.A05 = C86664Kz.A10(this, R.id.voice_status_preview_playback);
        this.A01 = C06560Yg.A02(this, R.id.voice_status_preview_delete);
        VoiceNoteSeekBar voiceNoteSeekBar = (VoiceNoteSeekBar) C06560Yg.A02(this, R.id.voice_status_preview_seek_bar);
        this.A0F = voiceNoteSeekBar;
        voiceNoteSeekBar.A09 = true;
        voiceNoteSeekBar.setMax(1000);
        setBackgroundResource(R.drawable.voice_status_content_view_background);
        C86614Ku.A15(getResources(), this, R.dimen.f6nameremoved);
        this.A06 = this.A07.A06(context, "voice-recording-view");
        WaImageView waImageView = this.A0A.A01;
        C59862xc r0 = this.A09;
        waImageView.setImageDrawable(C59862xc.A00(C86614Ku.A0C(this), getResources(), new AnonymousClass6B0(1), r0.A00, R.drawable.avatar_contact));
        AnonymousClass1RR A012 = C56972sr.A01(this.A04);
        if (A012 != null) {
            this.A06.A0A(waImageView, A012, true);
        }
        this.A0C.setListener(new C116165pq(this));
        C18280x3.A0o(this.A05, this, 37);
        C18280x3.A0o(this.A01, this, 38);
        setupPreviewProgressIndicatorSizes(false);
        this.A0F.setOnSeekBarChangeListener(new AnonymousClass69M(this, 1));
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewTreeObserver viewTreeObserver = this.A08.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.addOnGlobalLayoutListener(this.A0K);
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.A06.A00();
        C179728jc r3 = this.A0B;
        if (r3 != null) {
            C116155pp r32 = (C116155pp) r3;
            C86874Me r0 = r32.A07;
            if (r0 != null) {
                r0.A0D.clear();
            }
            r32.A05(false);
            C33331sp r02 = r32.A05;
            if (r02 != null) {
                r02.A00.clear();
                r32.A05.A0D(true);
                r32.A05 = null;
            }
            C33331sp r03 = r32.A04;
            if (r03 != null) {
                r03.A00.clear();
                r32.A04.A0D(true);
                r32.A04 = null;
            }
            C116175pr r04 = r32.A08;
            if (r04 != null) {
                r04.A00 = null;
            }
            r32.A04(r32.A0A);
            r32.A0A = null;
        }
        C179748je r2 = this.A0D;
        if (r2 != null) {
            C116175pr r22 = (C116175pr) r2;
            r22.A08.A0F(r22.A09);
            r22.A05.A0F(r22.A0A);
            r22.A04.removeCallbacks(r22.A03);
            r22.A01();
        }
        ViewTreeObserver viewTreeObserver = this.A08.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnGlobalLayoutListener(this.A0K);
        }
    }

    public void setBackgroundTint(int i) {
        C06560Yg.A0C(ColorStateList.valueOf(i), this);
        this.A0A.setMicrophoneStrokeColor(i);
    }

    public void setUICallback(C179728jc r1) {
        this.A0B = r1;
    }

    public void setUICallbacks(C179748je r1) {
        this.A0D = r1;
    }

    public VoiceRecordingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A05();
        this.A0K = new AnonymousClass6BG((Object) this, 37);
        A06(context);
    }

    public VoiceRecordingView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        A05();
        this.A0K = new AnonymousClass6BG((Object) this, 37);
        A06(context);
    }

    public VoiceRecordingView(Context context) {
        super(context);
        A05();
        this.A0K = new AnonymousClass6BG((Object) this, 37);
        A06(context);
    }

    public VoiceRecordingView(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        super(context, attributeSet);
        A05();
    }
}
