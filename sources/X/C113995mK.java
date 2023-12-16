package X;

import android.os.SystemClock;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.5mK  reason: invalid class name and case insensitive filesystem */
public final class C113995mK implements AnonymousClass485 {
    public C102975Kz A00;
    public AnonymousClass5R3 A01;
    public final AnonymousClass4CD A02;
    public final C64773Ex A03;
    public final C56612sH A04;
    public final C55152pt A05;
    public final AnonymousClass2W5 A06;
    public final C620233e A07;
    public final AnonymousClass4FV A08;
    public final C54882pR A09;
    public final AnonymousClass8JP A0A;
    public final AnonymousClass2M9 A0B;
    public final AnonymousClass5Z9 A0C;
    public final C152427Yv A0D;
    public final AnonymousClass4FS A0E;
    public final LinkedHashMap A0F = new C118435tX(this);
    public final Map A0G;
    public final Map A0H;
    public final AnonymousClass66R A0I = C154517dI.A01(C121075zd.A00);

    public static final Integer A01(int i) {
        int i2;
        switch (i) {
            case 3:
                i2 = 3;
                break;
            case 4:
            case 10:
                i2 = 1;
                break;
            case 11:
                i2 = 4;
                break;
            case 12:
            case 13:
                i2 = 2;
                break;
            default:
                return null;
        }
        return Integer.valueOf(i2);
    }

    public final void A06(C95124sf r7, C105765Wh r8, boolean z, boolean z2) {
        C162457s7.A0J(r8, 1);
        r7.A00 = Boolean.valueOf(z);
        List list = r8.A02;
        r7.A0B = AnonymousClass0x9.A0m(list.size());
        r7.A0A = Long.valueOf(A00(list));
        List list2 = r8.A03;
        r7.A0D = AnonymousClass0x9.A0m(list2.size());
        r7.A0C = Long.valueOf(A00(list2));
        List list3 = r8.A01;
        r7.A08 = AnonymousClass0x9.A0m(list3.size());
        r7.A07 = Long.valueOf(A00(list3));
        Iterator it = list3.iterator();
        int i = 0;
        while (it.hasNext()) {
            i += C86664Kz.A19(it).A03();
        }
        r7.A06 = AnonymousClass0x9.A0m(i);
        long A002 = A00(list3);
        Iterator it2 = list3.iterator();
        int i2 = 0;
        while (it2.hasNext()) {
            i2 += C86664Kz.A19(it2).A03();
        }
        r7.A09 = C18310x6.A0f(A002, (long) i2);
        r7.A01 = Boolean.valueOf(z2);
        this.A08.Bh7(r7, new AnonymousClass5ZC(1, 1), true);
    }

    public final void A0B(Map map, int i) {
        long j;
        C102975Kz r2 = this.A00;
        boolean z = false;
        if (r2 != null && !r2.A04 && r2.A08) {
            z = true;
        }
        C626936e.A0D(z, "Report tab open only once per session");
        AnonymousClass4rQ r22 = new AnonymousClass4rQ();
        C102975Kz r0 = this.A00;
        if (r0 != null) {
            j = r0.A05;
        } else {
            j = 0;
        }
        r22.A01 = Long.valueOf(j);
        r22.A00 = AnonymousClass0x9.A0m(i);
        r22.A02 = C57572tr.A01(map);
        this.A08.BhB(r22);
        C102975Kz r02 = this.A00;
        if (r02 != null) {
            r02.A04 = true;
        }
    }

    public final void A02() {
        AnonymousClass5Z9 r2 = this.A0C;
        if (r2.A04.A00()) {
            C95044sW A012 = r2.A01();
            A012.A03 = 27;
            r2.A02.BhB(A012);
        }
    }

    public final void A03() {
        Long l;
        AnonymousClass5Z9 r2 = this.A0C;
        if (r2.A04.A00()) {
            C95044sW A012 = r2.A01();
            A012.A03 = 24;
            A012.A02 = 3;
            r2.A02.BhB(A012);
        }
        if (C18270x1.A1V(r2.A07) && (l = r2.A03.A00) != null) {
            ((AnonymousClass5OQ) r2.A06.get()).A00(3, l.longValue());
        }
    }

    public final void A04() {
        Long l;
        AnonymousClass5Z9 r2 = this.A0C;
        if (r2.A04.A00()) {
            C95044sW A012 = r2.A01();
            A012.A03 = 23;
            A012.A02 = 4;
            r2.A02.BhB(A012);
        }
        if (C18270x1.A1V(r2.A07) && (l = r2.A03.A00) != null) {
            ((AnonymousClass5OQ) r2.A06.get()).A00(4, l.longValue());
        }
    }

