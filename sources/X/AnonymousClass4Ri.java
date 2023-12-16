package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ListView;
import com.whatsapp.collections.observablelistview.ObservableListView;
import com.whatsapp.contact.picker.BidiContactListView;

/* renamed from: X.4Ri  reason: invalid class name */
public abstract class AnonymousClass4Ri extends ListView implements AnonymousClass4GJ {
    public C116855qy A00;
    public boolean A01;

    public void A01() {
        if (this instanceof BidiContactListView) {
            BidiContactListView bidiContactListView = (BidiContactListView) this;
            if (!bidiContactListView.A02) {
                bidiContactListView.A02 = true;
                C64333Db A002 = C88864av.A00(bidiContactListView.generatedComponent());
                bidiContactListView.A0C = C86614Ku.A0o(A002);
                bidiContactListView.A01 = C86644Kx.A0b(A002);
                bidiContactListView.A00 = C64333Db.A2t(A002);
            }
        } else if (!this.A01) {
            this.A01 = true;
            ((ObservableListView) this).A0C = C86614Ku.A0o(((C88864av) ((C111685iW) generatedComponent())).A0K);
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

    public AnonymousClass4Ri(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A01();
    }

    public AnonymousClass4Ri(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A01();
    }

    public AnonymousClass4Ri(Context context) {
        super(context);
        A01();
    }
}
