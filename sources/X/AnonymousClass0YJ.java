package X;

import android.content.Context;
import android.graphics.Rect;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.0YJ  reason: invalid class name */
public final class AnonymousClass0YJ {
    public static final AnonymousClass0YJ A00 = new AnonymousClass0YJ();

    public static final C04580Ov A01(C153427bI r1, AnonymousClass84O r2) {
        return new AnonymousClass09O(r1, r2);
    }

    public static final C152007Xe A02(Context context, AnonymousClass84O r6) {
        int A002;
        C04280Np A04 = C06410Xo.A00.A04(context, r6);
        List<AnonymousClass84O> A0Q = r6.A0Q();
        C162457s7.A0D(A0Q);
        ArrayList A0I = AnonymousClass002.A0I(C73783g4.A0b(A0Q, 10));
        for (AnonymousClass84O r1 : A0Q) {
            C162457s7.A0B(r1);
            if (A04(r1)) {
                A002 = A04.A02;
            } else {
                A002 = A00(r1);
            }
            A0I.add(Integer.valueOf(A002));
        }
        return new C01920Cs(new AnonymousClass097(A0I), A04.A01, A04.A02);
    }

    public static final int A00(AnonymousClass84O r3) {
        AnonymousClass84O A0I = r3.A0I();
        if (A0I == null || A0I.A0D() != 16372) {
            return 1;
        }
        return A0I.A0E(35, 1);
    }

