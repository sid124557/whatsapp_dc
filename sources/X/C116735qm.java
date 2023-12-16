package X;

import com.whatsapp.xfamily.crossposting.ui.AutoShareNuxDialogFragment;
import java.util.List;

/* renamed from: X.5qm  reason: invalid class name and case insensitive filesystem */
public final class C116735qm implements AnonymousClass66O {
    public final /* synthetic */ C009707r A00;
    public final /* synthetic */ AnonymousClass66Q A01;
    public final /* synthetic */ C106955aR A02;
    public final /* synthetic */ Integer A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ List A05;

    public C116735qm(C009707r r1, AnonymousClass66Q r2, C106955aR r3, Integer num, String str, List list) {
        this.A02 = r3;
        this.A03 = num;
        this.A00 = r1;
        this.A05 = list;
        this.A04 = str;
        this.A01 = r2;
    }

    public void onSuccess() {
        C106245Ye.A00("CrosspostAccountValidationManager/validateAccountLink link successful");
        C106955aR r6 = this.A02;
        C183538qC r5 = r6.A04;
        C86644Kx.A0c(r5).A03(927599499, AnonymousClass36X.A03(this.A03), "INIT_CROSSPOST");
        C009707r r4 = this.A00;
        List list = this.A05;
        C86644Kx.A1C(new AutoShareNuxDialogFragment(new C102505Jc(this.A01, r6, this.A04, list)), r4);
        C86644Kx.A0c(r5).A05("SEE_CONTEXTUAL_UPSELL");
        C183538qC r3 = ((C116775qq) r6.A03.get()).A02;
        int A022 = C18280x3.A02(C86644Kx.A0B(r3), "pref_xfamily_audience_nux_dialog");
        C86604Kt.A15(((AnonymousClass2ZB) r3.get()).A00(), "pref_xfamily_audience_nux_dialog", A022 + 1);
    }

    public void BSw(C1000759i r3, Integer num, Integer num2) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("CrosspostAccountValidationManager/validateAccountLink Failed to link account. Error code: ");
        A0o.append(num);
        C18260x0.A1N(A0o, ", subcode: ", num2);
        this.A01.BSw(r3, num, num2);
    }
}
