package androidx.constraintlayout.helper.widget;

import X.AnonymousClass05L;
import X.AnonymousClass0K9;
import X.AnonymousClass0R7;
import X.C004605a;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

public class Flow extends C004605a {
    public AnonymousClass05L A00;

    public void A05(AnonymousClass0R7 r4, boolean z) {
        AnonymousClass05L r2 = this.A00;
        int i = r2.A04;
        if (i <= 0 && r2.A03 <= 0) {
            return;
        }
        if (z) {
            r2.A06 = r2.A03;
            r2.A07 = i;
            return;
        }
        r2.A06 = i;
        r2.A07 = r2.A03;
    }

    public void onMeasure(int i, int i2) {
        A09(this.A00, i, i2);
    }

    public void setFirstHorizontalBias(float f) {
        this.A00.A00 = f;
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i) {
        this.A00.A07 = i;
        requestLayout();
    }

    public void setFirstVerticalBias(float f) {
        this.A00.A01 = f;
        requestLayout();
    }

    public void setFirstVerticalStyle(int i) {
        this.A00.A08 = i;
        requestLayout();
    }

    public void setHorizontalAlign(int i) {
        this.A00.A09 = i;
        requestLayout();
    }

    public void setHorizontalBias(float f) {
        this.A00.A02 = f;
        requestLayout();
    }

    public void setHorizontalGap(int i) {
        this.A00.A0A = i;
        requestLayout();
    }

    public void setHorizontalStyle(int i) {
        this.A00.A0B = i;
        requestLayout();
    }

    public void setMaxElementsWrap(int i) {
        this.A00.A0E = i;
        requestLayout();
    }

    public void setOrientation(int i) {
        this.A00.A0F = i;
        requestLayout();
    }

    public void setPadding(int i) {
        AnonymousClass05L r0 = this.A00;
        r0.A05 = i;
        r0.A02 = i;
        r0.A04 = i;
        r0.A03 = i;
        requestLayout();
    }

    public void setPaddingBottom(int i) {
        this.A00.A02 = i;
        requestLayout();
    }

    public void setPaddingLeft(int i) {
        this.A00.A06 = i;
        requestLayout();
    }

    public void setPaddingRight(int i) {
        this.A00.A07 = i;
        requestLayout();
    }

    public void setPaddingTop(int i) {
        this.A00.A05 = i;
        requestLayout();
    }

    public void setVerticalAlign(int i) {
        this.A00.A0G = i;
        requestLayout();
    }

    public void setVerticalBias(float f) {
        this.A00.A05 = f;
        requestLayout();
    }

    public void setVerticalGap(int i) {
        this.A00.A0H = i;
        requestLayout();
    }

    public void setVerticalStyle(int i) {
        this.A00.A0I = i;
        requestLayout();
    }

    public void setWrapMode(int i) {
        this.A00.A0J = i;
        requestLayout();
    }

