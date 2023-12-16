package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.whatsapp.R;

/* renamed from: X.4PV  reason: invalid class name */
public final class AnonymousClass4PV extends FrameLayout implements AnonymousClass4GJ {
    public View A00;
    public View A01;
    public TextView A02;
    public TextView A03;
    public C56962sq A04;
    public C56982ss A05;
    public C116855qy A06;
    public boolean A07;

    public void setup(C009707r r10, C56982ss r11, AnonymousClass4FU r12, Runnable runnable, C56962sq r14, AnonymousClass64Q r15, AnonymousClass3ZH r16) {
        this.A05 = r11;
        this.A04 = r14;
        AnonymousClass64Q r5 = r15;
        AnonymousClass3ZH r3 = r16;
        this.A03.setOnClickListener(new C109585er(this, r3, r14, r5, r12, r10, 3));
        C18290x4.A1G(this.A02, runnable, 14);
    }

    public final Object generatedComponent() {
        C116855qy r0 = this.A06;
        if (r0 == null) {
            r0 = C116855qy.A00(this);
            this.A06 = r0;
        }
        return r0.generatedComponent();
    }

    public AnonymousClass4PV(Context context) {
        super(context);
        if (!this.A07) {
            this.A07 = true;
            generatedComponent();
        }
        View.inflate(context, R.layout.f8nameremoved, this);
        this.A00 = findViewById(R.id.content);
        this.A01 = findViewById(R.id.divider);
        this.A02 = AnonymousClass002.A09(this, R.id.add_btn);
        this.A03 = AnonymousClass002.A09(this, R.id.block_btn);
    }
}
