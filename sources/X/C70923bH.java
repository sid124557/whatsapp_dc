package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.List;

/* renamed from: X.3bH  reason: invalid class name and case insensitive filesystem */
public class C70923bH implements Runnable {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public boolean A06;
    public final int A07;

    public C70923bH(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i, boolean z) {
        this.A07 = i;
        this.A00 = obj;
        this.A01 = obj2;
        this.A02 = obj3;
        this.A03 = obj4;
        this.A04 = obj5;
        this.A05 = obj6;
        this.A06 = z;
    }

    public final void run() {
        C624034w r5;
        if (this.A07 != 0) {
            AnonymousClass11I r4 = (AnonymousClass11I) this.A00;
            UserJid userJid = (UserJid) this.A01;
            boolean z = this.A06;
            AnonymousClass39I r7 = (AnonymousClass39I) this.A02;
            AnonymousClass38V r2 = (AnonymousClass38V) this.A03;
            AnonymousClass213 r8 = (AnonymousClass213) this.A04;
            List list = (List) this.A05;
            AnonymousClass2z0 r1 = r4.A0F;
            if (r1 != null) {
                C30791n7 r9 = (C30791n7) r4.A0C.A05.A05(r1);
                AnonymousClass08M r12 = r4.A03;
                AnonymousClass34W r42 = r4.A0D;
                Boolean valueOf = Boolean.valueOf(z);
                if (r2 != null) {
                    r5 = r2.A00;
                } else {
                    r5 = null;
                }
                r12.A0G(r42.A00(r5, userJid, r7, r8, r9, valueOf, list));
                return;
            }
            return;
        }
        C55642qg r13 = (C55642qg) this.A00;
        AnonymousClass239 r3 = (AnonymousClass239) this.A01;
        AnonymousClass2S3 r22 = (AnonymousClass2S3) this.A02;
        AnonymousClass1DS r43 = (AnonymousClass1DS) this.A03;
        C21441Bv r52 = (C21441Bv) this.A04;
        C21451Bw r6 = (C21451Bw) this.A05;
        boolean z2 = this.A06;
        AnonymousClass3TC r0 = r13.A01;
        if (r0 == null || !r0.A03) {
            Log.i("CompanionDeviceQrHandler/request aborted, stopping");
        } else {
            r13.A05(r22, r3, r43, r52, r6, z2);
        }
    }
}
