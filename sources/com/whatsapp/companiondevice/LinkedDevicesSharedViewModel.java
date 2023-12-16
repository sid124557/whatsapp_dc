package com.whatsapp.companiondevice;

import X.AnonymousClass08M;
import X.AnonymousClass08N;
import X.AnonymousClass0x9;
import X.AnonymousClass1VX;
import X.AnonymousClass33p;
import X.AnonymousClass49Y;
import X.AnonymousClass4FJ;
import X.AnonymousClass4FS;
import X.AnonymousClass4IF;
import X.AnonymousClass4UC;
import X.C06270Wx;
import X.C116985rC;
import X.C29041iB;
import X.C29441ip;
import X.C46122b7;
import X.C48442eu;
import X.C55802qw;
import X.C56522s7;
import X.C59622xD;
import X.C64663Ek;
import X.C65203Gp;
import X.C66653Mg;
import X.C66663Mh;
import X.C69263Wi;
import X.C70343aL;
import X.C71323bv;
import X.C84134Bd;
import X.C85924Id;
import X.C86234Ji;
import android.app.Application;
import com.whatsapp.R;

public class LinkedDevicesSharedViewModel extends AnonymousClass08N {
    public int A00;
    public Boolean A01;
    public Runnable A02;
    public boolean A03;
    public final Application A04;
    public final AnonymousClass08M A05 = AnonymousClass08M.A01();
    public final C116985rC A06;
    public final C116985rC A07;
    public final C69263Wi A08;
    public final C66663Mh A09;
    public final C48442eu A0A;
    public final C65203Gp A0B;
    public final C64663Ek A0C;
    public final AnonymousClass49Y A0D = new AnonymousClass4IF(this, 0);
    public final C29441ip A0E;
    public final AnonymousClass33p A0F;
    public final AnonymousClass4FJ A0G = new C85924Id(this, 1);
    public final C29041iB A0H;
    public final C56522s7 A0I;
    public final C55802qw A0J;
    public final AnonymousClass1VX A0K;
    public final C66653Mg A0L;
    public final C46122b7 A0M;
    public final AnonymousClass4UC A0N = AnonymousClass0x9.A0b();
    public final AnonymousClass4UC A0O = AnonymousClass0x9.A0b();
    public final AnonymousClass4UC A0P = AnonymousClass0x9.A0b();
    public final AnonymousClass4UC A0Q = AnonymousClass0x9.A0b();
    public final AnonymousClass4UC A0R = AnonymousClass0x9.A0b();
    public final AnonymousClass4UC A0S = AnonymousClass0x9.A0b();
    public final AnonymousClass4UC A0T = AnonymousClass0x9.A0b();
    public final AnonymousClass4UC A0U = AnonymousClass0x9.A0b();
    public final AnonymousClass4UC A0V = AnonymousClass0x9.A0b();
    public final AnonymousClass4UC A0W = AnonymousClass0x9.A0b();
    public final AnonymousClass4UC A0X = AnonymousClass0x9.A0b();
    public final AnonymousClass4FS A0Y;
    public final C84134Bd A0Z = new C86234Ji(this, 3);

    public void A0D() {
        Boolean valueOf;
        C55802qw r5 = this.A0J;
        r5.A03.execute(new C70343aL(r5, this.A0Z, this.A08.A08, 16));
        C29441ip r2 = this.A0E;
        r2.A06(this.A0D);
        this.A0H.A06(this.A0G);
        C59622xD A0B2 = r2.A0B();
        if (A0B2 == null) {
            valueOf = null;
        } else {
            valueOf = Boolean.valueOf(A0B2.A04);
        }
        this.A01 = valueOf;
    }

    public void A0E() {
        this.A0E.A07(this.A0D);
        C55802qw r0 = this.A0J;
        r0.A00.A03(this.A0Z);
        this.A0H.A07(this.A0G);
    }

    public void A0G(String str) {
        if (!this.A0E.A0F()) {
            C06270Wx.A03(this.A0O, R.string.f11nameremoved);
            return;
        }
        this.A03 = true;
        this.A05.A0H(Boolean.TRUE);
        this.A0Y.BkM(new C71323bv(this, str));
    }

