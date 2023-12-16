package X;

import com.whatsapp.util.Log;
import java.util.List;

/* renamed from: X.99z  reason: invalid class name and case insensitive filesystem */
public class C1908299z extends C191819Go {
    public final int A00;
    public final AnonymousClass9RT A01;
    public final C202989mw A02;
    public final List A03;

    public C1908299z(C29441ip r7, C620933l r8, AnonymousClass9U5 r9, AnonymousClass9RT r10, C202989mw r11, C193119Nf r12, AnonymousClass28X r13, List list, int i) {
        super(r7, r8, r9, r12, r13);
        this.A03 = list;
        this.A02 = r11;
        this.A00 = i;
        this.A01 = r10;
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        AnonymousClass34V A0M;
        AnonymousClass0PJ r7 = (AnonymousClass0PJ) obj;
        String str = (String) r7.A00;
        AnonymousClass34V r4 = (AnonymousClass34V) r7.A01;
        C202989mw r3 = this.A02;
        if (r3 != null) {
            if (str == null) {
                Log.i(C160757oG.A01("PinTokenizer", AnonymousClass000.A0P(r4, "PaymentPinTokenTask token error: ", AnonymousClass001.A0o())));
                if (r4 != null) {
                    A0M = r4;
                } else {
                    A0M = C1899693i.A0M();
                }
                r3.BS6(A0M);
            } else {
                r3.BdD(str);
            }
        }
        AnonymousClass9RT r32 = this.A01;
        if (r32 == null) {
            return;
        }
        if (str == null) {
            Log.i(C160757oG.A01("PinTokenizer", AnonymousClass000.A0P(r4, "PaymentPinTokenTask token error: ", AnonymousClass001.A0o())));
            if (r4 == null) {
                r4 = C1899693i.A0M();
            }
            if (r32.A01.compareAndSet(false, true)) {
                r32.A02.decrementAndGet();
                r32.A00.BS6(r4);
                return;
            }
            return;
        }
        r32.A00(this.A00, str);
    }
}
