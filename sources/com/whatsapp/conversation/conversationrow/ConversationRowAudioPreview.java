package com.whatsapp.conversation.conversationrow;

import X.AnonymousClass0x7;
import X.AnonymousClass0x9;
import X.AnonymousClass1VX;
import X.AnonymousClass4GJ;
import X.C06560Yg;
import X.C106905aM;
import X.C111685iW;
import X.C116855qy;
import X.C64333Db;
import X.C88864av;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.whatsapp.R;
import com.whatsapp.WaTextView;

public class ConversationRowAudioPreview extends FrameLayout implements AnonymousClass4GJ {
    public ImageView A00;
    public ImageView A01;
    public WaTextView A02;
    public WaveformVisualizerView A03;
    public AnonymousClass1VX A04;
    public C116855qy A05;
    public boolean A06;

    public void A00() {
        this.A03.setVisibility(8);
        this.A00.setVisibility(0);
    }

    public void A01() {
        if (!this.A06) {
            this.A06 = true;
            this.A04 = C64333Db.A4B(((C88864av) ((C111685iW) generatedComponent())).A0K);
        }
    }

    public final Object generatedComponent() {
        C116855qy r0 = this.A05;
        if (r0 == null) {
            r0 = C116855qy.A00(this);
            this.A05 = r0;
        }
        return r0.generatedComponent();
    }

    public void setDuration(String str) {
        this.A02.setText(str);
    }

    public ConversationRowAudioPreview(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A01();
        A02(context);
    }

    public final void A02(Context context) {
        WaTextView waTextView;
        float f;
        View.inflate(context, R.layout.f8nameremoved, this);
        this.A01 = AnonymousClass0x9.A0E(this, R.id.picture);
        this.A03 = (WaveformVisualizerView) C06560Yg.A02(this, R.id.visualizer);
        this.A00 = AnonymousClass0x9.A0E(this, R.id.icon);
        this.A02 = AnonymousClass0x7.A0L(this, R.id.duration);
        boolean A0X = this.A04.A0X(1040);
        ImageView imageView = this.A01;
        if (A0X) {
            imageView.setImageResource(R.drawable.audio_file_background);
            this.A02.A0A();
            waTextView = this.A02;
            f = 10.0f;
        } else {
            imageView.setImageResource(R.drawable.audio_message_thumb);
            WaTextView waTextView2 = this.A02;
            waTextView2.getContext();
            waTextView2.setTypeface(C106905aM.A00());
            waTextView = this.A02;
            f = 12.0f;
        }
        waTextView.setTextSize(2, f);
    }

    public ConversationRowAudioPreview(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A01();
        A02(context);
    }

    public ConversationRowAudioPreview(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet);
        A01();
    }

    public ConversationRowAudioPreview(Context context) {
        super(context);
        A01();
        A02(context);
    }
}
