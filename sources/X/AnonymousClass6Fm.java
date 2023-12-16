package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.whatsapp.voipcalling.VoipCallAnswerCallView;

/* renamed from: X.6Fm  reason: invalid class name */
public abstract class AnonymousClass6Fm extends LinearLayout implements AnonymousClass4GJ {
    public C116855qy A00;

    public void A00() {
        VoipCallAnswerCallView voipCallAnswerCallView = (VoipCallAnswerCallView) this;
        if (!voipCallAnswerCallView.A09) {
            voipCallAnswerCallView.A09 = true;
            voipCallAnswerCallView.A00 = C86604Kt.A0Y(((C88864av) ((C111685iW) voipCallAnswerCallView.generatedComponent())).A0K);
        }
    }

    public final Object generatedComponent() {
        C116855qy r0 = this.A00;
        if (r0 == null) {
            r0 = C116855qy.A00(this);
            this.A00 = r0;
        }
        return r0.generatedComponent();
    }

    public AnonymousClass6Fm(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00();
    }

    public AnonymousClass6Fm(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
    }
}
