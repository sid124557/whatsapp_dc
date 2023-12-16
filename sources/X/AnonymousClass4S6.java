package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.RadioButton;
import android.widget.ScrollView;
import com.whatsapp.R;
import com.whatsapp.WaTextView;
import com.whatsapp.wds.components.button.WDSButton;

/* renamed from: X.4S6  reason: invalid class name */
public final class AnonymousClass4S6 extends ScrollView {
    public final ViewStub A00;
    public final ViewStub A01;
    public final RadioButton A02 = ((RadioButton) C18280x3.A0E(this, R.id.only_share_with_button));
    public final RadioButton A03 = ((RadioButton) C18280x3.A0E(this, R.id.my_contacts_except_button));
    public final RadioButton A04 = ((RadioButton) C18280x3.A0E(this, R.id.my_contacts_button));
    public final WaTextView A05;
    public final WaTextView A06;
    public final WaTextView A07;
    public final WDSButton A08;

    public AnonymousClass4S6(Context context) {
        super(context, (AttributeSet) null);
        View.inflate(getContext(), R.layout.f8nameremoved, this);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -2, 80));
        setPadding(0, getResources().getDimensionPixelSize(R.dimen.f6nameremoved), 0, getResources().getDimensionPixelSize(R.dimen.f6nameremoved));
        WaTextView A0O = C86604Kt.A0O(this, R.id.status_privacy_bottom_sheet_title);
        this.A07 = A0O;
        WaTextView A0O2 = C86604Kt.A0O(this, R.id.excluded);
        this.A05 = A0O2;
        WaTextView A0O3 = C86604Kt.A0O(this, R.id.included);
        this.A06 = A0O3;
        this.A00 = (ViewStub) C18280x3.A0E(this, R.id.status_privacy_stub);
        this.A01 = (ViewStub) C18280x3.A0E(this, R.id.waffle_privacy_stub);
        this.A08 = C86614Ku.A0p(this, R.id.done_btn);
        C106905aM.A04(A0O);
        C106905aM.A04(A0O2);
        C106905aM.A04(A0O3);
    }

    public final void A00() {
        this.A03.setChecked(false);
        this.A04.setChecked(false);
        this.A02.setChecked(false);
    }
}
