package X;

import com.whatsapp.jobqueue.job.messagejob.ProcessVCardMessageJob;
import java.util.List;

/* renamed from: X.3VM  reason: invalid class name */
public final class AnonymousClass3VM implements AnonymousClass4BS, AnonymousClass4BT, AnonymousClass4BU, AnonymousClass4G2 {
    public final C55682qk A00;
    public final C49712gy A01;
    public final C183538qC A02;

    public static void A00(AnonymousClass3VM r3, C624134x r4) {
        C162457s7.A0J(r4, 0);
        if (r4 instanceof C30421mQ) {
            C614530v r32 = (C614530v) r3.A02.get();
            C30421mQ r42 = (C30421mQ) r4;
            if (r42.A13() != null) {
                r32.A07(r42.A13(), r42.A1L);
            }
        } else if (r4 instanceof C30411mP) {
            ((C614530v) r3.A02.get()).A02((C30411mP) r4);
        } else {
            r3.A01(r4);
        }
    }

    public void B3F(C624134x r5) {
        C162457s7.A0J(r5, 0);
        if (r5 instanceof C30421mQ) {
            C30421mQ r52 = (C30421mQ) r5;
            List A012 = ((C614530v) this.A02.get()).A01(r52.A1L, false);
            if (!A012.isEmpty()) {
                r52.A1w(AnonymousClass001.A0n(A012, 0));
            }
        } else if (r5 instanceof C30411mP) {
            C30411mP r53 = (C30411mP) r5;
            List A013 = ((C614530v) this.A02.get()).A01(r53.A1L, false);
            if (!A013.isEmpty()) {
                r53.A1w(A013);
            }
        } else {
            A01(r5);
        }
    }

    public AnonymousClass3VM(C55682qk r1, C49712gy r2, C183538qC r3) {
        C18260x0.A0V(r1, r3, r2);
        this.A00 = r1;
        this.A02 = r3;
        this.A01 = r2;
    }

    public final void A01(C624134x r5) {
        StringBuilder A0o = AnonymousClass001.A0o();
        C624134x.A0S(r5, "Incorrect message type associated with FMessageContactDatabase, key=", A0o);
        C624134x.A0T(r5, ", message_type=", A0o);
        String obj = A0o.toString();
        C626936e.A0D(false, obj);
        C18260x0.A0t("FMessageContactDatabase/fill; ", obj, AnonymousClass001.A0o());
        this.A00.A0A("fmessage-database-mismatch", true, obj);
    }

    public void BGd(C624134x r3) {
        A00(this, r3);
        this.A01.A02(new ProcessVCardMessageJob(r3));
    }

    public void BrV(C624134x r1) {
        A00(this, r1);
    }
}
