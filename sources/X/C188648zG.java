package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.whatsapp.calling.callgrid.view.FocusViewContainer;
import com.whatsapp.privacy.usernotice.UserNoticeBottomSheetDialogFragment;

/* renamed from: X.8zG  reason: invalid class name and case insensitive filesystem */
public class C188648zG extends AnimatorListenerAdapter {
    public Object A00;
    public boolean A01;
    public final int A02;

    public C188648zG(int i, Object obj, boolean z) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = z;
    }

    public void onAnimationCancel(Animator animator) {
        if (1 - this.A02 != 0) {
            super.onAnimationCancel(animator);
            return;
        }
        super.onAnimationCancel(animator);
        this.A01 = true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000e, code lost:
        if (r3.A01 == false) goto L_0x0010;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onAnimationEnd(android.animation.Animator r4) {
        /*
            r3 = this;
            int r0 = r3.A02
            switch(r0) {
                case 0: goto L_0x004b;
                case 1: goto L_0x0016;
                case 2: goto L_0x002a;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r3.A00
            com.whatsapp.privacy.usernotice.UserNoticeBottomSheetDialogFragment r0 = (com.whatsapp.privacy.usernotice.UserNoticeBottomSheetDialogFragment) r0
            android.view.View r1 = r0.A03
            boolean r2 = r3.A01
            r0 = 0
            if (r2 != 0) goto L_0x0012
        L_0x0010:
            r0 = 8
        L_0x0012:
            r1.setVisibility(r0)
        L_0x0015:
            return
        L_0x0016:
            super.onAnimationEnd(r4)
            java.lang.Object r1 = r3.A00
            com.whatsapp.calling.callgrid.view.FocusViewContainer r1 = (com.whatsapp.calling.callgrid.view.FocusViewContainer) r1
            r0 = 0
            r1.A0A = r0
            r0 = 1065353216(0x3f800000, float:1.0)
            r1.setAlpha(r0)
            boolean r0 = r3.A01
            if (r0 != 0) goto L_0x0015
            goto L_0x0010
        L_0x002a:
            r0 = 0
            X.C162457s7.A0J(r4, r0)
            super.onAnimationEnd(r4)
            boolean r0 = r3.A01
            if (r0 != 0) goto L_0x003c
            java.lang.Object r0 = r3.A00
            X.4Ql r0 = (X.AnonymousClass4Ql) r0
            r0.setVisibilityInternal(false)
        L_0x003c:
            java.lang.Object r0 = r3.A00
            X.4Ql r0 = (X.AnonymousClass4Ql) r0
            r0.requestLayout()
            java.lang.Runnable r0 = r0.A06
            if (r0 == 0) goto L_0x0015
            r0.run()
            return
        L_0x004b:
            java.lang.Object r1 = r3.A00
            X.7oJ r1 = (X.C160787oJ) r1
            r0 = 0
            r1.A04 = r0
            r0 = 0
            r1.A07 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C188648zG.onAnimationEnd(android.animation.Animator):void");
    }

    public void onAnimationStart(Animator animator) {
        switch (this.A02) {
            case 0:
                C160787oJ r3 = (C160787oJ) this.A00;
                r3.A0L.A01(0, this.A01);
                r3.A04 = 2;
                r3.A07 = animator;
                return;
            case 3:
                ((UserNoticeBottomSheetDialogFragment) this.A00).A03.setVisibility(0);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public C188648zG(FocusViewContainer focusViewContainer) {
        this.A02 = 1;
        this.A00 = focusViewContainer;
    }
}
