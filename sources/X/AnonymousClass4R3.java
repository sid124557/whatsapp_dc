package X;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;

/* renamed from: X.4R3  reason: invalid class name */
public class AnonymousClass4R3 extends LinearLayout implements AnonymousClass4GJ {
    public C56972sr A00;
    public C625735q A01;
    public C116855qy A02;
    public boolean A03;
    public final TextEmojiLabel A04;

    public final Object generatedComponent() {
        C116855qy r0 = this.A02;
        if (r0 == null) {
            r0 = C116855qy.A00(this);
            this.A02 = r0;
        }
        return r0.generatedComponent();
    }

    public AnonymousClass4R3(Context context) {
        super(context);
        if (!this.A03) {
            this.A03 = true;
            C64333Db A002 = C88864av.A00(generatedComponent());
            this.A00 = C64333Db.A06(A002);
            this.A01 = (C625735q) A002.AYF.get();
        }
        setOrientation(0);
        C86624Kv.A10(this, -1, -2);
        View.inflate(getContext(), R.layout.f8nameremoved, this);
        this.A04 = AnonymousClass0x7.A0K(this, R.id.community_activity_preview);
    }
}
