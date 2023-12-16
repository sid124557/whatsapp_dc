package X;

import android.view.ViewGroup;

/* renamed from: X.02c  reason: invalid class name and case insensitive filesystem */
public class C001702c extends ViewGroup.MarginLayoutParams {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public float A06;
    public float A07;
    public float A08;
    public float A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public int A0D;
    public int A0E = 0;
    public int A0F;
    public int A0G;
    public int A0H;
    public int A0I;
    public int A0J;
    public int A0K;
    public int A0L;
    public int A0M;
    public int A0N;
    public int A0O;
    public int A0P;
    public int A0Q;
    public int A0R;
    public int A0S;
    public int A0T;
    public int A0U;
    public int A0V;
    public int A0W;
    public int A0X;
    public int A0Y;
    public int A0Z;
    public int A0a;
    public int A0b;
    public int A0c;
    public int A0d;
    public int A0e;
    public int A0f;
    public int A0g;
    public int A0h;
    public int A0i;
    public int A0j;
    public int A0k;
    public int A0l;
    public int A0m;
    public int A0n;
    public int A0o;
    public int A0p;
    public int A0q;
    public AnonymousClass0R7 A0r;
    public String A0s;
    public String A0t;
    public boolean A0u;
    public boolean A0v;
    public boolean A0w;
    public boolean A0x;
    public boolean A0y;
    public boolean A0z;
    public boolean A10;

    public static float A00(C001702c r2) {
        r2.A00 = 0.0f;
        r2.A0m = -1;
        r2.A0n = -1;
        r2.A0J = -1;
        r2.A0I = -1;
        r2.A0M = -1;
        r2.A0P = -1;
        r2.A0N = -1;
        r2.A0K = -1;
        r2.A0O = -1;
        r2.A0L = -1;
        r2.A02 = 0.5f;
        r2.A08 = 0.5f;
        return 0.5f;
    }

    public static float A01(C001702c r2) {
        r2.A0Q = -1;
        r2.A0R = -1;
        r2.A01 = -1.0f;
        r2.A0T = -1;
        r2.A0U = -1;
        r2.A0k = -1;
        r2.A0l = -1;
        r2.A0p = -1;
        r2.A0o = -1;
        r2.A0C = -1;
        r2.A0B = -1;
        r2.A0A = -1;
        r2.A0D = -1;
        return -1.0f;
    }

    public static void A02(C001702c r5) {
        r5.A0S = 0;
        r5.A0q = 0;
        r5.A0W = 0;
        r5.A0V = 0;
        r5.A0a = 0;
        r5.A0Z = 0;
        r5.A0Y = 0;
        r5.A0X = 0;
        r5.A05 = 1.0f;
        r5.A04 = 1.0f;
        r5.A0G = -1;
        r5.A0H = -1;
        r5.A0b = -1;
        r5.A0v = false;
        r5.A0u = false;
        r5.A0s = null;
        r5.A0w = true;
        r5.A10 = true;
        r5.A0z = false;
        r5.A0x = false;
        r5.A0y = false;
        r5.A0g = -1;
        r5.A0h = -1;
        r5.A0i = -1;
        r5.A0j = -1;
        r5.A0c = -1;
        r5.A0d = -1;
    }

