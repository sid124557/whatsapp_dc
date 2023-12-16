package X;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.whatsapp.R;

/* renamed from: X.4yo  reason: invalid class name and case insensitive filesystem */
public class C97594yo extends AnonymousClass4PY {
    public AnonymousClass5ST A00;
    public C620733j A01;
    public final Runnable A02;

    public C97594yo(Context context, Runnable runnable) {
        super(context);
        this.A02 = runnable;
        View.inflate(context, R.layout.f8nameremoved, this);
        C86654Ky.A0L(this, R.id.quoted_message_frame).setForeground(C107335b8.A07(context, C18310x6.A0G(context, R.drawable.balloon_incoming_frame), R.color.f5nameremoved));
        C107555bV.A05(C06560Yg.A02(this, R.id.quoted_title_frame), this.A01, 0, context.getResources().getDimensionPixelSize(R.dimen.f6nameremoved));
        C86604Kt.A1E(this, R.id.cancel, 0);
        C633939b.A00(C06560Yg.A02(this, R.id.cancel), this, 41);
        TextView A0G = C18300x5.A0G(this, R.id.quoted_title);
        A0G.setTextSize(this.A00.A02(context.getResources()));
        C106905aM.A04(A0G);
    }
}
