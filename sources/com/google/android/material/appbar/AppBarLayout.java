package com.google.android.material.appbar;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass0VX;
import X.AnonymousClass0WH;
import X.AnonymousClass0XY;
import X.AnonymousClass0YY;
import X.AnonymousClass0x9;
import X.AnonymousClass6C9;
import X.AnonymousClass6D7;
import X.AnonymousClass6GY;
import X.AnonymousClass75I;
import X.AnonymousClass806;
import X.AnonymousClass807;
import X.C05630Ug;
import X.C06220Ws;
import X.C06360Xi;
import X.C06560Yg;
import X.C06830Zj;
import X.C125086Fc;
import X.C1463179t;
import X.C14970qZ;
import X.C154957e2;
import X.C15720rp;
import X.C159917mg;
import X.C160927og;
import X.C181178mK;
import X.C18280x3;
import X.C187868xw;
import X.C188778zT;
import X.C86664Kz;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.whatsapp.R;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.List;

public class AppBarLayout extends LinearLayout implements C15720rp {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public ValueAnimator.AnimatorUpdateListener A06;
    public ValueAnimator A07;
    public Drawable A08;
    public AnonymousClass0XY A09;
    public Behavior A0A;
    public WeakReference A0B;
    public List A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public int[] A0I;
    public final float A0J;
    public final long A0K;
    public final TimeInterpolator A0L;
    public final ColorStateList A0M;
    public final List A0N;

    public class BaseBehavior extends HeaderBehavior {
        public int A00;
        public int A01;
        public ValueAnimator A02;
        public AnonymousClass6GY A03;
        public WeakReference A04;
        public boolean A05;

        public /* bridge */ /* synthetic */ void A0B(View view, View view2, CoordinatorLayout coordinatorLayout, int[] iArr, int i, int i2, int i3) {
            A0O(view2, coordinatorLayout, (AppBarLayout) view, iArr, i2);
        }

