package com.whatsapp.calling.avatar.viewmodel;

import X.AnonymousClass001;
import X.AnonymousClass0IV;
import X.AnonymousClass0x2;
import X.AnonymousClass0x9;
import X.AnonymousClass107;
import X.AnonymousClass1VX;
import X.AnonymousClass20D;
import X.AnonymousClass3Z6;
import X.AnonymousClass4GP;
import X.AnonymousClass4L0;
import X.AnonymousClass4UC;
import X.AnonymousClass4VK;
import X.AnonymousClass59B;
import X.AnonymousClass5AF;
import X.AnonymousClass5AG;
import X.AnonymousClass5MN;
import X.AnonymousClass5NO;
import X.AnonymousClass5ZG;
import X.AnonymousClass66R;
import X.AnonymousClass6C6;
import X.C05110Rz;
import X.C101725Fw;
import X.C101735Fx;
import X.C103425Mx;
import X.C118255tF;
import X.C124106Az;
import X.C15930sC;
import X.C162457s7;
import X.C18260x0;
import X.C18270x1;
import X.C18280x3;
import X.C18310x6;
import X.C185408tb;
import X.C51932kc;
import X.C56612sH;
import X.C57162tC;
import X.C616131n;
import X.C73153f1;
import X.C84814Du;
import X.C85474Gj;
import X.C85494Gl;
import X.C86604Kt;
import X.C86634Kw;
import X.C86654Ky;
import X.C91064ir;
import X.C91074is;
import X.C91084it;
import X.C91094iu;
import X.C91104iv;
import X.C91114iw;
import X.C91124ix;
import X.C91134iy;
import X.C91144iz;
import X.C91154j0;
import X.C91164j1;
import X.C97174xk;
import com.whatsapp.calling.avatar.CallAvatarARClassManager;
import com.whatsapp.calling.avatar.CallAvatarFLMConsentManager;
import com.whatsapp.calling.avatar.camera.InitializeAvatarEffectUseCase;
import com.whatsapp.calling.avatar.data.FetchAvatarEffectUseCase;
import java.util.concurrent.TimeUnit;

public final class CallAvatarViewModel extends AnonymousClass4VK implements C185408tb {
    public static final long A0M;
    public static final long A0N;
    public C85474Gj A00;
    public C85474Gj A01;
    public C85474Gj A02;
    public boolean A03;
    public final C15930sC A04;
    public final CallAvatarARClassManager A05;
    public final CallAvatarFLMConsentManager A06;
    public final AnonymousClass5NO A07;
    public final AnonymousClass5ZG A08;
    public final C101725Fw A09;
    public final InitializeAvatarEffectUseCase A0A;
    public final AnonymousClass5MN A0B;
    public final C103425Mx A0C;
    public final FetchAvatarEffectUseCase A0D;
    public final C101735Fx A0E;
    public final C97174xk A0F;
    public final C56612sH A0G;
    public final C57162tC A0H;
    public final AnonymousClass1VX A0I;
    public final C51932kc A0J;
    public final AnonymousClass107 A0K = AnonymousClass4L0.A0O(new C91164j1((C118255tF) null, false, false));
    public final AnonymousClass4UC A0L = AnonymousClass0x9.A0b();

    static {
        TimeUnit timeUnit = TimeUnit.DAYS;
        A0M = timeUnit.toMillis(10);
        A0N = C86654Ky.A09(timeUnit);
    }

