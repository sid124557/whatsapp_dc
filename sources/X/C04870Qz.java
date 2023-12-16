package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: X.0Qz  reason: invalid class name and case insensitive filesystem */
public final class C04870Qz {
    public int A00;
    public int A01;
    public AnonymousClass0ON A02;
    public AnonymousClass0GX A03;
    public ArrayList A04 = null;
    public final ArrayList A05;
    public final ArrayList A06 = AnonymousClass001.A0s();
    public final List A07;
    public final /* synthetic */ RecyclerView A08;

    /* JADX WARNING: Code restructure failed: missing block: B:140:0x0235, code lost:
        if (r4.A08 != r10.A0B(r4.A05)) goto L_0x0144;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00b5, code lost:
        if ((r1 & 4) == 0) goto L_0x007c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0142, code lost:
        if (r5.A08 == false) goto L_0x0144;
     */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x02f6  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:254:0x0318 A[EDGE_INSN: B:254:0x0318->B:189:0x0318 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00a7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C05570Ua A02(int r26, long r27) {
        /*
            r25 = this;
            r9 = 0
            r7 = r25
            r8 = r26
            if (r26 < 0) goto L_0x03e6
            androidx.recyclerview.widget.RecyclerView r6 = r7.A08
            X.0Q1 r5 = r6.A0y
            int r0 = r5.A00()
            if (r8 >= r0) goto L_0x03e6
            boolean r0 = r5.A08
            r14 = 0
            r15 = 1
            r23 = r27
            if (r0 == 0) goto L_0x00ff
            java.util.ArrayList r2 = r7.A04
            if (r2 == 0) goto L_0x00ff
            int r10 = r2.size()
            if (r10 == 0) goto L_0x00ff
            r3 = 0
            r1 = 0
        L_0x0025:
            if (r1 >= r10) goto L_0x00cc
            X.0Ua r4 = X.AnonymousClass001.A0Z(r2, r1)
            int r0 = r4.A00
            r0 = r0 & 32
            if (r0 != 0) goto L_0x00c8
            int r0 = X.AnonymousClass001.A0J(r4)
            if (r0 != r8) goto L_0x00c8
        L_0x0037:
            r1 = 32
            int r0 = r4.A00
            r1 = r1 | r0
            r4.A00 = r1
        L_0x003e:
            r18 = 1
            boolean r0 = r5.A08
            if (r0 != 0) goto L_0x0070
            r0 = 8192(0x2000, float:1.14794E-41)
            int r2 = r4.A00
            r0 = r0 & r2
            if (r0 == 0) goto L_0x0070
            r0 = 8192(0x2000, float:1.14794E-41)
            int r0 = ~r0
            r2 = r2 & r0
            r4.A00 = r2
            boolean r0 = r5.A0B
            if (r0 == 0) goto L_0x0070
            r1 = r2 & 14
            r0 = r2 & 4
            if (r0 != 0) goto L_0x0062
            r0 = r1 & 4
            if (r0 != 0) goto L_0x0062
            r4.A01()
        L_0x0062:
            r4.A02()
            X.0NE r0 = new X.0NE
            r0.<init>()
            r0.A00(r4)
            r6.A0n(r0, r4)
        L_0x0070:
            boolean r0 = r5.A08
            if (r0 == 0) goto L_0x00a7
            boolean r0 = r4.A06()
            if (r0 == 0) goto L_0x00a7
            r4.A06 = r8
        L_0x007c:
            r3 = 0
        L_0x007d:
            android.view.View r2 = r4.A0H
            android.view.ViewGroup$LayoutParams r1 = r2.getLayoutParams()
            if (r1 != 0) goto L_0x0099
            android.view.ViewGroup$LayoutParams r1 = r6.generateDefaultLayoutParams()
        L_0x0089:
            X.02g r1 = (X.C002102g) r1
            r2.setLayoutParams(r1)
        L_0x008e:
            r1.A00 = r4
            if (r18 == 0) goto L_0x0097
            if (r3 == 0) goto L_0x0097
        L_0x0094:
            r1.A02 = r15
            return r4
        L_0x0097:
            r15 = 0
            goto L_0x0094
        L_0x0099:
            boolean r0 = r6.checkLayoutParams(r1)
            if (r0 != 0) goto L_0x00a4
            android.view.ViewGroup$LayoutParams r1 = r6.generateLayoutParams((android.view.ViewGroup.LayoutParams) r1)
            goto L_0x0089
        L_0x00a4:
            X.02g r1 = (X.C002102g) r1
            goto L_0x008e
        L_0x00a7:
            boolean r0 = r4.A06()
            if (r0 == 0) goto L_0x00b7
            int r1 = r4.A00
            r0 = r1 & 2
            if (r0 != 0) goto L_0x00b7
            r0 = r1 & 4
            if (r0 == 0) goto L_0x007c
        L_0x00b7:
            X.0ec r0 = r6.A0J
            int r21 = r0.A00(r8, r9)
            r20 = r4
            r22 = r8
            r19 = r7
            boolean r3 = r19.A0B(r20, r21, r22, r23)
            goto L_0x007d
        L_0x00c8:
            int r1 = r1 + 1
            goto L_0x0025
        L_0x00cc:
            X.0R6 r2 = r6.A0N
            boolean r0 = r2.A00
            if (r0 == 0) goto L_0x00ff
            X.0ec r0 = r6.A0J
            int r1 = r0.A00(r8, r9)
            if (r1 <= 0) goto L_0x00ff
            int r0 = r2.A0G()
            if (r1 >= r0) goto L_0x00ff
            X.0R6 r0 = r6.A0N
            long r11 = r0.A0B(r1)
        L_0x00e6:
            if (r3 >= r10) goto L_0x00ff
            java.util.ArrayList r0 = r7.A04
            X.0Ua r4 = X.AnonymousClass001.A0Z(r0, r3)
            int r0 = r4.A00
            r0 = r0 & 32
            if (r0 != 0) goto L_0x00fc
            long r0 = r4.A08
            int r2 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r2 != 0) goto L_0x00fc
            goto L_0x0037
        L_0x00fc:
            int r3 = r3 + 1
            goto L_0x00e6
        L_0x00ff:
            r18 = 0
            java.util.ArrayList r2 = r7.A05
            int r3 = r2.size()
            r12 = 0
            r1 = 0
        L_0x0109:
            if (r1 >= r3) goto L_0x023d
            X.0Ua r4 = X.AnonymousClass001.A0Z(r2, r1)
            int r0 = r4.A00
            r0 = r0 & 32
            if (r0 != 0) goto L_0x0239
            int r0 = X.AnonymousClass001.A0J(r4)
            if (r0 != r8) goto L_0x0239
            int r0 = r4.A00
            r0 = r0 & 4
            if (r0 != 0) goto L_0x0239
            boolean r0 = r5.A08
            if (r0 != 0) goto L_0x012f
            int r0 = r4.A00
            r0 = r0 & 8
            boolean r0 = X.AnonymousClass000.A1S(r0)
            if (r0 != 0) goto L_0x0239
        L_0x012f:
            r1 = 32
        L_0x0131:
            int r0 = r4.A00
            r1 = r1 | r0
            r4.A00 = r1
        L_0x0136:
            int r0 = r4.A00
            r0 = r0 & 8
            boolean r0 = X.AnonymousClass000.A1S(r0)
            if (r0 == 0) goto L_0x0207
            boolean r0 = r5.A08
            if (r0 != 0) goto L_0x003e
        L_0x0144:
            r1 = 4
            int r0 = r4.A00
            r1 = r1 | r0
            r4.A00 = r1
            X.0Qz r0 = r4.A09
            if (r0 == 0) goto L_0x01fd
            android.view.View r0 = r4.A0H
            r6.removeDetachedView(r0, r9)
            X.0Qz r0 = r4.A09
            r0.A09(r4)
        L_0x0158:
            r7.A08(r4)
        L_0x015b:
            X.0ec r0 = r6.A0J
            int r3 = r0.A00(r8, r9)
            if (r3 < 0) goto L_0x036f
            X.0R6 r0 = r6.A0N
            int r0 = r0.A0G()
            if (r3 >= r0) goto L_0x036f
            X.0R6 r0 = r6.A0N
            int r10 = r0.getItemViewType(r3)
            X.0R6 r1 = r6.A0N
            boolean r0 = r1.A00
            if (r0 == 0) goto L_0x02d1
            long r16 = r1.A0B(r3)
            int r11 = r2.size()
        L_0x017f:
            int r11 = r11 + -1
            if (r11 < 0) goto L_0x01d0
            X.0Ua r4 = X.AnonymousClass001.A0Z(r2, r11)
            long r0 = r4.A08
            int r12 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r12 != 0) goto L_0x017f
            int r0 = r4.A00
            r0 = r0 & 32
            if (r0 != 0) goto L_0x017f
            int r0 = r4.A02
            if (r10 != r0) goto L_0x01b6
            r1 = 32
            int r0 = r4.A00
            r1 = r1 | r0
            r4.A00 = r1
            r0 = r1 & 8
            boolean r0 = X.AnonymousClass000.A1S(r0)
            if (r0 == 0) goto L_0x01b2
            boolean r0 = r5.A08
            if (r0 != 0) goto L_0x01b2
            r0 = 14
            int r0 = ~r0
            r1 = r1 & r0
            r0 = 2
            r0 = r0 | r1
            r4.A00 = r0
        L_0x01b2:
            r4.A05 = r3
            goto L_0x003e
        L_0x01b6:
            r2.remove(r11)
            android.view.View r0 = r4.A0H
            r6.removeDetachedView(r0, r9)
            X.0Ua r1 = androidx.recyclerview.widget.RecyclerView.A02(r0)
            r1.A09 = r14
            r1.A0G = r9
            int r0 = r1.A00
            r0 = r0 & -33
            r1.A00 = r0
            r7.A08(r1)
            goto L_0x017f
        L_0x01d0:
            java.util.ArrayList r11 = r7.A06
            int r2 = r11.size()
        L_0x01d6:
            int r2 = r2 + -1
            if (r2 < 0) goto L_0x02d1
            X.0Ua r4 = X.AnonymousClass001.A0Z(r11, r2)
            long r0 = r4.A08
            int r12 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r12 != 0) goto L_0x01d6
            android.view.View r1 = r4.A0H
            android.view.ViewParent r0 = r1.getParent()
            if (r0 == 0) goto L_0x01f5
            android.view.ViewParent r1 = r1.getParent()
            androidx.recyclerview.widget.RecyclerView r0 = r4.A0C
            if (r1 == r0) goto L_0x01f5
            goto L_0x01d6
        L_0x01f5:
            int r0 = r4.A02
            if (r10 != r0) goto L_0x02ce
            r11.remove(r2)
            goto L_0x01b2
        L_0x01fd:
            r0 = r1 & 32
            if (r0 == 0) goto L_0x0158
            r0 = r1 & -33
            r4.A00 = r0
            goto L_0x0158
        L_0x0207:
            int r1 = r4.A05
            if (r1 < 0) goto L_0x039d
            X.0R6 r0 = r6.A0N
            int r0 = r0.A0G()
            if (r1 >= r0) goto L_0x039d
            boolean r0 = r5.A08
            if (r0 != 0) goto L_0x0225
            X.0R6 r1 = r6.A0N
            int r0 = r4.A05
            int r1 = r1.getItemViewType(r0)
            int r0 = r4.A02
            if (r1 == r0) goto L_0x0225
            goto L_0x0144
        L_0x0225:
            X.0R6 r10 = r6.A0N
            boolean r0 = r10.A00
            if (r0 == 0) goto L_0x003e
            long r0 = r4.A08
            int r3 = r4.A05
            long r10 = r10.A0B(r3)
            int r3 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r3 != 0) goto L_0x0144
            goto L_0x003e
        L_0x0239:
            int r1 = r1 + 1
            goto L_0x0109
        L_0x023d:
            X.0R0 r11 = r6.A0K
            java.util.List r13 = r11.A02
            int r10 = r13.size()
            r4 = 0
        L_0x0246:
            if (r4 >= r10) goto L_0x029e
            java.lang.Object r3 = r13.get(r4)
            android.view.View r3 = (android.view.View) r3
            X.0Ua r1 = androidx.recyclerview.widget.RecyclerView.A02(r3)
            int r0 = X.AnonymousClass001.A0J(r1)
            if (r0 != r8) goto L_0x029b
            int r0 = r1.A00
            r0 = r0 & 4
            if (r0 != 0) goto L_0x029b
            int r0 = r1.A00
            r0 = r0 & 8
            boolean r0 = X.AnonymousClass000.A1S(r0)
            if (r0 != 0) goto L_0x029b
            if (r3 == 0) goto L_0x029e
            X.02g r0 = X.AnonymousClass001.A0Y(r3)
            X.0Ua r4 = r0.A00
            X.0sK r0 = r11.A01
            X.0eY r0 = (X.C08480eY) r0
            androidx.recyclerview.widget.RecyclerView r0 = r0.A00
            int r10 = r0.indexOfChild(r3)
            if (r10 < 0) goto L_0x03db
            X.0Qr r1 = r11.A00
            boolean r0 = r1.A06(r10)
            if (r0 == 0) goto L_0x03cc
            r1.A03(r10)
            r11.A09(r3)
            int r1 = r11.A04(r3)
            r0 = -1
            if (r1 == r0) goto L_0x03b7
            r11.A06(r1)
            r7.A07(r3)
            r1 = 8224(0x2020, float:1.1524E-41)
            goto L_0x0131
        L_0x029b:
            int r4 = r4 + 1
            goto L_0x0246
        L_0x029e:
            java.util.ArrayList r10 = r7.A06
            int r3 = r10.size()
        L_0x02a4:
            if (r12 >= r3) goto L_0x015b
            X.0Ua r4 = X.AnonymousClass001.A0Z(r10, r12)
            int r0 = r4.A00
            r0 = r0 & 4
            if (r0 != 0) goto L_0x02c6
            int r0 = X.AnonymousClass001.A0J(r4)
            if (r0 != r8) goto L_0x02c6
            android.view.View r1 = r4.A0H
            android.view.ViewParent r0 = r1.getParent()
            if (r0 == 0) goto L_0x02c9
            android.view.ViewParent r1 = r1.getParent()
            androidx.recyclerview.widget.RecyclerView r0 = r4.A0C
            if (r1 == r0) goto L_0x02c9
        L_0x02c6:
            int r12 = r12 + 1
            goto L_0x02a4
        L_0x02c9:
            r10.remove(r12)
            goto L_0x0136
        L_0x02ce:
            r7.A05(r2)
        L_0x02d1:
            X.0ON r0 = r7.A02
            if (r0 != 0) goto L_0x02dc
            X.0ON r0 = new X.0ON
            r0.<init>()
            r7.A02 = r0
        L_0x02dc:
            android.util.SparseArray r0 = r0.A01
            java.lang.Object r0 = r0.get(r10)
            X.0M7 r0 = (X.AnonymousClass0M7) r0
            if (r0 == 0) goto L_0x0318
            java.util.ArrayList r3 = r0.A03
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x0318
            int r2 = r3.size()
        L_0x02f2:
            int r2 = r2 + -1
            if (r2 < 0) goto L_0x0318
            X.0Ua r4 = X.AnonymousClass001.A0Z(r3, r2)
            android.view.View r1 = r4.A0H
            android.view.ViewParent r0 = r1.getParent()
            if (r0 == 0) goto L_0x030b
            android.view.ViewParent r1 = r1.getParent()
            androidx.recyclerview.widget.RecyclerView r0 = r4.A0C
            if (r1 == r0) goto L_0x030b
            goto L_0x02f2
        L_0x030b:
            java.lang.Object r4 = r3.remove(r2)
            X.0Ua r4 = (X.C05570Ua) r4
            if (r4 == 0) goto L_0x0318
            r4.A03()
            goto L_0x0070
        L_0x0318:
            long r11 = java.lang.System.nanoTime()
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r0 = (r27 > r1 ? 1 : (r27 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x033a
            X.0ON r0 = r7.A02
            X.0M7 r0 = r0.A00(r10)
            long r0 = r0.A02
            r3 = 0
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 == 0) goto L_0x033a
            long r2 = r11 + r0
            int r0 = (r2 > r27 ? 1 : (r2 == r27 ? 0 : -1))
            if (r0 < 0) goto L_0x033a
            return r14
        L_0x033a:
            X.0R6 r0 = r6.A0N
            X.0Ua r4 = r0.A04(r6, r10)
            android.view.View r0 = r4.A0H
            androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.A03(r0)
            if (r1 == 0) goto L_0x034f
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r1)
            r4.A0D = r0
        L_0x034f:
            long r2 = java.lang.System.nanoTime()
            X.0ON r0 = r7.A02
            long r2 = r2 - r11
            X.0M7 r12 = r0.A00(r10)
            long r0 = r12.A02
            r13 = 0
            int r10 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r10 == 0) goto L_0x036b
            r13 = 4
            long r0 = r0 / r13
            r10 = 3
            long r0 = r0 * r10
            long r2 = r2 / r13
            long r0 = r0 + r2
            r2 = r0
        L_0x036b:
            r12.A02 = r2
            goto L_0x0070
        L_0x036f:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Inconsistency detected. Invalid item position "
            r1.append(r0)
            r1.append(r8)
            java.lang.String r0 = "(offset:"
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = ").state:"
            r1.append(r0)
            int r0 = r5.A00()
            r1.append(r0)
            java.lang.String r0 = r6.A0I()
            java.lang.String r1 = X.AnonymousClass000.A0X(r0, r1)
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            r0.<init>(r1)
            throw r0
        L_0x039d:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Inconsistency detected. Invalid view holder adapter position"
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = r6.A0I()
            java.lang.String r1 = X.AnonymousClass000.A0X(r0, r1)
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            r0.<init>(r1)
            throw r0
        L_0x03b7:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "layout index should not be -1 after unhiding a view:"
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = r6.A0I()
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0I(r0, r1)
            throw r0
        L_0x03cc:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "trying to unhide a view that was not hidden"
            java.lang.String r0 = X.AnonymousClass000.A0P(r3, r0, r1)
            java.lang.RuntimeException r0 = X.AnonymousClass002.A0E(r0)
            throw r0
        L_0x03db:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "view is not a child, cannot hide "
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0E(r3, r0, r1)
            throw r0
        L_0x03e6:
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Invalid item position "
            r2.append(r0)
            r2.append(r8)
            java.lang.String r0 = "("
            r2.append(r0)
            r2.append(r8)
            java.lang.String r0 = "). Item count:"
            r2.append(r0)
            androidx.recyclerview.widget.RecyclerView r1 = r7.A08
            X.0Q1 r0 = r1.A0y
            int r0 = r0.A00()
            r2.append(r0)
            java.lang.String r0 = r1.A0I()
            java.lang.String r1 = X.AnonymousClass000.A0X(r0, r2)
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C04870Qz.A02(int, long):X.0Ua");
    }

    public C04870Qz(RecyclerView recyclerView) {
        this.A08 = recyclerView;
        ArrayList A0s = AnonymousClass001.A0s();
        this.A05 = A0s;
        this.A07 = Collections.unmodifiableList(A0s);
        this.A00 = 2;
        this.A01 = 2;
    }

    public int A00(int i) {
        if (i >= 0) {
            RecyclerView recyclerView = this.A08;
            AnonymousClass0Q1 r1 = recyclerView.A0y;
            if (i < r1.A00()) {
                if (r1.A08) {
                    return recyclerView.A0J.A00(i, 0);
                }
                return i;
            }
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("invalid position ");
        A0o.append(i);
        A0o.append(". State item count is ");
        RecyclerView recyclerView2 = this.A08;
        A0o.append(recyclerView2.A0y.A00());
        throw new IndexOutOfBoundsException(AnonymousClass000.A0X(recyclerView2.A0I(), A0o));
    }

    public void A03() {
        ArrayList arrayList = this.A06;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            A05(size);
        }
        arrayList.clear();
        C08540ee r2 = this.A08.A0L;
        int[] iArr = r2.A03;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        r2.A00 = 0;
    }

    public void A04() {
        int i;
        C06440Xs r0 = this.A08.A0S;
        if (r0 != null) {
            i = r0.A02;
        } else {
            i = 0;
        }
        this.A01 = this.A00 + i;
        ArrayList arrayList = this.A06;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0 && arrayList.size() > this.A01) {
                A05(size);
            } else {
                return;
            }
        }
    }

    public void A05(int i) {
        ArrayList arrayList = this.A06;
        A0A(AnonymousClass001.A0Z(arrayList, i), true);
        arrayList.remove(i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0040, code lost:
        if (X.AnonymousClass0YY.A0D(r1) == false) goto L_0x0042;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A08(X.C05570Ua r11) {
        /*
            r10 = this;
            X.0Qz r0 = r11.A09
            boolean r0 = X.AnonymousClass000.A1W(r0)
            r3 = 0
            r4 = 1
            if (r0 != 0) goto L_0x00d8
            android.view.View r1 = r11.A0H
            android.view.ViewParent r0 = r1.getParent()
            if (r0 != 0) goto L_0x00d8
            int r2 = r11.A00
            r0 = r2 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x002f
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Tmp detached view should be removed from RecyclerView before it can be recycled: "
            r1.append(r0)
            r1.append(r11)
            androidx.recyclerview.widget.RecyclerView r0 = r10.A08
            java.lang.String r0 = r0.A0I()
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0F(r0, r1)
            throw r0
        L_0x002f:
            r0 = r2 & 128(0x80, float:1.794E-43)
            boolean r0 = X.AnonymousClass000.A1S(r0)
            if (r0 != 0) goto L_0x00c4
            r0 = r2 & 16
            if (r0 != 0) goto L_0x0042
            boolean r0 = X.AnonymousClass0YY.A0D(r1)
            r9 = 1
            if (r0 != 0) goto L_0x0043
        L_0x0042:
            r9 = 0
        L_0x0043:
            androidx.recyclerview.widget.RecyclerView r8 = r10.A08
            X.0R6 r0 = r8.A0N
            if (r0 == 0) goto L_0x0081
            if (r9 == 0) goto L_0x0081
            boolean r0 = r0.A0F(r11)
            if (r0 == 0) goto L_0x0081
        L_0x0051:
            int r2 = r10.A01
            if (r2 <= 0) goto L_0x00aa
            r1 = 526(0x20e, float:7.37E-43)
            int r0 = r11.A00
            r1 = r1 & r0
            if (r1 != 0) goto L_0x00aa
            java.util.ArrayList r7 = r10.A06
            int r6 = r7.size()
            if (r6 < r2) goto L_0x0069
            r10.A05(r3)
            int r6 = r6 + -1
        L_0x0069:
            if (r6 <= 0) goto L_0x00b0
            X.0ee r5 = r8.A0L
            int r4 = r11.A05
            int[] r3 = r5.A03
            if (r3 == 0) goto L_0x008e
            int r0 = r5.A00
            int r2 = r0 * 2
            r1 = 0
        L_0x0078:
            if (r1 >= r2) goto L_0x008e
            r0 = r3[r1]
            if (r0 == r4) goto L_0x00b0
            int r1 = r1 + 2
            goto L_0x0078
        L_0x0081:
            int r0 = r11.A00
            r0 = r0 & 16
            if (r0 != 0) goto L_0x00b4
            boolean r0 = X.AnonymousClass0YY.A0D(r1)
            if (r0 != 0) goto L_0x00b4
            goto L_0x0051
        L_0x008e:
            int r6 = r6 + -1
            if (r6 < 0) goto L_0x00ae
            X.0Ua r0 = X.AnonymousClass001.A0Z(r7, r6)
            int r4 = r0.A05
            int[] r3 = r5.A03
            if (r3 == 0) goto L_0x00ae
            int r0 = r5.A00
            int r2 = r0 * 2
            r1 = 0
        L_0x00a1:
            if (r1 >= r2) goto L_0x00ae
            r0 = r3[r1]
            if (r0 == r4) goto L_0x008e
            int r1 = r1 + 2
            goto L_0x00a1
        L_0x00aa:
            r10.A0A(r11, r4)
            goto L_0x00b5
        L_0x00ae:
            int r6 = r6 + 1
        L_0x00b0:
            r7.add(r6, r11)
            r3 = 1
        L_0x00b4:
            r4 = 0
        L_0x00b5:
            X.0Qd r0 = r8.A11
            r0.A02(r11)
            if (r3 != 0) goto L_0x00c3
            if (r4 != 0) goto L_0x00c3
            if (r9 == 0) goto L_0x00c3
            r0 = 0
            r11.A0C = r0
        L_0x00c3:
            return
        L_0x00c4:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle."
            r1.append(r0)
            androidx.recyclerview.widget.RecyclerView r0 = r10.A08
            java.lang.String r0 = r0.A0I()
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0F(r0, r1)
            throw r0
        L_0x00d8:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Scrapped or attached views may not be recycled. isScrap:"
            r1.append(r0)
            X.0Qz r0 = r11.A09
            boolean r0 = X.AnonymousClass000.A1W(r0)
            r1.append(r0)
            java.lang.String r0 = " isAttached:"
            r1.append(r0)
            android.view.View r0 = r11.A0H
            android.view.ViewParent r0 = r0.getParent()
            if (r0 == 0) goto L_0x00f8
            r3 = 1
        L_0x00f8:
            r1.append(r3)
            androidx.recyclerview.widget.RecyclerView r0 = r10.A08
            java.lang.String r0 = r0.A0I()
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0F(r0, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C04870Qz.A08(X.0Ua):void");
    }

    public void A09(C05570Ua r2) {
        ArrayList arrayList;
        if (r2.A0G) {
            arrayList = this.A04;
        } else {
            arrayList = this.A05;
        }
        arrayList.remove(r2);
        r2.A09 = null;
        r2.A0G = false;
        r2.A00 &= -33;
    }

    public final boolean A0B(C05570Ua r12, int i, int i2, long j) {
        RecyclerView recyclerView = this.A08;
        r12.A0C = recyclerView;
        int i3 = r12.A02;
        long nanoTime = System.nanoTime();
        if (j != Long.MAX_VALUE) {
            long j2 = this.A02.A00(i3).A01;
            if (j2 != 0 && nanoTime + j2 >= j) {
                return false;
            }
        }
        AnonymousClass0R6 r3 = recyclerView.A0N;
        r12.A05 = i;
        if (r3.A00) {
            r12.A08 = r3.A0B(i);
        }
        r12.A00 = (r12.A00 & (~519)) | 1;
        AnonymousClass0RZ.A01("RV OnBindView");
        r3.A0A(r12, r12.A02(), i);
        List list = r12.A0E;
        if (list != null) {
            list.clear();
        }
        r12.A00 &= -1025;
        View view = r12.A0H;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof C002102g) {
            ((C002102g) layoutParams).A01 = true;
        }
        AnonymousClass0RZ.A00();
        long nanoTime2 = System.nanoTime() - nanoTime;
        AnonymousClass0M7 A002 = this.A02.A00(r12.A02);
        long j3 = A002.A01;
        if (j3 != 0) {
            nanoTime2 = ((j3 / 4) * 3) + (nanoTime2 / 4);
        }
        A002.A01 = nanoTime2;
        AccessibilityManager accessibilityManager = recyclerView.A0v;
        if (accessibilityManager != null && accessibilityManager.isEnabled()) {
            if (AnonymousClass0YY.A00(view) == 0) {
                AnonymousClass0YY.A06(view, 1);
            }
            AnonymousClass063 r0 = recyclerView.A0Y;
            if (r0 != null) {
                AnonymousClass0WH A0E = r0.A0E();
                if (A0E instanceof AnonymousClass064) {
                    AnonymousClass064 r02 = (AnonymousClass064) A0E;
                    AnonymousClass0WH A032 = C06560Yg.A03(view);
                    if (!(A032 == null || A032 == r02)) {
                        r02.A00.put(view, A032);
                    }
                }
                C06560Yg.A0O(view, A0E);
            }
        }
        if (!recyclerView.A0y.A08) {
            return true;
        }
        r12.A06 = i2;
        return true;
    }

    public void A06(View view) {
        C05570Ua A022 = RecyclerView.A02(view);
        if ((A022.A00 & 256) != 0) {
            this.A08.removeDetachedView(view, false);
        }
        C04870Qz r0 = A022.A09;
        if (r0 != null) {
            r0.A09(A022);
        } else {
            int i = A022.A00;
            if ((i & 32) != 0) {
                A022.A00 = i & -33;
            }
        }
        A08(A022);
        RecyclerView recyclerView = this.A08;
        if (recyclerView.A0R == null) {
            return;
        }
        if ((A022.A00 & 16) != 0 || AnonymousClass0YY.A0D(A022.A0H)) {
            recyclerView.A0R.A09(A022);
        }
    }

    public void A07(View view) {
        ArrayList arrayList;
        AnonymousClass0UY r1;
        C05570Ua A022 = RecyclerView.A02(view);
        int i = A022.A00;
        if ((12 & i) != 0 || (i & 2) == 0 || (r1 = this.A08.A0R) == null || r1.A0B(A022, A022.A02())) {
            int i2 = A022.A00;
            if ((i2 & 4) != 0 && !AnonymousClass000.A1S(i2 & 8)) {
                RecyclerView recyclerView = this.A08;
                if (!recyclerView.A0N.A00) {
                    StringBuilder A0o = AnonymousClass001.A0o();
                    A0o.append("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.");
                    throw AnonymousClass000.A0F(recyclerView.A0I(), A0o);
                }
            }
            A022.A09 = this;
            A022.A0G = false;
            arrayList = this.A05;
        } else {
            arrayList = this.A04;
            if (arrayList == null) {
                arrayList = AnonymousClass001.A0s();
                this.A04 = arrayList;
            }
            A022.A09 = this;
            A022.A0G = true;
        }
        arrayList.add(A022);
    }

    public void A0A(C05570Ua r6, boolean z) {
        AnonymousClass0WH r0;
        RecyclerView.A07(r6);
        View view = r6.A0H;
        RecyclerView recyclerView = this.A08;
        AnonymousClass063 r02 = recyclerView.A0Y;
        if (r02 != null) {
            AnonymousClass0WH A0E = r02.A0E();
            if (A0E instanceof AnonymousClass064) {
                r0 = (AnonymousClass0WH) ((AnonymousClass064) A0E).A00.remove(view);
            } else {
                r0 = null;
            }
            C06560Yg.A0O(view, r0);
        }
        if (z) {
            C16030sM r03 = recyclerView.A0W;
            if (r03 != null) {
                r03.BfX(r6);
            }
            AnonymousClass0R6 r04 = recyclerView.A0N;
            if (r04 != null) {
                r04.A0J(r6);
            }
            if (recyclerView.A0y != null) {
                recyclerView.A11.A02(r6);
            }
        }
        r6.A0C = null;
        AnonymousClass0ON r3 = this.A02;
        if (r3 == null) {
            r3 = new AnonymousClass0ON();
            this.A02 = r3;
        }
        int i = r6.A02;
        ArrayList arrayList = r3.A00(i).A03;
        if (((AnonymousClass0M7) r3.A01.get(i)).A00 > arrayList.size()) {
            r6.A03();
            arrayList.add(r6);
        }
    }

    public View A01(int i) {
        return A02(i, Long.MAX_VALUE).A0H;
    }
}
