package X;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.whatsapp.R;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.payments.ui.IndiaUpiChangePinActivity;
import com.whatsapp.payments.ui.IndiaUpiCheckBalanceActivity;
import com.whatsapp.payments.ui.IndiaUpiMandatePaymentActivity;
import com.whatsapp.payments.ui.IndiaUpiPauseMandateActivity;
import com.whatsapp.payments.ui.IndiaUpiSendPaymentActivity;
import com.whatsapp.payments.ui.IndiaUpiStepUpActivity;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: X.9D8  reason: invalid class name */
public abstract class AnonymousClass9D8 extends AnonymousClass9D9 implements C203049n2, C182818p2 {
    public int A00;
    public C620733j A01;
    public C196719bd A02;
    public C203309nU A03 = new AnonymousClass9bG(this);
    public AnonymousClass9S0 A04;
    public C153607bd A05;
    public C385127z A06;
    public C194389Sr A07;
    public AnonymousClass9AG A08;
    public AnonymousClass9AL A09;
    public AnonymousClass9TZ A0A;
    public C115115o9 A0B;
    public C171678Hz A0C;
    public C46092b4 A0D;
    public C194259Se A0E;
    public String A0F;
    public String A0G;
    public boolean A0H;
    public boolean A0I;
    public final C160757oG A0J = C160757oG.A00("IndiaUpiPinHandlerActivity", "payment-settings", "IN");

    public static AnonymousClass9VW A15(C196719bd r1, C153607bd r2, AnonymousClass9DA r3) {
        AnonymousClass9VW A042 = r1.A04(r2, 0);
        r3.A7I();
        if (A042.A00 == 0) {
            A042.A00 = R.string.f11nameremoved;
        }
        return A042;
    }

    public void A7g(AnonymousClass99H r9, String str, String str2, String str3, String str4, int i) {
        A7h(r9, str, str2, str3, str4, i, false);
    }

    public Dialog A7V(C133686hm r10, int i) {
        if (i == 11) {
            return A7W(new C200409iH(r10, this), getString(R.string.f11nameremoved), 11, R.string.f11nameremoved, R.string.f11nameremoved);
        } else if (i != 28) {
            return super.onCreateDialog(i);
        } else {
            C19340zH A002 = AnonymousClass5V0.A00(this);
            A002.A0T(R.string.f11nameremoved);
            C204219p0.A01(A002, this, 56, R.string.f11nameremoved);
            return A002.create();
        }
    }

    public Dialog A7W(Runnable runnable, String str, int i, int i2, int i3) {
        C160757oG r2 = this.A0J;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("IndiaUpiPinHandlerActivity showMessageDialog id:");
        A0o.append(i);
        A0o.append(" message:");
        C1899593h.A1J(r2, str, A0o);
        C19340zH A002 = AnonymousClass5V0.A00(this);
        A002.A0g(str);
        A002.A0Y(new C204309p9(runnable, this, i, 0), i2);
        A002.A0W(new C204429pL(this, i, 0), i3);
        A002.A0i(true);
        A002.A0V(new C204239p2(this, i, 0));
        return A002.create();
    }

    public Dialog A7X(Runnable runnable, String str, String str2, int i, int i2, int i3) {
        C160757oG r2 = this.A0J;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("IndiaUpiPinHandlerActivity showMessageDialog id:");
        A0o.append(i);
        A0o.append(" message:");
        A0o.append(str2);
        A0o.append("title: ");
        C1899593h.A1J(r2, str, A0o);
        C19340zH A002 = AnonymousClass5V0.A00(this);
        A002.A0g(str2);
        A002.A0h(str);
        A002.A0Y(new C204309p9(runnable, this, i, 1), i2);
        A002.A0W(new C204429pL(this, i, 1), i3);
        A002.A0i(true);
        A002.A0V(new C204239p2(this, i, 1));
        return A002.create();
    }

