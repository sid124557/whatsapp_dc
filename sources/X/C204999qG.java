package X;

import android.content.Context;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;
import com.whatsapp.payments.ui.widget.PaymentView;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: X.9qG  reason: invalid class name and case insensitive filesystem */
public class C204999qG implements C84134Bd {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public final void AwB(Object obj) {
        Executor executor;
        Runnable r0;
        Object obj2 = obj;
        switch (this.A03) {
            case 0:
                AnonymousClass9QG r5 = (AnonymousClass9QG) this.A00;
                Object obj3 = this.A01;
                AnonymousClass9U4.A00(r5.A0D).A03(new AnonymousClass9WS(obj3, 0, r5), (C166587yw) this.A02);
                return;
            case 1:
                C194179Rw r4 = (C194179Rw) this.A00;
                AnonymousClass3QO r2 = (AnonymousClass3QO) this.A01;
                C193719Ps r3 = (C193719Ps) this.A02;
                AnonymousClass2QG r1 = (AnonymousClass2QG) r2.A09.A01();
                if (r1 != null && !r1.A02.get()) {
                    r1.A01.delete();
                }
                C149897Oi A022 = r2.A02();
                if (A022 == null || A022.A00 != 0) {
                    executor = r4.A02.A08;
                    r0 = new C198989fo(r3);
                } else {
                    executor = r4.A02.A08;
                    r0 = new C200129hp(A022, r3);
                }
                executor.execute(r0);
                return;
            case 2:
                AnonymousClass9DC r22 = (AnonymousClass9DC) this.A00;
                PaymentView paymentView = (PaymentView) this.A02;
                AnonymousClass9WW r12 = r22.A0W;
                C95814uZ r52 = r22.A0E;
                C626936e.A06(r52);
                UserJid userJid = r22.A0G;
                long j = r22.A02;
                String paymentNote = paymentView.getPaymentNote();
                List mentionedJids = paymentView.getMentionedJids();
                r12.A04(r22, (AnonymousClass39Q) this.A01, paymentView.getPaymentBackground(), r52, userJid, (AnonymousClass9PL) obj2, new C197519dL(r22, paymentView), paymentNote, mentionedJids, j);
                return;
            default:
                AnonymousClass9WW r53 = (AnonymousClass9WW) this.A00;
                C203759oG r32 = (C203759oG) this.A01;
                Context context = (Context) this.A02;
                AnonymousClass9PL r7 = (AnonymousClass9PL) obj2;
                r32.BjL();
                if (r7.A01 == 5 || (r53.A02.A0X(1084) && r7.A00 == 5)) {
                    r32.B1p();
                    C19340zH A002 = AnonymousClass5V0.A00(context);
                    boolean A023 = C29441ip.A02(context);
                    int i = R.string.f11nameremoved;
                    if (A023) {
                        i = R.string.f11nameremoved;
                    }
                    A002.A0T(i);
                    C19340zH.A06(A002);
                    C18280x3.A0q(A002);
                    return;
                }
                int i2 = r7.A01;
                if (i2 == 1 || i2 == 6 || !r53.A05(r7)) {
                    int i3 = r7.A01;
                    if (i3 != 1 && i3 != 6) {
                        AnonymousClass9WW.A02(context, new C204219p0(r32, 88), new C204219p0(r32, 89));
                        return;
                    } else if (r53.A05(r7)) {
                        AnonymousClass9WW.A00(context, new C204219p0(r32, 90), new C204219p0(r32, 91));
                        return;
                    } else {
                        r32.BWM(r7.A02);
                        return;
                    }
                } else {
                    AnonymousClass9WW.A01(context, new C204219p0(r32, 85), new C204219p0(r32, 87));
                    return;
                }
        }
    }

    public C204999qG(Object obj, Object obj2, Object obj3, int i) {
        this.A03 = i;
        this.A00 = obj3;
        this.A01 = obj2;
        this.A02 = obj;
    }
}
