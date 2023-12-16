package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.whatsapp.R;

/* renamed from: X.0yz  reason: invalid class name and case insensitive filesystem */
public final class C19210yz extends LinearLayout {
    public C19210yz(Context context) {
        super(context, (AttributeSet) null, 0, 0);
        View inflate = View.inflate(context, R.layout.f8nameremoved, this);
        setGravity(17);
        if (C1001059l.A04) {
            AnonymousClass0x9.A0F(inflate, R.id.action_icon).setImageResource(C1001059l.A04 ? R.drawable.ic_voip_add_person_filled_wds : R.drawable.ic_voip_add_person);
        }
        C107295b4.A04(inflate, R.string.f11nameremoved);
        C107295b4.A02(inflate);
    }
}
