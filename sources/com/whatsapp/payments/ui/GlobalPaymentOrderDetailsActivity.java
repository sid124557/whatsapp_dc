package com.whatsapp.payments.ui;

import X.AnonymousClass0R8;
import X.AnonymousClass0XL;
import X.AnonymousClass11I;
import X.AnonymousClass1Hf;
import X.AnonymousClass1VX;
import X.AnonymousClass213;
import X.AnonymousClass23S;
import X.AnonymousClass2BO;
import X.AnonymousClass2z0;
import X.AnonymousClass32Y;
import X.AnonymousClass344;
import X.AnonymousClass36F;
import X.AnonymousClass399;
import X.AnonymousClass39L;
import X.AnonymousClass39S;
import X.AnonymousClass3ZH;
import X.AnonymousClass4DV;
import X.AnonymousClass4FS;
import X.AnonymousClass5ZU;
import X.AnonymousClass9QL;
import X.AnonymousClass9U4;
import X.AnonymousClass9b0;
import X.C106715a2;
import X.C107395bF;
import X.C15940sD;
import X.C160757oG;
import X.C162457s7;
import X.C17190ui;
import X.C18270x1;
import X.C18290x4;
import X.C1905497x;
import X.C1907099n;
import X.C194069Rl;
import X.C194229Sb;
import X.C195219Wq;
import X.C197419d8;
import X.C202799mb;
import X.C203469nk;
import X.C29271iY;
import X.C29431io;
import X.C29551jr;
import X.C29571ju;
import X.C30791n7;
import X.C46782cC;
import X.C47752dl;
import X.C55832qz;
import X.C55942rA;
import X.C56422rx;
import X.C56612sH;
import X.C58422vE;
import X.C620633i;
import X.C620733j;
import X.C620933l;
import X.C626936e;
import X.C63703Ah;
import X.C64773Ex;
import X.C66473Lo;
import X.C66543Lv;
import X.C69263Wi;
import X.C69913Zc;
import X.C95814uZ;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;
import com.whatsapp.payments.ui.instructions.PaymentCustomInstructionsBottomSheet;
import com.whatsapp.util.Log;
import java.util.List;
import java.util.Objects;

public final class GlobalPaymentOrderDetailsActivity extends C1905497x implements C203469nk, C202799mb {
    public C64773Ex A00;
    public C56422rx A01;
    public AnonymousClass5ZU A02;
    public C66473Lo A03;
    public C66543Lv A04;
    public C29431io A05;
    public AnonymousClass36F A06;
    public AnonymousClass3ZH A07;
    public C620933l A08;
    public C29271iY A09;
    public C1907099n A0A;
    public AnonymousClass9U4 A0B;
    public AnonymousClass9b0 A0C;
    public C29571ju A0D;
    public C197419d8 A0E;
    public C46782cC A0F;
    public C29551jr A0G;
    public C194229Sb A0H;
    public C195219Wq A0I;
    public C55942rA A0J;
    public C106715a2 A0K;
    public List A0L;

    public void BPf(C95814uZ r14) {
        C162457s7.A0J(r14, 0);
        long A082 = C18290x4.A08();
        C66543Lv r3 = this.A04;
        if (r3 != null) {
            C30791n7 r5 = (C30791n7) C55832qz.A00(r3, A74().A09);
            if (r5 != null) {
                if (this.A0G == null) {
                    throw C18270x1.A0S("viewModel");
                }
                AnonymousClass39S A002 = AnonymousClass11I.A00(r5, (String) null, "confirm", A082);
                C29551jr r0 = this.A0G;
                if (r0 == null) {
                    throw C18270x1.A0S("viewModel");
                }
                C626936e.A06(r14);
                r0.A0H(r14, A002, r5);
                C46782cC r02 = this.A0F;
                if (r02 != null) {
                    r02.A00(A002, r5);
                } else {
                    throw C18270x1.A0S("paymentCheckoutOrderRepository");
                }
            }
            C55942rA r4 = this.A0J;
            if (r4 != null) {
                C162457s7.A0K(r5, "null cannot be cast to non-null type com.whatsapp.protocol.message.FMessageInteractive");
                r4.A02(r5, (Integer) null, "cpi", (List) null, 19, false, false, true);
                finish();
                return;
            }
            throw C18270x1.A0S("orderDetailsMessageLogging");
        }
        throw C18270x1.A0S("coreMessageStore");
    }

