package com.whatsapp.conversation.conversationrow;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass4I7;
import X.C105975Xd;
import X.C18280x3;
import X.C19340zH;
import X.C59392wq;
import X.C627336j;
import android.app.Dialog;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.ArrayAdapter;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.List;

public class ConversationRowContact$MessageSharedContactDialogFragment extends Hilt_ConversationRowContact_MessageSharedContactDialogFragment {
    public C105975Xd A00;

    public Dialog A1J(Bundle bundle) {
        String A0e;
        List A0B = C627336j.A0B(UserJid.class, A0H().getStringArrayList("jids"));
        ArrayList<String> stringArrayList = this.A06.getStringArrayList("phones");
        ArrayList<String> stringArrayList2 = this.A06.getStringArrayList("labels");
        String string = this.A06.getString("business_name");
        ArrayList A0s = AnonymousClass001.A0s();
        if (!(stringArrayList2 == null || stringArrayList == null)) {
            for (int i = 0; i < A0B.size(); i++) {
                if (A0B.get(i) != null) {
                    StringBuilder A0o = AnonymousClass001.A0o();
                    A0o.append(AnonymousClass002.A0F(A1D(), stringArrayList.get(i), AnonymousClass002.A0L(), 0, R.string.f11nameremoved));
                    if (TextUtils.isEmpty(stringArrayList2.get(i))) {
                        A0e = "";
                    } else {
                        StringBuilder A0o2 = AnonymousClass001.A0o();
                        A0o2.append(" (");
                        A0o2.append(stringArrayList2.get(i));
                        A0e = AnonymousClass000.A0e(A0o2);
                    }
                    A0s.add(new C59392wq((UserJid) A0B.get(i), AnonymousClass000.A0X(A0e, A0o)));
                }
            }
        }
        C19340zH A0K = C18280x3.A0K(this);
        A0K.A0E(new AnonymousClass4I7(this, A0s, string, 0), new ArrayAdapter(A1D(), R.layout.f8nameremoved, A0s));
        return A0K.create();
    }
}
