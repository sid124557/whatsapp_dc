package X;

import android.net.Uri;
import android.text.TextUtils;
import com.whatsapp.R;
import com.whatsapp.payments.ui.viewmodel.IndiaPaymentSettingsViewModel;
import com.whatsapp.util.Log;
import java.math.BigDecimal;
import java.util.List;

/* renamed from: X.94t  reason: invalid class name and case insensitive filesystem */
public abstract class C1902394t extends C05550Ty {
    public AnonymousClass08M A00 = AnonymousClass08M.A01();
    public AnonymousClass08M A01 = AnonymousClass08M.A01();
    public List A02;
    public List A03;
    public List A04;
    public final C56612sH A05;
    public final C620733j A06;
    public final AnonymousClass36Y A07;
    public final AnonymousClass1VX A08;
    public final C620933l A09;
    public final AnonymousClass9U4 A0A;
    public final C203499no A0B;

    public static AnonymousClass9WK A00(int i) {
        Object[] objArr = new Object[0];
        int i2 = 0;
        if (i == 0) {
            i2 = 8;
        }
        return new AnonymousClass9WK((String) null, objArr, i, i2);
    }

    public static void A01(AnonymousClass9VG r6, C1902394t r7, int i) {
        AnonymousClass9Wg.A02(AnonymousClass9Wg.A00(r7.A05, (AnonymousClass39Q) null, r6, (String) null, false), r7.A0B, Integer.valueOf(i), "payment_home", (String) null, 1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002b, code lost:
        if (r6 == 0) goto L_0x002d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass9W0 A0E() {
        /*
            r14 = this;
            r3 = r14
            X.9Fn r3 = (X.C191599Fn) r3
            r11 = 0
            int r6 = r3.A0O(r11)
            r0 = 1
            r5 = 0
            if (r6 == r0) goto L_0x006d
            r0 = 2
            if (r6 == r0) goto L_0x0066
            r0 = 3
            if (r6 == r0) goto L_0x0057
            java.lang.String r0 = "PAY: BrazilPaymentSettingsViewModel/generateDefaultBannerConfiguration/ default NUX stage = NONE"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r2 = 0
            r4 = 0
        L_0x0019:
            r9 = 2131432226(0x7f0b1322, float:1.8486203E38)
            X.33l r0 = r3.A09
            android.content.SharedPreferences r1 = r0.A03()
            java.lang.String r0 = "payment_brazil_nux_dismissed"
            boolean r0 = r1.getBoolean(r0, r11)
            if (r0 != 0) goto L_0x002d
            r10 = 0
            if (r6 != 0) goto L_0x002f
        L_0x002d:
            r10 = 8
        L_0x002f:
            X.9WK r6 = A00(r4)
            X.9WK r7 = X.AnonymousClass9WK.A05
            java.lang.Object[] r0 = new java.lang.Object[r11]
            X.9WK r8 = new X.9WK
            r8.<init>(r5, r0, r2, r11)
            r2 = 2131102007(0x7f060937, float:1.781644E38)
            r1 = 2131230995(0x7f080113, float:1.8078059E38)
            r0 = 2131167672(0x7f0709b8, float:1.7949624E38)
            X.9VI r4 = new X.9VI
            r4.<init>(r2, r1, r0, r0)
            X.9pD r5 = new X.9pD
            r5.<init>(r3, r11)
            X.9W0 r3 = new X.9W0
            r13 = r11
            r12 = r11
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return r3
        L_0x0057:
            r2 = 2131891368(0x7f1214a8, float:1.9417454E38)
            r4 = 2131891361(0x7f1214a1, float:1.941744E38)
            X.5X8 r1 = r3.A02
            java.lang.String r0 = "https://faq.whatsapp.com/1085240205511877"
            java.lang.String r5 = X.C1899693i.A0c(r1, r0)
            goto L_0x0019
        L_0x0066:
            r2 = 2131891369(0x7f1214a9, float:1.9417456E38)
            r4 = 2131891362(0x7f1214a2, float:1.9417442E38)
            goto L_0x0019
        L_0x006d:
            r2 = 2131891367(0x7f1214a7, float:1.9417452E38)
            r4 = 2131891360(0x7f1214a0, float:1.9417438E38)
            goto L_0x0019
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1902394t.A0E():X.9W0");
    }

    public void A0K(AnonymousClass9VG r7, Integer num, String str) {
        AnonymousClass9Wg.A02(AnonymousClass9Wg.A00(this.A05, (AnonymousClass39Q) null, r7, str, false), this.A0B, num, "payment_home", (String) null, 1);
    }

    public void A0L(AnonymousClass9VG r7, Integer num, String str) {
        AnonymousClass9Wg.A02(AnonymousClass9Wg.A00(this.A05, (AnonymousClass39Q) null, r7, str, false), this.A0B, num, "payment_home", (String) null, 1);
    }

    public C203219nJ A0D() {
        if (this instanceof C191599Fn) {
            return new C204349pD(this, 0);
        }
        return null;
    }

    public AnonymousClass9W0 A0F(AnonymousClass9VG r20, int i) {
        int i2;
        AnonymousClass9WK r12;
        AnonymousClass9WK r13;
        int i3;
        int i4;
        C194869Uu r4 = r20.A01;
        if (r4 == null) {
            Log.e("PAY: PaymentSettingsViewModel/getIncentiveBannerConfig/offerInfo is NULL");
            return null;
        }
        C194659Tz A052 = AnonymousClass9U4.A05(this.A0A);
        AnonymousClass9WK r11 = AnonymousClass9WK.A05;
        if (i == 2) {
            C626936e.A06(r4);
            AnonymousClass39L r9 = r4.A07;
            int A002 = r9.A00() / r9.A00;
            if (A052 != null) {
                boolean z = A052 instanceof C1907499r;
                if (z) {
                    i3 = R.string.f11nameremoved;
                } else {
                    i3 = R.string.f11nameremoved;
                }
                r12 = A00(i3);
                if (z) {
                    i4 = R.string.f11nameremoved;
                } else {
                    i4 = R.string.f11nameremoved;
                }
                Object[] objArr = new Object[2];
                long j = r4.A05;
                AnonymousClass000.A1Q(objArr, 0, j);
                objArr[1] = r9.A01.B3W(this.A06, new BigDecimal(((long) A002) * j));
                r13 = new AnonymousClass9WK((String) null, objArr, i4, 0);
            } else {
                r12 = r11;
                r13 = r11;
            }
            return new AnonymousClass9W0(new AnonymousClass9VI(-1, R.drawable.ic_incentive_main, R.dimen.f6nameremoved, R.dimen.f6nameremoved), new AnonymousClass9dR(this, r4.A08.A01), r11, r12, r13, R.id.payment_incentive_nux_view, 0, 8, 0, 1);
        }
        if (A052 != null) {
            boolean z2 = A052 instanceof C1907499r;
            if (!A0N()) {
                if (z2) {
                    i2 = R.string.f11nameremoved;
                } else {
                    i2 = R.string.f11nameremoved;
                }
            } else if (z2) {
                i2 = R.string.f11nameremoved;
            } else {
                i2 = R.string.f11nameremoved;
            }
            r11 = A00(i2);
        }
        C626936e.A06(r4);
        return new AnonymousClass9W0(new AnonymousClass9VI(-1, R.drawable.ic_incentive_main, R.dimen.f6nameremoved, R.dimen.f6nameremoved), new AnonymousClass9dR(this, r4.A08.A01), r11, new AnonymousClass9WK(r4.A0F), new AnonymousClass9WK(r4.A0C, new Object[]{r4.A0B, "learn-more"}, R.string.f11nameremoved, 0), R.id.payment_incentive_nux_view, 0, 0, 8, 1);
    }

    public void A0G(int i, int i2) {
        boolean z;
        C203499no r5 = this.A0B;
        C134246ig B0d = r5.B0d();
        C1899593h.A1B(B0d, i);
        if (i2 >= 0) {
            B0d.A07 = Integer.valueOf(i2);
        }
        B0d.A0b = "payment_home";
        Object[] A0M = AnonymousClass002.A0M();
        A0M[0] = "payment_home";
        A0M[1] = "notify_verification_banner";
        AnonymousClass303 A0Q = C1899693i.A0Q(B0d, "notify_verification_banner", A0M);
        if (this instanceof C191599Fn) {
            z = C18320x8.A1U(((C191599Fn) this).A01);
        } else {
            z = false;
        }
        A0Q.A04("isPushProvisioning", z);
        B0d.A0Z = A0Q.toString();
        r5.BKA(B0d);
    }

    public void A0H(int i, String str) {
        boolean z;
        C203499no r5 = this.A0B;
        C134246ig B0d = r5.B0d();
        C1899593h.A1B(B0d, i);
        B0d.A0b = "payment_home";
        Object[] A0M = AnonymousClass002.A0M();
        C18280x3.A19("payment_home", str, A0M);
        AnonymousClass303 A0Q = C1899693i.A0Q(B0d, str, A0M);
        if (this instanceof C191599Fn) {
            z = C18320x8.A1U(((C191599Fn) this).A01);
        } else {
            z = false;
        }
        A0Q.A04("isPushProvisioning", z);
        B0d.A0Z = A0Q.toString();
        r5.BKA(B0d);
    }

    public void A0I(Uri uri, AnonymousClass9VG r11, String str, String str2) {
        boolean z;
        AnonymousClass303 r1;
        if (this instanceof IndiaPaymentSettingsViewModel) {
            IndiaPaymentSettingsViewModel indiaPaymentSettingsViewModel = (IndiaPaymentSettingsViewModel) this;
            C203499no r6 = indiaPaymentSettingsViewModel.A0B;
            if (!(r6 instanceof C197109ca)) {
                return;
            }
            if ("notify_verification_banner".equals(str2)) {
                indiaPaymentSettingsViewModel.A0G(0, -1);
            } else if ("recovery_upin_upsell_banner".equals(str2) || "recovery_2fa_upsell_banner".equals(str2)) {
                indiaPaymentSettingsViewModel.A0H(0, str2);
            } else {
                AnonymousClass303 A002 = AnonymousClass9Wg.A00(indiaPaymentSettingsViewModel.A05, (AnonymousClass39Q) null, r11, str2, false);
                C197109ca r62 = (C197109ca) r6;
                boolean A0P = indiaPaymentSettingsViewModel.A0P();
                if (uri != null) {
                    try {
                        String queryParameter = uri.getQueryParameter("campaignID");
                        if (!TextUtils.isEmpty(queryParameter)) {
                            if (A002 != null) {
                                r1 = A002;
                            } else {
                                r1 = new AnonymousClass303((String) null, new AnonymousClass303[0]);
                            }
                            r1.A03("campaign_id", queryParameter);
                            C197109ca.A02(r62.A05(0, (Integer) null, "payment_home", str), r1, r62, A0P);
                        }
                    } catch (Exception unused) {
                    }
                }
                r1 = A002;
                C197109ca.A02(r62.A05(0, (Integer) null, "payment_home", str), r1, r62, A0P);
            }
        } else {
            AnonymousClass303 A003 = AnonymousClass9Wg.A00(this.A05, (AnonymousClass39Q) null, r11, str2, false);
            if (A003 == null) {
                A003 = new AnonymousClass303((String) null, new AnonymousClass303[0]);
            }
            if (this instanceof C191599Fn) {
                z = C18320x8.A1U(((C191599Fn) this).A01);
            } else {
                z = false;
            }
            A003.A04("isPushProvisioning", z);
            AnonymousClass9Wg.A03(A003, this.A0B, "payment_home", str);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0058, code lost:
        if (r0.A08.A01 == X.AnonymousClass0x2.A0A(r6.A09.A03(), "payment_incentive_offer_dismissed")) goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0078, code lost:
        if (((long) (r2.A01 + r2.A00)) < r7.A01.A05) goto L_0x005a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0J(X.AnonymousClass9VG r7, X.AnonymousClass9W0 r8) {
        /*
            r6 = this;
            if (r8 == 0) goto L_0x001f
            if (r7 == 0) goto L_0x001f
            int r1 = r8.A01
            r0 = 1
            if (r1 != r0) goto L_0x005a
            X.2sH r0 = r6.A05
            long r0 = X.C56612sH.A00(r0)
            int r0 = r7.A00(r0)
            X.9W0 r1 = r6.A0F(r7, r0)
            if (r1 == 0) goto L_0x001e
            X.08M r0 = r6.A01
            r0.A0G(r1)
        L_0x001e:
            return
        L_0x001f:
            X.9U4 r0 = r6.A0A
            X.9Tz r0 = X.AnonymousClass9U4.A05(r0)
            if (r7 == 0) goto L_0x005a
            if (r0 == 0) goto L_0x005a
            X.1VX r0 = r0.A07
            boolean r0 = X.C1899693i.A0w(r0)
            if (r0 == 0) goto L_0x005a
            X.2sH r0 = r6.A05
            long r0 = X.C56612sH.A00(r0)
            int r5 = r7.A00(r0)
            r0 = 1
            if (r5 == r0) goto L_0x0064
            r0 = 2
            if (r5 != r0) goto L_0x005a
            X.9Uu r0 = r7.A01
            X.C626936e.A06(r0)
            X.2xk r0 = r0.A08
            long r3 = r0.A01
            X.33l r0 = r6.A09
            android.content.SharedPreferences r1 = r0.A03()
            java.lang.String r0 = "payment_incentive_offer_dismissed"
            long r1 = X.AnonymousClass0x2.A0A(r1, r0)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x007a
        L_0x005a:
            X.08M r1 = r6.A01
            X.9W0 r0 = r6.A0E()
        L_0x0060:
            r1.A0G(r0)
            return
        L_0x0064:
            X.9Ur r2 = r7.A02
            if (r2 == 0) goto L_0x007a
            boolean r0 = r2.A04
            if (r0 != 0) goto L_0x007a
            int r1 = r2.A01
            int r0 = r2.A00
            int r1 = r1 + r0
            long r3 = (long) r1
            X.9Uu r0 = r7.A01
            long r1 = r0.A05
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x005a
        L_0x007a:
            X.08M r1 = r6.A01
            X.9W0 r0 = r6.A0F(r7, r5)
            goto L_0x0060
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1902394t.A0J(X.9VG, X.9W0):void");
    }

    public boolean A0N() {
        if (this instanceof IndiaPaymentSettingsViewModel) {
            return ((IndiaPaymentSettingsViewModel) this).A06.A0C();
        }
        if (!(this instanceof C191599Fn)) {
            return false;
        }
        C191599Fn r1 = (C191599Fn) this;
        if (!r1.A03.A05.A03() || AnonymousClass9U4.A08(r1.A0A).isEmpty()) {
            return false;
        }
        return true;
    }

    public C1902394t(C56612sH r2, C620733j r3, AnonymousClass36Y r4, AnonymousClass1VX r5, C620933l r6, AnonymousClass9U4 r7, C203499no r8) {
        this.A05 = r2;
        this.A08 = r5;
        this.A06 = r3;
        this.A07 = r4;
        this.A0A = r7;
        this.A09 = r6;
        this.A0B = r8;
        this.A04 = AnonymousClass001.A0s();
        this.A02 = AnonymousClass001.A0s();
        this.A03 = AnonymousClass001.A0s();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0027, code lost:
        if ("api.whatsapp.com".equals(r1) != false) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0M(java.lang.String r4) {
        /*
            r3 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L_0x0032
            android.net.Uri r1 = android.net.Uri.parse(r4)
            java.util.List r0 = r1.getPathSegments()
            int r2 = r0.size()
            java.lang.String r0 = r1.getScheme()
            java.lang.String r1 = r1.getHost()
            boolean r0 = X.AnonymousClass36Y.A0A(r0, r1)
            if (r0 != 0) goto L_0x0029
            java.lang.String r0 = "api.whatsapp.com"
            boolean r1 = r0.equals(r1)
            r0 = 0
            if (r1 == 0) goto L_0x002a
        L_0x0029:
            r0 = 1
        L_0x002a:
            if (r2 <= r0) goto L_0x0032
            X.08M r1 = r3.A00
            r0 = 1
            X.C06270Wx.A04(r1, r0)
        L_0x0032:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1902394t.A0M(java.lang.String):void");
    }
}