    public void BPi(AnonymousClass39L r12, C95814uZ r13, C194069Rl r14, AnonymousClass4DV r15) {
        if (r14 != null) {
            int i = r14.A01;
            if (Integer.valueOf(i) == null) {
                return;
            }
            if (i == 3) {
                long A082 = C18290x4.A08();
                if (this.A0G == null) {
                    throw C18270x1.A0S("viewModel");
                }
                AnonymousClass4DV r3 = r15;
                AnonymousClass39S A002 = AnonymousClass11I.A00(r15, (String) null, "confirm", A082);
                C29551jr r0 = this.A0G;
                if (r0 == null) {
                    throw C18270x1.A0S("viewModel");
                }
                C626936e.A06(r13);
                r0.A0H(r13, A002, r15);
                C46782cC r02 = this.A0F;
                if (r02 != null) {
                    r02.A00(A002, r15);
                    C55942rA r2 = this.A0J;
                    if (r2 != null) {
                        r2.A02(r3, (Integer) null, "confirm", (List) null, 19, false, false, true);
                        finish();
                        return;
                    }
                    throw C18270x1.A0S("orderDetailsMessageLogging");
                }
                throw C18270x1.A0S("paymentCheckoutOrderRepository");
            } else if (i == 2) {
                AnonymousClass399 r03 = r14.A02;
                if (r03 == null) {
                    Log.e(C160757oG.A01("GlobalPaymentOrderDetailsActivity", "invalid external payemnt configuration payload"));
                    return;
                }
                C626936e.A06(r13);
                String str = r03.A00;
                C626936e.A06(str);
                C162457s7.A0D(str);
                C626936e.A06(r13);
                C626936e.A06(str);
                AnonymousClass344.A01(PaymentCustomInstructionsBottomSheet.A00(r13, str, "order_details", this.A0D.A0Y(C58422vE.A02, 1345)), getSupportFragmentManager());
            }
        }
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
        this.A04.BkP(new C69913Zc(this));
        A74().A05.A02(this, this.A01, r7, r15, A74().A0A, (List) null, 2, r15.A00);
    }

