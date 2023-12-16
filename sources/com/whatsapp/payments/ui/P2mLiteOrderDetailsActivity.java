package com.whatsapp.payments.ui;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass0R8;
import X.AnonymousClass0XL;
import X.AnonymousClass0x9;
import X.AnonymousClass11I;
import X.AnonymousClass1Hf;
import X.AnonymousClass1VX;
import X.AnonymousClass213;
import X.AnonymousClass2BO;
import X.AnonymousClass2YZ;
import X.AnonymousClass2z0;
import X.AnonymousClass303;
import X.AnonymousClass32Y;
import X.AnonymousClass357;
import X.AnonymousClass36F;
import X.AnonymousClass38Y;
import X.AnonymousClass39L;
import X.AnonymousClass39S;
import X.AnonymousClass39W;
import X.AnonymousClass3H6;
import X.AnonymousClass3Z6;
import X.AnonymousClass3ZH;
import X.AnonymousClass456;
import X.AnonymousClass4C1;
import X.AnonymousClass4DV;
import X.AnonymousClass4FS;
import X.AnonymousClass4G9;
import X.AnonymousClass4I7;
import X.AnonymousClass4KR;
import X.AnonymousClass5V0;
import X.AnonymousClass5WY;
import X.AnonymousClass5ZU;
import X.AnonymousClass9QL;
import X.AnonymousClass9RH;
import X.AnonymousClass9U4;
import X.AnonymousClass9b0;
import X.C103255Me;
import X.C106715a2;
import X.C107395bF;
import X.C159127lA;
import X.C15940sD;
import X.C161447pg;
import X.C162457s7;
import X.C171658Hx;
import X.C17190ui;
import X.C18270x1;
import X.C18280x3;
import X.C18290x4;
import X.C18320x8;
import X.C1905597z;
import X.C1907099n;
import X.C19340zH;
import X.C194069Rl;
import X.C194229Sb;
import X.C194309Sj;
import X.C195219Wq;
import X.C197419d8;
import X.C203469nk;
import X.C29271iY;
import X.C29431io;
import X.C29561jt;
import X.C30791n7;
import X.C44522Wj;
import X.C46782cC;
import X.C47752dl;
import X.C52622lm;
import X.C53202mi;
import X.C54522or;
import X.C55942rA;
import X.C56422rx;
import X.C56612sH;
import X.C57062t0;
import X.C58422vE;
import X.C60482yd;
import X.C617932g;
import X.C620633i;
import X.C620733j;
import X.C620933l;
import X.C63713Ai;
import X.C64773Ex;
import X.C66473Lo;
import X.C66543Lv;
import X.C69263Wi;
import X.C69943Zg;
import X.C70233aA;
import X.C73723fy;
import X.C73813g7;
import X.C95814uZ;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.R;
import com.whatsapp.base.WaFragment;
import com.whatsapp.jid.UserJid;
import com.whatsapp.payments.ui.compliance.ConfirmDateOfBirthBottomSheetFragment;
import com.whatsapp.payments.ui.compliance.ConfirmLegalNameBottomSheetFragment;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.json.JSONObject;

public final class P2mLiteOrderDetailsActivity extends C1905597z implements C203469nk {
    public AnonymousClass5WY A00;
    public C64773Ex A01;
    public C56422rx A02;
    public AnonymousClass5ZU A03;
    public C66473Lo A04;
    public C66543Lv A05;
    public C29431io A06;
    public AnonymousClass36F A07;
    public AnonymousClass3ZH A08;
    public C53202mi A09;
    public C620933l A0A;
    public C29271iY A0B;
    public C1907099n A0C;
    public AnonymousClass9U4 A0D;
    public AnonymousClass9b0 A0E;
    public C194309Sj A0F;
    public AnonymousClass9RH A0G;
    public C171658Hx A0H;
    public C44522Wj A0I;
    public C197419d8 A0J;
    public C46782cC A0K;
    public C29561jt A0L;
    public C194229Sb A0M;
    public C195219Wq A0N;
    public C55942rA A0O;
    public C106715a2 A0P;
    public C54522or A0Q;
    public C60482yd A0R;
    public Integer A0S;
    public WeakReference A0T;
    public List A0U;
    public AnonymousClass4C1 A0V;
    public final C103255Me A0W = new C103255Me(this);

