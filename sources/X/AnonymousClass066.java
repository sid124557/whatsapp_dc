package X;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.066  reason: invalid class name */
public abstract class AnonymousClass066 extends AnonymousClass0WH {
    public static final Rect A0A = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
    public static final C15030qf A0B = new C08220da();
    public int A00 = Integer.MIN_VALUE;
    public int A01 = Integer.MIN_VALUE;
    public int A02 = Integer.MIN_VALUE;
    public AnonymousClass06O A03;
    public final Rect A04 = AnonymousClass001.A0N();
    public final Rect A05 = AnonymousClass001.A0N();
    public final Rect A06 = AnonymousClass001.A0N();
    public final View A07;
    public final AccessibilityManager A08;
    public final int[] A09 = new int[2];

    public static int A00(Rect rect, Rect rect2, int i) {
        int i2;
        int i3;
        if (i == 17) {
            i2 = rect.left;
            i3 = rect2.right;
        } else if (i == 33) {
            i2 = rect.top;
            i3 = rect2.bottom;
        } else if (i == 66) {
            i2 = rect2.left;
            i3 = rect.right;
        } else if (i == 130) {
            i2 = rect2.top;
            i3 = rect.bottom;
        } else {
            throw AnonymousClass001.A0c("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        return AnonymousClass001.A0C(i2, i3, 0);
    }

    public abstract int A0E(float f, float f2);

    public C05650Ui A0F(int i) {
        if (i != -1) {
            return A0G(i);
        }
        View view = this.A07;
        C05650Ui r5 = new C05650Ui(AccessibilityNodeInfo.obtain(view));
        AccessibilityNodeInfo accessibilityNodeInfo = r5.A01;
        view.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        ArrayList A0s = AnonymousClass001.A0s();
        A0M(A0s);
        if (accessibilityNodeInfo.getChildCount() <= 0 || A0s.size() <= 0) {
            int size = A0s.size();
            for (int i2 = 0; i2 < size; i2++) {
                accessibilityNodeInfo.addChild(view, AnonymousClass001.A0K(A0s.get(i2)));
            }
            return r5;
        }
        throw AnonymousClass002.A0E("Views cannot have both real and virtual children");
    }

    public abstract void A0L(C05650Ui r1, int i);

    public abstract void A0M(List list);

    public abstract boolean A0P(int i, int i2, Bundle bundle);

    public static int A01(Rect rect, Rect rect2, int i) {
        int i2;
        int i3;
        int i4;
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw AnonymousClass001.A0c("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            i2 = rect.left + (rect.width() / 2);
            i3 = rect2.left;
            i4 = rect2.width();
            return AnonymousClass001.A0A(i2, i3 + (i4 / 2));
        }
        i2 = rect.top + (rect.height() / 2);
        i3 = rect2.top;
        i4 = rect2.height();
        return AnonymousClass001.A0A(i2, i3 + (i4 / 2));
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x002f A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A02(android.graphics.Rect r3, android.graphics.Rect r4, int r5) {
        /*
            r0 = 17
            r2 = 1
            if (r5 == r0) goto L_0x0023
            r0 = 33
            if (r5 == r0) goto L_0x0018
            r0 = 66
            if (r5 == r0) goto L_0x0023
            r0 = 130(0x82, float:1.82E-43)
            if (r5 == r0) goto L_0x0018
            java.lang.String r0 = "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A0c(r0)
            throw r0
        L_0x0018:
            int r1 = r4.right
            int r0 = r3.left
            if (r1 < r0) goto L_0x0030
            int r1 = r4.left
            int r0 = r3.right
            goto L_0x002d
        L_0x0023:
            int r1 = r4.bottom
            int r0 = r3.top
            if (r1 < r0) goto L_0x0030
            int r1 = r4.top
            int r0 = r3.bottom
        L_0x002d:
            if (r1 > r0) goto L_0x0030
            return r2
        L_0x0030:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass066.A02(android.graphics.Rect, android.graphics.Rect, int):boolean");
    }

    public static boolean A03(Rect rect, Rect rect2, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        if (i == 17) {
            int i6 = rect.right;
            int i7 = rect2.right;
            if (i6 <= i7 && rect.left < i7) {
                return false;
            }
            i2 = rect.left;
            i3 = rect2.left;
        } else if (i != 33) {
            if (i == 66) {
                int i8 = rect.left;
                int i9 = rect2.left;
                if (i8 >= i9 && rect.right > i9) {
                    return false;
                }
                i4 = rect.right;
                i5 = rect2.right;
            } else if (i == 130) {
                int i10 = rect.top;
                int i11 = rect2.top;
                if (i10 >= i11 && rect.bottom > i11) {
                    return false;
                }
                i4 = rect.bottom;
                i5 = rect2.bottom;
            } else {
                throw AnonymousClass001.A0c("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            if (i4 < i5) {
                return true;
            }
            return false;
        } else {
            int i12 = rect.bottom;
            int i13 = rect2.bottom;
            if (i12 <= i13 && rect.top < i13) {
                return false;
            }
            i2 = rect.top;
            i3 = rect2.top;
        }
        if (i2 > i3) {
            return true;
        }
        return false;
    }

    public AnonymousClass0U3 A0C(View view) {
        AnonymousClass06O r0 = this.A03;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass06O r02 = new AnonymousClass06O(this);
        this.A03 = r02;
        return r02;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r3 = r4.A07;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0H() {
        /*
            r4 = this;
            android.view.accessibility.AccessibilityManager r0 = r4.A08
            boolean r0 = r0.isEnabled()
            if (r0 == 0) goto L_0x0020
            android.view.View r3 = r4.A07
            android.view.ViewParent r2 = r3.getParent()
            if (r2 == 0) goto L_0x0020
            r0 = 2048(0x800, float:2.87E-42)
            android.view.accessibility.AccessibilityEvent r1 = android.view.accessibility.AccessibilityEvent.obtain(r0)
            r3.onInitializeAccessibilityEvent(r1)
            r0 = 1
            X.C05000Rm.A01(r1, r0)
            r2.requestSendAccessibilityEvent(r3, r1)
        L_0x0020:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass066.A0H():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000c, code lost:
        r3 = r6.A07;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0I(int r7, int r8) {
        /*
            r6 = this;
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r7 == r0) goto L_0x0082
            android.view.accessibility.AccessibilityManager r0 = r6.A08
            boolean r0 = r0.isEnabled()
            if (r0 == 0) goto L_0x0082
            android.view.View r3 = r6.A07
            android.view.ViewParent r2 = r3.getParent()
            if (r2 == 0) goto L_0x0082
            r0 = -1
            android.view.accessibility.AccessibilityEvent r1 = android.view.accessibility.AccessibilityEvent.obtain(r8)
            if (r7 == r0) goto L_0x007c
            X.0Ui r5 = r6.A0F(r7)
            java.util.List r4 = r1.getText()
            java.lang.CharSequence r0 = r5.A01()
            r4.add(r0)
            android.view.accessibility.AccessibilityNodeInfo r4 = r5.A01
            java.lang.CharSequence r0 = r4.getContentDescription()
            r1.setContentDescription(r0)
            boolean r0 = r4.isScrollable()
            r1.setScrollable(r0)
            boolean r0 = r4.isPassword()
            r1.setPassword(r0)
            boolean r0 = r4.isEnabled()
            r1.setEnabled(r0)
            boolean r0 = r4.isChecked()
            r1.setChecked(r0)
            java.util.List r0 = r1.getText()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0066
            java.lang.CharSequence r0 = r1.getContentDescription()
            if (r0 != 0) goto L_0x0066
            java.lang.String r0 = "Callbacks must add text or a content description in populateEventForVirtualViewId()"
            java.lang.RuntimeException r0 = X.AnonymousClass002.A0E(r0)
            throw r0
        L_0x0066:
            java.lang.CharSequence r0 = r4.getClassName()
            r1.setClassName(r0)
            X.AnonymousClass0IG.A00(r3, r1, r7)
            android.content.Context r0 = r3.getContext()
            java.lang.String r0 = r0.getPackageName()
            r1.setPackageName(r0)
            goto L_0x007f
        L_0x007c:
            r3.onInitializeAccessibilityEvent(r1)
        L_0x007f:
            r2.requestSendAccessibilityEvent(r3, r1)
        L_0x0082:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass066.A0I(int, int):void");
    }

    public final boolean A0N(int i) {
        if (this.A02 != i) {
            return false;
        }
        this.A02 = Integer.MIN_VALUE;
        A0J(i, false);
        A0I(i, 8);
        return true;
    }

    public final boolean A0O(int i) {
        int i2;
        View view = this.A07;
        if ((view.isFocused() || view.requestFocus()) && (i2 = this.A02) != i) {
            if (i2 != Integer.MIN_VALUE) {
                A0N(i2);
            }
            if (i != Integer.MIN_VALUE) {
                this.A02 = i;
                A0J(i, true);
                A0I(i, 8);
                return true;
            }
        }
        return false;
    }

    public final boolean A0S(MotionEvent motionEvent) {
        int i;
        AccessibilityManager accessibilityManager = this.A08;
        if (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 7 || action == 9) {
            int A0E = A0E(motionEvent.getX(), motionEvent.getY());
            int i2 = this.A01;
            if (i2 != A0E) {
                this.A01 = A0E;
                A0I(A0E, 128);
                A0I(i2, 256);
            }
            if (A0E != Integer.MIN_VALUE) {
                return true;
            }
            return false;
        } else if (action != 10 || (i = this.A01) == Integer.MIN_VALUE) {
            return false;
        } else {
            this.A01 = Integer.MIN_VALUE;
            A0I(i, 256);
            return true;
        }
    }

    public AnonymousClass066(View view) {
        if (view != null) {
            this.A07 = view;
            this.A08 = (AccessibilityManager) view.getContext().getSystemService("accessibility");
            view.setFocusable(true);
            if (AnonymousClass0YY.A00(view) == 0) {
                AnonymousClass0YY.A06(view, 1);
                return;
            }
            return;
        }
        throw AnonymousClass001.A0c("View may not be null");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0022, code lost:
        if (r1 <= r0) goto L_0x0024;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0061, code lost:
        if (r1 < r0) goto L_0x0064;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0064, code lost:
        r2 = false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A04(android.graphics.Rect r5, android.graphics.Rect r6, android.graphics.Rect r7, int r8) {
        /*
            boolean r1 = A02(r5, r6, r8)
            boolean r0 = A02(r5, r7, r8)
            r4 = 0
            if (r0 != 0) goto L_0x0048
            if (r1 == 0) goto L_0x0048
            r0 = 17
            r2 = 1
            if (r8 == r0) goto L_0x005d
            r0 = 33
            if (r8 == r0) goto L_0x0058
            r0 = 66
            if (r8 == r0) goto L_0x0053
            r0 = 130(0x82, float:1.82E-43)
            if (r8 != r0) goto L_0x006e
            int r1 = r5.bottom
            int r0 = r7.top
        L_0x0022:
            if (r1 > r0) goto L_0x0064
        L_0x0024:
            r3 = 1
            if (r2 == 0) goto L_0x006d
            r0 = 17
            if (r8 == r0) goto L_0x006d
            r1 = 66
            if (r8 == r1) goto L_0x006d
            int r2 = A00(r5, r6, r8)
            r0 = 33
            if (r8 == r0) goto L_0x004e
            if (r8 == r1) goto L_0x0049
            r0 = 130(0x82, float:1.82E-43)
            if (r8 != r0) goto L_0x0066
            int r1 = r7.bottom
            int r0 = r5.bottom
        L_0x0041:
            int r0 = X.AnonymousClass001.A0C(r1, r0, r3)
            if (r2 >= r0) goto L_0x0048
            r4 = 1
        L_0x0048:
            return r4
        L_0x0049:
            int r1 = r7.right
            int r0 = r5.right
            goto L_0x0041
        L_0x004e:
            int r1 = r5.top
            int r0 = r7.top
            goto L_0x0041
        L_0x0053:
            int r1 = r5.right
            int r0 = r7.left
            goto L_0x0022
        L_0x0058:
            int r1 = r5.top
            int r0 = r7.bottom
            goto L_0x0061
        L_0x005d:
            int r1 = r5.left
            int r0 = r7.right
        L_0x0061:
            if (r1 < r0) goto L_0x0064
            goto L_0x0024
        L_0x0064:
            r2 = 0
            goto L_0x0024
        L_0x0066:
            java.lang.String r0 = "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A0c(r0)
            throw r0
        L_0x006d:
            return r3
        L_0x006e:
            java.lang.String r0 = "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A0c(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass066.A04(android.graphics.Rect, android.graphics.Rect, android.graphics.Rect, int):boolean");
    }

    public void A0D(View view, C05650Ui r2) {
        super.A0D(view, r2);
        A0K(r2);
    }

    public final C05650Ui A0G(int i) {
        boolean z;
        C05650Ui r5 = new C05650Ui(AccessibilityNodeInfo.obtain());
        AccessibilityNodeInfo accessibilityNodeInfo = r5.A01;
        accessibilityNodeInfo.setEnabled(true);
        accessibilityNodeInfo.setFocusable(true);
        accessibilityNodeInfo.setClassName("android.view.View");
        Rect rect = A0A;
        accessibilityNodeInfo.setBoundsInParent(rect);
        accessibilityNodeInfo.setBoundsInScreen(rect);
        View view = this.A07;
        accessibilityNodeInfo.setParent(view);
        A0L(r5, i);
        if (r5.A01() == null && accessibilityNodeInfo.getContentDescription() == null) {
            throw AnonymousClass002.A0E("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        Rect rect2 = this.A04;
        accessibilityNodeInfo.getBoundsInParent(rect2);
        if (!rect2.equals(rect)) {
            int actions = accessibilityNodeInfo.getActions();
            if ((actions & 64) != 0) {
                throw AnonymousClass002.A0E("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            } else if ((actions & 128) == 0) {
                accessibilityNodeInfo.setPackageName(view.getContext().getPackageName());
                r5.A00 = i;
                accessibilityNodeInfo.setSource(view, i);
                if (this.A00 == i) {
                    accessibilityNodeInfo.setAccessibilityFocused(true);
                    accessibilityNodeInfo.addAction(128);
                } else {
                    accessibilityNodeInfo.setAccessibilityFocused(false);
                    accessibilityNodeInfo.addAction(64);
                }
                if (this.A02 == i) {
                    z = true;
                    accessibilityNodeInfo.addAction(2);
                } else {
                    z = false;
                    if (accessibilityNodeInfo.isFocusable()) {
                        accessibilityNodeInfo.addAction(1);
                    }
                }
                accessibilityNodeInfo.setFocused(z);
                int[] iArr = this.A09;
                view.getLocationOnScreen(iArr);
                Rect rect3 = this.A05;
                accessibilityNodeInfo.getBoundsInScreen(rect3);
                if (rect3.equals(rect)) {
                    accessibilityNodeInfo.getBoundsInParent(rect3);
                    rect3.offset(iArr[0] - view.getScrollX(), iArr[1] - view.getScrollY());
                }
                Rect rect4 = this.A06;
                if (view.getLocalVisibleRect(rect4)) {
                    rect4.offset(iArr[0] - view.getScrollX(), iArr[1] - view.getScrollY());
                    if (rect3.intersect(rect4)) {
                        accessibilityNodeInfo.setBoundsInScreen(rect3);
                        if (!rect3.isEmpty() && view.getWindowVisibility() == 0) {
                            ViewParent parent = view.getParent();
                            while (true) {
                                if (parent instanceof View) {
                                    View view2 = (View) parent;
                                    if (view2.getAlpha() <= 0.0f || view2.getVisibility() != 0) {
                                        break;
                                    }
                                    parent = view2.getParent();
                                } else if (parent != null) {
                                    accessibilityNodeInfo.setVisibleToUser(true);
                                }
                            }
                        }
                    }
                }
                return r5;
            } else {
                throw AnonymousClass002.A0E("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            }
        } else {
            throw AnonymousClass002.A0E("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
    }

    public void A0J(int i, boolean z) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:83:0x016b, code lost:
        if (r0 < r1) goto L_0x016d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0192, code lost:
        if (r0 >= 0) goto L_0x016d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A0Q(int r15, android.graphics.Rect r16) {
        /*
            r14 = this;
            java.util.ArrayList r4 = X.AnonymousClass001.A0s()
            r14.A0M(r4)
            X.0i5 r3 = new X.0i5
            r3.<init>()
            r2 = 0
        L_0x000d:
            int r0 = r4.size()
            if (r2 >= r0) goto L_0x002d
            java.lang.Object r0 = r4.get(r2)
            int r0 = X.AnonymousClass001.A0K(r0)
            X.0Ui r1 = r14.A0G(r0)
            java.lang.Object r0 = r4.get(r2)
            int r0 = X.AnonymousClass001.A0K(r0)
            r3.A03(r0, r1)
            int r2 = r2 + 1
            goto L_0x000d
        L_0x002d:
            int r1 = r14.A02
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 != r7) goto L_0x0051
            r8 = 0
        L_0x0034:
            r9 = 1
            if (r15 == r9) goto L_0x0139
            r0 = 2
            if (r15 == r0) goto L_0x0139
            r0 = 17
            if (r15 == r0) goto L_0x0057
            r0 = 33
            if (r15 == r0) goto L_0x0057
            r0 = 66
            if (r15 == r0) goto L_0x0057
            r0 = 130(0x82, float:1.82E-43)
            if (r15 == r0) goto L_0x0057
            java.lang.String r0 = "direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A0c(r0)
            throw r0
        L_0x0051:
            r0 = 0
            java.lang.Object r8 = r3.A01(r1, r0)
            goto L_0x0034
        L_0x0057:
            android.graphics.Rect r6 = X.AnonymousClass001.A0N()
            int r0 = r14.A02
            if (r0 == r7) goto L_0x00f2
            X.0Ui r0 = r14.A0F(r0)
            android.view.accessibility.AccessibilityNodeInfo r0 = r0.A01
            r0.getBoundsInParent(r6)
        L_0x0068:
            android.graphics.Rect r5 = new android.graphics.Rect
            r5.<init>(r6)
            r0 = 17
            r4 = 0
            if (r15 == r0) goto L_0x00e8
            r0 = 33
            if (r15 == r0) goto L_0x00e1
            r0 = 66
            if (r15 == r0) goto L_0x00d9
            r0 = 130(0x82, float:1.82E-43)
            if (r15 != r0) goto L_0x012b
            int r0 = r6.height()
            int r0 = r0 + 1
            int r0 = -r0
        L_0x0085:
            r5.offset(r4, r0)
        L_0x0088:
            int r13 = r3.A00
            android.graphics.Rect r12 = X.AnonymousClass001.A0N()
            r9 = 0
        L_0x008f:
            if (r4 >= r13) goto L_0x0171
            java.lang.Object[] r0 = r3.A02
            r11 = r0[r4]
            X.0Ui r11 = (X.C05650Ui) r11
            if (r11 == r8) goto L_0x00d6
            android.view.accessibility.AccessibilityNodeInfo r0 = r11.A01
            r0.getBoundsInParent(r12)
            boolean r0 = A03(r6, r12, r15)
            if (r0 == 0) goto L_0x00d6
            boolean r0 = A03(r6, r5, r15)
            if (r0 == 0) goto L_0x00d2
            boolean r0 = A04(r6, r12, r5, r15)
            if (r0 != 0) goto L_0x00d2
            boolean r0 = A04(r6, r5, r12, r15)
            if (r0 != 0) goto L_0x00d6
            int r1 = A00(r6, r12, r15)
            int r0 = A01(r6, r12, r15)
            int r10 = r1 * 13
            int r10 = r10 * r1
            int r0 = r0 * r0
            int r10 = r10 + r0
            int r2 = A00(r6, r5, r15)
            int r1 = A01(r6, r5, r15)
            int r0 = r2 * 13
            int r0 = r0 * r2
            int r1 = r1 * r1
            int r0 = r0 + r1
            if (r10 >= r0) goto L_0x00d6
        L_0x00d2:
            r5.set(r12)
            r9 = r11
        L_0x00d6:
            int r4 = r4 + 1
            goto L_0x008f
        L_0x00d9:
            int r0 = r6.width()
            int r0 = r0 + 1
            int r0 = -r0
            goto L_0x00ee
        L_0x00e1:
            int r0 = r6.height()
            int r0 = r0 + 1
            goto L_0x0085
        L_0x00e8:
            int r0 = r6.width()
            int r0 = r0 + 1
        L_0x00ee:
            r5.offset(r0, r4)
            goto L_0x0088
        L_0x00f2:
            r0 = r16
            if (r16 == 0) goto L_0x00fb
            r6.set(r0)
            goto L_0x0068
        L_0x00fb:
            android.view.View r0 = r14.A07
            int r5 = r0.getWidth()
            int r4 = r0.getHeight()
            r0 = 17
            r2 = 0
            if (r15 == r0) goto L_0x0126
            r0 = 33
            if (r15 == r0) goto L_0x0121
            r0 = 66
            r1 = -1
            if (r15 == r0) goto L_0x011c
            r0 = 130(0x82, float:1.82E-43)
            if (r15 != r0) goto L_0x0132
            r6.set(r2, r1, r5, r1)
            goto L_0x0068
        L_0x011c:
            r6.set(r1, r2, r1, r4)
            goto L_0x0068
        L_0x0121:
            r6.set(r2, r4, r5, r4)
            goto L_0x0068
        L_0x0126:
            r6.set(r5, r2, r5, r4)
            goto L_0x0068
        L_0x012b:
            java.lang.String r0 = "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A0c(r0)
            throw r0
        L_0x0132:
            java.lang.String r0 = "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A0c(r0)
            throw r0
        L_0x0139:
            android.view.View r0 = r14.A07
            int r0 = X.AnonymousClass0YH.A01(r0)
            boolean r6 = X.AnonymousClass000.A1U(r0, r9)
            X.0qf r5 = A0B
            int r4 = r3.A00
            java.util.ArrayList r2 = X.AnonymousClass002.A0I(r4)
            r1 = 0
        L_0x014c:
            if (r1 >= r4) goto L_0x0158
            java.lang.Object[] r0 = r3.A02
            r0 = r0[r1]
            r2.add(r0)
            int r1 = r1 + 1
            goto L_0x014c
        L_0x0158:
            X.0nA r0 = new X.0nA
            r0.<init>(r5, r6)
            java.util.Collections.sort(r2, r0)
            if (r15 == r9) goto L_0x0186
            int r1 = r2.size()
            if (r8 != 0) goto L_0x0181
            r0 = -1
        L_0x0169:
            int r0 = r0 + 1
            if (r0 >= r1) goto L_0x019a
        L_0x016d:
            java.lang.Object r9 = r2.get(r0)
        L_0x0171:
            if (r9 == 0) goto L_0x019a
            r1 = 0
        L_0x0174:
            int r0 = r3.A00
            if (r1 >= r0) goto L_0x0195
            java.lang.Object[] r0 = r3.A02
            r0 = r0[r1]
            if (r0 == r9) goto L_0x0196
            int r1 = r1 + 1
            goto L_0x0174
        L_0x0181:
            int r0 = r2.lastIndexOf(r8)
            goto L_0x0169
        L_0x0186:
            int r0 = r2.size()
            if (r8 == 0) goto L_0x0190
            int r0 = r2.indexOf(r8)
        L_0x0190:
            int r0 = r0 + -1
            if (r0 < 0) goto L_0x019a
            goto L_0x016d
        L_0x0195:
            r1 = -1
        L_0x0196:
            int[] r0 = r3.A01
            r7 = r0[r1]
        L_0x019a:
            boolean r0 = r14.A0O(r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass066.A0Q(int, android.graphics.Rect):boolean");
    }

    public final boolean A0R(KeyEvent keyEvent) {
        int i;
        int i2 = 0;
        if (keyEvent.getAction() != 1) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 61) {
                if (keyCode != 66) {
                    switch (keyCode) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                            if (keyEvent.hasNoModifiers()) {
                                if (keyCode == 19) {
                                    i = 33;
                                } else if (keyCode != 21) {
                                    i = 66;
                                    if (keyCode != 22) {
                                        i = 130;
                                    }
                                } else {
                                    i = 17;
                                }
                                int repeatCount = keyEvent.getRepeatCount() + 1;
                                boolean z = false;
                                while (i2 < repeatCount && A0Q(i, (Rect) null)) {
                                    i2++;
                                    z = true;
                                }
                                return z;
                            }
                            break;
                        case 23:
                            break;
                    }
                }
                if (keyEvent.hasNoModifiers() && keyEvent.getRepeatCount() == 0) {
                    int i3 = this.A02;
                    if (i3 == Integer.MIN_VALUE) {
                        return true;
                    }
                    A0P(i3, 16, (Bundle) null);
                    return true;
                }
            } else if (keyEvent.hasNoModifiers()) {
                return A0Q(2, (Rect) null);
            } else {
                if (keyEvent.hasModifiers(1)) {
                    return A0Q(1, (Rect) null);
                }
            }
        }
        return false;
    }

    public void A0K(C05650Ui r1) {
    }
}
