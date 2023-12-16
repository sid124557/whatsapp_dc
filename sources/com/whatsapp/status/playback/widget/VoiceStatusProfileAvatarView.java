package com.whatsapp.status.playback.widget;

import X.AnonymousClass0x9;
import X.C06560Yg;
import X.C18310x6;
import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.whatsapp.R;
import com.whatsapp.WaImageView;

public class VoiceStatusProfileAvatarView extends FrameLayout {
    public WaImageView A00;
    public WaImageView A01;

    public WaImageView getProfileAvatarImageView() {
        return this.A01;
    }

    public VoiceStatusProfileAvatarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00(context);
    }

    public final void A00(Context context) {
        View.inflate(context, R.layout.f8nameremoved, this);
        this.A01 = AnonymousClass0x9.A0L(this, R.id.profile_avatar);
        this.A00 = AnonymousClass0x9.A0L(this, R.id.mic_overlay);
    }

    public void setMicrophoneStrokeColor(int i) {
        this.A00.setBackground(C18310x6.A0G(getContext(), R.drawable.mic_background_incoming_normal).mutate());
        C06560Yg.A0C(ColorStateList.valueOf(i), this.A00);
    }

    public VoiceStatusProfileAvatarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00(context);
    }

    public VoiceStatusProfileAvatarView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        A00(context);
    }

    public VoiceStatusProfileAvatarView(Context context) {
        super(context);
        A00(context);
    }
}
