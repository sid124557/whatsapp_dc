package com.whatsapp.payments.ui.viewmodel;

import X.AnonymousClass08M;
import X.AnonymousClass0x2;
import X.AnonymousClass31C;
import X.AnonymousClass34V;
import X.AnonymousClass36K;
import X.AnonymousClass7EM;
import X.AnonymousClass907;
import X.AnonymousClass9AE;
import X.C05550Ty;
import X.C136986na;
import X.C139656sP;
import X.C150597Rk;
import X.C153527bU;
import X.C153607bd;
import X.C158597kF;
import X.C162457s7;
import X.C166157yE;
import X.C166557yt;
import X.C18270x1;
import X.C35351wj;
import X.C35721xK;
import X.C626936e;
import com.whatsapp.util.Log;

public final class IndiaUpiNumberSettingsViewModel extends C05550Ty {
    public final AnonymousClass08M A00;
    public final C153527bU A01;

    public IndiaUpiNumberSettingsViewModel(C153527bU r9) {
        C162457s7.A0J(r9, 1);
        this.A01 = r9;
        AnonymousClass08M A012 = AnonymousClass08M.A01();
        this.A00 = A012;
        A012.A0H(new C158597kF((AnonymousClass34V) null, (AnonymousClass34V) null, false, false, false, false));
    }

    public final void A0D(C166557yt r18, C166557yt r19, C166157yE r20, C136986na r21, String str, String str2) {
        C136986na r3 = r21;
        C162457s7.A0J(r3, 0);
        C166557yt r2 = r19;
        C166157yE r5 = r20;
        C18270x1.A11(r5, 1, r2);
        this.A00.A0H(new C158597kF((AnonymousClass34V) null, (AnonymousClass34V) null, true, false, false, false));
        Object obj = r2.A00;
        C626936e.A06(obj);
        C162457s7.A0D(obj);
        String str3 = (String) obj;
        AnonymousClass7EM r8 = new AnonymousClass7EM(this);
        C162457s7.A0J(str3, 3);
        Log.i("PAY: updateAlias called");
        AnonymousClass31C r10 = r3.A02;
        String A03 = r10.A03();
        Object obj2 = r5.A00.A00;
        C626936e.A06(obj2);
        C139656sP r7 = new C139656sP((String) obj2, r5.A01, r5.A03, str2);
        Object obj3 = r18.A00;
        C626936e.A06(obj3);
        C35351wj r52 = new C35351wj(new C35351wj((String) obj3, str, str3, 29), 26);
        C35721xK r9 = new C35721xK(new C35351wj(r7), r52, new C35351wj(A03, 28), r3.A04.A01());
        C153607bd r72 = r3.A00;
        if (r72 != null) {
            r72.A03("update-alias");
        }
        AnonymousClass36K r12 = r9.A00;
        C162457s7.A0D(r12);
        r10.A0D(new AnonymousClass907(r3.A00, r3.A01, r3.A03, r72, r8, r9), r12, A03, 204, 0);
    }

    public final void A0E(C166557yt r9, C166157yE r10, AnonymousClass9AE r11, String str) {
        this.A00.A0H(new C158597kF((AnonymousClass34V) null, (AnonymousClass34V) null, false, AnonymousClass0x2.A1Y(r11, r10), false, false));
        r11.A00(r9, r10, new C150597Rk(this), str);
    }
}
