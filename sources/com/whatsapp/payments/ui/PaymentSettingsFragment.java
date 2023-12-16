package com.whatsapp.payments.ui;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass088;
import X.AnonymousClass0RP;
import X.AnonymousClass0XL;
import X.AnonymousClass0Y8;
import X.AnonymousClass0x2;
import X.AnonymousClass0x9;
import X.AnonymousClass1S3;
import X.AnonymousClass2T7;
import X.AnonymousClass30K;
import X.AnonymousClass32Y;
import X.AnonymousClass33K;
import X.AnonymousClass36F;
import X.AnonymousClass4DI;
import X.AnonymousClass4FS;
import X.AnonymousClass4L0;
import X.AnonymousClass5UX;
import X.AnonymousClass5WY;
import X.AnonymousClass5ZU;
import X.AnonymousClass948;
import X.AnonymousClass9C6;
import X.AnonymousClass9ES;
import X.AnonymousClass9ET;
import X.AnonymousClass9G2;
import X.AnonymousClass9Ge;
import X.AnonymousClass9H0;
import X.AnonymousClass9H2;
import X.AnonymousClass9NU;
import X.AnonymousClass9OO;
import X.AnonymousClass9P5;
import X.AnonymousClass9QM;
import X.AnonymousClass9TR;
import X.AnonymousClass9U4;
import X.AnonymousClass9U5;
import X.AnonymousClass9VG;
import X.AnonymousClass9VU;
import X.AnonymousClass9W0;
import X.AnonymousClass9W3;
import X.AnonymousClass9WE;
import X.AnonymousClass9WM;
import X.AnonymousClass9Y4;
import X.AnonymousClass9b0;
import X.AnonymousClass9bQ;
import X.AnonymousClass9bR;
import X.C003203q;
import X.C06560Yg;
import X.C08310eF;
import X.C105365Uq;
import X.C106715a2;
import X.C107335b8;
import X.C114015mM;
import X.C153087ae;
import X.C153607bd;
import X.C158777kX;
import X.C15910sA;
import X.C166587yw;
import X.C18270x1;
import X.C18300x5;
import X.C18320x8;
import X.C1899593h;
import X.C1899693i;
import X.C1902394t;
import X.C1906699j;
import X.C1906899l;
import X.C1906999m;
import X.C1907099n;
import X.C191599Fn;
import X.C191789Gl;
import X.C194089Rn;
import X.C194229Sb;
import X.C194479Ta;
import X.C194489Tb;
import X.C194539Ti;
import X.C194659Tz;
import X.C194819Up;
import X.C194909Va;
import X.C194939Vd;
import X.C195169Wk;
import X.C195219Wq;
import X.C197109ca;
import X.C200649if;
import X.C202469m4;
import X.C202509m8;
import X.C202819md;
import X.C203189nG;
import X.C203209nI;
import X.C203339nX;
import X.C203499no;
import X.C203739oE;
import X.C204249p3;
import X.C204329pB;
import X.C204359pE;
import X.C204759ps;
import X.C205049qL;
import X.C29271iY;
import X.C40602Ha;
import X.C44772Xk;
import X.C50472iE;
import X.C54292oU;
import X.C56492s4;
import X.C56612sH;
import X.C56972sr;
import X.C620933l;
import X.C624034w;
import X.C626936e;
import X.C627736r;
import X.C64773Ex;
import X.C66663Mh;
import X.C69263Wi;
import X.C85204Fi;
import X.C86604Kt;
import X.C86654Ky;
import X.C86664Kz;
import X.C88694ab;
import X.C89644eZ;
import X.C89654ea;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.LegacyMessageDialogFragment;
import com.whatsapp.R;
import com.whatsapp.RequestPermissionActivity;
import com.whatsapp.jid.UserJid;
import com.whatsapp.payments.ui.viewmodel.IndiaPaymentSettingsViewModel;
import com.whatsapp.payments.ui.viewmodel.PaymentIncentiveViewModel;
import com.whatsapp.payments.ui.widget.PaymentMethodRow;
import com.whatsapp.payments.ui.widget.TransactionsExpandableView;
import com.whatsapp.util.Log;
import java.util.List;
import java.util.concurrent.TimeUnit;

public abstract class PaymentSettingsFragment extends Hilt_PaymentSettingsFragment implements View.OnClickListener, C203189nG, C203739oE, C202509m8, C203209nI, C202819md {
    public View A00;
    public View A01;
    public View A02;
    public View A03;
    public View A04;
    public View A05;
    public View A06;
    public View A07;
    public View A08;
    public View A09;
    public View A0A;
    public FrameLayout A0B;
    public FrameLayout A0C;
    public FrameLayout A0D;
    public LinearLayout A0E;
    public LinearLayout A0F;
    public LinearLayout A0G;
    public ListView A0H;
    public TextView A0I;
    public RecyclerView A0J;
    public RecyclerView A0K;
    public C69263Wi A0L;
    public C56972sr A0M;
    public AnonymousClass5WY A0N;
    public C66663Mh A0O;
    public C56492s4 A0P;
    public C44772Xk A0Q;
    public AnonymousClass5UX A0R;
    public C64773Ex A0S;
    public AnonymousClass5ZU A0T;
    public C114015mM A0U;
    public C56612sH A0V;
    public C54292oU A0W;
    public C194909Va A0X;
    public AnonymousClass36F A0Y;
    public AnonymousClass30K A0Z;
    public AnonymousClass33K A0a;
    public C194539Ti A0b;
    public C1906899l A0c;
    public C202469m4 A0d;
    public C1906699j A0e;
    public C40602Ha A0f;
    public C1906999m A0g;
    public C194489Tb A0h;
    public C620933l A0i;
    public C29271iY A0j;
    public AnonymousClass9U5 A0k;
    public C153087ae A0l;
    public C1907099n A0m;
    public AnonymousClass9U4 A0n;
    public AnonymousClass9b0 A0o;
    public AnonymousClass9H2 A0p;
    public AnonymousClass9VG A0q;
    public C158777kX A0r;
    public AnonymousClass948 A0s;
    public AnonymousClass9Ge A0t;
    public AnonymousClass9bQ A0u;
    public C194939Vd A0v;
    public PaymentIncentiveViewModel A0w;
    public C1902394t A0x;
    public AnonymousClass9W0 A0y;
    public AnonymousClass9G2 A0z;
    public TransactionsExpandableView A10;
    public TransactionsExpandableView A11;
    public C194229Sb A12;
    public C195219Wq A13;
    public C106715a2 A14;
    public AnonymousClass4FS A15;
    public String A16;
    public List A17 = AnonymousClass001.A0s();
    public List A18 = AnonymousClass001.A0s();
    public List A19 = AnonymousClass001.A0s();

