package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.whatsapp.R;

/* renamed from: X.0zS  reason: invalid class name and case insensitive filesystem */
public final class C19380zS extends ConstraintLayout implements AnonymousClass4GJ {
    public C620733j A00;
    public C116855qy A01;
    public boolean A02;

    public final void setWhatsAppLocale(C620733j r2) {
        C162457s7.A0J(r2, 0);
        this.A00 = r2;
    }

    public final Object generatedComponent() {
        C116855qy r0 = this.A01;
        if (r0 == null) {
            r0 = new C116855qy(this);
            this.A01 = r0;
        }
        return r0.generatedComponent();
    }

    public final C620733j getWhatsAppLocale() {
        C620733j r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("whatsAppLocale");
    }

    public C19380zS(Context context, C109665ez r6, int i, int i2, int i3) {
        super(context);
        Resources resources;
        if (!this.A02) {
            this.A02 = true;
            this.A00 = C64333Db.A2t(((C88864av) ((C111685iW) generatedComponent())).A0K);
        }
        LayoutInflater.from(context).inflate(R.layout.f8nameremoved, this, true);
        AnonymousClass0x9.A0F(this, R.id.icon).setImageResource(i3);
        ImageView A0F = AnonymousClass0x9.A0F(this, R.id.right_arrow_icon);
        C18270x1.A0d(getContext(), A0F, getWhatsAppLocale(), R.drawable.ic_fab_next);
        if (C1001059l.A04 && (resources = context.getResources()) != null) {
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.f6nameremoved);
            A0F.getLayoutParams().width = dimensionPixelSize;
            A0F.getLayoutParams().height = dimensionPixelSize;
        }
        AnonymousClass002.A09(this, R.id.title).setText(i);
        TextView A09 = AnonymousClass002.A09(this, R.id.description);
        if (i2 == 0) {
            A09.setVisibility(8);
        } else {
            A09.setText(i2);
        }
        findViewById(R.id.container).setOnClickListener(r6);
    }
}
