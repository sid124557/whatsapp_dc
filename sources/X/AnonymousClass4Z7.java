package X;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.res.Resources;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel;

/* renamed from: X.4Z7  reason: invalid class name */
public abstract class AnonymousClass4Z7 extends C05570Ua {
    public int A00 = 0;
    public int A01;
    public int A02;
    public int A03 = 0;
    public AnimatorSet A04;
    public C15930sC A05;
    public CallGridViewModel A06;
    public C105175Tw A07;
    public boolean A08;
    public boolean A09;
    public final AnonymousClass7D2 A0A;
    public final C112785kI A0B;
    public final AnonymousClass5ZU A0C;

    public abstract void A08();

    public abstract void A0A(int i);

    public abstract void A0G(C105175Tw r1);

    public boolean A06() {
        return AnonymousClass000.A1W(this.A07);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0018, code lost:
        r3 = (X.C91234j9) r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A07() {
        /*
            r4 = this;
            boolean r0 = r4 instanceof X.C91224j8
            if (r0 == 0) goto L_0x0014
            r2 = r4
            X.4j8 r2 = (X.C91224j8) r2
            X.5Tw r1 = r2.A07
            if (r1 == 0) goto L_0x0013
            com.whatsapp.WaDynamicRoundCornerImageView r0 = r2.A0I
            if (r0 == 0) goto L_0x0013
            r0 = 1
            r2.A0L(r1, r0)
        L_0x0013:
            return
        L_0x0014:
            boolean r0 = r4 instanceof X.C91234j9
            if (r0 == 0) goto L_0x0013
            r3 = r4
            X.4j9 r3 = (X.C91234j9) r3
            X.5Tw r0 = r3.A07
            if (r0 == 0) goto L_0x0013
            X.3ZH r2 = r0.A0a
            com.whatsapp.WaDynamicRoundCornerImageView r1 = r3.A0K
            r0 = 1
            r3.A0E(r1, r2, r0, r0)
            X.5Tw r0 = r3.A07
            X.3ZH r2 = r0.A0a
            com.whatsapp.components.button.ThumbnailButton r1 = r3.A0Q
            r0 = 0
            r3.A0E(r1, r2, r0, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4Z7.A07():void");
    }

    public void A09(int i) {
        if ((this instanceof C91224j8) || !(this instanceof C91234j9)) {
            this.A0H.setVisibility(i);
            return;
        }
        C91234j9 r2 = (C91234j9) this;
        r2.A0H.setVisibility(i);
        View view = r2.A0F;
        if (view instanceof SurfaceView) {
            if (!r2.A06()) {
                i = 8;
            }
            view.setVisibility(i);
        }
    }

    public void A0B(MotionEvent motionEvent, View view) {
        if (view == null) {
            return;
        }
        if (motionEvent.getAction() == 0) {
            A0C(view, true);
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            A0C(view, false);
        }
    }

    public final void A0C(View view, boolean z) {
        AnimatorSet animatorSet = this.A04;
        if (animatorSet != null && animatorSet.isRunning()) {
            this.A04.cancel();
        }
        View view2 = this.A0H;
        PropertyValuesHolder[] propertyValuesHolderArr = new PropertyValuesHolder[2];
        float[] fArr = new float[1];
        float f = 0.95f;
        float f2 = 1.0f;
        float f3 = 1.0f;
        if (z) {
            f3 = 0.95f;
        }
        fArr[0] = f3;
        propertyValuesHolderArr[0] = PropertyValuesHolder.ofFloat("scaleX", fArr);
        float[] fArr2 = new float[1];
        if (!z) {
            f = 1.0f;
        }
        fArr2[0] = f;
        propertyValuesHolderArr[1] = PropertyValuesHolder.ofFloat("scaleY", fArr2);
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view2, propertyValuesHolderArr);
        PropertyValuesHolder[] propertyValuesHolderArr2 = new PropertyValuesHolder[1];
        float[] fArr3 = new float[1];
        if (!z) {
            f2 = 0.0f;
        }
        fArr3[0] = f2;
        propertyValuesHolderArr2[0] = PropertyValuesHolder.ofFloat("alpha", fArr3);
        ObjectAnimator ofPropertyValuesHolder2 = ObjectAnimator.ofPropertyValuesHolder(view, propertyValuesHolderArr2);
        AnimatorSet A0O = C86664Kz.A0O();
        A0O.playTogether(C86664Kz.A1b(ofPropertyValuesHolder, ofPropertyValuesHolder2, 2, 0));
        A0O.setDuration((long) 200);
        C86644Kx.A0i(A0O);
        this.A04 = A0O;
        A0O.start();
    }

    public void A0D(ViewGroup viewGroup, TextView textView) {
        if (this.A02 == 3 && textView != null && viewGroup != null) {
            AnonymousClass0Y9.A07(textView, textView.getResources().getDimensionPixelSize(R.dimen.f6nameremoved), textView.getResources().getDimensionPixelSize(R.dimen.f6nameremoved), 1, 0);
            viewGroup.setBackground(C02680He.A00((Resources.Theme) null, viewGroup.getResources(), R.drawable.h_scroll_call_status_background));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000a, code lost:
        if (r5.A09 != false) goto L_0x000c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0E(android.widget.ImageView r6, X.AnonymousClass3ZH r7, boolean r8, boolean r9) {
        /*
            r5 = this;
            X.7D2 r2 = r5.A0A
            if (r2 == 0) goto L_0x002d
            r4 = 0
            if (r8 != 0) goto L_0x000c
            boolean r0 = r5.A09
            r1 = 0
            if (r0 == 0) goto L_0x000d
        L_0x000c:
            r1 = 1
        L_0x000d:
            java.util.Map r0 = r2.A00
            java.lang.Object r3 = X.AnonymousClass001.A0i(r0, r1)
            X.5Uq r3 = (X.C105365Uq) r3
            if (r3 == 0) goto L_0x002d
            X.5kI r2 = r5.A0B
            r2.A00 = r9
            java.util.HashSet r1 = r2.A03
            int r0 = r6.hashCode()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            if (r8 == 0) goto L_0x002e
            r1.add(r0)
        L_0x002a:
            r3.A05(r6, r2, r7, r4)
        L_0x002d:
            return
        L_0x002e:
            r1.remove(r0)
            goto L_0x002a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4Z7.A0E(android.widget.ImageView, X.3ZH, boolean, boolean):void");
    }

    public void A0F(AnonymousClass5MO r2) {
        if (this instanceof C91224j8) {
            ((C91224j8) this).A03 = r2;
        } else if (this instanceof C91234j9) {
            ((C91234j9) this).A03 = r2;
        } else {
            ((C91184j4) this).A00 = r2;
        }
    }

    public AnonymousClass4Z7(View view, AnonymousClass30B r6, AnonymousClass7D2 r7, CallGridViewModel callGridViewModel, AnonymousClass5UX r9, AnonymousClass5ZU r10) {
        super(view);
        this.A0C = r10;
        this.A0A = r7;
        this.A06 = callGridViewModel;
        if (r6.A07 == null) {
            synchronized (r6.A01) {
                if (r6.A07 == null) {
                    r6.A07 = r6.A00.A00("blurredContactsThumbCache", AnonymousClass30B.A0E);
                }
            }
        }
        this.A0B = new C112785kI(r6.A07, r9);
    }
}
