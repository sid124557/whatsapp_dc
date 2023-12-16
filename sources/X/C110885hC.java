package X;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import com.whatsapp.SecondaryProcessAbstractAppShellDelegate;
import com.whatsapp.businessdirectory.view.activity.BusinessDirectoryMapViewActivity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.5hC  reason: invalid class name and case insensitive filesystem */
public final class C110885hC implements C180308kp {
    public float A00 = 21.0f;
    public float A01 = 2.0f;
    public float A02;
    public float A03;
    public int A04;
    public int A05;
    public int A06;
    public C183698qT A07;
    public C180248kj A08;
    public C180258kk A09;
    public C180268kl A0A;
    public C180278km A0B;
    public C180288kn A0C;
    public C110815h5 A0D;
    public AnonymousClass4Ze A0E;
    public AnonymousClass4Zf A0F;
    public AnonymousClass4Zg A0G;
    public AnonymousClass5ZJ A0H;
    public AnonymousClass5ZJ A0I;
    public AnonymousClass5ZJ A0J;
    public AnonymousClass5ZJ A0K;
    public AnonymousClass7H8 A0L;
    public boolean A0M = false;
    public boolean A0N;
    public final int A0O;
    public final Context A0P;
    public final Matrix A0Q = AnonymousClass002.A05();
    public final AnonymousClass4PH A0R;
    public final C106725a3 A0S;
    public final AnonymousClass7TJ A0T;
    public final C125996Kh A0U;
    public final C157627ic A0V;
    public final ArrayList A0W = AnonymousClass001.A0s();
    public final List A0X = AnonymousClass001.A0s();
    public final float[] A0Y = AnonymousClass4L0.A0T();

    public final float A00() {
        return ((float) 0) + (((float) (this.A0R.A0F - this.A05)) / 2.0f);
    }

    public final void A0A(AnonymousClass7UM r3) {
        A0B(r3, (C183698qT) null, 0);
    }

    public final float A01() {
        int i = this.A06;
        return ((float) i) + (((float) ((this.A0R.A0D - i) - this.A04)) / 2.0f);
    }

    public final C166477yk A02() {
        float[] fArr = this.A0Y;
        AnonymousClass4PH r6 = this.A0R;
        fArr[0] = r6.A04 - A00();
        fArr[1] = r6.A05 - A01();
        r6.A0h.mapVectors(fArr);
        double d = r6.A02;
        float f = fArr[0];
        float f2 = (float) r6.A0J;
        return new C166477yk(C108975ds.A00(C106725a3.A02(r6.A03 - ((double) (fArr[1] / f2))), ((d - ((double) (f / f2))) * 360.0d) - 180.0d), r6.getZoom(), 0.0f, r6.A0A);
    }

