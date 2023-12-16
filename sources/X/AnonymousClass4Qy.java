package X;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.whatsapp.R;

/* renamed from: X.4Qy  reason: invalid class name */
public class AnonymousClass4Qy extends LinearLayout implements AnonymousClass4GJ {
    public ProgressBar A00;
    public TextView A01;
    public AnonymousClass5ST A02;
    public C116855qy A03;
    public boolean A04;

    public final Object generatedComponent() {
        C116855qy r0 = this.A03;
        if (r0 == null) {
            r0 = C116855qy.A00(this);
            this.A03 = r0;
        }
        return r0.generatedComponent();
    }

    public AnonymousClass4Qy(Context context) {
        super(context);
        if (!this.A04) {
            this.A04 = true;
            this.A02 = C86624Kv.A0Q(C88864av.A00(generatedComponent()));
        }
        View.inflate(context, R.layout.f8nameremoved, this);
        int A022 = C86654Ky.A02(context.getResources(), R.dimen.f6nameremoved, AnonymousClass5YL.A00(context));
        setPadding(A022, 0, A022, 0);
        this.A01 = C18300x5.A0G(this, R.id.history_sync_progress_text);
        this.A00 = (ProgressBar) C06560Yg.A02(this, R.id.history_sync_progress_loader);
        this.A01.setTextSize(this.A02.A01(getResources()));
    }
}
