package X;

import android.util.Log;
import android.view.View;
import android.view.ViewParent;

/* renamed from: X.0Qf  reason: invalid class name and case insensitive filesystem */
public class C04680Qf {
    public ViewParent A00;
    public ViewParent A01;
    public boolean A02;
    public int[] A03;
    public final View A04;

    public boolean A06(int[] iArr, int[] iArr2, int i, int i2, int i3) {
        ViewParent viewParent;
        int i4;
        int i5;
        int[] iArr3 = iArr;
        if (this.A02) {
            int i6 = i3;
            if (i3 != 0) {
                viewParent = this.A00;
            } else {
                viewParent = this.A01;
            }
            if (viewParent != null) {
                int i7 = i;
                int i8 = i2;
                if (i != 0 || i2 != 0) {
                    if (iArr2 != null) {
                        this.A04.getLocationInWindow(iArr2);
                        i4 = iArr2[0];
                        i5 = iArr2[1];
                    } else {
                        i4 = 0;
                        i5 = 0;
                    }
                    if (iArr == null && (iArr3 = this.A03) == null) {
                        iArr3 = new int[2];
                        this.A03 = iArr3;
                    }
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                    View view = this.A04;
                    if (viewParent instanceof C17270vF) {
                        ((C17270vF) viewParent).BWu(view, iArr3, i7, i8, i6);
                    } else if (i3 == 0) {
                        try {
                            C06490Xx.A03(view, viewParent, iArr3, i7, i8);
                        } catch (AbstractMethodError e) {
                            A01(" does not implement interface method onNestedPreScroll", A00(viewParent), e);
                        }
                    }
                    if (iArr2 != null) {
                        view.getLocationInWindow(iArr2);
                        iArr2[0] = iArr2[0] - i4;
                        iArr2[1] = iArr2[1] - i5;
                    }
                    if (!(iArr3[0] == 0 && iArr3[1] == 0)) {
                        return true;
                    }
                } else if (iArr2 != null) {
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                }
            }
        }
        return false;
    }

    public static StringBuilder A00(Object obj) {
        StringBuilder sb = new StringBuilder();
        sb.append("ViewParent ");
        sb.append(obj);
        return sb;
    }

    public void A02(int i) {
        ViewParent viewParent;
        if (i != 0) {
            viewParent = this.A00;
        } else {
            viewParent = this.A01;
        }
        if (viewParent != null) {
            View view = this.A04;
            if (viewParent instanceof C17270vF) {
                ((C17270vF) viewParent).Bcp(view, i);
            } else if (i == 0) {
                try {
                    C06490Xx.A01(view, viewParent);
                } catch (AbstractMethodError e) {
                    A01(" does not implement interface method onStopNestedScroll", A00(viewParent), e);
                }
            }
            if (i != 0) {
                this.A00 = null;
            } else {
                this.A01 = null;
            }
        }
    }

    public boolean A03(float f, float f2) {
        ViewParent viewParent;
        if (!this.A02 || (viewParent = this.A01) == null) {
            return false;
        }
        try {
            return C06490Xx.A05(this.A04, viewParent, f, f2);
        } catch (AbstractMethodError e) {
            A01(" does not implement interface method onNestedPreFling", A00(viewParent), e);
            return false;
        }
    }

