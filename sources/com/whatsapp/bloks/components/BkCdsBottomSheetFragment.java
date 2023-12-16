package com.whatsapp.bloks.components;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass00P;
import X.AnonymousClass03C;
import X.AnonymousClass03D;
import X.AnonymousClass0GI;
import X.AnonymousClass0Ki;
import X.AnonymousClass0Kj;
import X.AnonymousClass0Og;
import X.AnonymousClass0Oh;
import X.C04190Ne;
import X.C04670Qe;
import X.C09630gV;
import X.C142316x0;
import X.C142906xz;
import X.C153427bI;
import X.C154157ch;
import X.C161887qm;
import X.C162477s9;
import X.C165857xk;
import X.C17370vQ;
import X.C181528mu;
import X.C47382dA;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.DialogFragment;
import com.facebook.common.util.redex.OriginalClassName;
import java.util.Deque;

public class BkCdsBottomSheetFragment extends DialogFragment implements C17370vQ {
    public C09630gV A00;
    public C161887qm A01;
    public C47382dA A02;

    public static void A01(Activity activity, int i) {
        if (Build.VERSION.SDK_INT != 26 || activity.getApplicationInfo().targetSdkVersion <= 26 || (!A02(activity, 16842840) && !A02(activity, 16842839) && !A02(activity, 16843763))) {
            try {
                activity.setRequestedOrientation(i);
            } catch (IllegalStateException e) {
                if ("Only fullscreen activities can request orientation".equals(e.getMessage())) {
                    Object[] A0L = AnonymousClass002.A0L();
                    A0L[0] = OriginalClassName.getClassSimpleName(activity);
                    C162477s9.A0D("FixedOrientationCompat", "%s hit fixed orientation exception", e, A0L);
                    return;
                }
                throw e;
            }
        }
    }

