package X;

import android.content.Context;
import android.util.AttributeSet;
import com.whatsapp.mediacomposer.doodle.textentry.NewTextEntryView;

/* renamed from: X.6lB  reason: invalid class name and case insensitive filesystem */
public abstract class C135746lB extends AnonymousClass4vO {
    public boolean A00;

    public void A00() {
        if (!this.A00) {
            this.A00 = true;
            NewTextEntryView newTextEntryView = (NewTextEntryView) this;
            C64333Db r1 = ((C88864av) ((C111685iW) generatedComponent())).A0K;
            newTextEntryView.A00 = (AnonymousClass5Y0) r1.A8o.get();
            newTextEntryView.A04 = C64333Db.A2t(r1);
        }
    }

    public C135746lB(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00();
    }
}
