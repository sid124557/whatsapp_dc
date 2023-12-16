package com.whatsapp.backup.google.viewmodel;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass08M;
import X.AnonymousClass0JM;
import X.AnonymousClass0QJ;
import X.AnonymousClass0WF;
import X.AnonymousClass0WN;
import X.AnonymousClass0YV;
import X.AnonymousClass0Z7;
import X.AnonymousClass33p;
import X.AnonymousClass49Y;
import X.AnonymousClass4FS;
import X.C02050Ec;
import X.C02080Ef;
import X.C02090Eg;
import X.C02100Eh;
import X.C03650La;
import X.C05110Rz;
import X.C05550Ty;
import X.C06260Ww;
import X.C06270Wx;
import X.C06540Yd;
import X.C10220ha;
import X.C10230hb;
import X.C10240hc;
import X.C11720k6;
import X.C11730k7;
import X.C17110ua;
import X.C29441ip;
import X.C59622xD;
import X.C615631i;
import X.C625835r;
import X.C69263Wi;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.ConditionVariable;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;

public class SettingsGoogleDriveViewModel extends C05550Ty implements AnonymousClass49Y {
    public static final int[] A0a;
    public static final int[] A0b = {0, 4, 1, 2, 3};
    public final ServiceConnection A00;
    public final ConditionVariable A01;
    public final AnonymousClass08M A02;
    public final AnonymousClass08M A03 = AnonymousClass08M.A01();
    public final AnonymousClass08M A04;
    public final AnonymousClass08M A05;
    public final AnonymousClass08M A06;
    public final AnonymousClass08M A07;
    public final AnonymousClass08M A08;
    public final AnonymousClass08M A09;
    public final AnonymousClass08M A0A;
    public final AnonymousClass08M A0B;
    public final AnonymousClass08M A0C;
    public final AnonymousClass08M A0D;
    public final AnonymousClass08M A0E;
    public final AnonymousClass08M A0F;
    public final AnonymousClass08M A0G = new AnonymousClass08M(Boolean.FALSE);
    public final AnonymousClass08M A0H = new AnonymousClass08M(0L);
    public final AnonymousClass08M A0I;
    public final AnonymousClass08M A0J;
    public final AnonymousClass08M A0K;
    public final AnonymousClass08M A0L;
    public final AnonymousClass08M A0M;
    public final AnonymousClass08M A0N;
    public final AnonymousClass0WN A0O;
    public final AnonymousClass0WF A0P;
    public final C06260Ww A0Q;
    public final AnonymousClass0QJ A0R;
    public final C10230hb A0S;
    public final C17110ua A0T;
    public final C29441ip A0U;
    public final AnonymousClass33p A0V;
    public final C625835r A0W;
    public final AnonymousClass4FS A0X;
    public final AtomicBoolean A0Y;
    public final AtomicBoolean A0Z;

    static {
        int[] iArr = new int[5];
        C05550Ty.A07(iArr);
        A0a = iArr;
    }