    public void A0k(int i, int i2, Intent intent) {
        C194939Vd r0;
        int intExtra;
        String quantityString;
        if (i != 1) {
            if (i != 48) {
                if (i != 150) {
                    if (i != 501) {
                        super.A0k(i, i2, intent);
                        return;
                    }
                    View view = this.A0B;
                    if (intent != null && view != null) {
                        if (i2 == -1) {
                            UserJid A082 = AnonymousClass32Y.A08(intent.getStringExtra("extra_invitee_jid"));
                            if (A082 != null) {
                                quantityString = C18320x8.A0b(C08310eF.A09(this), this.A0T.A0M(this.A0S.A0A(A082)), new Object[1], 0, R.string.f11nameremoved);
                            } else {
                                return;
                            }
                        } else if (i2 == 501 && (intExtra = intent.getIntExtra("extra_inviter_count", 0)) > 0) {
                            Resources A092 = C08310eF.A09(this);
                            Object[] objArr = new Object[1];
                            AnonymousClass000.A1P(objArr, intExtra, 0);
                            quantityString = A092.getQuantityString(R.plurals.f9nameremoved, intExtra, objArr);
                        } else {
                            return;
                        }
                        C88694ab.A01(view, quantityString, -1).A05();
                    }
                } else if (i2 == -1) {
                    A1g((String) null);
                }
            } else if (i2 == -1) {
                A0R().finish();
            }
        } else if (i2 == -1 && (r0 = this.A0v) != null) {
            r0.A01();
        }
    }

    public void A1c(int i) {
        if (i == 1) {
            C50472iE A002 = LegacyMessageDialogFragment.A00(new Object[0], R.string.f11nameremoved);
            A002.A01(new C204359pE(3), R.string.f11nameremoved);
            A002.A00().A1O(A0U(), (String) null);
        }
    }

    public C194939Vd A1U() {
        if (this instanceof IndiaUpiPaymentSettingsFragment) {
            IndiaUpiPaymentSettingsFragment indiaUpiPaymentSettingsFragment = (IndiaUpiPaymentSettingsFragment) this;
            C56612sH r20 = indiaUpiPaymentSettingsFragment.A0V;
            C69263Wi r17 = indiaUpiPaymentSettingsFragment.A0L;
            C56972sr r18 = indiaUpiPaymentSettingsFragment.A0M;
            AnonymousClass4FS r15 = indiaUpiPaymentSettingsFragment.A15;
            AnonymousClass30K r13 = indiaUpiPaymentSettingsFragment.A0Z;
            C194089Rn r12 = indiaUpiPaymentSettingsFragment.A0J;
            AnonymousClass9U4 r11 = indiaUpiPaymentSettingsFragment.A0n;
            C620933l r10 = indiaUpiPaymentSettingsFragment.A0i;
            C1906899l r9 = indiaUpiPaymentSettingsFragment.A0c;
            AnonymousClass9TR r8 = indiaUpiPaymentSettingsFragment.A0P;
            AnonymousClass9U5 r7 = indiaUpiPaymentSettingsFragment.A0k;
            C197109ca r6 = indiaUpiPaymentSettingsFragment.A0M;
            AnonymousClass9WM r5 = indiaUpiPaymentSettingsFragment.A0H;
            C40602Ha r4 = indiaUpiPaymentSettingsFragment.A0f;
            AnonymousClass9W3 r3 = indiaUpiPaymentSettingsFragment.A0O;
            AnonymousClass9VU r2 = indiaUpiPaymentSettingsFragment.A0L;
            AnonymousClass9WM r27 = r5;
            AnonymousClass9U4 r28 = r11;
            C194089Rn r29 = r12;
            AnonymousClass9VU r30 = r2;
            C197109ca r31 = r6;
            C1906899l r22 = r9;
            C194479Ta r23 = indiaUpiPaymentSettingsFragment.A0E;
            C40602Ha r24 = r4;
            C620933l r25 = r10;
            AnonymousClass9U5 r26 = r7;
            return new AnonymousClass9ES(r17, r18, (C89644eZ) indiaUpiPaymentSettingsFragment.A0R(), r20, r13, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r3, r8, indiaUpiPaymentSettingsFragment, r15);
        }
        BrazilPaymentSettingsFragment brazilPaymentSettingsFragment = (BrazilPaymentSettingsFragment) this;
        C56612sH r202 = brazilPaymentSettingsFragment.A0V;
        C69263Wi r19 = brazilPaymentSettingsFragment.A0L;
        C56972sr r182 = brazilPaymentSettingsFragment.A0M;
        AnonymousClass4FS r172 = brazilPaymentSettingsFragment.A15;
        AnonymousClass30K r152 = brazilPaymentSettingsFragment.A0Z;
        C194089Rn r132 = brazilPaymentSettingsFragment.A08;
        AnonymousClass9U4 r122 = brazilPaymentSettingsFragment.A0n;
        C620933l r112 = brazilPaymentSettingsFragment.A0i;
        AnonymousClass9bR r102 = brazilPaymentSettingsFragment.A05;
        C1906899l r92 = brazilPaymentSettingsFragment.A0c;
        AnonymousClass9TR r82 = brazilPaymentSettingsFragment.A0F;
        AnonymousClass9U5 r72 = brazilPaymentSettingsFragment.A0k;
        C203499no r62 = brazilPaymentSettingsFragment.A0C;
        AnonymousClass9WM r52 = brazilPaymentSettingsFragment.A07;
        C40602Ha r42 = brazilPaymentSettingsFragment.A0f;
        AnonymousClass9W3 r32 = brazilPaymentSettingsFragment.A0E;
        AnonymousClass9VU r210 = brazilPaymentSettingsFragment.A0A;
        AnonymousClass4FS r36 = r172;
        AnonymousClass9U5 r272 = r72;
        AnonymousClass9WM r282 = r52;
        AnonymousClass9U4 r292 = r122;
        C194089Rn r302 = r132;
        AnonymousClass9VU r312 = r210;
        AnonymousClass9bR r222 = r102;
        C1906899l r232 = r92;
        C194479Ta r242 = brazilPaymentSettingsFragment.A06;
        C40602Ha r252 = r42;
        C620933l r262 = r112;
        return new AnonymousClass9ET(r19, r182, (C89644eZ) brazilPaymentSettingsFragment.A0R(), r202, r152, r222, r232, r242, r252, r262, r272, r282, r292, r302, r312, r62, r32, r82, brazilPaymentSettingsFragment, r36);
    }

