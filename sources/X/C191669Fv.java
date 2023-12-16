package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.math.BigDecimal;
import java.util.List;
import java.util.Locale;

/* renamed from: X.9Fv  reason: invalid class name and case insensitive filesystem */
public class C191669Fv extends AnonymousClass94y {
    public String A00;
    public boolean A01;
    public final C66663Mh A02;
    public final C56612sH A03;
    public final AnonymousClass1VX A04;
    public final C194619Tt A05;
    public final C196719bd A06;
    public final AnonymousClass9U1 A07;
    public final C196629bS A08;
    public final C29271iY A09;
    public final AnonymousClass9AI A0A;
    public final AnonymousClass9A9 A0B;
    public final C196419ao A0C;
    public final AnonymousClass9WN A0D;

    public void A0S(List list) {
        int i;
        UserJid userJid;
        AnonymousClass9W2 r0;
        C624034w r8 = this.A06.A01;
        AnonymousClass99L A0K = C1899693i.A0K(r8);
        C193629Pj r02 = this.A06;
        C626936e.A06(r02);
        C166587yw r7 = r02.A00;
        List list2 = list;
        if (r8.A03 == 40 && (r0 = A0K.A0G) != null && r0.A0M) {
            A0l(r8, A0K, list, false);
            A0i(r8, A0K, list);
            A0m(r8, list);
            A0j(r8, A0K, list);
            AnonymousClass9FV r1 = new AnonymousClass9FV();
            r1.A02 = this.A06;
            r1.A01 = this;
            r1.A00 = AnonymousClass9U4.A07(this.A0b).B6f();
            list.add(r1);
            A0k(r8, A0K, list);
            A0U(list);
            AnonymousClass94y.A01(list);
            A0h(r7, r8, A0K, list2, true);
            AnonymousClass94y.A01(list);
            A0b(list);
            AnonymousClass94y.A01(list);
        } else if (!TextUtils.isEmpty(A0K.A0L)) {
            if (r8.A02 == 12) {
                AnonymousClass9FA r4 = new AnonymousClass9FA();
                Context context = this.A0O.A00;
                r4.A02 = context.getString(R.string.f11nameremoved);
                r4.A01 = AnonymousClass002.A0F(context, C107575bX.A04(context, R.color.f5nameremoved), AnonymousClass6C9.A1Z(AnonymousClass1S3.A05.B3W(this.A0P, new BigDecimal(this.A04.A0N(1650))), 2), 1, R.string.f11nameremoved);
                r4.A00 = new C204409pJ((Object) r8, 27, (Object) this);
                list.add(r4);
            }
            A0Y(list);
            if (!"mandate_payment_screen".equals(this.A00)) {
                AnonymousClass94y.A01(list);
                AnonymousClass1S4 r3 = r8.A0A;
                C626936e.A06(r3);
                AnonymousClass9FQ r2 = new AnonymousClass9FQ();
                r2.A01 = this.A0O.A00.getString(R.string.f11nameremoved);
                r2.A00 = new C204209oz(r8, this, r3, 9);
                list.add(r2);
            }
            A0a(list);
            AnonymousClass94y.A01(list);
            A0b(list);
            A0Z(list);
        } else {
            super.A0S(list);
            AnonymousClass1S4 r03 = r8.A0A;
            if (!(r03 == null || !r03.A0b() || (userJid = r8.A0D) == null)) {
                list.add(new AnonymousClass9FC(userJid));
            }
            i = 1000;
            list.add(new AnonymousClass9FE(i));
        }
        i = 1007;
        list.add(new AnonymousClass9FE(i));
    }

    public final void A0g() {
        A0c(true);
        C196419ao r3 = this.A0C;
        String str = this.A06.A01.A0K;
        C197149ce r1 = new C197149ce(this);
        if (!TextUtils.isEmpty(str)) {
            r3.A04(r1, C18300x5.A0s(str));
        }
    }

