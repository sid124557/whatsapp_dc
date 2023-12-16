package com.whatsapp.voicetranscription;

import X.AnonymousClass0x7;
import X.AnonymousClass4GJ;
import X.C116855qy;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.whatsapp.R;
import com.whatsapp.WaTextView;

public class AudioTranscriptionView extends LinearLayout implements AnonymousClass4GJ {
    public long A00;
    public WaTextView A01;
    public C116855qy A02;
    public boolean A03;

    public final Object generatedComponent() {
        C116855qy r0 = this.A02;
        if (r0 == null) {
            r0 = C116855qy.A00(this);
            this.A02 = r0;
        }
        return r0.generatedComponent();
    }

    public AudioTranscriptionView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        if (!this.A03) {
            this.A03 = true;
            generatedComponent();
        }
    }

    public AudioTranscriptionView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (!this.A03) {
            this.A03 = true;
            generatedComponent();
        }
        this.A00 = -1;
        View.inflate(context, R.layout.f8nameremoved, this);
        this.A01 = AnonymousClass0x7.A0L(this, R.id.transcription_text_view);
    }

    public AudioTranscriptionView(Context context) {
        super(context);
        if (!this.A03) {
            this.A03 = true;
            generatedComponent();
        }
        this.A00 = -1;
        View.inflate(context, R.layout.f8nameremoved, this);
        this.A01 = AnonymousClass0x7.A0L(this, R.id.transcription_text_view);
    }
}