    public CallAvatarViewModel(CallAvatarARClassManager callAvatarARClassManager, CallAvatarFLMConsentManager callAvatarFLMConsentManager, AnonymousClass5NO r13, AnonymousClass5ZG r14, C101725Fw r15, InitializeAvatarEffectUseCase initializeAvatarEffectUseCase, AnonymousClass5MN r17, C103425Mx r18, FetchAvatarEffectUseCase fetchAvatarEffectUseCase, C97174xk r20, C56612sH r21, C57162tC r22, AnonymousClass1VX r23, C51932kc r24) {
        Object r4;
        AnonymousClass5AF r1;
        C97174xk r2 = r20;
        C56612sH r5 = r21;
        AnonymousClass1VX r3 = r23;
        C18260x0.A0c(r5, r3, r2, r14);
        C51932kc r12 = r24;
        AnonymousClass0x2.A1B(r12, callAvatarARClassManager);
        C103425Mx r6 = r18;
        C86634Kw.A1S(callAvatarFLMConsentManager, r6);
        C57162tC r42 = r22;
        C162457s7.A0J(r42, 13);
        this.A0G = r5;
        this.A0I = r3;
        this.A0F = r2;
        this.A08 = r14;
        this.A07 = r13;
        this.A0D = fetchAvatarEffectUseCase;
        this.A0J = r12;
        this.A05 = callAvatarARClassManager;
        this.A0A = initializeAvatarEffectUseCase;
        this.A06 = callAvatarFLMConsentManager;
        this.A0C = r6;
        this.A09 = r15;
        this.A0H = r42;
        this.A0B = r17;
        AnonymousClass6C6 A002 = AnonymousClass6C6.A00(this, 56);
        this.A04 = A002;
        AnonymousClass66R r7 = this.A0C.A01;
        AnonymousClass3Z6 A012 = AnonymousClass3Z6.A01(C18310x6.A0F(r7).getString("pref_previous_call_id", (String) null), C18280x3.A02(C18310x6.A0F(r7), "pref_previous_view_state"));
        Object obj = A012.first;
        int A0K2 = AnonymousClass001.A0K(A012.second);
        C18260x0.A0w("voip/CallAvatarViewModel/maybeRestoreViewState previousViewState=", AnonymousClass001.A0o(), A0K2);
        if (C162457s7.A0P(obj, this.A0F.A08().A08)) {
            if (A0K2 != 1) {
                if (A0K2 == 2) {
                    r1 = C91074is.A00;
                } else if (A0K2 == 3) {
                    r1 = C91064ir.A00;
                } else if (A0K2 == 4) {
                    r1 = new C91084it(false);
                } else if (A0K2 != 5) {
                    r4 = new C91164j1((C118255tF) null, false, false);
                } else {
                    r1 = new C91084it(true);
                }
                r4 = new C91104iv(r1);
            } else {
                r4 = new C91144iz(false);
            }
            C18260x0.A1P(AnonymousClass001.A0o(), "voip/CallAvatarViewModel/maybeRestoreViewState Restoring ", r4);
            this.A0K.A0H(r4);
        }
        C18270x1.A0g(C18270x1.A04(r7).remove("pref_previous_call_id"), "pref_previous_view_state");
        r2.A06(this);
        C05110Rz.A01(C05110Rz.A00(new C124106Az(this, 1), this.A0K)).A0E(A002);
        this.A0E = new C101735Fx(this);
    }

    public void A0C() {
        C97174xk r3 = this.A0F;
        String str = r3.A08().A08;
        C162457s7.A0C(str);
        AnonymousClass107 r2 = this.A0K;
        AnonymousClass5AG r6 = (AnonymousClass5AG) C86634Kw.A0v(r2);
        C18260x0.A1P(AnonymousClass001.A0o(), "voip/CallAvatarViewModel/saveViewState currentState=", r6);
        int i = 1;
        if ((r6 instanceof C91164j1) || (r6 instanceof C91134iy) || (r6 instanceof C91094iu) || (r6 instanceof C91154j0) || (r6 instanceof C91114iw) || (r6 instanceof C91124ix)) {
            this.A08.A02(1);
            i = 0;
        } else if (!(r6 instanceof C91144iz)) {
            if (r6 instanceof C91104iv) {
                AnonymousClass5AF r1 = ((C91104iv) r6).A00;
                if (r1 instanceof C91074is) {
                    i = 2;
                } else if (r1 instanceof C91064ir) {
                    i = 3;
                } else if (r1 instanceof C91084it) {
                    i = 4;
                    if (((C91084it) r1).A00) {
                        i = 5;
                    }
                } else {
                    throw C73153f1.A00();
                }
            } else {
                throw C73153f1.A00();
            }
        }
        C18270x1.A0h(C18270x1.A04(this.A0C.A01).putString("pref_previous_call_id", str), "pref_previous_view_state", i);
        r3.A07(this);
        C05110Rz.A01(C05110Rz.A00(new C124106Az(this, 1), r2)).A0F(this.A04);
    }

    public final int A0G() {
        switch (this.A06.A00().ordinal()) {
            case 0:
                return 0;
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 99;
            default:
                throw C73153f1.A00();
        }
    }

