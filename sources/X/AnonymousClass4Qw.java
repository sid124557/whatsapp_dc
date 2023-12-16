package X;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.whatsapp.R;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;

/* renamed from: X.4Qw  reason: invalid class name */
public class AnonymousClass4Qw extends LinearLayout implements AnonymousClass4GJ {
    public WaImageView A00;
    public WaTextView A01;
    public C116855qy A02;
    public boolean A03;

    public final Object generatedComponent() {
        C116855qy r0 = this.A02;
        if (r0 == null) {
            r0 = C116855qy.A00(this);
            this.A02 = r0;
        }
        return r0.generatedComponent();
    }

    public void setChecked(boolean z) {
        this.A00.setVisibility(AnonymousClass001.A08(z ? 1 : 0));
    }

    public void setText(int i) {
        this.A01.setText(i);
    }

    public AnonymousClass4Qw(Context context) {
        super(context);
        if (!this.A03) {
            this.A03 = true;
            generatedComponent();
        }
        View.inflate(getContext(), R.layout.f8nameremoved, this);
        C86634Kw.A1H(this, 0);
        C86614Ku.A1C(AnonymousClass4L0.A0B(), this);
        this.A01 = AnonymousClass0x7.A0L(this, R.id.storage_usage_sort_row_text);
        this.A00 = AnonymousClass0x9.A0L(this, R.id.storage_usage_sort_row_checkmark);
    }
}
