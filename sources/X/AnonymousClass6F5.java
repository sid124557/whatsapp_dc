package X;

import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.Transformation;
import com.whatsapp.calling.views.VoipCallControlRingingDotsIndicator;

/* renamed from: X.6F5  reason: invalid class name */
public final class AnonymousClass6F5 extends Animation {
    public final float A00 = 0.14f;
    public final float A01 = 0.66f;
    public final int A02 = 800;
    public final int A03 = 100;
    public final VoipCallControlRingingDotsIndicator A04;

    public void applyTransformation(float f, Transformation transformation) {
        int i;
        VoipCallControlRingingDotsIndicator voipCallControlRingingDotsIndicator;
        int i2 = 0;
        do {
            i = i2 + 1;
            int duration = ((int) (((float) getDuration()) * f)) - (this.A03 * i);
            int i3 = this.A02;
            int i4 = i3 / 2;
            float f2 = (float) duration;
            if (duration > i4) {
                f2 = ((float) i3) - ((float) duration);
            }
            float f3 = f2 / ((float) i4);
            if (f3 < 0.0f) {
                f3 = 0.0f;
            } else if (f3 > 1.0f) {
                f3 = 1.0f;
            }
            voipCallControlRingingDotsIndicator = this.A04;
            float f4 = this.A00;
            float f5 = f4 + ((this.A01 - f4) * f3);
            if (i2 >= 0 && i2 < 3) {
                voipCallControlRingingDotsIndicator.A05[i2] = f5;
            }
            i2 = i;
        } while (i < 3);
        voipCallControlRingingDotsIndicator.invalidate();
    }

    public AnonymousClass6F5(VoipCallControlRingingDotsIndicator voipCallControlRingingDotsIndicator, float f, float f2, int i, int i2, int i3) {
        this.A04 = voipCallControlRingingDotsIndicator;
        setDuration((long) 1500);
        setInterpolator(new LinearInterpolator());
    }

    public AnonymousClass6F5(VoipCallControlRingingDotsIndicator voipCallControlRingingDotsIndicator) {
        this.A04 = voipCallControlRingingDotsIndicator;
        setDuration(1500);
        setInterpolator(new LinearInterpolator());
    }
}
