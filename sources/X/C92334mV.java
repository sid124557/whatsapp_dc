package X;

import android.content.Context;
import android.view.ViewGroup;
import androidx.cardview.widget.CardView;
import com.whatsapp.R;
import java.util.List;

/* renamed from: X.4mV  reason: invalid class name and case insensitive filesystem */
public final class C92334mV extends AnonymousClass4X9 {
    public C996657n A00 = C996657n.LINK_PREVIEW;
    public List A01;
    public final Context A02;
    public final AnonymousClass677 A03;
    public final C106435Yz A04;

    public C92334mV(Context context, AnonymousClass677 r3, C106435Yz r4, List list) {
        C162457s7.A0J(list, 3);
        this.A02 = context;
        this.A04 = r4;
        this.A01 = list;
        this.A03 = r3;
    }

    public /* bridge */ /* synthetic */ C05570Ua BQR(ViewGroup viewGroup, int i) {
        C162457s7.A0J(viewGroup, 0);
        Context context = this.A02;
        AnonymousClass677 r1 = this.A03;
        if (i == 0) {
            C93384oT r5 = new C93384oT(context, r1);
            int dimensionPixelSize = C18290x4.A0G(r5).getDimensionPixelSize(R.dimen.f6nameremoved);
            CardView A002 = AnonymousClass4X9.A00(r5, viewGroup);
            A002.setCardElevation(0.0f);
            A002.setElevation(0.0f);
            A002.setBackground(AnonymousClass0VX.A01(A002.getContext(), R.drawable.conversation_link_carousel_item_background));
            ViewGroup.MarginLayoutParams A0O = C86634Kw.A0O(r5);
            A0O.width = C18290x4.A0G(r5).getDimensionPixelSize(R.dimen.f6nameremoved);
            A0O.height = C18290x4.A0G(r5).getDimensionPixelSize(R.dimen.f6nameremoved);
            A0O.setMargins(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
            r5.setLayoutParams(A0O);
            return new C92364mY(A002);
        }
        CardView A003 = AnonymousClass4X9.A00(new C93374oS(context, r1), viewGroup);
        A003.setCardElevation(0.0f);
        A003.setElevation(0.0f);
        A003.setBackground(AnonymousClass0VX.A01(A003.getContext(), R.drawable.conversation_link_carousel_item_background));
        return new C92354mX(A003);
    }

    public int A0G() {
        return this.A01.size();
    }

    public /* bridge */ /* synthetic */ void BNf(C05570Ua r4, int i) {
        AnonymousClass4Z0 r42 = (AnonymousClass4Z0) r4;
        C162457s7.A0J(r42, 0);
        C104535Ri r2 = new C104535Ri((C30481mW) this.A01.get(i), this.A01.size());
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("ConversationRowBotPluginLinksAdapter/onBindViewHolder");
        AnonymousClass2z0.A0A(r2.A01.A1J, A0o);
        C18260x0.A0w(" position=", A0o, i);
        r42.A07(r2);
    }

    public int getItemViewType(int i) {
        return this.A00.ordinal();
    }
}