    public void A0H(boolean z) {
        AnonymousClass4UC r1;
        Integer num;
        if (!this.A0E.A0F()) {
            boolean A022 = C29441ip.A02(this.A04);
            r1 = this.A0O;
            int i = R.string.f11nameremoved;
            if (A022) {
                i = R.string.f11nameremoved;
            }
            num = Integer.valueOf(i);
        } else {
            if (this.A09.A08(C66663Mh.A0T) && z) {
                r1 = this.A0T;
            } else if (this.A00 != 1 || !this.A0A.A01()) {
                r1 = this.A0V;
            } else {
                r1 = this.A0U;
            }
            num = null;
        }
        r1.A0H(num);
    }

    public LinkedDevicesSharedViewModel(Application application, C116985rC r4, C116985rC r5, C69263Wi r6, C66663Mh r7, C48442eu r8, C65203Gp r9, C64663Ek r10, C29441ip r11, AnonymousClass33p r12, C29041iB r13, C56522s7 r14, C55802qw r15, AnonymousClass1VX r16, C66653Mg r17, C46122b7 r18, AnonymousClass4FS r19) {
        super(application);
        this.A0K = r16;
        this.A08 = r6;
        this.A0Y = r19;
        this.A04 = application;
        this.A09 = r7;
        this.A0B = r9;
        this.A0I = r14;
        this.A0C = r10;
        this.A0L = r17;
        this.A0F = r12;
        this.A0H = r13;
        this.A0M = r18;
        this.A0J = r15;
        this.A0E = r11;
        this.A07 = r4;
        this.A0A = r8;
        this.A06 = r5;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0F(int r11, int r12, int r13, boolean r14) {
        /*
            r10 = this;
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "LinkedDevicesSharedViewModel/onLinkNewDeviceClicked devicePairFlowType: "
            X.C18260x0.A0y(r0, r1, r13)
            X.3Mg r0 = r10.A0L
            X.33p r1 = r0.A01
            boolean r0 = r1.A2B()
            if (r0 == 0) goto L_0x001b
            if (r11 < r12) goto L_0x001b
            X.4UC r0 = r10.A0R
            X.C06270Wx.A03(r0, r12)
        L_0x001a:
            return
        L_0x001b:
            r10.A00 = r13
            boolean r0 = r1.A2B()
            if (r0 == 0) goto L_0x0077
            X.1ip r0 = r10.A0E
            r1 = 1
            int r0 = r0.A08(r1)
            if (r0 == r1) goto L_0x0077
            X.33p r0 = r10.A0F
            android.content.SharedPreferences r1 = X.AnonymousClass0x2.A0F(r0)
            java.lang.String r0 = "md_initial_sync_estimate_bytes"
            long r2 = X.AnonymousClass0x2.A0A(r1, r0)
            r4 = 0
            r8 = 1000(0x3e8, double:4.94E-321)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 < 0) goto L_0x004f
            long r6 = r2 / r8
            X.3Mh r1 = r10.A09
            X.1Ek r0 = X.C66663Mh.A1w
            int r0 = r1.A03(r0)
            long r4 = (long) r0
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 < 0) goto L_0x0077
        L_0x004f:
            X.4UC r1 = r10.A0S
            r0 = 0
            r1.A0H(r0)
            X.3Ek r4 = r10.A0C
            long r0 = r2 / r8
            long r2 = java.lang.Math.min(r2, r0)
            X.1WY r1 = new X.1WY
            r1.<init>()
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r1.A00 = r0
            X.C64663Ek.A05(r4, r1)
        L_0x006b:
            if (r13 != 0) goto L_0x001a
            X.2b7 r1 = r10.A0M
            X.1XT r0 = new X.1XT
            r0.<init>()
            r1.A01 = r0
            return
        L_0x0077:
            r10.A0H(r14)
            goto L_0x006b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.companiondevice.LinkedDevicesSharedViewModel.A0F(int, int, int, boolean):void");
    }
}
