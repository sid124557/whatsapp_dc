package X;

import android.animation.Animator;
import com.whatsapp.contact.picker.SelectedListContactPickerFragment;

/* renamed from: X.5bm  reason: invalid class name and case insensitive filesystem */
public final class C107715bm implements Animator.AnimatorListener {
    public final /* synthetic */ SelectedListContactPickerFragment A00;

    public C107715bm(SelectedListContactPickerFragment selectedListContactPickerFragment) {
        this.A00 = selectedListContactPickerFragment;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0052, code lost:
        if (r3.A00 != 1) goto L_0x0054;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onAnimationEnd(android.animation.Animator r6) {
        /*
            r5 = this;
            com.whatsapp.contact.picker.SelectedListContactPickerFragment r3 = r5.A00
            android.widget.RelativeLayout r1 = r3.A01
            if (r1 == 0) goto L_0x0018
            java.util.Map r0 = r3.A3n
            X.C162457s7.A0C(r0)
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            int r0 = X.AnonymousClass001.A08(r0)
            r1.setVisibility(r0)
        L_0x0018:
            boolean r0 = r3 instanceof com.whatsapp.contact.picker.VoipContactPickerFragment
            if (r0 == 0) goto L_0x003f
            com.whatsapp.contact.picker.VoipContactPickerFragment r3 = (com.whatsapp.contact.picker.VoipContactPickerFragment) r3
            X.5UY r4 = r3.A05
            if (r4 == 0) goto L_0x003e
            java.util.Map r0 = r3.A3n
            X.C162457s7.A0C(r0)
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            r1 = 0
            if (r0 == 0) goto L_0x0068
            android.view.View r2 = X.AnonymousClass5UY.A00(r4, r1)
            r1 = 33
            X.3a7 r0 = new X.3a7
            r0.<init>(r3, r1, r4)
            r2.post(r0)
        L_0x003e:
            return
        L_0x003f:
            com.whatsapp.contact.picker.AudienceSelectionContactPickerFragment r3 = (com.whatsapp.contact.picker.AudienceSelectionContactPickerFragment) r3
            java.util.Map r0 = r3.A3n
            X.C162457s7.A0C(r0)
            boolean r0 = r0.isEmpty()
            r2 = 1
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x0054
            int r0 = r3.A00
            r1 = 0
            if (r0 == r2) goto L_0x0055
        L_0x0054:
            r1 = 1
        L_0x0055:
            X.6Z3 r0 = r3.A02
            if (r0 == 0) goto L_0x0060
            boolean r0 = X.C86604Kt.A1Y(r0)
            if (r0 != r1) goto L_0x0060
            return
        L_0x0060:
            X.6Z3 r0 = r3.A02
            if (r0 == 0) goto L_0x003e
            X.AnonymousClass5VQ.A01(r0, r1, r2)
            return
        L_0x0068:
            r0 = 8
            r4.A06(r0)
            r3.A1i(r1, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C107715bm.onAnimationEnd(android.animation.Animator):void");
    }

    public void onAnimationStart(Animator animator) {
        AnonymousClass0x2.A0x(this.A00.A01);
    }

    public void onAnimationCancel(Animator animator) {
    }

    public void onAnimationRepeat(Animator animator) {
    }
}
