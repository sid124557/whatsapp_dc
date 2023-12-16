package X;

import android.view.ViewGroup;
import com.whatsapp.R;

/* renamed from: X.4W4  reason: invalid class name */
public final class AnonymousClass4W4 extends AnonymousClass09G {
    public final AnonymousClass4GQ A00;

    public /* bridge */ /* synthetic */ C05570Ua BQR(ViewGroup viewGroup, int i) {
        C162457s7.A0J(viewGroup, 0);
        if (i == 1) {
            return new AnonymousClass51Q(C18300x5.A0F(C18280x3.A0D(viewGroup), viewGroup, R.layout.f8nameremoved), this.A00);
        }
        if (i == 2) {
            return new AnonymousClass51P(C18300x5.A0F(C18280x3.A0D(viewGroup), viewGroup, R.layout.f8nameremoved));
        }
        C18260x0.A0x("SettingsSearchResultsListAdapter/onCreateViewHolder type not handled - ", AnonymousClass001.A0o(), i);
        throw AnonymousClass000.A0G("Unexpected view type: ", AnonymousClass001.A0o(), i);
    }

    public AnonymousClass4W4(AnonymousClass4GQ r2) {
        super((AnonymousClass0O4) AnonymousClass4Vv.A00);
        this.A00 = r2;
    }

    public /* bridge */ /* synthetic */ void BNf(C05570Ua r2, int i) {
        AnonymousClass6J0 r22 = (AnonymousClass6J0) r2;
        C162457s7.A0J(r22, 0);
        Object A0K = A0K(i);
        C162457s7.A0D(A0K);
        r22.A07((C104825Sm) A0K);
    }

    public int getItemViewType(int i) {
        return ((C104825Sm) A0K(i)).A00;
    }
}
