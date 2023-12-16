package X;

import com.whatsapp.jid.Jid;
import java.util.HashMap;

/* renamed from: X.3T1  reason: invalid class name */
public class AnonymousClass3T1 implements AnonymousClass4EZ {
    public final /* synthetic */ AnonymousClass1FE A00;
    public final /* synthetic */ C66503Lr A01;
    public final /* synthetic */ AnonymousClass4B6 A02;
    public final /* synthetic */ Runnable A03;
    public final /* synthetic */ boolean A04;

    public AnonymousClass3T1(AnonymousClass1FE r1, C66503Lr r2, AnonymousClass4B6 r3, Runnable runnable, boolean z) {
        this.A01 = r2;
        this.A02 = r3;
        this.A04 = z;
        this.A03 = runnable;
        this.A00 = r1;
    }

    public void BSN(AnonymousClass36K r3, String str) {
        this.A02.BkI(C57492tj.A01(r3));
    }

    public void BQs(String str) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("GroupIqResponseUtil/remove-admin/delivery fail; groupId=");
        C18260x0.A0o(this.A00.A03, A0o);
    }

    public void BdM(AnonymousClass36K r6, String str) {
        String str2;
        Jid A07 = AnonymousClass36K.A07(r6);
        if (A07 == null) {
            this.A02.BkI(800);
            return;
        }
        HashMap A0t = AnonymousClass001.A0t();
        HashMap A0t2 = AnonymousClass001.A0t();
        if (this.A04) {
            str2 = "admin";
        } else {
            str2 = "demote";
        }
        C66503Lr r0 = this.A01;
        AnonymousClass31X.A02(r6, str2, A0t, A0t2);
        C66503Lr.A00(r0);
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("groupmgr/onDemoteGroupParticipants/");
        A0o.append(A07);
        C18260x0.A1L(A0o, AnonymousClass0x2.A0g(A0o, A0t, A0t2));
        if (A0t2.size() > 0) {
            C18290x4.A1C(C66493Lq.A1H, A0t2, 3004);
        }
        this.A03.run();
    }
}
