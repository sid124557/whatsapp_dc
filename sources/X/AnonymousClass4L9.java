package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.whatsapp.voipcalling.VoipCallControlBottomSheetV2;

/* renamed from: X.4L9  reason: invalid class name */
public class AnonymousClass4L9 extends AnimatorListenerAdapter {
    public final /* synthetic */ float A00;
    public final /* synthetic */ C105315Uk A01;

    public AnonymousClass4L9(C105315Uk r1, float f) {
        this.A01 = r1;
        this.A00 = f;
    }

    public void onAnimationCancel(Animator animator) {
        this.A01.A0D.setAlpha(this.A00);
        onAnimationEnd(animator);
    }

    public void onAnimationEnd(Animator animator) {
        if (this.A00 == 0.0f) {
            C105315Uk r3 = this.A01;
            r3.A0D.setVisibility(8);
            VoipCallControlBottomSheetV2 voipCallControlBottomSheetV2 = r3.A0M;
            C103325Ml r0 = voipCallControlBottomSheetV2.A0g;
            if (r0 != null) {
                r0.A00(false);
            }
            voipCallControlBottomSheetV2.A1Y(0.0f);
        }
    }

    public void onAnimationStart(Animator animator) {
        if (this.A00 == 1.0f) {
            C105315Uk r3 = this.A01;
            r3.A0D.setVisibility(0);
            VoipCallControlBottomSheetV2 voipCallControlBottomSheetV2 = r3.A0M;
            C103325Ml r0 = voipCallControlBottomSheetV2.A0g;
            if (r0 != null) {
                r0.A00(true);
            }
            voipCallControlBottomSheetV2.A1Y(1.0f);
        }
    }
}