    public boolean A04(float f, float f2, boolean z) {
        ViewParent viewParent;
        if (!this.A02 || (viewParent = this.A01) == null) {
            return false;
        }
        try {
            return C06490Xx.A06(this.A04, viewParent, f, f2, z);
        } catch (AbstractMethodError e) {
            A01(" does not implement interface method onNestedFling", A00(viewParent), e);
            return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0051 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A05(int r8, int r9) {
        /*
            r7 = this;
            if (r9 == 0) goto L_0x0056
            android.view.ViewParent r0 = r7.A00
        L_0x0004:
            boolean r0 = X.AnonymousClass000.A1W(r0)
            r6 = 1
            if (r0 != 0) goto L_0x0032
            boolean r0 = r7.A02
            if (r0 == 0) goto L_0x0069
            android.view.View r5 = r7.A04
            android.view.ViewParent r4 = r5.getParent()
            r3 = r5
        L_0x0016:
            if (r4 == 0) goto L_0x0069
            boolean r0 = r4 instanceof X.C17270vF
            if (r0 == 0) goto L_0x0039
            r0 = r4
            X.0vF r0 = (X.C17270vF) r0
            boolean r0 = r0.BcD(r3, r5, r8, r9)
        L_0x0023:
            if (r0 == 0) goto L_0x004a
            if (r9 == 0) goto L_0x0036
            r7.A00 = r4
        L_0x0029:
            boolean r0 = r4 instanceof X.C17270vF
            if (r0 == 0) goto L_0x0033
            X.0vF r4 = (X.C17270vF) r4
            r4.BWx(r3, r5, r8, r9)
        L_0x0032:
            return r6
        L_0x0033:
            if (r9 != 0) goto L_0x0032
            goto L_0x0059
        L_0x0036:
            r7.A01 = r4
            goto L_0x0029
        L_0x0039:
            if (r9 != 0) goto L_0x004a
            boolean r0 = X.C06490Xx.A04(r3, r5, r4, r8)     // Catch:{ AbstractMethodError -> 0x0040 }
            goto L_0x0023
        L_0x0040:
            r2 = move-exception
            java.lang.StringBuilder r1 = A00(r4)
            java.lang.String r0 = " does not implement interface method onStartNestedScroll"
            A01(r0, r1, r2)
        L_0x004a:
            boolean r0 = r4 instanceof android.view.View
            if (r0 == 0) goto L_0x0051
            r3 = r4
            android.view.View r3 = (android.view.View) r3
        L_0x0051:
            android.view.ViewParent r4 = r4.getParent()
            goto L_0x0016
        L_0x0056:
            android.view.ViewParent r0 = r7.A01
            goto L_0x0004
        L_0x0059:
            X.C06490Xx.A00(r3, r5, r4, r8)     // Catch:{ AbstractMethodError -> 0x005d }
            goto L_0x0068
        L_0x005d:
            r2 = move-exception
            java.lang.StringBuilder r1 = A00(r4)
            java.lang.String r0 = " does not implement interface method onNestedScrollAccepted"
            A01(r0, r1, r2)
            return r6
        L_0x0068:
            return r6
        L_0x0069:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C04680Qf.A05(int, int):boolean");
    }

    public final boolean A07(int[] iArr, int[] iArr2, int i, int i2, int i3, int i4, int i5) {
        ViewParent viewParent;
        int i6;
        int i7;
        int[] iArr3 = iArr2;
        if (this.A02) {
            int i8 = i5;
            if (i5 != 0) {
                viewParent = this.A00;
            } else {
                viewParent = this.A01;
            }
            if (viewParent != null) {
                int[] iArr4 = iArr;
                int i9 = i;
                int i10 = i2;
                int i11 = i3;
                int i12 = i4;
                if (i != 0 || i2 != 0 || i3 != 0 || i4 != 0) {
                    if (iArr != null) {
                        this.A04.getLocationInWindow(iArr4);
                        i6 = iArr[0];
                        i7 = iArr[1];
                    } else {
                        i6 = 0;
                        i7 = 0;
                    }
                    if (iArr2 == null) {
                        iArr3 = this.A03;
                        if (iArr3 == null) {
                            iArr3 = new int[2];
                            this.A03 = iArr3;
                        }
                        iArr3[0] = 0;
                        iArr3[1] = 0;
                    }
                    View view = this.A04;
                    if (viewParent instanceof C17260vE) {
                        ((C17260vE) viewParent).BWw(view, iArr3, i9, i10, i11, i12, i8);
                    } else {
                        iArr3[0] = iArr3[0] + i3;
                        iArr3[1] = iArr3[1] + i4;
                        if (viewParent instanceof C17270vF) {
                            ((C17270vF) viewParent).BWv(view, i9, i10, i11, i12, i8);
                        } else if (i5 == 0) {
                            try {
                                C06490Xx.A02(view, viewParent, i9, i10, i11, i12);
                            } catch (AbstractMethodError e) {
                                A01(" does not implement interface method onNestedScroll", A00(viewParent), e);
                            }
                        }
                    }
                    if (iArr != null) {
                        view.getLocationInWindow(iArr4);
                        iArr[0] = iArr[0] - i6;
                        iArr[1] = iArr[1] - i7;
                    }
                    return true;
                } else if (iArr != null) {
                    iArr[0] = 0;
                    iArr[1] = 0;
                }
            }
        }
        return false;
    }

    public C04680Qf(View view) {
        this.A04 = view;
    }

    public static void A01(String str, StringBuilder sb, Throwable th) {
        sb.append(str);
        Log.e("ViewParentCompat", sb.toString(), th);
    }
}
