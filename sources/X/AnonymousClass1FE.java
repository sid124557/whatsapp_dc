package X;

import com.whatsapp.jid.UserJid;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.1FE  reason: invalid class name */
public class AnonymousClass1FE extends C59332wk implements Runnable, AnonymousClass4B6 {
    public final int A00;
    public final C28891hw A01;
    public final C66493Lq A02;
    public final C27991fJ A03;
    public final String A04;
    public final List A05;
    public final boolean A06;

    public void A00(Integer num) {
        int i;
        C51342jf r2;
        AnonymousClass1Y6 A002;
        if (this instanceof C27511dw) {
            C27511dw r5 = (C27511dw) this;
            C54072o8 r1 = r5.A00;
            r1.A00.A6M();
            AnonymousClass2ZR r4 = r1.A03;
            if (r4 == null) {
                return;
            }
            if (num != null) {
                r4.A00(r5.A01, r5.A02, 2);
                return;
            }
            UserJid userJid = r5.A01;
            Integer num2 = r5.A02;
            C46632bx r22 = r4.A02;
            if (r22.A02.A0a(userJid) && num2 != null) {
                int intValue = num2.intValue();
                if (intValue == 3) {
                    r2 = r22.A04;
                    A002 = AnonymousClass1Y6.A00(r2);
                    i = 1;
                } else {
                    i = 4;
                    if (intValue == 4) {
                        r2 = r22.A04;
                        A002 = AnonymousClass1Y6.A00(r2);
                    } else {
                        return;
                    }
                }
                A002.A02 = Integer.valueOf(i);
                A002.A00 = Boolean.FALSE;
                r2.A01.BhD(A002);
            }
        } else if (this instanceof C27501dv) {
            C27501dv r42 = (C27501dv) this;
            C54072o8 r12 = r42.A00;
            r12.A00.A6M();
            AnonymousClass2ZR r3 = r12.A03;
            if (r3 != null && num != null) {
                r3.A00(r42.A01, r42.A02, 1);
            }
        } else if (this instanceof C27491du) {
            ((C27491du) this).A00.A6M();
        } else if (this instanceof C27361dh) {
            C47602dW r32 = ((C27361dh) this).A00;
            r32.A06.BkS(new C69993Zl(r32, 41));
        } else if (this instanceof C27371di) {
            ((C27371di) this).A00.A0G(num);
        } else if (this instanceof C27521dx) {
            C27521dx r33 = (C27521dx) this;
            if (r33.A03) {
                r33.A01.A01.A0K(AnonymousClass3ZH.A02(r33.A02, C95814uZ.class), true);
            }
            AnonymousClass4E6 r23 = r33.A00;
            if (r23 != null) {
                r23.BUA(r33.A02, r33.A04);
            }
        } else if (this instanceof C27531dy) {
            C27531dy r34 = (C27531dy) this;
            if (num != null) {
                AnonymousClass11H r24 = r34.A00;
                if (num.intValue() == 406) {
                    r24.A0u.A05(false);
                }
                r24.A0E.A0G(num);
            }
            AnonymousClass0x9.A1I(r34.A00.A10);
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00a9, code lost:
        if (r8 != 403) goto L_0x00ab;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BkI(int r8) {
        /*
            r7 = this;
            boolean r0 = r7 instanceof X.C27531dy
            if (r0 != 0) goto L_0x0053
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "groupmgr/request failed : "
            r1.append(r0)
            r1.append(r8)
            java.lang.String r0 = " | "
            r1.append(r0)
            X.1fJ r3 = r7.A03
            r1.append(r3)
            r1.append(r0)
            int r6 = r7.A00
            X.C18270x1.A1F(r1, r6)
            X.3fU r0 = r7.A01
            r0.cancel()
            r0 = 30
            r4 = 404(0x194, float:5.66E-43)
            r5 = 403(0x193, float:5.65E-43)
            r1 = 401(0x191, float:5.62E-43)
            r2 = 0
            if (r6 == r0) goto L_0x00c3
            r0 = 159(0x9f, float:2.23E-43)
            if (r6 == r0) goto L_0x00a7
            r0 = 161(0xa1, float:2.26E-43)
            if (r6 == r0) goto L_0x009c
            r0 = 213(0xd5, float:2.98E-43)
            if (r6 == r0) goto L_0x00a7
            r0 = 224(0xe0, float:3.14E-43)
            if (r6 == r0) goto L_0x00a7
            r0 = 91
            if (r6 == r0) goto L_0x008b
            r0 = 92
            if (r6 == r0) goto L_0x008b
            switch(r6) {
                case 15: goto L_0x00d4;
                case 16: goto L_0x005b;
                case 17: goto L_0x006c;
                default: goto L_0x004d;
            }
        L_0x004d:
            X.1hw r1 = r7.A01
            r0 = 0
            r1.A0C(r3, r0)
        L_0x0053:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            r7.A00(r0)
            return
        L_0x005b:
            switch(r8) {
                case 403: goto L_0x0062;
                case 404: goto L_0x0066;
                case 405: goto L_0x0069;
                default: goto L_0x005e;
            }
        L_0x005e:
            r1 = 2022(0x7e6, float:2.833E-42)
            goto L_0x00e6
        L_0x0062:
            r1 = 2023(0x7e7, float:2.835E-42)
            goto L_0x00e6
        L_0x0066:
            r1 = 2024(0x7e8, float:2.836E-42)
            goto L_0x00e6
        L_0x0069:
            r1 = 2028(0x7ec, float:2.842E-42)
            goto L_0x00e6
        L_0x006c:
            if (r8 == r1) goto L_0x0088
            r0 = 406(0x196, float:5.69E-43)
            if (r8 == r0) goto L_0x007e
            if (r8 == r5) goto L_0x007b
            r1 = 2008(0x7d8, float:2.814E-42)
            if (r8 == r4) goto L_0x00e6
            r1 = 2005(0x7d5, float:2.81E-42)
            goto L_0x00e6
        L_0x007b:
            r1 = 2007(0x7d7, float:2.812E-42)
            goto L_0x00e6
        L_0x007e:
            java.lang.String r2 = r7.A04
            r1 = 2009(0x7d9, float:2.815E-42)
            android.os.Handler r0 = X.C66493Lq.A1H
            X.C18290x4.A1C(r0, r2, r1)
            goto L_0x004d
        L_0x0088:
            r1 = 2006(0x7d6, float:2.811E-42)
            goto L_0x00e6
        L_0x008b:
            if (r8 == r1) goto L_0x0099
            if (r8 == r5) goto L_0x0096
            r1 = 2021(0x7e5, float:2.832E-42)
            if (r8 == r4) goto L_0x00e6
            r1 = 2018(0x7e2, float:2.828E-42)
            goto L_0x00e6
        L_0x0096:
            r1 = 2020(0x7e4, float:2.83E-42)
            goto L_0x00e6
        L_0x0099:
            r1 = 2019(0x7e3, float:2.829E-42)
            goto L_0x00e6
        L_0x009c:
            if (r8 == r1) goto L_0x00bb
            if (r8 == r5) goto L_0x00b3
            r0 = 405(0x195, float:5.68E-43)
            if (r8 != r0) goto L_0x00ab
            r1 = 3014(0xbc6, float:4.224E-42)
            goto L_0x00e6
        L_0x00a7:
            if (r8 == r1) goto L_0x00bb
            if (r8 == r5) goto L_0x00b3
        L_0x00ab:
            r1 = 3012(0xbc4, float:4.221E-42)
            android.os.Handler r0 = X.C66493Lq.A1H
            X.C18290x4.A1C(r0, r2, r1)
            goto L_0x004d
        L_0x00b3:
            r1 = 3011(0xbc3, float:4.22E-42)
            android.os.Handler r0 = X.C66493Lq.A1H
            X.C18290x4.A1C(r0, r2, r1)
            goto L_0x004d
        L_0x00bb:
            r1 = 3010(0xbc2, float:4.218E-42)
            android.os.Handler r0 = X.C66493Lq.A1H
            X.C18290x4.A1C(r0, r2, r1)
            goto L_0x004d
        L_0x00c3:
            if (r8 == r1) goto L_0x00d1
            if (r8 == r5) goto L_0x00ce
            r1 = 2017(0x7e1, float:2.826E-42)
            if (r8 == r4) goto L_0x00e6
            r1 = 2014(0x7de, float:2.822E-42)
            goto L_0x00e6
        L_0x00ce:
            r1 = 2016(0x7e0, float:2.825E-42)
            goto L_0x00e6
        L_0x00d1:
            r1 = 2015(0x7df, float:2.824E-42)
            goto L_0x00e6
        L_0x00d4:
            if (r8 == r1) goto L_0x00f6
            r0 = 408(0x198, float:5.72E-43)
            if (r8 == r0) goto L_0x00f3
            r0 = 429(0x1ad, float:6.01E-43)
            if (r8 == r0) goto L_0x00f0
            if (r8 == r5) goto L_0x00ed
            r1 = 2013(0x7dd, float:2.821E-42)
            if (r8 == r4) goto L_0x00e6
            r1 = 2010(0x7da, float:2.817E-42)
        L_0x00e6:
            android.os.Handler r0 = X.C66493Lq.A1H
            X.C18290x4.A1C(r0, r2, r1)
            goto L_0x004d
        L_0x00ed:
            r1 = 2012(0x7dc, float:2.82E-42)
            goto L_0x00e6
        L_0x00f0:
            r1 = 3005(0xbbd, float:4.211E-42)
            goto L_0x00e6
        L_0x00f3:
            r1 = 3007(0xbbf, float:4.214E-42)
            goto L_0x00e6
        L_0x00f6:
            r1 = 2011(0x7db, float:2.818E-42)
            goto L_0x00e6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1FE.BkI(int):void");
    }

    public void run() {
        this.A01.cancel();
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("groupmgr/request success/");
        C18260x0.A1G(A0o, this.A00);
        A00((Integer) null);
    }

    public AnonymousClass1FE(C28891hw r4, C66493Lq r5, C27991fJ r6, String str, List list, int i, boolean z) {
        this.A02 = r5;
        this.A01 = r4;
        this.A03 = r6;
        this.A04 = str;
        this.A05 = list;
        this.A00 = i;
        this.A06 = z;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("GroupResponseHandler - gid:");
        A0o.append(r6);
        A0o.append(" subject:");
        String str2 = "";
        A0o.append(str == null ? str2 : str);
        A0o.append(" pa:");
        C18260x0.A1J(A0o, list != null ? Arrays.deepToString(list.toArray()) : str2);
    }

    public AnonymousClass1FE(C28891hw r9, C66493Lq r10, C27991fJ r11, String str, List list, int i) {
        this(r9, r10, r11, str, list, i, true);
    }
}