    public final C197419d8 A74() {
        C197419d8 r0 = this.A0E;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("orderDetailsCoordinator");
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AnonymousClass1VX r8 = this.A0D;
        C162457s7.A0C(r8);
        AnonymousClass4FS r14 = this.A04;
        C162457s7.A0C(r14);
        C29431io r7 = this.A05;
        if (r7 != null) {
            C56422rx r4 = this.A01;
            if (r4 != null) {
                C29271iY r9 = this.A09;
                if (r9 != null) {
                    C46782cC r11 = this.A0F;
                    if (r11 != null) {
                        AnonymousClass2z0 A022 = C107395bF.A02(getIntent());
                        Objects.requireNonNull(A022);
                        C195219Wq r12 = this.A0I;
                        if (r12 != null) {
                            AnonymousClass9U4 r10 = this.A0B;
                            if (r10 != null) {
                                C56612sH r6 = this.A06;
                                C162457s7.A0C(r6);
                                C620633i r5 = this.A08;
                                C162457s7.A0C(r5);
                                this.A0G = (C29551jr) new AnonymousClass0XL((C17190ui) new C63703Ah(r4, r5, r6, r7, r8, r9, r10, r11, r12, A022, r14), (C15940sD) this).A01(C29551jr.class);
                                C56612sH r62 = this.A06;
                                C162457s7.A0C(r62);
                                AnonymousClass1VX r52 = this.A0D;
                                C162457s7.A0C(r52);
                                C106715a2 r42 = this.A0K;
                                if (r42 != null) {
                                    Resources resources = getResources();
                                    C162457s7.A0D(resources);
                                    C195219Wq r3 = this.A0I;
                                    if (r3 != null) {
                                        C620733j r2 = this.A00;
                                        C162457s7.A0C(r2);
                                        AnonymousClass9U4 r0 = this.A0B;
                                        AnonymousClass9U4 r18 = r0;
                                        if (r0 != null) {
                                            C56422rx r02 = this.A01;
                                            C56422rx r17 = r02;
                                            if (r02 != null) {
                                                C1907099n r03 = this.A0A;
                                                C1907099n r16 = r03;
                                                if (r03 != null) {
                                                    C66473Lo r92 = this.A03;
                                                    if (r92 != null) {
                                                        C29571ju r19 = new C29571ju(resources, r17, r62, r2, r92, r52, r03, r18, r3, r42);
                                                        this.A0D = r19;
                                                        C56612sH r37 = this.A06;
                                                        AnonymousClass1VX r23 = this.A0D;
                                                        C69263Wi r36 = this.A05;
                                                        C106715a2 r13 = this.A0K;
                                                        if (r13 != null) {
                                                            AnonymousClass4FS r192 = this.A04;
                                                            C195219Wq r142 = this.A0I;
                                                            if (r142 != null) {
                                                                C620733j r35 = this.A00;
                                                                C194229Sb r15 = this.A0H;
                                                                if (r15 != null) {
                                                                    C64773Ex r122 = this.A00;
                                                                    if (r122 != null) {
                                                                        C66543Lv r112 = this.A04;
                                                                        if (r112 != null) {
                                                                            C29431io r102 = this.A05;
                                                                            if (r102 != null) {
                                                                                AnonymousClass36F r72 = this.A06;
                                                                                if (r72 != null) {
                                                                                    AnonymousClass9b0 r63 = this.A0C;
                                                                                    if (r63 != null) {
                                                                                        C55942rA r53 = this.A0J;
                                                                                        if (r53 != null) {
                                                                                            C29271iY r43 = this.A09;
                                                                                            if (r43 != null) {
                                                                                                C46782cC r22 = this.A0F;
                                                                                                if (r22 != null) {
                                                                                                    AnonymousClass3ZH r32 = null;
                                                                                                    AnonymousClass4FS r34 = r192;
                                                                                                    C1907099n r25 = r16;
                                                                                                    AnonymousClass9U4 r26 = r18;
                                                                                                    C69263Wi r143 = r36;
                                                                                                    C64773Ex r152 = r122;
                                                                                                    C56422rx r162 = r17;
                                                                                                    C56612sH r172 = r37;
                                                                                                    C620733j r182 = r35;
                                                                                                    this.A0E = new C197419d8(r143, r152, r162, r172, r182, r92, r112, r102, r72, r23, r43, r25, r26, r63, r22, r19, r15, r142, r53, r13, r34);
                                                                                                    A74().A0A = "GlobalPayment";
                                                                                                    C197419d8 A74 = A74();
                                                                                                    C29551jr r04 = this.A0G;
                                                                                                    if (r04 == null) {
                                                                                                        throw C18270x1.A0S("viewModel");
                                                                                                    }
                                                                                                    A74.A00(this, this, r04);
                                                                                                    UserJid A052 = AnonymousClass32Y.A05(A74().A09.A00);
                                                                                                    if (A052 != null) {
                                                                                                        C66473Lo r05 = this.A03;
                                                                                                        if (r05 != null) {
                                                                                                            r32 = r05.A01(A052);
                                                                                                        } else {
                                                                                                            throw C18270x1.A0S("conversationContactManager");
                                                                                                        }
                                                                                                    }
                                                                                                    this.A07 = r32;
                                                                                                    AnonymousClass1Hf.A2E(this);
                                                                                                    setContentView((View) A74().A05);
                                                                                                    return;
                                                                                                }
                                                                                                throw C18270x1.A0S("paymentCheckoutOrderRepository");
                                                                                            }
                                                                                            throw C18270x1.A0S("paymentTransactionObservers");
                                                                                        }
                                                                                        throw C18270x1.A0S("orderDetailsMessageLogging");
                                                                                    }
                                                                                    throw C18270x1.A0S("paymentTransactionActions");
                                                                                }
                                                                                throw C18270x1.A0S("paymentTransactionStore");
                                                                            }
                                                                            throw C18270x1.A0S("messageObservers");
                                                                        }
                                                                        throw C18270x1.A0S("coreMessageStore");
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

    public String BBy() {
        throw AnonymousClass23S.A00();
    }

    public /* synthetic */ boolean BH6() {
        return false;
    }

    public boolean BIW() {
        return false;
    }

    public void BXT(AnonymousClass213 r2, AnonymousClass9QL r3) {
        throw AnonymousClass23S.A00();
    }

    public void BbI(AnonymousClass39L r2) {
        throw AnonymousClass23S.A00();
    }
}
