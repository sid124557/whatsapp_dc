package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import com.whatsapp.calling.callhistory.group.GroupCallSelectedContactsList;
import com.whatsapp.contact.picker.SelectedContactsList;

/* renamed from: X.4Ru  reason: invalid class name */
public abstract class AnonymousClass4Ru extends RelativeLayout implements AnonymousClass4GJ {
    public C116855qy A00;
    public boolean A01;

    public void A00() {
        if (this instanceof GroupCallSelectedContactsList) {
            GroupCallSelectedContactsList groupCallSelectedContactsList = (GroupCallSelectedContactsList) this;
            if (!groupCallSelectedContactsList.A04) {
                groupCallSelectedContactsList.A04 = true;
                C64333Db A002 = C88864av.A00(groupCallSelectedContactsList.generatedComponent());
                groupCallSelectedContactsList.A06 = C64333Db.A28(A002);
                groupCallSelectedContactsList.A02 = C64333Db.A2t(A002);
                groupCallSelectedContactsList.A03 = C86614Ku.A0o(A002);
            }
        } else if (!this.A01) {
            this.A01 = true;
            ((SelectedContactsList) this).A06 = C64333Db.A28(((C88864av) ((C111685iW) generatedComponent())).A0K);
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

    public AnonymousClass4Ru(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00();
    }
}
