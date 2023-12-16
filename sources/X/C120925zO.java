package X;

import android.view.View;
import android.widget.TextView;
import com.whatsapp.R;

/* renamed from: X.5zO  reason: invalid class name and case insensitive filesystem */
public final class C120925zO extends C829045j implements AnonymousClass4GP {
    public final /* synthetic */ C108895dj $fbUserFullName;
    public final /* synthetic */ View $rootView;
    public final /* synthetic */ TextView $textView;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C120925zO(View view, TextView textView, C108895dj r4) {
        super(0);
        this.$textView = textView;
        this.$fbUserFullName = r4;
        this.$rootView = view;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        String string;
        TextView textView = this.$textView;
        C108895dj r1 = this.$fbUserFullName;
        if (r1 != null) {
            string = (String) r1.A00("XFAM_CROSSPOSTING_STATUS_PRIVACY_UI");
        } else {
            string = this.$rootView.getResources().getString(R.string.f11nameremoved);
        }
        textView.setText(string);
        return C59022wD.A00;
    }
}