    public final void A05() {
        this.A0B.A00 = null;
        C102975Kz r5 = this.A00;
        if (r5 != null && r5.A08) {
            AnonymousClass4s8 r4 = new AnonymousClass4s8();
            r4.A02 = Long.valueOf(r5.A05);
            r4.A04 = C18310x6.A0f(SystemClock.elapsedRealtime(), r5.A06);
            r4.A05 = AnonymousClass0x9.A0m(r5.A03);
            r4.A03 = AnonymousClass0x9.A0m(r5.A02);
            int i = r5.A00;
            if (i != 0) {
                r4.A01 = Integer.valueOf(i);
            }
            int i2 = r5.A01;
            if (i2 != 0) {
                r4.A00 = Integer.valueOf(i2);
            }
            this.A08.BhB(r4);
            this.A00 = null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0064, code lost:
        if (java.lang.Integer.valueOf(r14) != null) goto L_0x0066;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A07(com.whatsapp.jid.UserJid r20, java.lang.Integer r21, java.lang.Integer r22, java.lang.String r23, java.util.List r24, java.util.List r25, java.util.List r26, java.util.Map r27) {
        /*
            r19 = this;
            r9 = r24
            r10 = r25
            r11 = r26
            X.C18260x0.A0V(r9, r10, r11)
            r2 = r19
            X.5Kz r4 = r2.A00
            if (r4 == 0) goto L_0x0084
            r3 = 1
            r7 = r21
            if (r21 == 0) goto L_0x0024
            r0 = 4
            int r1 = r7.intValue()
            if (r1 == r0) goto L_0x0024
            if (r1 == r3) goto L_0x0024
            r0 = 3
            if (r1 == r0) goto L_0x0024
            r0 = 2
            if (r1 == r0) goto L_0x0024
            r3 = 0
        L_0x0024:
            r6 = r20
            if (r22 != 0) goto L_0x008c
            if (r3 == 0) goto L_0x008a
            X.1fY r0 = X.AnonymousClass1fY.A00
            if (r6 == r0) goto L_0x008a
            r0 = 3
            java.util.List[] r1 = new java.util.List[r0]
            X.C18280x3.A19(r9, r10, r1)
            r0 = 2
            java.util.List r0 = X.AnonymousClass0x9.A19(r11, r1, r0)
            java.util.Iterator r5 = r0.iterator()
        L_0x003d:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0088
            java.lang.Object r3 = r5.next()
            java.util.List r3 = (java.util.List) r3
            int r1 = r3.size()
            r14 = 0
        L_0x004e:
            if (r14 >= r1) goto L_0x003d
            java.lang.Object r0 = r3.get(r14)
            X.34r r0 = (X.C623534r) r0
            com.whatsapp.jid.UserJid r0 = r0.A0A
            boolean r0 = X.C162457s7.A0P(r6, r0)
            if (r0 == 0) goto L_0x0085
            if (r14 < 0) goto L_0x003d
            java.lang.Integer r0 = java.lang.Integer.valueOf(r14)
            if (r0 == 0) goto L_0x0088
        L_0x0066:
            X.2sH r5 = r2.A04
            long r0 = r4.A05
            X.66R r3 = r2.A0I
            java.lang.Object r3 = r3.getValue()
            java.util.Random r3 = (java.util.Random) r3
            long r17 = r3.nextLong()
            java.util.LinkedHashMap r13 = r2.A0F
            X.5R3 r4 = new X.5R3
            r8 = r23
            r12 = r27
            r15 = r0
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r17)
            r2.A01 = r4
        L_0x0084:
            return
        L_0x0085:
            int r14 = r14 + 1
            goto L_0x004e
        L_0x0088:
            r14 = -1
            goto L_0x0066
        L_0x008a:
            r14 = 0
            goto L_0x0066
        L_0x008c:
            int r14 = r22.intValue()
            goto L_0x0066
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C113995mK.A07(com.whatsapp.jid.UserJid, java.lang.Integer, java.lang.Integer, java.lang.String, java.util.List, java.util.List, java.util.List, java.util.Map):void");
    }

    public final void A09(Boolean bool) {
        AnonymousClass2M9 r1 = this.A0B;
        long nextLong = r1.A01.nextLong();
        Long valueOf = Long.valueOf(nextLong);
        r1.A00 = valueOf;
        if (valueOf != null) {
            this.A00 = new C102975Kz(this.A04, nextLong, AnonymousClass0x9.A1Q(bool));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0043, code lost:
        if (r1 == 3) goto L_0x0045;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0058, code lost:
        r1 = (X.AnonymousClass5OQ) r4.A06.get();
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0035  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0A(java.lang.Byte r7, java.lang.Integer r8, java.lang.Integer r9) {
        /*
            r6 = this;
            X.5Z9 r4 = r6.A0C
            X.2X0 r0 = r4.A04
            boolean r0 = r0.A00()
            if (r0 == 0) goto L_0x0050
            X.4sW r5 = r4.A01()
            java.lang.Integer r0 = X.C18300x5.A0Z()
            r5.A03 = r0
            java.lang.Integer r0 = X.AnonymousClass5Z9.A00(r8)
            r5.A02 = r0
            r3 = 1
            if (r7 == 0) goto L_0x0079
            byte r2 = r7.byteValue()
            r1 = 2
            if (r2 == 0) goto L_0x002d
            r0 = 3
            r1 = 4
            if (r2 == r0) goto L_0x002d
            r0 = 13
            if (r2 != r0) goto L_0x0072
            r1 = 5
        L_0x002d:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
        L_0x0031:
            r5.A01 = r0
            if (r9 == 0) goto L_0x0070
            int r1 = r9.intValue()
            r0 = 1
            if (r1 == r3) goto L_0x0045
            r0 = 2
            if (r1 == r0) goto L_0x0045
            r0 = 4
            if (r1 == r0) goto L_0x0045
            r0 = 3
            if (r1 != r0) goto L_0x0070
        L_0x0045:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x0049:
            r5.A00 = r0
            X.4FV r0 = r4.A02
            r0.BhB(r5)
        L_0x0050:
            X.66R r0 = r4.A07
            boolean r0 = X.C18270x1.A1V(r0)
            if (r0 == 0) goto L_0x006f
            X.8qC r0 = r4.A06
            java.lang.Object r1 = r0.get()
            X.5OQ r1 = (X.AnonymousClass5OQ) r1
            java.lang.Long r0 = r1.A00
            if (r0 == 0) goto L_0x006f
            long r2 = r0.longValue()
            X.66s r1 = r1.A03
            java.lang.String r0 = "tap_status_share"
            r1.flowMarkPoint(r2, r0)
        L_0x006f:
            return
        L_0x0070:
            r0 = 0
            goto L_0x0049
        L_0x0072:
            if (r2 != r3) goto L_0x0079
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            goto L_0x0031
        L_0x0079:
            r0 = 0
            goto L_0x0031
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C113995mK.A0A(java.lang.Byte, java.lang.Integer, java.lang.Integer):void");
    }

    public C113995mK(C29171iO r3, C64773Ex r4, C56612sH r5, C55152pt r6, AnonymousClass2W5 r7, C620233e r8, AnonymousClass4FV r9, C54882pR r10, AnonymousClass8JP r11, AnonymousClass2M9 r12, AnonymousClass5Z9 r13, C152427Yv r14, AnonymousClass4FS r15) {
        C18260x0.A0f(r5, r15, r9, r8, r4);
        C18260x0.A0g(r6, r10, r12, r7, r3);
        C18260x0.A0Y(r14, r13, r11);
        this.A04 = r5;
        this.A0E = r15;
        this.A08 = r9;
        this.A07 = r8;
        this.A03 = r4;
        this.A05 = r6;
        this.A09 = r10;
        this.A0B = r12;
        this.A06 = r7;
        this.A0D = r14;
        this.A0C = r13;
        this.A0A = r11;
        C111105hY r1 = new C111105hY(this);
        this.A02 = r1;
        this.A0H = AnonymousClass001.A0t();
        this.A0G = AnonymousClass001.A0t();
        r3.A06(r1);
    }

    public static final long A00(List list) {
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            i += C86664Kz.A19(it).A02();
        }
        return (long) i;
    }

    public void A08(C624134x r5, String str, int i, long j, boolean z, boolean z2) {
        String str2;
        long j2;
        Integer num;
        int i2 = 3;
        switch (str.hashCode()) {
            case -2101465844:
                if (str.equals("failed_insufficient_space")) {
                    i2 = 10;
                    break;
                }
                break;
            case -1911610141:
                if (str.equals("media_error_no_such_algorithm")) {
                    i2 = 28;
                    break;
                }
                break;
            case -1892291233:
                if (str.equals("media_error_request_timeout")) {
                    i2 = 14;
                    break;
                }
                break;
            case -1867169789:
                str2 = "success";
                break;
            case -1858954673:
                if (str.equals("media_error_cronet")) {
                    i2 = 35;
                    break;
                }
                break;
            case -1735489987:
                if (str.equals("media_error_request")) {
                    i2 = 4;
                    break;
                }
                break;
            case -1597391554:
                if (str.equals("media_error_file_format_unsupported")) {
                    i2 = 31;
                    break;
                }
                break;
            case -1412796971:
                if (str.equals("media_error_server")) {
                    i2 = 13;
                    break;
                }
                break;
            case -1393956401:
                if (str.equals("media_error_no_direct_path")) {
                    i2 = 36;
                    break;
                }
                break;
            case -1302125668:
                if (str.equals("media_error_wamsys")) {
                    i2 = 25;
                    break;
                }
                break;
            case -962621161:
                if (str.equals("media_error_optimistic_network_unsafe")) {
                    i2 = 29;
                    break;
                }
                break;
            case -705042791:
                if (str.equals("media_skipped_ep_no_primary_host")) {
                    i2 = 34;
                    break;
                }
                break;
            case -678813737:
                if (str.equals("media_error_dns")) {
                    i2 = 18;
                    break;
                }
                break;
            case -678811828:
                if (str.equals("media_error_fnf")) {
                    i2 = 11;
                    break;
                }
                break;
            case -678803141:
                if (str.equals("media_error_oom")) {
                    i2 = 6;
                    break;
                }
                break;
            case -678799174:
                if (str.equals("media_error_ssl")) {
                    i2 = 20;
                    break;
                }
                break;
            case -678797283:
                if (str.equals("media_error_url")) {
                    i2 = 27;
                    break;
                }
                break;
            case -621954360:
                if (str.equals("media_error_not_finalized")) {
                    i2 = 15;
                    break;
                }
                break;
            case -383881924:
                if (str.equals("media_error_throttle")) {
                    i2 = 19;
                    break;
                }
                break;
            case -379366874:
                if (str.equals("media_error_no_client_network")) {
                    i2 = 21;
                    break;
                }
                break;
            case -160901288:
                if (str.equals("media_error_bad_media")) {
                    i2 = 9;
                    break;
                }
                break;
            case 431581758:
                if (str.equals("media_error_conn")) {
                    i2 = 26;
                    break;
                }
                break;
            case 476588369:
                if (str.equals("cancelled")) {
                    i2 = 2;
                    break;
                }
                break;
            case 1086481592:
                if (str.equals("media_error_io")) {
                    i2 = 7;
                    break;
                }
                break;
            case 1095692943:
                str2 = "request";
                break;
            case 1354954699:
                if (str.equals("media_error_transcoding_unknown")) {
                    i2 = 30;
                    break;
                }
                break;
            case 1380799384:
                if (str.equals("media_error_no_permissions")) {
                    i2 = 8;
                    break;
                }
                break;
            case 1465774270:
                if (str.equals("media_error_too_large")) {
                    i2 = 24;
                    break;
                }
                break;
            case 1643533646:
                if (str.equals("media_error_optimistic_hash")) {
                    i2 = 16;
                    break;
                }
                break;
            case 1744829935:
                if (str.equals("media_switch_required")) {
                    i2 = 23;
                    break;
                }
                break;
        }
        if (str.equals(str2)) {
            i2 = 1;
        }
        C94944sL r3 = new C94944sL();
        C102975Kz r0 = this.A00;
        if (r0 != null) {
            j2 = r0.A05;
        } else {
            j2 = 0;
        }
        r3.A08 = Long.valueOf(j2);
        r3.A03 = Integer.valueOf(i);
        r3.A07 = Long.valueOf(j);
        r3.A06 = Integer.valueOf(i2);
        r3.A00 = Boolean.valueOf(z);
        r3.A01 = Boolean.valueOf(z2);
        int A022 = this.A07.A02();
        int i3 = 3;
        if (A022 != 0) {
            i3 = 2;
            if (A022 != 1) {
                i3 = 4;
                if (A022 != 2) {
                    i3 = 1;
                }
            }
        }
        r3.A02 = Integer.valueOf(i3);
        int i4 = r5.A09;
        int i5 = 3;
        if (i4 != 3) {
            i5 = 4;
            if (i4 == 4) {
                i5 = 1;
            } else if (i4 == 5 || i4 == 10 || i4 == 11) {
                i5 = 2;
            }
        }
        r3.A05 = Integer.valueOf(i5);
        C108845de r02 = r5.A0O;
        if (r02 != null) {
            int i6 = r02.A00;
            int i7 = 3;
            if (i6 != 0) {
                i7 = 2;
                if (i6 != 1) {
                    i7 = 4;
                    if (i6 != 2) {
                        i7 = 1;
                    }
                }
            }
            num = Integer.valueOf(i7);
        } else {
            num = null;
        }
        r3.A04 = num;
        this.A08.BhB(r3);
        if (!str.equals("success")) {
            this.A0C.A03(r5, str, j);
        }
    }
}
