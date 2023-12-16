package X;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.view.View;

/* renamed from: X.5RA  reason: invalid class name */
public class AnonymousClass5RA {
    public ObjectAnimator A00;
    public C182388oK A01;
    public C102625Jq A02;
    public C115975pX A03;
    public AnonymousClass4BP A04;
    public C137296oS A05;
    public final AnonymousClass5LY A06;
    public final AnonymousClass1VX A07;
    public final C45532aA A08;
    public final C45112Ys A09;
    public final AnonymousClass33O A0A;
    public final C29361ih A0B;
    public final C56932sn A0C;
    public final AnonymousClass4BP A0D = new C107015aY(this, 2);
    public final C49252gE A0E;
    public final AnonymousClass10k A0F;
    public final C53072mV A0G;
    public final C162157rM A0H;
    public final C109665ez A0I = new C989553w(this, 16);
    public final C183538qC A0J;

    public boolean A01() {
        AnonymousClass10k r0;
        if (this.A0E.A01() && (r0 = this.A0F) != null) {
            AnonymousClass08M r1 = r0.A03;
            if (r1.A07() == null || C86634Kw.A1Y(r1)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public AnonymousClass5RA(AnonymousClass5LY r3, AnonymousClass1VX r4, C45532aA r5, C45112Ys r6, AnonymousClass33O r7, C29361ih r8, C56932sn r9, C49252gE r10, AnonymousClass10k r11, C53072mV r12, C162157rM r13, C183538qC r14) {
        this.A07 = r4;
        this.A0H = r13;
        this.A0B = r8;
        this.A0C = r9;
        this.A0J = r14;
        this.A06 = r3;
        this.A0A = r7;
        this.A09 = r6;
        this.A0G = r12;
        this.A0F = r11;
        this.A08 = r5;
        this.A0E = r10;
    }

    public void A00(boolean z) {
        int i;
        View view;
        C18260x0.A1D("EmojiAndGifPopupWindow/showStickerTab/isVisible=", AnonymousClass001.A0o(), z);
        if (!z) {
            i = 8;
            view = this.A02.A02;
        } else {
            this.A02.A02.setVisibility(0);
            boolean z2 = AnonymousClass0x2.A0F(this.A06.A05).getBoolean("sticker_store_onboarding_badge_shown", false);
            C102625Jq r0 = this.A02;
            if (!z2) {
                r0.A01.setVisibility(0);
                ObjectAnimator objectAnimator = this.A00;
                if (objectAnimator == null) {
                    View view2 = this.A02.A01;
                    PropertyValuesHolder[] propertyValuesHolderArr = new PropertyValuesHolder[3];
                    C86614Ku.A1V(new float[1], propertyValuesHolderArr, 1.4f);
                    propertyValuesHolderArr[2] = PropertyValuesHolder.ofFloat("alpha", new float[]{0.4f, 0.0f});
                    objectAnimator = ObjectAnimator.ofPropertyValuesHolder(view2, propertyValuesHolderArr);
                    this.A00 = objectAnimator;
                }
                objectAnimator.setDuration(1500);
                this.A00.setRepeatCount(-1);
                this.A00.setRepeatMode(1);
                this.A00.start();
                return;
            }
            i = 8;
            view = r0.A01;
        }
        view.setVisibility(i);
    }
}
