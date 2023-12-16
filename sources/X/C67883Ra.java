package X;

import java.util.List;
import java.util.Set;

/* renamed from: X.3Ra  reason: invalid class name and case insensitive filesystem */
public class C67883Ra implements AnonymousClass4EY {
    public final /* synthetic */ C66543Lv A00;
    public final /* synthetic */ C84504Cp A01;
    public final /* synthetic */ AnonymousClass4DV A02;
    public final /* synthetic */ AnonymousClass4FS A03;

    public C67883Ra(C66543Lv r1, C84504Cp r2, AnonymousClass4DV r3, AnonymousClass4FS r4) {
        this.A01 = r2;
        this.A03 = r4;
        this.A00 = r1;
        this.A02 = r3;
    }

    public void BaC(AnonymousClass2Oi r5) {
        if (r5 instanceof C29491iu) {
            List list = ((C29491iu) r5).A01;
            if (list != null && list.size() > 0) {
                int i = ((C624034w) C18290x4.A0k(list)).A02;
                Set set = AnonymousClass35F.A01;
                Integer valueOf = Integer.valueOf(i);
                if (!set.contains(valueOf) && !AnonymousClass35F.A00.contains(valueOf)) {
                    C71343bx.A00(this.A03, this.A02, this.A00, 23);
                    this.A01.BcX();
                    return;
                }
            } else {
                return;
            }
        }
        this.A01.BcU();
    }

    public void Ba4(AnonymousClass34V r3) {
        C18260x0.A1Q(AnonymousClass001.A0o(), "PAY: InteractiveMessageCheckoutInfoConverter verifyFromServer/onRequestError. paymentNetworkError: ", r3);
        this.A01.BcU();
    }

    public void BaB(AnonymousClass34V r3) {
        C18260x0.A1Q(AnonymousClass001.A0o(), "PAY: InteractiveMessageCheckoutInfoConverter verifyFromServer/onResponseError. paymentNetworkError: ", r3);
        this.A01.BcU();
    }
}
