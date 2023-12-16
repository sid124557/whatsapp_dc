package X;

import com.whatsapp.fieldstats.events.WamCall;
import java.util.Set;

/* renamed from: X.3Er  reason: invalid class name and case insensitive filesystem */
public class C64723Er implements AnonymousClass49Y {
    public long A00;
    public WamCall A01;
    public final C56972sr A02;
    public final C29441ip A03;
    public final C620633i A04;
    public final C56612sH A05;
    public final C54292oU A06;
    public final AnonymousClass33p A07;
    public final C45202Zb A08;
    public final C56142rU A09;
    public final AnonymousClass4AF A0A;
    public final C60152y5 A0B;
    public final AnonymousClass4FS A0C;
    public final C183538qC A0D;
    public final Set A0E;
    public volatile long A0F = -1;

    public final void A00(long j) {
        if (j >= this.A0F) {
            AnonymousClass33p r2 = this.A07;
            C18270x1.A0g(C18270x1.A03(r2).remove("voip_call_id"), "session_id_for_voip_call_id");
            C18270x1.A0g(C18270x1.A03(r2), "voip_call_ab_test_bucket");
            C57302tQ.A01(this.A0A, (String) null);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0007, code lost:
        if (r6.A06 == false) goto L_0x0009;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01(X.C50092hc r6) {
        /*
            r5 = this;
            X.4AF r4 = r5.A0A
            if (r6 == 0) goto L_0x0009
            boolean r1 = r6.A06
            r0 = 1
            if (r1 != 0) goto L_0x000a
        L_0x0009:
            r0 = 0
        L_0x000a:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            r3 = 0
            X.C162457s7.A0J(r4, r3)
            r0 = 23
            r4.Blk(r1, r0, r3)
            r2 = 1
            r4.Blk(r1, r0, r2)
            java.lang.Integer r1 = X.AnonymousClass26q.A00(r6)
            r0 = 105(0x69, float:1.47E-43)
            r4.Blk(r1, r0, r3)
            r4.Blk(r1, r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64723Er.A01(X.2hc):void");
    }

    public void BPq(C59622xD r2) {
        A01(this.A03.A0A());
    }

    public C64723Er(C56972sr r3, C29441ip r4, C620633i r5, C56612sH r6, C54292oU r7, AnonymousClass33p r8, C45202Zb r9, C56142rU r10, AnonymousClass4AF r11, C60152y5 r12, AnonymousClass4FS r13, C183538qC r14, Set set) {
        this.A05 = r6;
        this.A06 = r7;
        this.A0C = r13;
        this.A02 = r3;
        this.A09 = r10;
        this.A04 = r5;
        this.A0A = r11;
        this.A07 = r8;
        this.A0B = r12;
        this.A03 = r4;
        this.A0E = set;
        this.A08 = r9;
        this.A0D = r14;
    }
}
