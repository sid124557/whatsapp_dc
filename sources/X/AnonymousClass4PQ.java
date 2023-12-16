package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.whatsapp.R;

/* renamed from: X.4PQ  reason: invalid class name */
public class AnonymousClass4PQ extends FrameLayout implements AnonymousClass4GJ {
    public C116855qy A00;
    public boolean A01;
    public final Context A02;
    public final ViewGroup.MarginLayoutParams A03;
    public final TextView A04;

    public final Object generatedComponent() {
        C116855qy r0 = this.A00;
        if (r0 == null) {
            r0 = C116855qy.A00(this);
            this.A00 = r0;
        }
        return r0.generatedComponent();
    }

    public AnonymousClass4PQ(Context context) {
        super(context);
        if (!this.A01) {
            this.A01 = true;
            generatedComponent();
        }
        this.A02 = context;
        View.inflate(getContext(), R.layout.f8nameremoved, this);
        this.A04 = C18300x5.A0G(this, R.id.title);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
        this.A03 = marginLayoutParams;
        setLayoutParams(marginLayoutParams);
        AnonymousClass5Yj.A0A(getContext(), this, R.attr.f3nameremoved, R.color.f5nameremoved);
    }
}