        public /* bridge */ /* synthetic */ void A0C(View view, View view2, CoordinatorLayout coordinatorLayout, int[] iArr, int i, int i2, int i3, int i4, int i5) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            CoordinatorLayout coordinatorLayout2 = coordinatorLayout;
            if (i4 < 0) {
                iArr[1] = A0L(appBarLayout, coordinatorLayout2, A0K() - i4, -appBarLayout.getDownNestedScrollRange(), 0);
            } else if (i4 == 0) {
                A0Q(coordinatorLayout, appBarLayout);
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:10:0x0029  */
        /* JADX WARNING: Removed duplicated region for block: B:13:0x0032  */
        /* JADX WARNING: Removed duplicated region for block: B:16:0x0037  */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x0044  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x004e  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x005c  */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x006b  */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x006d  */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x006f  */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x0072  */
        /* JADX WARNING: Removed duplicated region for block: B:36:0x0076  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* bridge */ /* synthetic */ boolean A0I(android.view.View r11, androidx.coordinatorlayout.widget.CoordinatorLayout r12, int r13) {
            /*
                r10 = this;
                r6 = r11
                com.google.android.material.appbar.AppBarLayout r6 = (com.google.android.material.appbar.AppBarLayout) r6
                r4 = r10
                r5 = r12
                boolean r3 = super.A0I(r6, r12, r13)
                int r2 = r6.A04
                X.6GY r1 = r10.A03
                r8 = 0
                if (r1 == 0) goto L_0x00a8
                r0 = r2 & 8
                if (r0 != 0) goto L_0x00a8
                boolean r0 = r1.A04
                if (r0 == 0) goto L_0x0078
                int r0 = r6.getTotalScrollRange()
                int r0 = -r0
            L_0x001d:
                r10.A0M(r6, r12, r0)
            L_0x0020:
                r6.A04 = r8
                r0 = 0
                r10.A03 = r0
                X.7TO r0 = r10.A01
                if (r0 == 0) goto L_0x0076
                int r2 = r0.A02
            L_0x002b:
                int r0 = r6.getTotalScrollRange()
                int r0 = -r0
                if (r2 >= r0) goto L_0x0072
                r2 = r0
            L_0x0033:
                X.7TO r1 = r10.A01
                if (r1 == 0) goto L_0x006f
                int r0 = r1.A02
                if (r0 == r2) goto L_0x0040
                r1.A02 = r2
                r1.A00()
            L_0x0040:
                X.7TO r0 = r10.A01
                if (r0 == 0) goto L_0x006d
                int r7 = r0.A02
            L_0x0046:
                r9 = 1
                r4.A0S(r5, r6, r7, r8, r9)
                X.7TO r0 = r10.A01
                if (r0 == 0) goto L_0x006b
                int r0 = r0.A02
            L_0x0050:
                r6.A01(r0)
                r10.A0Q(r12, r6)
                android.view.View r2 = A00(r12)
                if (r2 == 0) goto L_0x006a
                int r1 = android.os.Build.VERSION.SDK_INT
                r0 = 28
                if (r1 < r0) goto L_0x00d0
                X.7zW r0 = new X.7zW
                r0.<init>(r2, r10, r6)
                r2.addOnUnhandledKeyEventListener(r0)
            L_0x006a:
                return r3
            L_0x006b:
                r0 = 0
                goto L_0x0050
            L_0x006d:
                r7 = 0
                goto L_0x0046
            L_0x006f:
                r10.A00 = r2
                goto L_0x0040
            L_0x0072:
                if (r2 <= r8) goto L_0x0033
                r2 = 0
                goto L_0x0033
            L_0x0076:
                r2 = 0
                goto L_0x002b
            L_0x0078:
                boolean r0 = r1.A03
                if (r0 != 0) goto L_0x00cb
                int r0 = r1.A01
                android.view.View r1 = r6.getChildAt(r0)
                int r0 = r1.getBottom()
                int r2 = -r0
                X.6GY r0 = r10.A03
                boolean r0 = r0.A02
                if (r0 == 0) goto L_0x009b
                int r1 = X.AnonymousClass0YY.A01(r1)
                int r0 = r6.getTopInset()
                int r1 = r1 + r0
            L_0x0096:
                int r2 = r2 + r1
                r10.A0M(r6, r12, r2)
                goto L_0x0020
            L_0x009b:
                float r1 = X.C86664Kz.A02(r1)
                X.6GY r0 = r10.A03
                float r0 = r0.A00
                int r1 = X.AnonymousClass001.A07(r1, r0)
                goto L_0x0096
            L_0x00a8:
                if (r2 == 0) goto L_0x0020
                r0 = r2 & 4
                boolean r1 = X.AnonymousClass000.A1S(r0)
                r0 = r2 & 2
                if (r0 == 0) goto L_0x00c0
                int r0 = r6.getTotalScrollRange()
                int r0 = -r0
                if (r1 == 0) goto L_0x001d
                r10.A0R(r12, r6, r0)
                goto L_0x0020
            L_0x00c0:
                r0 = r2 & 1
                if (r0 == 0) goto L_0x0020
                if (r1 == 0) goto L_0x00cb
                r10.A0R(r12, r6, r8)
                goto L_0x0020
            L_0x00cb:
                r10.A0M(r6, r12, r8)
                goto L_0x0020
            L_0x00d0:
                X.7zO r0 = new X.7zO
                r0.<init>(r2, r10, r6)
                r2.setOnKeyListener(r0)
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.A0I(android.view.View, androidx.coordinatorlayout.widget.CoordinatorLayout, int):boolean");
        }

        public /* bridge */ /* synthetic */ boolean A0J(View view, CoordinatorLayout coordinatorLayout, int i, int i2, int i3, int i4) {
            if (AnonymousClass001.A0T(view).height != -2) {
                return false;
            }
            coordinatorLayout.A0C(view, i, i2, View.MeasureSpec.makeMeasureSpec(0, 0));
            return true;
        }

        public void A0O(View view, CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int[] iArr, int i) {
            int i2;
            AppBarLayout appBarLayout2 = appBarLayout;
            if (i != 0) {
                int i3 = -appBarLayout.getTotalScrollRange();
                if (i < 0) {
                    i2 = appBarLayout.getDownNestedPreScrollRange() + i3;
                } else {
                    i2 = 0;
                }
                if (i3 != i2) {
                    iArr[1] = A0L(appBarLayout2, coordinatorLayout, A0K() - i, i3, i2);
                }
            }
            if (appBarLayout.A0E) {
                appBarLayout.A04(appBarLayout.A03(view));
            }
        }

        public final void A0R(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i) {
            int A022;
            int A0A = AnonymousClass001.A0A(A0K(), i);
            float abs = Math.abs(0.0f);
            float f = (float) A0A;
            if (abs > 0.0f) {
                A022 = AnonymousClass001.A07(f / abs, 1000.0f) * 3;
            } else {
                A022 = (int) (((f / C86664Kz.A02(appBarLayout)) + 1.0f) * 150.0f);
            }
            int A0K = A0K();
            ValueAnimator valueAnimator = this.A02;
            if (A0K != i) {
                if (valueAnimator == null) {
                    ValueAnimator valueAnimator2 = new ValueAnimator();
                    this.A02 = valueAnimator2;
                    valueAnimator2.setInterpolator(C159917mg.A00);
                    this.A02.addUpdateListener(new AnonymousClass75I(appBarLayout, coordinatorLayout, this, 0));
                } else {
                    valueAnimator.cancel();
                }
                this.A02.setDuration((long) Math.min(A022, 600));
                ValueAnimator valueAnimator3 = this.A02;
                int[] A1Z = C86664Kz.A1Z();
                A1Z[0] = A0K;
                A1Z[1] = i;
                valueAnimator3.setIntValues(A1Z);
                this.A02.start();
            } else if (valueAnimator != null && valueAnimator.isRunning()) {
                this.A02.cancel();
            }
        }

        public /* bridge */ /* synthetic */ Parcelable A07(View view, CoordinatorLayout coordinatorLayout) {
            AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
            AnonymousClass6GY A0N = A0N(absSavedState, (AppBarLayout) view);
            if (A0N != null) {
                return A0N;
            }
            return absSavedState;
        }

        public /* bridge */ /* synthetic */ void A09(Parcelable parcelable, View view, CoordinatorLayout coordinatorLayout) {
            if (parcelable instanceof AnonymousClass6GY) {
                this.A03 = (AnonymousClass6GY) parcelable;
            } else {
                this.A03 = null;
            }
        }

        public /* bridge */ /* synthetic */ void A0A(View view, View view2, CoordinatorLayout coordinatorLayout, int i) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (this.A00 == 0 || i == 1) {
                A0P(coordinatorLayout, appBarLayout);
                if (appBarLayout.A0E) {
                    appBarLayout.A04(appBarLayout.A03(view2));
                }
            }
            this.A04 = AnonymousClass0x9.A14(view2);
        }

        public /* bridge */ /* synthetic */ boolean A0G(View view, View view2, View view3, CoordinatorLayout coordinatorLayout, int i, int i2) {
            boolean z;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if ((i & 2) == 0 || (!appBarLayout.A0E && (appBarLayout.getTotalScrollRange() == 0 || coordinatorLayout.getHeight() - view2.getHeight() > appBarLayout.getHeight()))) {
                z = false;
            } else {
                z = true;
                ValueAnimator valueAnimator = this.A02;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
            }
            this.A04 = null;
            this.A00 = i2;
            return z;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0037, code lost:
            if ((-r2) < r10.getTotalScrollRange()) goto L_0x0039;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public X.AnonymousClass6GY A0N(android.os.Parcelable r9, com.google.android.material.appbar.AppBarLayout r10) {
            /*
                r8 = this;
                X.7TO r0 = r8.A01
                if (r0 == 0) goto L_0x0058
                int r2 = r0.A02
            L_0x0006:
                int r1 = r10.getChildCount()
                r7 = 0
                r6 = 0
            L_0x000c:
                if (r6 >= r1) goto L_0x005a
                android.view.View r5 = r10.getChildAt(r6)
                int r4 = r5.getBottom()
                int r4 = r4 + r2
                int r0 = r5.getTop()
                int r0 = r0 + r2
                if (r0 > 0) goto L_0x0055
                if (r4 < 0) goto L_0x0055
                if (r9 != 0) goto L_0x0024
                X.0Zj r9 = X.C06830Zj.A01
            L_0x0024:
                X.6GY r3 = new X.6GY
                r3.<init>(r9)
                boolean r0 = X.AnonymousClass000.A1T(r2)
                r3.A03 = r0
                if (r0 != 0) goto L_0x0039
                int r2 = -r2
                int r1 = r10.getTotalScrollRange()
                r0 = 1
                if (r2 >= r1) goto L_0x003a
            L_0x0039:
                r0 = 0
            L_0x003a:
                r3.A04 = r0
                r3.A01 = r6
                int r1 = X.AnonymousClass0YY.A01(r5)
                int r0 = r10.getTopInset()
                int r1 = r1 + r0
                if (r4 != r1) goto L_0x004a
                r7 = 1
            L_0x004a:
                r3.A02 = r7
                float r1 = (float) r4
                float r0 = X.C86664Kz.A02(r5)
                float r1 = r1 / r0
                r3.A00 = r1
                return r3
            L_0x0055:
                int r6 = r6 + 1
                goto L_0x000c
            L_0x0058:
                r2 = 0
                goto L_0x0006
            L_0x005a:
                r0 = 0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.A0N(android.os.Parcelable, com.google.android.material.appbar.AppBarLayout):X.6GY");
        }

        public final void A0Q(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            C06220Ws r5 = C06220Ws.A0Z;
            CoordinatorLayout coordinatorLayout2 = coordinatorLayout;
            C06560Yg.A0K(coordinatorLayout, ((AccessibilityNodeInfo.AccessibilityAction) r5.A03).getId());
            C06220Ws r2 = C06220Ws.A0X;
            C06560Yg.A0K(coordinatorLayout, ((AccessibilityNodeInfo.AccessibilityAction) r2.A03).getId());
            AppBarLayout appBarLayout2 = appBarLayout;
            if (appBarLayout.getTotalScrollRange() != 0) {
                int childCount = coordinatorLayout.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = coordinatorLayout.getChildAt(i);
                    if (AnonymousClass001.A0W(childAt).A0A instanceof ScrollingViewBehavior) {
                        int childCount2 = appBarLayout.getChildCount();
                        for (int i2 = 0; i2 < childCount2; i2++) {
                            if (((C125086Fc) appBarLayout.getChildAt(i2).getLayoutParams()).A00 != 0) {
                                if (C06560Yg.A01(coordinatorLayout) == null) {
                                    C06560Yg.A0O(coordinatorLayout, new C188778zT(this, 0));
                                }
                                boolean z = true;
                                boolean z2 = false;
                                if (A0K() != (-appBarLayout.getTotalScrollRange())) {
                                    C06560Yg.A0R(coordinatorLayout, r5, new AnonymousClass806(this, appBarLayout, false), (CharSequence) null);
                                    z2 = true;
                                }
                                if (A0K() != 0) {
                                    if (childAt.canScrollVertically(-1)) {
                                        int i3 = -appBarLayout.getDownNestedPreScrollRange();
                                        if (i3 != 0) {
                                            C06560Yg.A0R(coordinatorLayout, r2, new AnonymousClass807(childAt, coordinatorLayout2, this, appBarLayout2, i3), (CharSequence) null);
                                        }
                                    } else {
                                        C06560Yg.A0R(coordinatorLayout, r2, new AnonymousClass806(this, appBarLayout, true), (CharSequence) null);
                                    }
                                    this.A05 = z;
                                    return;
                                }
                                z = z2;
                                this.A05 = z;
                                return;
                            }
                        }
                        return;
                    }
                }
            }
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public static final View A00(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if ((childAt instanceof C14970qZ) || (childAt instanceof ListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        public static final void A01(KeyEvent keyEvent, View view, AppBarLayout appBarLayout) {
            if (keyEvent.getAction() == 0 || keyEvent.getAction() == 1) {
                int keyCode = keyEvent.getKeyCode();
                if (keyCode == 19 || keyCode == 280 || keyCode == 92) {
                    if (((double) view.getScrollY()) < ((double) view.getMeasuredHeight()) * 0.1d) {
                        appBarLayout.setExpanded(true);
                    }
                } else if ((keyCode == 20 || keyCode == 281 || keyCode == 93) && view.getScrollY() > 0) {
                    appBarLayout.setExpanded(false);
                }
            }
        }

        public final void A0P(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            int topInset = appBarLayout.getTopInset() + appBarLayout.getPaddingTop();
            int A0K = A0K() - topInset;
            int childCount = appBarLayout.getChildCount();
            int i = 0;
            while (i < childCount) {
                View childAt = appBarLayout.getChildAt(i);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                C125086Fc r1 = (C125086Fc) childAt.getLayoutParams();
                if ((r1.A00 & 32) == 32) {
                    top -= r1.topMargin;
                    bottom += r1.bottomMargin;
                }
                int i2 = -A0K;
                if (top > i2 || bottom < i2) {
                    i++;
                } else if (i >= 0) {
                    View childAt2 = appBarLayout.getChildAt(i);
                    C125086Fc r5 = (C125086Fc) childAt2.getLayoutParams();
                    int i3 = r5.A00;
                    if ((i3 & 17) == 17) {
                        int i4 = -childAt2.getTop();
                        int i5 = -childAt2.getBottom();
                        if (i == 0 && AnonymousClass0YY.A0B(appBarLayout) && AnonymousClass0YY.A0B(childAt2)) {
                            i4 -= appBarLayout.getTopInset();
                        }
                        if ((i3 & 2) == 2) {
                            i5 += AnonymousClass0YY.A01(childAt2);
                        } else if ((i3 & 5) == 5) {
                            int A012 = AnonymousClass0YY.A01(childAt2) + i5;
                            if (A0K < A012) {
                                i4 = A012;
                            } else {
                                i5 = A012;
                            }
                        }
                        if ((i3 & 32) == 32) {
                            i4 += r5.topMargin;
                            i5 -= r5.bottomMargin;
                        }
                        if (A0K >= (i5 + i4) / 2) {
                            i5 = i4;
                        }
                        int i6 = i5 + topInset;
                        int i7 = -appBarLayout.getTotalScrollRange();
                        if (i6 >= i7) {
                            i7 = i6;
                            if (i6 > 0) {
                                i7 = 0;
                            }
                        }
                        A0R(coordinatorLayout, appBarLayout, i7);
                        return;
                    }
                    return;
                } else {
                    return;
                }
            }
        }

        public final void A0S(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i, int i2, boolean z) {
            View view;
            int abs = Math.abs(i);
            int childCount = appBarLayout.getChildCount();
            int i3 = 0;
            while (true) {
                if (i3 >= childCount) {
                    view = null;
                    break;
                }
                view = appBarLayout.getChildAt(i3);
                if (abs >= view.getTop() && abs <= view.getBottom()) {
                    break;
                }
                i3++;
            }
            boolean z2 = false;
            if (view != null) {
                int i4 = ((C125086Fc) view.getLayoutParams()).A00;
                if ((i4 & 1) != 0) {
                    int A012 = AnonymousClass0YY.A01(view);
                    if (((i2 > 0 && (i4 & 12) != 0) || (i4 & 2) != 0) && (-i) >= (view.getBottom() - A012) - appBarLayout.getTopInset()) {
                        z2 = true;
                    }
                }
            }
            if (appBarLayout.A0E) {
                z2 = appBarLayout.A03(A00(coordinatorLayout));
            }
            boolean A042 = appBarLayout.A04(z2);
            if (!z) {
                if (A042) {
                    Collection collection = (Collection) coordinatorLayout.A0C.A00.get(appBarLayout);
                    List list = coordinatorLayout.A0F;
                    list.clear();
                    if (collection != null) {
                        list.addAll(collection);
                    }
                    int size = list.size();
                    int i5 = 0;
                    while (i5 < size) {
                        C05630Ug r1 = AnonymousClass001.A0W((View) list.get(i5)).A0A;
                        if (!(r1 instanceof ScrollingViewBehavior)) {
                            i5++;
                        } else if (((HeaderScrollingViewBehavior) r1).A00 == 0) {
                            return;
                        }
                    }
                    return;
                }
                return;
            }
            appBarLayout.jumpDrawablesToCurrentState();
        }

        public BaseBehavior() {
        }
    }

    public class ScrollingViewBehavior extends HeaderScrollingViewBehavior {
        public void A02(View view, View view2, CoordinatorLayout coordinatorLayout) {
            if (view2 instanceof AppBarLayout) {
                C06560Yg.A0K(coordinatorLayout, ((AccessibilityNodeInfo.AccessibilityAction) C06220Ws.A0Z.A03).getId());
                C06560Yg.A0K(coordinatorLayout, ((AccessibilityNodeInfo.AccessibilityAction) C06220Ws.A0X.A03).getId());
                C06560Yg.A0O(coordinatorLayout, (AnonymousClass0WH) null);
            }
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1463179t.A0X);
            this.A00 = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            obtainStyledAttributes.recycle();
        }

        public boolean A04(Rect rect, View view, CoordinatorLayout coordinatorLayout, boolean z) {
            AppBarLayout appBarLayout;
            List A05 = coordinatorLayout.A05(view);
            int size = A05.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    appBarLayout = null;
                    break;
                }
                View view2 = (View) A05.get(i);
                if (view2 instanceof AppBarLayout) {
                    appBarLayout = (AppBarLayout) view2;
                    break;
                }
                i++;
            }
            boolean z2 = false;
            if (appBarLayout != null) {
                rect.offset(view.getLeft(), view.getTop());
                Rect rect2 = this.A02;
                rect2.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
                if (!rect2.contains(rect)) {
                    z2 = true;
                    int i2 = 0;
                    if (!z) {
                        i2 = 4;
                    }
                    appBarLayout.A04 = 2 | i2 | 8;
                    appBarLayout.requestLayout();
                }
            }
            return z2;
        }

        public boolean A06(View view, View view2, CoordinatorLayout coordinatorLayout) {
            C05630Ug r1 = AnonymousClass001.A0W(view2).A0A;
            if (r1 instanceof BaseBehavior) {
                int bottom = (view2.getBottom() - view.getTop()) + ((BaseBehavior) r1).A01 + this.A01;
                int i = 0;
                if (this.A00 != 0) {
                    float A0K = A0K(view2);
                    int i2 = this.A00;
                    int i3 = (int) (A0K * ((float) i2));
                    if (i3 >= 0) {
                        i = i3;
                        if (i3 > i2) {
                            i = i2;
                        }
                    }
                }
                C06560Yg.A0J(view, bottom - i);
            }
            if (!(view2 instanceof AppBarLayout)) {
                return false;
            }
            AppBarLayout appBarLayout = (AppBarLayout) view2;
            if (!appBarLayout.A0E) {
                return false;
            }
            appBarLayout.A04(appBarLayout.A03(view));
            return false;
        }

        public boolean A05(View view, View view2, CoordinatorLayout coordinatorLayout) {
            return view2 instanceof AppBarLayout;
        }

        public ScrollingViewBehavior() {
        }
    }

    public void setLiftOnScrollTargetView(View view) {
        WeakReference A14;
        this.A03 = -1;
        if (view == null) {
            WeakReference weakReference = this.A0B;
            if (weakReference != null) {
                weakReference.clear();
            }
            A14 = null;
        } else {
            A14 = AnonymousClass0x9.A14(view);
        }
        this.A0B = A14;
    }

    public void setOrientation(int i) {
        if (i == 1) {
            super.setOrientation(i);
            return;
        }
        throw AnonymousClass001.A0c("AppBarLayout is always vertical and does not support horizontal orientation");
    }

    public class Behavior extends BaseBehavior {
        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public Behavior() {
        }
    }

    public final void A00() {
        AnonymousClass6GY r2;
        Behavior behavior = this.A0A;
        if (behavior == null || this.A05 == -1 || this.A04 != 0) {
            r2 = null;
        } else {
            r2 = behavior.A0N(C06830Zj.A01, this);
        }
        this.A05 = -1;
        this.A01 = -1;
        this.A02 = -1;
        if (r2 != null) {
            Behavior behavior2 = this.A0A;
            if (behavior2.A03 == null) {
                behavior2.A03 = r2;
            }
        }
    }

    public void A01(int i) {
        this.A00 = i;
        if (!willNotDraw()) {
            AnonymousClass0YY.A05(this);
        }
        List list = this.A0C;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                C181178mK r0 = (C181178mK) this.A0C.get(i2);
                if (r0 != null) {
                    r0.BXL(this, i);
                }
            }
        }
    }

    public void A02(C187868xw r2) {
        List list = this.A0C;
        if (list == null) {
            list = AnonymousClass001.A0s();
            this.A0C = list;
        }
        if (!list.contains(r2)) {
            this.A0C.add(r2);
        }
    }

    public boolean A03(View view) {
        View A0j;
        int i;
        View view2;
        if (this.A0B == null && (i = this.A03) != -1 && (!(view == null || (view2 = view.findViewById(i)) == null) || ((getParent() instanceof ViewGroup) && (view2 = ((View) getParent()).findViewById(this.A03)) != null))) {
            this.A0B = AnonymousClass0x9.A14(view2);
        }
        WeakReference weakReference = this.A0B;
        if (weakReference != null && (A0j = C86664Kz.A0j(weakReference)) != null) {
            view = A0j;
        } else if (view == null) {
            return false;
        }
        if (view.canScrollVertically(-1) || view.getScrollY() > 0) {
            return true;
        }
        return false;
    }

    public boolean A04(boolean z) {
        float f;
        if (!(!this.A0G) || this.A0H == z) {
            return false;
        }
        this.A0H = z;
        refreshDrawableState();
        if (!this.A0E || !(getBackground() instanceof AnonymousClass6D7)) {
            return true;
        }
        float f2 = 0.0f;
        if (this.A0M != null) {
            f = 255.0f;
            if (z) {
                f = 0.0f;
                f2 = 255.0f;
            }
        } else if (z) {
            f = 0.0f;
            f2 = this.A0J;
        } else {
            f = this.A0J;
        }
        ValueAnimator valueAnimator = this.A07;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float[] fArr = new float[2];
        AnonymousClass6C9.A1J(fArr, f, f2);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        this.A07 = ofFloat;
        ofFloat.setDuration(this.A0K);
        this.A07.setInterpolator(this.A0L);
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = this.A06;
        if (animatorUpdateListener != null) {
            this.A07.addUpdateListener(animatorUpdateListener);
        }
        this.A07.start();
        return true;
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C125086Fc;
    }

    public C05630Ug getBehavior() {
        Behavior behavior = new Behavior();
        this.A0A = behavior;
        return behavior;
    }

    public int getDownNestedPreScrollRange() {
        int i;
        int A012;
        int i2 = this.A01;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (childAt.getVisibility() != 8) {
                C125086Fc r7 = (C125086Fc) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i4 = r7.A00;
                if ((i4 & 5) == 5) {
                    int i5 = r7.topMargin + r7.bottomMargin;
                    if ((i4 & 8) != 0) {
                        A012 = AnonymousClass0YY.A01(childAt);
                    } else if ((i4 & 2) != 0) {
                        A012 = measuredHeight - AnonymousClass0YY.A01(childAt);
                    } else {
                        i = i5 + measuredHeight;
                        if (childCount == 0 && AnonymousClass0YY.A0B(childAt)) {
                            i = AnonymousClass6C9.A0A(measuredHeight, getTopInset(), i);
                        }
                        i3 += i;
                    }
                    i = i5 + A012;
                    i = AnonymousClass6C9.A0A(measuredHeight, getTopInset(), i);
                    i3 += i;
                } else if (i3 > 0) {
                    break;
                }
            }
        }
        int max = Math.max(0, i3);
        this.A01 = max;
        return max;
    }

    public int getDownNestedScrollRange() {
        int i = this.A02;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                C125086Fc r3 = (C125086Fc) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight() + r3.topMargin + r3.bottomMargin;
                int i4 = r3.A00;
                if ((i4 & 1) == 0) {
                    break;
                }
                i3 += measuredHeight;
                if ((i4 & 2) != 0) {
                    i3 -= AnonymousClass0YY.A01(childAt);
                    break;
                }
            }
            i2++;
        }
        int max = Math.max(0, i3);
        this.A02 = max;
        return max;
    }

    public int getLiftOnScrollTargetViewId() {
        return this.A03;
    }

    public int getPendingAction() {
        return this.A04;
    }

    public Drawable getStatusBarForeground() {
        return this.A08;
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    public final int getTopInset() {
        AnonymousClass0XY r0 = this.A09;
        if (r0 != null) {
            return r0.A05();
        }
        return 0;
    }

    public final int getTotalScrollRange() {
        int i = this.A05;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                C125086Fc r3 = (C125086Fc) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i4 = r3.A00;
                if ((i4 & 1) == 0) {
                    break;
                }
                i3 += measuredHeight + r3.topMargin + r3.bottomMargin;
                if (i2 == 0 && AnonymousClass0YY.A0B(childAt)) {
                    i3 -= getTopInset();
                }
                if ((i4 & 2) != 0) {
                    i3 -= AnonymousClass0YY.A01(childAt);
                    break;
                }
            }
            i2++;
        }
        int max = Math.max(0, i3);
        this.A05 = max;
        return max;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003a, code lost:
        if (r0 == false) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0021, code lost:
        if (r0 == false) goto L_0x0023;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int[] onCreateDrawableState(int r6) {
        /*
            r5 = this;
            int[] r3 = r5.A0I
            if (r3 != 0) goto L_0x0009
            r0 = 4
            int[] r3 = new int[r0]
            r5.A0I = r3
        L_0x0009:
            int r0 = r3.length
            int r6 = r6 + r0
            int[] r4 = super.onCreateDrawableState(r6)
            boolean r2 = r5.A0F
            r1 = 2130970707(0x7f040853, float:1.7550132E38)
            if (r2 != 0) goto L_0x0017
            int r1 = -r1
        L_0x0017:
            r0 = 0
            r3[r0] = r1
            if (r2 == 0) goto L_0x0023
            boolean r0 = r5.A0H
            r1 = 2130970708(0x7f040854, float:1.7550134E38)
            if (r0 != 0) goto L_0x0027
        L_0x0023:
            r0 = 2130970708(0x7f040854, float:1.7550134E38)
            int r1 = -r0
        L_0x0027:
            r0 = 1
            r3[r0] = r1
            r1 = 2130970703(0x7f04084f, float:1.7550124E38)
            if (r2 != 0) goto L_0x0030
            int r1 = -r1
        L_0x0030:
            r0 = 2
            r3[r0] = r1
            if (r2 == 0) goto L_0x003c
            boolean r0 = r5.A0H
            r1 = 2130970702(0x7f04084e, float:1.7550122E38)
            if (r0 != 0) goto L_0x0040
        L_0x003c:
            r0 = 2130970702(0x7f04084e, float:1.7550122E38)
            int r1 = -r0
        L_0x0040:
            r0 = 3
            r3[r0] = r1
            int[] r0 = android.view.View.mergeDrawableStates(r4, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.onCreateDrawableState(int):int[]");
    }

    public void setLiftOnScroll(boolean z) {
        this.A0E = z;
    }

    public void setLiftOnScrollTargetViewId(int i) {
        this.A03 = i;
        WeakReference weakReference = this.A0B;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.A0B = null;
    }

    public void setLiftableOverrideEnabled(boolean z) {
        this.A0G = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0048, code lost:
        if (getTopInset() <= 0) goto L_0x004a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setStatusBarForeground(android.graphics.drawable.Drawable r4) {
        /*
            r3 = this;
            android.graphics.drawable.Drawable r1 = r3.A08
            if (r1 == r4) goto L_0x0053
            r0 = 0
            if (r1 == 0) goto L_0x000a
            r1.setCallback(r0)
        L_0x000a:
            if (r4 == 0) goto L_0x0010
            android.graphics.drawable.Drawable r0 = r4.mutate()
        L_0x0010:
            r3.A08 = r0
            if (r0 == 0) goto L_0x003f
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x0023
            android.graphics.drawable.Drawable r1 = r3.A08
            int[] r0 = r3.getDrawableState()
            r1.setState(r0)
        L_0x0023:
            android.graphics.drawable.Drawable r1 = r3.A08
            int r0 = X.AnonymousClass0YH.A01(r3)
            X.C06130Wj.A03(r0, r1)
            android.graphics.drawable.Drawable r2 = r3.A08
            int r0 = r3.getVisibility()
            r1 = 0
            boolean r0 = X.AnonymousClass000.A1T(r0)
            r2.setVisible(r0, r1)
            android.graphics.drawable.Drawable r0 = r3.A08
            r0.setCallback(r3)
        L_0x003f:
            android.graphics.drawable.Drawable r0 = r3.A08
            if (r0 == 0) goto L_0x004a
            int r1 = r3.getTopInset()
            r0 = 1
            if (r1 > 0) goto L_0x004b
        L_0x004a:
            r0 = 0
        L_0x004b:
            r0 = r0 ^ 1
            r3.setWillNotDraw(r0)
            X.AnonymousClass0YY.A05(r3)
        L_0x0053:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.setStatusBarForeground(android.graphics.drawable.Drawable):void");
    }

    public void setStatusBarForegroundColor(int i) {
        setStatusBarForeground(new ColorDrawable(i));
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AppBarLayout(android.content.Context r19, android.util.AttributeSet r20, int r21) {
        /*
            r18 = this;
            r11 = 2132084317(0x7f15065d, float:1.9808801E38)
            r0 = r19
            r7 = r20
            r10 = r21
            android.content.Context r0 = X.C105515Vh.A00(r0, r7, r10, r11)
            r2 = r18
            r2.<init>(r0, r7, r10)
            r3 = -1
            r2.A05 = r3
            r2.A01 = r3
            r2.A02 = r3
            r1 = 0
            r2.A04 = r1
            java.util.ArrayList r0 = X.AnonymousClass001.A0s()
            r2.A0N = r0
            android.content.Context r12 = r2.getContext()
            r0 = 1
            r2.setOrientation(r0)
            int r4 = android.os.Build.VERSION.SDK_INT
            android.view.ViewOutlineProvider r5 = r2.getOutlineProvider()
            android.view.ViewOutlineProvider r0 = android.view.ViewOutlineProvider.BACKGROUND
            if (r5 != r0) goto L_0x0039
            android.view.ViewOutlineProvider r0 = android.view.ViewOutlineProvider.BOUNDS
            r2.setOutlineProvider(r0)
        L_0x0039:
            android.content.Context r6 = r2.getContext()
            int[] r8 = X.C154957e2.A00
            int[] r9 = new int[r1]
            android.content.res.TypedArray r5 = X.C161837qd.A00(r6, r7, r8, r9, r10, r11)
            boolean r0 = r5.hasValue(r1)     // Catch:{ all -> 0x014c }
            if (r0 == 0) goto L_0x0056
            int r0 = r5.getResourceId(r1, r1)     // Catch:{ all -> 0x014c }
            android.animation.StateListAnimator r0 = android.animation.AnimatorInflater.loadStateListAnimator(r6, r0)     // Catch:{ all -> 0x014c }
            r2.setStateListAnimator(r0)     // Catch:{ all -> 0x014c }
        L_0x0056:
            r5.recycle()
            int[] r14 = X.C1463179t.A00
            int[] r0 = new int[r1]
            r13 = r7
            r15 = r0
            r16 = r10
            r17 = r11
            android.content.res.TypedArray r5 = X.C161837qd.A00(r12, r13, r14, r15, r16, r17)
            android.graphics.drawable.Drawable r0 = r5.getDrawable(r1)
            X.AnonymousClass0YY.A04(r0, r2)
            r0 = 6
            android.content.res.ColorStateList r6 = X.C160917of.A00(r12, r5, r0)
            r2.A0M = r6
            android.graphics.drawable.Drawable r0 = r2.getBackground()
            boolean r0 = r0 instanceof android.graphics.drawable.ColorDrawable
            if (r0 == 0) goto L_0x00ae
            android.graphics.drawable.Drawable r0 = r2.getBackground()
            android.graphics.drawable.ColorDrawable r0 = (android.graphics.drawable.ColorDrawable) r0
            X.6D7 r7 = new X.6D7
            r7.<init>()
            int r0 = r0.getColor()
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r0)
            r7.A06(r0)
            if (r6 == 0) goto L_0x0141
            boolean r6 = r2.A0H
            r0 = 0
            if (r6 == 0) goto L_0x009c
            r0 = 255(0xff, float:3.57E-43)
        L_0x009c:
            r7.setAlpha(r0)
            android.content.res.ColorStateList r0 = r2.A0M
            r7.A06(r0)
            X.75F r6 = new X.75F
            r6.<init>(r7, r1, r2)
        L_0x00a9:
            r2.A06 = r6
            X.AnonymousClass0YY.A04(r7, r2)
        L_0x00ae:
            android.content.res.Resources r6 = r2.getResources()
            r0 = 2131492867(0x7f0c0003, float:1.8609198E38)
            int r6 = r6.getInteger(r0)
            r0 = 2130970144(0x7f040620, float:1.754899E38)
            int r0 = X.C160907oe.A00(r12, r0, r6)
            long r6 = (long) r0
            r2.A0K = r6
            r6 = 2130970162(0x7f040632, float:1.7549026E38)
            android.animation.TimeInterpolator r0 = X.C159917mg.A03
            android.animation.TimeInterpolator r0 = X.AnonymousClass5YH.A01(r0, r12, r6)
            r2.A0L = r0
            r6 = 4
            boolean r0 = r5.hasValue(r6)
            if (r0 == 0) goto L_0x00e2
            boolean r0 = r5.getBoolean(r6, r1)
            int r0 = X.C18280x3.A01(r0)
            r2.A04 = r0
            r2.requestLayout()
        L_0x00e2:
            r6 = 3
            boolean r0 = r5.hasValue(r6)
            if (r0 == 0) goto L_0x00f1
            int r0 = r5.getDimensionPixelSize(r6, r1)
            float r0 = (float) r0
            X.C154957e2.A00(r2, r0)
        L_0x00f1:
            r0 = 26
            if (r4 < r0) goto L_0x0111
            r4 = 2
            boolean r0 = r5.hasValue(r4)
            if (r0 == 0) goto L_0x0103
            boolean r0 = r5.getBoolean(r4, r1)
            r2.setKeyboardNavigationCluster(r0)
        L_0x0103:
            r4 = 1
            boolean r0 = r5.hasValue(r4)
            if (r0 == 0) goto L_0x0111
            boolean r0 = r5.getBoolean(r4, r1)
            r2.setTouchscreenBlocksFocus(r0)
        L_0x0111:
            android.content.res.Resources r4 = r2.getResources()
            r0 = 2131166170(0x7f0703da, float:1.7946578E38)
            float r0 = r4.getDimension(r0)
            r2.A0J = r0
            r0 = 5
            boolean r0 = r5.getBoolean(r0, r1)
            r2.A0E = r0
            r0 = 7
            int r0 = r5.getResourceId(r0, r3)
            r2.A03 = r0
            r0 = 8
            android.graphics.drawable.Drawable r0 = r5.getDrawable(r0)
            r2.setStatusBarForeground(r0)
            r5.recycle()
            X.92E r0 = new X.92E
            r0.<init>(r2, r1)
            X.AnonymousClass0YZ.A0E(r2, r0)
            return
        L_0x0141:
            r7.A05(r12)
            r0 = 1
            X.75F r6 = new X.75F
            r6.<init>(r7, r0, r2)
            goto L_0x00a9
        L_0x014c:
            r0 = move-exception
            r5.recycle()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.A08 != null && getTopInset() > 0) {
            int save = canvas.save();
            canvas.translate(0.0f, (float) (-this.A00));
            this.A08.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.A08;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int childCount;
        int topInset = getTopInset();
        int A012 = AnonymousClass0YY.A01(this);
        if (A012 != 0 || ((childCount = getChildCount()) >= 1 && (A012 = AnonymousClass0YY.A01(getChildAt(childCount - 1))) != 0)) {
            return (A012 * 2) + topInset;
        }
        return getHeight() / 3;
    }

    public int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C160927og.A01(this);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        WeakReference weakReference = this.A0B;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.A0B = null;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        boolean z2 = true;
        if (AnonymousClass0YY.A0B(this) && getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (childAt.getVisibility() != 8 && !AnonymousClass0YY.A0B(childAt)) {
                int topInset = getTopInset();
                for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                    C06560Yg.A0J(getChildAt(childCount), topInset);
                }
            }
        }
        A00();
        this.A0D = false;
        int childCount2 = getChildCount();
        int i5 = 0;
        while (true) {
            if (i5 >= childCount2) {
                break;
            } else if (((C125086Fc) getChildAt(i5).getLayoutParams()).A01 != null) {
                this.A0D = true;
                break;
            } else {
                i5++;
            }
        }
        Drawable drawable = this.A08;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getTopInset());
        }
        if (!this.A0G) {
            if (!this.A0E) {
                int childCount3 = getChildCount();
                int i6 = 0;
                while (true) {
                    if (i6 >= childCount3) {
                        z2 = false;
                        break;
                    }
                    int i7 = ((C125086Fc) getChildAt(i6).getLayoutParams()).A00;
                    if ((i7 & 1) == 1 && (i7 & 10) != 0) {
                        break;
                    }
                    i6++;
                }
            }
            if (this.A0F != z2) {
                this.A0F = z2;
                refreshDrawableState();
            }
        }
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        if (mode != 1073741824 && AnonymousClass0YY.A0B(this) && getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (childAt.getVisibility() != 8 && !AnonymousClass0YY.A0B(childAt)) {
                int measuredHeight = getMeasuredHeight();
                if (mode == Integer.MIN_VALUE) {
                    int measuredHeight2 = getMeasuredHeight() + getTopInset();
                    measuredHeight = View.MeasureSpec.getSize(i2);
                    if (measuredHeight2 < 0) {
                        measuredHeight = 0;
                    } else if (measuredHeight2 <= measuredHeight) {
                        measuredHeight = measuredHeight2;
                    }
                } else if (mode == 0) {
                    measuredHeight += getTopInset();
                }
                setMeasuredDimension(getMeasuredWidth(), measuredHeight);
            }
        }
        A00();
    }

    public void setElevation(float f) {
        super.setElevation(f);
        C160927og.A02(this, f);
    }

    public void setExpanded(boolean z) {
        boolean A052 = C06360Xi.A05(this);
        int A012 = C18280x3.A01(z ? 1 : 0);
        int i = 0;
        if (A052) {
            i = 4;
        }
        this.A04 = A012 | i | 8;
        requestLayout();
    }

    public void setStatusBarForegroundResource(int i) {
        setStatusBarForeground(AnonymousClass0VX.A01(getContext(), i));
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean A1T = AnonymousClass000.A1T(i);
        Drawable drawable = this.A08;
        if (drawable != null) {
            drawable.setVisible(A1T, false);
        }
    }

    public boolean verifyDrawable(Drawable drawable) {
        if (super.verifyDrawable(drawable) || drawable == this.A08) {
            return true;
        }
        return false;
    }

    @Deprecated
    public void setTargetElevation(float f) {
        C154957e2.A00(this, f);
    }

    public AppBarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.f3nameremoved);
    }

    public AppBarLayout(Context context) {
        this(context, (AttributeSet) null);
    }
}