    public static boolean A02(Activity activity, int i) {
        TypedValue typedValue = new TypedValue();
        activity.getTheme().resolveAttribute(i, typedValue, true);
        if (typedValue.type != 18 || typedValue.data == 0) {
            return false;
        }
        return true;
    }

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C09630gV A1R = A1R();
        Context A0G = A0G();
        C161887qm r14 = this.A01;
        AnonymousClass0Ki r5 = new AnonymousClass0Ki(A1R);
        AnonymousClass0Kj r11 = new AnonymousClass0Kj(A1R);
        C142316x0 r7 = C142316x0.HARMONIZATION_F;
        C153427bI r6 = r14.A03;
        A1R.A04 = new AnonymousClass0Oh(A0G, r5, r6, r7, r14.A0D);
        A1R.A03 = new AnonymousClass0Og(A0G, r5, r11, r6, r7);
        A1R.A06 = r14.A08;
        Activity A002 = C154157ch.A00(A0G);
        if (A002 != null) {
            A1R.A07 = Integer.valueOf(A002.getRequestedOrientation());
            A01(A002, 1);
        }
        AnonymousClass03C r12 = new AnonymousClass03C(A0G, A1R.A06);
        A1R.A01 = r12;
        r12.A01.A00 = A1R;
        A1R.A02 = new AnonymousClass03D(A0G, r12, r6, r14, r7);
        C04190Ne r1 = (C04190Ne) A1R.A0A.peek();
        if (r1 != null) {
            C04670Qe r52 = r1.A03;
            if (r1.A00 == null) {
                View A012 = r52.A01(A0G);
                r1.A00 = A012;
                A1R.A01.A01.A02(A012, AnonymousClass0GI.DEFAULT, false);
                View A003 = r52.A00();
                AnonymousClass03C r0 = A1R.A01;
                if (r0 != null) {
                    ViewGroup viewGroup2 = r0.A00;
                    viewGroup2.removeAllViews();
                    viewGroup2.addView(A003);
                }
            } else {
                throw AnonymousClass001.A0e("NavStack entry should have no view associated at Fragment's view creation");
            }
        }
        return A1R.A02;
    }

    public void A0q(Bundle bundle) {
        C161887qm r0 = this.A01;
        if (r0 != null) {
            bundle.putBundle("open_screen_config", r0.A04());
        }
        super.A0q(bundle);
    }

    public final C09630gV A1R() {
        C09630gV r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        throw AnonymousClass001.A0e("Must initialize bottom sheet delegate!");
    }

    public static BkCdsBottomSheetFragment A00(C161887qm r3, String str) {
        Bundle A08 = AnonymousClass002.A08();
        A08.putString("request_data", str);
        A08.putBundle("open_screen_config", r3.A04());
        BkCdsBottomSheetFragment bkCdsBottomSheetFragment = new BkCdsBottomSheetFragment();
        bkCdsBottomSheetFragment.A0u(A08);
        return bkCdsBottomSheetFragment;
    }

    public void A0a() {
        Activity A002;
        super.A0a();
        C09630gV r4 = this.A00;
        if (r4 != null) {
            Context A0G = A0G();
            Deque<C04190Ne> deque = r4.A0A;
            for (C04190Ne r0 : deque) {
                r0.A03.A02();
            }
            deque.clear();
            if (r4.A07 != null && (A002 = C154157ch.A00(A0G)) != null) {
                A01(A002, r4.A07.intValue());
                r4.A07 = null;
            }
        }
    }

    public void A0c() {
        super.A0c();
        C09630gV r5 = this.A00;
        if (r5 != null) {
            AnonymousClass03C r0 = r5.A01;
            if (r0 != null) {
                r0.A00.removeAllViews();
            }
            Deque<C04190Ne> deque = r5.A0A;
            for (C04190Ne r1 : deque) {
                if (r1.A00 != null) {
                    if (r1 == deque.peek()) {
                        r1.A03.A05();
                    }
                    r1.A03.A03();
                    r1.A00 = null;
                }
            }
            AnonymousClass0Oh r02 = r5.A04;
            if (r02 != null) {
                r02.A00 = null;
                r5.A04 = null;
            }
            AnonymousClass0Og r03 = r5.A03;
            if (r03 != null) {
                r03.A00 = null;
                r5.A03 = null;
            }
        }
    }

    public void A0d() {
        super.A0d();
        C09630gV r2 = this.A00;
        if (r2 != null) {
            C165857xk r0 = this.A01.A00;
            if (r0 != null) {
                r0.A00.BkI(r2.A00);
            }
            Runnable runnable = r2.A08;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public void A0p(Bundle bundle) {
        Bundle bundle2;
        super.A0p(bundle);
        if (bundle != null) {
            A1K();
        }
        Bundle A0H = A0H();
        if (bundle == null) {
            bundle2 = A0H.getBundle("open_screen_config");
        } else {
            bundle2 = bundle.getBundle("open_screen_config");
        }
        this.A01 = C161887qm.A01(bundle2);
        this.A00 = new C09630gV();
    }

    /* JADX WARNING: Removed duplicated region for block: B:51:0x00fd A[LOOP:0: B:51:0x00fd->B:54:0x0107, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.app.Dialog A1J(android.os.Bundle r14) {
        /*
            r13 = this;
            X.0gV r7 = r13.A1R()
            android.content.Context r6 = r13.A0G()
            X.7qm r5 = r13.A01
            X.6xz r1 = r5.A08
            r7.A06 = r1
            X.6xz r0 = X.C142906xz.FULL_SCREEN
            if (r1 == r0) goto L_0x0194
            r7.A06 = r1
            if (r1 == r0) goto L_0x018d
            X.00P r4 = new X.00P
            r4.<init>(r6)
            X.6xx r1 = r5.A06
            X.6xx r0 = X.C142886xx.AUTO
            boolean r0 = r1.equals(r0)
            r3 = 0
            r2 = 1
            if (r0 != 0) goto L_0x0032
            X.6xx r0 = X.C142886xx.ENABLED
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0172
            r4.setCanceledOnTouchOutside(r2)
        L_0x0032:
            X.7yR r0 = r5.A05
            if (r0 == 0) goto L_0x0164
            int r10 = r0.A01
            int r9 = r0.A03
            int r8 = r0.A02
            int r1 = r0.A00
            android.widget.FrameLayout r0 = r4.A05
            r0.setPadding(r10, r9, r8, r1)
        L_0x0043:
            X.6xz r1 = r5.A08
            X.6xz r0 = X.C142906xz.FLEXIBLE_SHEET
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0138
            int r0 = r1.ordinal()
            if (r0 == r3) goto L_0x0134
            if (r0 != r2) goto L_0x0186
            r0 = 1061158912(0x3f400000, float:0.75)
        L_0x0057:
            X.0gU r9 = new X.0gU
            r9.<init>(r0)
            r4.A08 = r9
            X.02q r10 = r4.A09
            X.0sm r8 = r4.A07
            r11 = 2
            if (r8 != 0) goto L_0x0127
            X.0sm[] r1 = new X.C16290sm[r11]
            X.0sm r12 = X.AnonymousClass00P.A0H
            r1[r3] = r12
            r1[r2] = r9
        L_0x006d:
            boolean r0 = r4.isShowing()
            r10.A03(r1, r0)
        L_0x0074:
            r4.A07 = r9
            X.0sm r8 = r4.A08
            if (r8 != 0) goto L_0x0112
            if (r9 != 0) goto L_0x010a
            X.0sm[] r1 = new X.C16290sm[r2]
            r1[r3] = r12
        L_0x0080:
            boolean r0 = r4.isShowing()
            r10.A03(r1, r0)
            boolean r0 = r4.A0E
            if (r0 == r3) goto L_0x008d
            r4.A0E = r3
        L_0x008d:
            boolean r0 = r4.A0A
            if (r0 == r2) goto L_0x0098
            r4.A0A = r2
            float r0 = r4.A00
            r4.A02(r0)
        L_0x0098:
            r10.A0B = r2
            boolean r0 = r5.A05()
            if (r0 == 0) goto L_0x00ad
            X.0J8 r1 = new X.0J8
            r1.<init>()
            java.util.List r0 = java.util.Collections.singletonList(r12)
            r10.A08 = r0
            r10.A03 = r1
        L_0x00ad:
            X.7bI r1 = r5.A03
            X.6xc r0 = X.C142696xc.OVERLAY_ON_SURFACE
            int r1 = X.C153867c9.A00(r6, r0, r1)
            int r0 = r4.A02
            if (r0 == r1) goto L_0x00c0
            r4.A02 = r1
            float r0 = r4.A00
            r4.A02(r0)
        L_0x00c0:
            int r0 = android.graphics.Color.alpha(r1)
            float r1 = (float) r0
            r0 = 1132396544(0x437f0000, float:255.0)
            float r1 = r1 / r0
            float r0 = r4.A01
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x00d5
            r4.A01 = r1
            float r0 = r4.A00
            r4.A02(r0)
        L_0x00d5:
            android.view.Window r0 = r4.getWindow()
            if (r0 == 0) goto L_0x00de
            r0.setStatusBarColor(r3)
        L_0x00de:
            r7.A05 = r4
            X.0LP r0 = new X.0LP
            r0.<init>(r6, r7)
            r4.A06 = r0
            android.app.Activity r0 = X.C154157ch.A00(r6)
            if (r0 == 0) goto L_0x017f
            java.util.List r1 = X.C154157ch.A01(r0)
            if (r1 == 0) goto L_0x0109
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0109
            java.util.Iterator r1 = r1.iterator()
        L_0x00fd:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0109
            java.lang.Object r0 = r1.next()
            if (r0 != r13) goto L_0x00fd
        L_0x0109:
            return r4
        L_0x010a:
            X.0sm[] r1 = new X.C16290sm[r11]
            r1[r3] = r12
            r1[r2] = r9
            goto L_0x0080
        L_0x0112:
            if (r9 != 0) goto L_0x011c
            X.0sm[] r1 = new X.C16290sm[r11]
            r1[r3] = r12
            r1[r2] = r8
            goto L_0x0080
        L_0x011c:
            r0 = 3
            X.0sm[] r1 = new X.C16290sm[r0]
            r1[r3] = r12
            r1[r2] = r8
            r1[r11] = r9
            goto L_0x0080
        L_0x0127:
            r0 = 3
            X.0sm[] r1 = new X.C16290sm[r0]
            X.0sm r12 = X.AnonymousClass00P.A0H
            r1[r3] = r12
            r1[r2] = r9
            r1[r11] = r8
            goto L_0x006d
        L_0x0134:
            r0 = 1065353216(0x3f800000, float:1.0)
            goto L_0x0057
        L_0x0138:
            X.0w9 r9 = new X.0w9
            r9.<init>(r3)
            r4.A08 = r9
            X.02q r10 = r4.A09
            X.0sm r8 = r4.A07
            r11 = 2
            if (r8 != 0) goto L_0x0158
            X.0sm[] r1 = new X.C16290sm[r11]
            X.0sm r12 = X.AnonymousClass00P.A0H
            r1[r3] = r12
            r1[r2] = r9
        L_0x014e:
            boolean r0 = r4.isShowing()
            r10.A03(r1, r0)
            r9 = 0
            goto L_0x0074
        L_0x0158:
            r0 = 3
            X.0sm[] r1 = new X.C16290sm[r0]
            X.0sm r12 = X.AnonymousClass00P.A0H
            r1[r3] = r12
            r1[r2] = r9
            r1[r11] = r8
            goto L_0x014e
        L_0x0164:
            r0 = 1082130432(0x40800000, float:4.0)
            float r0 = X.AnonymousClass0J7.A00(r6, r0)
            int r1 = (int) r0
            android.widget.FrameLayout r0 = r4.A05
            r0.setPadding(r1, r1, r1, r1)
            goto L_0x0043
        L_0x0172:
            X.6xx r0 = X.C142886xx.DISABLED
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0032
            r4.setCanceledOnTouchOutside(r3)
            goto L_0x0032
        L_0x017f:
            java.lang.String r0 = "Cannot show a fragment in a null activity"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r0)
            throw r0
        L_0x0186:
            java.lang.String r0 = "Encountered unsupported CDS bottom sheet style."
            java.lang.UnsupportedOperationException r0 = X.AnonymousClass002.A0G(r0)
            throw r0
        L_0x018d:
            java.lang.String r0 = "onCreateDialog() is not supported for CDS full screen."
            java.lang.UnsupportedOperationException r0 = X.AnonymousClass002.A0G(r0)
            throw r0
        L_0x0194:
            java.lang.String r0 = "onFragmentCreateDialog() is not supported for CDS full screen."
            java.lang.UnsupportedOperationException r0 = X.AnonymousClass002.A0G(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.bloks.components.BkCdsBottomSheetFragment.A1J(android.os.Bundle):android.app.Dialog");
    }

    public boolean Azc(String str) {
        for (C04190Ne r0 : A1R().A0A) {
            if (str.equals(r0.A03.A03)) {
                return true;
            }
        }
        return false;
    }

    public void B1u(AnonymousClass0GI r5, Runnable runnable) {
        C09630gV A1R = A1R();
        A1R.A08 = runnable;
        if (A1R.A06 == C142906xz.FULL_SCREEN) {
            A1R.A09 = true;
            A1R.A00 = 1;
            return;
        }
        AnonymousClass00P r0 = A1R.A05;
        if (r0 != null) {
            A1R.A09 = true;
            A1R.A00 = 1;
            r0.dismiss();
        }
    }

    public void BZr(int i) {
        A1R().A01(i);
    }

    public void Bfz(C04670Qe r7, C181528mu r8, int i) {
        A1R().A05(A0G(), r7, AnonymousClass0GI.DEFAULT, r8, i);
    }
}
