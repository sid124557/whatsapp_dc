package X;

import android.view.View;
import android.view.animation.Animation;

/* renamed from: X.67q  reason: invalid class name and case insensitive filesystem */
public class C1232367q extends C167047zg {
    public Object A00;
    public Object A01;
    public final int A02;

    public C1232367q(Object obj, int i, Object obj2) {
        this.A02 = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public static void A00(Animation animation, Object obj, Object obj2, int i) {
        animation.setAnimationListener(new C1232367q(obj, i, obj2));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00dd, code lost:
        r0.A02(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00e0, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0143, code lost:
        r3.BUI();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0146, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onAnimationEnd(android.view.animation.Animation r6) {
        /*
            r5 = this;
            int r0 = r5.A02
            switch(r0) {
                case 0: goto L_0x0147;
                case 1: goto L_0x012c;
                case 2: goto L_0x0114;
                case 3: goto L_0x00fc;
                case 4: goto L_0x00e1;
                case 5: goto L_0x00c8;
                case 6: goto L_0x00b3;
                case 7: goto L_0x0095;
                case 8: goto L_0x0042;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r5.A00
            X.4ao r0 = (X.C88794ao) r0
            X.5ZT r2 = r0.A04
            X.5TQ r0 = r2.A0L
            if (r0 != 0) goto L_0x0094
            java.lang.Object r1 = r5.A01
            android.view.View r1 = (android.view.View) r1
            r0 = 0
            r1.setVisibility(r0)
            X.4xf r1 = r2.A1E
            java.lang.String r0 = "voicenote/voicenotecancelled"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            java.util.Iterator r2 = X.C61102zi.A03(r1)
        L_0x0022:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0094
            java.lang.Object r1 = r2.next()
            X.5UH r1 = (X.AnonymousClass5UH) r1
            boolean r0 = r1 instanceof X.AnonymousClass56C
            if (r0 == 0) goto L_0x0022
            X.56C r1 = (X.AnonymousClass56C) r1
            X.5l7 r1 = r1.A00
            X.0R2 r0 = r1.A0q
            if (r0 == 0) goto L_0x0022
            android.view.View r1 = r1.A0D
            r0 = 8
            r1.setVisibility(r0)
            goto L_0x0022
        L_0x0042:
            java.lang.Object r0 = r5.A01
            android.view.View r0 = (android.view.View) r0
            r0.clearAnimation()
            java.lang.Object r1 = r5.A00
            X.5ZT r1 = (X.AnonymousClass5ZT) r1
            android.view.View r4 = r1.A0V
            r0 = 1
            r4.setFocusable(r0)
            r4.setFocusableInTouchMode(r0)
            r4.requestFocus()
            X.4xf r1 = r1.A1E
            java.lang.String r0 = "voicenote/voicenotepreviewcancelled"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.util.Iterator r3 = X.C61102zi.A03(r1)
        L_0x0064:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0091
            java.lang.Object r1 = r3.next()
            X.5UH r1 = (X.AnonymousClass5UH) r1
            boolean r0 = r1 instanceof X.AnonymousClass56C
            if (r0 == 0) goto L_0x0064
            X.56C r1 = (X.AnonymousClass56C) r1
            X.5l7 r2 = r1.A00
            X.0R2 r0 = r2.A0q
            r1 = 8
            if (r0 == 0) goto L_0x0083
            android.view.View r0 = r2.A0D
            r0.setVisibility(r1)
        L_0x0083:
            android.view.ViewGroup r0 = r2.A0X
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x0064
            android.view.ViewGroup r0 = r2.A0X
            r0.setVisibility(r1)
            goto L_0x0064
        L_0x0091:
            r4.requestFocus()
        L_0x0094:
            return
        L_0x0095:
            java.lang.Object r1 = r5.A01
            com.whatsapp.newsletter.NewsletterInfoMembersSearchFragment r1 = (com.whatsapp.newsletter.NewsletterInfoMembersSearchFragment) r1
            java.lang.Object r2 = r5.A00
            androidx.appcompat.widget.SearchView r2 = (androidx.appcompat.widget.SearchView) r2
            boolean r0 = r1.A08
            if (r0 == 0) goto L_0x00a8
            r0 = 0
            r2.A09()
            r1.A08 = r0
            return
        L_0x00a8:
            X.5Wv r0 = r1.A07
            if (r0 != 0) goto L_0x00dd
            java.lang.String r0 = "imeUtils"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x00b3:
            java.lang.Object r0 = r5.A00
            X.5RG r0 = (X.AnonymousClass5RG) r0
            android.widget.ImageView r1 = r0.A07
            java.lang.Object r0 = r5.A01
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            r1.setImageBitmap(r0)
            android.view.animation.AlphaAnimation r0 = X.C86604Kt.A0H()
            X.C86644Kx.A13(r1, r0)
            return
        L_0x00c8:
            java.lang.Object r1 = r5.A00
            com.whatsapp.group.GroupParticipantsSearchFragment r1 = (com.whatsapp.group.GroupParticipantsSearchFragment) r1
            java.lang.Object r2 = r5.A01
            androidx.appcompat.widget.SearchView r2 = (androidx.appcompat.widget.SearchView) r2
            boolean r0 = r1.A0A
            if (r0 == 0) goto L_0x00db
            r0 = 0
            r2.A09()
            r1.A0A = r0
            return
        L_0x00db:
            X.5Wv r0 = r1.A08
        L_0x00dd:
            r0.A02(r2)
            return
        L_0x00e1:
            java.lang.Object r2 = r5.A00
            android.view.View r2 = (android.view.View) r2
            android.view.ViewGroup$LayoutParams r1 = r2.getLayoutParams()
            r0 = -2
            r1.width = r0
            r2.requestLayout()
            android.view.ViewTreeObserver r1 = r2.getViewTreeObserver()
            r0 = 16
            X.AnonymousClass6BG.A00(r1, r5, r0)
            r2.clearAnimation()
            return
        L_0x00fc:
            java.lang.Object r2 = r5.A01
            X.4mE r2 = (X.C92184mE) r2
            java.lang.Object r3 = r5.A00
            X.64z r3 = (X.C1225964z) r3
            android.view.View r0 = r2.A01
            X.C18270x1.A0p(r0)
            android.view.ViewGroup r1 = r2.A03
            android.view.View r0 = r2.A01
            r1.removeView(r0)
            r0 = 0
            r2.A01 = r0
            goto L_0x0143
        L_0x0114:
            java.lang.Object r2 = r5.A00
            X.4mH r2 = (X.C92214mH) r2
            java.lang.Object r3 = r5.A01
            X.64z r3 = (X.C1225964z) r3
            android.view.View r0 = r2.A01
            X.C86644Kx.A0w(r0)
            android.view.ViewGroup r1 = r2.A04
            android.view.View r0 = r2.A01
            r1.removeView(r0)
            r0 = 0
            r2.A01 = r0
            goto L_0x0143
        L_0x012c:
            java.lang.Object r2 = r5.A00
            X.4mI r2 = (X.C92224mI) r2
            java.lang.Object r3 = r5.A01
            X.64z r3 = (X.C1225964z) r3
            android.view.View r0 = r2.A00
            X.C86644Kx.A0w(r0)
            android.view.ViewGroup r1 = r2.A04
            android.view.View r0 = r2.A00
            r1.removeView(r0)
            r0 = 0
            r2.A00 = r0
        L_0x0143:
            r3.BUI()
            return
        L_0x0147:
            java.lang.Object r0 = r5.A01
            X.5ZS r0 = (X.AnonymousClass5ZS) r0
            r0.A05()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1232367q.onAnimationEnd(android.view.animation.Animation):void");
    }

    public void onAnimationStart(Animation animation) {
        if (8 - this.A02 != 0) {
            super.onAnimationStart(animation);
        } else {
            ((View) this.A01).setVisibility(0);
        }
    }
}
