package X;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.2rK  reason: invalid class name and case insensitive filesystem */
public final class C56042rK {
    public final C69263Wi A00;
    public final C42992Qi A01;
    public final C29141iL A02;

    public final C51132jK A00(AnonymousClass21S r7) {
        C18260x0.A1N(C18280x3.A0g(r7, 0), "FbAccountManager/getLinkedFbUserEntity called by ", r7);
        C42992Qi r2 = this.A01;
        AtomicReference atomicReference = r2.A00;
        if (atomicReference.get() != null) {
            return (C51132jK) atomicReference.get();
        }
        String A0Z = C18280x3.A0Z(r2.A03.A01(), "pref_xfamily_fb_account_info");
        if (A0Z == null) {
            return null;
        }
        String string = AnonymousClass0x9.A1H(r2.A02.A00(A0Z)).getString("access_token");
        C162457s7.A0H(string);
        C162457s7.A0J(string, 0);
        C51132jK r1 = new C51132jK(AnonymousClass0x7.A0a(AnonymousClass3QD.A00(), String.class, string, "XFamilyFbAccessToken"));
        atomicReference.set(r1);
        return r1;
    }

    public final Boolean A01(AnonymousClass21S r5) {
        C18260x0.A1N(C18280x3.A0g(r5, 0), "FbAccountManager/isAutoCrosspostingOn called by ", r5);
        AnonymousClass2Z9 r2 = this.A01.A03;
        if (r2.A01().contains("pref_xfamily_fb_auto_crossposting")) {
            return Boolean.valueOf(r2.A01().getBoolean("pref_xfamily_fb_auto_crossposting", false));
        }
        return null;
    }

    public C56042rK(C69263Wi r1, C42992Qi r2, C29141iL r3) {
        C18260x0.A0V(r1, r2, r3);
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
    }

    public final void A02(AnonymousClass21S r3) {
        C18260x0.A1N(C18270x1.A0X(r3), "FbAccountManager/saveHasUserConsented called by ", r3);
        C18270x1.A0f(AnonymousClass2Z9.A00(this.A01.A03), "pref_xfamily_fb_account_user_consented");
    }

    public final void A03(AnonymousClass21S r4, boolean z) {
        C18260x0.A1N(C18270x1.A0X(r4), "FbAccountManager/unlinkAccount called by ", r4);
        C42992Qi r2 = this.A01;
        r2.A00.set((Object) null);
        AnonymousClass2Z9 r22 = r2.A03;
        C18270x1.A0g(AnonymousClass2Z9.A00(r22), "pref_xfamily_fb_account_info");
        C18270x1.A0g(AnonymousClass2Z9.A00(r22), "pref_xfamily_fb_auto_crossposting");
        C18270x1.A0g(AnonymousClass2Z9.A00(r22), "pref_xfamily_fb_account_update_time");
        C18270x1.A0g(AnonymousClass2Z9.A00(r22), "pref_xfamily_fb_account_user_consented");
        if (z) {
            C18270x1.A0f(AnonymousClass2Z9.A00(r22), "pref_xfamily_fb_account_has_system_unlinked");
        }
        this.A00.BkS(new C117105rO(this, 47));
    }

    public final void A04(AnonymousClass21S r3, boolean z) {
        C18260x0.A1N(C18270x1.A0X(r3), "FbAccountManager/updateIsAutoCrosspostingOn called by ", r3);
        C18270x1.A0l(AnonymousClass2Z9.A00(this.A01.A03), "pref_xfamily_fb_auto_crossposting", z);
    }

    public final boolean A05(AnonymousClass21S r3) {
        C18260x0.A1N(C18270x1.A0X(r3), "FbAccountManager/isAccountLinked called by ", r3);
        return AnonymousClass000.A1W(A00(r3));
    }
}