    public void A03() {
        List list = this.A0X;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C110815h5 r1 = (C110815h5) list.get(i);
            if (r1 instanceof AnonymousClass6KV) {
                ((AnonymousClass6KV) r1).A0D();
            }
        }
    }

    public void A04() {
        if (this.A09 != null || !this.A0W.isEmpty()) {
            C166477yk A022 = A02();
            C180258kk r0 = this.A09;
            if (r0 != null) {
                r0.BOD(A022);
            }
            ArrayList arrayList = this.A0W;
            if (!arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((C180258kk) it.next()).BOD(A022);
                }
            }
        }
    }

    public void A05() {
        AnonymousClass7H8 r0 = this.A0L;
        if (r0 != null) {
            BusinessDirectoryMapViewActivity businessDirectoryMapViewActivity = r0.A01;
            C110885hC r3 = r0.A00;
            AnonymousClass4U2 r2 = businessDirectoryMapViewActivity.A0N;
            if (r2 == null) {
                throw C18270x1.A0S("viewModel");
            }
            C111525iE r5 = r2.A0V;
            C95224sp r1 = new C95224sp();
            r1.A0A = 0;
            r5.A04(r1);
            AnonymousClass0XV r52 = r2.A0T;
            AnonymousClass7KT r02 = (AnonymousClass7KT) r52.A04("saved-state-last-known-location");
            if (r02 != null) {
                r2.A06 = r02;
            }
            Object A042 = r52.A04("saved-state-error-dialog");
            if (A042 != null) {
                r2.A0N.A0H(A042);
            }
            Iterable<C166297yS> iterable = (Iterable) r52.A04("saved-state-marker-items");
            if (iterable != null) {
                r2.A0Q.A0H(iterable);
                for (C166297yS r7 : iterable) {
                    C109065e1 r6 = r7.A03;
                    if (r6 != null) {
                        Map map = r2.A0E;
                        String str = r6.A0F;
                        C162457s7.A0C(str);
                        map.put(str, r7);
                        if (r7.A01) {
                            r2.A0P(r6);
                        }
                    }
                }
            }
            Boolean bool = (Boolean) r52.A04("saved-state-search-business-chip-visible");
            if (bool != null) {
                r2.A0M = bool.booleanValue();
            }
            C91824lC r03 = (C91824lC) r52.A04("saved-state-selected-category");
            if (r03 != null) {
                r2.A09 = r03;
                r2.A0F();
            }
            Object A043 = r52.A04("saved-state-map-view-chip-state");
            if (A043 != null) {
                r2.A0P.A0H(A043);
            }
            Number number = (Number) r52.A04("saved-state-marker_state");
            if (number != null) {
                r2.A00 = number.intValue();
            }
            String str2 = (String) r52.A04("saved-state-view_state");
            if (str2 != null) {
                r2.A0D = str2;
            }
            AnonymousClass4U2 r22 = businessDirectoryMapViewActivity.A0N;
            if (r22 == null) {
                throw C18270x1.A0S("viewModel");
            }
            C166477yk A022 = r3.A02();
            C106725a3 r04 = r3.A0S;
            C162457s7.A0D(r04);
            r22.A0L(r04, A022);
            this.A0L = null;
        }
    }

    public final void A06() {
        Iterator it = this.A0X.iterator();
        while (it.hasNext()) {
            int i = ((C110815h5) it.next()).A03;
            if (i == 1 || i == 2 || i == 4) {
                it.remove();
            }
        }
        this.A0R.invalidate();
    }

    public final void A07() {
        AnonymousClass5ZJ r0 = this.A0I;
        if (r0 != null) {
            r0.A01();
        }
        AnonymousClass5ZJ r02 = this.A0J;
        if (r02 != null) {
            r02.A01();
        }
        AnonymousClass5ZJ r03 = this.A0K;
        if (r03 != null) {
            r03.A01();
        }
        AnonymousClass5ZJ r04 = this.A0H;
        if (r04 != null) {
            r04.A01();
        }
    }

    public final void A08(int i, int i2, int i3) {
        AnonymousClass4PH r8 = this.A0R;
        double d = r8.A02;
        long j = r8.A0J << 1;
        r8.A0A(d + ((double) (((long) ((0 - this.A05) - (-i2))) / j)), r8.A03 + ((double) (((long) ((this.A06 - this.A04) - (i - i3))) / j)));
        this.A06 = i;
        this.A05 = i2;
        this.A04 = i3;
        r8.requestLayout();
        r8.invalidate();
    }

    public final void A09(AnonymousClass7UM r3) {
        A0B(r3, (C183698qT) null, 1500);
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0108  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0B(X.AnonymousClass7UM r22, X.C183698qT r23, int r24) {
        /*
            r21 = this;
            r8 = r21
            X.4PH r7 = r8.A0R
            boolean r0 = r7.A0b
            if (r0 != 0) goto L_0x0107
            r3 = 1
            r11 = r24
            if (r24 == 0) goto L_0x0018
            X.6Kh r0 = r8.A0U
            r2 = -1
            X.7b0 r1 = r0.A0A
            int r0 = r1.A03
            if (r0 != r2) goto L_0x0018
            r1.A03 = r3
        L_0x0018:
            r8.A07()
            r8.A0M = r3
            float r13 = r8.A00()
            float r12 = r8.A01()
            float r2 = r7.getZoom()
            r8.A02 = r13
            r8.A03 = r12
            r10 = r22
            float r1 = r10.A01
            r6 = 0
            r20 = -822083584(0xffffffffcf000000, float:-2.14748365E9)
            int r0 = (r1 > r20 ? 1 : (r1 == r20 ? 0 : -1))
            if (r0 == 0) goto L_0x01a6
            r2 = r1
        L_0x0039:
            float r1 = r8.A01
            float r0 = r8.A00
            float r9 = X.AnonymousClass001.A01(r0, r2, r1)
            double r4 = r7.A02
            double r2 = r7.A03
            X.5ds r14 = r10.A06
            if (r14 != 0) goto L_0x0051
            X.5du r0 = r10.A07
            if (r0 == 0) goto L_0x009a
            X.5ds r14 = r0.A00()
        L_0x0051:
            double r0 = r14.A01
            double r4 = X.C106725a3.A01(r0)
            double r0 = r14.A00
            double r2 = X.C106725a3.A00(r0)
            float[] r14 = r8.A0Y
            float r0 = r7.A04
            float r0 = r0 - r13
            r14[r6] = r0
            float r15 = r7.A05
            float r15 = r15 - r12
            r1 = 1
            r14[r1] = r15
            r16 = 0
            int r0 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r0 != 0) goto L_0x0074
            int r0 = (r15 > r16 ? 1 : (r15 == r16 ? 0 : -1))
            if (r0 == 0) goto L_0x009a
        L_0x0074:
            int r0 = (int) r9
            int r1 = r1 << r0
            int r0 = r8.A0O
            int r1 = r1 * r0
            r15 = 1065353216(0x3f800000, float:1.0)
            float r0 = r9 % r15
            float r0 = r0 + r15
            android.graphics.Matrix r15 = r8.A0Q
            r15.setScale(r0, r0)
            float r0 = r7.A0A
            r15.postRotate(r0)
            r15.invert(r15)
            r15.mapVectors(r14)
            r0 = r14[r6]
            float r6 = (float) r1
            float r0 = r0 / r6
            double r0 = (double) r0
            double r4 = r4 + r0
            r0 = 1
            r0 = r14[r0]
            float r0 = r0 / r6
            double r0 = (double) r0
            double r2 = r2 + r0
        L_0x009a:
            float r6 = r7.A0A
            float r10 = r10.A00
            int r0 = (r10 > r20 ? 1 : (r10 == r20 ? 0 : -1))
            if (r0 == 0) goto L_0x00af
            r14 = 1135869952(0x43b40000, float:360.0)
            float r10 = r10 % r14
            float r0 = r6 - r10
            r1 = 1127481344(0x43340000, float:180.0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0199
            float r6 = r10 + r14
        L_0x00af:
            double r4 = X.AnonymousClass4PH.A00(r4)
            int r0 = (int) r9
            r1 = 1
            int r1 = r1 << r0
            int r0 = r8.A0O
            int r1 = r1 * r0
            long r0 = (long) r1
            double r2 = r7.A03(r2, r0)
            r10 = r23
            if (r24 > 0) goto L_0x0108
            float r0 = r7.getZoom()
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x00d1
            float r1 = r8.A02
            float r0 = r8.A03
            r7.A0H(r9, r1, r0)
        L_0x00d1:
            double r0 = r7.A02
            int r9 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r9 != 0) goto L_0x00dd
            double r0 = r7.A03
            int r9 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r9 == 0) goto L_0x00e0
        L_0x00dd:
            r7.A0A(r4, r2)
        L_0x00e0:
            float r0 = r7.A0A
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x00e9
            r7.A0B(r6, r13, r12)
        L_0x00e9:
            r7.invalidate()
            r8.A04()
        L_0x00ef:
            X.5ZJ r0 = r8.A0I
            if (r0 != 0) goto L_0x0107
            X.5ZJ r0 = r8.A0J
            if (r0 != 0) goto L_0x0107
            X.5ZJ r0 = r8.A0K
            if (r0 != 0) goto L_0x0107
            X.5ZJ r0 = r8.A0H
            if (r0 != 0) goto L_0x0107
            if (r23 == 0) goto L_0x0107
            r0 = 0
            r8.A07 = r0
            r10.BTW()
        L_0x0107:
            return
        L_0x0108:
            r8.A07 = r10
            float r1 = r7.getZoom()
            int r0 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0122
            X.5ZJ r9 = X.AnonymousClass5ZJ.A00(r1, r9)
            r8.A0K = r9
            r9.A06(r8)
            r9.A07(r8)
            long r0 = (long) r11
            r9.A05(r0)
        L_0x0122:
            double r0 = r7.A02
            int r9 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r9 == 0) goto L_0x0145
            double r16 = r4 - r0
            r12 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            r14 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r9 = (r16 > r12 ? 1 : (r16 == r12 ? 0 : -1))
            if (r9 <= 0) goto L_0x0191
            double r4 = r4 - r14
        L_0x0133:
            float r9 = (float) r0
            float r0 = (float) r4
            X.5ZJ r4 = X.AnonymousClass5ZJ.A00(r9, r0)
            r8.A0I = r4
            r4.A06(r8)
            r4.A07(r8)
            long r0 = (long) r11
            r4.A05(r0)
        L_0x0145:
            double r0 = r7.A03
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 == 0) goto L_0x015d
            float r4 = (float) r0
            float r0 = (float) r2
            X.5ZJ r2 = X.AnonymousClass5ZJ.A00(r4, r0)
            r8.A0J = r2
            r2.A06(r8)
            r2.A07(r8)
            long r0 = (long) r11
            r2.A05(r0)
        L_0x015d:
            float r1 = r7.A0A
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0173
            X.5ZJ r2 = X.AnonymousClass5ZJ.A00(r1, r6)
            r8.A0H = r2
            r2.A06(r8)
            r2.A07(r8)
            long r0 = (long) r11
            r2.A05(r0)
        L_0x0173:
            X.5ZJ r0 = r8.A0I
            if (r0 == 0) goto L_0x017a
            r0.A03()
        L_0x017a:
            X.5ZJ r0 = r8.A0J
            if (r0 == 0) goto L_0x0181
            r0.A03()
        L_0x0181:
            X.5ZJ r0 = r8.A0K
            if (r0 == 0) goto L_0x0188
            r0.A03()
        L_0x0188:
            X.5ZJ r0 = r8.A0H
            if (r0 == 0) goto L_0x00ef
            r0.A03()
            goto L_0x00ef
        L_0x0191:
            r12 = -4620693217682128896(0xbfe0000000000000, double:-0.5)
            int r9 = (r16 > r12 ? 1 : (r16 == r12 ? 0 : -1))
            if (r9 >= 0) goto L_0x0133
            double r4 = r4 + r14
            goto L_0x0133
        L_0x0199:
            float r0 = r10 - r6
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x01a3
            float r6 = r10 - r14
            goto L_0x00af
        L_0x01a3:
            r6 = r10
            goto L_0x00af
        L_0x01a6:
            float r1 = r10.A02
            int r0 = (r1 > r20 ? 1 : (r1 == r20 ? 0 : -1))
            if (r0 == 0) goto L_0x01c1
            float r2 = r2 + r1
            float r1 = r10.A03
            int r0 = (r1 > r20 ? 1 : (r1 == r20 ? 0 : -1))
            if (r0 != 0) goto L_0x01b9
            float r0 = r10.A04
            int r0 = (r0 > r20 ? 1 : (r0 == r20 ? 0 : -1))
            if (r0 == 0) goto L_0x0039
        L_0x01b9:
            r8.A02 = r1
            float r0 = r10.A04
            r8.A03 = r0
            goto L_0x0039
        L_0x01c1:
            X.5du r5 = r10.A07
            if (r5 == 0) goto L_0x0039
            int r2 = r7.A0F
            int r0 = r8.A05
            int r2 = r2 - r0
            int r3 = r7.A0D
            int r0 = r8.A06
            int r3 = r3 - r0
            int r0 = r8.A04
            int r3 = r3 - r0
            if (r2 != 0) goto L_0x01dd
            if (r3 != 0) goto L_0x01dd
            java.lang.String r0 = "Error using newLatLngBounds(LatLngBounds, int): Map size can't be 0. Most likely, layout has not yet occured for the map view.  Either wait until layout has occurred or use newLatLngBounds(LatLngBounds, int, int, int) which allows you to specify the map's dimensions."
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r0)
            throw r0
        L_0x01dd:
            int r0 = r10.A05
            int r1 = r0 * 2
            int r0 = r2 + r1
            if (r0 <= r2) goto L_0x01e6
            int r2 = r2 - r1
        L_0x01e6:
            int r0 = r3 + r1
            if (r0 <= r3) goto L_0x01eb
            int r3 = r3 - r1
        L_0x01eb:
            int r2 = java.lang.Math.max(r6, r2)
            int r4 = java.lang.Math.max(r6, r3)
            X.5ds r3 = r5.A00
            double r0 = r3.A01
            double r14 = X.C106725a3.A01(r0)
            X.5ds r5 = r5.A01
            double r0 = r5.A01
            double r0 = X.C106725a3.A01(r0)
            double r14 = r14 - r0
            double r18 = java.lang.Math.abs(r14)
            double r0 = r5.A00
            double r14 = X.C106725a3.A00(r0)
            double r0 = r3.A00
            double r0 = X.C106725a3.A00(r0)
            double r14 = r14 - r0
            double r16 = java.lang.Math.abs(r14)
            double r0 = (double) r2
            double r0 = r0 / r18
            int r2 = r8.A0O
            double r2 = (double) r2
            double r0 = r0 / r2
            double r0 = java.lang.Math.log(r0)
            double r14 = X.AnonymousClass4PH.A0n
            double r0 = r0 / r14
            float r5 = (float) r0
            double r0 = (double) r4
            double r0 = r0 / r16
            double r0 = r0 / r2
            double r0 = java.lang.Math.log(r0)
            double r0 = r0 / r14
            float r2 = (float) r0
            float r2 = java.lang.Math.min(r5, r2)
            goto L_0x0039
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C110885hC.A0B(X.7UM, X.8qT, int):void");
    }

    public final void A0C(C110815h5 r3) {
        List list = this.A0X;
        int binarySearch = Collections.binarySearch(list, r3, C110815h5.A0E);
        if (binarySearch <= 0) {
            list.add(-1 - binarySearch, r3);
            r3.A03();
            this.A0R.invalidate();
        }
    }

    public final void A0D(C110815h5 r2) {
        this.A0X.remove(r2);
        this.A0R.invalidate();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0011, code lost:
        if (X.AnonymousClass0Y8.A05(r1, "android.permission.ACCESS_FINE_LOCATION") == 0) goto L_0x0013;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0E(boolean r3) {
        /*
            r2 = this;
            android.content.Context r1 = r2.A0P
            java.lang.String r0 = "android.permission.ACCESS_COARSE_LOCATION"
            int r0 = X.AnonymousClass0Y8.A05(r1, r0)
            if (r0 == 0) goto L_0x0013
            java.lang.String r0 = "android.permission.ACCESS_FINE_LOCATION"
            int r1 = X.AnonymousClass0Y8.A05(r1, r0)
            r0 = 0
            if (r1 != 0) goto L_0x0014
        L_0x0013:
            r0 = 1
        L_0x0014:
            r2.A0N = r0
            r3 = r3 & r0
            X.7ic r0 = r2.A0V
            r0.A01(r3)
            if (r3 == 0) goto L_0x003d
            X.4Zg r0 = r2.A0G
            if (r0 != 0) goto L_0x0037
            X.4Zg r0 = new X.4Zg
            r0.<init>(r2)
            r2.A0G = r0
            r2.A0C(r0)
            X.4Zg r0 = r2.A0G
            X.5ZJ r1 = r0.A0E
            boolean r0 = r1.A0G
            if (r0 != 0) goto L_0x0037
            r1.A03()
        L_0x0037:
            X.7TJ r0 = r2.A0T
            r0.A00()
            return
        L_0x003d:
            X.4Zg r1 = r2.A0G
            if (r1 == 0) goto L_0x0037
            X.5ZJ r0 = r1.A0E
            r0.A01()
            r1.A02()
            X.4Zg r0 = r2.A0G
            r2.A0D(r0)
            r0 = 0
            r2.A0G = r0
            goto L_0x0037
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C110885hC.A0E(boolean):void");
    }

    public void BMT(AnonymousClass5ZJ r7) {
        AnonymousClass4PH r3;
        double d;
        double d2;
        AnonymousClass5ZJ r0 = this.A0I;
        if (r7 == r0) {
            r3 = this.A0R;
            d = (double) r0.A00;
            d2 = r3.A03;
        } else {
            AnonymousClass5ZJ r02 = this.A0J;
            if (r7 == r02) {
                r3 = this.A0R;
                d = r3.A02;
                d2 = (double) r02.A00;
            } else {
                if (r7 == this.A0K) {
                    r3 = this.A0R;
                    if (r3.A0H(r7.A00, this.A02, this.A03)) {
                        r3.A0M.A04();
                    }
                } else if (r7 == this.A0H) {
                    r3 = this.A0R;
                    r3.A0B(r7.A00, A00(), A01());
                } else {
                    return;
                }
                r3.invalidate();
            }
        }
        r3.A0A(d, d2);
        r3.invalidate();
    }

    public C110885hC(C150067Pa r6, AnonymousClass4PH r7) {
        PorterDuffColorFilter porterDuffColorFilter;
        String str;
        this.A0R = r7;
        Context applicationContext = r7.getContext().getApplicationContext();
        this.A0P = applicationContext;
        this.A0S = new C106725a3(this);
        AnonymousClass7TJ r4 = new AnonymousClass7TJ(this);
        this.A0T = r4;
        AnonymousClass714.A00(applicationContext);
        int i = AnonymousClass000.A0B(applicationContext).densityDpi >= 320 ? 512 : 256;
        this.A0O = i;
        C125996Kh r2 = new C125996Kh(this, new AnonymousClass6KW(applicationContext, r6, i));
        A0C(r2);
        this.A0U = r2;
        C157627ic r3 = new C157627ic(r7.getContext());
        this.A0V = r3;
        AnonymousClass7AA r1 = new AnonymousClass7AA(this);
        r3.A01 = r1;
        if (r3.A00 != null && r3.A04) {
            r1.A00.A0R.invalidate();
        }
        if (r6 != null) {
            boolean z = r6.A05;
            C110885hC r12 = r4.A00;
            AnonymousClass4Ze r0 = r12.A0E;
            if (z) {
                if (r0 == null) {
                    AnonymousClass4Ze r02 = new AnonymousClass4Ze(r12);
                    r12.A0E = r02;
                    r12.A0C(r02);
                }
            } else if (r0 != null) {
                r12.A0D(r0);
                r12.A0E = null;
            }
            r4.A02 = r6.A07;
            r4.A03 = r6.A08;
            this.A00 = Math.min(Math.max(21.0f, 2.0f), 21.0f);
            this.A01 = Math.min(Math.max(2.0f, 2.0f), 21.0f);
            int i2 = r6.A00;
            if (i2 != r2.A00) {
                r2.A00 = i2;
                if (!r2.A04) {
                    r2.A09(true);
                }
                AnonymousClass6KW r13 = r2.A03;
                switch (i2) {
                    case 5:
                        str = "live_maps";
                        break;
                    case 6:
                        str = "crowdsourcing_osm";
                        break;
                    case 7:
                        str = "indoor_osm";
                        break;
                    case 8:
                        if (!r13.A03.A06) {
                            str = SecondaryProcessAbstractAppShellDelegate.COMPRESSED_WHATSAPP_LIB_NAME;
                            break;
                        } else {
                            str = "whatsapp_dark";
                            break;
                        }
                    default:
                        if (!r13.A03.A06) {
                            str = null;
                            break;
                        } else {
                            str = "dark";
                            break;
                        }
                }
                r13.A01 = str;
                C110885hC r03 = r2.A09;
                r03.A03();
                r03.A0R.invalidate();
            }
            boolean z2 = r6.A06;
            Paint paint = r2.A02;
            if (z2) {
                porterDuffColorFilter = C125996Kh.A05;
                if (porterDuffColorFilter == null) {
                    porterDuffColorFilter = new PorterDuffColorFilter(-526345, PorterDuff.Mode.SRC_ATOP);
                    C125996Kh.A05 = porterDuffColorFilter;
                }
            } else {
                porterDuffColorFilter = null;
            }
            paint.setColorFilter(porterDuffColorFilter);
        }
    }
}
