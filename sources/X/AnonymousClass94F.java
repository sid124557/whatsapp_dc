package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.whatsapp.R;

/* renamed from: X.94F  reason: invalid class name */
public class AnonymousClass94F extends FrameLayout implements AnonymousClass4GJ {
    public TextView A00;
    public TextView A01;
    public C56612sH A02;
    public C620733j A03;
    public C195219Wq A04;
    public C116855qy A05;
    public boolean A06;

    public final Object generatedComponent() {
        C116855qy r0 = this.A05;
        if (r0 == null) {
            r0 = C116855qy.A00(this);
            this.A05 = r0;
        }
        return r0.generatedComponent();
    }

    public AnonymousClass94F(Context context) {
        super(context);
        if (!this.A06) {
            this.A06 = true;
            C64333Db A002 = C88864av.A00(generatedComponent());
            this.A02 = C64333Db.A2p(A002);
            this.A04 = C1899693i.A0S(A002);
            this.A03 = C64333Db.A2t(A002);
        }
        View.inflate(getContext(), R.layout.f8nameremoved, this);
        this.A01 = C18300x5.A0G(this, R.id.date);
        this.A00 = C18300x5.A0G(this, R.id.amount);
    }
}
