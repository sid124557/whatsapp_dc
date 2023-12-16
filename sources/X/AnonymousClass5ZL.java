package X;

import android.location.LocationManager;
import com.whatsapp.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.5ZL  reason: invalid class name */
public final class AnonymousClass5ZL {
    public static final AnonymousClass5XN A0L = new AnonymousClass5XN();
    public int A00 = Integer.MAX_VALUE;
    public int A01 = -1;
    public final C06270Wx A02;
    public final C06270Wx A03;
    public final C06270Wx A04;
    public final C06270Wx A05;
    public final C06270Wx A06;
    public final AnonymousClass08J A07;
    public final AnonymousClass08J A08;
    public final AnonymousClass5P2 A09;
    public final C111515iD A0A;
    public final AnonymousClass5QC A0B;
    public final C56612sH A0C;
    public final AnonymousClass1VX A0D;
    public final C56532s8 A0E;
    public final C72173dI A0F;
    public final AnonymousClass4C1 A0G;
    public final AnonymousClass4GP A0H;
    public final AnonymousClass4GQ A0I;
    public final AnonymousClass4GQ A0J;
    public final boolean A0K;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x007a, code lost:
        if (r1.A02(r9, r2.A00) == false) goto L_0x007c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass5ZL(X.C06270Wx r11, X.C06270Wx r12, X.C06270Wx r13, X.C06270Wx r14, X.C06270Wx r15, X.C06270Wx r16, X.C06270Wx r17, X.AnonymousClass5P2 r18, X.C111515iD r19, X.AnonymousClass5QC r20, X.C56612sH r21, X.C620733j r22, X.AnonymousClass1VX r23, X.C103315Mk r24, X.AnonymousClass4FS r25, X.AnonymousClass4C1 r26, X.AnonymousClass4GP r27, X.AnonymousClass4GQ r28, X.AnonymousClass4GQ r29) {
        /*
            r10 = this;
            r4 = r21
            r6 = r22
            r9 = r23
            r8 = r24
            r1 = r25
            X.C18260x0.A0f(r4, r9, r1, r6, r8)
            r7 = r19
            r5 = r20
            r2 = r18
            X.C18260x0.A0W(r5, r2, r7)
            r0 = 9
            r3 = r26
            X.C162457s7.A0J(r3, r0)
            r10.<init>()
            r10.A0C = r4
            r10.A0D = r9
            r10.A0B = r5
            r10.A09 = r2
            r10.A0A = r7
            r10.A0G = r3
            r10.A05 = r12
            r10.A04 = r13
            r10.A06 = r14
            r0 = r28
            r10.A0J = r0
            r0 = r29
            r10.A0I = r0
            r0 = r27
            r10.A0H = r0
            r5 = r16
            r10.A02 = r5
            r4 = r17
            r10.A03 = r4
            r0 = 2147483647(0x7fffffff, float:NaN)
            r10.A00 = r0
            r0 = -1
            r10.A01 = r0
            X.08J r3 = X.AnonymousClass4L0.A0E()
            r10.A08 = r3
            X.08J r7 = X.AnonymousClass4L0.A0E()
            r10.A07 = r7
            X.2s8 r0 = new X.2s8
            r0.<init>(r6)
            r10.A0E = r0
            r6 = 0
            X.3dI r0 = new X.3dI
            r0.<init>(r1, r6)
            r10.A0F = r0
            X.5XN r1 = A0L
            r0 = 6743(0x1a57, float:9.449E-42)
            boolean r0 = r9.A0X(r0)
            if (r0 == 0) goto L_0x007c
            java.lang.String r0 = r2.A00
            boolean r1 = r1.A02(r9, r0)
            r0 = 1
            if (r1 != 0) goto L_0x007d
        L_0x007c:
            r0 = 0
        L_0x007d:
            r10.A0K = r0
            X.C103315Mk.A00(r3, r7, r8, r10, r6)
            X.60F r1 = new X.60F
            r1.<init>(r10)
            r0 = 113(0x71, float:1.58E-43)
            X.C86604Kt.A1O(r11, r3, r1, r0)
            X.60G r1 = new X.60G
            r1.<init>(r10)
            r0 = 114(0x72, float:1.6E-43)
            X.C86604Kt.A1O(r12, r3, r1, r0)
            X.60H r1 = new X.60H
            r1.<init>(r10)
            r0 = 115(0x73, float:1.61E-43)
            X.C86604Kt.A1O(r13, r3, r1, r0)
            X.60I r1 = new X.60I
            r1.<init>(r10)
            r0 = 116(0x74, float:1.63E-43)
            X.C86604Kt.A1O(r14, r3, r1, r0)
            X.60J r1 = new X.60J
            r1.<init>(r10)
            r0 = 117(0x75, float:1.64E-43)
            X.C86604Kt.A1O(r5, r3, r1, r0)
            X.60K r1 = new X.60K
            r1.<init>(r10)
            r0 = 118(0x76, float:1.65E-43)
            X.C86604Kt.A1O(r4, r3, r1, r0)
            X.60L r1 = new X.60L
            r1.<init>(r10)
            r0 = 119(0x77, float:1.67E-43)
            X.C86604Kt.A1O(r15, r3, r1, r0)
            X.5jc r0 = r2.A04
            X.5U8 r0 = r0.A02
            X.08M r2 = r0.A02
            X.60M r1 = new X.60M
            r1.<init>(r10)
            r0 = 112(0x70, float:1.57E-43)
            X.C86604Kt.A1O(r2, r3, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5ZL.<init>(X.0Wx, X.0Wx, X.0Wx, X.0Wx, X.0Wx, X.0Wx, X.0Wx, X.5P2, X.5iD, X.5QC, X.2sH, X.33j, X.1VX, X.5Mk, X.4FS, X.4C1, X.4GP, X.4GQ, X.4GQ):void");
    }

    public static final boolean A00(C156137g5 r2, String str) {
        if ((r2 instanceof C97884zQ) && C162457s7.A0P(((C97884zQ) r2).A00, C18310x6.A0S(str))) {
            return true;
        }
        if ((r2 instanceof C97874zP) && C162457s7.A0P(((C97874zP) r2).A00.A0H, C18310x6.A0S(str))) {
            return true;
        }
        if (!(r2 instanceof C97834zK) || !C162457s7.A0P(((C97834zK) r2).A01.A04, str)) {
            return false;
        }
        return true;
    }

    public final C97854zM A01() {
        boolean z;
        C112365jc r3 = this.A09.A04;
        AnonymousClass5U8 r2 = r3.A02;
        if (r2.A00 == null) {
            r2.A00();
        }
        AnonymousClass5ZO r4 = r2.A00;
        C162457s7.A0D(r4);
        AnonymousClass5ZO r1 = r2.A00;
        if (!r2.A03() || r1 == null || r1.A07()) {
            z = true;
        } else {
            z = r3.A00;
        }
        return new C97854zM(r4, new C119005wH(this), this.A0K, z);
    }

    public final String A02() {
        AnonymousClass5U8 r1 = this.A09.A04.A02;
        if (r1.A00 == null) {
            r1.A00();
        }
        String str = r1.A00.A09;
        C162457s7.A0D(str);
        return str;
    }

    public final void A04() {
        String str;
        C112365jc r1 = this.A09.A04;
        C186568vZ r3 = r1.A06;
        r3.markerStart(207368785);
        AnonymousClass5U8 r4 = r1.A02;
        if (!r4.A03()) {
            if (!r4.A03()) {
                C06270Wx.A04(r4.A06, 3);
            }
            str = "location_permission_request_start";
        } else if (!((LocationManager) r1.A04.A00.getSystemService("location")).isProviderEnabled("gps")) {
            if (r4.A03()) {
                C06270Wx.A04(r4.A06, 4);
            }
            str = "turn_on_gps_setting_request_start";
        } else {
            r4.A02();
            str = "fetch_user_location_request_start";
        }
        r3.markerPoint(207368785, str);
    }

    public final void A05(AnonymousClass5T8 r4, String str, List list) {
        AnonymousClass5U8 r1 = this.A09.A04.A02;
        if (r1.A00 == null) {
            r1.A00();
        }
        AnonymousClass5ZO r2 = r1.A00;
        C162457s7.A0D(r2);
        list.add(new C97834zK(r2, r4, new AnonymousClass63D(this, r4, str)));
    }

    public final void A06(C95814uZ r24, String str, boolean z) {
        Iterable<C156137g5> iterable = (Iterable) this.A07.A07();
        if (iterable != null) {
            int i = 5;
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            for (C156137g5 r1 : iterable) {
                if (A00(r1, r24.getRawString())) {
                    if (r1 instanceof C97874zP) {
                        i = 0;
                    } else {
                        i = 5;
                        if (r1 instanceof C97884zQ) {
                            i = 1;
                        }
                    }
                    i2 = i4 + 1;
                }
                if ((r1 instanceof C97874zP) || (r1 instanceof C97884zQ)) {
                    i3++;
                } else if (!(r1 instanceof C97834zK)) {
                }
                i4++;
            }
            C111515iD r9 = this.A0A;
            C56532s8 r4 = this.A0E;
            int i5 = 0;
            if (r4.A02 == 98) {
                i5 = 20;
            }
            String A022 = r4.A02();
            int A052 = C86644Kx.A05(r4);
            String A023 = A02();
            if (C111515iD.A00(r9)) {
                C94924sJ r10 = new C94924sJ();
                C94924sJ.A01(r9, r10, 5, i5, i);
                r9.A02(r10, Integer.valueOf(A052), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), (Integer) null, A023, (List) null);
                r9.A02.BhD(r10);
            }
            C111515iD r15 = r9;
            r15.A03(Boolean.valueOf(z), Integer.valueOf(i), A022, str, (String) null, 1, i5);
        }
    }

    public final boolean A07() {
        C06270Wx r1 = this.A05;
        if (r1.A07() == null) {
            return true;
        }
        Number A0i = C86654Ky.A0i(r1);
        if (A0i == null || A0i.intValue() != 0) {
            return false;
        }
        return true;
    }

    public final boolean A08(C95814uZ r5) {
        Collection<C156137g5> A1P = C86664Kz.A1P(this.A07);
        if (A1P == null || A1P.isEmpty()) {
            return false;
        }
        for (C156137g5 r1 : A1P) {
            if ((r1 instanceof C97834zK) && C162457s7.A0P(((C97834zK) r1).A01.A04, C18290x4.A0n(r5))) {
                return true;
            }
        }
        return false;
    }

    public final List A03(AnonymousClass5I3 r14) {
        C95814uZ A012;
        ArrayList A0s = AnonymousClass001.A0s();
        AnonymousClass0QU r8 = r14.A00;
        r8.A02();
        AnonymousClass5P2 r7 = this.A09;
        C56532s8 r12 = (C56532s8) r14.A01;
        ArrayList A0s2 = AnonymousClass001.A0s();
        C113375lK r6 = r7.A01;
        List A0p = AnonymousClass8UF.A0p(r6);
        if (C56532s8.A00(r12)) {
            AnonymousClass65X r1 = r7.A0B;
            List A042 = r12.A04();
            C162457s7.A0D(A042);
            A0p.add(r1.B07(A042));
        }
        AnonymousClass314 r9 = r7.A08;
        Iterator it = r9.A05().iterator();
        while (it.hasNext()) {
            C95814uZ A0P = C18300x5.A0P(it);
            r8.A02();
            C162457s7.A0H(A0P);
            if ((!r7.A06.A0I(A0P)) && C66473Lo.A00(A0P, A0p)) {
                r8.A02();
                A0s2.add(A0P);
            }
        }
        if (AnonymousClass0x7.A1S(A0s2)) {
            A0s.add(new C97804zH(Integer.valueOf(R.string.f11nameremoved), 37));
            ArrayList A0d = C73783g4.A0d(A0s2);
            Iterator it2 = A0s2.iterator();
            while (it2.hasNext()) {
                C97884zQ.A00(C18300x5.A0P(it2), A0d);
            }
            A0s.addAll(A0d);
        }
        r8.A02();
        ArrayList A0s3 = AnonymousClass001.A0s();
        List A0p2 = AnonymousClass8UF.A0p(r6);
        if (C56532s8.A00(r12)) {
            AnonymousClass2ML r11 = r7.A0C;
            A0p2.add(new C113415lO(r7.A07, r7.A09, r11, r12.A04()));
        }
        Iterator it3 = r7.A09.A02().iterator();
        while (it3.hasNext()) {
            AnonymousClass3ZH A0R = C18310x6.A0R(it3);
            r8.A02();
            if (A0R.A0F != null && (A012 = AnonymousClass3ZH.A01(A0R)) != null && (!r7.A06.A0I(A012)) && !r9.A05().contains(A012) && C66473Lo.A00(A012, A0p2)) {
                r8.A02();
                A0s3.add(A0R);
            }
        }
        if (AnonymousClass0x7.A1S(A0s3)) {
            A0s.add(new C97804zH(Integer.valueOf(R.string.f11nameremoved), 37));
            ArrayList A0d2 = C73783g4.A0d(A0s3);
            Iterator it4 = A0s3.iterator();
            while (it4.hasNext()) {
                A0d2.add(new C97874zP(C18310x6.A0R(it4)));
            }
            A0s.addAll(A0d2);
        }
        return A0s;
    }
}
