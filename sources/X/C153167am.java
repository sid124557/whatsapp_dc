package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;

/* renamed from: X.7am  reason: invalid class name and case insensitive filesystem */
public final class C153167am {
    public final C623434q A00;
    public final AnonymousClass2N9 A01;
    public final C40092Em A02;
    public final C64773Ex A03;
    public final C56612sH A04;
    public final AnonymousClass33T A05;
    public final AnonymousClass33p A06;
    public final C53412n3 A07;
    public final C56152rV A08;
    public final AnonymousClass318 A09;
    public final AnonymousClass1VX A0A;
    public final AnonymousClass4FV A0B;
    public final C55882r4 A0C;
    public final AnonymousClass1R1 A0D;
    public final C55832qz A0E;

    public final void A02(C95814uZ r24, Integer num, String str, String str2, int i, int i2, boolean z) {
        C624134x r11;
        Integer num2;
        String str3;
        Long l;
        String str4;
        Boolean bool;
        Boolean bool2;
        Integer num3;
        Long l2;
        C51062jD A0u;
        C95814uZ r13 = r24;
        C162457s7.A0J(r13, 0);
        AnonymousClass3ZH A072 = this.A03.A07(r13);
        if (A072 != null) {
            C623434q r12 = this.A00;
            if (r12.A0B()) {
                int A002 = C623434q.A00(A072);
                C56152rV r0 = r12.A05;
                C56152rV r21 = r0;
                List A042 = r0.A04(r13, 1, false, z);
                if (C18310x6.A1X(A042)) {
                    r11 = (C624134x) A042.get(0);
                } else {
                    r11 = null;
                }
                String str5 = null;
                if (r11 != null) {
                    num2 = r12.A05(r11);
                    str3 = C623434q.A02(r11);
                } else {
                    num2 = null;
                    str3 = null;
                }
                Long A073 = r12.A07(r11);
                if (r11 != null) {
                    l = Long.valueOf(r12.A03(r11));
                    str4 = C623434q.A01(r11.A1I);
                } else {
                    l = null;
                    str4 = null;
                }
                if (A002 != 1) {
                    if (r11 == null || (A0u = r11.A0u()) == null) {
                        bool = null;
                    } else {
                        bool = Boolean.valueOf(A0u.A00);
                    }
                    boolean A003 = A00(A072);
                    C40092Em r16 = this.A02;
                    String A082 = r12.A08(A072);
                    C134096iR r2 = new C134096iR();
                    Integer valueOf = Integer.valueOf(i);
                    r2.A04 = valueOf;
                    int i3 = i2;
                    Integer valueOf2 = Integer.valueOf(i3);
                    r2.A05 = valueOf2;
                    r2.A03 = num2;
                    r2.A0A = str4;
                    Integer valueOf3 = Integer.valueOf(A002);
                    r2.A02 = valueOf3;
                    r2.A0B = A082;
                    r2.A06 = A073;
                    r2.A07 = l;
                    String str6 = str;
                    r2.A08 = str6;
                    r2.A09 = str3;
                    Boolean valueOf4 = Boolean.valueOf(A003);
                    r2.A01 = valueOf4;
                    r2.A00 = bool;
                    r16.A00.A08.BhD(r2);
                    AnonymousClass2N9 r22 = this.A01;
                    if (r11 != null) {
                        bool2 = Boolean.valueOf(this.A08.A06(r13, r11.A0K));
                    } else {
                        bool2 = null;
                    }
                    List<C624134x> A043 = r21.A04(r13, 5, false, false);
                    if (!C18310x6.A1X(A043)) {
                        A043 = null;
                    }
                    if (str != null) {
                        num3 = Integer.valueOf(AnonymousClass31J.A00(str6));
                    } else {
                        num3 = null;
                    }
                    if (r11 != null) {
                        str5 = r12.A09(r11);
                    }
                    Long A062 = r12.A06(r13);
                    C134196ib r122 = new C134196ib();
                    r122.A08 = valueOf;
                    r122.A09 = valueOf2;
                    r122.A0E = A062;
                    r122.A0C = A073;
                    r122.A0D = l;
                    r122.A0B = AnonymousClass31J.A02(A072);
                    r122.A01 = bool;
                    r122.A0K = str5;
                    r122.A07 = num2;
                    r122.A0J = str3;
                    r122.A06 = valueOf3;
                    r122.A02 = valueOf4;
                    Long l3 = null;
                    if (r11 != null) {
                        l2 = C18320x8.A0Y(TimeUnit.MILLISECONDS, r11.A0K);
                    } else {
                        l2 = null;
                    }
                    r122.A0A = l2;
                    if (r11 != null) {
                        l3 = C18320x8.A0Y(TimeUnit.MILLISECONDS, r11.A0I);
                    }
                    r122.A0F = l3;
                    r122.A00 = bool2;
                    r122.A03 = Boolean.valueOf(!A072.A0Q());
                    if (A043 != null) {
                        ArrayList A0s = AnonymousClass001.A0s();
                        ArrayList A0s2 = AnonymousClass001.A0s();
                        ArrayList A0s3 = AnonymousClass001.A0s();
                        for (C624134x r8 : A043) {
                            A0s.add(r22.A00.A09(r8));
                            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                            AnonymousClass0x2.A1Q(A0s2, timeUnit.toSeconds(r8.A0I));
                            AnonymousClass0x2.A1Q(A0s3, timeUnit.toSeconds(r8.A0K));
                        }
                        r122.A0L = new JSONArray(A0s).toString();
                        r122.A0G = new JSONArray(A0s2).toString();
                        r122.A0H = new JSONArray(A0s3).toString();
                    }
                    if (i3 == 6) {
                        r122.A05 = num3;
                        r122.A0I = str2;
                        r122.A04 = num;
                    }
                    if (r11 != null) {
                        r22.A00.A0A(r122, r11);
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00cb, code lost:
        if (r4.A0C(r10) != false) goto L_0x00cd;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A03(X.C95814uZ r28, java.util.Collection r29, int r30) {
        /*
            r27 = this;
            r0 = 0
            r6 = r28
            X.C162457s7.A0J(r6, r0)
            if (r29 == 0) goto L_0x013c
            r5 = r27
            X.34q r4 = r5.A00
            boolean r0 = r4.A0B()
            if (r0 == 0) goto L_0x013c
            X.2r4 r0 = r4.A0A
            boolean r0 = r0.A02(r6)
            if (r0 == 0) goto L_0x013c
            X.3Ex r0 = r5.A03
            X.3ZH r26 = r0.A07(r6)
            if (r26 == 0) goto L_0x013c
            int r25 = X.C623434q.A00(r26)
            r1 = 1
            r0 = r25
            if (r0 == r1) goto L_0x013c
            X.2ss r0 = r4.A03
            boolean r0 = r0.A0M(r6)
            int r24 = X.C18280x3.A00(r0)
            r0 = r26
            java.lang.String r23 = r4.A08(r0)
            X.2r4 r0 = r5.A0C
            boolean r22 = r0.A02(r6)
            java.util.Iterator r21 = r29.iterator()
            r20 = 0
        L_0x0047:
            boolean r0 = r21.hasNext()
            if (r0 == 0) goto L_0x0134
            java.lang.Object r10 = r21.next()
            X.34x r10 = (X.C624134x) r10
            X.2z0 r0 = r10.A1J
            boolean r0 = r0.A02
            if (r0 != 0) goto L_0x0047
            java.lang.Integer r13 = r4.A05(r10)
            java.lang.String r19 = X.C623434q.A02(r10)
            boolean r16 = A00(r26)
            X.2jD r0 = r10.A0u()
            if (r0 == 0) goto L_0x0131
            boolean r0 = r0.A00
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r0)
        L_0x0071:
            java.lang.Long r15 = r4.A07(r10)
            long r0 = r4.A03(r10)
            X.2Em r2 = r5.A02
            java.lang.Long r14 = java.lang.Long.valueOf(r0)
            java.lang.String r7 = X.C623434q.A02(r10)
            byte r0 = r10.A1I
            java.lang.String r1 = X.C623434q.A01(r0)
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r22)
            X.6iQ r3 = new X.6iQ
            r3.<init>()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r25)
            r3.A04 = r9
            java.lang.Integer r0 = java.lang.Integer.valueOf(r24)
            r3.A03 = r0
            java.lang.Integer r8 = java.lang.Integer.valueOf(r30)
            r3.A06 = r8
            r3.A07 = r15
            r3.A08 = r14
            r3.A0A = r1
            r1 = r23
            r3.A0B = r1
            r3.A05 = r13
            r3.A02 = r11
            r3.A09 = r7
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r16)
            r3.A01 = r1
            r3.A00 = r12
            X.34q r2 = r2.A00
            X.4FV r2 = r2.A08
            r2.BhD(r3)
            if (r20 != 0) goto L_0x00cd
            boolean r2 = r4.A0C(r10)
            r20 = 0
            if (r2 == 0) goto L_0x00cf
        L_0x00cd:
            r20 = 1
        L_0x00cf:
            X.2N9 r7 = r5.A01
            java.lang.Long r18 = X.AnonymousClass31J.A02(r26)
            java.lang.String r17 = r4.A09(r10)
            java.lang.Long r16 = r4.A06(r6)
            X.34q r3 = r7.A00
            boolean r2 = r3.A0D(r10)
            if (r2 == 0) goto L_0x0047
            X.6iY r2 = new X.6iY
            r2.<init>()
            r2.A03 = r0
            r0 = r16
            r2.A0B = r0
            r2.A06 = r8
            r2.A09 = r15
            r2.A0A = r14
            r0 = r18
            r2.A08 = r0
            r0 = r17
            r2.A0F = r0
            r2.A05 = r13
            r0 = r19
            r2.A0E = r0
            r2.A02 = r11
            r2.A04 = r9
            r2.A01 = r1
            r2.A00 = r12
            java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r0 = r10.A0K
            java.lang.Long r0 = X.C18320x8.A0Y(r8, r0)
            r2.A07 = r0
            long r0 = r10.A0I
            java.lang.Long r0 = X.C18320x8.A0Y(r8, r0)
            r2.A0C = r0
            X.2sH r0 = r7.A02
            long r0 = r0.A0H()
            java.lang.Long r0 = X.C18320x8.A0Y(r8, r0)
            r2.A0D = r0
            X.4FV r0 = r3.A08
            r0.BhD(r2)
            goto L_0x0047
        L_0x0131:
            r12 = 0
            goto L_0x0071
        L_0x0134:
            if (r20 == 0) goto L_0x013c
            X.4FV r1 = r5.A0B
            r0 = 1
            r1.BlF(r0)
        L_0x013c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C153167am.A03(X.4uZ, java.util.Collection, int):void");
    }

    public C153167am(C623434q r14, AnonymousClass2N9 r15, C40092Em r16, C64773Ex r17, C56612sH r18, AnonymousClass33T r19, AnonymousClass33p r20, C53412n3 r21, C56152rV r22, AnonymousClass318 r23, AnonymousClass1VX r24, AnonymousClass4FV r25, C55882r4 r26, AnonymousClass1R1 r27, C55832qz r28) {
        C55882r4 r3 = r26;
        AnonymousClass4FV r4 = r25;
        C56152rV r7 = r22;
        C56612sH r10 = r18;
        C64773Ex r11 = r17;
        C18260x0.A0f(r10, r4, r11, r7, r3);
        C55832qz r1 = r28;
        AnonymousClass1R1 r2 = r27;
        AnonymousClass318 r6 = r23;
        C18260x0.A0W(r1, r2, r6);
        AnonymousClass33p r9 = r20;
        C162457s7.A0J(r9, 9);
        C53412n3 r8 = r21;
        AnonymousClass33T r12 = r19;
        C18270x1.A13(r12, r8);
        AnonymousClass1VX r5 = r24;
        C162457s7.A0J(r5, 15);
        this.A04 = r10;
        this.A0B = r4;
        this.A03 = r11;
        this.A08 = r7;
        this.A0C = r3;
        this.A0E = r1;
        this.A0D = r2;
        this.A09 = r6;
        this.A06 = r9;
        this.A00 = r14;
        this.A05 = r12;
        this.A07 = r8;
        this.A02 = r16;
        this.A01 = r15;
        this.A0A = r5;
    }

    public static boolean A00(AnonymousClass3ZH r2) {
        C55502qS r0 = r2.A0E;
        if (r0 == null || r0.A01 != 2) {
            return false;
        }
        return true;
    }

    public final void A01(C95814uZ r12, C624134x r13, C624134x r14, byte b, boolean z) {
        int A002;
        String A012;
        Boolean bool;
        Boolean bool2;
        C51062jD A0u;
        AnonymousClass3ZH A072 = this.A03.A07(r12);
        if (A072 != null) {
            C623434q r3 = this.A00;
            if (r3.A0B() && (A002 = C623434q.A00(A072)) != 1) {
                boolean A003 = A00(A072);
                C40092Em r6 = this.A02;
                int A004 = C18280x3.A00(r3.A03.A0M(r12) ? 1 : 0);
                String A082 = r3.A08(A072);
                Boolean valueOf = Boolean.valueOf(A003);
                C624134x r10 = r13;
                C134176iZ r5 = new C134176iZ();
                r5.A02 = Integer.valueOf(A004);
                Integer valueOf2 = Integer.valueOf(A002);
                r5.A03 = valueOf2;
                r5.A0F = A082;
                if (z) {
                    A012 = "reaction";
                } else {
                    A012 = C623434q.A01(b);
                }
                r5.A0E = A012;
                if (r14 != null) {
                    C623434q r9 = r6.A00;
                    r5.A08 = r9.A07(r14);
                    r5.A09 = Long.valueOf(r9.A03(r14));
                    r5.A0D = C623434q.A01(r14.A1I);
                    r5.A05 = r9.A05(r14);
                    r5.A0C = C623434q.A02(r14);
                }
                if (r13 != null) {
                    C623434q r7 = r6.A00;
                    r5.A04 = r7.A05(r13);
                    r5.A06 = r7.A07(r13);
                    r5.A07 = Long.valueOf(r7.A03(r13));
                    r5.A0B = C623434q.A01(r13.A1I);
                    r5.A0A = C623434q.A02(r13);
                }
                if (r14 != null) {
                    r10 = r14;
                }
                r5.A01 = valueOf;
                if (r10 == null || (A0u = r10.A0u()) == null) {
                    bool = null;
                } else {
                    bool = Boolean.valueOf(A0u.A00);
                }
                r5.A00 = bool;
                r6.A00.A08.BhD(r5);
                AnonymousClass2N9 r0 = this.A01;
                Long A022 = AnonymousClass31J.A02(A072);
                Long A062 = r3.A06(r12);
                if (r14 != null) {
                    r13 = r14;
                } else if (r13 == null) {
                    return;
                }
                C623434q r52 = r0.A00;
                if (r52.A0D(r13)) {
                    C134066iO r32 = new C134066iO();
                    r32.A06 = r52.A07(r13);
                    r32.A07 = Long.valueOf(r52.A03(r13));
                    r32.A05 = A022;
                    r32.A0B = r52.A09(r13);
                    r32.A03 = r52.A05(r13);
                    r32.A0A = C623434q.A02(r13);
                    C51062jD A0u2 = r13.A0u();
                    if (A0u2 != null) {
                        bool2 = Boolean.valueOf(A0u2.A00);
                    } else {
                        bool2 = null;
                    }
                    r32.A00 = bool2;
                    r32.A02 = valueOf2;
                    r32.A01 = valueOf;
                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                    r32.A04 = C18320x8.A0Y(timeUnit, r13.A0K);
                    r32.A09 = C18320x8.A0Y(timeUnit, r13.A0I);
                    r32.A08 = A062;
                    r52.A0A(r32, r13);
                }
            }
        }
    }

    public final void A04(Collection collection, int i) {
        AnonymousClass3ZH A072;
        Boolean bool;
        if (this.A00.A0B()) {
            AnonymousClass2N9 r6 = this.A01;
            if (collection != null) {
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    C624134x r5 = (C624134x) it.next();
                    C95814uZ r7 = r5.A1J.A00;
                    if (r7 != null) {
                        C623434q r4 = r6.A00;
                        if (!(!r4.A0D(r5) || (A072 = r6.A01.A07(r7)) == null || C623434q.A00(A072) == 1)) {
                            C134106iS r3 = new C134106iS();
                            r3.A03 = Integer.valueOf(i);
                            r3.A09 = r4.A06(r7);
                            r3.A06 = AnonymousClass31J.A02(A072);
                            r3.A0C = r4.A09(r5);
                            r3.A07 = r4.A07(r5);
                            r3.A04 = r4.A05(r5);
                            r3.A0B = C623434q.A02(r5);
                            r3.A01 = Boolean.valueOf(A00(A072));
                            C51062jD A0u = r5.A0u();
                            if (A0u != null) {
                                bool = Boolean.valueOf(A0u.A00);
                            } else {
                                bool = null;
                            }
                            r3.A00 = bool;
                            r3.A08 = Long.valueOf(r4.A03(r5));
                            r3.A02 = Integer.valueOf(C623434q.A00(A072));
                            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                            r3.A05 = C18320x8.A0Y(timeUnit, r5.A0K);
                            r3.A0A = C18320x8.A0Y(timeUnit, r5.A0I);
                            r4.A0A(r3, r5);
                        }
                    }
                }
            }
        }
    }
}
