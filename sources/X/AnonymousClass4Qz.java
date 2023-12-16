package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;

/* renamed from: X.4Qz  reason: invalid class name */
public class AnonymousClass4Qz extends LinearLayout implements AnonymousClass4GJ {
    public TextEmojiLabel A00;
    public AnonymousClass5OH A01;
    public C116855qy A02;
    public boolean A03;

    public AnonymousClass4Qz(Context context) {
        super(context, (AttributeSet) null);
        if (!this.A03) {
            this.A03 = true;
            this.A01 = (AnonymousClass5OH) C88864av.A00(generatedComponent()).A00.A1Z.get();
        }
        View.inflate(context, R.layout.f8nameremoved, this);
        this.A00 = AnonymousClass0x7.A0K(this, R.id.beta_text);
    }

    public final Object generatedComponent() {
        C116855qy r0 = this.A02;
        if (r0 == null) {
            r0 = C116855qy.A00(this);
            this.A02 = r0;
        }
        return r0.generatedComponent();
    }

    public void setFAQLink(String str) {
        this.A01.A00(getContext(), this.A00, getContext().getString(R.string.f11nameremoved), "account-and-profile", str);
    }
}