    public C1902394t A1V() {
        if (this instanceof IndiaUpiPaymentSettingsFragment) {
            IndiaUpiPaymentSettingsFragment indiaUpiPaymentSettingsFragment = (IndiaUpiPaymentSettingsFragment) this;
            IndiaPaymentSettingsViewModel indiaPaymentSettingsViewModel = indiaUpiPaymentSettingsFragment.A0T;
            if (indiaPaymentSettingsViewModel != null) {
                return indiaPaymentSettingsViewModel;
            }
            IndiaPaymentSettingsViewModel indiaPaymentSettingsViewModel2 = (IndiaPaymentSettingsViewModel) new AnonymousClass0XL(indiaUpiPaymentSettingsFragment).A01(IndiaPaymentSettingsViewModel.class);
            indiaUpiPaymentSettingsFragment.A0T = indiaPaymentSettingsViewModel2;
            return indiaPaymentSettingsViewModel2;
        } else if (!(this instanceof BrazilPaymentSettingsFragment)) {
            return null;
        } else {
            BrazilPaymentSettingsFragment brazilPaymentSettingsFragment = (BrazilPaymentSettingsFragment) this;
            C191599Fn r0 = brazilPaymentSettingsFragment.A0I;
            if (r0 != null) {
                return r0;
            }
            AnonymousClass9QM r4 = brazilPaymentSettingsFragment.A0J;
            C191599Fn r02 = (C191599Fn) AnonymousClass4L0.A0F(new C204759ps(brazilPaymentSettingsFragment.A0C, 5, r4), brazilPaymentSettingsFragment.A0R()).A01(C191599Fn.class);
            brazilPaymentSettingsFragment.A0I = r02;
            return r02;
        }
    }

    public CharSequence A1W() {
        C85204Fi A012;
        Context A0G2;
        if (this instanceof IndiaUpiPaymentSettingsFragment) {
            A012 = AnonymousClass1S3.A05;
            A0G2 = A0G();
        } else {
            BrazilPaymentSettingsFragment brazilPaymentSettingsFragment = (BrazilPaymentSettingsFragment) this;
            A012 = brazilPaymentSettingsFragment.A03.A01("BRL");
            A0G2 = brazilPaymentSettingsFragment.A0G();
        }
        return ((AnonymousClass1S3) A012).B6J(A0G2, 0);
    }

    public String A1X() {
        if (!(this instanceof IndiaUpiPaymentSettingsFragment)) {
            return null;
        }
        IndiaPaymentSettingsViewModel indiaPaymentSettingsViewModel = ((IndiaUpiPaymentSettingsFragment) this).A0T;
        C626936e.A06(indiaPaymentSettingsViewModel);
        switch (indiaPaymentSettingsViewModel.A0O()) {
            case 1:
                return "finish_setup";
            case 2:
                return "onboarding_banner";
            case 4:
                return "add_upi_number_banner";
            case 5:
                return "notify_verification_banner";
            case 6:
                return "scan_qr_code_banner";
            case 7:
                return "recovery_upin_upsell_banner";
            case 8:
                return "recovery_2fa_upsell_banner";
            case 10:
                return "warm_welcome_banner";
            case 11:
                return "recent_businesses";
            default:
                return null;
        }
    }

    public void A1Z() {
        AnonymousClass4FS r2 = this.A15;
        AnonymousClass9H2 r0 = this.A0p;
        if (r0 != null && r0.A06() == 1) {
            this.A0p.A0D(false);
        }
        Bundle A082 = AnonymousClass002.A08();
        A082.putString("com.whatsapp.support.DescribeProblemActivity.from", "payments:settings");
        C56492s4 r8 = this.A0P;
        AnonymousClass9H2 r3 = new AnonymousClass9H2(A082, (C89654ea) A0R(), this.A0N, this.A0O, r8, this.A01, (C166587yw) null, (C624034w) null, this.A0a, this.A0l, "payments:settings");
        this.A0p = r3;
        C18270x1.A0w(r3, r2);
    }