    public void A04(AttributeSet attributeSet) {
        AnonymousClass05L r1;
        int dimensionPixelSize;
        AnonymousClass05L r12;
        int dimensionPixelSize2;
        super.A04(attributeSet);
        this.A00 = new AnonymousClass05L();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AnonymousClass0K9.A01);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 0) {
                    this.A00.A0F = obtainStyledAttributes.getInt(index, 0);
                } else {
                    if (index == 1) {
                        r12 = this.A00;
                        dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                        r12.A05 = dimensionPixelSize2;
                        r12.A02 = dimensionPixelSize2;
                        r12.A04 = dimensionPixelSize2;
                    } else {
                        if (index == 11) {
                            r1 = this.A00;
                            dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                            r1.A04 = dimensionPixelSize;
                            r1.A06 = dimensionPixelSize;
                        } else if (index == 12) {
                            r12 = this.A00;
                            dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                        } else if (index == 2) {
                            this.A00.A06 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                        } else if (index == 3) {
                            this.A00.A05 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                        } else if (index == 4) {
                            r1 = this.A00;
                            dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                        } else if (index == 5) {
                            this.A00.A02 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                        } else if (index == 37) {
                            this.A00.A0J = obtainStyledAttributes.getInt(index, 0);
                        } else if (index == 27) {
                            this.A00.A0B = obtainStyledAttributes.getInt(index, 0);
                        } else if (index == 36) {
                            this.A00.A0I = obtainStyledAttributes.getInt(index, 0);
                        } else if (index == 21) {
                            this.A00.A07 = obtainStyledAttributes.getInt(index, 0);
                        } else if (index == 29) {
                            this.A00.A0C = obtainStyledAttributes.getInt(index, 0);
                        } else if (index == 23) {
                            this.A00.A08 = obtainStyledAttributes.getInt(index, 0);
                        } else if (index == 31) {
                            this.A00.A0D = obtainStyledAttributes.getInt(index, 0);
                        } else if (index == 25) {
                            this.A00.A02 = obtainStyledAttributes.getFloat(index, 0.5f);
                        } else if (index == 20) {
                            this.A00.A00 = obtainStyledAttributes.getFloat(index, 0.5f);
                        } else if (index == 28) {
                            this.A00.A03 = obtainStyledAttributes.getFloat(index, 0.5f);
                        } else if (index == 22) {
                            this.A00.A01 = obtainStyledAttributes.getFloat(index, 0.5f);
                        } else if (index == 30) {
                            this.A00.A04 = obtainStyledAttributes.getFloat(index, 0.5f);
                        } else if (index == 34) {
                            this.A00.A05 = obtainStyledAttributes.getFloat(index, 0.5f);
                        } else if (index == 24) {
                            this.A00.A09 = obtainStyledAttributes.getInt(index, 2);
                        } else if (index == 33) {
                            this.A00.A0G = obtainStyledAttributes.getInt(index, 2);
                        } else if (index == 26) {
                            this.A00.A0A = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                        } else if (index == 35) {
                            this.A00.A0H = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                        } else if (index == 32) {
                            this.A00.A0E = obtainStyledAttributes.getInt(index, -1);
                        }
                        r1.A07 = dimensionPixelSize;
                    }
                    r12.A03 = dimensionPixelSize2;
                }
            }
        }
        this.A02 = this.A00;
        A02();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r7v0 */
    /* JADX WARNING: type inference failed for: r7v2, types: [int] */
    /* JADX WARNING: type inference failed for: r7v6 */
    /* JADX WARNING: type inference failed for: r7v18 */
    /* JADX WARNING: type inference failed for: r7v19 */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0283, code lost:
        if (r0 == r1) goto L_0x0285;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0050, code lost:
        if (r0 == r4) goto L_0x0052;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x04fd, code lost:
        if (r4 == 0) goto L_0x04ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x0508, code lost:
        if (r4 == 0) goto L_0x050a;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x036e  */
    /* JADX WARNING: Removed duplicated region for block: B:265:0x051b  */
    /* JADX WARNING: Removed duplicated region for block: B:270:0x0525  */
    /* JADX WARNING: Removed duplicated region for block: B:276:0x052f  */
    /* JADX WARNING: Removed duplicated region for block: B:284:0x0546  */
    /* JADX WARNING: Removed duplicated region for block: B:292:0x055f A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:296:0x0568  */
    /* JADX WARNING: Removed duplicated region for block: B:315:0x05a1  */
    /* JADX WARNING: Removed duplicated region for block: B:316:0x05a6  */
    /* JADX WARNING: Removed duplicated region for block: B:317:0x05ac A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:352:0x044c A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:370:0x052c A[EDGE_INSN: B:370:0x052c->B:274:0x052c ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A09(X.AnonymousClass05M r50, int r51, int r52) {
        /*
            r49 = this;
            int r20 = android.view.View.MeasureSpec.getMode(r51)
            int r19 = android.view.View.MeasureSpec.getSize(r51)
            int r18 = android.view.View.MeasureSpec.getMode(r52)
            int r17 = android.view.View.MeasureSpec.getSize(r52)
            r48 = r49
            r16 = r50
            if (r50 == 0) goto L_0x05bd
            r8 = r16
            X.05L r8 = (X.AnonymousClass05L) r8
            int r11 = r8.A00
            r7 = 0
            if (r11 <= 0) goto L_0x0088
            X.0R7 r0 = r8.A0Z
            if (r0 == 0) goto L_0x0082
            X.05P r0 = (X.AnonymousClass05P) r0
            X.0rn r2 = r0.A06
            if (r2 == 0) goto L_0x0082
            r1 = 0
        L_0x002a:
            int r11 = r8.A00
            r6 = 1
            if (r1 >= r11) goto L_0x0088
            X.0R7[] r0 = r8.A01
            r3 = r0[r1]
            if (r3 == 0) goto L_0x004d
            boolean r0 = r3 instanceof X.AnonymousClass05K
            if (r0 != 0) goto L_0x004d
            X.0Fr[] r4 = r3.A0o
            r0 = r4[r7]
            r5 = r4[r6]
            X.0Fr r4 = X.C02310Fr.MATCH_CONSTRAINT
            if (r0 != r4) goto L_0x0050
            int r0 = r3.A0D
            if (r0 == r6) goto L_0x0052
            if (r5 != r4) goto L_0x0052
            int r0 = r3.A0C
            if (r0 == r6) goto L_0x0052
        L_0x004d:
            int r1 = r1 + 1
            goto L_0x002a
        L_0x0050:
            if (r0 != r4) goto L_0x0054
        L_0x0052:
            X.0Fr r0 = X.C02310Fr.WRAP_CONTENT
        L_0x0054:
            if (r5 != r4) goto L_0x0058
            X.0Fr r5 = X.C02310Fr.WRAP_CONTENT
        L_0x0058:
            X.0Mi r4 = r8.A08
            r4.A05 = r0
            r4.A06 = r5
            int r0 = r3.A05()
            r4.A00 = r0
            int r0 = r3.A04()
            r4.A04 = r0
            r2.BL5(r3, r4)
            int r0 = r4.A03
            r3.A0B(r0)
            int r0 = r4.A02
            r3.A0A(r0)
            int r0 = r4.A01
            r3.A07 = r0
            boolean r0 = X.AnonymousClass001.A1W(r0)
            r3.A0h = r0
            goto L_0x004d
        L_0x0082:
            r8.A01 = r7
            r8.A00 = r7
            goto L_0x011b
        L_0x0088:
            int r0 = r8.A06
            r22 = r0
            int r0 = r8.A07
            r23 = r0
            int r0 = r8.A05
            r21 = r0
            int r0 = r8.A02
            r24 = r0
            r0 = 2
            int[] r6 = new int[r0]
            int r5 = r19 - r22
            int r5 = r5 - r23
            int r4 = r8.A0F
            r0 = 1
            if (r4 != r0) goto L_0x00a8
            int r5 = r17 - r21
            int r5 = r5 - r24
        L_0x00a8:
            r1 = -1
            int r0 = r8.A0B
            if (r0 != r1) goto L_0x00af
            r8.A0B = r7
        L_0x00af:
            int r0 = r8.A0I
            if (r0 != r1) goto L_0x00b5
            r8.A0I = r7
        L_0x00b5:
            X.0R7[] r10 = r8.A01
            r9 = r10
            r1 = 0
        L_0x00b9:
            r3 = 8
            if (r1 >= r11) goto L_0x00c8
            r0 = r10[r1]
            int r0 = r0.A0N
            if (r0 != r3) goto L_0x00c5
            int r7 = r7 + 1
        L_0x00c5:
            int r1 = r1 + 1
            goto L_0x00b9
        L_0x00c8:
            if (r7 <= 0) goto L_0x00e0
            int r0 = r11 - r7
            X.0R7[] r10 = new X.AnonymousClass0R7[r0]
            r2 = 0
            r7 = 0
        L_0x00d0:
            if (r2 >= r11) goto L_0x00df
            r1 = r9[r2]
            int r0 = r1.A0N
            if (r0 == r3) goto L_0x00dc
            r10[r7] = r1
            int r7 = r7 + 1
        L_0x00dc:
            int r2 = r2 + 1
            goto L_0x00d0
        L_0x00df:
            r11 = r7
        L_0x00e0:
            r8.A0O = r10
            r8.A06 = r11
            int r0 = r8.A0J
            if (r0 == 0) goto L_0x0460
            r3 = 1
            if (r0 == r3) goto L_0x0185
            r9 = 2
            if (r0 == r9) goto L_0x0143
            r0 = 0
            r7 = 1
        L_0x00f0:
            r2 = r6[r0]
            int r2 = r2 + r22
            int r2 = r2 + r23
            r1 = r6[r7]
            int r1 = r1 + r21
            int r1 = r1 + r24
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 1073741824(0x40000000, float:2.0)
            r0 = r20
            if (r0 != r3) goto L_0x0136
            r2 = r19
        L_0x0106:
            r0 = r18
            if (r0 != r3) goto L_0x0129
            r1 = r17
        L_0x010c:
            r8.A01 = r2
            r8.A00 = r1
            r8.A0B(r2)
            r8.A0A(r1)
            int r0 = r8.A00
            if (r0 > 0) goto L_0x011b
            r7 = 0
        L_0x011b:
            r8.A0A = r7
            r0 = r16
            int r2 = r0.A01
            int r1 = r0.A00
            r0 = r48
            r0.setMeasuredDimension(r2, r1)
            return
        L_0x0129:
            if (r0 != r4) goto L_0x0132
            r0 = r17
            int r1 = java.lang.Math.min(r1, r0)
            goto L_0x010c
        L_0x0132:
            if (r18 == 0) goto L_0x010c
            r1 = 0
            goto L_0x010c
        L_0x0136:
            if (r0 != r4) goto L_0x013f
            r0 = r19
            int r2 = java.lang.Math.min(r2, r0)
            goto L_0x0106
        L_0x013f:
            if (r20 == 0) goto L_0x0106
            r2 = 0
            goto L_0x0106
        L_0x0143:
            r7 = 1
            r12 = 0
            int r2 = r8.A0E
            if (r4 != 0) goto L_0x0169
            if (r2 > 0) goto L_0x0165
            r2 = 0
            r1 = 0
            r3 = 0
        L_0x014e:
            if (r1 >= r11) goto L_0x0165
            if (r1 <= 0) goto L_0x0155
            int r0 = r8.A0A
            int r3 = r3 + r0
        L_0x0155:
            r0 = r10[r1]
            if (r0 == 0) goto L_0x0162
            int r0 = r8.A0P(r0, r5)
            int r3 = r3 + r0
            if (r3 > r5) goto L_0x0165
            int r2 = r2 + 1
        L_0x0162:
            int r1 = r1 + 1
            goto L_0x014e
        L_0x0165:
            r3 = r2
            r2 = 0
            goto L_0x04ef
        L_0x0169:
            if (r2 > 0) goto L_0x04ee
            r2 = 0
            r3 = 0
            r1 = 0
        L_0x016e:
            if (r3 >= r11) goto L_0x04ee
            if (r3 <= 0) goto L_0x0175
            int r0 = r8.A0H
            int r1 = r1 + r0
        L_0x0175:
            r0 = r10[r3]
            if (r0 == 0) goto L_0x0182
            int r0 = r8.A0O(r0, r5)
            int r1 = r1 + r0
            if (r1 > r5) goto L_0x04ee
            int r2 = r2 + 1
        L_0x0182:
            int r3 = r3 + 1
            goto L_0x016e
        L_0x0185:
            r7 = 1
            if (r11 == 0) goto L_0x0505
            java.util.ArrayList r9 = r8.A0K
            r9.clear()
            X.0Qs r0 = r8.A0W
            r47 = r0
            X.0Qs r0 = r8.A0Y
            r46 = r0
            X.0Qs r0 = r8.A0X
            r45 = r0
            X.0Qs r0 = r8.A0S
            r44 = r0
            X.0On r14 = new X.0On
            r25 = r14
            r26 = r47
            r27 = r46
            r28 = r45
            r29 = r0
            r30 = r8
            r31 = r4
            r32 = r5
            r25.<init>(r26, r27, r28, r29, r30, r31, r32)
            r9.add(r14)
            r2 = 0
            r31 = 0
            r13 = 0
            r12 = 0
            if (r4 != 0) goto L_0x020e
        L_0x01bc:
            if (r12 >= r11) goto L_0x0260
            r1 = r10[r12]
            int r25 = r8.A0P(r1, r5)
            X.0Fr[] r0 = r1.A0o
            r15 = r0[r2]
            X.0Fr r0 = X.C02310Fr.MATCH_CONSTRAINT
            if (r15 != r0) goto L_0x01ce
            int r31 = r31 + 1
        L_0x01ce:
            if (r13 == r5) goto L_0x01d7
            int r0 = r8.A0A
            int r0 = r0 + r13
            int r0 = r0 + r25
            if (r0 <= r5) goto L_0x01fd
        L_0x01d7:
            X.0R7 r0 = r14.A0G
            if (r0 == 0) goto L_0x01fd
        L_0x01db:
            X.0On r14 = new X.0On
            r32 = r14
            r33 = r47
            r34 = r46
            r35 = r45
            r36 = r44
            r37 = r8
            r38 = r2
            r39 = r5
            r32.<init>(r33, r34, r35, r36, r37, r38, r39)
            r14.A0A = r12
            r9.add(r14)
        L_0x01f5:
            r13 = r25
        L_0x01f7:
            r14.A01(r1)
            int r12 = r12 + 1
            goto L_0x01bc
        L_0x01fd:
            if (r12 <= 0) goto L_0x01f5
            int r0 = r8.A0E
            if (r0 <= 0) goto L_0x0208
            int r0 = r12 % r0
            if (r0 != 0) goto L_0x0208
            goto L_0x01db
        L_0x0208:
            int r0 = r8.A0A
            int r0 = r0 + r25
            int r13 = r13 + r0
            goto L_0x01f7
        L_0x020e:
            if (r12 >= r11) goto L_0x0260
            r1 = r10[r12]
            int r25 = r8.A0O(r1, r5)
            X.0Fr[] r0 = r1.A0o
            r15 = r0[r3]
            X.0Fr r0 = X.C02310Fr.MATCH_CONSTRAINT
            if (r15 != r0) goto L_0x0220
            int r31 = r31 + 1
        L_0x0220:
            if (r13 == r5) goto L_0x0229
            int r0 = r8.A0H
            int r0 = r0 + r13
            int r0 = r0 + r25
            if (r0 <= r5) goto L_0x024f
        L_0x0229:
            X.0R7 r0 = r14.A0G
            if (r0 == 0) goto L_0x024f
        L_0x022d:
            X.0On r14 = new X.0On
            r32 = r14
            r33 = r47
            r34 = r46
            r35 = r45
            r36 = r44
            r37 = r8
            r38 = r4
            r39 = r5
            r32.<init>(r33, r34, r35, r36, r37, r38, r39)
            r14.A0A = r12
            r9.add(r14)
        L_0x0247:
            r13 = r25
        L_0x0249:
            r14.A01(r1)
            int r12 = r12 + 1
            goto L_0x020e
        L_0x024f:
            if (r12 <= 0) goto L_0x0247
            int r0 = r8.A0E
            if (r0 <= 0) goto L_0x025a
            int r0 = r12 % r0
            if (r0 != 0) goto L_0x025a
            goto L_0x022d
        L_0x025a:
            int r0 = r8.A0H
            int r0 = r0 + r25
            int r13 = r13 + r0
            goto L_0x0249
        L_0x0260:
            int r30 = r9.size()
            r43 = r45
            r42 = r44
            int r0 = r8.A06
            r29 = r0
            int r0 = r8.A05
            r28 = r0
            int r0 = r8.A07
            r27 = r0
            int r0 = r8.A02
            r26 = r0
            X.0Fr[] r10 = r8.A0o
            r0 = r10[r2]
            X.0Fr r1 = X.C02310Fr.WRAP_CONTENT
            if (r0 == r1) goto L_0x0285
            r0 = r10[r3]
            r10 = 0
            if (r0 != r1) goto L_0x0286
        L_0x0285:
            r10 = 1
        L_0x0286:
            if (r31 <= 0) goto L_0x028b
            r11 = 0
            if (r10 != 0) goto L_0x0351
        L_0x028b:
            r12 = 0
            r11 = 0
            r10 = 0
        L_0x028e:
            r0 = r30
            if (r10 >= r0) goto L_0x045a
            java.lang.Object r1 = r9.get(r10)
            X.0On r1 = (X.C04500On) r1
            int r0 = r30 + -1
            if (r4 != 0) goto L_0x02f6
            if (r10 >= r0) goto L_0x02ef
            int r0 = r10 + 1
            java.lang.Object r0 = r9.get(r0)
            X.0On r0 = (X.C04500On) r0
            X.0R7 r0 = r0.A0G
            X.0Qs r0 = r0.A0Y
            r42 = r0
            r26 = 0
        L_0x02ae:
            X.0R7 r0 = r1.A0G
            X.0Qs r13 = r0.A0S
            r1.A05 = r2
            r0 = r47
            r1.A0D = r0
            r0 = r46
            r1.A0F = r0
            r0 = r43
            r1.A0E = r0
            r0 = r42
            r1.A0C = r0
            r0 = r29
            r1.A07 = r0
            r0 = r28
            r1.A09 = r0
            r0 = r27
            r1.A08 = r0
            r0 = r26
            r1.A06 = r0
            r1.A03 = r5
            int r14 = r1.A0B
            X.05L r0 = r1.A0H
            int r0 = r0.A0A
            int r11 = X.AnonymousClass001.A0C(r14, r0, r11)
            int r0 = r1.A02
            int r12 = r12 + r0
            if (r10 <= 0) goto L_0x02e8
            int r0 = r8.A0H
            int r12 = r12 + r0
        L_0x02e8:
            r46 = r13
            r28 = 0
        L_0x02ec:
            int r10 = r10 + 1
            goto L_0x028e
        L_0x02ef:
            r42 = r44
            int r0 = r8.A02
            r26 = r0
            goto L_0x02ae
        L_0x02f6:
            if (r10 >= r0) goto L_0x034a
            int r0 = r10 + 1
            java.lang.Object r0 = r9.get(r0)
            X.0On r0 = (X.C04500On) r0
            X.0R7 r0 = r0.A0G
            X.0Qs r0 = r0.A0W
            r43 = r0
            r27 = 0
        L_0x0308:
            X.0R7 r0 = r1.A0G
            X.0Qs r13 = r0.A0X
            r1.A05 = r4
            r0 = r47
            r1.A0D = r0
            r0 = r46
            r1.A0F = r0
            r0 = r43
            r1.A0E = r0
            r0 = r42
            r1.A0C = r0
            r0 = r29
            r1.A07 = r0
            r0 = r28
            r1.A09 = r0
            r0 = r27
            r1.A08 = r0
            r0 = r26
            r1.A06 = r0
            r1.A03 = r5
            int r0 = r1.A0B
            int r11 = r11 + r0
            int r14 = r1.A02
            if (r4 != r3) goto L_0x033c
            X.05L r0 = r1.A0H
            int r0 = r0.A0H
            int r14 = r14 - r0
        L_0x033c:
            int r12 = java.lang.Math.max(r12, r14)
            if (r10 <= 0) goto L_0x0345
            int r0 = r8.A0A
            int r11 = r11 + r0
        L_0x0345:
            r47 = r13
            r29 = 0
            goto L_0x02ec
        L_0x034a:
            int r0 = r8.A07
            r27 = r0
            r43 = r45
            goto L_0x0308
        L_0x0351:
            r0 = r30
            if (r11 >= r0) goto L_0x028b
            java.lang.Object r1 = r9.get(r11)
            X.0On r1 = (X.C04500On) r1
            int r0 = r1.A05
            if (r4 != 0) goto L_0x0450
            int r10 = r1.A0B
            if (r0 != 0) goto L_0x0368
            X.05L r0 = r1.A0H
            int r0 = r0.A0A
        L_0x0367:
            int r10 = r10 - r0
        L_0x0368:
            int r35 = r5 - r10
            int r10 = r1.A04
            if (r10 == 0) goto L_0x044c
            int r0 = r1.A01
            r15 = r0
            int r35 = r35 / r10
            r10 = 0
        L_0x0374:
            if (r10 >= r15) goto L_0x03cd
            int r13 = r1.A0A
            int r14 = r13 + r10
            X.05L r12 = r1.A0H
            int r0 = r12.A06
            if (r14 >= r0) goto L_0x03cd
            X.0R7[] r0 = r12.A0O
            int r13 = r13 + r10
            r0 = r0[r13]
            int r13 = r1.A05
            if (r13 != 0) goto L_0x03ab
            if (r0 == 0) goto L_0x03a8
            X.0Fr[] r13 = r0.A0o
            r14 = r13[r2]
            X.0Fr r13 = X.C02310Fr.MATCH_CONSTRAINT
            if (r14 != r13) goto L_0x03a8
            int r13 = r0.A0D
            if (r13 != 0) goto L_0x03a8
            X.0Fr r32 = X.C02310Fr.FIXED
            X.0Fr[] r13 = r0.A0o
            r33 = r13[r3]
            int r36 = r0.A04()
            r31 = r12
            r34 = r0
            r31.A0N(r32, r33, r34, r35, r36)
        L_0x03a8:
            int r10 = r10 + 1
            goto L_0x0374
        L_0x03ab:
            if (r0 == 0) goto L_0x03a8
            X.0Fr[] r13 = r0.A0o
            r14 = r13[r3]
            X.0Fr r13 = X.C02310Fr.MATCH_CONSTRAINT
            if (r14 != r13) goto L_0x03a8
            int r13 = r0.A0C
            if (r13 != 0) goto L_0x03a8
            X.0Fr[] r13 = r0.A0o
            r37 = r13[r2]
            int r40 = r0.A05()
            X.0Fr r38 = X.C02310Fr.FIXED
            r36 = r12
            r39 = r0
            r41 = r35
            r36.A0N(r37, r38, r39, r40, r41)
            goto L_0x03a8
        L_0x03cd:
            r1.A0B = r2
            r1.A02 = r2
            r0 = 0
            r1.A0G = r0
            r1.A00 = r2
            int r0 = r1.A01
            r31 = r0
            r14 = 0
        L_0x03db:
            r0 = r31
            if (r14 >= r0) goto L_0x044c
            int r13 = r1.A0A
            int r10 = r13 + r14
            X.05L r12 = r1.A0H
            int r0 = r12.A06
            if (r10 >= r0) goto L_0x044c
            X.0R7[] r0 = r12.A0O
            int r13 = r13 + r14
            r13 = r0[r13]
            int r0 = r1.A05
            if (r0 != 0) goto L_0x041f
            int r25 = r13.A05()
            int r15 = r12.A0A
            int r0 = r13.A0N
            r10 = r0
            r0 = 8
            if (r10 != r0) goto L_0x0400
            r15 = 0
        L_0x0400:
            int r0 = r1.A0B
            int r25 = r25 + r15
            int r0 = r0 + r25
            r1.A0B = r0
            int r0 = r1.A03
            int r10 = r12.A0O(r13, r0)
            X.0R7 r0 = r1.A0G
            if (r0 == 0) goto L_0x0416
            int r0 = r1.A00
            if (r0 >= r10) goto L_0x041c
        L_0x0416:
            r1.A0G = r13
            r1.A00 = r10
            r1.A02 = r10
        L_0x041c:
            int r14 = r14 + 1
            goto L_0x03db
        L_0x041f:
            int r0 = r1.A03
            int r15 = r12.A0P(r13, r0)
            int r0 = r1.A03
            int r25 = r12.A0O(r13, r0)
            int r12 = r12.A0H
            int r0 = r13.A0N
            r10 = r0
            r0 = 8
            if (r10 != r0) goto L_0x0435
            r12 = 0
        L_0x0435:
            int r0 = r1.A02
            int r25 = r25 + r12
            int r0 = r0 + r25
            r1.A02 = r0
            X.0R7 r0 = r1.A0G
            if (r0 == 0) goto L_0x0445
            int r0 = r1.A00
            if (r0 >= r15) goto L_0x041c
        L_0x0445:
            r1.A0G = r13
            r1.A00 = r15
            r1.A0B = r15
            goto L_0x041c
        L_0x044c:
            int r11 = r11 + 1
            goto L_0x0351
        L_0x0450:
            int r10 = r1.A02
            if (r0 != r3) goto L_0x0368
            X.05L r0 = r1.A0H
            int r0 = r0.A0H
            goto L_0x0367
        L_0x045a:
            r6[r2] = r11
            r6[r3] = r12
            goto L_0x0505
        L_0x0460:
            r7 = 1
            if (r11 == 0) goto L_0x0505
            java.util.ArrayList r9 = r8.A0K
            int r0 = r9.size()
            r15 = 0
            if (r0 != 0) goto L_0x0497
            X.0Qs r3 = r8.A0W
            X.0Qs r2 = r8.A0Y
            X.0Qs r1 = r8.A0X
            X.0Qs r0 = r8.A0S
            X.0On r14 = new X.0On
            r28 = r1
            r29 = r0
            r30 = r8
            r31 = r4
            r32 = r5
            r25 = r14
            r26 = r3
            r27 = r2
            r25.<init>(r26, r27, r28, r29, r30, r31, r32)
            r9.add(r14)
        L_0x048c:
            r1 = 0
        L_0x048d:
            if (r1 >= r11) goto L_0x04d5
            r0 = r10[r1]
            r14.A01(r0)
            int r1 = r1 + 1
            goto L_0x048d
        L_0x0497:
            java.lang.Object r14 = r9.get(r15)
            X.0On r14 = (X.C04500On) r14
            r14.A00 = r15
            r0 = 0
            r14.A0G = r0
            r14.A0B = r15
            r14.A02 = r15
            r14.A0A = r15
            r14.A01 = r15
            r14.A04 = r15
            X.0Qs r0 = r8.A0W
            r25 = r0
            X.0Qs r13 = r8.A0Y
            X.0Qs r12 = r8.A0X
            X.0Qs r9 = r8.A0S
            int r3 = r8.A06
            int r2 = r8.A05
            int r1 = r8.A07
            int r0 = r8.A02
            r14.A05 = r4
            r4 = r25
            r14.A0D = r4
            r14.A0F = r13
            r14.A0E = r12
            r14.A0C = r9
            r14.A07 = r3
            r14.A09 = r2
            r14.A08 = r1
            r14.A06 = r0
            r14.A03 = r5
            goto L_0x048c
        L_0x04d5:
            int r2 = r14.A05
            int r1 = r14.A0B
            if (r2 != 0) goto L_0x04e0
            X.05L r0 = r14.A0H
            int r0 = r0.A0A
            int r1 = r1 - r0
        L_0x04e0:
            r6[r15] = r1
            int r1 = r14.A02
            if (r2 != r7) goto L_0x04eb
            X.05L r0 = r14.A0H
            int r0 = r0.A0H
            int r1 = r1 - r0
        L_0x04eb:
            r6[r7] = r1
            goto L_0x0505
        L_0x04ee:
            r3 = 0
        L_0x04ef:
            int[] r0 = r8.A0L
            if (r0 != 0) goto L_0x04f7
            int[] r0 = new int[r9]
            r8.A0L = r0
        L_0x04f7:
            if (r2 != 0) goto L_0x04fb
            if (r4 == r7) goto L_0x04ff
        L_0x04fb:
            if (r3 != 0) goto L_0x0508
            if (r4 != 0) goto L_0x05b2
        L_0x04ff:
            int[] r0 = r8.A0L
            r0[r12] = r3
            r0[r7] = r2
        L_0x0505:
            r0 = 0
            goto L_0x00f0
        L_0x0508:
            if (r4 != 0) goto L_0x05b2
        L_0x050a:
            float r1 = (float) r11
            float r0 = (float) r3
            float r1 = r1 / r0
            double r0 = (double) r1
            double r0 = java.lang.Math.ceil(r0)
            int r2 = (int) r0
        L_0x0513:
            X.0R7[] r1 = r8.A0M
            r9 = 0
            if (r1 == 0) goto L_0x05a6
            int r0 = r1.length
            if (r0 < r3) goto L_0x05a6
            java.util.Arrays.fill(r1, r9)
        L_0x051e:
            X.0R7[] r1 = r8.A0N
            if (r1 == 0) goto L_0x05a1
            int r0 = r1.length
            if (r0 < r2) goto L_0x05a1
            java.util.Arrays.fill(r1, r9)
        L_0x0528:
            r15 = 0
        L_0x0529:
            r14 = 0
            if (r15 < r3) goto L_0x0566
            r9 = 0
        L_0x052d:
            if (r9 >= r3) goto L_0x0542
            X.0R7[] r0 = r8.A0M
            r1 = r0[r9]
            if (r1 == 0) goto L_0x053f
            if (r9 <= 0) goto L_0x053a
            int r0 = r8.A0A
            int r14 = r14 + r0
        L_0x053a:
            int r0 = r8.A0P(r1, r5)
            int r14 = r14 + r0
        L_0x053f:
            int r9 = r9 + 1
            goto L_0x052d
        L_0x0542:
            r13 = 0
            r9 = 0
        L_0x0544:
            if (r13 >= r2) goto L_0x0559
            X.0R7[] r0 = r8.A0N
            r1 = r0[r13]
            if (r1 == 0) goto L_0x0556
            if (r13 <= 0) goto L_0x0551
            int r0 = r8.A0H
            int r9 = r9 + r0
        L_0x0551:
            int r0 = r8.A0O(r1, r5)
            int r9 = r9 + r0
        L_0x0556:
            int r13 = r13 + 1
            goto L_0x0544
        L_0x0559:
            r6[r12] = r14
            r6[r7] = r9
            if (r4 != 0) goto L_0x05ac
            if (r14 <= r5) goto L_0x04ff
            if (r3 <= r7) goto L_0x04ff
            int r3 = r3 + -1
            goto L_0x050a
        L_0x0566:
            if (r14 >= r2) goto L_0x059e
            int r1 = r14 * r3
            int r1 = r1 + r15
            if (r4 != r7) goto L_0x0570
            int r1 = r15 * r2
            int r1 = r1 + r14
        L_0x0570:
            int r0 = r10.length
            if (r1 >= r0) goto L_0x059b
            r13 = r10[r1]
            if (r13 == 0) goto L_0x059b
            int r9 = r8.A0P(r13, r5)
            X.0R7[] r1 = r8.A0M
            r0 = r1[r15]
            if (r0 == 0) goto L_0x0587
            int r0 = r0.A05()
            if (r0 >= r9) goto L_0x0589
        L_0x0587:
            r1[r15] = r13
        L_0x0589:
            int r9 = r8.A0O(r13, r5)
            X.0R7[] r1 = r8.A0N
            r0 = r1[r14]
            if (r0 == 0) goto L_0x0599
            int r0 = r0.A04()
            if (r0 >= r9) goto L_0x059b
        L_0x0599:
            r1[r14] = r13
        L_0x059b:
            int r14 = r14 + 1
            goto L_0x0566
        L_0x059e:
            int r15 = r15 + 1
            goto L_0x0529
        L_0x05a1:
            X.0R7[] r0 = new X.AnonymousClass0R7[r2]
            r8.A0N = r0
            goto L_0x0528
        L_0x05a6:
            X.0R7[] r0 = new X.AnonymousClass0R7[r3]
            r8.A0M = r0
            goto L_0x051e
        L_0x05ac:
            if (r9 <= r5) goto L_0x04ff
            if (r2 <= r7) goto L_0x04ff
            int r2 = r2 + -1
        L_0x05b2:
            float r1 = (float) r11
            float r0 = (float) r2
            float r1 = r1 / r0
            double r0 = (double) r1
            double r0 = java.lang.Math.ceil(r0)
            int r3 = (int) r0
            goto L_0x0513
        L_0x05bd:
            r1 = 0
            r0 = r48
            r0.setMeasuredDimension(r1, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.helper.widget.Flow.A09(X.05M, int, int):void");
    }

    public Flow(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public Flow(Context context) {
        super(context);
    }

    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
