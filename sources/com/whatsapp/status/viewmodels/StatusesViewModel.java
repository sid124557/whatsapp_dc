package com.whatsapp.status.viewmodels;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass08M;
import X.AnonymousClass0GH;
import X.AnonymousClass0x9;
import X.AnonymousClass1R1;
import X.AnonymousClass32Y;
import X.AnonymousClass4FS;
import X.AnonymousClass5L6;
import X.AnonymousClass5OF;
import X.C05110Rz;
import X.C05550Ty;
import X.C06270Wx;
import X.C103445Mz;
import X.C104745Se;
import X.C105765Wh;
import X.C113855m6;
import X.C113995mK;
import X.C1226665g;
import X.C124106Az;
import X.C124176Bg;
import X.C15910sA;
import X.C162457s7;
import X.C17280vG;
import X.C18260x0;
import X.C18270x1;
import X.C18280x3;
import X.C18320x8;
import X.C18330xA;
import X.C29081iF;
import X.C29431io;
import X.C620233e;
import X.C623534r;
import X.C72023d3;
import X.C72173dI;
import X.C73703fw;
import X.C73723fy;
import X.C73813g7;
import X.C86604Kt;
import X.C86664Kz;
import X.C94144py;
import X.C95814uZ;
import X.C994155q;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

public final class StatusesViewModel extends C05550Ty implements C17280vG, C1226665g {
    public C105765Wh A00;
    public C994155q A01;
    public C94144py A02;
    public Set A03;
    public final C06270Wx A04;
    public final AnonymousClass08M A05;
    public final AnonymousClass08M A06;
    public final C124176Bg A07 = new C124176Bg(this, 1);
    public final C103445Mz A08;
    public final C29431io A09;
    public final C620233e A0A;
    public final C29081iF A0B;
    public final C113995mK A0C;
    public final AnonymousClass5L6 A0D;
    public final C113855m6 A0E = new C113855m6(this);
    public final AnonymousClass4FS A0F;
    public final Set A0G;
    public final AtomicBoolean A0H;
    public final boolean A0I;

    public StatusesViewModel(C29431io r8, C620233e r9, C29081iF r10, C113995mK r11, AnonymousClass5L6 r12, AnonymousClass4FS r13, boolean z) {
        C162457s7.A0J(r13, 1);
        C18260x0.A0e(r9, r8, r10, r11);
        C162457s7.A0J(r12, 6);
        this.A0F = r13;
        this.A0A = r9;
        this.A09 = r8;
        this.A0B = r10;
        this.A0C = r11;
        this.A0D = r12;
        this.A0I = z;
        this.A08 = new C103445Mz(new C72173dI(r13, true));
        C72023d3 r2 = C72023d3.A00;
        C72023d3 r3 = r2;
        this.A00 = new C105765Wh((C623534r) null, r2, r3, r2, C73813g7.A0A(), C73813g7.A0A());
        this.A03 = AnonymousClass002.A0K();
        AnonymousClass08M A012 = C18330xA.A01(AnonymousClass001.A0t());
        this.A05 = A012;
        this.A04 = C05110Rz.A00(new C124106Az(this, 15), A012);
        this.A06 = AnonymousClass08M.A01();
        this.A0G = AnonymousClass0x9.A17();
        this.A0H = C18280x3.A0l();
    }

    public AnonymousClass5OF A0D(UserJid userJid) {
        C162457s7.A0J(userJid, 0);
        Map map = (Map) this.A04.A07();
        if (map != null) {
            return (AnonymousClass5OF) map.get(userJid);
        }
        return null;
    }

    public final void A0F() {
        C994155q r1 = this.A01;
        if (r1 != null) {
            r1.A0D(true);
        }
        AnonymousClass5L6 r0 = this.A0D;
        C620233e r5 = r0.A03;
        C104745Se r10 = r0.A07;
        AnonymousClass1R1 r7 = r0.A05;
        C994155q r12 = new C994155q(r0.A00, r0.A01, r0.A02, r5, r0.A04, r7, r0.A06, (C1226665g) this, r10, r0.A08, r0.A09);
        C18270x1.A0w(r12, this.A0F);
        this.A01 = r12;
    }

    public void BcK(AnonymousClass0GH r4, C15910sA r5) {
        boolean z;
        StringBuilder A0o;
        String str;
        int A022 = C18320x8.A02(r4, 1);
        if (A022 == 2) {
            z = this.A0I;
            if (z) {
                this.A09.A06(this.A0E);
                this.A0B.A06(this.A07);
            }
            this.A0H.set(false);
            A0F();
            A0o = AnonymousClass001.A0o();
            str = "On resume: liveStatusUpdatesActive = ";
        } else if (A022 == 3) {
            C994155q r0 = this.A01;
            if (r0 != null) {
                r0.A0D(true);
            }
            C86604Kt.A1R(this.A02);
            z = this.A0I;
            if (z) {
                this.A09.A07(this.A0E);
                this.A0B.A07(this.A07);
            }
            A0o = AnonymousClass001.A0o();
            str = "On pause: liveStatusUpdatesActive = ";
        } else {
            return;
        }
        C18260x0.A1D(str, A0o, z);
    }

    public String A0E() {
        if (this.A00.A05.isEmpty()) {
            return null;
        }
        return C73723fy.A09(", ", this.A00.A05.keySet());
    }

    public void BcY(C105765Wh r4) {
        Log.d("Statuses refreshed");
        this.A00 = r4;
        this.A03 = AnonymousClass0x9.A17();
        Iterator it = this.A00.A01.iterator();
        while (it.hasNext()) {
            C623534r A19 = C86664Kz.A19(it);
            Set set = this.A03;
            UserJid userJid = A19.A0A;
            C162457s7.A0D(userJid);
            set.add(userJid);
        }
        this.A06.A0G(r4);
        C86604Kt.A1R(this.A02);
        C94144py r2 = new C94144py(this);
        C103445Mz.A01(r2, this.A08, this, 3);
        this.A02 = r2;
    }

    public static final /* synthetic */ void A00(Jid jid, StatusesViewModel statusesViewModel) {
        UserJid A032 = AnonymousClass32Y.A03(jid);
        Log.d("Status changed");
        if (A032 != null) {
            Set set = statusesViewModel.A0G;
            synchronized (set) {
                set.add(A032);
            }
        }
        statusesViewModel.A0F();
    }

    public final void A0G(C95814uZ r13, Integer num, Integer num2) {
        String str;
        int intValue;
        UserJid A032 = AnonymousClass32Y.A03(r13);
        if (A032 != null) {
            C113995mK r3 = this.A0C;
            boolean z = true;
            Integer num3 = num;
            if (!(num == null || (intValue = num.intValue()) == 4 || intValue == 1 || intValue == 3 || intValue == 2)) {
                z = false;
                r3.A09(Boolean.FALSE);
            }
            C105765Wh r0 = this.A00;
            List list = r0.A02;
            List list2 = r0.A03;
            List list3 = r0.A01;
            Map map = null;
            if (z) {
                map = r0.A05;
                if (map.isEmpty()) {
                    str = null;
                } else {
                    str = C73703fw.A01(",", this.A00.A05.keySet().toArray(new String[0]));
                }
            } else {
                str = null;
            }
            r3.A07(A032, num3, num2, str, list, list2, list3, map);
        }
    }
}
