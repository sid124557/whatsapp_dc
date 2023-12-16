package com.whatsapp.status.playback.widget;

import X.AnonymousClass001;
import X.AnonymousClass0YI;
import X.AnonymousClass3ZH;
import X.AnonymousClass4GJ;
import X.AnonymousClass4L0;
import X.AnonymousClass5UX;
import X.AnonymousClass6B0;
import X.AnonymousClass75C;
import X.C06560Yg;
import X.C100295Aj;
import X.C105365Uq;
import X.C107565bW;
import X.C112755kF;
import X.C112775kH;
import X.C115895pP;
import X.C116855qy;
import X.C179678jX;
import X.C179688jY;
import X.C18300x5;
import X.C183088pT;
import X.C183538qC;
import X.C30721mu;
import X.C56072rN;
import X.C56972sr;
import X.C59862xc;
import X.C620733j;
import X.C64333Db;
import X.C64773Ex;
import X.C72343dZ;
import X.C86614Ku;
import X.C86644Kx;
import X.C88864av;
import X.C95814uZ;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.whatsapp.R;
import com.whatsapp.WaImageView;
import com.whatsapp.conversation.waveforms.VoiceVisualizer;
import com.whatsapp.status.playback.content.BlurFrameLayout;
import java.util.List;

public class VoiceStatusContentView extends ConstraintLayout implements C183088pT, AnonymousClass4GJ {
    public ValueAnimator.AnimatorUpdateListener A00;
    public ValueAnimator A01;
    public TextView A02;
    public VoiceVisualizer A03;
    public C112755kF A04;
    public C179678jX A05;
    public VoiceStatusProfileAvatarView A06;
    public C179688jY A07;
    public C183538qC A08;
    public C183538qC A09;
    public C183538qC A0A;
    public C183538qC A0B;
    public C183538qC A0C;
    public C183538qC A0D;
    public C116855qy A0E;
    public List A0F;
    public boolean A0G;
    public final ViewTreeObserver.OnGlobalLayoutListener A0H;
    public final List A0I;
    public final List A0J;

    /* access modifiers changed from: private */
    public int getPreviewWavesSegmentsCount() {
        return (int) Math.floor((double) (AnonymousClass4L0.A00(this.A03) / this.A03.A0D));
    }

    public void A05() {
        if (!this.A0G) {
            this.A0G = true;
            C64333Db A002 = C88864av.A00(generatedComponent());
            this.A0B = C72343dZ.A00(A002.AJW);
            this.A09 = C72343dZ.A00(A002.A6O);
            this.A0D = C72343dZ.A00(A002.AbU);
            this.A0A = C72343dZ.A00(A002.AGN);
            this.A08 = C72343dZ.A00(A002.A6K);
            this.A0C = C72343dZ.A00(A002.APF);
        }
    }

    public final void A06() {
        BlurFrameLayout blurFrameLayout;
        C179678jX r0 = this.A05;
        if (r0 != null && (blurFrameLayout = ((C115895pP) r0).A00.A01) != null) {
            blurFrameLayout.A09 = true;
            blurFrameLayout.invalidate();
        }
    }

    public final Object generatedComponent() {
        C116855qy r0 = this.A0E;
        if (r0 == null) {
            r0 = C116855qy.A00(this);
            this.A0E = r0;
        }
        return r0.generatedComponent();
    }

    public void setDuration(int i) {
        this.A02.setText(C107565bW.A0A((C620733j) this.A0D.get(), (long) i));
    }

    public void setVoiceVisualizerSegments(List list) {
        ValueAnimator valueAnimator = this.A01;
        if (valueAnimator != null) {
            valueAnimator.end();
            this.A01.removeUpdateListener(this.A00);
            this.A01 = null;
        }
        List list2 = this.A0J;
        list2.clear();
        List list3 = this.A0I;
        list2.addAll(list3);
        if (list != null) {
            list3.clear();
            for (int i = 0; i < list.size(); i++) {
                list3.add(Float.valueOf(AnonymousClass001.A05(list.get(i)) * ((float) ((Math.random() * 0.19999998807907104d) + 0.800000011920929d))));
            }
        }
        float[] A0T = AnonymousClass4L0.A0T();
        // fill-array-data instruction
        A0T[0] = 0;
        A0T[1] = 1065353216;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(A0T);
        this.A01 = ofFloat;
        ofFloat.setStartDelay(0);
        this.A01.setDuration(150);
        C86644Kx.A0i(this.A01);
        this.A01.addUpdateListener(this.A00);
        this.A01.start();
        A06();
    }

