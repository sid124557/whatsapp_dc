package com.whatsapp.community;

import X.AnonymousClass000;
import X.AnonymousClass002;
import X.AnonymousClass0x2;
import X.AnonymousClass0x7;
import X.AnonymousClass34R;
import X.AnonymousClass4FS;
import X.AnonymousClass4VM;
import X.AnonymousClass5ZU;
import X.C08310eF;
import X.C101455Ev;
import X.C106715a2;
import X.C111095hX;
import X.C1235268t;
import X.C1235668x;
import X.C124086Ax;
import X.C18270x1;
import X.C18300x5;
import X.C19340zH;
import X.C27991fJ;
import X.C45312Zn;
import X.C52882mC;
import X.C56892sj;
import X.C626936e;
import X.C627336j;
import X.C66433Lk;
import X.C71553cI;
import X.C86644Kx;
import X.C86654Ky;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.whatsapp.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class CommunityExitDialogFragment extends Hilt_CommunityExitDialogFragment {
    public C111095hX A00;
    public C101455Ev A01;
    public AnonymousClass5ZU A02;
    public C56892sj A03;
    public C27991fJ A04;
    public C45312Zn A05;
    public C66433Lk A06;
    public C106715a2 A07;
    public AnonymousClass4FS A08;

    public static CommunityExitDialogFragment A00(C27991fJ r4, Collection collection) {
        Bundle A082 = AnonymousClass002.A08();
        AnonymousClass0x2.A0v(A082, r4, "parent_jid");
        ArrayList A0I = AnonymousClass002.A0I(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            A0I.add(((C52882mC) it.next()).A02);
        }
        C86644Kx.A0r(A082, "subgroup_jids", A0I);
        CommunityExitDialogFragment communityExitDialogFragment = new CommunityExitDialogFragment();
        communityExitDialogFragment.A0u(A082);
        return communityExitDialogFragment;
    }

    public Dialog A1J(Bundle bundle) {
        int i;
        DialogInterface.OnClickListener r0;
        C27991fJ A042 = AnonymousClass34R.A04(A0H().getString("parent_jid"));
        C626936e.A06(A042);
        this.A04 = A042;
        List A0B = C627336j.A0B(C27991fJ.class, A0H().getStringArrayList("subgroup_jids"));
        C19340zH A0M = C18300x5.A0M(this);
        if (this.A03.A0H(this.A04)) {
            A0M.A0Q(C08310eF.A09(this).getString(R.string.f11nameremoved));
            C1235268t.A01(A0M, this, 21, R.string.f11nameremoved);
            i = R.string.f11nameremoved;
            r0 = C1235268t.A00(this, 22);
        } else {
            AnonymousClass4VM r6 = (AnonymousClass4VM) C124086Ax.A00(A0R(), this.A04, this.A01, 3).A01(AnonymousClass4VM.class);
            String A0T = this.A02.A0T(this.A04);
            int i2 = R.string.f11nameremoved;
            if (A0T == null) {
                i2 = R.string.f11nameremoved;
            }
            Object[] A0M2 = AnonymousClass002.A0M();
            A0M2[0] = A0T;
            String A0n = AnonymousClass0x7.A0n(this, "learn-more", A0M2, 1, i2);
            View A0G = C86654Ky.A0G(A1D(), R.layout.f8nameremoved);
            TextView A0G2 = C18300x5.A0G(A0G, R.id.dialog_text_message);
            A0G2.setText(this.A07.A05(A0G2.getContext(), new C71553cI((Object) this, 26), A0n, "learn-more"));
            C18270x1.A0q(A0G2, this.A02);
            A0M.setView(A0G);
            Resources A09 = C08310eF.A09(this);
            int size = A0B.size();
            Object[] objArr = new Object[1];
            AnonymousClass000.A1P(objArr, A0B.size(), 0);
            A0M.setTitle(A09.getQuantityString(R.plurals.f9nameremoved, size, objArr));
            C1235268t.A01(A0M, this, 23, R.string.f11nameremoved);
            i = R.string.f11nameremoved;
            r0 = new C1235668x(r6, A0B, this, 0);
        }
        A0M.setPositiveButton(i, r0);
        return A0M.create();
    }
}
