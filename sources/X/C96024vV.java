package X;

import android.content.Intent;
import android.os.Bundle;
import android.transition.ChangeBounds;
import android.transition.ChangeImageTransform;
import android.transition.ChangeTransform;
import android.transition.Fade;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.LinearInterpolator;
import com.whatsapp.R;
import com.whatsapp.mediaview.MediaViewBaseFragment;
import com.whatsapp.mediaview.PhotoView;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.4vV  reason: invalid class name and case insensitive filesystem */
public class C96024vV extends C107275b2 {
    public final AnonymousClass5MG A00;
    public final MediaViewBaseFragment A01;

    public void A0B() {
    }

    public void A0C(Bundle bundle) {
        PhotoView A1I;
        String str;
        MediaViewBaseFragment mediaViewBaseFragment = this.A01;
        Object A1M = mediaViewBaseFragment.A1M(mediaViewBaseFragment.A09.getCurrentItem());
        if (A1M != null) {
            C86654Ky.A0J(mediaViewBaseFragment).setSharedElementsUseOverlay(true);
            int childCount = mediaViewBaseFragment.A09.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = mediaViewBaseFragment.A09.getChildAt(i);
                if (childAt instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) childAt;
                    if (viewGroup.getChildCount() > 0 && (A1I = mediaViewBaseFragment.A1I(viewGroup)) != null) {
                        if (C86664Kz.A1U(viewGroup, A1M)) {
                            str = C107315b6.A05(A1M);
                        } else {
                            str = null;
                        }
                        AnonymousClass0YZ.A0F(A1I, str);
                    }
                }
            }
            if (mediaViewBaseFragment.A1L() != null && !A1M.equals(mediaViewBaseFragment.A1L())) {
                mediaViewBaseFragment.A0R().A5b(new AnonymousClass67Z(bundle, 1, this));
            }
            if (mediaViewBaseFragment.A1X()) {
                AnonymousClass0X0.A00(mediaViewBaseFragment.A0R());
                return;
            }
        }
        mediaViewBaseFragment.A1O();
    }

    public void A0D(Bundle bundle, C182718os r13) {
        MediaViewBaseFragment mediaViewBaseFragment = this.A01;
        C86654Ky.A0J(mediaViewBaseFragment).setSharedElementsUseOverlay(false);
        mediaViewBaseFragment.A02.setVisibility(4);
        mediaViewBaseFragment.A1V(false, 0);
        mediaViewBaseFragment.A03.setVisibility(0);
        mediaViewBaseFragment.A0J = false;
        View A0Q = AnonymousClass001.A0Q(mediaViewBaseFragment.A0R());
        AnonymousClass6AE.A00(A0Q.getViewTreeObserver(), A0Q, 5);
        LinearInterpolator linearInterpolator = new LinearInterpolator();
        AnonymousClass5MG r5 = this.A00;
        ChangeBounds changeBounds = new ChangeBounds();
        changeBounds.setInterpolator(linearInterpolator);
        changeBounds.excludeTarget(r5.A03(R.string.f11nameremoved), true);
        changeBounds.excludeTarget(r5.A03(R.string.f11nameremoved), true);
        ChangeTransform changeTransform = new ChangeTransform();
        changeTransform.setInterpolator(linearInterpolator);
        ChangeImageTransform changeImageTransform = new ChangeImageTransform();
        changeImageTransform.setInterpolator(linearInterpolator);
        AnonymousClass4N7 r2 = new AnonymousClass4N7(mediaViewBaseFragment.A0G(), r5, true);
        r2.setInterpolator(linearInterpolator);
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.setInterpolator(linearInterpolator);
        transitionSet.setDuration(220);
        transitionSet.addTransition(changeBounds);
        transitionSet.addTransition(changeTransform);
        transitionSet.addTransition(changeImageTransform);
        transitionSet.addTransition(r2);
        AnonymousClass4N7 r22 = new AnonymousClass4N7(mediaViewBaseFragment.A0G(), r5, false);
        r22.setInterpolator(linearInterpolator);
        TransitionSet transitionSet2 = new TransitionSet();
        transitionSet2.setInterpolator(linearInterpolator);
        transitionSet2.setDuration(220);
        transitionSet2.addTransition(changeBounds);
        transitionSet2.addTransition(changeTransform);
        transitionSet2.addTransition(changeImageTransform);
        transitionSet2.addTransition(r22);
        Fade fade = new Fade();
        C86634Kw.A19(fade);
        fade.excludeTarget(R.id.insets_view, true);
        Fade fade2 = new Fade();
        C86634Kw.A19(fade2);
        fade2.excludeTarget(R.id.insets_view, true);
        if (mediaViewBaseFragment.A1X()) {
            C003203q A0R = mediaViewBaseFragment.A0R();
            Window window = A0R.getWindow();
            A0R.A5U();
            window.setSharedElementEnterTransition(transitionSet);
            window.setSharedElementReturnTransition(transitionSet2);
            window.setEnterTransition(fade);
            window.setReturnTransition(fade2);
            transitionSet.addListener(new C1232867v(mediaViewBaseFragment, 0, r13));
            transitionSet2.addListener(new C189018zr(r13, 1));
            return;
        }
        mediaViewBaseFragment.A0M().A0A = transitionSet;
        mediaViewBaseFragment.A0M().A0B = transitionSet2;
        mediaViewBaseFragment.A0M().A07 = fade;
        mediaViewBaseFragment.A0M().A09 = fade2;
        fade.addListener(new C1232867v(mediaViewBaseFragment, 0, r13));
        fade2.addListener(new C189018zr(r13, 1));
    }

    public C96024vV(AnonymousClass5MG r1, MediaViewBaseFragment mediaViewBaseFragment) {
        this.A00 = r1;
        this.A01 = mediaViewBaseFragment;
    }

    public static C08240dc A00(View view, C009707r r3, C08270df r4, AnonymousClass5MG r5, String str) {
        Object obj;
        ArrayList A012 = A01(view, r3, r5, str);
        C08240dc r52 = new C08240dc(r4);
        Iterator it = A012.iterator();
        while (it.hasNext()) {
            AnonymousClass0PJ r1 = (AnonymousClass0PJ) it.next();
            Object obj2 = r1.A00;
            if (!(obj2 == null || (obj = r1.A01) == null)) {
                String str2 = (String) obj;
                String A06 = AnonymousClass0YZ.A06((View) obj2);
                if (A06 != null) {
                    if (r52.A0C == null) {
                        r52.A0C = AnonymousClass001.A0s();
                        r52.A0D = AnonymousClass001.A0s();
                    } else if (r52.A0D.contains(str2)) {
                        throw AnonymousClass001.A0c(AnonymousClass000.A0U("A shared element with the target name '", str2, "' has already been added to the transaction.", AnonymousClass001.A0o()));
                    } else if (r52.A0C.contains(A06)) {
                        throw AnonymousClass001.A0c(AnonymousClass000.A0U("A shared element with the source name '", A06, "' has already been added to the transaction.", AnonymousClass001.A0o()));
                    }
                    r52.A0C.add(A06);
                    r52.A0D.add(str2);
                } else {
                    throw AnonymousClass001.A0c("Unique transitionNames are required for all sharedElements");
                }
            }
        }
        return r52;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0084, code lost:
        if (r2 == 0) goto L_0x0086;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x008a, code lost:
        if (r6 != r10.getHeight()) goto L_0x008c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x008c, code lost:
        X.C04910Rd.A01(r10, new android.graphics.Rect(0, r2, r10.getWidth(), r6));
        r10.postDelayed(new X.C70013Zn(r10, 16), (long) r11.getResources().getInteger(17694721));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00ae, code lost:
        r3.addAll(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00b1, code lost:
        return r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.ArrayList A01(android.view.View r10, X.C009707r r11, X.AnonymousClass5MG r12, java.lang.String r13) {
        /*
            java.util.ArrayList r3 = X.AnonymousClass001.A0s()
            X.AnonymousClass0YZ.A0F(r10, r13)
            java.lang.String r0 = r10.getTransitionName()
            X.AnonymousClass0x2.A1G(r10, r0, r3)
            r0 = 16908335(0x102002f, float:2.387736E-38)
            android.view.View r1 = r11.findViewById(r0)
            if (r1 == 0) goto L_0x001f
            java.lang.String r0 = "statusBar"
            X.AnonymousClass0YZ.A0F(r1, r0)
            X.AnonymousClass0x2.A1G(r1, r0, r3)
        L_0x001f:
            java.util.ArrayList r4 = X.AnonymousClass001.A0s()
            int r6 = r10.getHeight()
            r8 = 2
            int[] r7 = new int[r8]
            r10.getLocationOnScreen(r7)
            r0 = 2131434437(0x7f0b1bc5, float:1.8490688E38)
            android.view.View r5 = r11.findViewById(r0)
            r9 = 1
            if (r5 == 0) goto L_0x0061
            r0 = 2131896403(0x7f122853, float:1.9427666E38)
            java.lang.String r0 = r12.A03(r0)
            X.AnonymousClass0YZ.A0F(r5, r0)
            X.AnonymousClass0x2.A1G(r5, r0, r4)
            int[] r2 = new int[r8]
            r5.getLocationOnScreen(r2)
            int r1 = X.C86634Kw.A09(r10, r7)
            int r0 = X.C86634Kw.A09(r5, r2)
            if (r1 <= r0) goto L_0x0061
            int r1 = X.C86634Kw.A09(r10, r7)
            int r0 = X.C86634Kw.A09(r5, r2)
            int r1 = r1 - r0
            int r6 = r10.getHeight()
            int r6 = r6 - r1
        L_0x0061:
            r0 = 2131434438(0x7f0b1bc6, float:1.849069E38)
            android.view.View r2 = r11.findViewById(r0)
            r5 = 0
            if (r2 == 0) goto L_0x00b2
            r0 = 2131896404(0x7f122854, float:1.9427668E38)
            java.lang.String r0 = r12.A03(r0)
            X.AnonymousClass0YZ.A0F(r2, r0)
            X.AnonymousClass0x2.A1G(r2, r0, r4)
            int[] r1 = new int[r8]
            r2.getLocationOnScreen(r1)
            r0 = r7[r9]
            r2 = r1[r9]
            if (r0 >= r2) goto L_0x00b2
            int r2 = r2 - r0
            if (r2 != 0) goto L_0x008c
        L_0x0086:
            int r0 = r10.getHeight()
            if (r6 == r0) goto L_0x00ae
        L_0x008c:
            int r1 = r10.getWidth()
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>(r5, r2, r1, r6)
            X.C04910Rd.A01(r10, r0)
            r0 = 16
            X.3Zn r2 = new X.3Zn
            r2.<init>(r10, r0)
            android.content.res.Resources r1 = r11.getResources()
            r0 = 17694721(0x10e0001, float:2.6081284E-38)
            int r0 = r1.getInteger(r0)
            long r0 = (long) r0
            r10.postDelayed(r2, r0)
        L_0x00ae:
            r3.addAll(r4)
            return r3
        L_0x00b2:
            r2 = 0
            goto L_0x0086
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C96024vV.A01(android.view.View, X.07r, X.5MG, java.lang.String):java.util.ArrayList");
    }

    public static void A02(Intent intent, View view, C009707r r4, AnonymousClass5MG r5, String str) {
        C18260x0.A1P(AnonymousClass001.A0o(), "mediaviewtransitionhelper/start/", view);
        C05880Vi A012 = C05880Vi.A01(r4, (AnonymousClass0PJ[]) A01(view, r4, r5, str).toArray(new AnonymousClass0PJ[0]));
        r4.setExitSharedElementCallback(new AnonymousClass4LH(r4));
        AnonymousClass0RN.A00(r4, intent, A012.A02());
    }
}
