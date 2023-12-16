package X;

import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.Voip;

/* renamed from: X.4jZ  reason: invalid class name and case insensitive filesystem */
public class C91414jZ extends C153457bL {
    public final /* synthetic */ AnonymousClass5U0 A00;
    public final /* synthetic */ C112455jl A01;
    public final /* synthetic */ C111665iU A02;
    public final /* synthetic */ C56612sH A03;
    public final /* synthetic */ C54292oU A04;
    public final /* synthetic */ AnonymousClass1VX A05;

    public C91414jZ(AnonymousClass5U0 r1, C112455jl r2, C111665iU r3, C56612sH r4, C54292oU r5, AnonymousClass1VX r6) {
        this.A01 = r2;
        this.A03 = r4;
        this.A05 = r6;
        this.A04 = r5;
        this.A02 = r3;
        this.A00 = r1;
    }

    public void A03(String str) {
        C626936e.A01();
        C112455jl r3 = this.A01;
        C105825Wo r2 = r3.A0Z;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("app/startOutgoingCall/onCreateOutgoingConnectionFailed ");
        A0o.append(str);
        C18260x0.A1R(A0o, ", pendingCallCommand: ", r2);
        if (r2 != null && str.equals(r2.A09)) {
            Log.w("app/startOutgoingCall/failed_create_outgoing_connection");
            r3.A0Z = null;
            r3.A02.removeMessages(1);
        }
        this.A00.A03(str, 97);
    }

    public void A06(String str, boolean z) {
        AnonymousClass4FS r1;
        int i;
        C626936e.A01();
        C112455jl r2 = this.A01;
        C105825Wo r4 = r2.A0Z;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("app/startOutgoingCall/onCreateOutgoingConnection ");
        A0o.append(str);
        C18260x0.A1R(A0o, ", pendingCallCommand: ", r4);
        if (r4 == null || !str.equals(r4.A09)) {
            this.A02.A04().A0I(str);
            return;
        }
        long j = r2.A00;
        if (j > 0) {
            r4.A01 = AnonymousClass0x7.A0E(j);
        } else {
            C626936e.A0D(false, "selfManagedConnectionNewCallTs is not set");
        }
        if (!z) {
            r1 = r2.A0X;
            i = 24;
        } else {
            boolean z2 = r4.A0C;
            boolean z3 = r4.A04;
            if (!z2 || z3 || !C627436k.A0J(r2.A0S) || !this.A05.A0X(6688)) {
                if (r4.A07 != null) {
                    r1 = r2.A0X;
                    i = 23;
                }
                r2.A0Z = null;
                r2.A02.removeMessages(1);
            }
            if (r2.A08(this.A04.A00, true)) {
                Voip.acceptCall();
            }
            r2.A0Z = null;
            r2.A02.removeMessages(1);
        }
        C86644Kx.A1R(r1, r2, r4, i);
        r2.A0Z = null;
        r2.A02.removeMessages(1);
    }
}
