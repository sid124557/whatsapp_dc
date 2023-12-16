package X;

import android.content.Context;
import android.content.res.Configuration;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.whatsapp.R;
import com.whatsapp.status.playback.content.BlurFrameLayout;
import com.whatsapp.status.playback.widget.VoiceStatusContentView;

/* renamed from: X.4Pf  reason: invalid class name and case insensitive filesystem */
public final class C87344Pf extends FrameLayout implements AnonymousClass4GJ {
    public AnonymousClass1VX A00;
    public BlurFrameLayout A01;
    public VoiceStatusContentView A02;
    public C116855qy A03;
    public boolean A04;

    public void onConfigurationChanged(Configuration configuration) {
        C162457s7.A0J(configuration, 0);
        super.onConfigurationChanged(configuration);
        VoiceStatusContentView voiceStatusContentView = this.A02;
        if (voiceStatusContentView == null) {
            throw C18270x1.A0S("voiceStatusContentView");
        }
        ViewGroup.MarginLayoutParams A0O = C86634Kw.A0O(voiceStatusContentView);
        int dimensionPixelOffset = C18290x4.A0G(this).getDimensionPixelOffset(R.dimen.f6nameremoved);
        A0O.setMargins(dimensionPixelOffset, A0O.topMargin, dimensionPixelOffset, A0O.bottomMargin);
        voiceStatusContentView.setLayoutParams(A0O);
        voiceStatusContentView.requestLayout();
    }

    public final void setAbProps(AnonymousClass1VX r2) {
        C162457s7.A0J(r2, 0);
        this.A00 = r2;
    }

    public final Object generatedComponent() {
        C116855qy r0 = this.A03;
        if (r0 == null) {
            r0 = C116855qy.A00(this);
            this.A03 = r0;
        }
        return r0.generatedComponent();
    }

    public final AnonymousClass1VX getAbProps() {
        AnonymousClass1VX r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0R();
    }

    public final C183088pT getWavesView() {
        VoiceStatusContentView voiceStatusContentView = this.A02;
        if (voiceStatusContentView != null) {
            return voiceStatusContentView;
        }
        throw C18270x1.A0S("voiceStatusContentView");
    }

    public final void setBlurEnabled(boolean z) {
        BlurFrameLayout blurFrameLayout = this.A01;
        if (blurFrameLayout != null) {
            blurFrameLayout.setBlurEnabled(z);
        }
    }

    public C87344Pf(Context context) {
        super(context);
        if (!this.A04) {
            this.A04 = true;
            this.A00 = C64333Db.A4B(C88864av.A00(generatedComponent()));
        }
        BlurFrameLayout blurFrameLayout = null;
        if (getAbProps().A0X(3229)) {
            View.inflate(context, R.layout.f8nameremoved, this);
        } else {
            View.inflate(context, R.layout.f8nameremoved, this);
            View A022 = C06560Yg.A02(this, R.id.blur_container);
            C162457s7.A0K(A022, "null cannot be cast to non-null type com.whatsapp.status.playback.content.BlurFrameLayout");
            blurFrameLayout = (BlurFrameLayout) A022;
        }
        this.A01 = blurFrameLayout;
        VoiceStatusContentView voiceStatusContentView = (VoiceStatusContentView) C18280x3.A0E(this, R.id.message_voice);
        this.A02 = voiceStatusContentView;
        if (voiceStatusContentView == null) {
            throw C18270x1.A0S("voiceStatusContentView");
        }
        voiceStatusContentView.A05 = new C115895pP(this);
    }

    private final void setBackgroundColorFromMessage(C30721mu r3) {
        int A002 = AnonymousClass75C.A00(C18290x4.A0F(this), r3);
        setBackgroundColor(A002);
        BlurFrameLayout blurFrameLayout = this.A01;
        if (blurFrameLayout != null) {
            blurFrameLayout.setBackgroundColor(A002);
        }
    }

    public final void setMessage(C30721mu r2, C105365Uq r3) {
        setBackgroundColorFromMessage(r2);
        VoiceStatusContentView voiceStatusContentView = this.A02;
        if (voiceStatusContentView == null) {
            throw C18270x1.A0S("voiceStatusContentView");
        }
        voiceStatusContentView.setVoiceMessage(r2, r3);
    }
}
