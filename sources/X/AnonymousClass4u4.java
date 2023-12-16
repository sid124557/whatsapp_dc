package X;

import android.content.Context;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.WaTextView;

/* renamed from: X.4u4  reason: invalid class name */
public final class AnonymousClass4u4 extends AnonymousClass4X7 {
    public void BNf(C05570Ua r5, int i) {
        C162457s7.A0J(r5, 0);
        C179358j1 r1 = (C179358j1) this.A01.get(i);
        if (r1 instanceof C171388Gw) {
            C88384Yn r52 = (C88384Yn) r5;
            AnonymousClass3ZH r0 = ((C171388Gw) r1).A01;
            A0K(r0, r52);
            r52.A00.setTag(r0.A0H);
            r52.A07.setVisibility(8);
            r52.A08.setVisibility(8);
            WaTextView waTextView = r52.A03;
            waTextView.setVisibility(0);
            Context context = this.A04;
            AnonymousClass0x2.A0q(context, waTextView, R.color.f5nameremoved);
            C86614Ku.A11(context, waTextView, R.drawable.group_info_label_gray);
            waTextView.setText(R.string.f11nameremoved);
            return;
        }
        super.BNf(r5, i);
    }

    public C05570Ua BQR(ViewGroup viewGroup, int i) {
        C162457s7.A0J(viewGroup, 0);
        if (i == 1) {
            return new AnonymousClass6IW(C18310x6.A0I(C86604Kt.A0D(viewGroup), viewGroup, R.layout.f8nameremoved, false), this);
        }
        return super.BQR(viewGroup, i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4u4(Context context, C111095hX r3, AnonymousClass5ZU r4, C114015mM r5, C620633i r6, C56612sH r7, C620733j r8, AnonymousClass1VX r9, C106715a2 r10) {
        super(context, r3, r4, r5, r6, r7, r8, r9, r10);
        C18260x0.A0d(r7, r9, r10, r3);
        C18260x0.A0W(r5, r6, r4);
        C162457s7.A0J(r8, 9);
    }
}
