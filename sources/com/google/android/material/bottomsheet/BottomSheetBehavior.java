package com.google.android.material.bottomsheet;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass0WM;
import X.AnonymousClass0YZ;
import X.AnonymousClass6C9;
import X.AnonymousClass6Cs;
import X.AnonymousClass6D7;
import X.AnonymousClass6GZ;
import X.AnonymousClass7TP;
import X.AnonymousClass7XV;
import X.C002002f;
import X.C04810Qt;
import X.C05630Ug;
import X.C06220Ws;
import X.C06560Yg;
import X.C1453074z;
import X.C1463179t;
import X.C160917of;
import X.C161877ql;
import X.C18260x0;
import X.C18280x3;
import X.C188788zU;
import X.C86604Kt;
import X.C86664Kz;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.whatsapp.R;
import com.whatsapp.bottomsheet.LockableBottomSheetBehavior;
import com.whatsapp.calling.callrating.util.NonDraggableBottomSheetBehaviour;
import com.whatsapp.camera.CameraBottomSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class BottomSheetBehavior extends C05630Ug {
    public float A00 = -1.0f;
    public float A01 = 0.5f;
    public float A02 = 0.1f;
    public float A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public int A0D;
    public int A0E;
    public int A0F = -1;
    public int A0G = -1;
    public int A0H;
    public int A0I;
    public int A0J;
    public int A0K;
    public int A0L;
    public int A0M = 0;
    public int A0N;
    public int A0O = 4;
    public ValueAnimator A0P;
    public ColorStateList A0Q;
    public VelocityTracker A0R;
    public AnonymousClass0WM A0S;
    public AnonymousClass6D7 A0T;
    public C161877ql A0U;
    public WeakReference A0V;
    public WeakReference A0W;
    public WeakReference A0X;
    public Map A0Y;
    public boolean A0Z = true;
    public boolean A0a;
    public boolean A0b = true;
    public boolean A0c;
    public boolean A0d;
    public boolean A0e;
    public boolean A0f;
    public boolean A0g;
    public boolean A0h;
    public boolean A0i;
    public boolean A0j;
    public boolean A0k;
    public boolean A0l;
    public boolean A0m;
    public boolean A0n;
    public boolean A0o;
    public boolean A0p;
    public boolean A0q;
    public final SparseIntArray A0r = new SparseIntArray();
    public final C04810Qt A0s = new C188788zU(this, 0);
    public final AnonymousClass7TP A0t = new AnonymousClass7TP(this);
    public final ArrayList A0u = AnonymousClass001.A0s();

    public void A08() {
        this.A0X = null;
        this.A0S = null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0B(android.view.View r6, android.view.View r7, androidx.coordinatorlayout.widget.CoordinatorLayout r8, int[] r9, int r10, int r11, int r12) {
        /*
            r5 = this;
            r2 = 1
            if (r12 == r2) goto L_0x0031
            java.lang.ref.WeakReference r0 = r5.A0W
            if (r0 == 0) goto L_0x005a
            java.lang.Object r0 = r0.get()
        L_0x000b:
            if (r7 != r0) goto L_0x0031
            int r4 = r6.getTop()
            int r3 = r4 - r11
            if (r11 <= 0) goto L_0x0032
            int r0 = r5.A0K()
            if (r3 >= r0) goto L_0x004c
            int r4 = r4 - r0
            r9[r2] = r4
            int r0 = -r4
            X.C06560Yg.A0J(r6, r0)
            r0 = 3
        L_0x0023:
            r5.A0T(r0)
        L_0x0026:
            int r0 = r6.getTop()
            r5.A0Q(r0)
            r5.A0E = r11
            r5.A0i = r2
        L_0x0031:
            return
        L_0x0032:
            if (r11 >= 0) goto L_0x0026
            r0 = -1
            boolean r0 = r7.canScrollVertically(r0)
            if (r0 != 0) goto L_0x0026
            int r1 = r5.A06
            if (r3 <= r1) goto L_0x004c
            boolean r0 = r5.A0d
            if (r0 != 0) goto L_0x004c
            int r4 = r4 - r1
            r9[r2] = r4
            int r0 = -r4
            X.C06560Yg.A0J(r6, r0)
            r0 = 4
            goto L_0x0023
        L_0x004c:
            boolean r0 = r5.A0Z
            if (r0 == 0) goto L_0x0031
            r9[r2] = r11
            int r0 = -r11
            X.C06560Yg.A0J(r6, r0)
            r5.A0T(r2)
            goto L_0x0026
        L_0x005a:
            r0 = 0
            goto L_0x000b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.A0B(android.view.View, android.view.View, androidx.coordinatorlayout.widget.CoordinatorLayout, int[], int, int, int):void");
    }

    public void A0D(C002002f r2) {
        this.A0X = null;
        this.A0S = null;
    }

    public boolean A0H(View view, View view2, CoordinatorLayout coordinatorLayout, float f, float f2) {
        WeakReference weakReference = this.A0W;
        return (weakReference == null || view2 != weakReference.get() || this.A0O == 3) ? false : true;
    }

    public void A0R(int i) {
        A0U(i, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0029, code lost:
        if (r4.A0A > r4.A08) goto L_0x002b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0S(int r5) {
        /*
            r4 = this;
            r2 = 1
            if (r5 == r2) goto L_0x005e
            r0 = 2
            if (r5 == r0) goto L_0x005e
            boolean r0 = r4.A0d
            if (r0 != 0) goto L_0x001d
            r0 = 5
            if (r5 != r0) goto L_0x001d
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Cannot set state: "
            java.lang.String r1 = X.AnonymousClass000.A0Y(r0, r1, r5)
            java.lang.String r0 = "BottomSheetBehavior"
            android.util.Log.w(r0, r1)
            return
        L_0x001d:
            r0 = 6
            if (r5 != r0) goto L_0x002b
            boolean r0 = r4.A0b
            if (r0 == 0) goto L_0x002b
            int r1 = r4.A0A
            int r0 = r4.A08
            r3 = 3
            if (r1 <= r0) goto L_0x002c
        L_0x002b:
            r3 = r5
        L_0x002c:
            java.lang.ref.WeakReference r1 = r4.A0X
            if (r1 == 0) goto L_0x005a
            java.lang.Object r0 = r1.get()
            if (r0 == 0) goto L_0x005a
            android.view.View r2 = X.C86664Kz.A0j(r1)
            r0 = 2
            X.3ca r1 = new X.3ca
            r1.<init>((java.lang.Object) r2, (java.lang.Object) r4, (int) r3, (int) r0)
            android.view.ViewParent r0 = r2.getParent()
            if (r0 == 0) goto L_0x0056
            boolean r0 = r0.isLayoutRequested()
            if (r0 == 0) goto L_0x0056
            boolean r0 = X.C06360Xi.A04(r2)
            if (r0 == 0) goto L_0x0056
            r2.post(r1)
            return
        L_0x0056:
            r1.run()
            return
        L_0x005a:
            r4.A0T(r5)
            return
        L_0x005e:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "STATE_"
            r1.append(r0)
            if (r5 != r2) goto L_0x0075
            java.lang.String r0 = "DRAGGING"
        L_0x006b:
            r1.append(r0)
            java.lang.String r0 = " should not be set externally."
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0F(r0, r1)
            throw r0
        L_0x0075:
            java.lang.String r0 = "SETTLING"
            goto L_0x006b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.A0S(int):void");
    }

    public final void A0U(int i, boolean z) {
        View A0j2;
        boolean z2 = this.A0n;
        if (i == -1) {
            if (!z2) {
                this.A0n = true;
            } else {
                return;
            }
        } else if (z2 || this.A0J != i) {
            this.A0n = false;
            this.A0J = Math.max(0, i);
        } else {
            return;
        }
        WeakReference weakReference = this.A0X;
        if (weakReference != null) {
            A0O();
            if (this.A0O == 4 && (A0j2 = C86664Kz.A0j(weakReference)) != null) {
                if (z) {
                    A0S(4);
                } else {
                    A0j2.requestLayout();
                }
            }
        }
    }

    public final void A0V(int i, boolean z) {
        boolean z2;
        AnonymousClass6D7 r4;
        ValueAnimator valueAnimator;
        if (i != 2) {
            if (this.A0O != 3 || (!this.A0o && A0K() != 0)) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (this.A0a != z2 && (r4 = this.A0T) != null) {
                this.A0a = z2;
                float f = 0.0f;
                if (!z || (valueAnimator = this.A0P) == null) {
                    ValueAnimator valueAnimator2 = this.A0P;
                    if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                        valueAnimator2.cancel();
                    }
                    if (!this.A0a) {
                        f = 1.0f;
                    }
                    AnonymousClass6Cs r1 = r4.A03;
                    if (r1.A01 != f) {
                        r1.A01 = f;
                        r4.A05 = true;
                        r4.invalidateSelf();
                    }
                } else if (valueAnimator.isRunning()) {
                    valueAnimator.reverse();
                } else {
                    if (!z2) {
                        f = 1.0f;
                    }
                    float[] fArr = new float[2];
                    AnonymousClass6C9.A1J(fArr, 1.0f - f, f);
                    valueAnimator.setFloatValues(fArr);
                    valueAnimator.start();
                }
            }
        }
    }

    public final void A0Y(View view, int i, boolean z) {
        int A0K2;
        boolean A0H2;
        if (i == 3) {
            A0K2 = A0K();
        } else if (i == 4) {
            A0K2 = this.A06;
        } else if (i == 5) {
            A0K2 = this.A0H;
        } else if (i == 6) {
            A0K2 = this.A0A;
        } else {
            throw AnonymousClass000.A0G("Invalid state to get top offset: ", AnonymousClass001.A0o(), i);
        }
        AnonymousClass0WM r2 = this.A0S;
        if (r2 != null) {
            int left = view.getLeft();
            if (z) {
                A0H2 = r2.A0C(left, A0K2);
            } else {
                A0H2 = r2.A0H(view, left, A0K2);
            }
            if (A0H2) {
                A0T(2);
                A0V(i, true);
                this.A0t.A00(i);
                return;
            }
        }
        A0T(i);
    }

    public Parcelable A07(View view, CoordinatorLayout coordinatorLayout) {
        return new AnonymousClass6GZ((Parcelable) View.BaseSavedState.EMPTY_STATE, this);
    }

    public void A09(Parcelable parcelable, View view, CoordinatorLayout coordinatorLayout) {
        AnonymousClass6GZ r5 = (AnonymousClass6GZ) parcelable;
        int i = this.A0M;
        if (i != 0) {
            if (i == -1 || (i & 1) == 1) {
                this.A0J = r5.A00;
            }
            if (i == -1 || (i & 2) == 2) {
                this.A0b = r5.A01;
            }
            if (i == -1 || (i & 4) == 4) {
                this.A0d = r5.A02;
            }
            if (i == -1 || (i & 8) == 8) {
                this.A0p = r5.A03;
            }
        }
        int i2 = r5.A04;
        if (i2 == 1 || i2 == 2) {
            i2 = 4;
        }
        this.A0O = i2;
    }

    public boolean A0G(View view, View view2, View view3, CoordinatorLayout coordinatorLayout, int i, int i2) {
        boolean z;
        if (this instanceof LockableBottomSheetBehavior) {
            LockableBottomSheetBehavior lockableBottomSheetBehavior = (LockableBottomSheetBehavior) this;
            if (lockableBottomSheetBehavior instanceof NonDraggableBottomSheetBehaviour) {
                C18260x0.A0V(view, view2, view3);
                if (lockableBottomSheetBehavior.A00) {
                    lockableBottomSheetBehavior.A0E = 0;
                    lockableBottomSheetBehavior.A0i = false;
                    if ((i & 2) == 0) {
                        return false;
                    }
                    return true;
                }
            } else if (lockableBottomSheetBehavior.A00) {
                z = false;
                lockableBottomSheetBehavior.A0E = 0;
                lockableBottomSheetBehavior.A0i = false;
            }
            return false;
        }
        z = false;
        this.A0E = 0;
        this.A0i = false;
        if ((i & 2) != 0) {
            return true;
        }
        return z;
    }

    public int A0K() {
        int i;
        if (this.A0b) {
            return this.A08;
        }
        int i2 = this.A07;
        if (this.A0m) {
            i = 0;
        } else {
            i = this.A0D;
        }
        return Math.max(i2, i);
    }

    public int A0L() {
        if (this.A0n) {
            return -1;
        }
        return this.A0J;
    }

    public final int A0M() {
        int i;
        int i2;
        if (this.A0n) {
            i = Math.min(Math.max(this.A0L, this.A0H - ((this.A0I * 9) / 16)), this.A05);
        } else if (!this.A0c && !this.A0j && (i2 = this.A09) > 0) {
            return Math.max(this.A0J, i2 + this.A0K);
        } else {
            i = this.A0J;
        }
        return i + this.A0C;
    }

    public final void A0P() {
        WeakReference weakReference = this.A0X;
        if (weakReference != null) {
            A0X(C86664Kz.A0j(weakReference), 0);
        }
        WeakReference weakReference2 = this.A0V;
        if (weakReference2 != null) {
            A0X(C86664Kz.A0j(weakReference2), 1);
        }
    }

    public void A0Q(int i) {
        float f;
        float f2;
        int A0K2;
        View A0j2 = C86664Kz.A0j(this.A0X);
        if (A0j2 != null) {
            ArrayList arrayList = this.A0u;
            if (!arrayList.isEmpty()) {
                int i2 = this.A06;
                if (i > i2 || i2 == (A0K2 = A0K())) {
                    f = (float) (i2 - i);
                    f2 = (float) (this.A0H - i2);
                } else {
                    f = (float) (i2 - i);
                    f2 = (float) (i2 - A0K2);
                }
                float f3 = f / f2;
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    ((AnonymousClass7XV) arrayList.get(i3)).A02(A0j2, f3);
                }
            }
        }
    }

    public void A0T(int i) {
        View A0j2;
        WeakReference weakReference;
        if (this.A0O != i) {
            this.A0O = i;
            WeakReference weakReference2 = this.A0X;
            if (weakReference2 != null && (A0j2 = C86664Kz.A0j(weakReference2)) != null) {
                int i2 = 0;
                if (i == 3) {
                    WeakReference weakReference3 = this.A0X;
                    if (weakReference3 != null) {
                        ViewParent parent = C86664Kz.A0j(weakReference3).getParent();
                        if (parent instanceof CoordinatorLayout) {
                            ViewGroup viewGroup = (ViewGroup) parent;
                            int childCount = viewGroup.getChildCount();
                            if (this.A0Y == null) {
                                this.A0Y = new HashMap(childCount);
                                for (int i3 = 0; i3 < childCount; i3++) {
                                    View childAt = viewGroup.getChildAt(i3);
                                    if (childAt != this.A0X.get()) {
                                        C18280x3.A1D(childAt, this.A0Y, childAt.getImportantForAccessibility());
                                    }
                                }
                            }
                        }
                    }
                } else if ((i == 6 || i == 5 || i == 4) && (weakReference = this.A0X) != null) {
                    ViewParent parent2 = C86664Kz.A0j(weakReference).getParent();
                    if (parent2 instanceof CoordinatorLayout) {
                        ViewGroup viewGroup2 = (ViewGroup) parent2;
                        int childCount2 = viewGroup2.getChildCount();
                        for (int i4 = 0; i4 < childCount2; i4++) {
                            viewGroup2.getChildAt(i4);
                            this.A0X.get();
                        }
                        this.A0Y = null;
                    }
                }
                A0V(i, true);
                while (true) {
                    ArrayList arrayList = this.A0u;
                    if (i2 < arrayList.size()) {
                        ((AnonymousClass7XV) arrayList.get(i2)).A03(A0j2, i);
                        i2++;
                    } else {
                        A0P();
                        return;
                    }
                }
            }
        }
    }

    public final void A0W(View view, int i) {
        if (view != null) {
            C06560Yg.A0K(view, 524288);
            C06560Yg.A0K(view, 262144);
            C06560Yg.A0K(view, 1048576);
            SparseIntArray sparseIntArray = this.A0r;
            int i2 = sparseIntArray.get(i, -1);
            if (i2 != -1) {
                C06560Yg.A0K(view, i2);
                sparseIntArray.delete(i);
            }
        }
    }

    public final void A0X(View view, int i) {
        C06220Ws r3;
        int i2;
        View view2 = view;
        if (view != null) {
            int i3 = i;
            A0W(view2, i3);
            int i4 = 6;
            if (!this.A0b && this.A0O != 6) {
                SparseIntArray sparseIntArray = this.A0r;
                String string = view2.getResources().getString(R.string.f11nameremoved);
                C1453074z r13 = new C1453074z(this, 6, 0);
                AbstractList abstractList = (AbstractList) view2.getTag(R.id.tag_accessibility_actions);
                if (abstractList == null) {
                    abstractList = AnonymousClass001.A0s();
                    view2.setTag(R.id.tag_accessibility_actions, abstractList);
                }
                int i5 = 0;
                while (true) {
                    if (i5 >= abstractList.size()) {
                        int i6 = 0;
                        i2 = -1;
                        while (true) {
                            int[] iArr = C06560Yg.A0A;
                            if (i6 >= iArr.length || i2 != -1) {
                                break;
                            }
                            int i7 = iArr[i6];
                            boolean z = true;
                            for (int i8 = 0; i8 < abstractList.size(); i8++) {
                                z &= AnonymousClass001.A1X(((AccessibilityNodeInfo.AccessibilityAction) ((C06220Ws) abstractList.get(i8)).A03).getId(), i7);
                            }
                            if (z) {
                                i2 = i7;
                            }
                            i6++;
                        }
                    } else if (TextUtils.equals(string, ((AccessibilityNodeInfo.AccessibilityAction) ((C06220Ws) abstractList.get(i5)).A03).getLabel())) {
                        i2 = ((AccessibilityNodeInfo.AccessibilityAction) ((C06220Ws) abstractList.get(i5)).A03).getId();
                        break;
                    } else {
                        i5++;
                    }
                }
                if (i2 != -1) {
                    C06560Yg.A0Q(view2, new C06220Ws(r13, string, (Class) null, (Object) null, i2));
                }
                sparseIntArray.put(i3, i2);
            }
            if (this.A0d && this.A0O != 5) {
                C06560Yg.A0R(view2, C06220Ws.A0D, new C1453074z(this, 5, 0), (CharSequence) null);
            }
            int i9 = this.A0O;
            if (i9 == 3) {
                if (this.A0b) {
                    i4 = 4;
                }
                r3 = C06220Ws.A09;
            } else if (i9 == 4) {
                if (this.A0b) {
                    i4 = 3;
                }
                r3 = C06220Ws.A0H;
            } else if (i9 == 6) {
                C06560Yg.A0R(view2, C06220Ws.A09, new C1453074z(this, 4, 0), (CharSequence) null);
                C06560Yg.A0R(view2, C06220Ws.A0H, new C1453074z(this, 3, 0), (CharSequence) null);
                return;
            } else {
                return;
            }
            C06560Yg.A0R(view2, r3, new C1453074z(this, i4, 0), (CharSequence) null);
        }
    }

    public void A0Z(AnonymousClass7XV r3) {
        ArrayList arrayList = this.A0u;
        if (!arrayList.contains(r3)) {
            arrayList.add(r3);
        }
    }

    @Deprecated
    public void A0a(AnonymousClass7XV r3) {
        Log.w("BottomSheetBehavior", "BottomSheetBehavior now supports multiple callbacks. `setBottomSheetCallback()` removes all existing callbacks, including ones set internally by library authors, which may result in unintended behavior. This may change in the future. Please use `addBottomSheetCallback()` and `removeBottomSheetCallback()` instead to set your own callbacks.");
        ArrayList arrayList = this.A0u;
        arrayList.clear();
        if (r3 != null) {
            arrayList.add(r3);
        }
    }

    public void A0b(boolean z) {
        if (this instanceof CameraBottomSheetBehavior) {
            ((CameraBottomSheetBehavior) this).A00 = z;
        } else if (this instanceof LockableBottomSheetBehavior) {
            ((LockableBottomSheetBehavior) this).A00 = z;
        } else {
            this.A0Z = z;
        }
    }

    public void A0c(boolean z) {
        int i;
        if (this.A0b != z) {
            this.A0b = z;
            if (this.A0X != null) {
                A0O();
            }
            if (!z || this.A0O != 6) {
                i = this.A0O;
            } else {
                i = 3;
            }
            A0T(i);
            A0V(this.A0O, true);
            A0P();
        }
    }

    public void A0d(boolean z) {
        if (this.A0d != z) {
            this.A0d = z;
            if (!z && this.A0O == 5) {
                A0S(4);
            }
            A0P();
        }
    }

    public boolean A0e(View view, float f) {
        if (this.A0p) {
            return true;
        }
        if (view.getTop() < this.A06) {
            return false;
        }
        if (AnonymousClass002.A00(((float) view.getTop()) + (f * this.A02), (float) this.A06) / ((float) A0M()) <= 0.5f) {
            return false;
        }
        return true;
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int dimensionPixelOffset;
        this.A0K = context.getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1463179t.A04);
        if (obtainStyledAttributes.hasValue(3)) {
            this.A0Q = C160917of.A00(context, obtainStyledAttributes, 3);
        }
        if (obtainStyledAttributes.hasValue(21)) {
            this.A0U = new C161877ql(C161877ql.A01(context, attributeSet, R.attr.f3nameremoved, R.style.f12nameremoved));
        }
        C161877ql r1 = this.A0U;
        if (r1 != null) {
            AnonymousClass6D7 r0 = new AnonymousClass6D7(r1);
            this.A0T = r0;
            r0.A05(context);
            ColorStateList colorStateList = this.A0Q;
            if (colorStateList != null) {
                this.A0T.A06(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(16842801, typedValue, true);
                this.A0T.setTint(typedValue.data);
            }
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        this.A0P = ofFloat;
        ofFloat.setDuration(500);
        C86604Kt.A0w(this.A0P, this, 2);
        this.A00 = obtainStyledAttributes.getDimension(2, -1.0f);
        if (obtainStyledAttributes.hasValue(0)) {
            this.A0G = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        }
        if (obtainStyledAttributes.hasValue(1)) {
            this.A0F = obtainStyledAttributes.getDimensionPixelSize(1, -1);
        }
        TypedValue peekValue = obtainStyledAttributes.peekValue(9);
        if (peekValue == null || peekValue.data != -1) {
            A0U(obtainStyledAttributes.getDimensionPixelSize(9, -1), false);
        } else {
            A0U(-1, false);
        }
        A0d(obtainStyledAttributes.getBoolean(8, false));
        this.A0c = obtainStyledAttributes.getBoolean(13, false);
        A0c(obtainStyledAttributes.getBoolean(6, true));
        this.A0p = obtainStyledAttributes.getBoolean(12, false);
        A0b(obtainStyledAttributes.getBoolean(4, true));
        this.A0M = obtainStyledAttributes.getInt(10, 0);
        float f = obtainStyledAttributes.getFloat(7, 0.5f);
        if (f <= 0.0f || f >= 1.0f) {
            throw AnonymousClass001.A0c("ratio must be a float value between 0 and 1");
        }
        this.A01 = f;
        if (this.A0X != null) {
            this.A0A = (int) (((float) this.A0H) * (1.0f - f));
        }
        TypedValue peekValue2 = obtainStyledAttributes.peekValue(5);
        if (peekValue2 == null || peekValue2.type != 16) {
            dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(5, 0);
        } else {
            dimensionPixelOffset = peekValue2.data;
        }
        if (dimensionPixelOffset >= 0) {
            this.A07 = dimensionPixelOffset;
            A0V(this.A0O, true);
            this.A0N = obtainStyledAttributes.getInt(11, 500);
            this.A0j = obtainStyledAttributes.getBoolean(17, false);
            this.A0k = obtainStyledAttributes.getBoolean(18, false);
            this.A0l = obtainStyledAttributes.getBoolean(19, false);
            this.A0m = obtainStyledAttributes.getBoolean(20, true);
            this.A0f = obtainStyledAttributes.getBoolean(14, false);
            this.A0g = obtainStyledAttributes.getBoolean(15, false);
            this.A0h = obtainStyledAttributes.getBoolean(16, false);
            this.A0o = obtainStyledAttributes.getBoolean(23, true);
            obtainStyledAttributes.recycle();
            this.A03 = (float) ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
            return;
        }
        throw AnonymousClass001.A0c("offset must be greater than or equal to 0");
    }

    public static final int A00(int i, int i2, int i3, int i4) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, i2, i4);
        if (i3 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i3), 1073741824);
        }
        if (size != 0) {
            i3 = Math.min(size, i3);
        }
        return View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
    }

    public static BottomSheetBehavior A01(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof C002002f) {
            C05630Ug r1 = ((C002002f) layoutParams).A0A;
            if (r1 instanceof BottomSheetBehavior) {
                return (BottomSheetBehavior) r1;
            }
            throw AnonymousClass001.A0c("The view is not associated with BottomSheetBehavior");
        }
        throw AnonymousClass001.A0c("The view is not a child of CoordinatorLayout");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002b, code lost:
        if (r5.getTop() > r4.A0A) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x006e, code lost:
        if (X.AnonymousClass001.A0A(r2, r4.A08) < X.AnonymousClass001.A0A(r2, r4.A06)) goto L_0x002e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x007b, code lost:
        if (r2 < X.AnonymousClass001.A0A(r2, r4.A06)) goto L_0x002e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0092, code lost:
        if (X.AnonymousClass001.A0A(r2, r0) < X.AnonymousClass001.A0A(r2, r4.A06)) goto L_0x002d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0A(android.view.View r5, android.view.View r6, androidx.coordinatorlayout.widget.CoordinatorLayout r7, int r8) {
        /*
            r4 = this;
            int r1 = r5.getTop()
            int r0 = r4.A0K()
            r3 = 3
            if (r1 != r0) goto L_0x000f
            r4.A0T(r3)
        L_0x000e:
            return
        L_0x000f:
            java.lang.ref.WeakReference r0 = r4.A0W
            if (r0 == 0) goto L_0x000e
            java.lang.Object r0 = r0.get()
            if (r6 != r0) goto L_0x000e
            boolean r0 = r4.A0i
            if (r0 == 0) goto L_0x000e
            int r0 = r4.A0E
            if (r0 <= 0) goto L_0x0035
            boolean r0 = r4.A0b
            if (r0 != 0) goto L_0x002e
            int r1 = r5.getTop()
            int r0 = r4.A0A
            if (r1 <= r0) goto L_0x002e
        L_0x002d:
            r3 = 6
        L_0x002e:
            r0 = 0
            r4.A0Y(r5, r3, r0)
            r4.A0i = r0
            return
        L_0x0035:
            boolean r0 = r4.A0d
            if (r0 == 0) goto L_0x0056
            android.view.VelocityTracker r2 = r4.A0R
            if (r2 != 0) goto L_0x0046
            r0 = 0
        L_0x003e:
            boolean r0 = r4.A0e(r5, r0)
            if (r0 == 0) goto L_0x0056
            r3 = 5
            goto L_0x002e
        L_0x0046:
            r1 = 1000(0x3e8, float:1.401E-42)
            float r0 = r4.A03
            r2.computeCurrentVelocity(r1, r0)
            android.view.VelocityTracker r1 = r4.A0R
            int r0 = r4.A04
            float r0 = r1.getYVelocity(r0)
            goto L_0x003e
        L_0x0056:
            int r0 = r4.A0E
            if (r0 != 0) goto L_0x007e
            int r2 = r5.getTop()
            boolean r0 = r4.A0b
            if (r0 == 0) goto L_0x0071
            int r0 = r4.A08
            int r1 = X.AnonymousClass001.A0A(r2, r0)
            int r0 = r4.A06
            int r0 = X.AnonymousClass001.A0A(r2, r0)
            if (r1 >= r0) goto L_0x0095
            goto L_0x002e
        L_0x0071:
            int r0 = r4.A0A
            if (r2 >= r0) goto L_0x0088
            int r0 = r4.A06
            int r0 = X.AnonymousClass001.A0A(r2, r0)
            if (r2 >= r0) goto L_0x002d
            goto L_0x002e
        L_0x007e:
            boolean r0 = r4.A0b
            if (r0 != 0) goto L_0x0095
            int r2 = r5.getTop()
            int r0 = r4.A0A
        L_0x0088:
            int r1 = X.AnonymousClass001.A0A(r2, r0)
            int r0 = r4.A06
            int r0 = X.AnonymousClass001.A0A(r2, r0)
            if (r1 >= r0) goto L_0x0095
            goto L_0x002d
        L_0x0095:
            r3 = 4
            goto L_0x002e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.A0A(android.view.View, android.view.View, androidx.coordinatorlayout.widget.CoordinatorLayout, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0087, code lost:
        if (r12.A0F(r11, r1, r9.A0B) != false) goto L_0x0089;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0E(android.view.MotionEvent r10, android.view.View r11, androidx.coordinatorlayout.widget.CoordinatorLayout r12) {
        /*
            r9 = this;
            boolean r0 = r11.isShown()
            r2 = 0
            r4 = 1
            if (r0 == 0) goto L_0x00c1
            boolean r0 = r9.A0Z
            if (r0 == 0) goto L_0x00c1
            int r6 = r10.getActionMasked()
            if (r6 != 0) goto L_0x001f
            r0 = -1
            r9.A04 = r0
            android.view.VelocityTracker r0 = r9.A0R
            if (r0 == 0) goto L_0x001f
            r0.recycle()
            r0 = 0
            r9.A0R = r0
        L_0x001f:
            android.view.VelocityTracker r0 = r9.A0R
            if (r0 != 0) goto L_0x0029
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r9.A0R = r0
        L_0x0029:
            r0.addMovement(r10)
            r3 = 0
            r7 = -1
            r5 = 2
            if (r6 == 0) goto L_0x0050
            if (r6 == r4) goto L_0x0045
            r0 = 3
            if (r6 == r0) goto L_0x0045
        L_0x0036:
            boolean r0 = r9.A0e
            if (r0 != 0) goto L_0x008d
            X.0WM r0 = r9.A0S
            if (r0 == 0) goto L_0x008d
            boolean r0 = r0.A0E(r10)
            if (r0 == 0) goto L_0x008d
            return r4
        L_0x0045:
            r9.A0q = r2
            r9.A04 = r7
            boolean r0 = r9.A0e
            if (r0 == 0) goto L_0x0036
            r9.A0e = r2
            return r2
        L_0x0050:
            float r0 = r10.getX()
            int r1 = (int) r0
            float r0 = r10.getY()
            int r8 = (int) r0
            r9.A0B = r8
            int r0 = r9.A0O
            if (r0 == r5) goto L_0x007c
            java.lang.ref.WeakReference r0 = r9.A0W
            if (r0 == 0) goto L_0x007c
            android.view.View r0 = X.C86664Kz.A0j(r0)
            if (r0 == 0) goto L_0x007c
            boolean r0 = r12.A0F(r0, r1, r8)
            if (r0 == 0) goto L_0x007c
            int r0 = r10.getActionIndex()
            int r0 = r10.getPointerId(r0)
            r9.A04 = r0
            r9.A0q = r4
        L_0x007c:
            int r0 = r9.A04
            if (r0 != r7) goto L_0x0089
            int r0 = r9.A0B
            boolean r1 = r12.A0F(r11, r1, r0)
            r0 = 1
            if (r1 == 0) goto L_0x008a
        L_0x0089:
            r0 = 0
        L_0x008a:
            r9.A0e = r0
            goto L_0x0036
        L_0x008d:
            java.lang.ref.WeakReference r0 = r9.A0W
            if (r0 == 0) goto L_0x0095
            android.view.View r3 = X.C86664Kz.A0j(r0)
        L_0x0095:
            if (r6 != r5) goto L_0x00c3
            if (r3 == 0) goto L_0x00c3
            boolean r0 = r9.A0e
            if (r0 != 0) goto L_0x00c3
            int r0 = r9.A0O
            if (r0 == r4) goto L_0x00c3
            boolean r0 = X.AnonymousClass6C8.A1R(r10, r3, r12)
            if (r0 != 0) goto L_0x00c3
            X.0WM r0 = r9.A0S
            if (r0 == 0) goto L_0x00c3
            int r0 = r9.A0B
            float r1 = (float) r0
            float r0 = r10.getY()
            float r1 = X.AnonymousClass002.A00(r1, r0)
            X.0WM r0 = r9.A0S
            int r0 = r0.A06
            float r0 = (float) r0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x00c3
            r2 = 1
            return r2
        L_0x00c1:
            r9.A0e = r4
        L_0x00c3:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.A0E(android.view.MotionEvent, android.view.View, androidx.coordinatorlayout.widget.CoordinatorLayout):boolean");
    }

    public boolean A0F(MotionEvent motionEvent, View view, CoordinatorLayout coordinatorLayout) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        int i = this.A0O;
        if (i == 1 && actionMasked == 0) {
            return true;
        }
        AnonymousClass0WM r1 = this.A0S;
        if (r1 != null && (this.A0Z || i == 1)) {
            r1.A08(motionEvent);
        }
        if (actionMasked == 0) {
            this.A04 = -1;
            VelocityTracker velocityTracker = this.A0R;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.A0R = null;
            }
        }
        VelocityTracker velocityTracker2 = this.A0R;
        if (velocityTracker2 == null) {
            velocityTracker2 = VelocityTracker.obtain();
            this.A0R = velocityTracker2;
        }
        velocityTracker2.addMovement(motionEvent);
        if (this.A0S != null && ((this.A0Z || this.A0O == 1) && actionMasked == 2 && !this.A0e)) {
            float A002 = AnonymousClass002.A00((float) this.A0B, motionEvent.getY());
            AnonymousClass0WM r12 = this.A0S;
            if (A002 > ((float) r12.A06)) {
                r12.A0A(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.A0e;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002e, code lost:
        if (r7.A0n != false) goto L_0x0030;
     */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00e0 A[LOOP:0: B:49:0x00d8->B:51:0x00e0, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0125 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0I(android.view.View r8, androidx.coordinatorlayout.widget.CoordinatorLayout r9, int r10) {
        /*
            r7 = this;
            boolean r0 = X.AnonymousClass0YY.A0B(r9)
            r2 = 1
            if (r0 == 0) goto L_0x0010
            boolean r0 = X.AnonymousClass0YY.A0B(r8)
            if (r0 != 0) goto L_0x0010
            r8.setFitsSystemWindows(r2)
        L_0x0010:
            java.lang.ref.WeakReference r0 = r7.A0X
            if (r0 != 0) goto L_0x0073
            android.content.res.Resources r1 = r9.getResources()
            r0 = 2131166185(0x7f0703e9, float:1.7946608E38)
            int r0 = r1.getDimensionPixelSize(r0)
            r7.A0L = r0
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 29
            if (r1 < r0) goto L_0x0030
            boolean r0 = r7.A0c
            if (r0 != 0) goto L_0x0030
            boolean r0 = r7.A0n
            r1 = 1
            if (r0 == 0) goto L_0x0031
        L_0x0030:
            r1 = 0
        L_0x0031:
            boolean r0 = r7.A0j
            if (r0 != 0) goto L_0x011b
            boolean r0 = r7.A0k
            if (r0 != 0) goto L_0x011b
            boolean r0 = r7.A0l
            if (r0 != 0) goto L_0x011b
            boolean r0 = r7.A0f
            if (r0 != 0) goto L_0x011b
            boolean r0 = r7.A0g
            if (r0 != 0) goto L_0x011b
            boolean r0 = r7.A0h
            if (r0 != 0) goto L_0x011b
            if (r1 != 0) goto L_0x011b
        L_0x004b:
            java.lang.ref.WeakReference r0 = X.AnonymousClass0x9.A14(r8)
            r7.A0X = r0
            X.6D7 r3 = r7.A0T
            if (r3 == 0) goto L_0x0112
            X.AnonymousClass0YY.A04(r3, r8)
            float r1 = r7.A00
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x0064
            float r1 = X.AnonymousClass0YZ.A00(r8)
        L_0x0064:
            r3.A04(r1)
        L_0x0067:
            r7.A0P()
            int r0 = X.AnonymousClass0YY.A00(r8)
            if (r0 != 0) goto L_0x0073
            X.AnonymousClass0YY.A06(r8, r2)
        L_0x0073:
            X.0WM r0 = r7.A0S
            if (r0 != 0) goto L_0x007f
            X.0Qt r0 = r7.A0s
            X.0WM r0 = X.AnonymousClass0WM.A00(r9, r0)
            r7.A0S = r0
        L_0x007f:
            int r5 = r8.getTop()
            r9.A0B(r8, r10)
            int r0 = r9.getWidth()
            r7.A0I = r0
            int r0 = r9.getHeight()
            r7.A0H = r0
            int r3 = r8.getHeight()
            r7.A05 = r3
            int r6 = r7.A0H
            int r0 = r6 - r3
            int r1 = r7.A0D
            if (r0 >= r1) goto L_0x00a7
            boolean r0 = r7.A0m
            if (r0 == 0) goto L_0x010d
            r7.A05 = r6
            r3 = r6
        L_0x00a7:
            int r0 = r6 - r3
            r3 = 0
            int r0 = java.lang.Math.max(r3, r0)
            r7.A08 = r0
            float r4 = (float) r6
            r1 = 1065353216(0x3f800000, float:1.0)
            float r0 = r7.A01
            float r1 = r1 - r0
            float r4 = r4 * r1
            int r4 = (int) r4
            r7.A0A = r4
            r7.A0O()
            int r1 = r7.A0O
            r0 = 3
            if (r1 != r0) goto L_0x00ec
            int r6 = r7.A0K()
        L_0x00c6:
            X.C06560Yg.A0J(r8, r6)
        L_0x00c9:
            int r0 = r7.A0O
            r7.A0V(r0, r3)
            android.view.View r0 = r7.A0N(r8)
            java.lang.ref.WeakReference r0 = X.AnonymousClass0x9.A14(r0)
            r7.A0W = r0
        L_0x00d8:
            java.util.ArrayList r1 = r7.A0u
            int r0 = r1.size()
            if (r3 >= r0) goto L_0x0125
            java.lang.Object r0 = r1.get(r3)
            X.7XV r0 = (X.AnonymousClass7XV) r0
            r0.A01(r8)
            int r3 = r3 + 1
            goto L_0x00d8
        L_0x00ec:
            r0 = 6
            if (r1 != r0) goto L_0x00f1
            r6 = r4
            goto L_0x00c6
        L_0x00f1:
            boolean r0 = r7.A0d
            if (r0 == 0) goto L_0x00f9
            r0 = 5
            if (r1 != r0) goto L_0x00f9
            goto L_0x00c6
        L_0x00f9:
            r0 = 4
            if (r1 != r0) goto L_0x00ff
            int r6 = r7.A06
            goto L_0x00c6
        L_0x00ff:
            if (r1 == r2) goto L_0x0104
            r0 = 2
            if (r1 != r0) goto L_0x00c9
        L_0x0104:
            int r0 = r8.getTop()
            int r5 = r5 - r0
            X.C06560Yg.A0J(r8, r5)
            goto L_0x00c9
        L_0x010d:
            int r3 = r6 - r1
            r7.A05 = r3
            goto L_0x00a7
        L_0x0112:
            android.content.res.ColorStateList r0 = r7.A0Q
            if (r0 == 0) goto L_0x0067
            X.C06560Yg.A0C(r0, r8)
            goto L_0x0067
        L_0x011b:
            X.8Br r0 = new X.8Br
            r0.<init>(r7, r1)
            X.C159337lf.A02(r8, r0)
            goto L_0x004b
        L_0x0125:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.A0I(android.view.View, androidx.coordinatorlayout.widget.CoordinatorLayout, int):boolean");
    }

    public boolean A0J(View view, CoordinatorLayout coordinatorLayout, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams A0T2 = AnonymousClass001.A0T(view);
        view.measure(A00(i, AnonymousClass000.A02(coordinatorLayout) + A0T2.leftMargin + A0T2.rightMargin + i2, this.A0G, A0T2.width), A00(i3, AnonymousClass000.A03(coordinatorLayout) + A0T2.topMargin + A0T2.bottomMargin, this.A0F, A0T2.height));
        return true;
    }

    public View A0N(View view) {
        if (view.getVisibility() == 0) {
            if (AnonymousClass0YZ.A0H(view)) {
                return view;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View A0N2 = A0N(viewGroup.getChildAt(i));
                    if (A0N2 != null) {
                        return A0N2;
                    }
                }
            }
        }
        return null;
    }

    public final void A0O() {
        int A0M2 = A0M();
        boolean z = this.A0b;
        int i = this.A0H - A0M2;
        if (z) {
            this.A06 = Math.max(i, this.A08);
        } else {
            this.A06 = i;
        }
    }

    public void A0C(View view, View view2, CoordinatorLayout coordinatorLayout, int[] iArr, int i, int i2, int i3, int i4, int i5) {
    }

    public BottomSheetBehavior() {
    }
}
