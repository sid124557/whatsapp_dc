package com.whatsapp.settings;

import X.AnonymousClass001;
import X.AnonymousClass08M;
import X.AnonymousClass1VX;
import X.AnonymousClass2WY;
import X.AnonymousClass33S;
import X.AnonymousClass3Ci;
import X.AnonymousClass4FS;
import X.AnonymousClass7LN;
import X.C05550Ty;
import X.C106585Zo;
import X.C116975rB;
import X.C162457s7;
import X.C24461Xm;
import X.C385528d;
import X.C45092Yq;
import X.C54392oe;
import X.C56312rm;
import X.C58422vE;
import X.C60152y5;
import X.C60442yZ;
import X.C615531h;
import X.C66523Lt;
import X.C69263Wi;
import X.C71293bs;
import com.whatsapp.R;
import java.util.List;

public class SettingsUserProxyViewModel extends C05550Ty {
    public int A00 = 0;
    public int A01 = 0;
    public String A02;
    public boolean A03;
    public boolean A04;
    public final AnonymousClass08M A05 = AnonymousClass08M.A01();
    public final AnonymousClass08M A06 = AnonymousClass08M.A01();
    public final AnonymousClass08M A07 = AnonymousClass08M.A01();
    public final C69263Wi A08;
    public final C54392oe A09;
    public final AnonymousClass1VX A0A;
    public final C66523Lt A0B;
    public final AnonymousClass33S A0C;
    public final AnonymousClass2WY A0D;
    public final C56312rm A0E;
    public final C60442yZ A0F;
    public final C45092Yq A0G;
    public final AnonymousClass3Ci A0H;
    public final AnonymousClass4FS A0I;

    public static int A00(int i) {
        if (i == 1 || i == 2 || i == 3 || i == 4 || i != 5) {
            return R.string.f11nameremoved;
        }
        return R.string.f11nameremoved;
    }

    public synchronized void A0F() {
        String A002 = this.A0F.A00.A00();
        this.A02 = A002;
        this.A05.A0G(A002);
    }

    public synchronized void A0G(int i, boolean z) {
        AnonymousClass2WY r3;
        boolean z2;
        this.A00 = i;
        if (!z) {
            if (i == 2) {
                r3 = this.A0D;
                z2 = true;
            } else if (i == 3 || i == 4) {
                r3 = this.A0D;
                z2 = false;
            }
            Boolean valueOf = Boolean.valueOf(z2);
            C24461Xm r1 = new C24461Xm();
            r1.A01 = null;
            r1.A00 = valueOf;
            r3.A00.BhD(r1);
        }
        this.A06.A0G(new AnonymousClass7LN(this.A00, this.A01, A00(i)));
    }

    public synchronized boolean A0I(String str) {
        boolean z;
        StringBuilder A0o;
        C162457s7.A0J(str, 0);
        if (C106585Zo.A01(str)) {
            List A012 = new C116975rB(":").A01(str, 0);
            if (A012.size() == 1) {
                A0o = AnonymousClass001.A0o();
                A0o.append(AnonymousClass001.A0n(A012, 0));
                A0o.append(':');
                A0o.append(443);
            } else {
                int A013 = C615531h.A01(AnonymousClass001.A0n(A012, 1), -1);
                if (A013 > -1) {
                    A0o = AnonymousClass001.A0o();
                    A0o.append(AnonymousClass001.A0n(A012, 0));
                    A0o.append(':');
                    A0o.append(A013);
                }
            }
            String obj = A0o.toString();
            if (obj != null) {
                z = true;
                this.A0D.A00(true);
                C60442yZ r5 = this.A0F;
                C60152y5 r4 = r5.A00.A01;
                r5.A01(C385528d.A01(obj, 443, r4.A03("user_proxy_setting_pref").getInt("proxy_media_port", 587), r4.A03("user_proxy_setting_pref").getBoolean("proxy_use_tls", true)));
                this.A02 = obj;
                this.A05.A0G(obj);
            }
        }
        z = false;
        this.A08.A0I(R.string.f11nameremoved, 0);
        return z;
    }

    public void A0D() {
        if (!this.A0F.A00.A05() || this.A02 == null) {
            AnonymousClass3Ci r2 = this.A0H;
            C69263Wi.A01(r2.A01, r2, 25);
            this.A04 = false;
            A0G(4, false);
            this.A0C.A00();
            this.A0B.A0D((String) null, (String) null, 0, true, false, false, false, false, true);
            return;
        }
        A0E();
    }

    public final void A0E() {
        AnonymousClass3Ci r2 = this.A0H;
        C69263Wi.A01(r2.A01, r2, 24);
        this.A04 = true;
        A0G(1, false);
        this.A0C.A00();
        this.A0B.A0D((String) null, (String) null, 0, true, false, false, false, false, true);
        C71293bs.A00(this.A0I, this, 20);
    }

    public boolean A0H() {
        return this.A0A.A0Y(C58422vE.A01, 3641);
    }

    public SettingsUserProxyViewModel(C69263Wi r2, C54392oe r3, AnonymousClass1VX r4, C66523Lt r5, AnonymousClass33S r6, AnonymousClass2WY r7, C56312rm r8, C60442yZ r9, C45092Yq r10, AnonymousClass3Ci r11, AnonymousClass4FS r12) {
        this.A0A = r4;
        this.A08 = r2;
        this.A0I = r12;
        this.A0C = r6;
        this.A0B = r5;
        this.A0D = r7;
        this.A0F = r9;
        this.A0G = r10;
        this.A09 = r3;
        this.A0E = r8;
        this.A0H = r11;
    }
}
