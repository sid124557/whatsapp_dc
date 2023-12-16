package X;

import android.app.Application;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.4U0  reason: invalid class name */
public final class AnonymousClass4U0 extends AnonymousClass08N implements C181938nb {
    public String A00;
    public boolean A01;
    public final AnonymousClass08J A02;
    public final AnonymousClass5MC A03;
    public final AnonymousClass5ML A04;
    public final C103765Oi A05;
    public final AnonymousClass7KR A06;
    public final C166447yh A07;
    public final C104795Sj A08;
    public final AnonymousClass5ZI A09;
    public final AnonymousClass4UC A0A = AnonymousClass0x9.A0b();
    public final String A0B;
    public final String A0C;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4U0(Application application, AnonymousClass5MC r6, AnonymousClass5ML r7, C103765Oi r8, AnonymousClass7KR r9, C166447yh r10, C104795Sj r11, String str, String str2) {
        super(application);
        C18260x0.A0b(application, r11, r7, 1);
        C162457s7.A0J(str2, 8);
        C162457s7.A0J(r6, 9);
        this.A05 = r8;
        this.A06 = r9;
        this.A08 = r11;
        this.A04 = r7;
        this.A0B = str;
        this.A07 = r10;
        this.A0C = str2;
        this.A03 = r6;
        AnonymousClass08J A0E = AnonymousClass4L0.A0E();
        this.A02 = A0E;
        r8.A00 = r9;
        C86604Kt.A1O(r9.A00, A0E, C1001359q.A00(this, 12), 69);
        AnonymousClass5ZI A002 = r6.A00(this.A07 != null ? 741480633 : 741478382);
        this.A09 = A002;
        A002.A08();
    }

    public /* bridge */ /* synthetic */ void Baa(C135976le r6) {
        this.A01 = true;
        ArrayList A0s = AnonymousClass001.A0s();
        AnonymousClass08J r3 = this.A02;
        List A0h = C86644Kx.A0h(r3);
        if (A0h != null) {
            A0s.addAll(A0h.subList(0, AnonymousClass002.A04(A0h, 1)));
        }
        A0s.add(new C136186lz(66));
        r3.A0G(A0s);
        A0E(this.A07);
    }

    public void A0C() {
        this.A05.A00 = null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0093, code lost:
        if (r2.A01 != false) goto L_0x0095;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0E(X.C166447yh r17) {
        /*
            r16 = this;
            r2 = r16
            X.7KR r0 = r2.A06
            X.08M r0 = r0.A00
            java.lang.Object r0 = r0.A07()
            X.7gx r0 = (X.C156637gx) r0
            if (r0 == 0) goto L_0x00c4
            X.7YI r3 = r0.A03
        L_0x0010:
            r0 = 1
            r4 = 0
            r11 = 0
            r5 = r17
            if (r17 != 0) goto L_0x007d
            X.08J r3 = r2.A02
            X.6lz[] r1 = new X.C136186lz[r0]
            X.6lX r0 = new X.6lX
            r0.<init>()
            r1[r4] = r0
            java.util.ArrayList r0 = X.C162197rQ.newArrayList((java.lang.Object[]) r1)
            r3.A0G(r0)
        L_0x0029:
            X.5Oi r0 = r2.A05
            java.lang.String r15 = r2.A0C
            X.5MC r3 = r2.A03
            X.7yh r2 = r2.A07
            r1 = 741478382(0x2c320fee, float:2.5304164E-12)
            if (r2 == 0) goto L_0x0039
            r1 = 741480633(0x2c3218b9, float:2.5309045E-12)
        L_0x0039:
            X.5ZI r12 = r3.A00(r1)
            r0.A00()
            X.5Fe r2 = r0.A05
            X.5GG r1 = r0.A06
            X.2xN r10 = r1.A00
            r1 = 1
            X.5bO r9 = new X.5bO
            r9.<init>(r0, r1)
            X.5sy r1 = r2.A00
            X.3Db r2 = r1.A01
            X.2qk r3 = X.C64333Db.A01(r2)
            X.4FS r14 = X.C64333Db.A8y(r2)
            X.33j r7 = X.C64333Db.A2t(r2)
            X.5bk r1 = r2.A00
            X.8n8 r4 = r1.AIq()
            X.2tC r6 = X.C86624Kv.A0R(r2)
            X.4C1 r1 = r1.A2w
            java.lang.Object r13 = r1.get()
            X.5GZ r13 = (X.AnonymousClass5GZ) r13
            X.1VX r8 = X.C64333Db.A4B(r2)
            X.4vw r2 = new X.4vw
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r2.A08()
            r0.A03 = r2
        L_0x007c:
            return
        L_0x007d:
            if (r3 != 0) goto L_0x0098
            X.08J r3 = r2.A02
            X.6lz[] r1 = new X.C136186lz[r0]
            X.6lX r0 = new X.6lX
            r0.<init>()
            r1[r4] = r0
            java.util.ArrayList r0 = X.C162197rQ.newArrayList((java.lang.Object[]) r1)
            r3.A0G(r0)
            boolean r0 = r2.A01
            if (r0 == 0) goto L_0x0029
        L_0x0095:
            r2.A01 = r4
            goto L_0x0029
        L_0x0098:
            java.lang.String r1 = r3.A01
            if (r1 == 0) goto L_0x00bd
            boolean r0 = r2.A01
            if (r0 == 0) goto L_0x00aa
            r1 = 150(0x96, float:2.1E-43)
            java.lang.String r0 = r2.A00
            X.7YI r11 = new X.7YI
            r11.<init>(r1, r0)
            goto L_0x0095
        L_0x00aa:
            java.lang.String r0 = r2.A00
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x007c
            int r0 = r3.A00
            X.7YI r11 = new X.7YI
            r11.<init>(r0, r1)
            r2.A00 = r1
            goto L_0x0029
        L_0x00bd:
            java.lang.String r0 = "BusinessApiBrowseFragmentViewModel/fetchBusinessProfiles end of results case - this method should have not been called"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            goto L_0x0029
        L_0x00c4:
            r3 = 0
            goto L_0x0010
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4U0.A0E(X.7yh):void");
    }

    public final void A0D(int i) {
        ArrayList A0s = AnonymousClass001.A0s();
        if (this.A04.A00(this.A0B)) {
            this.A08.A01(1, -1, -1);
        }
        AnonymousClass08J r3 = this.A02;
        List A0h = C86644Kx.A0h(r3);
        if (A0h != null) {
            if (((C136186lz) C73723fy.A05(A0h)).A00 == 66) {
                A0s.addAll(A0h.subList(0, AnonymousClass002.A03(A0h)));
            }
            A0s.add(new C132486fQ(this, i));
        }
        r3.A0G(A0s);
    }
}