    public static final List A03(List list, int i, int i2, int i3, int i4, int i5, int i6, boolean z) {
        int A002;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        int i7;
        int i8;
        int i9;
        int i10;
        Rect rect;
        ArrayList A0p = AnonymousClass000.A0p(list);
        Iterator it = list.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            AnonymousClass84O r2 = (AnonymousClass84O) it.next();
            int i12 = i5;
            if (A04(r2)) {
                A002 = i12;
            } else {
                A002 = A00(r2);
            }
            int i13 = (A002 + i11) - 1;
            int i14 = i6;
            int i15 = i;
            if (i15 != 1 ? i11 != 0 : i6 != 0) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (i15 != 1 ? i6 != 0 : i11 != 0) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (i15 != 1 ? i14 != i4 - 1 : i13 != i5 - 1) {
                z4 = false;
            } else {
                z4 = true;
            }
            if (i15 != 1 ? i13 != i5 - 1 : i14 != i4 - 1) {
                z5 = false;
            } else {
                z5 = true;
            }
            double d = (double) i12;
            double d2 = ((double) i2) / d;
            double d3 = ((double) i3) / d;
            if (z3) {
                i7 = 0;
            } else if (i15 == 1) {
                i7 = C1222663s.A00(((double) i11) * d2);
            } else {
                i7 = i2 / 2;
            }
            if (z2) {
                i8 = 0;
            } else if (i == 0) {
                i8 = C1222663s.A00(((double) i11) * d3);
            } else {
                i8 = i3 / 2;
            }
            if (z4) {
                i9 = 0;
            } else if (i15 == 1) {
                i9 = i2 - C1222663s.A00(((double) (i13 + 1)) * d2);
            } else {
                i9 = i2 / 2;
            }
            if (z5) {
                i10 = 0;
            } else if (i == 0) {
                i10 = i3 - C1222663s.A00(((double) (i13 + 1)) * d3);
            } else {
                i10 = i3 / 2;
            }
            if (z) {
                rect = new Rect(i9, i8, i7, i10);
            }
            A0p.add(rect);
            i11 = i13 + 1;
        }
        return A0p;
    }

    public static final boolean A04(AnonymousClass84O r3) {
        AnonymousClass84O A0I = r3.A0I();
        if (A0I == null || A0I.A0D() != 16372) {
            return false;
        }
        return A0I.A0W(36, false);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x00ba: MOVE  (r0v9 int) = (r19v0 int)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    public final X.AnonymousClass3Z6 A05(android.graphics.Rect r22, java.util.List r23, int r24, int r25, int r26) {
        /*
            r21 = this;
            int r8 = android.view.View.MeasureSpec.getMode(r24)
            int r6 = android.view.View.MeasureSpec.getMode(r25)
            r1 = 1
            r7 = r26
            if (r7 != r1) goto L_0x0016
            if (r8 != 0) goto L_0x001f
            java.lang.String r0 = "GridCollectionMeasureHelper: Width should be specified for vertical grid collection"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r0)
            throw r0
        L_0x0016:
            if (r6 != 0) goto L_0x001f
            java.lang.String r0 = "GridCollectionMeasureHelper: Height should be specified for horizontal grid collection"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r0)
            throw r0
        L_0x001f:
            int r19 = android.view.View.MeasureSpec.getSize(r24)
            r0 = 1073741824(0x40000000, float:2.0)
            r5 = -1
            if (r8 == r0) goto L_0x002b
            r4 = -1
            if (r7 != r1) goto L_0x002d
        L_0x002b:
            r4 = r19
        L_0x002d:
            int r18 = android.view.View.MeasureSpec.getSize(r25)
            if (r6 == r0) goto L_0x0035
            if (r26 != 0) goto L_0x0037
        L_0x0035:
            r5 = r18
        L_0x0037:
            r9 = -1
            if (r4 == r9) goto L_0x004a
            if (r5 == r9) goto L_0x004a
        L_0x003c:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
        L_0x0040:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            X.3Z6 r0 = new X.3Z6
            r0.<init>(r2, r1)
            return r0
        L_0x004a:
            r1 = r22
            int r3 = r1.left
            int r0 = r1.right
            int r3 = r3 + r0
            int r2 = r1.top
            int r0 = r1.bottom
            int r2 = r2 + r0
            r20 = r23
            int r17 = r20.size()
            r1 = 0
        L_0x005d:
            r0 = r17
            if (r1 >= r0) goto L_0x00d1
            r0 = r20
            java.lang.Object r13 = r0.get(r1)
            java.util.List r13 = (java.util.List) r13
            int r16 = r13.size()
            r12 = 0
            r11 = 0
            r10 = 0
        L_0x0070:
            r0 = r16
            if (r10 >= r0) goto L_0x00b2
            java.lang.Object r9 = r13.get(r10)
            X.0NH r9 = (X.AnonymousClass0NH) r9
            X.0Lv r0 = r9.A00
            android.graphics.Rect r15 = r0.A02
            X.7Vn r0 = r9.A00()
            X.6NK r0 = r0.A01()
            java.lang.Object r0 = r0.A00()
            X.C162457s7.A0D(r0)
            X.7nJ r0 = (X.C160247nJ) r0
            X.7Wn r9 = r0.A00()
            int r14 = r9.A02()
            int r0 = r15.left
            int r14 = r14 + r0
            int r0 = r15.right
            int r14 = r14 + r0
            int r9 = r9.A01()
            int r0 = r15.top
            int r9 = r9 + r0
            int r0 = r15.bottom
            int r9 = r9 + r0
            int r12 = java.lang.Math.max(r12, r14)
            int r11 = java.lang.Math.max(r11, r9)
            int r10 = r10 + 1
            goto L_0x0070
        L_0x00b2:
            int r3 = r3 + r12
            int r2 = r2 + r11
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r26 != 0) goto L_0x00c6
            if (r8 != r0) goto L_0x00bf
            r0 = r19
            if (r3 < r0) goto L_0x00bf
            r4 = r0
        L_0x00bf:
            r9 = -1
            if (r4 == r9) goto L_0x00ce
            if (r5 == r9) goto L_0x00ce
            goto L_0x003c
        L_0x00c6:
            if (r6 != r0) goto L_0x00bf
            r0 = r18
            if (r2 < r0) goto L_0x00bf
            r5 = r0
            goto L_0x00bf
        L_0x00ce:
            int r1 = r1 + 1
            goto L_0x005d
        L_0x00d1:
            r0 = 1
            if (r7 != r0) goto L_0x00de
            if (r5 != r9) goto L_0x00d7
            r5 = r2
        L_0x00d7:
            r3 = r4
        L_0x00d8:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            goto L_0x0040
        L_0x00de:
            if (r4 == r9) goto L_0x00d8
            goto L_0x00d7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0YJ.A05(android.graphics.Rect, java.util.List, int, int, int):X.3Z6");
    }
}