    public AnonymousClass9NZ A0F() {
        C624034w r0;
        AnonymousClass1S4 r02;
        C191479Fb r3;
        AnonymousClass9XY r03;
        String string;
        C193629Pj r04 = this.A06;
        if (r04 == null || (r0 = r04.A01) == null || (r02 = r0.A0A) == null || !r02.A0b()) {
            return super.A0F();
        }
        AnonymousClass99L A0K = C1899693i.A0K(this.A06.A01);
        if (A0K.A0E != null) {
            r3 = new C191479Fb();
            r3.A04 = C54292oU.A00(this.A0O).getString(R.string.f11nameremoved);
            r03 = A0K.A0E;
        } else {
            C166557yt r05 = A0K.A08;
            if (r05 == null || !"upi".equalsIgnoreCase((String) r05.A00)) {
                return null;
            }
            r3 = new C191479Fb();
            C54292oU r2 = this.A0O;
            r3.A04 = C54292oU.A00(r2).getString(R.string.f11nameremoved);
            r03 = A0K.A0E;
            if (r03 == null) {
                string = C54292oU.A00(r2).getString(R.string.f11nameremoved);
                r3.A03 = string;
                return r3;
            }
        }
        string = r03.A00;
        r3.A03 = string;
        return r3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0011, code lost:
        if (android.text.TextUtils.isEmpty(r2.A0Q) == false) goto L_0x0013;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String A0I(X.C624034w r4) {
        /*
            r3 = this;
            X.1S4 r2 = r4.A0A
            X.99L r2 = (X.AnonymousClass99L) r2
            com.whatsapp.jid.UserJid r0 = r4.A0E
            if (r0 != 0) goto L_0x0013
            if (r2 == 0) goto L_0x0013
            java.lang.String r0 = r2.A0Q
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r1 = 1
            if (r0 != 0) goto L_0x0014
        L_0x0013:
            r1 = 0
        L_0x0014:
            boolean r0 = r4.A0L()
            if (r0 == 0) goto L_0x002a
            if (r1 == 0) goto L_0x002a
            java.lang.String r0 = r4.A0F
            boolean r0 = X.AnonymousClass36S.A07(r0)
            if (r0 == 0) goto L_0x0027
            java.lang.String r0 = r4.A0F
            return r0
        L_0x0027:
            java.lang.String r0 = r4.A0K
            return r0
        L_0x002a:
            X.1S4 r0 = r4.A0A
            if (r0 == 0) goto L_0x0045
            boolean r0 = r0.A0b()
            if (r0 == 0) goto L_0x0045
            if (r2 == 0) goto L_0x0045
            X.7yt r0 = r2.A09
            boolean r0 = X.C161527pr.A02(r0)
            if (r0 != 0) goto L_0x0045
            X.7yt r0 = r2.A09
            java.lang.Object r0 = r0.A00
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L_0x0045:
            java.lang.String r0 = super.A0I(r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C191669Fv.A0I(X.34w):java.lang.String");
    }

    public void A0J() {
        String str;
        String str2;
        C160757oG r2 = this.A0f;
        r2.A06("IN- HANDLE_SEND_AGAIN start");
        C193629Pj r0 = this.A06;
        if (r0 != null) {
            C624034w r02 = r0.A01;
            if (r02 != null) {
                boolean z = r02.A0P;
                if (z) {
                    r2.A06("IN- HANDLE_SEND_AGAIN transaction is not null and it's interop");
                    AnonymousClass1S4 r1 = this.A06.A01.A0A;
                    if (r1 instanceof AnonymousClass99L) {
                        str2 = ((AnonymousClass99L) r1).A0O;
                    } else {
                        str2 = "";
                    }
                    if (C194759Uj.A00(str2)) {
                        C166557yt A0B2 = C1899593h.A0B(str2);
                        if (!this.A05.A07(A0B2)) {
                            A0c(true);
                            this.A0A.A01(A0B2, (C166557yt) null, new C204779pu(A0B2, this, str2, 0));
                            return;
                        }
                        r2.A06("IN- HANDLE_SEND_AGAIN user blocked checked locally");
                        AnonymousClass9QJ A002 = AnonymousClass9QJ.A00(13);
                        A002.A0F = str2;
                        AnonymousClass94y.A00(this, A002);
                        return;
                    }
                    r2.A06("IN- HANDLE_SEND_AGAIN vpa valid check locally, incorrect vpa");
                    AnonymousClass9QJ A003 = AnonymousClass9QJ.A00(8);
                    A003.A0C = this.A0O.A00.getString(R.string.f11nameremoved);
                    AnonymousClass94y.A00(this, A003);
                    return;
                }
                str = AnonymousClass000.A0b("IN- HANDLE_SEND_AGAIN isInterop is ", AnonymousClass001.A0o(), z);
            } else {
                str = "IN- HANDLE_SEND_AGAIN transactionInfo is null?";
            }
        } else {
            str = "IN- HANDLE_SEND_AGAIN transactionDetailData is null?";
        }
        r2.A06(str);
        r2.A06("IN- HANDLE_SEND_AGAIN calling super");
        super.A0J();
    }

    public void A0L() {
        C624034w r1;
        AnonymousClass99L r0;
        C193629Pj r02 = this.A06;
        if (!(r02 == null || (r1 = r02.A01) == null || (r0 = (AnonymousClass99L) r1.A0A) == null || r0.A0G == null)) {
            int i = r1.A02;
            int i2 = R.string.f11nameremoved;
            if (i == 115) {
                i2 = R.string.f11nameremoved;
            }
            this.A01 = i2;
        }
        super.A0L();
    }

    public void A0Q(C193089Nc r3) {
        C193629Pj r0;
        C624034w r02;
        C191619Fq r1;
        int i = r3.A00;
        if (i == 300) {
            A0d(false);
        } else if (i != 301) {
            super.A0Q(r3);
        } else {
            if (this.A01) {
                C191619Fq r12 = new C191619Fq(101);
                r12.A03 = this.A07.A01;
                r12.A06 = this.A0D;
                r12.A05 = "SUBMITTED";
                r12.A04 = "00";
                r1 = r12;
            } else {
                String str = this.A00;
                if (("chat".equals(str) || "payment_composer_icon".equals(str)) && (r0 = this.A06) != null && (r02 = r0.A01) != null && r02.A0P) {
                    r1 = new C191619Fq(106);
                } else {
                    r1 = AnonymousClass9QJ.A00(19);
                }
            }
            AnonymousClass94y.A00(this, r1);
        }
    }

    public void A0R(List list) {
        C624034w r0;
        AnonymousClass1S4 r1;
        AnonymousClass9V2 r02;
        C194809Uo r10;
        BigDecimal bigDecimal;
        C193629Pj r03 = this.A06;
        List list2 = list;
        if (r03 == null || (r0 = r03.A01) == null || (r1 = r0.A0A) == null || !(r1 instanceof AnonymousClass99L) || (r02 = ((AnonymousClass99L) r1).A0F) == null || (r10 = r02.A00) == null) {
            super.A0R(list2);
            return;
        }
        C85204Fi A012 = this.A0T.A01(r10.A01);
        AnonymousClass39Q A082 = C1899593h.A08(A012, new BigDecimal((String) r10.A00.A00));
        C54292oU r5 = this.A0O;
        Context context = r5.A00;
        C620733j r9 = this.A0P;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(AnonymousClass9UO.A01(r9, A012, A082, 2, false));
        if (AnonymousClass9KX.A00 == null) {
            try {
                AnonymousClass9KX.A00 = C06400Xn.A02(context, R.font.payment_icons_regular);
            } catch (Resources.NotFoundException unused) {
                Log.e("PAY: PaymentsTypeface/loadTypefaceSync could not load font R.font.payment_icons_regular");
            }
        }
        AnonymousClass39R A052 = this.A06.A01.A05();
        C150457Qu BAi = A0D().BAi();
        C624034w r12 = this.A06.A01;
        boolean A002 = BAi.A00(r12);
        C195219Wq r04 = this.A0k;
        int A0B2 = r04.A0B(r12);
        Context context2 = r04.A05.A00;
        if (A0B2 == 0) {
            A0B2 = R.string.f11nameremoved;
        }
        String A0F = AnonymousClass002.A0F(context2, context2.getString(A0B2), C18310x6.A1b(spannableStringBuilder, 0), 1, R.string.f11nameremoved);
        Object[] objArr = new Object[1];
        Locale A0O = r9.A0O();
        Object[] objArr2 = new Object[1];
        BigDecimal bigDecimal2 = A082.A00;
        C162457s7.A0J(bigDecimal2, 1);
        BigDecimal bigDecimal3 = r10.A03;
        if (bigDecimal3 != null) {
            bigDecimal = bigDecimal3.divide(C161957qt.A00);
        } else {
            bigDecimal = null;
        }
        BigDecimal bigDecimal4 = r10.A02;
        BigDecimal add = bigDecimal2.multiply(bigDecimal4).add(bigDecimal2.multiply(bigDecimal4).multiply(bigDecimal));
        C162457s7.A0D(add);
        objArr2[0] = add;
        objArr[0] = String.format(A0O, "%.2f", objArr2);
        list2.add(new C191469Fa(A052, spannableStringBuilder, A0F, C54292oU.A00(r5).getString(R.string.f11nameremoved, objArr), A002));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0055, code lost:
        r4.A00 = com.whatsapp.R.drawable.ic_hours;
        r8 = r2.A0O;
        r4.A04 = X.C54292oU.A00(r8).getString(com.whatsapp.R.string.f11nameremoved);
        r1 = com.whatsapp.R.string.f11nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x006c, code lost:
        r4.A02 = X.C54292oU.A00(r8).getString(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0076, code lost:
        r4.A03 = X.AnonymousClass002.A0F(r8.A00, X.C107505bQ.A03(r2.A0P, r2.A03.A0I(r7.A01)), new java.lang.Object[1], 0, com.whatsapp.R.string.f11nameremoved);
        r4.A05 = true;
        r4.A07 = true;
     */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x02fd  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0281  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0Y(java.util.List r18) {
        /*
            r17 = this;
            r2 = r17
            r3 = r18
            r2.A0R(r3)
            r2.A0W(r3)
            r2.A0T(r3)
            r2.A0V(r3)
            r2.A0X(r3)
            X.9Pj r0 = r2.A06
            X.34w r7 = r0.A01
            boolean r0 = r2.A0p()
            if (r0 == 0) goto L_0x0029
            if (r7 == 0) goto L_0x0154
            X.1S4 r0 = r7.A0A
            if (r0 == 0) goto L_0x0154
            boolean r0 = r0.A0b()
            if (r0 == 0) goto L_0x0154
        L_0x0029:
            boolean r0 = r2.A0p()
            if (r0 == 0) goto L_0x0098
            X.9Pj r0 = r2.A06
            X.34w r9 = r0.A01
            X.1S4 r0 = r9.A0A
            X.99L r0 = (X.AnonymousClass99L) r0
            X.9aw r7 = r0.A0H
            if (r7 == 0) goto L_0x0098
            long r0 = r7.A00
            boolean r12 = r7.A03
            r5 = 0
            int r4 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r4 <= 0) goto L_0x00df
            X.9Fc r4 = new X.9Fc
            r4.<init>()
            java.lang.String r1 = r7.A02
            int r0 = r1.hashCode()
            r6 = 0
            r5 = 1
            switch(r0) {
                case -828048883: goto L_0x009c;
                case 441297912: goto L_0x00b9;
                default: goto L_0x0055;
            }
        L_0x0055:
            r0 = 2131232327(0x7f080647, float:1.808076E38)
            r4.A00 = r0
            X.2oU r8 = r2.A0O
            r1 = 2131894875(0x7f12225b, float:1.9424567E38)
            android.content.res.Resources r0 = X.C54292oU.A00(r8)
            java.lang.String r0 = r0.getString(r1)
            r4.A04 = r0
            r1 = 2131894874(0x7f12225a, float:1.9424565E38)
        L_0x006c:
            android.content.res.Resources r0 = X.C54292oU.A00(r8)
            java.lang.String r0 = r0.getString(r1)
            r4.A02 = r0
        L_0x0076:
            android.content.Context r12 = r8.A00
            r11 = 2131888425(0x7f120929, float:1.9411485E38)
            java.lang.Object[] r10 = new java.lang.Object[r5]
            X.33j r9 = r2.A0P
            X.2sH r8 = r2.A03
            long r0 = r7.A01
            long r0 = r8.A0I(r0)
            java.lang.String r0 = X.C107505bQ.A03(r9, r0)
            java.lang.String r0 = X.AnonymousClass002.A0F(r12, r0, r10, r6, r11)
            r4.A03 = r0
            r4.A05 = r5
            r4.A07 = r5
        L_0x0095:
            r3.add(r4)
        L_0x0098:
            r2.A0U(r3)
            return
        L_0x009c:
            java.lang.String r0 = "TRANSACTION_CLOSED"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0055
            r0 = 2131232764(0x7f0807fc, float:1.8081646E38)
            r4.A00 = r0
            X.2oU r8 = r2.A0O
            r1 = 2131894877(0x7f12225d, float:1.9424571E38)
            android.content.res.Resources r0 = X.C54292oU.A00(r8)
            java.lang.String r0 = r0.getString(r1)
            r4.A04 = r0
            goto L_0x0076
        L_0x00b9:
            java.lang.String r0 = "RESOLVED"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0055
            r0 = 2131232764(0x7f0807fc, float:1.8081646E38)
            r4.A00 = r0
            X.2oU r8 = r2.A0O
            r1 = 2131894877(0x7f12225d, float:1.9424571E38)
            android.content.res.Resources r0 = X.C54292oU.A00(r8)
            java.lang.String r0 = r0.getString(r1)
            r4.A04 = r0
            int r1 = r9.A02
            r0 = 405(0x195, float:5.68E-43)
            if (r1 == r0) goto L_0x0076
            r1 = 2131894876(0x7f12225c, float:1.942457E38)
            goto L_0x006c
        L_0x00df:
            long r4 = r9.A05
            X.99n r0 = r2.A0a
            X.1VX r6 = r0.A02
            r0 = 1422(0x58e, float:1.993E-42)
            int r0 = r6.A0N(r0)
            long r0 = (long) r0
            java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.DAYS
            X.2sH r7 = r2.A03
            long r10 = r7.A0H()
            long r0 = r8.toMillis(r0)
            long r4 = r4 + r0
            int r0 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r0 > 0) goto L_0x0136
            if (r12 == 0) goto L_0x0098
            X.9Fc r4 = new X.9Fc
            r4.<init>()
            r11 = 0
            r4.A07 = r11
            r0 = 1421(0x58d, float:1.991E-42)
            int r0 = r6.A0N(r0)
            long r0 = (long) r0
            long r5 = r9.A05
            java.util.concurrent.TimeUnit r10 = java.util.concurrent.TimeUnit.MINUTES
            long r7 = r7.A0H()
            long r0 = r10.toMillis(r0)
            long r5 = r5 + r0
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 > 0) goto L_0x012d
            r0 = 1
            r4.A06 = r0
            r1 = 28
            X.9pJ r0 = new X.9pJ
            r0.<init>((java.lang.Object) r9, (int) r1, (java.lang.Object) r2)
        L_0x0129:
            r4.A01 = r0
            goto L_0x0095
        L_0x012d:
            r4.A06 = r11
            r0 = 141(0x8d, float:1.98E-43)
            X.9p3 r0 = X.C204249p3.A00(r2, r0)
            goto L_0x0129
        L_0x0136:
            if (r12 == 0) goto L_0x0098
            X.9Fc r4 = new X.9Fc
            r4.<init>()
            X.2oU r0 = r2.A0O
            r1 = 2131894878(0x7f12225e, float:1.9424573E38)
            android.content.res.Resources r0 = X.C54292oU.A00(r0)
            java.lang.String r0 = r0.getString(r1)
            r4.A02 = r0
            r0 = 0
            r4.A05 = r0
            r0 = 1
            r4.A07 = r0
            goto L_0x0095
        L_0x0154:
            int r8 = r7.A02
            X.9FP r6 = new X.9FP
            r6.<init>()
            java.util.ArrayList r0 = X.AnonymousClass001.A0s()
            r6.A00 = r0
            r5 = 0
            r4 = 0
        L_0x0163:
            java.util.List r0 = r6.A00
            r16 = r0
            X.9V7 r13 = r2.A0j
            X.2sH r10 = r2.A03
            X.9Pt r9 = new X.9Pt
            r9.<init>()
            X.9Wq r0 = r13.A04
            java.lang.String r14 = r0.A0U(r7)
            long r0 = r7.A05
            java.lang.CharSequence r11 = r13.A01(r10, r0)
            r0 = 403(0x193, float:5.65E-43)
            r12 = 0
            r1 = 2
            r15 = 1
            if (r8 == r0) goto L_0x02a9
            r0 = 408(0x198, float:5.72E-43)
            if (r8 == r0) goto L_0x0238
            r0 = 405(0x195, float:5.68E-43)
            if (r8 == r0) goto L_0x021a
            r0 = 406(0x196, float:5.69E-43)
            if (r8 == r0) goto L_0x0206
            switch(r8) {
                case 422: goto L_0x0238;
                case 423: goto L_0x0255;
                case 424: goto L_0x01f0;
                default: goto L_0x0192;
            }
        L_0x0192:
            if (r4 == 0) goto L_0x02dd
            if (r4 == r15) goto L_0x01e1
            if (r4 != r1) goto L_0x01bb
            r1 = 2131232792(0x7f080818, float:1.8081703E38)
            X.2oU r0 = r13.A01
            android.content.Context r10 = r0.A00
            r0 = 2131894422(0x7f122096, float:1.9423648E38)
        L_0x01a2:
            java.lang.String r11 = X.AnonymousClass0x2.A0X(r10, r14, r15, r0)
        L_0x01a6:
            r10 = 2131102104(0x7f060998, float:1.7816637E38)
        L_0x01a9:
            r0 = 2131102225(0x7f060a11, float:1.7816882E38)
            r9.A03 = r0
            r0 = 2131102351(0x7f060a8f, float:1.7817137E38)
            r9.A02 = r0
            r9.A01 = r1
            r9.A05 = r11
            r9.A04 = r12
        L_0x01b9:
            r9.A00 = r10
        L_0x01bb:
            r0 = r16
            r0.add(r9)
            int r4 = r4 + 1
            r0 = 3
            if (r4 < r0) goto L_0x0163
            r0 = 422(0x1a6, float:5.91E-43)
            if (r8 == r0) goto L_0x01da
            r0 = 423(0x1a7, float:5.93E-43)
            if (r8 == r0) goto L_0x01da
            r0 = 406(0x196, float:5.69E-43)
            if (r8 == r0) goto L_0x01da
            r0 = 408(0x198, float:5.72E-43)
            if (r8 == r0) goto L_0x01da
            r0 = 424(0x1a8, float:5.94E-43)
            if (r8 == r0) goto L_0x01da
            r5 = 1
        L_0x01da:
            r6.A01 = r5
            r3.add(r6)
            goto L_0x0029
        L_0x01e1:
            r1 = 2131232793(0x7f080819, float:1.8081705E38)
            X.2oU r0 = r13.A01
            android.content.Context r10 = r0.A00
            r0 = 2131894421(0x7f122095, float:1.9423646E38)
            java.lang.String r11 = r10.getString(r0)
            goto L_0x01a6
        L_0x01f0:
            if (r4 == 0) goto L_0x02dd
            if (r4 != r15) goto L_0x0294
            r11 = 2131232793(0x7f080819, float:1.8081705E38)
            X.2oU r0 = r13.A01
            android.content.Context r1 = r0.A00
            r0 = 2131894429(0x7f12209d, float:1.9423663E38)
            java.lang.String r12 = r1.getString(r0)
            r0 = 2131894425(0x7f122099, float:1.9423654E38)
            goto L_0x024d
        L_0x0206:
            if (r4 == 0) goto L_0x02dd
            if (r4 != r15) goto L_0x0286
            r1 = 2131232790(0x7f080816, float:1.80817E38)
            X.2oU r0 = r13.A01
            android.content.Context r10 = r0.A00
            r0 = 2131894419(0x7f122093, float:1.9423642E38)
            java.lang.String r11 = r10.getString(r0)
            goto L_0x02a4
        L_0x021a:
            if (r4 == 0) goto L_0x02dd
            if (r4 == r15) goto L_0x02bb
            if (r4 != r1) goto L_0x01bb
            r11 = 2131232789(0x7f080815, float:1.8081697E38)
            X.2oU r0 = r13.A01
            android.content.Context r1 = r0.A00
            r0 = 2131894430(0x7f12209e, float:1.9423665E38)
            java.lang.String r12 = X.AnonymousClass0x2.A0X(r1, r14, r15, r0)
            long r0 = r7.A06
            java.lang.CharSequence r1 = r13.A01(r10, r0)
            r10 = 2131102143(0x7f0609bf, float:1.7816716E38)
            goto L_0x0271
        L_0x0238:
            if (r4 == 0) goto L_0x02dd
            if (r4 != r15) goto L_0x0294
            r11 = 2131232789(0x7f080815, float:1.8081697E38)
            X.2oU r0 = r13.A01
            android.content.Context r1 = r0.A00
            r0 = 2131894429(0x7f12209d, float:1.9423663E38)
            java.lang.String r12 = r1.getString(r0)
            r0 = 2131894424(0x7f122098, float:1.9423652E38)
        L_0x024d:
            java.lang.String r1 = r1.getString(r0)
            r10 = 2131102104(0x7f060998, float:1.7816637E38)
            goto L_0x0271
        L_0x0255:
            if (r4 == 0) goto L_0x02dd
            if (r4 != r15) goto L_0x0286
            r11 = 2131232790(0x7f080816, float:1.80817E38)
            X.2oU r0 = r13.A01
            android.content.Context r1 = r0.A00
            r0 = 2131894427(0x7f12209b, float:1.9423658E38)
            java.lang.String r12 = r1.getString(r0)
            r0 = 2131894426(0x7f12209a, float:1.9423656E38)
            java.lang.String r1 = r1.getString(r0)
            r10 = 2131102144(0x7f0609c0, float:1.7816718E38)
        L_0x0271:
            r0 = 2131102225(0x7f060a11, float:1.7816882E38)
            r9.A03 = r0
            r0 = 2131102351(0x7f060a8f, float:1.7817137E38)
            r9.A02 = r0
            r9.A01 = r11
            r9.A05 = r12
            if (r1 != 0) goto L_0x0282
            r1 = 0
        L_0x0282:
            r9.A04 = r1
            goto L_0x01b9
        L_0x0286:
            if (r4 != r1) goto L_0x01bb
            r1 = 2131232790(0x7f080816, float:1.80817E38)
            X.2oU r0 = r13.A01
            android.content.Context r10 = r0.A00
            r0 = 2131894420(0x7f122094, float:1.9423644E38)
            goto L_0x01a2
        L_0x0294:
            if (r4 != r1) goto L_0x01bb
            r1 = 2131232790(0x7f080816, float:1.80817E38)
            X.2oU r0 = r13.A01
            android.content.Context r10 = r0.A00
            r0 = 2131894420(0x7f122094, float:1.9423644E38)
            java.lang.String r11 = X.AnonymousClass0x2.A0X(r10, r14, r15, r0)
        L_0x02a4:
            r10 = 2131102144(0x7f0609c0, float:1.7816718E38)
            goto L_0x01a9
        L_0x02a9:
            if (r4 == 0) goto L_0x02dd
            if (r4 == r15) goto L_0x02bb
            if (r4 != r1) goto L_0x01bb
            r1 = 2131232793(0x7f080819, float:1.8081705E38)
            X.2oU r0 = r13.A01
            android.content.Context r10 = r0.A00
            r0 = 2131894423(0x7f122097, float:1.942365E38)
            goto L_0x01a2
        L_0x02bb:
            X.2oU r0 = r13.A01
            android.content.Context r1 = r0.A00
            r0 = 2131894429(0x7f12209d, float:1.9423663E38)
            java.lang.String r10 = r1.getString(r0)
            r1 = 2131232789(0x7f080815, float:1.8081697E38)
            r0 = 2131101263(0x7f06064f, float:1.781493E38)
            r9.A00 = r0
            r0 = 2131102142(0x7f0609be, float:1.7816714E38)
            r9.A03 = r0
            r9.A02 = r0
            r9.A01 = r1
            r9.A05 = r10
            r9.A04 = r12
            goto L_0x01bb
        L_0x02dd:
            X.2oU r0 = r13.A01
            android.content.Context r1 = r0.A00
            r0 = 2131894428(0x7f12209c, float:1.942366E38)
            java.lang.String r10 = r1.getString(r0)
            r1 = 2131232789(0x7f080815, float:1.8081697E38)
            r0 = 2131101263(0x7f06064f, float:1.781493E38)
            r9.A00 = r0
            r0 = 2131102142(0x7f0609be, float:1.7816714E38)
            r9.A03 = r0
            r9.A02 = r0
            r9.A01 = r1
            r9.A05 = r10
            if (r11 != 0) goto L_0x02fe
            r11 = 0
        L_0x02fe:
            r9.A04 = r11
            goto L_0x01bb
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C191669Fv.A0Y(java.util.List):void");
    }

    public void A0b(List list) {
        C624034w r0;
        AnonymousClass1S4 r02;
        C193629Pj r03 = this.A06;
        if (r03 == null || (r0 = r03.A01) == null || (r02 = r0.A0A) == null || !r02.A0b()) {
            super.A0b(list);
        }
    }

    public boolean A0e() {
        C624034w r0;
        AnonymousClass99L r02;
        C193629Pj r03 = this.A06;
        if (r03 == null || (r0 = r03.A01) == null || (r02 = (AnonymousClass99L) r0.A0A) == null || r02.A0G == null) {
            return super.A0e();
        }
        return true;
    }

    public boolean A0f(C624034w r4) {
        AnonymousClass99L r2 = (AnonymousClass99L) r4.A0A;
        if (r2 != null && (!TextUtils.isEmpty(r2.A0L) || r2.A0G != null)) {
            return false;
        }
        AnonymousClass1S4 r0 = r4.A0A;
        if (r0 == null || !r0.A0b()) {
            return super.A0f(r4);
        }
        return false;
    }

    public void A0i(C624034w r6, AnonymousClass99L r7, List list) {
        SpannableStringBuilder spannableStringBuilder;
        boolean A002 = AnonymousClass9U4.A07(this.A0b).BAi().A00(r6);
        AnonymousClass39Q r3 = r6.A08;
        if (r3 != null) {
            spannableStringBuilder = AnonymousClass9UO.A00(this.A0O.A00, this.A0P, r6.A03(), r3);
        } else {
            spannableStringBuilder = new SpannableStringBuilder();
        }
        AnonymousClass9F9 r2 = new AnonymousClass9F9(spannableStringBuilder, A002);
        if ("MAX".equals(r7.A0G.A0G)) {
            r2.A00 = this.A0O.A00.getString(R.string.f11nameremoved);
        }
        list.add(r2);
    }

    public void A0j(C624034w r5, AnonymousClass99L r6, List list) {
        AnonymousClass4FS r1;
        Runnable r0;
        Context context;
        int i;
        if (TextUtils.isEmpty(r6.A0G.A0H) || r5.A02 != 417) {
            C195109Vz r2 = r6.A0G.A0C;
            if (r2 != null && "ACCEPT".equals(r2.A08)) {
                String str = r2.A09;
                if (str.equals("PENDING")) {
                    AnonymousClass9FU r22 = new AnonymousClass9FU();
                    r22.A02 = false;
                    r22.A01 = this.A0O.A00.getString(R.string.f11nameremoved);
                    r22.A00 = new C204409pJ((Object) r5, 26, (Object) this);
                    list.add(r22);
                    return;
                } else if (str.equals("FAILURE") && !TextUtils.isEmpty(r2.A05)) {
                    AnonymousClass9FU r23 = new AnonymousClass9FU();
                    r23.A02 = true;
                    r23.A01 = this.A0O.A00.getString(R.string.f11nameremoved);
                    list.add(r23);
                    r1 = this.A0l;
                    r0 = new C201089jV(r5, r6, this);
                } else {
                    return;
                }
            } else {
                return;
            }
        } else {
            AnonymousClass9FU r24 = new AnonymousClass9FU();
            r24.A02 = true;
            C195059Vs r02 = r6.A0G.A0B;
            if (r02 != null) {
                String str2 = r02.A02;
                if ("PAUSE".equals(str2)) {
                    context = this.A0O.A00;
                    i = R.string.f11nameremoved;
                } else {
                    if ("RESUME".equals(str2)) {
                        context = this.A0O.A00;
                        i = R.string.f11nameremoved;
                    }
                    list.add(r24);
                    r1 = this.A0l;
                    r0 = new C201099jW(r5, r6, this);
                }
            } else {
                context = this.A0O.A00;
                i = R.string.f11nameremoved;
            }
            r24.A01 = context.getString(i);
            list.add(r24);
            r1 = this.A0l;
            r0 = new C201099jW(r5, r6, this);
        }
        r1.BkM(r0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001c, code lost:
        if (r1 == 418) goto L_0x001e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0k(X.C624034w r10, X.AnonymousClass99L r11, java.util.List r12) {
        /*
            r9 = this;
            X.9Ff r3 = new X.9Ff
            r3.<init>()
            int r0 = X.C195219Wq.A01(r10)
            r3.A02 = r0
            int r1 = r10.A02
            r0 = 401(0x191, float:5.62E-43)
            if (r1 == r0) goto L_0x001e
            r0 = 415(0x19f, float:5.82E-43)
            if (r1 == r0) goto L_0x001e
            r0 = 417(0x1a1, float:5.84E-43)
            if (r1 == r0) goto L_0x001e
            r0 = 418(0x1a2, float:5.86E-43)
            r2 = 1
            if (r1 != r0) goto L_0x001f
        L_0x001e:
            r2 = 0
        L_0x001f:
            X.4Fi r1 = r10.A03()
            X.2oU r0 = r9.A0O
            android.content.Context r5 = r0.A00
            java.lang.CharSequence r0 = r1.B6J(r5, r2)
            r3.A04 = r0
            boolean r1 = r10.A0L()
            r0 = 2131891688(0x7f1215e8, float:1.9418103E38)
            if (r1 == 0) goto L_0x0039
            r0 = 2131891795(0x7f121653, float:1.941832E38)
        L_0x0039:
            java.lang.String r0 = r5.getString(r0)
            r3.A05 = r0
            X.9Wq r6 = r9.A0k
            int r0 = r6.A0B(r10)
            r3.A01 = r0
            int r7 = r10.A02
            r1 = 15
            r0 = 2131894795(0x7f12220b, float:1.9424405E38)
            if (r7 == r1) goto L_0x0127
            r0 = 16
            if (r7 == r0) goto L_0x0120
            r0 = 20
            r4 = 0
            r2 = 1
            if (r7 == r0) goto L_0x00fb
            r0 = 115(0x73, float:1.61E-43)
            if (r7 == r0) goto L_0x00de
            r0 = 401(0x191, float:5.62E-43)
            if (r7 == r0) goto L_0x00bf
            r0 = 415(0x19f, float:5.82E-43)
            r1 = 418(0x1a2, float:5.86E-43)
            if (r7 == r0) goto L_0x00ab
            r0 = 417(0x1a1, float:5.84E-43)
            if (r7 == r0) goto L_0x0076
            if (r7 == r1) goto L_0x0124
            java.lang.String r0 = ""
        L_0x0070:
            r3.A0A = r0
            r12.add(r3)
            return
        L_0x0076:
            X.9W2 r7 = r11.A0G
            X.C626936e.A06(r7)
            X.33j r6 = r9.A0P
            X.2sH r4 = r9.A03
            long r0 = r7.A01
            java.lang.String r4 = X.AnonymousClass9WN.A00(r4, r6, r0)
            int r1 = r7.A00()
            r0 = 2
            if (r1 == r0) goto L_0x00a7
            r0 = 4
            if (r1 == r0) goto L_0x00a7
            r0 = 6
            if (r1 == r0) goto L_0x00a7
            java.lang.String r0 = r7.A0E
            boolean r0 = X.AnonymousClass9WN.A02(r0)
            if (r0 == 0) goto L_0x009f
            r0 = 2131894798(0x7f12220e, float:1.942441E38)
            goto L_0x0127
        L_0x009f:
            r0 = 2131894799(0x7f12220f, float:1.9424413E38)
            java.lang.String r0 = X.AnonymousClass0x2.A0X(r5, r4, r2, r0)
            goto L_0x0070
        L_0x00a7:
            r0 = 2131894797(0x7f12220d, float:1.9424409E38)
            goto L_0x0127
        L_0x00ab:
            int r0 = r11.A01
            if (r0 != r1) goto L_0x00b3
            r0 = 2131894792(0x7f122208, float:1.9424399E38)
            goto L_0x0127
        L_0x00b3:
            r6 = 2131894793(0x7f122209, float:1.94244E38)
            java.lang.Object[] r1 = new java.lang.Object[r2]
            java.lang.String r0 = r11.A0O
            java.lang.String r0 = X.AnonymousClass002.A0F(r5, r0, r1, r4, r6)
            goto L_0x0070
        L_0x00bf:
            long r0 = r11.A04
            X.2sH r7 = r6.A04
            long r7 = r7.A0H()
            long r0 = r0 - r7
            android.util.Pair r0 = r6.A0E(r0)
            if (r0 == 0) goto L_0x00da
            r6 = 2131894800(0x7f122210, float:1.9424415E38)
            java.lang.Object[] r1 = new java.lang.Object[r2]
            java.lang.Object r0 = r0.second
            java.lang.String r0 = X.AnonymousClass002.A0F(r5, r0, r1, r4, r6)
            goto L_0x0070
        L_0x00da:
            r0 = 2131894446(0x7f1220ae, float:1.9423697E38)
            goto L_0x0127
        L_0x00de:
            r0 = 1800000(0x1b7740, double:8.89318E-318)
            android.util.Pair r8 = r6.A0E(r0)
            X.33j r7 = r9.A0P
            r6 = 2131755383(0x7f100177, float:1.9141644E38)
            int r0 = X.C18280x3.A03(r8)
            long r0 = (long) r0
            java.lang.Object[] r5 = new java.lang.Object[r2]
            java.lang.Object r2 = r8.second
            r5[r4] = r2
            java.lang.String r0 = r7.A0L(r5, r6, r0)
            goto L_0x0070
        L_0x00fb:
            long r0 = r11.A04
            X.2sH r7 = r6.A04
            long r7 = r7.A0H()
            long r0 = r0 - r7
            android.util.Pair r8 = r6.A0E(r0)
            if (r8 == 0) goto L_0x0120
            X.33j r7 = r9.A0P
            r6 = 2131755383(0x7f100177, float:1.9141644E38)
            int r0 = X.C18280x3.A03(r8)
            long r0 = (long) r0
            java.lang.Object[] r5 = new java.lang.Object[r2]
            java.lang.Object r2 = r8.second
            r5[r4] = r2
            java.lang.String r0 = r7.A0L(r5, r6, r0)
            goto L_0x0070
        L_0x0120:
            r0 = 2131894796(0x7f12220c, float:1.9424407E38)
            goto L_0x0127
        L_0x0124:
            r0 = 2131894439(0x7f1220a7, float:1.9423683E38)
        L_0x0127:
            java.lang.String r0 = r5.getString(r0)
            goto L_0x0070
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C191669Fv.A0k(X.34w, X.99L, java.util.List):void");
    }

    public void A0l(C624034w r9, AnonymousClass99L r10, List list, boolean z) {
        C195109Vz r2;
        int i;
        Object[] A1b;
        AnonymousClass9W2 r0 = r10.A0G;
        if (r0 != null && (r2 = r0.A0C) != null && "UNKNOWN".equals(r2.A08) && "INIT".equals(r2.A09)) {
            String str = r10.A0O;
            AnonymousClass9FA r5 = new AnonymousClass9FA();
            Context context = this.A0O.A00;
            String A042 = C107575bX.A04(context, R.color.f5nameremoved);
            if (z) {
                r5.A02 = context.getString(R.string.f11nameremoved);
                i = R.string.f11nameremoved;
                A1b = new Object[]{A042};
            } else {
                r5.A02 = context.getString(R.string.f11nameremoved);
                i = R.string.f11nameremoved;
                A1b = C18310x6.A1b(str, 0);
                A1b[1] = A042;
            }
            r5.A01 = context.getString(i, A1b);
            r5.A00 = new C195449Xv(r9, this, z);
            list.add(r5);
        }
    }

    public final void A0n(AnonymousClass99L r4, List list, int i) {
        AnonymousClass9W2 r0;
        if (i != 401 && i != 20 && (r0 = r4.A0G) != null && !C161527pr.A02(r0.A08)) {
            C191479Fb r2 = new C191479Fb();
            A02(this.A0O.A00, r2, R.string.f11nameremoved);
            r2.A03 = (String) C1899593h.A0X(r4.A0G.A08);
            r2.A02 = new C195489Xz(r4, this);
            list.add(r2);
        }
    }

    public final void A0o(List list) {
        AnonymousClass99L r3 = (AnonymousClass99L) this.A06.A01.A0A;
        if (this.A02.A08(C66663Mh.A0l) && !TextUtils.isEmpty(r3.A0V)) {
            C191479Fb r2 = new C191479Fb();
            Context context = this.A0O.A00;
            A02(context, r2, R.string.f11nameremoved);
            r2.A03 = context.getString(R.string.f11nameremoved);
            r2.A01 = new C204409pJ((Object) r3, 25, (Object) this);
            list.add(r2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0072, code lost:
        r0 = r1.A0X(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0p() {
        /*
            r4 = this;
            X.99n r2 = r4.A0a
            X.9bS r0 = r4.A08
            java.lang.String r0 = r0.A07()
            if (r0 == 0) goto L_0x0015
            java.lang.String r1 = r0.toLowerCase()
            int r0 = r1.hashCode()
            switch(r0) {
                case 113658: goto L_0x003f;
                case 3008417: goto L_0x004c;
                case 3197625: goto L_0x0059;
                case 100023093: goto L_0x0066;
                default: goto L_0x0015;
            }
        L_0x0015:
            r0 = 0
        L_0x0016:
            r3 = 0
            if (r0 == 0) goto L_0x0033
            X.9Pj r0 = r4.A06
            if (r0 == 0) goto L_0x0033
            X.34w r2 = r0.A01
            if (r2 == 0) goto L_0x0033
            X.1S4 r1 = r2.A0A
            if (r1 == 0) goto L_0x0033
            boolean r0 = r1 instanceof X.AnonymousClass99L
            if (r0 == 0) goto L_0x0033
            X.99L r1 = (X.AnonymousClass99L) r1
            X.9W2 r0 = r1.A0G
            if (r0 == 0) goto L_0x0034
            boolean r0 = r0.A0M
            if (r0 == 0) goto L_0x0034
        L_0x0033:
            return r3
        L_0x0034:
            int r1 = r2.A03
            r0 = 1
            if (r1 == r0) goto L_0x003d
            r0 = 100
            if (r1 != r0) goto L_0x0033
        L_0x003d:
            r3 = 1
            return r3
        L_0x003f:
            java.lang.String r0 = "sbi"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0015
            X.1VX r1 = r2.A02
            r0 = 2329(0x919, float:3.264E-42)
            goto L_0x0072
        L_0x004c:
            java.lang.String r0 = "axis"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0015
            X.1VX r1 = r2.A02
            r0 = 2330(0x91a, float:3.265E-42)
            goto L_0x0072
        L_0x0059:
            java.lang.String r0 = "hdfc"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0015
            X.1VX r1 = r2.A02
            r0 = 2328(0x918, float:3.262E-42)
            goto L_0x0072
        L_0x0066:
            java.lang.String r0 = "icici"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0015
            X.1VX r1 = r2.A02
            r0 = 2327(0x917, float:3.261E-42)
        L_0x0072:
            boolean r0 = r1.A0X(r0)
            goto L_0x0016
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C191669Fv.A0p():boolean");
    }

    public static void A02(Context context, C191479Fb r1, int i) {
        r1.A04 = context.getString(i);
    }

    public void A0P(C191519Ff r7) {
        if (!A0p()) {
            super.A0P(r7);
            return;
        }
        C624034w r5 = this.A06.A01;
        AnonymousClass9JQ A042 = C195219Wq.A04(r5);
        C54292oU r1 = this.A0O;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(A042.iconType);
        Typeface A022 = C06400Xn.A02(r1.A00, R.font.payment_icons_regular);
        if (A022 != null) {
            spannableStringBuilder.setSpan(new AnonymousClass6EH(A022), 0, A042.iconType.length(), 0);
        }
        r7.A04 = spannableStringBuilder;
        r7.A02 = C195219Wq.A01(r5);
        r7.A00 = 30.0f;
    }

    public void A0m(C624034w r13, List list) {
        Context context;
        int i;
        String A0X;
        int A002;
        AnonymousClass99L A0K = C1899693i.A0K(r13);
        AnonymousClass9FO r6 = new AnonymousClass9FO();
        AnonymousClass9W2 r5 = A0K.A0G;
        C626936e.A06(r5);
        AnonymousClass9WN r8 = this.A0D;
        int i2 = r13.A02;
        String str = A0K.A0O;
        long j = r5.A01;
        String str2 = r5.A0E;
        if (i2 == 20 || i2 == 115) {
            boolean A022 = AnonymousClass9WN.A02(str2);
            context = r8.A02.A00;
            if (A022) {
                i = R.string.f11nameremoved;
                A0X = AnonymousClass0x2.A0X(context, str, 1, i);
            } else {
                Object[] objArr = new Object[2];
                objArr[0] = str;
                A0X = AnonymousClass002.A0F(context, AnonymousClass9WN.A00(r8.A01, r8.A03, j), objArr, 1, R.string.f11nameremoved);
            }
        } else if (i2 != 401 && i2 != 417 && i2 != 418) {
            A0X = null;
        } else if (!AnonymousClass9WN.A02(str2) || !((A002 = r5.A00()) == 2 || A002 == 4 || A002 == 6)) {
            context = r8.A02.A00;
            i = R.string.f11nameremoved;
            A0X = AnonymousClass0x2.A0X(context, str, 1, i);
        } else {
            C195059Vs r9 = r5.A0B;
            C626936e.A06(r9);
            C620733j r3 = r8.A03;
            C56612sH r2 = r8.A01;
            String A003 = AnonymousClass9WN.A00(r2, r3, r9.A01);
            A0X = AnonymousClass002.A0F(r8.A02.A00, AnonymousClass9WN.A00(r2, r3, r9.A00), AnonymousClass4L0.A0V(str, A003, 3), 2, R.string.f11nameremoved);
        }
        r6.A01 = A0X;
        if (!TextUtils.isEmpty(A0X)) {
            r6.A00 = 0;
            list.add(r6);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C191669Fv(android.os.Bundle r47, X.C69263Wi r48, X.C56972sr r49, X.C66663Mh r50, X.C620433g r51, X.C56962sq r52, X.C64773Ex r53, X.C620633i r54, X.C56612sH r55, X.C54292oU r56, X.C620733j r57, X.C66543Lv r58, X.C194909Va r59, X.AnonymousClass36F r60, X.C617332a r61, X.AnonymousClass8EA r62, X.AnonymousClass1VX r63, X.AnonymousClass31C r64, X.C194619Tt r65, X.C196719bd r66, X.AnonymousClass9U1 r67, X.C196629bS r68, X.C194539Ti r69, X.C1906899l r70, X.C40602Ha r71, X.C620933l r72, X.C29271iY r73, X.AnonymousClass9U5 r74, X.C1907099n r75, X.AnonymousClass9U4 r76, X.AnonymousClass9b0 r77, X.AnonymousClass9TZ r78, X.C203499no r79, X.C196419ao r80, X.C194969Vi r81, X.AnonymousClass9Tp r82, X.C158777kX r83, X.AnonymousClass9B3 r84, X.AnonymousClass9V7 r85, X.AnonymousClass9WN r86, X.C194259Se r87, X.C195219Wq r88, X.C194639Tx r89, X.AnonymousClass4FS r90) {
        /*
            r46 = this;
            r4 = r46
            r24 = r75
            r1 = r73
            r22 = r72
            r21 = r70
            r20 = r69
            r19 = r62
            r18 = r61
            r27 = r78
            r7 = r49
            r28 = r79
            r8 = r51
            r29 = r81
            r9 = r52
            r30 = r82
            r10 = r53
            r31 = r83
            r11 = r54
            r12 = r55
            r32 = r85
            r13 = r56
            r14 = r57
            r15 = r58
            r33 = r88
            r16 = r59
            r17 = r60
            r34 = r90
            r26 = r77
            r6 = r48
            r25 = r76
            r5 = r47
            r23 = r1
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)
            r4.A03 = r12
            r0 = r50
            r4.A02 = r0
            r0 = r63
            r4.A04 = r0
            r0 = r86
            r4.A0D = r0
            r0 = r66
            r4.A06 = r0
            r2 = r67
            r4.A07 = r2
            r3 = r65
            r4.A05 = r3
            r0 = r68
            r4.A08 = r0
            r4.A09 = r1
            r0 = r80
            r4.A0C = r0
            android.content.Context r1 = r13.A00
            X.9AI r0 = new X.9AI
            r43 = r74
            r42 = r71
            r39 = r64
            r44 = r84
            r45 = r87
            r35 = r0
            r36 = r1
            r37 = r6
            r38 = r18
            r40 = r3
            r41 = r2
            r35.<init>(r36, r37, r38, r39, r40, r41, r42, r43, r44, r45)
            r4.A0A = r0
            X.9A9 r0 = new X.9A9
            r14 = r89
            r7 = r0
            r8 = r6
            r9 = r13
            r10 = r2
            r11 = r42
            r12 = r43
            r13 = r25
            r15 = r34
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15)
            r4.A0B = r0
            if (r47 == 0) goto L_0x00b3
            java.lang.String r0 = "extra_return_after_completion"
            boolean r0 = r5.getBoolean(r0)
            r4.A01 = r0
            java.lang.String r1 = "referral_screen"
            r0 = 0
            java.lang.String r0 = r5.getString(r1, r0)
            r4.A00 = r0
            java.lang.String r0 = "extra_new_mandate_initiation_mode"
            r5.getString(r0)
        L_0x00b3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C191669Fv.<init>(android.os.Bundle, X.3Wi, X.2sr, X.3Mh, X.33g, X.2sq, X.3Ex, X.33i, X.2sH, X.2oU, X.33j, X.3Lv, X.9Va, X.36F, X.32a, X.8EA, X.1VX, X.31C, X.9Tt, X.9bd, X.9U1, X.9bS, X.9Ti, X.99l, X.2Ha, X.33l, X.1iY, X.9U5, X.99n, X.9U4, X.9b0, X.9TZ, X.9no, X.9ao, X.9Vi, X.9Tp, X.7kX, X.9B3, X.9V7, X.9WN, X.9Se, X.9Wq, X.9Tx, X.4FS):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001e, code lost:
        if (r1 != 418) goto L_0x0020;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0h(X.C166587yw r20, X.C624034w r21, X.AnonymousClass99L r22, java.util.List r23, boolean r24) {
        /*
            r19 = this;
            java.util.ArrayList r5 = X.AnonymousClass001.A0s()
            r18 = 401(0x191, float:5.62E-43)
            r4 = r19
            r3 = r20
            r15 = r21
            if (r20 == 0) goto L_0x0020
            int r1 = r15.A02
            r0 = r18
            if (r1 == r0) goto L_0x01d6
            r0 = 415(0x19f, float:5.82E-43)
            if (r1 == r0) goto L_0x01c9
            r0 = 417(0x1a1, float:5.84E-43)
            if (r1 == r0) goto L_0x01d6
            r0 = 418(0x1a2, float:5.86E-43)
            if (r1 == r0) goto L_0x01d6
        L_0x0020:
            r6 = r22
            X.9W2 r8 = r6.A0G
            X.C626936e.A06(r8)
            X.9WN r7 = r4.A0D
            long r0 = r8.A01
            X.9Vs r9 = r8.A0B
            r3 = 1
            r2 = 0
            boolean r16 = X.AnonymousClass000.A1W(r9)
            java.lang.String r9 = r8.A0E
            boolean r9 = X.AnonymousClass9WN.A02(r9)
            if (r9 == 0) goto L_0x01c3
            X.2sH r12 = r7.A01
            java.lang.String r9 = "Asia/Kolkata"
            java.util.TimeZone r9 = java.util.TimeZone.getTimeZone(r9)
            int r9 = r9.getRawOffset()
            long r9 = (long) r9
            long r0 = r0 - r9
            long r0 = r12.A0I(r0)
            X.33j r11 = r7.A03
            java.lang.String r9 = X.C107505bQ.A06(r11, r0)
            java.lang.String r1 = r8.A0E
            java.lang.String r0 = "DAILY"
            boolean r0 = r1.equals(r0)
            r13 = 1000(0x3e8, double:4.94E-321)
            if (r0 != 0) goto L_0x0192
            java.lang.String r0 = "ASPRESENTED"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x019c
            long r0 = r8.A04
            long r9 = r8.A03
            r16 = 0
            int r13 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r13 <= 0) goto L_0x018a
            int r13 = (r9 > r16 ? 1 : (r9 == r16 ? 0 : -1))
            if (r13 <= 0) goto L_0x0184
            X.2oU r13 = r7.A02
            android.content.Context r13 = r13.A00
            r16 = r13
            r14 = 2131894791(0x7f122207, float:1.9424397E38)
            java.lang.Object[] r13 = X.AnonymousClass002.A0M()
            java.lang.String r0 = X.AnonymousClass9WN.A00(r12, r11, r0)
            r13[r2] = r0
            java.lang.String r1 = X.AnonymousClass9WN.A00(r12, r11, r9)
            r0 = r16
            java.lang.String r10 = X.AnonymousClass002.A0F(r0, r1, r13, r3, r14)
        L_0x0092:
            boolean r0 = android.text.TextUtils.isEmpty(r10)
            if (r0 != 0) goto L_0x00ac
            X.9Fb r9 = new X.9Fb
            r9.<init>()
            X.2oU r0 = r4.A0O
            android.content.Context r1 = r0.A00
            r0 = 2131894803(0x7f122213, float:1.9424421E38)
            A02(r1, r9, r0)
            r9.A03 = r10
            r5.add(r9)
        L_0x00ac:
            java.util.HashSet r9 = X.AnonymousClass002.A0K()
            r0 = 5
            java.lang.Integer[] r11 = new java.lang.Integer[r0]
            r0 = 115(0x73, float:1.61E-43)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r10 = 0
            r11[r2] = r0
            java.lang.Integer r17 = java.lang.Integer.valueOf(r18)
            r11[r3] = r17
            r1 = 2
            r0 = 417(0x1a1, float:5.84E-43)
            X.AnonymousClass000.A1P(r11, r0, r1)
            r0 = 20
            java.lang.Integer r16 = java.lang.Integer.valueOf(r0)
            r0 = 3
            r11[r0] = r16
            r1 = 4
            r0 = 418(0x1a2, float:5.86E-43)
            X.AnonymousClass000.A1P(r11, r0, r1)
            java.util.Collections.addAll(r9, r11)
            int r0 = r15.A02
            boolean r0 = X.C86624Kv.A1a(r9, r0)
            if (r0 == 0) goto L_0x00fc
            X.9Fb r9 = new X.9Fb
            r9.<init>()
            X.2oU r0 = r4.A0O
            android.content.Context r1 = r0.A00
            r0 = 2131894752(0x7f1221e0, float:1.9424318E38)
            A02(r1, r9, r0)
            java.lang.String r0 = r8.A0E
            java.lang.String r0 = r7.A06(r0)
            r9.A03 = r0
            r5.add(r9)
        L_0x00fc:
            int r1 = r15.A02
            r0 = r18
            if (r1 == r0) goto L_0x0152
            r0 = 20
            if (r1 == r0) goto L_0x0152
            java.lang.String r0 = r8.A0E
            boolean r0 = X.AnonymousClass9WN.A02(r0)
            if (r0 == 0) goto L_0x0152
            X.9Fb r12 = new X.9Fb
            r12.<init>()
            X.2oU r0 = r4.A0O
            android.content.Context r11 = r0.A00
            r0 = 2131894822(0x7f122226, float:1.942446E38)
            A02(r11, r12, r0)
            X.2sH r9 = r4.A03
            long r0 = r8.A02
            java.lang.String r13 = "Asia/Kolkata"
            java.util.TimeZone r13 = java.util.TimeZone.getTimeZone(r13)
            int r13 = r13.getRawOffset()
            long r13 = (long) r13
            long r0 = r0 - r13
            long r0 = r9.A0I(r0)
            X.33j r7 = r7.A03
            java.lang.String r0 = X.C107505bQ.A06(r7, r0)
            r12.A03 = r0
            r5.add(r12)
            X.9Fb r12 = new X.9Fb
            r12.<init>()
            r0 = 2131894821(0x7f122225, float:1.9424458E38)
            A02(r11, r12, r0)
            long r0 = r8.A01
            java.lang.String r0 = X.AnonymousClass9WN.A00(r9, r7, r0)
            r12.A03 = r0
            r5.add(r12)
        L_0x0152:
            int r0 = r15.A02
            r4.A0n(r6, r5, r0)
            r4.A0o(r5)
            X.9NZ r0 = r4.A0E()
            if (r0 == 0) goto L_0x0163
            r5.add(r0)
        L_0x0163:
            int r0 = r5.size()
            r7 = r23
            if (r10 >= r0) goto L_0x01f3
            java.lang.Object r0 = r5.get(r10)
            r7.add(r0)
            int r0 = r5.size()
            int r0 = r0 - r3
            if (r10 == r0) goto L_0x0181
            X.9FF r0 = new X.9FF
            r0.<init>()
            r7.add(r0)
        L_0x0181:
            int r10 = r10 + 1
            goto L_0x0163
        L_0x0184:
            java.lang.String r10 = X.AnonymousClass9WN.A00(r12, r11, r0)
            goto L_0x0092
        L_0x018a:
            java.lang.String r0 = "[PAY]IndiaMandateUtils/getPayeeMetadataDueDateDesc next payment date info is unavailable"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r10 = 0
            goto L_0x0092
        L_0x0192:
            if (r16 != 0) goto L_0x01ab
            X.2oU r0 = r7.A02
            android.content.Context r1 = r0.A00
            r0 = 2131894789(0x7f122205, float:1.9424393E38)
            goto L_0x01a5
        L_0x019c:
            if (r16 != 0) goto L_0x01ab
            X.2oU r0 = r7.A02
            android.content.Context r1 = r0.A00
            r0 = 2131894788(0x7f122204, float:1.942439E38)
        L_0x01a5:
            java.lang.String r10 = X.AnonymousClass0x2.A0X(r1, r9, r3, r0)
            goto L_0x0092
        L_0x01ab:
            X.2oU r0 = r7.A02
            android.content.Context r12 = r0.A00
            r10 = 2131894790(0x7f122206, float:1.9424395E38)
            java.lang.Object[] r9 = new java.lang.Object[r3]
            X.9Vs r0 = r8.A0B
            long r0 = r0.A00
            long r0 = r0 / r13
            java.lang.String r0 = X.C107505bQ.A06(r11, r0)
            java.lang.String r10 = X.AnonymousClass002.A0F(r12, r0, r9, r2, r10)
            goto L_0x0092
        L_0x01c3:
            java.lang.String r10 = r7.A04(r0)
            goto L_0x0092
        L_0x01c9:
            X.9Fb r2 = new X.9Fb
            r2.<init>()
            X.2oU r0 = r4.A0O
            android.content.Context r1 = r0.A00
            r0 = 2131894433(0x7f1220a1, float:1.942367E38)
            goto L_0x01e2
        L_0x01d6:
            X.9Fb r2 = new X.9Fb
            r2.<init>()
            X.2oU r0 = r4.A0O
            android.content.Context r1 = r0.A00
            r0 = 2131894434(0x7f1220a2, float:1.9423673E38)
        L_0x01e2:
            A02(r1, r2, r0)
            X.7kX r1 = r4.A0i
            r0 = 1
            java.lang.String r0 = r1.A02(r3, r0)
            r2.A03 = r0
            r5.add(r2)
            goto L_0x0020
        L_0x01f3:
            if (r24 == 0) goto L_0x025a
            int r5 = r15.A02
            X.9W2 r0 = r6.A0G
            if (r0 == 0) goto L_0x025a
            java.lang.String r0 = r0.A0E
            boolean r0 = X.AnonymousClass9WN.A02(r0)
            if (r0 == 0) goto L_0x025a
            java.util.HashSet r1 = X.AnonymousClass002.A0K()
            r0 = 2
            java.lang.Integer[] r0 = new java.lang.Integer[r0]
            r0[r2] = r17
            r0[r3] = r16
            java.util.Collections.addAll(r1, r0)
            boolean r0 = X.C86624Kv.A1a(r1, r5)
            if (r0 != 0) goto L_0x025a
            X.AnonymousClass94y.A01(r7)
            X.9F7 r5 = new X.9F7
            r5.<init>()
            X.9W2 r0 = r6.A0G
            int r0 = r0.A00
            if (r0 <= 0) goto L_0x0238
            X.33j r0 = r4.A0P
            java.util.Locale r3 = r0.A0O()
            X.9W2 r0 = r6.A0G
            int r0 = r0.A00
            java.lang.String r1 = java.lang.Integer.toString(r0)
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.String.format(r3, r1, r0)
        L_0x0238:
            X.33j r0 = r4.A0P
            java.util.Locale r3 = r0.A0O()
            X.9W2 r0 = r6.A0G
            X.9V3[] r0 = r0.A0P
            if (r0 != 0) goto L_0x025b
            r0 = 0
        L_0x0245:
            java.lang.String r1 = java.lang.Integer.toString(r0)
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.String.format(r3, r1, r0)
            r1 = 29
            X.9pJ r0 = new X.9pJ
            r0.<init>((java.lang.Object) r6, (int) r1, (java.lang.Object) r4)
            r5.A00 = r0
            r7.add(r5)
        L_0x025a:
            return
        L_0x025b:
            int r0 = r0.length
            goto L_0x0245
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C191669Fv.A0h(X.7yw, X.34w, X.99L, java.util.List, boolean):void");
    }
}