    public void A0d() {
        boolean A022 = C615631i.A02();
        AnonymousClass08M r1 = this.A0C;
        if (A022) {
            r1.A0H(false);
        } else {
            r1.A0G(false);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void A03() {
        AnonymousClass08M r2 = this.A0G;
        C625835r r1 = this.A0W;
        C06270Wx.A05(r2, r1.A0a());
        this.A0H.A0G(Long.valueOf(r1.A0D()));
    }

    public static /* synthetic */ void A04(SettingsGoogleDriveViewModel settingsGoogleDriveViewModel) {
        AnonymousClass08M r3 = settingsGoogleDriveViewModel.A0N;
        AnonymousClass0WF r2 = settingsGoogleDriveViewModel.A0P;
        HashSet A0K2 = AnonymousClass002.A0K();
        AnonymousClass001.A1O(A0K2, (byte) 3);
        AnonymousClass001.A1O(A0K2, (byte) 28);
        r3.A0G(new C02100Eh(r2.A04(A0K2)));
    }

    public void A0C() {
        this.A0U.A07(this);
        this.A0R.A02(this.A0T);
    }

    public final long A0D() {
        AnonymousClass33p r1 = this.A0V;
        return r1.A0T(r1.A0X());
    }

    public ServiceConnection A0E() {
        return this.A00;
    }

    public C06270Wx A0F() {
        return this.A02;
    }

    public C06270Wx A0G() {
        return this.A03;
    }

    public C06270Wx A0H() {
        return this.A04;
    }

    public C06270Wx A0I() {
        return this.A05;
    }

    public C06270Wx A0J() {
        return this.A06;
    }

    public C06270Wx A0K() {
        return this.A07;
    }

    public C06270Wx A0L() {
        return this.A08;
    }

    public C06270Wx A0M() {
        return this.A09;
    }

    public C06270Wx A0N() {
        return this.A0A;
    }

    public C06270Wx A0O() {
        return this.A0B;
    }

    public C06270Wx A0P() {
        return C05110Rz.A01(this.A0C);
    }

    public C06270Wx A0Q() {
        return this.A0D;
    }

    public C06270Wx A0R() {
        return this.A0E;
    }

    public C06270Wx A0S() {
        return this.A0F;
    }

    public C06270Wx A0T() {
        return this.A0H;
    }

    public C06270Wx A0U() {
        return this.A0I;
    }

    public C06270Wx A0V() {
        return this.A0J;
    }

    public C06270Wx A0W() {
        return this.A0K;
    }

    public C06270Wx A0X() {
        return this.A0L;
    }

    public C06270Wx A0Y() {
        return this.A0M;
    }

    public C06270Wx A0Z() {
        return this.A0N;
    }

    public void A0c() {
        this.A0X.BkM(new C11720k6(this));
    }

    public void A0e() {
        this.A0A.A0H(Boolean.valueOf(this.A0O.A0G()));
    }

    public void A0f() {
        AnonymousClass33p r4 = this.A0V;
        String A0X2 = r4.A0X();
        int i = 0;
        if (A0X2 != null) {
            boolean A2N = r4.A2N(A0X2);
            int A0G2 = r4.A0G(A0X2);
            if (A2N || A0G2 == 0) {
                i = A0G2;
            } else {
                r4.A1a(A0X2, 0);
            }
        }
        C06270Wx.A03(this.A0I, i);
    }

    public void A0g(int i) {
        C06270Wx.A04(this.A0D, i);
    }

    public void A0h(int i) {
        if (i >= 0) {
            C06270Wx.A04(this.A0K, i);
        }
    }

    public void A0i(int i, Bundle bundle) {
        this.A0E.A0G(new C03650La(i, bundle));
    }

    public void A0j(AnonymousClass0JM r2) {
        this.A08.A0G(r2);
    }

    public void A0k(boolean z) {
        C06270Wx.A05(this.A05, z);
    }

    public void A0l(boolean z) {
        C06270Wx.A05(this.A06, z);
    }

    public void A0m(boolean z) {
        C06270Wx.A05(this.A07, z);
    }

    public void A0n(boolean z) {
        C06270Wx.A05(this.A09, z);
    }

    public void A0o(boolean z) {
        C06270Wx.A05(this.A0B, z);
    }

    public void A0p(boolean z) {
        this.A0F.A0H(Boolean.valueOf(z));
        this.A0V.A1r(z);
        A0a();
    }

    public void A0q(boolean z) {
        C06270Wx.A05(this.A0J, z);
    }

    public void A0r(boolean z) {
        C06270Wx.A05(this.A0L, z);
    }

    public void A0s(boolean z) {
        C06270Wx.A05(this.A0M, z);
    }

    public void A0t(boolean z) {
        this.A0Z.set(z);
    }

    public void A0u(boolean z) {
        this.A0Y.set(z);
    }

    public boolean A0v() {
        return this.A0Z.get();
    }

    public boolean A0w() {
        return this.A0Y.get();
    }

    public boolean A0x(int i) {
        if (!this.A0V.A2L(i)) {
            return false;
        }
        C06270Wx.A03(this.A04, i);
        return true;
    }

    public boolean A0y(String str) {
        AnonymousClass33p r2 = this.A0V;
        if (!TextUtils.equals(r2.A0X(), str)) {
            r2.A1S(str);
            r2.A15(10);
            C06270Wx.A03(this.A0D, 10);
            C06260Ww r22 = this.A0Q;
            synchronized (r22.A0P) {
                r22.A00 = null;
            }
            Log.i(AnonymousClass0YV.A0B("gdrive-setting-view-model/update-account-name new accountName is ", str, AnonymousClass001.A0o()));
            this.A02.A0H(str);
            A0b();
            return true;
        }
        Log.i(AnonymousClass0YV.A0B("gdrive-setting-view-model/update-account-name account unchanged, token received for ", str, AnonymousClass001.A0o()));
        return false;
    }

    public void BPq(C59622xD r5) {
        int A082 = this.A0U.A08(true);
        C06270Wx.A04(this.A03, A082);
        if (A082 == 0 || A082 == 2) {
            AnonymousClass0JM r1 = (AnonymousClass0JM) this.A08.A07();
            if (r1 instanceof C02050Ec) {
                int i = ((C02050Ec) r1).A00;
                if (i == 0) {
                    this.A0T.BWH(0, 0);
                } else if (i == 6 || i == 7) {
                    this.A0T.BNO(0, 0);
                }
            }
        }
    }

    public void A0a() {
        AnonymousClass08M r2;
        C02090Eg r0;
        long A0D2 = A0D();
        if (A0D2 > 0) {
            r2 = this.A0N;
            r0 = new C02090Eg(A0D2);
        } else {
            Object A072 = this.A0F.A07();
            Boolean bool = Boolean.TRUE;
            r2 = this.A0N;
            if (A072 != bool) {
                r0 = null;
            } else {
                r2.A0H(new C02080Ef());
                this.A0X.BkM(new C11730k7(this));
                return;
            }
        }
        r2.A0H(r0);
    }

    public void A0b() {
        A0c();
        A0a();
        A0f();
    }

    public SettingsGoogleDriveViewModel(C69263Wi r17, AnonymousClass0WN r18, AnonymousClass0WF r19, C10240hc r20, C06260Ww r21, AnonymousClass0QJ r22, C10230hb r23, C29441ip r24, AnonymousClass33p r25, C625835r r26, AnonymousClass4FS r27) {
        AnonymousClass08M A012 = AnonymousClass08M.A01();
        this.A0N = A012;
        AnonymousClass08M A013 = AnonymousClass08M.A01();
        this.A0F = A013;
        this.A0I = AnonymousClass08M.A01();
        AnonymousClass08M A014 = AnonymousClass08M.A01();
        this.A02 = A014;
        AnonymousClass08M A015 = AnonymousClass08M.A01();
        this.A04 = A015;
        this.A0L = AnonymousClass08M.A01();
        this.A0J = AnonymousClass08M.A01();
        this.A0K = AnonymousClass08M.A01();
        this.A09 = AnonymousClass08M.A01();
        this.A0M = AnonymousClass08M.A01();
        this.A0C = AnonymousClass08M.A01();
        this.A0B = AnonymousClass08M.A01();
        this.A06 = AnonymousClass08M.A01();
        this.A08 = AnonymousClass08M.A01();
        AnonymousClass08M A016 = AnonymousClass08M.A01();
        this.A07 = A016;
        this.A05 = new AnonymousClass08M(Boolean.TRUE);
        this.A0D = new AnonymousClass08M(10);
        this.A0E = new AnonymousClass08M(new C03650La(10, (Bundle) null));
        this.A0A = AnonymousClass08M.A01();
        this.A0Z = new AtomicBoolean();
        this.A0Y = new AtomicBoolean();
        boolean z = false;
        this.A01 = new ConditionVariable(false);
        this.A00 = new AnonymousClass0Z7(this);
        this.A0X = r27;
        this.A0O = r18;
        this.A0W = r26;
        this.A0Q = r21;
        AnonymousClass33p r15 = r25;
        this.A0V = r15;
        this.A0P = r19;
        C29441ip r14 = r24;
        this.A0U = r14;
        C10230hb r12 = r23;
        this.A0S = r12;
        this.A0R = r22;
        this.A0T = new C10220ha(r17, r12, this, r14, r15);
        r14.A06(this);
        A013.A0H(Boolean.valueOf(r15.A27()));
        long A0D2 = A0D();
        if (A0D2 > 0) {
            A012.A0H(new C02090Eg(A0D2));
        }
        A014.A0H(r15.A0X());
        C06270Wx.A03(A015, r15.A05());
        if (!r20.A0b() && !C06540Yd.A0K(r15)) {
            z = true;
        }
        A016.A0H(Boolean.valueOf(z));
    }
}
