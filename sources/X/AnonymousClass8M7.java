package X;

import com.whatsapp.payments.ui.mapper.register.IndiaUpiMapperValuePropsActivity;

/* renamed from: X.8M7  reason: invalid class name */
public final /* synthetic */ class AnonymousClass8M7 implements Runnable {
    public final /* synthetic */ IndiaUpiMapperValuePropsActivity A00;

    public final void run() {
        IndiaUpiMapperValuePropsActivity indiaUpiMapperValuePropsActivity = this.A00;
        C197109ca r4 = indiaUpiMapperValuePropsActivity.A02;
        if (r4 != null) {
            r4.BKB(AnonymousClass001.A0f(), 9, "alias_intro", AnonymousClass6C7.A0h(indiaUpiMapperValuePropsActivity));
            return;
        }
        throw C18270x1.A0S("fieldStatsLogger");
    }

    public /* synthetic */ AnonymousClass8M7(IndiaUpiMapperValuePropsActivity indiaUpiMapperValuePropsActivity) {
        this.A00 = indiaUpiMapperValuePropsActivity;
    }
}
