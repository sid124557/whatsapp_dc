package com.whatsapp.payments.ui;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass0R6;
import X.AnonymousClass0R8;
import X.AnonymousClass0x7;
import X.AnonymousClass1VX;
import X.AnonymousClass2Oi;
import X.AnonymousClass303;
import X.AnonymousClass31C;
import X.AnonymousClass34V;
import X.AnonymousClass4EY;
import X.AnonymousClass4FS;
import X.AnonymousClass6C7;
import X.AnonymousClass953;
import X.AnonymousClass97T;
import X.AnonymousClass99H;
import X.AnonymousClass9AF;
import X.AnonymousClass9B3;
import X.AnonymousClass9DA;
import X.AnonymousClass9ER;
import X.AnonymousClass9NQ;
import X.AnonymousClass9Q1;
import X.AnonymousClass9Qp;
import X.AnonymousClass9RH;
import X.AnonymousClass9TZ;
import X.AnonymousClass9U1;
import X.AnonymousClass9U4;
import X.AnonymousClass9U5;
import X.AnonymousClass9VD;
import X.AnonymousClass9VW;
import X.AnonymousClass9VY;
import X.C02680He;
import X.C107635bd;
import X.C107695bk;
import X.C111095hX;
import X.C133686hm;
import X.C134246ig;
import X.C153607bd;
import X.C157317i6;
import X.C160757oG;
import X.C18280x3;
import X.C18290x4;
import X.C18310x6;
import X.C1899593h;
import X.C1899693i;
import X.C1906899l;
import X.C190859Ac;
import X.C194259Se;
import X.C194309Sj;
import X.C194319Sk;
import X.C195169Wk;
import X.C196629bS;
import X.C196719bd;
import X.C197109ca;
import X.C202629mK;
import X.C203039n1;
import X.C204019og;
import X.C204249p3;
import X.C204559pY;
import X.C204669pj;
import X.C40602Ha;
import X.C47432dF;
import X.C54292oU;
import X.C54722pB;
import X.C617332a;
import X.C620633i;
import X.C626936e;
import X.C64333Db;
import X.C69263Wi;
import X.C86614Ku;
import X.C86654Ky;
import X.C88834as;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class IndiaUpiBankAccountPickerActivity extends AnonymousClass9DA implements AnonymousClass4EY, C203039n1, C202629mK {
    public int A00;
    public int A01;
    public View A02;
    public View A03;
    public View A04;
    public View A05;
    public View A06;
    public View A07;
    public ImageView A08;
    public TextView A09;
    public TextView A0A;
    public RecyclerView A0B;
    public C617332a A0C;
    public C196719bd A0D;
    public AnonymousClass99H A0E;
    public C194319Sk A0F;
    public C153607bd A0G;
    public AnonymousClass9VD A0H;
    public AnonymousClass9AF A0I;
    public C194309Sj A0J;
    public AnonymousClass9RH A0K;
    public AnonymousClass9TZ A0L;
    public C157317i6 A0M;
    public AnonymousClass9ER A0N;
    public AnonymousClass9Qp A0O;
    public AnonymousClass9VY A0P;
    public C194259Se A0Q;
    public C54722pB A0R;
    public String A0S;
    public ArrayList A0T;
    public List A0U;
    public boolean A0V;
    public boolean A0W;
    public boolean A0X;
    public final C134246ig A0Y;
    public final C160757oG A0Z;

    public void A5r() {
        if (!this.A0V) {
            this.A0V = true;
            C88834as A0I2 = C18280x3.A0I(this);
            C64333Db r3 = A0I2.A4Z;
            C1899593h.A15(r3, this);
            C107695bk r1 = r3.A00;
            C1899593h.A0z(r3, r1, this, C1899593h.A0W(r3, r1, this));
            AnonymousClass97T.A0h(A0I2, r3, r1, this);
            AnonymousClass97T.A0i(A0I2, r3, r1, this, C1899693i.A0Y(r3));
            AnonymousClass97T.A0m(r3, r1, this);
            AnonymousClass97T.A0o(r3, r1, this);
            AnonymousClass97T.A0n(r3, r1, this);
            this.A0Q = C1899593h.A0Q(r3);
            this.A0D = C1899693i.A0H(r1);
            this.A0C = C1899593h.A09(r3);
            this.A0L = C1899693i.A0P(r3);
            this.A0F = (C194319Sk) r3.APn.get();
            this.A0P = r3.ApM();
            this.A0N = AnonymousClass97T.A0Z(r1);
            this.A0J = C1899593h.A0J(r1);
            this.A0K = (AnonymousClass9RH) r1.A8s.get();
            this.A0M = A0I2.ACr();
        }
    }

    public void A7V() {
        ArrayList arrayList = this.A0T;
        if (arrayList == null || arrayList.size() == 0) {
            this.A08.setVisibility(0);
            this.A09.setVisibility(8);
            this.A04.setVisibility(4);
            this.A06.setVisibility(0);
            this.A0B.setVisibility(8);
            this.A02.setVisibility(8);
            this.A03.setVisibility(8);
            this.A07.setVisibility(0);
            this.A05.setVisibility(8);
            this.A08.setImageDrawable(getResources().getDrawable(R.drawable.ic_account_search));
            this.A0A.setText(R.string.f11nameremoved);
            this.A0H.A00(this.A0E, AnonymousClass97T.A0b(this));
        } else {
            this.A0Y.A0H = Long.valueOf((long) arrayList.size());
            this.A0U = AnonymousClass001.A0s();
            this.A01 = -1;
            this.A0X = false;
            int i = 0;
            while (true) {
                ArrayList arrayList2 = this.A0T;
                if (i >= arrayList2.size()) {
                    break;
                }
                AnonymousClass99H r7 = (AnonymousClass99H) arrayList2.get(i);
                String A052 = C195169Wk.A05((String) C1899593h.A0X(r7.A02));
                this.A0U.add(new AnonymousClass9Q1((String) C1899593h.A0X(r7.A03), A052, (String) C1899593h.A0X(r7.A01), getString(r7.A0E()), r7.A0B, r7.A0J));
                i++;
            }
            this.A04.setVisibility(0);
            this.A06.setVisibility(8);
            this.A0B.setVisibility(0);
            int i2 = 0;
            while (true) {
                if (i2 >= this.A0U.size()) {
                    break;
                }
                AnonymousClass9Q1 r1 = (AnonymousClass9Q1) this.A0U.get(i2);
                if (this.A01 == -1 && !r1.A06) {
                    this.A01 = i2;
                    r1.A00 = true;
                    break;
                }
                i2++;
            }
            this.A08.setVisibility(0);
            this.A07.setVisibility(0);
            this.A02.setVisibility(0);
            this.A03.setVisibility(0);
            this.A05.setVisibility(0);
            this.A08.setImageDrawable(C02680He.A00((Resources.Theme) null, getResources(), R.drawable.ic_account_found));
            int size = this.A0T.size();
            TextView textView = this.A0A;
            if (size == 1) {
                textView.setText(R.string.f11nameremoved);
                this.A09.setVisibility(8);
            } else {
                textView.setText(R.string.f11nameremoved);
                this.A09.setText(R.string.f11nameremoved);
                this.A09.setVisibility(0);
            }
            if (this.A01 == -1) {
                this.A02.setEnabled(false);
                this.A03.setVisibility(4);
            } else {
                this.A03.setVisibility(0);
                this.A02.setEnabled(true);
                C204249p3.A02(this.A02, this, 38);
            }
            List list = this.A0U;
            if (list != null) {
                this.A0B.setAdapter(new AnonymousClass953(new AnonymousClass9NQ(this), this, list));
                this.A0N.A00.A0B("bankAccountPickerShown");
            }
        }
        invalidateOptionsMenu();
    }

    public final void A7W() {
        if (this.A01 < 0) {
            Log.e("selected account position is invalid");
            return;
        }
        this.A0N.A00.A0B("bankAccountAddClicked");
        this.A02.setVisibility(8);
        this.A0X = true;
        AnonymousClass0R6 r0 = this.A0B.A0N;
        if (r0 != null) {
            r0.A05();
        }
        boolean z = this.A0k;
        this.A0I.A00((AnonymousClass99H) this.A0T.get(this.A01), new C204669pj(this, 1), z, z);
        this.A0S.Bq0();
        C134246ig r2 = this.A0Y;
        r2.A0G = Long.valueOf((long) this.A01);
        r2.A07 = C18290x4.A0c();
        AnonymousClass97T.A0u(r2, this, "nav_select_account");
        C1899593h.A1B(r2, 1);
        AnonymousClass97T.A0t(r2, this);
    }

    public final void A7X(C133686hm r4) {
        C160757oG r2 = this.A0Z;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("showSuccessAndFinish: ");
        C1899593h.A1J(r2, this.A0G.toString(), A0o);
        A7I();
        this.A0A = r4;
        StringBuilder A0o2 = AnonymousClass001.A0o();
        A0o2.append("Is first payment method:");
        A0o2.append(this.A0l);
        A0o2.append(", entry point:");
        A0o2.append(this.A02);
        C18280x3.A14(A0o2);
        A7S("nav_select_account");
    }

    public final void A7Y(AnonymousClass9VW r6, boolean z) {
        int i = r6.A00;
        C160757oG r2 = this.A0Z;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("showSuccessAndFinish: resId ");
        C1899593h.A1K(r2, A0o, i);
        A7I();
        if (i == 0) {
            i = R.string.f11nameremoved;
            String str = this.A0G.A04;
            if ("upi-register-vpa".equalsIgnoreCase(str)) {
                i = R.string.f11nameremoved;
            }
            if ("upi-get-accounts".equalsIgnoreCase(str)) {
                i = R.string.f11nameremoved;
            }
        }
        if (this.A0k || z) {
            A7H();
            Intent A0L2 = AnonymousClass97T.A0L(this, r6);
            A0L2.putExtra("error", i);
            A0L2.putExtra("error_type", this.A00);
            int i2 = this.A00;
            if (i2 >= 1 && i2 <= 6) {
                A0L2.putExtra("extra_bank_account", this.A0E);
            }
            if (!this.A0k) {
                A0L2.putExtra("try_again", 1);
            }
            if (this.A00 == 1) {
                A0L2.putExtra("extra_error_screen_name", "bank_account_not_found");
                A0L2.putExtra("extra_referral_screen", "device_binding");
            }
            A0L2.addFlags(335544320);
            A7O(A0L2);
            A0L2.putExtra("extra_previous_screen", "nav_select_account");
            A6T(A0L2, true);
        } else {
            Bot(i);
        }
        this.A0N.A00.A0E(3);
    }

    public final void A7Z(Integer num) {
        C134246ig r1 = this.A0Y;
        AnonymousClass97T.A0u(r1, this, "nav_select_account");
        r1.A08 = AnonymousClass001.A0f();
        r1.A07 = num;
        AnonymousClass97T.A0t(r1, this);
    }

    public void BNT(AnonymousClass34V r10, ArrayList arrayList) {
        String A042;
        long size;
        AnonymousClass9VW A043;
        int i;
        C160757oG r4 = this.A0Z;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("onBankAccountsList: ");
        A0o.append(arrayList);
        C1899593h.A1H(r4, r10, " error: ", A0o);
        if (!TextUtils.isEmpty(this.A0M.A07())) {
            A042 = this.A0M.A07();
        } else {
            A042 = this.A0L.A04(this.A0E);
        }
        C197109ca r1 = this.A0S;
        r1.A0B(A042);
        C134246ig A032 = r1.A03(r10, 18);
        A032.A0O = this.A0E.A0C;
        if (arrayList == null) {
            A032.A01 = Boolean.FALSE;
            size = 0;
        } else {
            A032.A01 = Boolean.TRUE;
            size = (long) arrayList.size();
        }
        A032.A0H = Long.valueOf(size);
        AnonymousClass97T.A0u(A032, this, "nav_select_account");
        AnonymousClass97T.A0t(A032, this);
        r4.A04(AnonymousClass000.A0P(A032, "logGetAccounts: ", AnonymousClass001.A0o()));
        if (arrayList == null || arrayList.isEmpty()) {
            if (arrayList != null) {
                this.A00 = 1;
                AnonymousClass34V r42 = new AnonymousClass34V(11473);
                i = R.string.f11nameremoved;
                if (A7U(this.A0E, r42, getString(R.string.f11nameremoved))) {
                    return;
                }
            } else if (r10 != null && !C196719bd.A02(this, "upi-get-accounts", r10.A00, true)) {
                String A002 = this.A0L.A00(r10.A00);
                int i2 = r10.A00;
                if (i2 == 11467 || i2 == 11543) {
                    A7I();
                    this.A0M.B1N(this.A0L.A04(this.A0E), true);
                    A7Y(new AnonymousClass9VW(R.string.f11nameremoved), true);
                    this.A0L.A09();
                    return;
                } else if (A002 != null) {
                    A7I();
                    if (!A7U(this.A0E, r10, A002)) {
                        A7Y(new AnonymousClass9VW(r10.A00, A002), true);
                        return;
                    }
                    return;
                } else if (i2 == 11473) {
                    A7I();
                    i = R.string.f11nameremoved;
                } else if (i2 == 11485) {
                    A7I();
                    this.A00 = 5;
                    i = R.string.f11nameremoved;
                } else if (i2 == 11487) {
                    A7I();
                    this.A00 = 6;
                    i = R.string.f11nameremoved;
                } else {
                    A043 = this.A0D.A04(this.A0G, i2);
                    StringBuilder A0o2 = AnonymousClass001.A0o();
                    A0o2.append("onBankAccountsList failure. showErrorAndFinish: ");
                    C1899593h.A1K(r4, A0o2, this.A0G.A00("upi-get-accounts"));
                    int i3 = A043.A00;
                    if (i3 == R.string.f11nameremoved || i3 == R.string.f11nameremoved || i3 == R.string.f11nameremoved) {
                        this.A0k = false;
                        A7Y(A043, false);
                        return;
                    }
                    this.A00 = 1;
                    A7Y(A043, true);
                    return;
                }
            } else {
                return;
            }
            A043 = new AnonymousClass9VW(i);
            A7Y(A043, true);
            return;
        }
        getIntent().putParcelableArrayListExtra("extra_accounts_list", arrayList);
        this.A0T = arrayList;
        if (arrayList.size() != 1 || ((AnonymousClass99H) arrayList.get(0)).A0J) {
            A7V();
            return;
        }
        this.A0W = true;
        boolean z = this.A0k;
        this.A0I.A00((AnonymousClass99H) arrayList.get(0), new C204669pj(this, 0), z, z);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x006d, code lost:
        if (X.AnonymousClass99H.A00((X.AnonymousClass99H) r0) == false) goto L_0x006f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0023, code lost:
        if (r13.A00 != 1383026) goto L_0x0025;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BZf(X.C133686hm r12, X.AnonymousClass34V r13) {
        /*
            r11 = this;
            X.7oG r2 = r11.A0Z
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "onRegisterVpa registered: "
            java.lang.String r0 = X.AnonymousClass000.A0P(r12, r0, r1)
            r2.A04(r0)
            X.9ER r0 = r11.A0N
            r1 = 3
            if (r13 != 0) goto L_0x0015
            r1 = 2
        L_0x0015:
            X.316 r0 = r0.A00
            r0.A0E(r1)
            r5 = 1383026(0x151a72, float:1.938032E-39)
            r2 = 0
            if (r13 == 0) goto L_0x0025
            int r0 = r13.A00
            r1 = 1
            if (r0 == r5) goto L_0x0026
        L_0x0025:
            r1 = 0
        L_0x0026:
            boolean r0 = r11.A0W
            if (r0 == 0) goto L_0x0039
            if (r12 != 0) goto L_0x0039
            if (r1 != 0) goto L_0x0039
            r11.A0W = r2
            r11.A7V()
            java.lang.String r0 = "Auto Add single account failed, falling back to default"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x0039:
            X.33l r0 = r11.A0P
            android.content.SharedPreferences r0 = r0.A03()
            java.lang.String r4 = "payment_usync_triggered"
            boolean r0 = r0.getBoolean(r4, r2)
            if (r0 != 0) goto L_0x0060
            X.4FS r3 = r11.A04
            X.3Cq r1 = r11.A05
            java.util.Objects.requireNonNull(r1)
            X.9g1 r0 = new X.9g1
            r0.<init>(r1)
            r3.BkM(r0)
            X.33l r0 = r11.A0P
            android.content.SharedPreferences$Editor r1 = X.C620933l.A00(r0)
            r0 = 1
            X.C18270x1.A0l(r1, r4, r0)
        L_0x0060:
            if (r12 == 0) goto L_0x00d1
            X.6hx r0 = r12.A08
            if (r0 == 0) goto L_0x006f
            X.99H r0 = (X.AnonymousClass99H) r0
            boolean r0 = X.AnonymousClass99H.A00(r0)
            r10 = 1
            if (r0 != 0) goto L_0x0070
        L_0x006f:
            r10 = 0
        L_0x0070:
            X.9Sk r7 = r11.A0F
            com.whatsapp.jid.UserJid r6 = r11.A0F
            r5 = 3
            X.33l r3 = r7.A03
            android.content.SharedPreferences r2 = r3.A03()
            java.lang.String r1 = "payments_inviter_jids_with_expiry"
            java.lang.String r0 = ""
            java.lang.String r0 = r2.getString(r1, r0)
            java.util.Map r0 = r3.A09(r0)
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r9 = r0.iterator()
        L_0x008f:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x00cd
            java.lang.Object r8 = r9.next()
            com.whatsapp.jid.UserJid r8 = (com.whatsapp.jid.UserJid) r8
            boolean r0 = r8.equals(r6)
            r7.A01(r8, r5, r0)
            X.9NE r2 = r7.A07
            X.2sH r0 = r7.A01
            long r3 = r0.A0H()
            boolean r1 = r8.equals(r6)
            X.35J r0 = r2.A00
            X.2z0 r0 = X.AnonymousClass35J.A01(r8, r0)
            if (r10 == 0) goto L_0x00c7
            X.1oi r2 = new X.1oi
            r2.<init>(r0, r3)
        L_0x00bb:
            r2.A00 = r5
            r2.A01 = r1
            X.3Lv r1 = r7.A02
            r0 = 16
            r1.A0a(r2, r0)
            goto L_0x008f
        L_0x00c7:
            X.1oh r2 = new X.1oh
            r2.<init>(r0, r3)
            goto L_0x00bb
        L_0x00cd:
            r11.A7X(r12)
            return
        L_0x00d1:
            if (r13 == 0) goto L_0x010b
            int r1 = r13.A00
            r0 = 11472(0x2cd0, float:1.6076E-41)
            if (r1 != r0) goto L_0x00df
            X.9U5 r0 = r11.A0M
            r0.A08(r11)
            return
        L_0x00df:
            r0 = 10756(0x2a04, float:1.5072E-41)
            if (r1 != r0) goto L_0x0100
            java.lang.Class<com.whatsapp.payments.ui.IndiaUpiDobPickerActivity> r0 = com.whatsapp.payments.ui.IndiaUpiDobPickerActivity.class
            android.content.Intent r2 = X.AnonymousClass0x9.A08(r11, r0)
            java.util.ArrayList r1 = r11.A0T
            int r0 = r11.A01
            java.lang.Object r0 = r1.get(r0)
            X.6hu r0 = (X.C133766hu) r0
            X.7yt r1 = r0.A02
            java.lang.String r0 = "bank_account"
            r2.putExtra(r0, r1)
            r0 = 1023(0x3ff, float:1.434E-42)
            r11.BpY(r2, r0)
            return
        L_0x0100:
            if (r1 != r5) goto L_0x010b
            r0 = 2131894682(0x7f12219a, float:1.9424176E38)
            X.9VW r1 = new X.9VW
            r1.<init>(r0)
            goto L_0x0113
        L_0x010b:
            X.9bd r1 = r11.A0D
            X.7bd r0 = r11.A0G
            X.9VW r1 = r1.A04(r0, r2)
        L_0x0113:
            r11.A7Y(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.IndiaUpiBankAccountPickerActivity.BZf(X.6hm, X.34V):void");
    }

    public void Ba4(AnonymousClass34V r4) {
        C1899593h.A1H(this.A0Z, r4, "getPaymentMethods. paymentNetworkError: ", AnonymousClass001.A0o());
        A7Y(this.A0D.A04(this.A0G, r4.A00), false);
    }

    public void BaB(AnonymousClass34V r4) {
        C1899593h.A1H(this.A0Z, r4, "getPaymentMethods. paymentNetworkError: ", AnonymousClass001.A0o());
        if (!C196719bd.A02(this, "upi-register-vpa", r4.A00, true)) {
            A7Y(this.A0D.A04(this.A0G, r4.A00), false);
        }
    }

    public void BaC(AnonymousClass2Oi r4) {
        C160757oG r2 = this.A0Z;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("getPaymentMethods. onResponseSuccess: ");
        C1899593h.A1L(r2, A0o, r4.A02);
        List list = ((C190859Ac) r4).A00;
        if (list == null || list.isEmpty()) {
            A7Y(this.A0D.A04(this.A0G, 0), false);
            return;
        }
        this.A0I.A08(this.A0I.A01("add_bank"));
        A7X((C133686hm) null);
    }

    public void onBackPressed() {
        this.A0Z.A06("onBackPressed");
        A7Z(AnonymousClass001.A0f());
        A7J();
    }

    public void onCreate(Bundle bundle) {
        C1899593h.A0h(this);
        super.onCreate(bundle);
        AnonymousClass6C7.A0y(this);
        this.A0O = new AnonymousClass9Qp(this.A0I);
        C626936e.A06(C86614Ku.A0D(this));
        this.A0T = C86614Ku.A0D(this).getParcelableArrayList("extra_accounts_list");
        this.A0S = C86614Ku.A0D(this).getString("extra_selected_account_bank_logo");
        this.A0E = (AnonymousClass99H) getIntent().getParcelableExtra("extra_selected_bank");
        C153607bd r2 = this.A0L.A04;
        this.A0G = r2;
        r2.A01("upi-bank-account-picker");
        AnonymousClass1VX r32 = this.A0D;
        C69263Wi r15 = this.A05;
        AnonymousClass31C r14 = this.A0H;
        C194259Se r13 = this.A0Q;
        AnonymousClass9U4 r12 = this.A0P;
        C1906899l r3 = this.A0I;
        C617332a r11 = this.A0C;
        AnonymousClass9U1 r10 = this.A0L;
        AnonymousClass9U5 r22 = this.A0M;
        C40602Ha r9 = this.A0K;
        C196629bS r8 = this.A0M;
        C197109ca r7 = this.A0S;
        AnonymousClass9B3 r6 = this.A0V;
        this.A0I = new AnonymousClass9AF(this, r15, r11, r32, r14, r10, r8, r3, r9, r22, r12, this, r7, r6, r13);
        C54292oU r5 = this.A06;
        AnonymousClass4FS r4 = this.A04;
        AnonymousClass9B3 r27 = r6;
        C197109ca r26 = r7;
        AnonymousClass9U4 r24 = r12;
        C40602Ha r23 = r9;
        C196629bS r222 = r8;
        AnonymousClass9U1 r21 = r10;
        AnonymousClass99H r20 = this.A0E;
        AnonymousClass31C r19 = r14;
        AnonymousClass1VX r18 = r32;
        C617332a r17 = r11;
        C54292oU r16 = r5;
        this.A0H = new AnonymousClass9VD(r15, r16, r17, r18, r19, r20, r21, r222, r23, r24, this, r26, r27, this.A0P, r13, r4);
        File file = new File(getCacheDir(), "BankLogos");
        if (!file.mkdirs() && !file.isDirectory()) {
            this.A0Z.A06("BankAccountPickerUI/create unable to create bank logos cache directory");
        }
        C47432dF r33 = new C47432dF(this.A05, this.A05, this.A0D, file, "india-upi-bank-account-picker");
        r33.A00 = getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
        this.A0R = r33.A01();
        setContentView((int) R.layout.f8nameremoved);
        this.A02 = findViewById(R.id.add_button);
        this.A03 = findViewById(R.id.progress);
        this.A07 = findViewById(R.id.upi_logo);
        this.A06 = findViewById(R.id.shimmer_layout);
        this.A0B = (RecyclerView) findViewById(R.id.recycler_view);
        this.A04 = findViewById(R.id.header_divider);
        this.A0A = C18310x6.A0L(this, R.id.bank_account_picker_title);
        this.A09 = C18310x6.A0L(this, R.id.bank_account_picker_description);
        this.A08 = C86654Ky.A0M(this, R.id.hero_img);
        this.A05 = findViewById(R.id.note_layout);
        AnonymousClass0R8 A0Y2 = AnonymousClass97T.A0Y(this);
        if (A0Y2 != null) {
            A0Y2.A0N(true);
            A0Y2.A0B(R.string.f11nameremoved);
        }
        AnonymousClass1VX r82 = this.A0D;
        C69263Wi r72 = this.A05;
        C111095hX r62 = this.A00;
        C620633i r52 = this.A08;
        C69263Wi r112 = r72;
        C111095hX r102 = r62;
        C107635bd.A0E(this, Uri.parse("https://faq.whatsapp.com/general/payments/learn-more-about-sharing-the-legal-name-on-your-bank-account"), r102, r112, AnonymousClass0x7.A0K(this.A05, R.id.note_name_visible_to_others), r52, r82, AnonymousClass002.A0F(this, "learn-more", new Object[1], 0, R.string.f11nameremoved), "learn-more");
        A7V();
        this.A0S.A09((AnonymousClass303) null, 0, (Integer) null, this.A0b, "nav_select_account", this.A0e);
    }

    public IndiaUpiBankAccountPickerActivity(int i) {
        this.A0V = false;
        C204019og.A00(this, 50);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i != 1023) {
            return;
        }
        if (i2 == -1) {
            this.A0M.A00(intent, this, new C204559pY(this, 0));
        } else {
            finish();
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        A7P(menu);
        return super.onCreateOptionsMenu(menu);
    }

    public void onDestroy() {
        super.onDestroy();
        this.A0I.A01 = null;
        this.A0P.A0K(this);
        this.A0R.A00();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == R.id.menuitem_help && !this.A0X && this.A06.getVisibility() != 0) {
            A7N(R.string.f11nameremoved, "nav_select_account", "payments:account-select");
            return true;
        } else if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            this.A0Z.A06("action bar home");
            A7Z(1);
            A7J();
            return true;
        }
    }

    public boolean onPrepareOptionsMenu(Menu menu) {
        if (menu.findItem(R.id.menuitem_help) != null) {
            menu.findItem(R.id.menuitem_help).setVisible(AnonymousClass000.A1S(this.A06.getVisibility()));
        }
        return super.onPrepareOptionsMenu(menu);
    }

    public void BQy(AnonymousClass34V r1) {
    }

    public IndiaUpiBankAccountPickerActivity() {
        this(0);
        this.A0Z = C160757oG.A00("IndiaUpiBankAccountPickerActivity", "onboarding", "IN");
        this.A01 = -1;
        this.A0Y = new C134246ig();
        this.A0W = false;
    }
}