    public void A03() {
        this.A0x = false;
        this.A0w = true;
        this.A10 = true;
        int i = this.width;
        if (i == -2 && this.A0v) {
            this.A0w = false;
            if (this.A0W == 0) {
                this.A0W = 1;
            }
        }
        int i2 = this.height;
        if (i2 == -2 && this.A0u) {
            this.A10 = false;
            if (this.A0V == 0) {
                this.A0V = 1;
            }
        }
        if (i == 0 || i == -1) {
            this.A0w = false;
            if (i == 0 && this.A0W == 1) {
                this.width = -2;
                this.A0v = true;
            }
        }
        if (i2 == 0 || i2 == -1) {
            this.A10 = false;
            if (i2 == 0 && this.A0V == 1) {
                this.height = -2;
                this.A0u = true;
            }
        }
        if (this.A01 != -1.0f || this.A0Q != -1 || this.A0R != -1) {
            this.A0x = true;
            this.A0w = true;
            this.A10 = true;
            AnonymousClass0R7 r1 = this.A0r;
            if (!(r1 instanceof AnonymousClass05K)) {
                r1 = new AnonymousClass05K();
                this.A0r = r1;
            }
            ((AnonymousClass05K) r1).A0N(this.A0b);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x003f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void resolveLayoutDirection(int r15) {
        /*
            r14 = this;
            int r2 = r14.leftMargin
            int r4 = r14.rightMargin
            super.resolveLayoutDirection(r15)
            int r0 = r14.getLayoutDirection()
            r13 = 0
            r1 = 1
            boolean r5 = X.AnonymousClass000.A1U(r1, r0)
            r3 = -1
            r14.A0i = r3
            r14.A0j = r3
            r14.A0g = r3
            r14.A0h = r3
            int r0 = r14.A0M
            r14.A0c = r0
            int r0 = r14.A0N
            r14.A0d = r0
            float r12 = r14.A02
            r14.A07 = r12
            int r10 = r14.A0Q
            r14.A0e = r10
            int r9 = r14.A0R
            r14.A0f = r9
            float r8 = r14.A01
            r14.A06 = r8
            int r6 = r14.A0m
            if (r5 == 0) goto L_0x00bf
            if (r6 == r3) goto L_0x00b7
            r14.A0i = r6
        L_0x003a:
            r13 = 1
        L_0x003b:
            int r7 = r14.A0J
            if (r7 == r3) goto L_0x0042
            r14.A0h = r7
            r13 = 1
        L_0x0042:
            int r5 = r14.A0I
            if (r5 == r3) goto L_0x0049
            r14.A0g = r5
            r13 = 1
        L_0x0049:
            int r0 = r14.A0O
            if (r0 == r3) goto L_0x004f
            r14.A0d = r0
        L_0x004f:
            int r0 = r14.A0L
            if (r0 == r3) goto L_0x0055
            r14.A0c = r0
        L_0x0055:
            r11 = 1065353216(0x3f800000, float:1.0)
            if (r13 == 0) goto L_0x005d
            float r0 = r11 - r12
            r14.A07 = r0
        L_0x005d:
            boolean r0 = r14.A0x
            if (r0 == 0) goto L_0x0072
            int r0 = r14.A0b
            if (r0 != r1) goto L_0x0072
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x00a7
            float r11 = r11 - r8
            r14.A06 = r11
            r14.A0e = r3
            r14.A0f = r3
        L_0x0072:
            if (r7 != r3) goto L_0x0098
            if (r5 != r3) goto L_0x0098
            int r0 = r14.A0n
            if (r0 != r3) goto L_0x0098
            if (r6 != r3) goto L_0x0098
            int r0 = r14.A0k
            if (r0 == r3) goto L_0x00a0
            r14.A0i = r0
        L_0x0082:
            int r0 = r14.rightMargin
            if (r0 > 0) goto L_0x008a
            if (r4 <= 0) goto L_0x008a
            r14.rightMargin = r4
        L_0x008a:
            int r0 = r14.A0T
            if (r0 == r3) goto L_0x0099
            r14.A0g = r0
        L_0x0090:
            int r0 = r14.leftMargin
            if (r0 > 0) goto L_0x0098
            if (r2 <= 0) goto L_0x0098
            r14.leftMargin = r2
        L_0x0098:
            return
        L_0x0099:
            int r0 = r14.A0U
            if (r0 == r3) goto L_0x0098
            r14.A0h = r0
            goto L_0x0090
        L_0x00a0:
            int r0 = r14.A0l
            if (r0 == r3) goto L_0x008a
            r14.A0j = r0
            goto L_0x0082
        L_0x00a7:
            if (r10 == r3) goto L_0x00b0
            r14.A0f = r10
            r14.A0e = r3
        L_0x00ad:
            r14.A06 = r1
            goto L_0x0072
        L_0x00b0:
            if (r9 == r3) goto L_0x0072
            r14.A0e = r9
            r14.A0f = r3
            goto L_0x00ad
        L_0x00b7:
            int r0 = r14.A0n
            if (r0 == r3) goto L_0x003b
            r14.A0j = r0
            goto L_0x003a
        L_0x00bf:
            if (r6 == r3) goto L_0x00c3
            r14.A0h = r6
        L_0x00c3:
            int r0 = r14.A0n
            if (r0 == r3) goto L_0x00c9
            r14.A0g = r0
        L_0x00c9:
            int r7 = r14.A0J
            if (r7 == r3) goto L_0x00cf
            r14.A0i = r7
        L_0x00cf:
            int r5 = r14.A0I
            if (r5 == r3) goto L_0x00d5
            r14.A0j = r5
        L_0x00d5:
            int r0 = r14.A0O
            if (r0 == r3) goto L_0x00db
            r14.A0c = r0
        L_0x00db:
            int r0 = r14.A0L
            if (r0 == r3) goto L_0x0072
            r14.A0d = r0
            goto L_0x0072
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C001702c.resolveLayoutDirection(int):void");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x030e, code lost:
        android.util.Log.e("ConstraintLayout", r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C001702c(android.content.Context r13, android.util.AttributeSet r14) {
        /*
            r12 = this;
            r12.<init>(r13, r14)
            r6 = -1
            float r2 = A01(r12)
            r5 = 0
            r12.A0E = r5
            r4 = 0
            float r1 = A00(r12)
            r0 = 0
            r12.A0t = r0
            r3 = 1
            r12.A0F = r3
            r12.A03 = r2
            r12.A09 = r2
            A02(r12)
            r12.A07 = r1
            X.0R7 r0 = new X.0R7
            r0.<init>()
            r12.A0r = r0
            int[] r0 = X.AnonymousClass0K9.A01
            android.content.res.TypedArray r8 = r13.obtainStyledAttributes(r14, r0)
            int r7 = r8.getIndexCount()
            r2 = 0
        L_0x0031:
            if (r2 >= r7) goto L_0x0333
            int r9 = r8.getIndex(r2)
            android.util.SparseIntArray r0 = X.AnonymousClass0JU.A00
            int r0 = r0.get(r9)
            java.lang.String r11 = "ConstraintLayout"
            r10 = 2
            r1 = -2
            switch(r0) {
                case 1: goto L_0x0151;
                case 2: goto L_0x015b;
                case 3: goto L_0x016d;
                case 4: goto L_0x0177;
                case 5: goto L_0x018d;
                case 6: goto L_0x0197;
                case 7: goto L_0x01a1;
                case 8: goto L_0x01ab;
                case 9: goto L_0x01bd;
                case 10: goto L_0x01cf;
                case 11: goto L_0x01e1;
                case 12: goto L_0x01f3;
                case 13: goto L_0x0205;
                case 14: goto L_0x0217;
                case 15: goto L_0x0229;
                case 16: goto L_0x023b;
                case 17: goto L_0x024d;
                case 18: goto L_0x025f;
                case 19: goto L_0x0271;
                case 20: goto L_0x0283;
                case 21: goto L_0x0295;
                case 22: goto L_0x029f;
                case 23: goto L_0x02a9;
                case 24: goto L_0x02b3;
                case 25: goto L_0x02bd;
                case 26: goto L_0x02c7;
                case 27: goto L_0x02d1;
                case 28: goto L_0x02db;
                case 29: goto L_0x02e5;
                case 30: goto L_0x02ef;
                case 31: goto L_0x02f9;
                case 32: goto L_0x0304;
                case 33: goto L_0x00f9;
                case 34: goto L_0x010f;
                case 35: goto L_0x0313;
                case 36: goto L_0x0125;
                case 37: goto L_0x013b;
                case 38: goto L_0x0323;
                default: goto L_0x0044;
            }
        L_0x0044:
            switch(r0) {
                case 44: goto L_0x004a;
                case 45: goto L_0x00ba;
                case 46: goto L_0x00c3;
                case 47: goto L_0x00cd;
                case 48: goto L_0x00d5;
                case 49: goto L_0x00dd;
                case 50: goto L_0x00e7;
                case 51: goto L_0x00f1;
                default: goto L_0x0047;
            }
        L_0x0047:
            int r2 = r2 + 1
            goto L_0x0031
        L_0x004a:
            java.lang.String r1 = r8.getString(r9)
            r12.A0t = r1
            r12.A0F = r6
            if (r1 == 0) goto L_0x0047
            int r11 = r1.length()
            r0 = 44
            int r9 = r1.indexOf(r0)
            if (r9 <= 0) goto L_0x00a6
            int r0 = r11 + -1
            if (r9 >= r0) goto L_0x00a6
            java.lang.String r1 = r1.substring(r5, r9)
            java.lang.String r0 = "W"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x009b
            r12.A0F = r5
        L_0x0072:
            int r9 = r9 + 1
        L_0x0074:
            java.lang.String r1 = r12.A0t
            r0 = 58
            int r10 = r1.indexOf(r0)
            if (r10 < 0) goto L_0x00a8
            int r0 = r11 + -1
            if (r10 >= r0) goto L_0x00a8
            java.lang.String r9 = r1.substring(r9, r10)
            java.lang.String r1 = r12.A0t
            int r0 = r10 + 1
            java.lang.String r1 = r1.substring(r0)
            int r0 = r9.length()
            if (r0 <= 0) goto L_0x0047
            int r0 = r1.length()
            if (r0 <= 0) goto L_0x0047
            goto L_0x00b3
        L_0x009b:
            java.lang.String r0 = "H"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x0072
            r12.A0F = r3
            goto L_0x0072
        L_0x00a6:
            r9 = 0
            goto L_0x0074
        L_0x00a8:
            java.lang.String r1 = r1.substring(r9)
            int r0 = r1.length()
            if (r0 <= 0) goto L_0x0047
            goto L_0x00b6
        L_0x00b3:
            java.lang.Float.parseFloat(r9)     // Catch:{ NumberFormatException -> 0x0047 }
        L_0x00b6:
            java.lang.Float.parseFloat(r1)     // Catch:{ NumberFormatException -> 0x0047 }
            goto L_0x0047
        L_0x00ba:
            float r0 = r12.A03
            float r0 = r8.getFloat(r9, r0)
            r12.A03 = r0
            goto L_0x0047
        L_0x00c3:
            float r0 = r12.A09
            float r0 = r8.getFloat(r9, r0)
            r12.A09 = r0
            goto L_0x0047
        L_0x00cd:
            int r0 = r8.getInt(r9, r5)
            r12.A0S = r0
            goto L_0x0047
        L_0x00d5:
            int r0 = r8.getInt(r9, r5)
            r12.A0q = r0
            goto L_0x0047
        L_0x00dd:
            int r0 = r12.A0G
            int r0 = r8.getDimensionPixelOffset(r9, r0)
            r12.A0G = r0
            goto L_0x0047
        L_0x00e7:
            int r0 = r12.A0H
            int r0 = r8.getDimensionPixelOffset(r9, r0)
            r12.A0H = r0
            goto L_0x0047
        L_0x00f1:
            java.lang.String r0 = r8.getString(r9)
            r12.A0s = r0
            goto L_0x0047
        L_0x00f9:
            int r0 = r12.A0a     // Catch:{ Exception -> 0x0103 }
            int r0 = r8.getDimensionPixelSize(r9, r0)     // Catch:{ Exception -> 0x0103 }
            r12.A0a = r0     // Catch:{ Exception -> 0x0103 }
            goto L_0x0047
        L_0x0103:
            int r0 = r12.A0a
            int r0 = r8.getInt(r9, r0)
            if (r0 != r1) goto L_0x0047
            r12.A0a = r1
            goto L_0x0047
        L_0x010f:
            int r0 = r12.A0Y     // Catch:{ Exception -> 0x0119 }
            int r0 = r8.getDimensionPixelSize(r9, r0)     // Catch:{ Exception -> 0x0119 }
            r12.A0Y = r0     // Catch:{ Exception -> 0x0119 }
            goto L_0x0047
        L_0x0119:
            int r0 = r12.A0Y
            int r0 = r8.getInt(r9, r0)
            if (r0 != r1) goto L_0x0047
            r12.A0Y = r1
            goto L_0x0047
        L_0x0125:
            int r0 = r12.A0Z     // Catch:{ Exception -> 0x012f }
            int r0 = r8.getDimensionPixelSize(r9, r0)     // Catch:{ Exception -> 0x012f }
            r12.A0Z = r0     // Catch:{ Exception -> 0x012f }
            goto L_0x0047
        L_0x012f:
            int r0 = r12.A0Z
            int r0 = r8.getInt(r9, r0)
            if (r0 != r1) goto L_0x0047
            r12.A0Z = r1
            goto L_0x0047
        L_0x013b:
            int r0 = r12.A0X     // Catch:{ Exception -> 0x0145 }
            int r0 = r8.getDimensionPixelSize(r9, r0)     // Catch:{ Exception -> 0x0145 }
            r12.A0X = r0     // Catch:{ Exception -> 0x0145 }
            goto L_0x0047
        L_0x0145:
            int r0 = r12.A0X
            int r0 = r8.getInt(r9, r0)
            if (r0 != r1) goto L_0x0047
            r12.A0X = r1
            goto L_0x0047
        L_0x0151:
            int r0 = r12.A0b
            int r0 = r8.getInt(r9, r0)
            r12.A0b = r0
            goto L_0x0047
        L_0x015b:
            int r0 = r12.A0D
            int r0 = r8.getResourceId(r9, r0)
            r12.A0D = r0
            if (r0 != r6) goto L_0x0047
            int r0 = r8.getInt(r9, r6)
            r12.A0D = r0
            goto L_0x0047
        L_0x016d:
            int r0 = r12.A0E
            int r0 = r8.getDimensionPixelSize(r9, r0)
            r12.A0E = r0
            goto L_0x0047
        L_0x0177:
            float r0 = r12.A00
            float r9 = r8.getFloat(r9, r0)
            r1 = 1135869952(0x43b40000, float:360.0)
            float r9 = r9 % r1
            r12.A00 = r9
            int r0 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x0047
            float r0 = r1 - r9
            float r0 = r0 % r1
            r12.A00 = r0
            goto L_0x0047
        L_0x018d:
            int r0 = r12.A0Q
            int r0 = r8.getDimensionPixelOffset(r9, r0)
            r12.A0Q = r0
            goto L_0x0047
        L_0x0197:
            int r0 = r12.A0R
            int r0 = r8.getDimensionPixelOffset(r9, r0)
            r12.A0R = r0
            goto L_0x0047
        L_0x01a1:
            float r0 = r12.A01
            float r0 = r8.getFloat(r9, r0)
            r12.A01 = r0
            goto L_0x0047
        L_0x01ab:
            int r0 = r12.A0T
            int r0 = r8.getResourceId(r9, r0)
            r12.A0T = r0
            if (r0 != r6) goto L_0x0047
            int r0 = r8.getInt(r9, r6)
            r12.A0T = r0
            goto L_0x0047
        L_0x01bd:
            int r0 = r12.A0U
            int r0 = r8.getResourceId(r9, r0)
            r12.A0U = r0
            if (r0 != r6) goto L_0x0047
            int r0 = r8.getInt(r9, r6)
            r12.A0U = r0
            goto L_0x0047
        L_0x01cf:
            int r0 = r12.A0k
            int r0 = r8.getResourceId(r9, r0)
            r12.A0k = r0
            if (r0 != r6) goto L_0x0047
            int r0 = r8.getInt(r9, r6)
            r12.A0k = r0
            goto L_0x0047
        L_0x01e1:
            int r0 = r12.A0l
            int r0 = r8.getResourceId(r9, r0)
            r12.A0l = r0
            if (r0 != r6) goto L_0x0047
            int r0 = r8.getInt(r9, r6)
            r12.A0l = r0
            goto L_0x0047
        L_0x01f3:
            int r0 = r12.A0p
            int r0 = r8.getResourceId(r9, r0)
            r12.A0p = r0
            if (r0 != r6) goto L_0x0047
            int r0 = r8.getInt(r9, r6)
            r12.A0p = r0
            goto L_0x0047
        L_0x0205:
            int r0 = r12.A0o
            int r0 = r8.getResourceId(r9, r0)
            r12.A0o = r0
            if (r0 != r6) goto L_0x0047
            int r0 = r8.getInt(r9, r6)
            r12.A0o = r0
            goto L_0x0047
        L_0x0217:
            int r0 = r12.A0C
            int r0 = r8.getResourceId(r9, r0)
            r12.A0C = r0
            if (r0 != r6) goto L_0x0047
            int r0 = r8.getInt(r9, r6)
            r12.A0C = r0
            goto L_0x0047
        L_0x0229:
            int r0 = r12.A0B
            int r0 = r8.getResourceId(r9, r0)
            r12.A0B = r0
            if (r0 != r6) goto L_0x0047
            int r0 = r8.getInt(r9, r6)
            r12.A0B = r0
            goto L_0x0047
        L_0x023b:
            int r0 = r12.A0A
            int r0 = r8.getResourceId(r9, r0)
            r12.A0A = r0
            if (r0 != r6) goto L_0x0047
            int r0 = r8.getInt(r9, r6)
            r12.A0A = r0
            goto L_0x0047
        L_0x024d:
            int r0 = r12.A0m
            int r0 = r8.getResourceId(r9, r0)
            r12.A0m = r0
            if (r0 != r6) goto L_0x0047
            int r0 = r8.getInt(r9, r6)
            r12.A0m = r0
            goto L_0x0047
        L_0x025f:
            int r0 = r12.A0n
            int r0 = r8.getResourceId(r9, r0)
            r12.A0n = r0
            if (r0 != r6) goto L_0x0047
            int r0 = r8.getInt(r9, r6)
            r12.A0n = r0
            goto L_0x0047
        L_0x0271:
            int r0 = r12.A0J
            int r0 = r8.getResourceId(r9, r0)
            r12.A0J = r0
            if (r0 != r6) goto L_0x0047
            int r0 = r8.getInt(r9, r6)
            r12.A0J = r0
            goto L_0x0047
        L_0x0283:
            int r0 = r12.A0I
            int r0 = r8.getResourceId(r9, r0)
            r12.A0I = r0
            if (r0 != r6) goto L_0x0047
            int r0 = r8.getInt(r9, r6)
            r12.A0I = r0
            goto L_0x0047
        L_0x0295:
            int r0 = r12.A0M
            int r0 = r8.getDimensionPixelSize(r9, r0)
            r12.A0M = r0
            goto L_0x0047
        L_0x029f:
            int r0 = r12.A0P
            int r0 = r8.getDimensionPixelSize(r9, r0)
            r12.A0P = r0
            goto L_0x0047
        L_0x02a9:
            int r0 = r12.A0N
            int r0 = r8.getDimensionPixelSize(r9, r0)
            r12.A0N = r0
            goto L_0x0047
        L_0x02b3:
            int r0 = r12.A0K
            int r0 = r8.getDimensionPixelSize(r9, r0)
            r12.A0K = r0
            goto L_0x0047
        L_0x02bd:
            int r0 = r12.A0O
            int r0 = r8.getDimensionPixelSize(r9, r0)
            r12.A0O = r0
            goto L_0x0047
        L_0x02c7:
            int r0 = r12.A0L
            int r0 = r8.getDimensionPixelSize(r9, r0)
            r12.A0L = r0
            goto L_0x0047
        L_0x02d1:
            boolean r0 = r12.A0v
            boolean r0 = r8.getBoolean(r9, r0)
            r12.A0v = r0
            goto L_0x0047
        L_0x02db:
            boolean r0 = r12.A0u
            boolean r0 = r8.getBoolean(r9, r0)
            r12.A0u = r0
            goto L_0x0047
        L_0x02e5:
            float r0 = r12.A02
            float r0 = r8.getFloat(r9, r0)
            r12.A02 = r0
            goto L_0x0047
        L_0x02ef:
            float r0 = r12.A08
            float r0 = r8.getFloat(r9, r0)
            r12.A08 = r0
            goto L_0x0047
        L_0x02f9:
            int r0 = r8.getInt(r9, r5)
            r12.A0W = r0
            if (r0 != r3) goto L_0x0047
            java.lang.String r0 = "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead."
            goto L_0x030e
        L_0x0304:
            int r0 = r8.getInt(r9, r5)
            r12.A0V = r0
            if (r0 != r3) goto L_0x0047
            java.lang.String r0 = "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead."
        L_0x030e:
            android.util.Log.e(r11, r0)
            goto L_0x0047
        L_0x0313:
            float r0 = r12.A05
            float r0 = r8.getFloat(r9, r0)
            float r0 = java.lang.Math.max(r4, r0)
            r12.A05 = r0
            r12.A0W = r10
            goto L_0x0047
        L_0x0323:
            float r0 = r12.A04
            float r0 = r8.getFloat(r9, r0)
            float r0 = java.lang.Math.max(r4, r0)
            r12.A04 = r0
            r12.A0V = r10
            goto L_0x0047
        L_0x0333:
            r8.recycle()
            r12.A03()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C001702c.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public C001702c(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        float A012 = A01(this);
        float A002 = A00(this);
        this.A0t = null;
        this.A0F = 1;
        this.A03 = A012;
        this.A09 = A012;
        A02(this);
        this.A07 = A002;
        this.A0r = new AnonymousClass0R7();
    }

    public C001702c(int i, int i2) {
        super(i, i2);
        float A012 = A01(this);
        float A002 = A00(this);
        this.A0t = null;
        this.A0F = 1;
        this.A03 = A012;
        this.A09 = A012;
        A02(this);
        this.A07 = A002;
        this.A0r = new AnonymousClass0R7();
    }
}
