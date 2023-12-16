package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.whatsapp.R;
import com.whatsapp.calling.lightweightcalling.viewmodel.AudioChatCallingViewModel;
import com.whatsapp.calling.views.VoipReturnToCallBanner;

/* renamed from: X.4PI  reason: invalid class name */
public final class AnonymousClass4PI extends FrameLayout implements C185668u3, AnonymousClass4GJ {
    public C15910sA A00;
    public AnonymousClass4Ql A01;
    public AudioChatCallingViewModel A02;
    public C1225264s A03;
    public C116855qy A04;
    public boolean A05;
    public final VoipReturnToCallBanner A06;

    public AnonymousClass4PI(Context context) {
        super(context, (AttributeSet) null);
        if (!this.A05) {
            this.A05 = true;
            generatedComponent();
        }
        LayoutInflater.from(context).inflate(R.layout.f8nameremoved, this, true);
        View A022 = C06560Yg.A02(this, R.id.return_to_call_banner);
        C162457s7.A0K(A022, "null cannot be cast to non-null type com.whatsapp.calling.views.VoipReturnToCallBanner");
        this.A06 = (VoipReturnToCallBanner) A022;
        setVisibility(8);
    }

    public void setVisibilityChangeListener(C1225264s r3) {
        C1891490e r1 = new C1891490e(this, 0, r3);
        this.A03 = r1;
        this.A06.A02 = r1;
        AnonymousClass4Ql r0 = this.A01;
        if (r0 != null) {
            r0.A03 = r1;
        }
    }

    /* access modifiers changed from: private */
    public final void setupVoiceChatBanner(boolean z) {
        if (z && this.A01 == null) {
            Context A0F = C18290x4.A0F(this);
            AudioChatCallingViewModel audioChatCallingViewModel = this.A02;
            if (audioChatCallingViewModel == null) {
                throw C18270x1.A0S("audioChatViewModel");
            }
            C15910sA r0 = this.A00;
            if (r0 == null) {
                throw C18270x1.A0S("lifeCycleOwner");
            }
            AnonymousClass4Ql r1 = new AnonymousClass4Ql(A0F);
            r1.setViewModel(audioChatCallingViewModel, r0);
            this.A01 = r1;
            C1225264s r02 = this.A03;
            if (r02 == null) {
                throw C18270x1.A0S("visibilityChangeListener");
            }
            r1.A03 = r02;
            addView(r1);
        }
    }

    public final Object generatedComponent() {
        C116855qy r0 = this.A04;
        if (r0 == null) {
            r0 = C116855qy.A00(this);
            this.A04 = r0;
        }
        return r0.generatedComponent();
    }

    public int getBackgroundColorRes() {
        AnonymousClass4Ql r0 = this.A01;
        if (r0 == null || r0.getVisibility() != 0) {
            return this.A06.getBackgroundColorRes();
        }
        return R.color.f5nameremoved;
    }

    public final void setAudioChatViewModel(AudioChatCallingViewModel audioChatCallingViewModel, C15910sA r2) {
        this.A02 = audioChatCallingViewModel;
        this.A00 = r2;
    }

    public void setShouldHideBanner(boolean z) {
        AnonymousClass4Ql r0 = this.A01;
        if (r0 != null) {
            r0.setShouldHideBanner(z);
        }
        this.A06.setShouldHideBanner(z);
    }

    public void setShouldHideCallDuration(boolean z) {
        this.A06.setShouldHideCallDuration(z);
    }

    public void setShouldShowGenericContactOrGroupName(boolean z) {
        this.A06.setShouldShowGenericContactOrGroupName(z);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        post(C117695sL.A00(this, 21));
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AudioChatCallingViewModel audioChatCallingViewModel = this.A02;
        if (audioChatCallingViewModel == null) {
            throw C18270x1.A0S("audioChatViewModel");
        }
        audioChatCallingViewModel.A0E.A0F(AnonymousClass4L0.A0G(new AnonymousClass746(this, 8), 159));
    }
}
