package com.whatsapp.search.views.itemviews;

import X.AnonymousClass001;
import X.AnonymousClass0RP;
import X.AnonymousClass0x2;
import X.AnonymousClass1VX;
import X.AnonymousClass4GJ;
import X.AnonymousClass5UY;
import X.AnonymousClass6B6;
import X.C06560Yg;
import X.C100895Cr;
import X.C107555bV;
import X.C107565bW;
import X.C110295g0;
import X.C116855qy;
import X.C131666dx;
import X.C18300x5;
import X.C620733j;
import X.C64333Db;
import X.C86604Kt;
import X.C86664Kz;
import X.C88864av;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import com.whatsapp.R;
import com.whatsapp.conversation.waveforms.VoiceVisualizer;
import com.whatsapp.voicerecorder.VoiceNoteSeekBar;
import java.util.List;

public class AudioPlayerView extends LinearLayout implements AnonymousClass4GJ {
    public int A00;
    public int A01;
    public ImageButton A02;
    public VoiceVisualizer A03;
    public C620733j A04;
    public AnonymousClass1VX A05;
    public AnonymousClass5UY A06;
    public VoiceNoteSeekBar A07;
    public C116855qy A08;
    public boolean A09;

    public void A00() {
        this.A03.setVisibility(8);
        this.A03.setEnabled(false);
        this.A07.setVisibility(0);
        this.A07.setProgress(this.A01);
        VoiceNoteSeekBar voiceNoteSeekBar = this.A07;
        voiceNoteSeekBar.A09 = false;
        voiceNoteSeekBar.invalidate();
    }

    public void A01() {
        if (!this.A09) {
            this.A09 = true;
            C64333Db A002 = C88864av.A00(generatedComponent());
            this.A05 = C64333Db.A4B(A002);
            this.A04 = C64333Db.A2t(A002);
        }
    }

    public void A03(List list) {
        this.A03.setEnabled(true);
        this.A03.setVisibility(0);
        this.A03.A02(list, (((float) this.A01) * 1.0f) / ((float) this.A00));
        VoiceNoteSeekBar voiceNoteSeekBar = this.A07;
        voiceNoteSeekBar.A09 = true;
        voiceNoteSeekBar.invalidate();
    }

    public final Object generatedComponent() {
        C116855qy r0 = this.A08;
        if (r0 == null) {
            r0 = C116855qy.A00(this);
            this.A08 = r0;
        }
        return r0.generatedComponent();
    }

    public AnonymousClass5UY getProgressBar() {
        return this.A06;
    }

    public int getSeekbarProgress() {
        return this.A07.getProgress();
    }

    public void setOnControlButtonClickListener(View.OnClickListener onClickListener) {
        this.A02.setOnClickListener(onClickListener);
    }

