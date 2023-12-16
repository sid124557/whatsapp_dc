package X;

import android.view.View;
import com.whatsapp.R;

/* renamed from: X.4Xi  reason: invalid class name and case insensitive filesystem */
public final class C88104Xi extends C05570Ua {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C88104Xi(View view, AnonymousClass1VX r5, C187958y5 r6, C183538qC r7) {
        super(view);
        C162457s7.A0J(r5, 1);
        C18260x0.A0a(r6, r7, view, 2);
        C106905aM.A03(view, R.id.create_group_call_title);
        C06560Yg.A02(view, R.id.subtitle).setSelected(true);
        AnonymousClass0x9.A0E(view, R.id.icon).setImageResource(C1001059l.A04 ? R.drawable.ic_action_new_call_filled_wds : R.drawable.ic_action_new_call);
        view.setOnClickListener(new C109725f5((Object) r5, (Object) r7, (Object) view, 19));
        C107235av.A02(view);
    }
}
