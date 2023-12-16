package X;

import android.view.ViewGroup;
import com.whatsapp.R;
import java.util.List;

/* renamed from: X.95C  reason: invalid class name */
public class AnonymousClass95C extends AnonymousClass0R6 {
    public final C56972sr A00;
    public final C53762nc A01;
    public final C152967aS A02;
    public final C114015mM A03;
    public final C620633i A04;
    public final C54292oU A05;
    public final C620733j A06;
    public final AnonymousClass1VX A07;
    public final C1907099n A08;
    public final C195219Wq A09;
    public final C106715a2 A0A;
    public final C33141sV A0B;
    public final List A0C = AnonymousClass001.A0s();

    public int A0G() {
        return this.A0C.size();
    }

    public /* bridge */ /* synthetic */ void BNf(C05570Ua r2, int i) {
        ((AnonymousClass95T) r2).A07((AnonymousClass9NY) this.A0C.get(i));
    }

    public int getItemViewType(int i) {
        return ((AnonymousClass9NY) this.A0C.get(i)).A00;
    }

    public AnonymousClass95C(C56972sr r2, C53762nc r3, C152967aS r4, C114015mM r5, C620633i r6, C54292oU r7, C620733j r8, AnonymousClass1VX r9, C1907099n r10, C195219Wq r11, C106715a2 r12, C33141sV r13) {
        this.A05 = r7;
        this.A07 = r9;
        this.A0A = r12;
        this.A09 = r11;
        this.A04 = r6;
        this.A03 = r5;
        this.A02 = r4;
        this.A08 = r10;
        this.A06 = r8;
        this.A0B = r13;
        this.A00 = r2;
        this.A01 = r3;
    }

    public /* bridge */ /* synthetic */ C05570Ua BQR(ViewGroup viewGroup, int i) {
        switch (i) {
            case 0:
                return new AnonymousClass9EI(AnonymousClass001.A0R(C86604Kt.A0D(viewGroup), viewGroup, R.layout.f8nameremoved), this.A03);
            case 1:
            case 12:
                return new AnonymousClass9EP(AnonymousClass001.A0R(C86604Kt.A0D(viewGroup), viewGroup, R.layout.f8nameremoved), this.A09);
            case 2:
                return new AnonymousClass9EM(AnonymousClass001.A0R(C86604Kt.A0D(viewGroup), viewGroup, R.layout.f8nameremoved), this.A02, this.A06, this.A0B);
            case 3:
                AnonymousClass1VX r4 = this.A07;
                C106715a2 r6 = this.A0A;
                C195219Wq r5 = this.A09;
                return new AnonymousClass9EO(AnonymousClass001.A0R(C86604Kt.A0D(viewGroup), viewGroup, R.layout.f8nameremoved), this.A04, r4, r5, r6);
            case 4:
                return new AnonymousClass9EK(AnonymousClass001.A0R(C86604Kt.A0D(viewGroup), viewGroup, R.layout.f8nameremoved), this.A05);
            case 5:
                return new AnonymousClass9EN(AnonymousClass001.A0R(C86604Kt.A0D(viewGroup), viewGroup, R.layout.f8nameremoved), this.A06, this.A08);
            case 6:
                return new AnonymousClass9EJ(AnonymousClass001.A0R(C86604Kt.A0D(viewGroup), viewGroup, R.layout.f8nameremoved), this.A01);
            case 7:
                return new AnonymousClass9EH(AnonymousClass001.A0R(C86604Kt.A0D(viewGroup), viewGroup, R.layout.f8nameremoved));
            case 8:
                return new AnonymousClass9EB(AnonymousClass001.A0R(C86604Kt.A0D(viewGroup), viewGroup, R.layout.f8nameremoved));
            case 9:
                return new AnonymousClass9ED(AnonymousClass001.A0R(C86604Kt.A0D(viewGroup), viewGroup, R.layout.f8nameremoved));
            case 10:
                return new AnonymousClass9EC(AnonymousClass001.A0R(C86604Kt.A0D(viewGroup), viewGroup, R.layout.f8nameremoved));
            case 11:
                return new AnonymousClass9E9(AnonymousClass001.A0R(C86604Kt.A0D(viewGroup), viewGroup, R.layout.f8nameremoved));
            case 14:
                return new AnonymousClass9EF(AnonymousClass001.A0R(C86604Kt.A0D(viewGroup), viewGroup, R.layout.f8nameremoved));
            case 15:
                return new AnonymousClass9EL(C18310x6.A0I(C86604Kt.A0E(viewGroup, 0), viewGroup, R.layout.f8nameremoved, false));
            case 16:
                return new AnonymousClass9EE(C18310x6.A0I(C86604Kt.A0E(viewGroup, 0), viewGroup, R.layout.f8nameremoved, false));
            case 17:
                return new AnonymousClass9EA(C18310x6.A0I(C86604Kt.A0E(viewGroup, 0), viewGroup, R.layout.f8nameremoved, false));
            case 18:
                return new AnonymousClass9EG(C18310x6.A0I(C86604Kt.A0E(viewGroup, 0), viewGroup, R.layout.f8nameremoved, false));
            default:
                throw AnonymousClass001.A0e("PaymentCheckoutOrderDetailsAdapter/onCreateViewHolder/unhandled view type");
        }
    }
}