    public void setOnControlButtonLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.A02.setOnLongClickListener(onLongClickListener);
    }

    public void setPlayButtonState(int i) {
        ImageButton imageButton;
        Context context;
        int i2;
        if (i == 0) {
            Drawable A002 = AnonymousClass0RP.A00(getContext(), R.drawable.inline_audio_play);
            ImageButton imageButton2 = this.A02;
            if (!this.A05.A0X(1117)) {
                A002 = new C131666dx(A002, this.A04);
            }
            imageButton2.setImageDrawable(A002);
            imageButton = this.A02;
            context = getContext();
            i2 = R.string.f11nameremoved;
        } else if (i == 1) {
            this.A02.setImageResource(R.drawable.inline_audio_pause);
            imageButton = this.A02;
            context = getContext();
            i2 = R.string.f11nameremoved;
        } else if (i == 2) {
            this.A02.setImageResource(R.drawable.inline_audio_upload);
            imageButton = this.A02;
            context = getContext();
            i2 = R.string.f11nameremoved;
        } else if (i == 3) {
            this.A02.setImageResource(R.drawable.inline_audio_download);
            imageButton = this.A02;
            context = getContext();
            i2 = R.string.f11nameremoved;
        } else if (i == 4) {
            this.A02.setImageResource(R.drawable.inline_audio_cancel);
            imageButton = this.A02;
            context = getContext();
            i2 = R.string.f11nameremoved;
        } else {
            throw C86604Kt.A0h("setPlayButtonState: Did not handle playstate: ", AnonymousClass001.A0o(), i);
        }
        C18300x5.A13(context, imageButton, i2);
    }

    public void setPlaybackListener(C110295g0 r2) {
        this.A07.setOnSeekBarChangeListener(r2);
    }

    public void setSeekbarColor(int i) {
        this.A07.setProgressColor(i);
    }

    public void setSeekbarContentDescription(long j) {
        this.A07.setContentDescription(C86604Kt.A0m(getContext(), C107565bW.A0B(this.A04, j), R.string.f11nameremoved));
    }

    public void setSeekbarLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.A07.setOnLongClickListener(onLongClickListener);
    }

    public void setSeekbarMax(int i) {
        this.A07.setMax(i);
        this.A00 = i;
    }

    public void setSeekbarProgress(int i) {
        this.A01 = i;
        this.A07.setProgress(i);
    }

    public AudioPlayerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        A01();
    }

    public final void A02(Context context, AttributeSet attributeSet) {
        Context context2 = context;
        View.inflate(context2, R.layout.f8nameremoved, this);
        setOrientation(0);
        setGravity(17);
        setClipChildren(false);
        setClipToPadding(false);
        this.A02 = C86664Kz.A0t(this, R.id.control_btn);
        this.A07 = (VoiceNoteSeekBar) C06560Yg.A02(this, R.id.audio_seekbar);
        this.A03 = (VoiceVisualizer) C06560Yg.A02(this, R.id.audio_visualizer);
        AnonymousClass5UY A0M = AnonymousClass0x2.A0M(this, R.id.progress_bar);
        this.A06 = A0M;
        A0M.A09(new AnonymousClass6B6(context2, 2, this));
        AttributeSet attributeSet2 = attributeSet;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet2, C100895Cr.A01);
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(5, 0);
            int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(6, 0);
            int dimensionPixelSize3 = obtainStyledAttributes.getDimensionPixelSize(3, 0);
            int dimensionPixelSize4 = obtainStyledAttributes.getDimensionPixelSize(4, 0);
            int dimensionPixelSize5 = obtainStyledAttributes.getDimensionPixelSize(1, 0);
            int dimensionPixelSize6 = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            int dimensionPixelSize7 = obtainStyledAttributes.getDimensionPixelSize(2, 0);
            obtainStyledAttributes.recycle();
            View A022 = C06560Yg.A02(this, R.id.controls);
            C107555bV.A07(A022, this.A04, A022.getPaddingLeft(), A022.getPaddingTop(), dimensionPixelSize3, A022.getPaddingBottom());
            View A023 = C06560Yg.A02(this, R.id.audio_seekbar);
            A023.setPadding(A023.getPaddingLeft(), dimensionPixelSize2, A023.getPaddingRight(), dimensionPixelSize);
            if (dimensionPixelSize4 > 0) {
                C107555bV.A03(A023, dimensionPixelSize4, AnonymousClass001.A0T(A023).rightMargin);
            }
            View A024 = C06560Yg.A02(this, R.id.control_button_container);
            if (dimensionPixelSize5 > 0) {
                ViewGroup.LayoutParams layoutParams = A024.getLayoutParams();
                layoutParams.height = dimensionPixelSize5;
                layoutParams.width = dimensionPixelSize5;
                A024.setLayoutParams(layoutParams);
            }
            if (dimensionPixelSize6 > 0) {
                ViewGroup.MarginLayoutParams A0T = AnonymousClass001.A0T(A024);
                C107555bV.A03(A024, dimensionPixelSize6, A0T.rightMargin);
                A024.setLayoutParams(A0T);
            }
            if (dimensionPixelSize7 > 0) {
                ViewGroup.LayoutParams A052 = this.A06.A05();
                A052.height = dimensionPixelSize7;
                A052.width = dimensionPixelSize7;
                this.A06.A08(A052);
            }
        }
    }

    public AudioPlayerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A01();
        A02(context, attributeSet);
    }

    public AudioPlayerView(Context context) {
        super(context);
        A01();
        A02(context, (AttributeSet) null);
    }
}