    public final void A1a() {
        C105365Uq A062 = this.A0U.A06(A1D(), "payment-settings");
        AnonymousClass4FS r4 = this.A15;
        AnonymousClass9Ge r1 = new AnonymousClass9Ge(this.A0S, this.A0Y, new AnonymousClass9OO(A062, this), this);
        this.A0t = r1;
        r4.BkL(r1, new C15910sA[0]);
    }

    public final void A1b() {
        C1902394t r2 = this.A0x;
        if (r2 != null) {
            r2.A0J(this.A0q, this.A0y);
        }
    }

    public void A1e(UserJid userJid, String str) {
        if (this instanceof IndiaUpiPaymentSettingsFragment) {
            IndiaUpiPaymentSettingsFragment indiaUpiPaymentSettingsFragment = (IndiaUpiPaymentSettingsFragment) this;
            indiaUpiPaymentSettingsFragment.A0K.A00(indiaUpiPaymentSettingsFragment.A1D(), userJid, (C153607bd) null, (C203339nX) null, indiaUpiPaymentSettingsFragment.A0i.A05());
            C003203q A0Q2 = indiaUpiPaymentSettingsFragment.A0Q();
            if (A0Q2 instanceof C89654ea) {
                Intent A082 = AnonymousClass0x9.A08(A0Q2, AnonymousClass9U4.A07(indiaUpiPaymentSettingsFragment.A0n).BCl());
                indiaUpiPaymentSettingsFragment.A12.A01(A082);
                A082.putExtra("extra_payment_preset_amount", str);
                AnonymousClass0x2.A0u(A082, userJid, "extra_jid");
                A082.putExtra("extra_is_pay_money_only", !indiaUpiPaymentSettingsFragment.A0n.A0B.A00.A08(C66663Mh.A0h));
                A082.putExtra("referral_screen", "send_again_contact");
                ((C89654ea) A0Q2).A6T(A082, true);
                return;
            }
            Log.e("India Payment's contact picker activity is null");
        }
    }

    public void A1f(String str) {
        int i;
        if (this instanceof BrazilPaymentSettingsFragment) {
            BrazilPaymentSettingsFragment brazilPaymentSettingsFragment = (BrazilPaymentSettingsFragment) this;
            C191599Fn r1 = brazilPaymentSettingsFragment.A0I;
            C626936e.A06(r1);
            AnonymousClass9W0 r0 = brazilPaymentSettingsFragment.A0y;
            if (r0 != null) {
                i = r0.A01;
            } else {
                i = 0;
            }
            int A0O2 = r1.A0O(i);
            if (A0O2 == 1) {
                brazilPaymentSettingsFragment.A1h(str, "payment_home.get_started");
            } else if (A0O2 == 2) {
                brazilPaymentSettingsFragment.A1n("payment_home.get_started", brazilPaymentSettingsFragment.A0H.A03("generic_context", false));
            } else if (A0O2 == 3) {
                brazilPaymentSettingsFragment.A1n("payment_home.recover_payments_registration", "brpay_p_account_recovery_eligibility_screen");
            }
        }
    }

    public void A1g(String str) {
        String str2;
        if (this instanceof IndiaUpiPaymentSettingsFragment) {
            IndiaUpiPaymentSettingsFragment indiaUpiPaymentSettingsFragment = (IndiaUpiPaymentSettingsFragment) this;
            boolean A0E2 = indiaUpiPaymentSettingsFragment.A0c.A0E();
            C1902394t r2 = indiaUpiPaymentSettingsFragment.A0x;
            if (!A0E2) {
                if (r2 != null) {
                    r2.A0L(indiaUpiPaymentSettingsFragment.A0q, 36, str);
                }
                indiaUpiPaymentSettingsFragment.A1q("settingsNewPayment", (String) null, 1, 4, true, false);
                return;
            }
            if (r2 != null) {
                int i = 38;
                if (TextUtils.equals("onboarding_banner", str)) {
                    i = 85;
                }
                indiaUpiPaymentSettingsFragment.A0x.A0K(indiaUpiPaymentSettingsFragment.A0q, Integer.valueOf(i), str);
            }
            Intent A082 = AnonymousClass0x9.A08(indiaUpiPaymentSettingsFragment.A1D(), IndiaUpiContactPicker.class);
            A082.putExtra("for_payments", true);
            if (TextUtils.equals("onboarding_banner", str)) {
                str2 = AnonymousClass000.A0V(".", "onboarding_banner", AnonymousClass000.A0l("payment_home"));
            } else {
                str2 = "new_payment";
            }
            A082.putExtra("referral_screen", str2);
            indiaUpiPaymentSettingsFragment.startActivityForResult(A082, 501);
            return;
        }
        C1902394t r22 = this.A0x;
        if (r22 != null) {
            r22.A0K(this.A0q, 38, str);
        }
        Intent A083 = AnonymousClass0x9.A08(A0R(), PaymentContactPicker.class);
        A083.putExtra("for_payments", true);
        A083.putExtra("referral_screen", "payment_home.new_payment");
        startActivityForResult(A083, 501);
    }

    public void A1h(String str, String str2) {
        if (this instanceof BrazilPaymentSettingsFragment) {
            BrazilPaymentSettingsFragment brazilPaymentSettingsFragment = (BrazilPaymentSettingsFragment) this;
            if (brazilPaymentSettingsFragment.A0H.A05.A03()) {
                brazilPaymentSettingsFragment.A0m(AnonymousClass0x9.A08(brazilPaymentSettingsFragment.A1D(), BrazilFbPayHubActivity.class));
                C1902394t r2 = brazilPaymentSettingsFragment.A0x;
                if (r2 != null) {
                    C1902394t.A01(brazilPaymentSettingsFragment.A0q, r2, 37);
                    return;
                }
                return;
            }
            brazilPaymentSettingsFragment.A1n(str2, brazilPaymentSettingsFragment.A0H.A03("generic_context", false));
            C1902394t r22 = brazilPaymentSettingsFragment.A0x;
            if (r22 != null) {
                r22.A0L(brazilPaymentSettingsFragment.A0q, 36, str);
            }
        }
    }

