package com.whatsapp.conversation.conversationrow;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass0x2;
import X.AnonymousClass3ZH;
import X.AnonymousClass5ZU;
import X.C18300x5;
import X.C18310x6;
import X.C18320x8;
import X.C187958y5;
import X.C19340zH;
import X.C56972sr;
import X.C59392wq;
import X.C626936e;
import X.C64773Ex;
import X.C85834Hu;
import X.C95814uZ;
import android.app.Dialog;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import com.whatsapp.R;
import java.util.ArrayList;

public class ConversationRow$ConversationRowDialogFragment extends Hilt_ConversationRow_ConversationRowDialogFragment {
    public C56972sr A00;
    public C64773Ex A01;
    public AnonymousClass5ZU A02;
    public C187958y5 A03;

    public Dialog A1J(Bundle bundle) {
        String string = this.A06.getString("jid");
        C95814uZ A0S = C18310x6.A0S(string);
        C626936e.A07(A0S, AnonymousClass000.A0V("ConversationRow/onCreateDialog/invalid jid=", string, AnonymousClass001.A0o()));
        AnonymousClass3ZH A002 = C64773Ex.A00(this.A01, A0S);
        ArrayList A0s = AnonymousClass001.A0s();
        if (!A002.A0Q() && (!this.A00.A0Y())) {
            A0s.add(new C59392wq(A1D().getString(R.string.f11nameremoved), (int) R.id.menuitem_add_to_contacts));
            A0s.add(new C59392wq(A1D().getString(R.string.f11nameremoved), (int) R.id.menuitem_add_to_existing_contact));
        }
        String A0h = C18300x5.A0h(this.A02, A002);
        A0s.add(new C59392wq(AnonymousClass002.A0F(A1D(), A0h, new Object[1], 0, R.string.f11nameremoved), (int) R.id.menuitem_message_contact));
        A0s.add(new C59392wq(AnonymousClass0x2.A0X(A1D(), A0h, 1, R.string.f11nameremoved), (int) R.id.menuitem_voice_call_contact));
        A0s.add(new C59392wq(AnonymousClass0x2.A0X(A1D(), A0h, 1, R.string.f11nameremoved), (int) R.id.menuitem_video_call_contact));
        C19340zH A0H = C18320x8.A0H(this);
        A0H.A0E(new C85834Hu(A0S, A0s, this, 2), new ArrayAdapter(A1D(), 17367043, A0s));
        return A0H.create();
    }
}
