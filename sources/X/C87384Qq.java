package X;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.whatsapp.R;
import com.whatsapp.jid.GroupJid;

/* renamed from: X.4Qq  reason: invalid class name and case insensitive filesystem */
public class C87384Qq extends LinearLayout implements AnonymousClass4GJ {
    public GroupJid A00;
    public C116855qy A01;
    public boolean A02;
    public final View A03;

    public final Object generatedComponent() {
        C116855qy r0 = this.A01;
        if (r0 == null) {
            r0 = C116855qy.A00(this);
            this.A01 = r0;
        }
        return r0.generatedComponent();
    }

    public C87384Qq(Context context) {
        super(context);
        if (!this.A02) {
            this.A02 = true;
            generatedComponent();
        }
        setOrientation(1);
        C18310x6.A15(this);
        View.inflate(getContext(), R.layout.f8nameremoved, this);
        C18320x8.A13(C06560Yg.A02(this, R.id.invite_members_row), this, 44);
        this.A03 = C06560Yg.A02(this, R.id.invite_members_remove_button);
    }
}
