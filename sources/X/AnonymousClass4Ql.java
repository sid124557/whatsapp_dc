package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewStub;
import android.widget.LinearLayout;
import com.whatsapp.R;
import com.whatsapp.WaImageButton;
import com.whatsapp.WaTextView;
import com.whatsapp.calling.callgrid.view.VoiceParticipantAudioWave;
import com.whatsapp.calling.lightweightcalling.view.AudioChatBottomSheetDialog;
import com.whatsapp.calling.lightweightcalling.viewmodel.AudioChatCallingViewModel;
import com.whatsapp.voipcalling.CallInfo;

/* renamed from: X.4Ql  reason: invalid class name */
public final class AnonymousClass4Ql extends LinearLayout implements C185668u3, AnonymousClass4GJ {
    public ValueAnimator A00;
    public VoiceParticipantAudioWave A01;
    public AudioChatCallingViewModel A02;
    public C1225264s A03;
    public AnonymousClass1VX A04;
    public C116855qy A05;
    public Runnable A06;
    public boolean A07;
    public final ViewStub A08;
    public final WaImageButton A09;
    public final WaImageButton A0A;
    public final WaTextView A0B;
    public final WaTextView A0C;
    public final AnonymousClass5UY A0D;
    public final AnonymousClass66R A0E;

    public AnonymousClass4Ql(Context context) {
        super(context, (AttributeSet) null);
        if (!this.A07) {
            this.A07 = true;
            this.A04 = C64333Db.A4B(C88864av.A00(generatedComponent()));
        }
        this.A0E = C154517dI.A01(AnonymousClass8XI.A00);
        LayoutInflater.from(context).inflate(R.layout.f8nameremoved, this, true);
        View A022 = C06560Yg.A02(this, R.id.end_call_btn);
        C162457s7.A0K(A022, "null cannot be cast to non-null type com.whatsapp.WaImageButton");
        this.A09 = (WaImageButton) A022;
        View A023 = C06560Yg.A02(this, R.id.end_call_btn_container);
        C162457s7.A0K(A023, "null cannot be cast to non-null type android.widget.FrameLayout");
        C109315eQ.A01(A023, this, 9);
        View A024 = C06560Yg.A02(this, R.id.title);
        C162457s7.A0K(A024, "null cannot be cast to non-null type com.whatsapp.WaTextView");
        this.A0C = (WaTextView) A024;
        View A025 = C06560Yg.A02(this, R.id.subtitle);
        C162457s7.A0K(A025, "null cannot be cast to non-null type com.whatsapp.WaTextView");
        this.A0B = (WaTextView) A025;
        View A026 = C06560Yg.A02(this, R.id.audio_wave_view_stub);
        C162457s7.A0K(A026, "null cannot be cast to non-null type android.view.ViewStub");
        this.A08 = (ViewStub) A026;
        this.A0D = AnonymousClass0x2.A0M(this, R.id.dots_wave_view_stub);
        View A027 = C06560Yg.A02(this, R.id.mute_btn);
        C162457s7.A0K(A027, "null cannot be cast to non-null type com.whatsapp.WaImageButton");
        this.A0A = (WaImageButton) A027;
        View A028 = C06560Yg.A02(this, R.id.mute_btn_container);
        C162457s7.A0K(A028, "null cannot be cast to non-null type android.widget.FrameLayout");
        C109315eQ.A01(A028, this, 10);
        setVisibility(8);
    }

    public static final void setViewModel$lambda$6(AudioChatCallingViewModel audioChatCallingViewModel, View view) {
        C162457s7.A0J(audioChatCallingViewModel, 0);
        audioChatCallingViewModel.A0I.A00(24, 37);
        C107285b3 r2 = audioChatCallingViewModel.A02;
        if (r2 != null) {
            r2.A0e((CallInfo) null, (String) null, 1);
        }
    }

    public final void setAbProps(AnonymousClass1VX r2) {
        C162457s7.A0J(r2, 0);
        this.A04 = r2;
    }