    public final void A0H() {
        Object A002 = AnonymousClass4VK.A00(this, "voip/CallAvatarViewModel/onSwitchToAvatarTapped");
        if (!(A002 instanceof C91164j1)) {
            C18260x0.A1Q(AnonymousClass001.A0o(), "voip/CallAvatarViewModel/onSwitchToAvatarTapped Unexpected state=", A002);
            return;
        }
        String A0k = C86604Kt.A0k();
        this.A08.A04(1, A0G(), A0k, this.A05.A00);
        C616131n.A02((C85494Gl) null, new CallAvatarViewModel$onSwitchToAvatarTapped$1(this, A0k, (C84814Du) null), AnonymousClass0IV.A00(this), (AnonymousClass20D) null, 3);
    }

    public final void A0I(String str, boolean z) {
        this.A01 = C616131n.A02((C85494Gl) null, new CallAvatarViewModel$enableEffect$1(this, (AnonymousClass5AG) AnonymousClass4VK.A00(this, "voip/CallAvatarViewModel/enableEffect"), str, (C84814Du) null, z), AnonymousClass0IV.A00(this), (AnonymousClass20D) null, 3);
    }

    public final boolean A0J() {
        AnonymousClass107 r1 = this.A0K;
        if ((r1.A07() instanceof C91134iy) || (r1.A07() instanceof C91094iu) || (r1.A07() instanceof C91154j0) || (r1.A07() instanceof C91114iw) || (r1.A07() instanceof C91124ix)) {
            return true;
        }
        return false;
    }

    public final boolean A0K() {
        long A0H2 = this.A0G.A0H();
        if (this.A03 && AnonymousClass0x9.A1Q(this.A0J.A00())) {
            AnonymousClass66R r8 = this.A0C.A01;
            if (A0H2 - C18310x6.A0F(r8).getLong("pref_last_avatar_calling_use_time", 0) < A0M || A0H2 - C18310x6.A0F(r8).getLong("pref_last_upsell_banner_shown_time", 0) < A0N || !this.A07.A02.A0X(1756) || !this.A0I.A0X(4858)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public AnonymousClass59B B7k() {
        return this.A06.A00();
    }

    public void BSe() {
        AnonymousClass5AG r4 = (AnonymousClass5AG) AnonymousClass4VK.A00(this, "voip/CallAvatarViewModel/onFLMConsentBottomSheetDismissed");
        if (!(r4 instanceof C91094iu)) {
            C18260x0.A1Q(AnonymousClass001.A0o(), "voip/CallAvatarViewModel/onFLMConsentBottomSheetDismissed Unexpected state=", r4);
            return;
        }
        C616131n.A02((C85494Gl) null, new CallAvatarViewModel$onFLMConsentBottomSheetDismissed$1(this, r4, (C84814Du) null), AnonymousClass0IV.A00(this), (AnonymousClass20D) null, 3);
    }

    public void BSf(AnonymousClass4GP r5, AnonymousClass4GP r6) {
        Object A002 = AnonymousClass4VK.A00(this, "voip/CallAvatarViewModel/onFLMConsentBottomSheetTurnOnButtonClicked");
        if (!(A002 instanceof C91094iu)) {
            C18260x0.A1Q(AnonymousClass001.A0o(), "voip/CallAvatarViewModel/onFLMConsentBottomSheetTurnOnButtonClicked Unexpected state=", A002);
            return;
        }
        this.A00 = C616131n.A02((C85494Gl) null, new CallAvatarViewModel$onFLMConsentBottomSheetPrimaryButtonClicked$1(this, (C84814Du) null, r5, r6), AnonymousClass0IV.A00(this), (AnonymousClass20D) null, 3);
    }

    public void BSg(AnonymousClass4GP r5, AnonymousClass4GP r6) {
        Object A002 = AnonymousClass4VK.A00(this, "voip/CallAvatarViewModel/onFLMConsentBottomSheetKeepOffButtonClicked");
        if (!(A002 instanceof C91094iu)) {
            C18260x0.A1Q(AnonymousClass001.A0o(), "voip/CallAvatarViewModel/onFLMConsentBottomSheetKeepOffButtonClicked Unexpected state=", A002);
            return;
        }
        this.A00 = C616131n.A02((C85494Gl) null, new CallAvatarViewModel$onFLMConsentBottomSheetSecondaryButtonClicked$1(this, (C84814Du) null, r5, r6), AnonymousClass0IV.A00(this), (AnonymousClass20D) null, 3);
    }
}