    public final void A77(PaymentBottomSheet paymentBottomSheet, C30791n7 r15, String str, String str2) {
        AnonymousClass39W r0;
        AnonymousClass39S r02;
        AnonymousClass39W r03;
        AnonymousClass39S r04;
        Integer num = null;
        A76(C57062t0.A00(), r15, (Integer) null, "enter_dob", str2, 0);
        String str3 = null;
        if (!(r15 == null || (r03 = r15.A00) == null || (r04 = r03.A01) == null)) {
            num = Integer.valueOf(r04.A02());
        }
        String A012 = C57062t0.A01(num);
        if (!(r15 == null || (r0 = r15.A00) == null || (r02 = r0.A01) == null)) {
            str3 = r02.A04();
        }
        P2mLiteConfirmDateOfBirthBottomSheetFragment p2mLiteConfirmDateOfBirthBottomSheetFragment = new P2mLiteConfirmDateOfBirthBottomSheetFragment();
        Bundle A082 = AnonymousClass002.A08();
        A082.putString("extra_payment_config_id", str3);
        A082.putString("extra_order_type", A012);
        p2mLiteConfirmDateOfBirthBottomSheetFragment.A0u(A082);
        p2mLiteConfirmDateOfBirthBottomSheetFragment.A07 = new C617932g(p2mLiteConfirmDateOfBirthBottomSheetFragment, this, paymentBottomSheet, r15, str);
        if (paymentBottomSheet == null) {
            PaymentBottomSheet A002 = PaymentBottomSheet.A00();
            this.A0T = AnonymousClass0x9.A14(A002);
            A002.A1c(p2mLiteConfirmDateOfBirthBottomSheetFragment);
            Boo(A002);
            return;
        }
        paymentBottomSheet.A1b(p2mLiteConfirmDateOfBirthBottomSheetFragment);
    }