    public static final /* synthetic */ void A01(AnonymousClass4Ql r7, C104885Ss r8) {
        int A042;
        Integer num = r8.A02;
        if (num != null) {
            Resources resources = r7.getResources();
            int intValue = num.intValue();
            if (intValue == -1) {
                A042 = resources.getColor(R.color.f5nameremoved);
            } else {
                int[] intArray = resources.getIntArray(R.array.f2nameremoved);
                A042 = intArray[intValue % intArray.length];
            }
        } else {
            A042 = AnonymousClass0Y8.A04(r7.getContext(), R.color.f5nameremoved);
        }
        WaTextView waTextView = r7.A0C;
        C86614Ku.A12(r7.getContext(), waTextView, r8.A01);
        waTextView.setTextColor(A042);
        boolean z = r8.A05;
        if (z && r7.A01 == null) {
            View inflate = r7.A08.inflate();
            C162457s7.A0K(inflate, "null cannot be cast to non-null type com.whatsapp.calling.callgrid.view.VoiceParticipantAudioWave");
            r7.A01 = (VoiceParticipantAudioWave) inflate;
        }
        VoiceParticipantAudioWave voiceParticipantAudioWave = r7.A01;
        if (voiceParticipantAudioWave != null) {
            voiceParticipantAudioWave.setVisibility(AnonymousClass001.A08(z ? 1 : 0));
        }
        VoiceParticipantAudioWave voiceParticipantAudioWave2 = r7.A01;
        if (voiceParticipantAudioWave2 != null) {
            voiceParticipantAudioWave2.setColor(A042);
        }
        C86614Ku.A12(r7.getContext(), r7.A0B, r8.A00);
        WaImageButton waImageButton = r7.A0A;
        waImageButton.setSelected(r8.A03);
        Context context = r7.getContext();
        boolean isSelected = waImageButton.isSelected();
        int i = R.string.f11nameremoved;
        if (isSelected) {
            i = R.string.f11nameremoved;
        }
        String string = context.getString(i);
        Context context2 = r7.getContext();
        boolean isSelected2 = waImageButton.isSelected();
        int i2 = R.string.f11nameremoved;
        if (isSelected2) {
            i2 = R.string.f11nameremoved;
        }
        C86654Ky.A1A(waImageButton, string, context2.getString(i2), false);
        if (r8.A04) {
            AnonymousClass5UY r4 = r7.A0D;
            if (AnonymousClass5UY.A00(r4, 0).getBackground() == null) {
                r4.A04().setBackground(r7.getAvdHolder().A00(C18290x4.A0F(r7), R.drawable.vec_voice_chat_dots_wave, true));
                return;
            }
            return;
        }
        r7.getAvdHolder().A02();
        AnonymousClass5UY r2 = r7.A0D;
        if (r2.A01 != null) {
            r2.A04().setBackground((Drawable) null);
            r2.A06(8);
        }
    }

    private final C52762m0 getAvdHolder() {
        return (C52762m0) this.A0E.getValue();
    }

    public final Object generatedComponent() {
        C116855qy r0 = this.A05;
        if (r0 == null) {
            r0 = C116855qy.A00(this);
            this.A05 = r0;
        }
        return r0.generatedComponent();
    }

    public final AnonymousClass1VX getAbProps() {
        AnonymousClass1VX r0 = this.A04;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0R();
    }

    public void setShouldHideBanner(boolean z) {
        AudioChatCallingViewModel audioChatCallingViewModel = this.A02;
        if (audioChatCallingViewModel != null) {
            audioChatCallingViewModel.A0C = z;
            if (z) {
                audioChatCallingViewModel.A0E.A0H(Boolean.FALSE);
            } else {
                AnonymousClass4VK.A02(audioChatCallingViewModel.A0H, audioChatCallingViewModel);
            }
        }
    }

    public final void setViewModel(AudioChatCallingViewModel audioChatCallingViewModel, C15910sA r6) {
        this.A02 = audioChatCallingViewModel;
        C86604Kt.A1N(r6, audioChatCallingViewModel.A0E, new AnonymousClass8Y1(this), 155);
        C86604Kt.A1N(r6, audioChatCallingViewModel.A0F, new AnonymousClass746(this, 6), 156);
        C86604Kt.A1N(r6, audioChatCallingViewModel.A0D, C1001359q.A00(this, 16), 157);
        setOnClickListener(new C109465ef(audioChatCallingViewModel, 6, this));
        C109315eQ.A01(this.A09, audioChatCallingViewModel, 11);
        C18290x4.A1I(this.A0A, audioChatCallingViewModel, this, 7);
    }