    public final void A1i(boolean z) {
        Class cls;
        C1902394t r2 = this.A0x;
        if (r2 != null) {
            AnonymousClass9VG r1 = this.A0q;
            int i = 45;
            if (z) {
                i = 46;
            }
            C1902394t.A01(r1, r2, i);
        }
        C003203q A0R2 = A0R();
        if (this instanceof IndiaUpiPaymentSettingsFragment) {
            cls = IndiaPaymentTransactionHistoryActivity.class;
        } else {
            cls = PaymentTransactionHistoryActivity.class;
        }
        Intent A082 = AnonymousClass0x9.A08(A0R2, cls);
        A082.putExtra("extra_show_requests", z);
        A082.putExtra("extra_payment_service_name", A1Y());
        A0m(A082);
    }

    public boolean A1k() {
        if (this instanceof BrazilPaymentSettingsFragment) {
            return true;
        }
        return false;
    }

    public boolean A1m() {
        if (this instanceof IndiaUpiPaymentSettingsFragment) {
            return false;
        }
        C620933l r1 = this.A0i;
        return AnonymousClass001.A1W(((r1.A01.A0H() - AnonymousClass0x2.A0B(r1.A03(), "payments_all_transactions_last_sync_time")) > TimeUnit.DAYS.toMillis(7) ? 1 : ((r1.A01.A0H() - AnonymousClass0x2.A0B(r1.A03(), "payments_all_transactions_last_sync_time")) == TimeUnit.DAYS.toMillis(7) ? 0 : -1)));
    }