    public void A7Y() {
        AnonymousClass9S0 r2 = this.A04;
        if (r2 != null) {
            C46092b4 r1 = this.A0D;
            if (r1.A00 == null) {
                r1.A00(new C197259cp(this));
            } else {
                r2.A00();
            }
        } else {
            C18270x1.A0w(new AnonymousClass9GT(this, true), this.A04);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001e, code lost:
        if ((r1 instanceof com.whatsapp.payments.ui.IndiaUpiCheckBalanceActivity) == false) goto L_0x000e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A7Z() {
        /*
            r1 = this;
            boolean r0 = r1 instanceof com.whatsapp.payments.ui.IndiaUpiStepUpActivity
            if (r0 != 0) goto L_0x0013
            boolean r0 = r1 instanceof X.AnonymousClass9Bs
            if (r0 == 0) goto L_0x0014
            r0 = 0
            r1.A0H = r0
        L_0x000b:
            r1.BjL()
        L_0x000e:
            r0 = 19
            X.C621433s.A01(r1, r0)
        L_0x0013:
            return
        L_0x0014:
            boolean r0 = r1 instanceof com.whatsapp.payments.ui.IndiaUpiPauseMandateActivity
            if (r0 != 0) goto L_0x000b
            boolean r0 = r1 instanceof com.whatsapp.payments.ui.IndiaUpiMandatePaymentActivity
            if (r0 != 0) goto L_0x000b
            boolean r0 = r1 instanceof com.whatsapp.payments.ui.IndiaUpiCheckBalanceActivity
            if (r0 == 0) goto L_0x000e
            goto L_0x000b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9D8.A7Z():void");
    }

    public void A7b() {
        if (this instanceof IndiaUpiStepUpActivity) {
            C18270x1.A0t(AnonymousClass9VW.A00(this, A15(this.A02, this.A05, this)), this);
        } else if (this instanceof AnonymousClass9Bs) {
            AnonymousClass9Bs r2 = (AnonymousClass9Bs) this;
            r2.A85(new AnonymousClass34V(C196719bd.A00(r2.A05, 0)));
        } else if (this instanceof IndiaUpiPauseMandateActivity) {
            AnonymousClass9VW A15 = A15(this.A02, this.A05, this);
            overridePendingTransition(0, 0);
            C18270x1.A0t(AnonymousClass9VW.A00(this, A15), this);
        } else if (this instanceof IndiaUpiMandatePaymentActivity) {
            AnonymousClass9VW A152 = A15(this.A02, this.A05, this);
            overridePendingTransition(0, 0);
            C18270x1.A0t(AnonymousClass9VW.A00(this, A152), this);
        } else if (this instanceof IndiaUpiCheckBalanceActivity) {
            C18270x1.A0t(AnonymousClass9VW.A00(this, A15(this.A02, this.A05, this)), this);
        } else if (this instanceof IndiaUpiChangePinActivity) {
            AnonymousClass9VW A042 = this.A02.A04(this.A05, 0);
            A7I();
            if (A042.A00 == 0) {
                A042.A00 = R.string.f11nameremoved;
            }
            Bou(A042.A02(this));
        } else {
            C191129Co r3 = (C191129Co) this;
            r3.A7l(r3.A02.A04(r3.A05, 0));
        }
    }

    public void A7c() {
        String str;
        UserJid userJid;
        AnonymousClass3ZH A012;
        UserJid userJid2;
        if (!(this instanceof IndiaUpiStepUpActivity) && !(this instanceof IndiaUpiPauseMandateActivity) && !(this instanceof IndiaUpiMandatePaymentActivity)) {
            if (this instanceof IndiaUpiSendPaymentActivity) {
                IndiaUpiSendPaymentActivity indiaUpiSendPaymentActivity = (IndiaUpiSendPaymentActivity) this;
                C95814uZ r1 = indiaUpiSendPaymentActivity.A0E;
                if (C627336j.A0K(r1)) {
                    userJid = indiaUpiSendPaymentActivity.A0G;
                    if (userJid == null) {
                        indiaUpiSendPaymentActivity.A78(C86614Ku.A0D(indiaUpiSendPaymentActivity));
                        return;
                    }
                } else {
                    userJid = AnonymousClass32Y.A03(r1);
                }
                indiaUpiSendPaymentActivity.A0E = userJid;
                if (indiaUpiSendPaymentActivity.A7T()) {
                    A012 = null;
                } else {
                    A012 = indiaUpiSendPaymentActivity.A07.A01(indiaUpiSendPaymentActivity.A0E);
                }
                indiaUpiSendPaymentActivity.A08 = A012;
                boolean z = false;
                if (C161527pr.A02(indiaUpiSendPaymentActivity.A0I) && indiaUpiSendPaymentActivity.A0E != null) {
                    C191929Gz r12 = new C191929Gz(indiaUpiSendPaymentActivity, true);
                    indiaUpiSendPaymentActivity.A0B = r12;
                    AnonymousClass0x7.A1B(r12, indiaUpiSendPaymentActivity.A04);
                    indiaUpiSendPaymentActivity.Bp9(R.string.f11nameremoved);
                } else if ((C161527pr.A02(indiaUpiSendPaymentActivity.A0I) || !indiaUpiSendPaymentActivity.A04.A07(indiaUpiSendPaymentActivity.A0I)) && ((userJid2 = indiaUpiSendPaymentActivity.A0E) == null || !indiaUpiSendPaymentActivity.A02.A0P(AnonymousClass32Y.A03(userJid2)))) {
                    indiaUpiSendPaymentActivity.A8K();
                } else {
                    indiaUpiSendPaymentActivity.A06.A00(indiaUpiSendPaymentActivity, new C204099oo(indiaUpiSendPaymentActivity, 1), indiaUpiSendPaymentActivity.A0E, indiaUpiSendPaymentActivity.A0I, true, false);
                }
                if (indiaUpiSendPaymentActivity.A0F == null && AnonymousClass97T.A12(indiaUpiSendPaymentActivity)) {
                    boolean A7T = indiaUpiSendPaymentActivity.A7T();
                    if (indiaUpiSendPaymentActivity.A0X != null) {
                        z = true;
                    }
                    if (A7T && !z) {
                        indiaUpiSendPaymentActivity.A04.BkP(new C199429gZ(indiaUpiSendPaymentActivity));
                    }
                }
            } else if (!(this instanceof AnonymousClass9Ct) && !(this instanceof IndiaUpiCheckBalanceActivity)) {
                if (this instanceof IndiaUpiChangePinActivity) {
                    IndiaUpiChangePinActivity indiaUpiChangePinActivity = (IndiaUpiChangePinActivity) this;
                    if (!indiaUpiChangePinActivity.A05.A07.contains("pin-entry-ui")) {
                        if (!(indiaUpiChangePinActivity.getIntent() == null || C86614Ku.A0D(indiaUpiChangePinActivity) == null)) {
                            indiaUpiChangePinActivity.A02 = (C133686hm) C86614Ku.A0D(indiaUpiChangePinActivity).get("extra_bank_account");
                        }
                        if (indiaUpiChangePinActivity.A02 == null) {
                            C18270x1.A0w(new AnonymousClass9GL(indiaUpiChangePinActivity), indiaUpiChangePinActivity.A04);
                            return;
                        }
                        indiaUpiChangePinActivity.A05.A01("pin-entry-ui");
                        if (indiaUpiChangePinActivity.A02 != null) {
                            AnonymousClass97T.A10(indiaUpiChangePinActivity);
                            return;
                        }
                        indiaUpiChangePinActivity.A05.A06("could not find bank account; showErrorAndFinish");
                        indiaUpiChangePinActivity.A7b();
                        return;
                    }
                    return;
                }
                C191129Co r3 = (C191129Co) this;
                if (!r3.A05.A07.contains("pin-entry-ui")) {
                    C160757oG r2 = r3.A04;
                    StringBuilder A0o = AnonymousClass001.A0o();
                    A0o.append("showMainPaneAfterPayAppRegistered: bankAccount: ");
                    A0o.append(r3.A00);
                    A0o.append(" inSetup: ");
                    C1899593h.A1L(r2, A0o, r3.A0k);
                    r3.A05.A01("pin-entry-ui");
                    C133686hm r0 = r3.A00;
                    if (r0 != null) {
                        AnonymousClass99H r13 = (AnonymousClass99H) r0.A08;
                        if (r13 == null) {
                            str = "could not find bank info to reset pin";
                        } else if (!r3.A0k || !AnonymousClass99H.A00(r13)) {
                            r3.A7e();
                            return;
                        } else {
                            r2.A06("showOrCheckPin insetup and upi pin already set; showSuccessAndFinish");
                            r3.A0I.A09("2fa");
                            r3.BjL();
                            r3.A7H();
                            Intent A072 = C18320x8.A07();
                            A072.putExtra("extra_bank_account", r3.A00);
                            AnonymousClass0x2.A0m(r3, A072);
                            return;
                        }
                    } else {
                        str = "could not find bank account";
                    }
                    r2.A06(str);
                    r3.A7b();
                }
            }
        }
    }

    public void A7d() {
        int i;
        if (!(this instanceof IndiaUpiStepUpActivity)) {
            if (this instanceof AnonymousClass9Bs) {
                i = R.string.f11nameremoved;
            } else if (!(this instanceof IndiaUpiPauseMandateActivity) && !(this instanceof IndiaUpiMandatePaymentActivity) && !(this instanceof IndiaUpiCheckBalanceActivity)) {
                if (this instanceof IndiaUpiChangePinActivity) {
                    ((IndiaUpiChangePinActivity) this).A01.setText(R.string.f11nameremoved);
                    return;
                }
                i = R.string.f11nameremoved;
            } else {
                return;
            }
            Bp9(i);
        }
    }

    public void A7e() {
        int i = this.A00;
        if (i < 3) {
            AnonymousClass9AL r0 = this.A09;
            if (r0 != null) {
                r0.A00();
                return;
            }
            return;
        }
        C160757oG r2 = this.A0J;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("startShowPinFlow at count: ");
        A0o.append(i);
        A0o.append(" max: ");
        A0o.append(3);
        C1899593h.A1J(r2, "; showErrorAndFinish", A0o);
        A7b();
    }

    public void A7h(AnonymousClass99H r17, String str, String str2, String str3, String str4, int i, boolean z) {
        String str5;
        C160757oG r1 = this.A0J;
        r1.A06("getCredentials for pin setup called.");
        int i2 = i;
        AnonymousClass99H r3 = r17;
        if (r17 != null) {
            str5 = this.A0C.B6E(r3, i2, z);
        } else {
            str5 = null;
        }
        C166557yt A052 = this.A0M.A05();
        String str6 = str;
        if (TextUtils.isEmpty(str6) || TextUtils.isEmpty(str5) || A052.A00 == null) {
            r1.A06("getCredentials for set got empty xml or controls or token");
            A7Z();
            return;
        }
        this.A0C.Bpn(this, A052, new C197139cd(this), str6, str2, str3, str4, str5, this.A0g, this.A0d, this.A0G, i2);
    }

    public void A7i(HashMap hashMap) {
        String str;
        HashMap hashMap2 = hashMap;
        if (this instanceof IndiaUpiStepUpActivity) {
            IndiaUpiStepUpActivity indiaUpiStepUpActivity = (IndiaUpiStepUpActivity) this;
            indiaUpiStepUpActivity.A07.A06("onGetCredentials called");
            AnonymousClass94g r5 = indiaUpiStepUpActivity.A04;
            AnonymousClass08M r3 = r5.A00;
            AnonymousClass9OX.A00(r5.A04.A00, r3, R.string.f11nameremoved);
            C133686hm r2 = r5.A05;
            AnonymousClass99H r4 = (AnonymousClass99H) r2.A08;
            if (r4 == null) {
                AnonymousClass9OX.A01(r3);
                r5.A02.A0H(new AnonymousClass9Q3(2));
                return;
            }
            ArrayList A0s = AnonymousClass001.A0s();
            AnonymousClass39V.A03("vpa", C166557yt.A00(r4.A09), A0s);
            if (!TextUtils.isEmpty(r4.A0F)) {
                AnonymousClass39V.A03("vpa-id", r4.A0F, A0s);
            }
            AnonymousClass39V.A03("seq-no", r5.A03, A0s);
            AnonymousClass39V.A03("upi-bank-info", (String) C1899593h.A0X(r4.A06), A0s);
            AnonymousClass39V.A03("device-id", r5.A09.A01(), A0s);
            AnonymousClass39V.A03("credential-id", r2.A0A, A0s);
            AnonymousClass39V.A03("mpin", r5.A01.A06("MPIN", hashMap2, 3), A0s);
            AnonymousClass36K A0I2 = AnonymousClass36K.A0I("mpin", C18300x5.A1Z(A0s, 0));
            r5.A08.A00(new AnonymousClass9cN(r5), r5.A06.A04(), A0I2, (String) null);
        } else if (this instanceof AnonymousClass9Bs) {
            AnonymousClass9Bs r22 = (AnonymousClass9Bs) this;
            if (r22.A0B != null) {
                r22.A0L.A08 = hashMap2;
                r22.A7u();
                r22.BjL();
                r22.Bp9(R.string.f11nameremoved);
                if (r22.A8D()) {
                    r22.A0Y = true;
                    if (r22.A0a) {
                        Intent A7k = r22.A7k();
                        r22.finish();
                        r22.startActivity(A7k);
                        return;
                    } else if (r22.A0b) {
                        return;
                    }
                }
                r22.A89(r22.A7m(r22.A09, r22.A01), false);
            }
        } else if (this instanceof IndiaUpiCheckBalanceActivity) {
            IndiaUpiCheckBalanceActivity indiaUpiCheckBalanceActivity = (IndiaUpiCheckBalanceActivity) this;
            indiaUpiCheckBalanceActivity.A06.A06("onGetCredentials called");
            C1901594f r7 = indiaUpiCheckBalanceActivity.A04;
            AnonymousClass9OX.A00(r7.A02.A00, r7.A01, R.string.f11nameremoved);
            C133686hm r1 = r7.A04;
            AnonymousClass99H r0 = (AnonymousClass99H) r1.A08;
            AnonymousClass9AK r13 = r7.A05;
            C166557yt r52 = r0.A09;
            String str2 = r0.A0F;
            C166557yt r42 = r0.A06;
            C166557yt r32 = r7.A00;
            String str3 = r1.A0A;
            AnonymousClass9Qo r14 = new AnonymousClass9Qo(r7);
            AnonymousClass31C r15 = r13.A04;
            String A032 = r15.A03();
            if (hashMap != null) {
                str = r13.A00.A06("MPIN", hashMap2, 4);
            } else {
                str = null;
            }
            String A0e = C1899693i.A0e(r32);
            String str4 = r13.A08;
            String A0e2 = C1899693i.A0e(r52);
            String A002 = C166557yt.A00(r42);
            C35371wl A0X = C1899693i.A0X(A032);
            C56052rL A012 = C56052rL.A01();
            C1899593h.A1M(A012);
            C56052rL A0U = C1899593h.A0U();
            C56052rL.A0D(A0U, "action", "upi-check-balance");
            if (C1899593h.A1a(str3, false)) {
                C56052rL.A0D(A0U, "credential-id", str3);
            }
            if (C626836d.A0M(A0e, 35, 35, false)) {
                C56052rL.A0D(A0U, "seq-no", A0e);
            }
            C1899593h.A1O(A0U, str4, false);
            if (C1899593h.A1Z(str, 0, false)) {
                C56052rL.A0D(A0U, "mpin", str);
            }
            if (C626836d.A0M(A0e2, 1, 100, false)) {
                C56052rL.A0D(A0U, "vpa", A0e2);
            }
            if (str2 != null && C626836d.A0M(str2, 1, 100, true)) {
                C56052rL.A0D(A0U, "vpa-id", str2);
            }
            if (C1899693i.A11(A002, 0, false)) {
                C56052rL.A0D(A0U, "upi-bank-info", A002);
            }
            r15.A0D(new C203929oX(r13.A01, r13.A02, r13.A05, AnonymousClass9OC.A02(r13, "upi-check-balance"), r13, r14), C1899593h.A0S(A0U, A012, A0X), A032, 204, 0);
        } else if (this instanceof IndiaUpiChangePinActivity) {
            IndiaUpiChangePinActivity indiaUpiChangePinActivity = (IndiaUpiChangePinActivity) this;
            AnonymousClass99H A0I3 = C1899693i.A0I(indiaUpiChangePinActivity.A05, indiaUpiChangePinActivity.A02.A08, "IndiaUpiChangePinActivity could not cast country data to IndiaUpiMethodData");
            AnonymousClass9AL r33 = indiaUpiChangePinActivity.A09;
            C166557yt r43 = A0I3.A09;
            String str5 = A0I3.A0F;
            C166557yt r53 = A0I3.A06;
            String str6 = indiaUpiChangePinActivity.A02.A0A;
            String str7 = indiaUpiChangePinActivity.A03;
            if (C161527pr.A02(r43)) {
                r33.A07.A01(r33.A02, (C153607bd) null, new AnonymousClass9c4(r53, r33, str6, str7, hashMap2));
            } else {
                r33.A03(r43, r53, str5, str6, str7, hashMap2);
            }
        } else if (this instanceof C191129Co) {
            C191129Co r23 = (C191129Co) this;
            r23.Bp9(R.string.f11nameremoved);
            r23.A7n(r23.A02, hashMap2);
        } else {
            AnonymousClass9D7 r24 = (AnonymousClass9D7) this;
            r24.A0K.A06("onGetCredentials called");
            r24.A7k(r24.A03, hashMap2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000c, code lost:
        if (r25 == null) goto L_0x000e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BZY(int r24, android.os.Bundle r25) {
        /*
            r23 = this;
            java.lang.String r3 = "user canceled"
            r12 = 0
            r0 = 1
            r4 = r23
            r1 = r24
            r5 = r25
            if (r1 != r0) goto L_0x001f
            if (r25 != 0) goto L_0x0023
        L_0x000e:
            X.7oG r0 = r4.A0J
            r0.A06(r3)
            r4.A0I = r12
            boolean r0 = r4.A0H
            if (r0 == 0) goto L_0x006f
            r4.A0H = r12
            r4.BjL()
        L_0x001e:
            return
        L_0x001f:
            if (r1 != r0) goto L_0x005d
            if (r25 == 0) goto L_0x001e
        L_0x0023:
            java.lang.String r2 = "error"
            java.io.Serializable r1 = r5.getSerializable(r2)
            java.lang.String r0 = "USER_ABORTED"
            if (r1 == r0) goto L_0x000e
            java.io.Serializable r0 = r5.getSerializable(r2)
            if (r0 == 0) goto L_0x0036
            r4.A7Z()
        L_0x0036:
            java.lang.String r0 = "credBlocks"
            java.io.Serializable r3 = r5.getSerializable(r0)
            java.util.HashMap r3 = (java.util.HashMap) r3
            X.7oG r2 = r4.A0J
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "onLibraryResult for credentials: "
            java.lang.String r0 = X.AnonymousClass000.A0P(r3, r0, r1)
            r2.A07(r0)
            if (r3 == 0) goto L_0x0056
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x0056
            r12 = 1
        L_0x0056:
            X.C626936e.A0C(r12)
            r4.A7i(r3)
            return
        L_0x005d:
            r0 = 2
            if (r1 != r0) goto L_0x001e
            java.lang.String r0 = "TRIGGER_OTP"
            android.content.Intent r11 = new android.content.Intent
            r11.<init>(r0)
            X.0Vh r10 = X.C05870Vh.A00(r4)
            java.util.HashMap r9 = r10.A04
            monitor-enter(r9)
            goto L_0x0076
        L_0x006f:
            r4.A7H()
            r4.finish()
            return
        L_0x0076:
            java.lang.String r17 = r11.getAction()     // Catch:{ all -> 0x0195 }
            android.content.Context r0 = r10.A00     // Catch:{ all -> 0x0195 }
            android.content.ContentResolver r0 = r0.getContentResolver()     // Catch:{ all -> 0x0195 }
            java.lang.String r14 = r11.resolveTypeIfNeeded(r0)     // Catch:{ all -> 0x0195 }
            android.net.Uri r20 = r11.getData()     // Catch:{ all -> 0x0195 }
            java.lang.String r13 = r11.getScheme()     // Catch:{ all -> 0x0195 }
            java.util.Set r21 = r11.getCategories()     // Catch:{ all -> 0x0195 }
            int r0 = r11.getFlags()     // Catch:{ all -> 0x0195 }
            r0 = r0 & 8
            r15 = 0
            if (r0 == 0) goto L_0x00b9
            r15 = 1
            java.lang.String r2 = "LocalBroadcastManager"
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0195 }
            java.lang.String r0 = "Resolving type "
            r1.append(r0)     // Catch:{ all -> 0x0195 }
            r1.append(r14)     // Catch:{ all -> 0x0195 }
            java.lang.String r0 = " scheme "
            r1.append(r0)     // Catch:{ all -> 0x0195 }
            r1.append(r13)     // Catch:{ all -> 0x0195 }
            java.lang.String r0 = " of intent "
            java.lang.String r0 = X.AnonymousClass000.A0P(r11, r0, r1)     // Catch:{ all -> 0x0195 }
            android.util.Log.v(r2, r0)     // Catch:{ all -> 0x0195 }
        L_0x00b9:
            java.util.HashMap r1 = r10.A03     // Catch:{ all -> 0x0195 }
            java.lang.String r0 = r11.getAction()     // Catch:{ all -> 0x0195 }
            java.lang.Object r8 = r1.get(r0)     // Catch:{ all -> 0x0195 }
            java.util.ArrayList r8 = (java.util.ArrayList) r8     // Catch:{ all -> 0x0195 }
            if (r8 == 0) goto L_0x0193
            if (r15 == 0) goto L_0x00d8
            java.lang.String r2 = "LocalBroadcastManager"
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0195 }
            java.lang.String r0 = "Action list: "
            java.lang.String r0 = X.AnonymousClass000.A0P(r8, r0, r1)     // Catch:{ all -> 0x0195 }
            android.util.Log.v(r2, r0)     // Catch:{ all -> 0x0195 }
        L_0x00d8:
            r7 = 0
            r6 = 0
        L_0x00da:
            int r0 = r8.size()     // Catch:{ all -> 0x0195 }
            if (r6 >= r0) goto L_0x0169
            java.lang.Object r5 = r8.get(r6)     // Catch:{ all -> 0x0195 }
            X.0Nc r5 = (X.C04170Nc) r5     // Catch:{ all -> 0x0195 }
            if (r15 == 0) goto L_0x00fc
            java.lang.String r1 = "LocalBroadcastManager"
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0195 }
            java.lang.String r0 = "Matching against filter "
            r2.append(r0)     // Catch:{ all -> 0x0195 }
            android.content.IntentFilter r0 = r5.A03     // Catch:{ all -> 0x0195 }
            java.lang.String r0 = X.AnonymousClass000.A0R(r0, r2)     // Catch:{ all -> 0x0195 }
            android.util.Log.v(r1, r0)     // Catch:{ all -> 0x0195 }
        L_0x00fc:
            boolean r0 = r5.A00     // Catch:{ all -> 0x0195 }
            if (r0 == 0) goto L_0x010a
            if (r15 == 0) goto L_0x0165
            java.lang.String r1 = "LocalBroadcastManager"
            java.lang.String r0 = "  Filter's target already added"
            android.util.Log.v(r1, r0)     // Catch:{ all -> 0x0195 }
            goto L_0x0165
        L_0x010a:
            android.content.IntentFilter r0 = r5.A03     // Catch:{ all -> 0x0195 }
            java.lang.String r4 = "LocalBroadcastManager"
            r3 = 1
            r19 = r13
            r22 = r4
            r18 = r14
            r16 = r0
            int r2 = r16.match(r17, r18, r19, r20, r21, r22)     // Catch:{ all -> 0x0195 }
            if (r2 < 0) goto L_0x013b
            if (r15 == 0) goto L_0x012f
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0195 }
            java.lang.String r0 = "  Filter matched!  match=0x"
            X.AnonymousClass000.A1G(r0, r1, r2)     // Catch:{ all -> 0x0195 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0195 }
            android.util.Log.v(r4, r0)     // Catch:{ all -> 0x0195 }
        L_0x012f:
            if (r7 != 0) goto L_0x0135
            java.util.ArrayList r7 = X.AnonymousClass001.A0s()     // Catch:{ all -> 0x0195 }
        L_0x0135:
            r7.add(r5)     // Catch:{ all -> 0x0195 }
            r5.A00 = r3     // Catch:{ all -> 0x0195 }
            goto L_0x0165
        L_0x013b:
            if (r15 == 0) goto L_0x0165
            r0 = -4
            if (r2 == r0) goto L_0x0153
            r0 = -3
            if (r2 == r0) goto L_0x0150
            r0 = -2
            if (r2 == r0) goto L_0x014d
            r0 = -1
            if (r2 == r0) goto L_0x014a
            goto L_0x0156
        L_0x014a:
            java.lang.String r2 = "type"
            goto L_0x0158
        L_0x014d:
            java.lang.String r2 = "data"
            goto L_0x0158
        L_0x0150:
            java.lang.String r2 = "action"
            goto L_0x0158
        L_0x0153:
            java.lang.String r2 = "category"
            goto L_0x0158
        L_0x0156:
            java.lang.String r2 = "unknown reason"
        L_0x0158:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0195 }
            java.lang.String r0 = "  Filter did not match: "
            java.lang.String r0 = X.AnonymousClass000.A0V(r0, r2, r1)     // Catch:{ all -> 0x0195 }
            android.util.Log.v(r4, r0)     // Catch:{ all -> 0x0195 }
        L_0x0165:
            int r6 = r6 + 1
            goto L_0x00da
        L_0x0169:
            r2 = 1
            if (r7 == 0) goto L_0x0193
            r1 = 0
        L_0x016d:
            int r0 = r7.size()     // Catch:{ all -> 0x0195 }
            if (r1 >= r0) goto L_0x017e
            java.lang.Object r0 = r7.get(r1)     // Catch:{ all -> 0x0195 }
            X.0Nc r0 = (X.C04170Nc) r0     // Catch:{ all -> 0x0195 }
            r0.A00 = r12     // Catch:{ all -> 0x0195 }
            int r1 = r1 + 1
            goto L_0x016d
        L_0x017e:
            java.util.ArrayList r1 = r10.A02     // Catch:{ all -> 0x0195 }
            X.0LB r0 = new X.0LB     // Catch:{ all -> 0x0195 }
            r0.<init>(r11, r7)     // Catch:{ all -> 0x0195 }
            r1.add(r0)     // Catch:{ all -> 0x0195 }
            android.os.Handler r1 = r10.A01     // Catch:{ all -> 0x0195 }
            boolean r0 = r1.hasMessages(r2)     // Catch:{ all -> 0x0195 }
            if (r0 != 0) goto L_0x0193
            r1.sendEmptyMessage(r2)     // Catch:{ all -> 0x0195 }
        L_0x0193:
            monitor-exit(r9)     // Catch:{ all -> 0x0195 }
            return
        L_0x0195:
            r0 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x0195 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9D8.BZY(int, android.os.Bundle):void");
    }

    public void onCreate(Bundle bundle) {
        String str;
        Bundle bundle2 = bundle;
        super.onCreate(bundle2);
        AnonymousClass6C7.A0y(this);
        PhoneUserJid A2m = AnonymousClass4SG.A2m(this);
        if (A2m == null) {
            str = null;
        } else {
            str = A2m.user;
        }
        C626936e.A06(str);
        this.A0G = str;
        this.A0F = this.A0E.A01();
        this.A05 = this.A0L.A04;
        AnonymousClass0x7.A1B(new AnonymousClass9GT(this, false), this.A04);
        if (getIntent() != null) {
            getIntent().getStringExtra("extra_request_id");
        }
        if (bundle != null) {
            this.A0I = bundle2.getBoolean("payAppShowPinErrorSavedInst");
            this.A00 = bundle2.getInt("showPinConfirmCountSavedInst");
            this.A03 = bundle2.getInt("setupModeSavedInst", 1);
        }
        C69263Wi r5 = this.A05;
        AnonymousClass31C r6 = this.A0H;
        C194259Se r15 = this.A0E;
        AnonymousClass9U1 r7 = this.A0L;
        AnonymousClass9U5 r10 = this.A0M;
        C194389Sr r11 = this.A07;
        C197109ca r13 = this.A0S;
        this.A09 = new AnonymousClass9AL(this, r5, r6, r7, this.A0M, this.A0K, r10, r11, this, r13, this.A0V, r15);
        this.A08 = new AnonymousClass9AG(this.A06, this.A0D, r6, r7, r10);
    }

    public Dialog onCreateDialog(int i) {
        if (i != 19) {
            return super.onCreateDialog(i);
        }
        C19340zH A002 = AnonymousClass5V0.A00(this);
        A002.A0T(R.string.f11nameremoved);
        C204219p0.A01(A002, this, 57, R.string.f11nameremoved);
        C204219p0.A00(A002, this, 55, R.string.f11nameremoved);
        A002.A0i(true);
        A002.A0V(new C204279p6(this, 8));
        return A002.create();
    }

    public void A7a() {
        Bp9(R.string.f11nameremoved);
        this.A0H = true;
        C621433s.A00(this, 19);
        this.A0I = true;
        this.A00++;
        this.A0J.A06("showUPIAppErrorAndConfirmRetry got yes; deleting tokens and keys");
        this.A0M.A0E();
        A7Y();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 200) {
            boolean z = false;
            if (i2 == 250) {
                HashMap hashMap = (HashMap) intent.getSerializableExtra("credBlocks");
                this.A0J.A07(AnonymousClass000.A0P(hashMap, "onLibraryResult for credentials: ", AnonymousClass001.A0o()));
                if (hashMap != null && !hashMap.isEmpty()) {
                    z = true;
                }
                C626936e.A0C(z);
                A7i(hashMap);
            } else if (i2 == 251) {
                A7Z();
            } else if (i2 == 252) {
                this.A0J.A06("user canceled");
                this.A0I = false;
                if (this.A0H) {
                    this.A0H = false;
                    BjL();
                    return;
                }
                A7H();
                finish();
            }
        }
    }

    public void onDestroy() {
        super.onDestroy();
        AnonymousClass9AL r1 = this.A09;
        if (r1 != null) {
            r1.A01 = null;
        }
        this.A03 = null;
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("payAppShowPinErrorSavedInst", this.A0I);
        bundle.putInt("showPinConfirmCountSavedInst", this.A00);
        bundle.putInt("setupModeSavedInst", this.A03);
    }

    public void A7f(AnonymousClass39Q r26, C166557yt r27, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i) {
        String str9 = str4;
        C160757oG r2 = this.A0J;
        r2.A06("getCredentials for pin check called");
        String B0V = this.A0C.B0V(AnonymousClass001.A0K(r27.A00));
        C166557yt A052 = this.A0M.A05();
        String str10 = str;
        if (TextUtils.isEmpty(str10) || TextUtils.isEmpty(B0V) || A052.A00 == null) {
            r2.A06("getCredentials for set got empty xml or controls or token");
            A7Z();
            return;
        }
        int i2 = i;
        if ((!this.A0D.A0X(3640) || i2 != 5) && !TextUtils.isEmpty(str9)) {
            str9 = AnonymousClass0x9.A0z(str9);
        }
        C171678Hz r5 = this.A0C;
        String str11 = this.A0G;
        String str12 = this.A0g;
        String str13 = this.A0d;
        AnonymousClass39Q r7 = r26;
        r5.Bpo(this, r7, A052, this.A08, new C197139cd(this), str10, str2, str3, str9, str5, str6, str7, str8, str11, B0V, str12, str13, i2, this.A0v);
    }
}
