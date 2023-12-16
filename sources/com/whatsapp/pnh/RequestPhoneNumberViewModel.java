package com.whatsapp.pnh;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass08M;
import X.AnonymousClass0x2;
import X.AnonymousClass0x9;
import X.AnonymousClass311;
import X.AnonymousClass4FS;
import X.AnonymousClass5N2;
import X.C05550Ty;
import X.C06270Wx;
import X.C162457s7;
import X.C18260x0;
import X.C27981fH;
import X.C53242mm;
import X.C56662sM;
import X.C621033m;
import X.C66433Lk;
import X.C70123Zz;
import android.net.Uri;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public final class RequestPhoneNumberViewModel extends C05550Ty {
    public final Uri A00;
    public final AnonymousClass08M A01 = AnonymousClass08M.A01();
    public final C621033m A02;
    public final C56662sM A03;
    public final AnonymousClass311 A04;
    public final AnonymousClass5N2 A05;
    public final AnonymousClass4FS A06;
    public final Map A07;

    public final C06270Wx A0D(C27981fH r5) {
        C162457s7.A0J(r5, 0);
        AnonymousClass08M r3 = this.A01;
        this.A06.BkM(new C70123Zz(this, 38, r5));
        return r3;
    }

    public void A0C() {
        Map map = this.A07;
        Iterator A0q = AnonymousClass000.A0q(map);
        while (A0q.hasNext()) {
            Object A0W = AnonymousClass0x2.A0W(A0q);
            AnonymousClass311 r1 = this.A04;
            C162457s7.A0J(A0W, 0);
            Set set = r1.A07;
            synchronized (set) {
                set.remove(A0W);
            }
        }
        map.clear();
    }

    public final void A0E(C27981fH r14) {
        boolean A1W;
        AnonymousClass08M r6 = this.A01;
        Uri uri = this.A00;
        C27981fH r9 = r14;
        boolean A1W2 = AnonymousClass000.A1W(this.A03.A02(r14));
        AnonymousClass311 r5 = this.A04;
        boolean A1Q = AnonymousClass0x9.A1Q(r5.A01(r14));
        synchronized (r5) {
            A1W = AnonymousClass001.A1W(((r5.A00(r14) + AnonymousClass311.A08) > System.currentTimeMillis() ? 1 : ((r5.A00(r14) + AnonymousClass311.A08) == System.currentTimeMillis() ? 0 : -1)));
        }
        r6.A0G(new C53242mm(uri, r9, A1W2, A1Q, A1W));
    }

    public RequestPhoneNumberViewModel(C621033m r2, C56662sM r3, AnonymousClass311 r4, AnonymousClass5N2 r5, C66433Lk r6, AnonymousClass4FS r7) {
        C18260x0.A0f(r6, r7, r2, r3, r4);
        C162457s7.A0J(r5, 6);
        ConcurrentHashMap A1D = AnonymousClass0x9.A1D();
        this.A06 = r7;
        this.A02 = r2;
        this.A03 = r3;
        this.A04 = r4;
        this.A05 = r5;
        this.A07 = A1D;
        Uri A032 = r6.A03("626403979060997");
        C162457s7.A0D(A032);
        this.A00 = A032;
    }
}