    public void BXw() {
        this.A0u.A00(false);
    }

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return AnonymousClass001.A0R(layoutInflater, viewGroup, R.layout.f8nameremoved);
    }

    public void A0a() {
        super.A0a();
        AnonymousClass9bQ r2 = this.A0u;
        if (r2 != null) {
            AnonymousClass9H0 r1 = r2.A02;
            if (r1 != null) {
                r1.A0D(true);
            }
            r2.A02 = null;
            AnonymousClass4DI r12 = r2.A00;
            if (r12 != null) {
                r2.A09.A07(r12);
            }
        }
        AnonymousClass9H2 r13 = this.A0p;
        if (r13 != null) {
            r13.A0D(false);
        }
    }

    public void A0e() {
        super.A0e();
        C202469m4 r1 = this.A0d;
        if (r1 != null) {
            this.A0e.A07(r1);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0032, code lost:
        if (r3.A0c.A0C() == false) goto L_0x0034;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0f() {
        /*
            r3 = this;
            super.A0f()
            X.03q r1 = r3.A0R()
            boolean r0 = r1 instanceof X.C89654ea
            if (r0 == 0) goto L_0x0013
            X.4ea r1 = (X.C89654ea) r1
            r0 = 2131891993(0x7f121719, float:1.9418722E38)
            r1.Bp9(r0)
        L_0x0013:
            X.9bQ r1 = r3.A0u
            r0 = 1
            r1.A00(r0)
            android.view.View r2 = r3.A03
            boolean r0 = r3 instanceof com.whatsapp.payments.ui.IndiaUpiPaymentSettingsFragment
            if (r0 == 0) goto L_0x0034
            X.99n r0 = r3.A0m
            X.1VX r1 = r0.A02
            r0 = 783(0x30f, float:1.097E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 == 0) goto L_0x0034
            X.99l r0 = r3.A0c
            boolean r1 = r0.A0C()
            r0 = 1
            if (r1 != 0) goto L_0x0035
        L_0x0034:
            r0 = 0
        L_0x0035:
            int r0 = X.AnonymousClass001.A08(r0)
            r2.setVisibility(r0)
            X.9m4 r1 = r3.A0d
            if (r1 == 0) goto L_0x0045
            X.99j r0 = r3.A0e
            r0.A06(r1)
        L_0x0045:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.PaymentSettingsFragment.A0f():void");
    }

    public void A0p(Bundle bundle) {
        super.A0p(bundle);
        A13(true);
    }

    public void A0w(Bundle bundle, View view) {
        PaymentIncentiveViewModel paymentIncentiveViewModel;
        int i;
        C204249p3 A002;
        Drawable drawable;
        View view2 = view;
        this.A0E = C86664Kz.A0v(view2, R.id.nux_container);
        this.A04 = view2.findViewById(R.id.payment_nux_row_separator);
        Bundle bundle2 = this.A06;
        if (bundle2 != null) {
            this.A16 = bundle2.getString("referral_screen");
        }
        C194659Tz A052 = AnonymousClass9U4.A05(this.A0n);
        if (A052 == null || !C1899693i.A0w(A052.A07)) {
            paymentIncentiveViewModel = null;
        } else {
            paymentIncentiveViewModel = C1899593h.A0P(this);
        }
        this.A0w = paymentIncentiveViewModel;
        int i2 = 0;
        if (paymentIncentiveViewModel != null) {
            C205049qL.A03(A0V(), paymentIncentiveViewModel.A01, this, 60);
            PaymentIncentiveViewModel paymentIncentiveViewModel2 = this.A0w;
            paymentIncentiveViewModel2.A01.A0G(AnonymousClass9WE.A01(paymentIncentiveViewModel2.A06.A00()));
            PaymentIncentiveViewModel paymentIncentiveViewModel3 = this.A0w;
            paymentIncentiveViewModel3.A07.BkM(new C200649if(paymentIncentiveViewModel3, false));
        }
        C1902394t A1V = A1V();
        this.A0x = A1V;
        if (A1V != null) {
            C205049qL.A03(A0V(), A1V.A01, this, 61);
            C205049qL.A03(A0V(), this.A0x.A00, this, 62);
            if (bundle2 != null) {
                this.A0x.A0M(bundle2.getString("actual_deep_link"));
            }
        }
        this.A02 = view2.findViewById(R.id.fb_pay_hub_section_desc);
        View findViewById = view2.findViewById(R.id.fb_pay_hub);
        this.A00 = C06560Yg.A02(findViewById, R.id.pay_hub_add);
        this.A0I = C18300x5.A0G(findViewById, R.id.pay_hub_desc);
        this.A01 = C06560Yg.A02(findViewById, R.id.pay_hub_chevron);
        this.A05 = view2.findViewById(R.id.payment_setting_container);
        this.A08 = view2.findViewById(R.id.requests_separator);
        AnonymousClass9U4 r15 = this.A0n;
        AnonymousClass2T7 r25 = new AnonymousClass2T7();
        C620933l r14 = this.A0i;
        C1906899l r11 = this.A0c;
        AnonymousClass9U5 r10 = this.A0k;
        AnonymousClass9b0 r9 = this.A0o;
        C1906999m r8 = this.A0g;
        C29271iY r4 = this.A0j;
        C194539Ti r3 = this.A0b;
        C194489Tb r2 = this.A0h;
        AnonymousClass4FS r29 = this.A15;
        AnonymousClass9b0 r24 = r9;
        AnonymousClass9U4 r23 = r15;
        AnonymousClass9U5 r22 = r10;
        C29271iY r21 = r4;
        C620933l r20 = r14;
        C194489Tb r19 = r2;
        C1906999m r18 = r8;
        C1906899l r17 = r11;
        C194539Ti r16 = r3;
        C89644eZ r152 = (C89644eZ) A0R();
        this.A0u = new AnonymousClass9bQ(r152, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, this, this, this, r29, A1Y(), true);
        boolean z = false;
        if (bundle2 != null) {
            z = bundle2.getBoolean("extra_force_get_methods", false);
        }
        this.A0u.A01(A1m(), z);
        C194939Vd A1U = A1U();
        this.A0v = A1U;
        if (A1U != null) {
            A1U.A03 = this.A02.A0X(1724);
        }
        view2.findViewById(R.id.add_new_account).setOnClickListener(this);
        view2.findViewById(R.id.payment_support_container).setOnClickListener(this);
        View A022 = C06560Yg.A02(view2, R.id.send_payment_fab);
        this.A0A = A022;
        if (this instanceof BrazilPaymentSettingsFragment) {
            i = 1;
        } else {
            i = 0;
        }
        A022.setVisibility(AnonymousClass001.A08(i));
        this.A0A.setOnClickListener(this);
        if (A1k()) {
            C86604Kt.A1F(view2, R.id.payment_methods_container, 8);
            C86604Kt.A1F(view2, R.id.payment_history_separator, 8);
        }
        this.A0s = new AnonymousClass948(A0R(), this.A0r, this);
        ListView listView = (ListView) view2.findViewById(R.id.methods_list);
        this.A0H = listView;
        listView.setAdapter(this.A0s);
        this.A0H.setOnItemClickListener(new C204329pB(this, 2));
        this.A09 = C06560Yg.A02(view2, R.id.send_again_separator);
        this.A0G = C86654Ky.A0N(view2, R.id.send_again_container);
        this.A0J = (RecyclerView) C06560Yg.A02(view2, R.id.frequently_paid_contacts_row);
        boolean z2 = this instanceof IndiaUpiPaymentSettingsFragment;
        if (!z2 || !this.A02.A0X(3623)) {
            this.A09.setVisibility(8);
            this.A0G.setVisibility(8);
        } else {
            A1a();
        }
        this.A07 = C06560Yg.A02(view2, R.id.recent_merchants_separator);
        this.A0F = C86654Ky.A0N(view2, R.id.recent_merchants_container);
        this.A0K = (RecyclerView) C06560Yg.A02(view2, R.id.recent_merchants_contacts_row);
        if (!z2 || !this.A02.A0X(4291)) {
            this.A07.setVisibility(8);
            this.A0F.setVisibility(8);
        } else {
            IndiaUpiPaymentSettingsFragment indiaUpiPaymentSettingsFragment = (IndiaUpiPaymentSettingsFragment) this;
            C194819Up r153 = new C194819Up(indiaUpiPaymentSettingsFragment.A02);
            indiaUpiPaymentSettingsFragment.A0S = r153;
            AnonymousClass4FS r92 = indiaUpiPaymentSettingsFragment.A15;
            C191789Gl r102 = new C191789Gl(indiaUpiPaymentSettingsFragment.A0S, indiaUpiPaymentSettingsFragment.A0X, new AnonymousClass9NU(indiaUpiPaymentSettingsFragment), indiaUpiPaymentSettingsFragment, r153);
            indiaUpiPaymentSettingsFragment.A0R = r102;
            r92.BkL(r102, new C15910sA[0]);
        }
        TransactionsExpandableView transactionsExpandableView = (TransactionsExpandableView) view2.findViewById(R.id.payment_history_container);
        this.A11 = transactionsExpandableView;
        transactionsExpandableView.setTitle(C08310eF.A09(this).getString(R.string.f11nameremoved));
        this.A11.setSeeMoreView(C08310eF.A09(this).getString(R.string.f11nameremoved), C08310eF.A09(this).getString(R.string.f11nameremoved), C204249p3.A00(this, 110));
        View inflate = A0I().inflate(R.layout.f8nameremoved, (ViewGroup) null, false);
        this.A11.setCustomEmptyView(inflate);
        C107335b8.A0E(AnonymousClass0x9.A0F(inflate, R.id.payment_nux_logo), C08310eF.A09(this).getColor(R.color.f5nameremoved));
        this.A0B = C86654Ky.A0L(view2, R.id.recurring_payment_container);
        this.A0D = (FrameLayout) view2.findViewById(R.id.payment_custom_header_row);
        this.A0C = (FrameLayout) view2.findViewById(R.id.custom_footer_container);
        this.A06 = view2.findViewById(R.id.payment_custom_header_row_separator);
        TransactionsExpandableView transactionsExpandableView2 = (TransactionsExpandableView) view2.findViewById(R.id.requests_container);
        this.A10 = transactionsExpandableView2;
        transactionsExpandableView2.setSeeMoreView(C08310eF.A09(this).getString(R.string.f11nameremoved), C08310eF.A09(this).getString(R.string.f11nameremoved), C204249p3.A00(this, 111));
        AnonymousClass9P5 r93 = new AnonymousClass9P5(A0R());
        r93.A00 = 2;
        TransactionsExpandableView transactionsExpandableView3 = this.A11;
        transactionsExpandableView3.A00 = r93;
        TransactionsExpandableView transactionsExpandableView4 = this.A10;
        transactionsExpandableView4.A00 = r93;
        transactionsExpandableView3.setPaymentRequestActionCallback(this);
        transactionsExpandableView4.setPaymentRequestActionCallback(this);
        View findViewById2 = view2.findViewById(R.id.invite_container);
        this.A03 = findViewById2;
        if (z2) {
            A002 = C204249p3.A00(this, 67);
        } else {
            A002 = C204249p3.A00(this, 109);
        }
        findViewById2.setOnClickListener(A002);
        C003203q A0R2 = A0R();
        int A003 = C195219Wq.A00(this.A0l.A02());
        if (A003 != 0) {
            drawable = AnonymousClass0RP.A00(A0R2, A003);
        } else {
            drawable = null;
        }
        TextView A092 = AnonymousClass002.A09(view2, R.id.payments_drawable_text_view);
        ImageView A0F2 = AnonymousClass0x9.A0F(view2, R.id.payments_drawable_image_view);
        if (drawable != null) {
            A0F2.setImageDrawable(drawable);
            A092.setVisibility(8);
            A0F2.setVisibility(0);
        } else {
            A092.setText(A1W());
            A092.setVisibility(0);
            A0F2.setVisibility(8);
        }
        View findViewById3 = view2.findViewById(R.id.payments_settings_scroll_view_layout);
        ViewGroup viewGroup = (ViewGroup) view2.findViewById(R.id.send_payment_fab);
        View findViewById4 = view2.findViewById(R.id.payments_text_view);
        LayoutTransition layoutTransition = viewGroup.getLayoutTransition();
        layoutTransition.setInterpolator(0, new AnonymousClass088());
        layoutTransition.setInterpolator(1, new AnonymousClass088());
        layoutTransition.setDuration(150);
        View A023 = C06560Yg.A02(view2, R.id.payment_support_section);
        View A024 = C06560Yg.A02(view2, R.id.payment_support_section_separator);
        A023.setVisibility(AnonymousClass001.A08(A1j() ? 1 : 0));
        if (!A1j()) {
            i2 = 8;
        }
        A024.setVisibility(i2);
        findViewById3.getViewTreeObserver().addOnScrollChangedListener(new AnonymousClass9Y4(findViewById3, findViewById4, viewGroup, this));
        int A042 = AnonymousClass0Y8.A04(A0R(), R.color.f5nameremoved);
        C1899593h.A0m(view2, R.id.change_pin_icon, A042);
        C1899593h.A0m(view2, R.id.add_new_account_icon, A042);
        C1899593h.A0m(view2, R.id.payment_support_icon, A042);
        C107335b8.A0E(this.A11.A04, A042);
        C107335b8.A0E(this.A10.A04, A042);
        C1899593h.A0m(view2, R.id.fingerprint_setting_icon, A042);
        C1899593h.A0m(view2, R.id.invite_icon, A042);
        C1899593h.A0m(view2, R.id.payment_settings_icon, A042);
    }

    public boolean A1B(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            C003203q A0R2 = A0R();
            if (A0R2 instanceof AnonymousClass9C6) {
                A0R2.finish();
                if (A0R2.isTaskRoot()) {
                    Intent A022 = C627736r.A02(A0R2);
                    A0R2.finishAndRemoveTask();
                    A0R2.startActivity(A022);
                }
            }
            return true;
        } else if (menuItem.getItemId() != R.id.menuitem_debug) {
            return false;
        } else {
            String BAm = this.A0n.A0G().BAm();
            if (TextUtils.isEmpty(BAm)) {
                return false;
            }
            A0m(C18320x8.A07().setClassName(A0R(), BAm));
            return true;
        }
    }

    public void A1d(Intent intent) {
        Bundle extras = intent.getExtras();
        boolean z = false;
        if (extras != null) {
            z = extras.getBoolean("extra_force_get_methods", false);
        }
        this.A0u.A01(A1m(), z);
    }

    public String B9i(C166587yw r2) {
        if (C195169Wk.A04(A0R(), r2) != null) {
            return C195169Wk.A04(A0R(), r2);
        }
        return "";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x005a, code lost:
        if (r6.A0H.A02() != null) goto L_0x005d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x009b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Brm(java.util.List r8) {
        /*
            r7 = this;
            boolean r0 = r7.A16()
            if (r0 == 0) goto L_0x009a
            X.03q r0 = r7.A0Q()
            if (r0 == 0) goto L_0x009a
            r7.A17 = r8
            android.view.View r1 = r7.A05
            r0 = 0
            r1.setVisibility(r0)
            X.948 r0 = r7.A0s
            r0.A00 = r8
            r0.notifyDataSetChanged()
            android.view.View r5 = r7.A0B
            if (r5 == 0) goto L_0x008c
            r4 = 0
            r3 = 8
            boolean r0 = r7.A1k()
            if (r0 == 0) goto L_0x008c
            r0 = 2131432285(0x7f0b135d, float:1.8486323E38)
            X.C86604Kt.A1F(r5, r0, r3)
            r0 = 2131432282(0x7f0b135a, float:1.8486317E38)
            X.C86604Kt.A1F(r5, r0, r4)
            r0 = 2131432284(0x7f0b135c, float:1.8486321E38)
            X.C86604Kt.A1F(r5, r0, r4)
            r6 = r7
            boolean r0 = r7 instanceof com.whatsapp.payments.ui.BrazilPaymentSettingsFragment
            if (r0 == 0) goto L_0x005c
            com.whatsapp.payments.ui.BrazilPaymentSettingsFragment r6 = (com.whatsapp.payments.ui.BrazilPaymentSettingsFragment) r6
            X.99n r0 = r6.A0m
            boolean r0 = r0.A00()
            r2 = 1
            X.9Ty r1 = r6.A0H
            if (r0 == 0) goto L_0x00ac
            java.lang.String r0 = "p2p_context"
            java.lang.String r0 = r1.A03(r0, r4)
            if (r0 == 0) goto L_0x005c
            X.9Ty r0 = r6.A0H
            java.lang.String r0 = r0.A02()
            if (r0 != 0) goto L_0x005d
        L_0x005c:
            r2 = 0
        L_0x005d:
            r1 = 2131432281(0x7f0b1359, float:1.8486315E38)
            if (r2 != 0) goto L_0x009b
            X.C86604Kt.A1F(r5, r1, r3)
            r3 = 2131432280(0x7f0b1358, float:1.8486313E38)
            android.view.View r2 = r5.findViewById(r3)
            boolean r1 = r7.A1l()
            int r0 = X.C86614Ku.A01(r1)
            r2.setVisibility(r0)
            android.view.View r0 = r5.findViewById(r3)
            r0.setOnClickListener(r7)
            r0 = 2131432283(0x7f0b135b, float:1.848632E38)
            android.view.View r0 = r5.findViewById(r0)
            if (r1 != 0) goto L_0x0089
            r4 = 8
        L_0x0089:
            r0.setVisibility(r4)
        L_0x008c:
            android.widget.ListView r0 = r7.A0H
            X.C192759Ll.A00(r0)
            X.94t r0 = r7.A0x
            if (r0 == 0) goto L_0x0097
            r0.A02 = r8
        L_0x0097:
            r7.A1b()
        L_0x009a:
            return
        L_0x009b:
            X.C86604Kt.A1F(r5, r1, r4)
            r0 = 2131432280(0x7f0b1358, float:1.8486313E38)
            X.C86604Kt.A1F(r5, r0, r3)
            android.view.View r0 = r5.findViewById(r1)
            r0.setOnClickListener(r7)
            goto L_0x008c
        L_0x00ac:
            X.9TR r0 = r1.A05
            boolean r0 = r0.A03()
            r2 = r0 ^ 1
            goto L_0x005d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.PaymentSettingsFragment.Brm(java.util.List):void");
    }

    public void Brv(List list) {
        String quantityString;
        if (A16() && A0Q() != null) {
            this.A18 = list;
            this.A05.setVisibility(0);
            if (this.A18.isEmpty()) {
                this.A08.setVisibility(8);
                this.A10.setVisibility(8);
                return;
            }
            this.A10.setVisibility(0);
            this.A08.setVisibility(0);
            this.A10.A01(this.A18);
            TransactionsExpandableView transactionsExpandableView = this.A10;
            List list2 = this.A18;
            if (this instanceof IndiaUpiPaymentSettingsFragment) {
                quantityString = C08310eF.A09(this).getString(R.string.f11nameremoved);
            } else {
                quantityString = C08310eF.A09(this).getQuantityString(R.plurals.f9nameremoved, list2.size());
            }
            transactionsExpandableView.setTitle(quantityString);
        }
    }

    public void Bs5(List list) {
        if (A16() && A0Q() != null) {
            this.A19 = list;
            this.A05.setVisibility(0);
            this.A11.A01(this.A19);
            if (!(this instanceof IndiaUpiPaymentSettingsFragment) || !this.A02.A0X(3623)) {
                this.A09.setVisibility(8);
                this.A0G.setVisibility(8);
                return;
            }
            A1a();
        }
    }

    public void onClick(View view) {
        if (view.getId() == R.id.payment_support_container) {
            C1902394t r2 = this.A0x;
            if (r2 != null) {
                C1902394t.A01(this.A0q, r2, 39);
            }
            A1Z();
        } else if (view.getId() == R.id.send_payment_fab) {
            if (!this.A0Q.A00()) {
                RequestPermissionActivity.A0j(this, R.string.f11nameremoved, R.string.f11nameremoved);
            } else {
                A1g((String) null);
            }
        } else if (view.getId() == R.id.add_new_account || view.getId() == R.id.payment_settings_row_add_method) {
            BMA(AnonymousClass000.A1T(this.A0s.getCount()));
        } else if (view.getId() == R.id.payment_settings_row) {
            A1h((String) null, "payment_home.add_payment_method");
        }
    }

    public void A0y(Menu menu, MenuInflater menuInflater) {
    }

    public /* synthetic */ void Boj(C166587yw r1, PaymentMethodRow paymentMethodRow) {
    }

    public String A1Y() {
        return null;
    }

    public boolean A1j() {
        return true;
    }

    public boolean A1l() {
        return false;
    }

    public /* synthetic */ boolean BoR() {
        return false;
    }

    public /* synthetic */ int B9g(C166587yw r2) {
        return 0;
    }

    public /* synthetic */ String B9j(C166587yw r2) {
        return null;
    }

    public /* synthetic */ boolean BoB(C166587yw r2) {
        return false;
    }
}
