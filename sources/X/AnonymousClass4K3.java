package X;

import com.whatsapp.util.Log;
import java.util.Map;

/* renamed from: X.4K3  reason: invalid class name */
public class AnonymousClass4K3 implements C84404Cf {
    public Object A00;
    public Object A01;
    public final int A02;

    public AnonymousClass4K3(Object obj, int i, Object obj2) {
        this.A02 = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public void Bds() {
        switch (this.A02) {
            case 0:
                Log.d("CompanionSyncdBootstrapManager/startCriticalBootstrapPhase onSyncdFailed");
                break;
            case 1:
                ((C65203Gp) this.A00).A09.A07(this);
                return;
            case 2:
                Log.i("sync-manager/doPreCompanionLogoutTask onSyncdFailed");
                break;
            default:
                return;
        }
        ((AnonymousClass3XA) this.A01).A05(Boolean.FALSE);
    }

    public void Bdt() {
        boolean z;
        switch (this.A02) {
            case 0:
                AnonymousClass2S4 r10 = (AnonymousClass2S4) this.A00;
                C56272ri r8 = r10.A04;
                long j = 0;
                long A0D = AnonymousClass0x2.A0D(r8.A00("critical_block"));
                Long A002 = r8.A00("critical_unblock_low");
                if (A002 != null) {
                    j = A002.longValue();
                }
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("CompanionSyncdBootstrapManager/startCriticalBootstrapPhase onSyncdSuccess, criticalBlockVersion=");
                A0o.append(A0D);
                C18260x0.A10(", criticalUnblockVersion=", A0o, j);
                if (r8.A06("critical_block") && A0D >= 1) {
                    C18270x1.A0h(C55262q4.A00(r10.A03), "companion_syncd_critical_bootstrap_state", 2);
                }
                if (r8.A06("critical_block") && A0D >= 1) {
                    z = r8.A06("critical_unblock_low");
                    break;
                } else {
                    return;
                }
            case 1:
                C65203Gp r2 = (C65203Gp) this.A00;
                r2.A09.A07(this);
                Map A012 = r2.A0Y.A01();
                C64663Ek r22 = r2.A0H;
                boolean equals = A012.equals(this.A01);
                AnonymousClass1WQ r1 = new AnonymousClass1WQ();
                r1.A00 = Boolean.valueOf(equals);
                C64663Ek.A05(r22, r1);
                return;
            case 2:
                Log.i("sync-manager/doPreCompanionLogoutTask onSyncdSuccess");
                break;
            case 3:
                z = ((C29031iA) this.A00).A0f.A0A("sentinel", true).isEmpty();
                break;
            default:
                return;
        }
        if (!z) {
            return;
        }
        ((AnonymousClass3XA) this.A01).A05(Boolean.TRUE);
    }
}
