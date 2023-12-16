package X;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.view.View;
import android.view.animation.Animation;

/* renamed from: X.5Qz  reason: invalid class name and case insensitive filesystem */
public class C104445Qz {
    public ObjectAnimator A00;
    public AnonymousClass5JJ A01;
    public C182388oK A02;
    public AnonymousClass4BP A03;
    public C137306oT A04;
    public final AnonymousClass5LY A05;
    public final AnonymousClass33O A06;
    public final C56932sn A07;
    public final AnonymousClass4BP A08 = new C107015aY(this, 1);
    public final C49252gE A09;
    public final AnonymousClass10k A0A;
    public final C53072mV A0B;
    public final C109665ez A0C = new C989553w(this, 13);

    public void A00() {
        if (this.A01.A00.getVisibility() == 0) {
            C18270x1.A0l(C18270x1.A04(this.A05.A0A.A01), "pref_avatar_sticker_onboarding_shown", true);
            this.A01.A00.setVisibility(8);
            Animation animation = this.A01.A00.getAnimation();
            if (animation != null) {
                animation.cancel();
            }
        }
    }

    public void A01(int i) {
        this.A01.A01.setVisibility(i);
        if (i != 0) {
            A00();
        } else if (this.A01.A00.getVisibility() != 0) {
            AnonymousClass66R r2 = this.A05.A0A.A01;
            if (!C18280x3.A1W(C18310x6.A0F(r2), "pref_avatar_sticker_onboarding_shown")) {
                C18270x1.A0l(C18270x1.A04(r2), "pref_avatar_sticker_onboarding_shown", true);
                this.A01.A00.setVisibility(0);
                ObjectAnimator objectAnimator = this.A00;
                if (objectAnimator == null) {
                    View view = this.A01.A00;
                    PropertyValuesHolder[] propertyValuesHolderArr = new PropertyValuesHolder[3];
                    C86614Ku.A1V(new float[1], propertyValuesHolderArr, 1.4f);
                    propertyValuesHolderArr[2] = PropertyValuesHolder.ofFloat("alpha", new float[]{0.4f, 0.0f});
                    objectAnimator = ObjectAnimator.ofPropertyValuesHolder(view, propertyValuesHolderArr);
                    this.A00 = objectAnimator;
                }
                objectAnimator.setDuration(1500);
                this.A00.setRepeatCount(-1);
                this.A00.setRepeatMode(1);
                this.A00.start();
                return;
            }
            this.A01.A00.setVisibility(8);
        }
    }

    public C104445Qz(AnonymousClass5LY r3, AnonymousClass33O r4, C56932sn r5, C49252gE r6, AnonymousClass10k r7, C53072mV r8) {
        this.A07 = r5;
        this.A06 = r4;
        this.A0B = r8;
        this.A05 = r3;
        this.A0A = r7;
        this.A09 = r6;
    }
}
