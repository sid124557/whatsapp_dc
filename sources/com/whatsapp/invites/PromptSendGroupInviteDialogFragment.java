package com.whatsapp.invites;

import X.AnonymousClass002;
import X.AnonymousClass043;
import X.AnonymousClass34R;
import X.AnonymousClass377;
import X.AnonymousClass5V0;
import X.AnonymousClass5ZU;
import X.C003203q;
import X.C18300x5;
import X.C19340zH;
import X.C27991fJ;
import X.C56072rN;
import X.C620733j;
import X.C627336j;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class PromptSendGroupInviteDialogFragment extends Hilt_PromptSendGroupInviteDialogFragment {
    public AnonymousClass5ZU A00;
    public C56072rN A01;

    public Dialog A1J(Bundle bundle) {
        String str;
        int i;
        int i2;
        Bundle A0H = A0H();
        C003203q A0R = A0R();
        List A0B = C627336j.A0B(UserJid.class, A0H.getStringArrayList("jids"));
        Intent intent = (Intent) A0H.getParcelable("invite_intent");
        int i3 = A0H.getInt("invite_intent_code");
        boolean z = A0H.getBoolean("is_cag_and_community_add");
        ArrayList<String> arrayList = null;
        if (intent != null) {
            str = intent.getStringExtra("group_jid");
        } else {
            str = null;
        }
        C27991fJ A04 = AnonymousClass34R.A04(str);
        boolean A06 = this.A01.A06(A04);
        if (intent != null) {
            arrayList = intent.getStringArrayListExtra("sms_invites_jids");
        }
        if (intent != null) {
            i = intent.getIntExtra("invite_trigger_source", 0);
        } else {
            i = 0;
        }
        AnonymousClass377 r12 = new AnonymousClass377(intent, this, A04, arrayList, i3, i);
        C19340zH A002 = AnonymousClass5V0.A00(A0R);
        C620733j r10 = this.A01;
        if (A06) {
            i2 = R.plurals.f9nameremoved;
        } else {
            i2 = R.plurals.f9nameremoved;
            if (z) {
                i2 = R.plurals.f9nameremoved;
            }
        }
        long size = (long) A0B.size();
        Object[] A0L = AnonymousClass002.A0L();
        C620733j.A03(this.A01, this.A00.A0V(A0B, 3), A0L, 0);
        A002.A0Q(r10.A0L(A0L, i2, size));
        int i4 = R.string.f11nameremoved;
        if (A06) {
            i4 = R.string.f11nameremoved;
        }
        A002.setPositiveButton(i4, r12);
        A002.setNegativeButton(R.string.f11nameremoved, r12);
        AnonymousClass043 create = A002.create();
        create.setCanceledOnTouchOutside(false);
        return create;
    }

    public static Bundle A00(Intent intent, Collection collection, boolean z) {
        Bundle A08 = AnonymousClass002.A08();
        ArrayList A0u = C18300x5.A0u(collection);
        C627336j.A0H(collection, A0u);
        A08.putStringArrayList("jids", A0u);
        A08.putParcelable("invite_intent", intent);
        A08.putBoolean("is_cag_and_community_add", z);
        return A08;
    }
}