    public final void A78(C30791n7 r13, String str) {
        C19340zH A002 = AnonymousClass5V0.A00(this);
        A002.A0U(R.string.f11nameremoved);
        A002.A0T(R.string.f11nameremoved);
        A002.A0i(false);
        A002.A0X(new AnonymousClass4I7(this, r13, str, 1), R.string.f11nameremoved);
        A002.A0Y(new AnonymousClass4I7(this, r13, str, 2), R.string.f11nameremoved);
        String A0l = C18290x4.A0l(this, R.string.f11nameremoved);
        AnonymousClass303 A003 = C57062t0.A00();
        A003.A03("payments_error_code", "10755");
        A003.A03("payments_error_text", A0l);
        A76(A003, r13, (Integer) null, "error_dialog", str, 0);
        A002.A0S();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0021, code lost:
        if (r0.intValue() != 1) goto L_0x0023;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A79(X.C30791n7 r11, boolean r12) {
        /*
            r10 = this;
            r2 = r11
            if (r11 == 0) goto L_0x0032
            X.39W r0 = r11.A00
            if (r0 == 0) goto L_0x0023
            X.39S r0 = r0.A01
            if (r0 == 0) goto L_0x0023
            X.39H r0 = r0.A07
            if (r0 == 0) goto L_0x0023
            java.lang.String r0 = r0.A01
            int r0 = X.AnonymousClass39S.A00(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            if (r0 == 0) goto L_0x0023
            int r1 = r0.intValue()
            r0 = 1
            r6 = 4
            if (r1 == r0) goto L_0x0025
        L_0x0023:
            r6 = 11
        L_0x0025:
            X.2rA r1 = r10.A0O
            if (r1 == 0) goto L_0x0033
            r7 = 1
            r3 = 0
            r9 = 0
            r5 = r3
            r8 = r12
            r4 = r3
            r1.A02(r2, r3, r4, r5, r6, r7, r8, r9)
        L_0x0032:
            return
        L_0x0033:
            java.lang.String r0 = "orderDetailsMessageLogging"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.P2mLiteOrderDetailsActivity.A79(X.1n7, boolean):void");
    }

    public final void A7A(String str, String str2, String str3) {
        AnonymousClass4G9 r2;
        C159127lA r1;
        C44522Wj r0 = this.A0I;
        if (r0 != null) {
            C161447pg A002 = r0.A00(str);
            if (A002 == null || (r1 = A002.A00) == null) {
                r2 = null;
            } else {
                r2 = (AnonymousClass4G9) r1.A00("native_p2m_lite_compliance");
            }
            AnonymousClass3Z6[] r12 = new AnonymousClass3Z6[2];
            AnonymousClass3Z6.A09("account_compliance_status", str2, r12, 0);
            AnonymousClass3Z6.A09("last_screen", str3, r12, 1);
            Map A0F2 = C73813g7.A0F(r12);
            if (r2 != null) {
                r2.B3J(A0F2);
                return;
            }
            return;
        }
        throw C18270x1.A0S("phoenixManagerRegistry");
    }

    public void BXS(AnonymousClass213 r14, AnonymousClass9QL r15) {
        AnonymousClass213 r7 = r14;
        int A1W = C18290x4.A1W(r14);
        C47752dl r4 = AnonymousClass2BO.A00;
        Resources resources = getResources();
        C162457s7.A0D(resources);
        AnonymousClass1VX r2 = this.A0D;
        C162457s7.A0C(r2);
        String A002 = r4.A00(resources, r2, new Object[A1W], R.array.f2nameremoved);
        AnonymousClass0R8 supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.A0J(A002);
        }
        this.A04.BkP(new C70233aA(this, r14, r15));
        A75().A05.A02(this, this.A01, r7, r15, A75().A0A, (List) null, 4, r15.A00);
    }

    public void BbI(AnonymousClass39L r11) {
        String str;
        String str2;
        Integer num;
        List<AnonymousClass38Y> list;
        C95814uZ r0;
        C162457s7.A0J(r11, 0);
        LinkedHashMap A0r = C18320x8.A0r();
        String str3 = A75().A0D;
        String str4 = A75().A0E;
        AnonymousClass3ZH r02 = this.A08;
        if (r02 == null || (r0 = r02.A0H) == null) {
            str = null;
        } else {
            str = r0.getRawString();
        }
        if (str3 != null && str4 != null && str != null) {
            A0r.put("action", "start");
            A0r.put("order_id", str3);
            A0r.put("order_message_id", A75().A09.A01);
            double doubleValue = r11.A02.A00.doubleValue();
            int i = r11.A00;
            A0r.put("order_amount", Long.valueOf((long) (doubleValue * ((double) i))));
            A0r.put("order_amount_offset", Integer.valueOf(i));
            A0r.put("order_currency", ((AnonymousClass3H6) r11.A01).A04);
            if (A75().A00 != 0) {
                A0r.put("order_expiration_timestamp", Long.valueOf(A75().A00));
            }
            A0r.put("order_payment_config", str4);
            A0r.put("seller_jid", str);
            A0r.put("request_id", C18280x3.A0Y());
            A0r.put("referral", "order_details");
            Integer num2 = this.A0S;
            if (num2 != null) {
                int intValue = num2.intValue();
                if (1 == intValue) {
                    str2 = "digital-goods";
                } else if (2 == intValue) {
                    str2 = "physical-goods";
                } else {
                    str2 = "unknown";
                }
            } else {
                str2 = "unknown";
            }
            A0r.put("order_type", str2);
            if (this.A0D.A0Y(C58422vE.A02, 3012) && (num = this.A0S) != null && 2 == num.intValue() && (list = this.A0U) != null) {
                ArrayList A0s = AnonymousClass001.A0s();
                for (AnonymousClass38Y r5 : list) {
                    JSONObject A1G = AnonymousClass0x9.A1G();
                    A1G.put(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, r5.A04);
                    A1G.put("address_line1", r5.A00);
                    String str5 = r5.A01;
                    if (str5.length() != 0) {
                        A1G.put("address_line2", str5);
                    }
                    String str6 = r5.A02;
                    if (str6.length() != 0) {
                        A1G.put("city", str6);
                    }
                    String str7 = r5.A06;
                    if (str7.length() != 0) {
                        A1G.put("state", str7);
                    }
                    A1G.put("country", r5.A03);
                    A1G.put("postal_code", r5.A05);
                    A0s.add(A1G);
                }
                A0r.put("order_beneficiaries", C73723fy.A0A(", ", C18290x4.A12(A0s), AnonymousClass456.A00));
            }
            C52622lm r7 = new C52622lm("p2m_lite_checkout", (String) null, A0r);
            Bp9(R.string.f11nameremoved);
            C620933l r03 = this.A0A;
            if (r03 != null) {
                C18270x1.A0l(C620933l.A00(r03), "has_p2mlite_account", true);
                AnonymousClass4C1 r04 = this.A0V;
                if (r04 != null) {
                    ((AnonymousClass2YZ) r04.get()).A00(new AnonymousClass4KR(this, 2), new AnonymousClass357(this, 1), r7, "order_details", (Map) null);
                    return;
                }
                throw C18270x1.A0S("paymentsPhoenixManager");
            }
            throw C18270x1.A0S("paymentSharedPrefs");
        }
    }

    public static final /* synthetic */ void A0C(WaFragment waFragment, P2mLiteOrderDetailsActivity p2mLiteOrderDetailsActivity, PaymentBottomSheet paymentBottomSheet, PaymentBottomSheet paymentBottomSheet2, C30791n7 r6, String str, String str2, int i) {
        if (i == 10755) {
            if (paymentBottomSheet != null) {
                paymentBottomSheet.A1K();
            }
            p2mLiteOrderDetailsActivity.A78(r6, str2);
            p2mLiteOrderDetailsActivity.A7A(str, "BLOCKED", "enter_dob");
        } else if (i != 10756) {
            if (waFragment instanceof P2mLiteConfirmLegalNameBottomSheetFragment) {
                ((ConfirmLegalNameBottomSheetFragment) waFragment).A1L(true);
            } else if (waFragment instanceof P2mLiteConfirmDateOfBirthBottomSheetFragment) {
                ((ConfirmDateOfBirthBottomSheetFragment) waFragment).A1K(true);
            }
            C19340zH A002 = AnonymousClass5V0.A00(p2mLiteOrderDetailsActivity);
            A002.A0i(false);
            A002.A0T(R.string.f11nameremoved);
            C19340zH.A06(A002);
            C18280x3.A0q(A002);
        } else {
            p2mLiteOrderDetailsActivity.A77(paymentBottomSheet2, r6, str, str2);
        }
    }

    public final C66543Lv A74() {
        C66543Lv r0 = this.A05;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("coreMessageStore");
    }

    public final C197419d8 A75() {
        C197419d8 r0 = this.A0J;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("orderDetailsCoordinator");
    }

    public final void A76(AnonymousClass303 r11, C30791n7 r12, Integer num, String str, String str2, int i) {
        Integer num2;
        AnonymousClass39W r0;
        AnonymousClass39S r02;
        AnonymousClass39W r03;
        AnonymousClass39S r04;
        C171658Hx r1 = this.A0H;
        if (r1 != null) {
            String str3 = null;
            if (r12 == null || (r03 = r12.A00) == null || (r04 = r03.A01) == null) {
                num2 = null;
            } else {
                num2 = Integer.valueOf(r04.A02());
            }
            String A012 = C57062t0.A01(num2);
            if (!(r12 == null || (r0 = r12.A00) == null || (r02 = r0.A01) == null)) {
                str3 = r02.A04();
            }
            r1.A01(r11, num, str, str2, A012, str3, i, true);
            return;
        }
        throw C18270x1.A0S("p2mLiteEventLogger");
    }

    public String BBy() {
        AnonymousClass3ZH r1 = this.A08;
        if (r1 != null) {
            AnonymousClass5ZU r0 = this.A03;
            if (r0 != null) {
                String A0H2 = r0.A0H(r1);
                if (A0H2 == null) {
                    return "";
                }
                return A0H2;
            }
            throw C18270x1.A0S("waContactNames");
        }
        return "";
    }

    public void onCreate(Bundle bundle) {
        AnonymousClass3ZH r1;
        super.onCreate(bundle);
        C56612sH r4 = this.A06;
        C162457s7.A0C(r4);
        AnonymousClass1VX r7 = this.A0D;
        C162457s7.A0C(r7);
        C106715a2 r11 = this.A0P;
        if (r11 != null) {
            Resources resources = getResources();
            C162457s7.A0D(resources);
            C195219Wq r10 = this.A0N;
            if (r10 != null) {
                C620733j r5 = this.A00;
                C162457s7.A0C(r5);
                AnonymousClass9U4 r9 = this.A0D;
                if (r9 != null) {
                    C56422rx r3 = this.A02;
                    if (r3 != null) {
                        C1907099n r8 = this.A0C;
                        if (r8 != null) {
                            C66473Lo r6 = this.A04;
                            if (r6 != null) {
                                this.A0L = new C29561jt(resources, r3, r4, r5, r6, r7, r8, r9, r10, r11);
                                C56612sH r34 = this.A06;
                                AnonymousClass1VX r20 = this.A0D;
                                C69263Wi r33 = this.A05;
                                C106715a2 r12 = this.A0P;
                                C106715a2 r16 = r12;
                                if (r12 != null) {
                                    AnonymousClass4FS r18 = this.A04;
                                    C195219Wq r15 = this.A0N;
                                    if (r15 != null) {
                                        C620733j r32 = this.A00;
                                        C194229Sb r14 = this.A0M;
                                        if (r14 != null) {
                                            C64773Ex r13 = this.A01;
                                            if (r13 != null) {
                                                AnonymousClass9U4 r122 = this.A0D;
                                                if (r122 != null) {
                                                    C66543Lv A74 = A74();
                                                    C29431io r112 = this.A06;
                                                    if (r112 != null) {
                                                        C56422rx r102 = this.A02;
                                                        if (r102 != null) {
                                                            C1907099n r92 = this.A0C;
                                                            if (r92 != null) {
                                                                AnonymousClass36F r82 = this.A07;
                                                                if (r82 != null) {
                                                                    AnonymousClass9b0 r72 = this.A0E;
                                                                    if (r72 != null) {
                                                                        C66473Lo r62 = this.A04;
                                                                        if (r62 != null) {
                                                                            C55942rA r52 = this.A0O;
                                                                            if (r52 != null) {
                                                                                C29271iY r42 = this.A0B;
                                                                                if (r42 != null) {
                                                                                    C46782cC r35 = this.A0K;
                                                                                    if (r35 != null) {
                                                                                        C29561jt r2 = this.A0L;
                                                                                        if (r2 != null) {
                                                                                            C106715a2 r30 = r16;
                                                                                            AnonymousClass4FS r31 = r18;
                                                                                            C69263Wi r113 = r33;
                                                                                            C64773Ex r123 = r13;
                                                                                            C56422rx r132 = r102;
                                                                                            C56612sH r142 = r34;
                                                                                            C620733j r152 = r32;
                                                                                            C66473Lo r162 = r62;
                                                                                            this.A0J = new C197419d8(r113, r123, r132, r142, r152, r162, A74, r112, r82, r20, r42, r92, r122, r72, r35, r2, r14, r15, r52, r30, r31);
                                                                                            A75().A0A = "p2m_lite";
                                                                                            C56612sH r43 = this.A06;
                                                                                            C162457s7.A0C(r43);
                                                                                            AnonymousClass1VX r63 = this.A0D;
                                                                                            C162457s7.A0C(r63);
                                                                                            AnonymousClass4FS r133 = this.A04;
                                                                                            C162457s7.A0C(r133);
                                                                                            C620633i r36 = this.A08;
                                                                                            C162457s7.A0C(r36);
                                                                                            C29431io r53 = this.A06;
                                                                                            if (r53 != null) {
                                                                                                C56422rx r22 = this.A02;
                                                                                                if (r22 != null) {
                                                                                                    C29271iY r83 = this.A0B;
                                                                                                    if (r83 != null) {
                                                                                                        C46782cC r103 = this.A0K;
                                                                                                        if (r103 != null) {
                                                                                                            AnonymousClass2z0 A022 = C107395bF.A02(getIntent());
                                                                                                            Objects.requireNonNull(A022);
                                                                                                            C195219Wq r114 = this.A0N;
                                                                                                            if (r114 != null) {
                                                                                                                AnonymousClass9U4 r93 = this.A0D;
                                                                                                                if (r93 != null) {
                                                                                                                    A75().A00(this, this, (AnonymousClass11I) new AnonymousClass0XL((C17190ui) new C63713Ai(r22, r36, r43, r53, r63, (UserJid) null, r83, r93, r103, r114, A022, r133, false, false), (C15940sD) this).A01(AnonymousClass11I.class));
                                                                                                                    UserJid A052 = AnonymousClass32Y.A05(A75().A09.A00);
                                                                                                                    if (A052 != null) {
                                                                                                                        C66473Lo r17 = this.A04;
                                                                                                                        if (r17 != null) {
                                                                                                                            r1 = r17.A01(A052);
                                                                                                                        } else {
                                                                                                                            throw C18270x1.A0S("conversationContactManager");
                                                                                                                        }
                                                                                                                    } else {
                                                                                                                        r1 = null;
                                                                                                                    }
                                                                                                                    this.A08 = r1;
                                                                                                                    AnonymousClass1Hf.A2E(this);
                                                                                                                    setContentView((View) A75().A05);
                                                                                                                    return;
                                                                                                                }
                                                                                                                throw C18270x1.A0S("paymentsManager");
                                                                                                            }
                                                                                                            throw C18270x1.A0S("paymentsUtils");
                                                                                                        }
                                                                                                        throw C18270x1.A0S("paymentCheckoutOrderRepository");
                                                                                                    }
                                                                                                    throw C18270x1.A0S("paymentTransactionObservers");
                                                                                                }
                                                                                                throw C18270x1.A0S("verifiedNameManager");
                                                                                            }
                                                                                            throw C18270x1.A0S("messageObservers");
                                                                                        }
                                                                                        throw C18270x1.A0S("viewConfigurationFactory");
                                                                                    }
                                                                                    throw C18270x1.A0S("paymentCheckoutOrderRepository");
                                                                                }
                                                                                throw C18270x1.A0S("paymentTransactionObservers");
                                                                            }
                                                                            throw C18270x1.A0S("orderDetailsMessageLogging");
                                                                        }
                                                                        throw C18270x1.A0S("conversationContactManager");
                                                                    }
                                                                    throw C18270x1.A0S("paymentTransactionActions");
                                                                }
                                                                throw C18270x1.A0S("paymentTransactionStore");
                                                            }
                                                            throw C18270x1.A0S("paymentsGatingManager");
                                                        }
                                                        throw C18270x1.A0S("verifiedNameManager");
                                                    }
                                                    throw C18270x1.A0S("messageObservers");
                                                }
                                                throw C18270x1.A0S("paymentsManager");
                                            }
                                            throw C18270x1.A0S("contactManager");
                                        }
                                        throw C18270x1.A0S("paymentIntents");
                                    }
                                    throw C18270x1.A0S("paymentsUtils");
                                }
                                throw C18270x1.A0S("linkifier");
                            }
                            throw C18270x1.A0S("conversationContactManager");
                        }
                        throw C18270x1.A0S("paymentsGatingManager");
                    }
                    throw C18270x1.A0S("verifiedNameManager");
                }
                throw C18270x1.A0S("paymentsManager");
            }
            throw C18270x1.A0S("paymentsUtils");
        }
        throw C18270x1.A0S("linkifier");
    }

    public /* synthetic */ boolean BH6() {
        return false;
    }

    public boolean BIW() {
        return false;
    }

    public void onDestroy() {
        super.onDestroy();
        C54522or r0 = this.A0Q;
        if (r0 != null) {
            r0.A03(this);
        }
        this.A0Q = null;
    }

    public void onResume() {
        super.onResume();
        this.A04.BkP(new C69943Zg(this));
    }

    public void BPi(AnonymousClass39L r1, C95814uZ r2, C194069Rl r3, AnonymousClass4DV r4) {
    }

    public void BXT(AnonymousClass213 r1, AnonymousClass9QL r2) {
    }
}