    public static final void setViewModel$lambda$5(AudioChatCallingViewModel audioChatCallingViewModel, AnonymousClass4Ql r5, View view) {
        C18260x0.A0O(audioChatCallingViewModel, r5);
        Context A0F = C18290x4.A0F(r5);
        audioChatCallingViewModel.A0I.A00(7, 37);
        String str = audioChatCallingViewModel.A05;
        if (str != null) {
            AudioChatBottomSheetDialog audioChatBottomSheetDialog = new AudioChatBottomSheetDialog();
            Bundle A082 = AnonymousClass002.A08();
            A082.putString("audio_chat_call_id", str);
            audioChatBottomSheetDialog.A0u(A082);
            audioChatBottomSheetDialog.A1O(((C003203q) C111095hX.A03(A0F, C89644eZ.class)).getSupportFragmentManager(), "AudioChatBottomSheetDialog");
        }
    }

    public static final void setViewModel$lambda$7(AudioChatCallingViewModel audioChatCallingViewModel, AnonymousClass4Ql r5, View view) {
        boolean A1U = C18270x1.A1U(audioChatCallingViewModel, r5);
        WaImageButton waImageButton = r5.A0A;
        boolean z = false;
        if (waImageButton != null && waImageButton.isSelected() == A1U) {
            z = true;
        }
        AnonymousClass3XG r2 = audioChatCallingViewModel.A0I;
        int i = 1;
        if (z) {
            i = 2;
        }
        r2.A00(i, 37);
        C107285b3 r1 = audioChatCallingViewModel.A02;
        if (r1 != null) {
            C86644Kx.A1G(new C117695sL(r1), r1);
        }
    }

    /* access modifiers changed from: private */
    public final void setVisibilityInternal(boolean z) {
        setVisibility(AnonymousClass001.A08(z ? 1 : 0));
        C1225264s r1 = this.A03;
        if (r1 != null) {
            r1.Bfa(getVisibility());
        }
    }

    public final void A02(boolean z) {
        ValueAnimator valueAnimator;
        int i = 0;
        if (AnonymousClass000.A1T(getVisibility()) != z || ((valueAnimator = this.A00) != null && valueAnimator.isRunning())) {
            ValueAnimator valueAnimator2 = this.A00;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                Runnable runnable = this.A06;
                if (runnable != null) {
                    removeCallbacks(runnable);
                }
                this.A06 = new C71703cX(12, (Object) this, z);
            } else if (((getAbProps().A0N(5091) >> 3) & 1) == 1) {
                setVisibility(0);
                if (z) {
                    setVisibilityInternal(true);
                }
                measure(0, 0);
                if (!z) {
                    i = getMeasuredHeight();
                }
                ValueAnimator A0Q = C86664Kz.A0Q(C86664Kz.A1a(i), getMeasuredHeight() - i);
                A0Q.addListener(new C188648zG(2, this, z));
                C100295Aj.A03(A0Q, this, 5);
                A0Q.setDuration(250);
                C86614Ku.A0y(A0Q);
                A0Q.start();
                this.A00 = A0Q;
            } else {
                setVisibilityInternal(z);
            }
        }
    }

    public void setShouldHideCallDuration(boolean z) {
    }

    public void setShouldShowGenericContactOrGroupName(boolean z) {
    }

    public void setVisibilityChangeListener(C1225264s r1) {
        this.A03 = r1;
    }

    public int getBackgroundColorRes() {
        return R.color.f5nameremoved;
    }

    public static final void setViewModel$lambda$2(AnonymousClass4GQ r0, Object obj) {
        C86634Kw.A1W(r0, obj);
    }

    public static final void setViewModel$lambda$3(AnonymousClass4GQ r0, Object obj) {
        C86634Kw.A1W(r0, obj);
    }

    public static final void setViewModel$lambda$4(AnonymousClass4GQ r0, Object obj) {
        C86634Kw.A1W(r0, obj);
    }
}
