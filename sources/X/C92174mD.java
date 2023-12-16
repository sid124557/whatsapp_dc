package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;

/* renamed from: X.4mD  reason: invalid class name and case insensitive filesystem */
public abstract class C92174mD extends C117035rH {
    public final float A00;
    public final ViewGroup A01;

    public static LayoutInflater A00(C117035rH r0) {
        return r0.A01.getActivity().getLayoutInflater();
    }

    public final void A08(C1225964z r6) {
        ViewGroup viewGroup = this.A01;
        if (viewGroup.getVisibility() != 8) {
            AnonymousClass0R8 A0R = C86634Kw.A0R(this.A01.getActivity());
            float A002 = A0R.A00();
            float f = this.A00;
            if (A002 != f) {
                A0R.A08(f);
                AnonymousClass0YZ.A0B(viewGroup, 0.0f);
            }
            viewGroup.setVisibility(8);
            r6.BUI();
        }
    }

    public C92174mD(ViewGroup viewGroup, AnonymousClass67A r3, int i) {
        super(r3, i);
        this.A01 = viewGroup;
        this.A00 = C86634Kw.A0R(r3.getActivity()).A00();
    }
}