    public VoiceStatusContentView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A05();
        this.A0J = AnonymousClass001.A0s();
        this.A0I = AnonymousClass001.A0s();
        this.A0H = C100295Aj.A00(this);
        A07(context);
    }

    private void setBackgroundColorFromMessage(C30721mu r4) {
        int A032 = AnonymousClass0YI.A03(0.2f, AnonymousClass75C.A00(getContext(), r4), -16777216);
        C06560Yg.A0C(ColorStateList.valueOf(A032), this);
        this.A06.setMicrophoneStrokeColor(A032);
    }

    public final void A07(Context context) {
        View.inflate(context, R.layout.f8nameremoved, this);
        this.A06 = (VoiceStatusProfileAvatarView) C06560Yg.A02(this, R.id.voice_status_profile_avatar);
        this.A02 = C18300x5.A0G(this, R.id.voice_duration);
        this.A03 = (VoiceVisualizer) C06560Yg.A02(this, R.id.voice_status_visualizer);
        setBackgroundResource(R.drawable.voice_status_content_view_background);
        C86614Ku.A15(getResources(), this, R.dimen.f6nameremoved);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewTreeObserver viewTreeObserver = this.A03.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.addOnGlobalLayoutListener(this.A0H);
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C112755kF r0 = this.A04;
        if (r0 != null) {
            r0.A01.clear();
        }
        ViewTreeObserver viewTreeObserver = this.A03.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnGlobalLayoutListener(this.A0H);
        }
        ValueAnimator valueAnimator = this.A01;
        if (valueAnimator != null) {
            valueAnimator.end();
            this.A01.removeUpdateListener(this.A00);
            this.A01 = null;
        }
    }

    public void setContentUpdatedListener(C179678jX r1) {
        this.A05 = r1;
    }

    public void setUiCallback(C179688jY r1) {
        this.A07 = r1;
    }

    public void setVoiceMessage(C30721mu r9, C105365Uq r10) {
        AnonymousClass3ZH A0A2;
        setBackgroundColorFromMessage(r9);
        WaImageView waImageView = this.A06.A01;
        C59862xc r6 = (C59862xc) this.A0C.get();
        waImageView.setImageDrawable(C59862xc.A00(C86614Ku.A0C(this), getResources(), new AnonymousClass6B0(1), r6.A00, R.drawable.avatar_contact));
        C112775kH r2 = new C112775kH((AnonymousClass5UX) this.A08.get(), (AnonymousClass3ZH) null, r6, (C56072rN) this.A0A.get());
        this.A04 = new C112755kF(r2, this);
        if (r9.A1J.A02) {
            A0A2 = C56972sr.A01((C56972sr) this.A0B.get());
            if (A0A2 != null) {
                C112755kF r0 = this.A04;
                if (r0 != null) {
                    r0.A01.clear();
                }
            }
            setDuration(r9.A0B);
            A06();
        }
        C95814uZ A0n = r9.A0n();
        if (A0n != null) {
            A0A2 = ((C64773Ex) this.A09.get()).A0A(A0n);
        }
        setDuration(r9.A0B);
        A06();
        r10.A05(waImageView, r2, A0A2, true);
        setDuration(r9.A0B);
        A06();
    }

    public VoiceStatusContentView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A05();
        this.A0J = AnonymousClass001.A0s();
        this.A0I = AnonymousClass001.A0s();
        this.A0H = C100295Aj.A00(this);
        A07(context);
    }

    public VoiceStatusContentView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        A05();
        this.A0J = AnonymousClass001.A0s();
        this.A0I = AnonymousClass001.A0s();
        this.A0H = C100295Aj.A00(this);
        A07(context);
    }

    public VoiceStatusContentView(Context context) {
        super(context);
        A05();
        this.A0J = AnonymousClass001.A0s();
        this.A0I = AnonymousClass001.A0s();
        this.A0H = C100295Aj.A00(this);
        A07(context);
    }

    public VoiceStatusContentView(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        super(context, attributeSet);
        A05();
    }
}
