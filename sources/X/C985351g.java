package X;

import android.content.Context;
import android.os.Handler;
import com.whatsapp.R;
import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.51g  reason: invalid class name and case insensitive filesystem */
public final class C985351g extends C105395Ut implements AnonymousClass66H {
    public float A00;
    public C86884Mf A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public final C101565Fg A08;
    public final C30721mu A09;
    public final C87344Pf A0A;
    public final AnonymousClass5U7 A0B;
    public final C115905pQ A0C;
    public final C104995Td A0D;

    public void A07() {
        AnonymousClass33C r0;
        File file;
        this.A07 = false;
        this.A06 = false;
        this.A00 = 0.0f;
        this.A03 = false;
        AnonymousClass5U7 r1 = this.A0B;
        List list = r1.A04;
        if (list == null) {
            list = AnonymousClass001.A0s();
            r1.A04 = list;
        }
        list.add(this);
        if (!(this.A01 != null || (r0 = this.A09.A01) == null || (file = r0.A0F) == null)) {
            C64333Db r2 = this.A08.A00.A01;
            C54292oU A2q = C64333Db.A2q(r2);
            AnonymousClass1VX A4B = C64333Db.A4B(r2);
            C55682qk A012 = C64333Db.A01(r2);
            C56612sH A2p = C64333Db.A2p(r2);
            new AnonymousClass5C0();
            C86884Mf r3 = new C86884Mf(A012, A2p, A2q, A4B, this, C72343dZ.A00(r2.A00.A5r), file);
            this.A01 = r3;
            if (r3.A02 == null) {
                r3.start();
                Handler handler = new Handler(r3.getLooper());
                C117635sF.A00(handler, r3, 2);
                C117635sF.A00(handler, r3, 3);
                r3.A02 = handler;
            }
        }
        if (!this.A02 && this.A05.A00.A06) {
            this.A02 = true;
            r1.A03(this);
        }
        this.A0D.A02(R.string.f11nameremoved);
    }

    public void BMr(boolean z) {
        A0B(false);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C985351g(C184988ss r12, C101565Fg r13, C69263Wi r14, C105365Uq r15, C620633i r16, C620733j r17, C48132eP r18, C624134x r19, C104035Pj r20, AnonymousClass5U7 r21, C104995Td r22) {
        super(r12, r14, r16, r17, r18, r20);
        C624134x r3 = r19;
        this.A0B = r21;
        this.A08 = r13;
        this.A0D = r22;
        C626936e.A06(r3);
        C30721mu r32 = (C30721mu) r3;
        this.A09 = r32;
        Context A032 = A03();
        C18260x0.A0O(A032, r32);
        C87344Pf r2 = new C87344Pf(A032);
        r2.setMessage(r32, r15);
        this.A0A = r2;
        this.A0C = new C115905pQ(r32, r2.getWavesView());
        r2.setId(R.id.status_playback_voice);
    }

    public long A02() {
        return TimeUnit.SECONDS.toMillis((long) this.A09.A0B);
    }

    public void A08() {
        Handler handler;
        C86884Mf r2 = this.A01;
        if (!(r2 == null || (handler = r2.A02) == null)) {
            C117635sF.A00(handler, r2, 7);
        }
        this.A01 = null;
        AnonymousClass5U7 r1 = this.A0B;
        r1.A02(this);
        this.A02 = false;
        List list = r1.A04;
        if (list != null) {
            list.remove(this);
        }
        this.A07 = true;
    }

    public final void A0B(boolean z) {
        C86884Mf r2;
        C86884Mf r22;
        Handler handler;
        int i;
        Handler handler2;
        if (this.A03 && (r2 = this.A01) != null) {
            if (z) {
                C104995Td r6 = this.A0D;
                if (System.currentTimeMillis() - r6.A00 > 2000) {
                    r6.A00 = System.currentTimeMillis();
                    r6.A02.A0H(R.string.f11nameremoved, 0);
                }
                r22 = this.A01;
                if (!(r22 == null || (handler = r22.A02) == null)) {
                    i = 8;
                }
            } else {
                if (this.A05 && (handler2 = r2.A02) != null) {
                    C117635sF.A00(handler2, r2, 4);
                }
                r22 = this.A01;
                if (!(r22 == null || (handler = r22.A02) == null)) {
                    i = 0;
                }
            }
            C117635sF.A00(handler, r22, i);
        }
        this.A05 = z;
    }

    public void BMv(int i, int i2, int i3) {
    }
}
