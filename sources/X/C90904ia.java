package X;

import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.WaTextView;
import com.whatsapp.wds.components.button.WDSButton;
import java.util.List;

/* renamed from: X.4ia  reason: invalid class name and case insensitive filesystem */
public final class C90904ia extends C134576jG {
    public final WaTextView A00;
    public final WDSButton A01;

    public /* bridge */ /* synthetic */ void A0D(Object obj, List list) {
        C97854zM r10 = (C97854zM) obj;
        C162457s7.A0J(r10, 0);
        AnonymousClass5ZO r0 = r10.A00;
        String str = r0.A08;
        int i = 0;
        if (str != null) {
            boolean A07 = r0.A07();
            int i2 = R.string.f11nameremoved;
            if (A07) {
                i2 = R.string.f11nameremoved;
            }
            View view = this.A0H;
            String A0e = C18300x5.A0e(view.getContext(), str, new Object[1], 0, i2);
            if (r10.A02) {
                A0e = AnonymousClass000.A0V("[Internal] ", A0e, AnonymousClass001.A0o());
            }
            int A0G = C175728Zm.A0G(A0e, str, 0, false);
            if (A0G != -1) {
                int A0L = C86664Kz.A0L(str, A0G);
                SpannableStringBuilder A002 = C18330xA.A00(A0e);
                A002.setSpan(new StyleSpan(1), A0G, A0L, 0);
                A002.setSpan(C86634Kw.A0I(view.getContext(), R.color.f5nameremoved), A0G, A0L, 0);
                this.A00.setText(A002);
            }
        } else {
            this.A00.setText(R.string.f11nameremoved);
        }
        WDSButton wDSButton = this.A01;
        if (!r10.A03) {
            i = 8;
        }
        wDSButton.setVisibility(i);
        C18300x5.A18(wDSButton, r10, 19);
    }

    public C90904ia(View view) {
        super(view);
        this.A00 = C86604Kt.A0O(view, R.id.location_name);
        this.A01 = C86614Ku.A0p(view, R.id.btn_use_my_location);
    }
}
