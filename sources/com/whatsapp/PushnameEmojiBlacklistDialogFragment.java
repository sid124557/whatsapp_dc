package com.whatsapp;

import X.AnonymousClass002;
import X.AnonymousClass043;
import X.AnonymousClass4I0;
import X.AnonymousClass4I1;
import X.AnonymousClass5Y0;
import X.C107345b9;
import X.C18300x5;
import X.C19340zH;
import X.C39382Bt;
import X.C620733j;
import X.C626936e;
import X.C66433Lk;
import android.app.Dialog;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;

public class PushnameEmojiBlacklistDialogFragment extends Hilt_PushnameEmojiBlacklistDialogFragment {
    public C620733j A00;
    public AnonymousClass5Y0 A01;
    public C66433Lk A02;

    public static PushnameEmojiBlacklistDialogFragment A00(String str) {
        PushnameEmojiBlacklistDialogFragment pushnameEmojiBlacklistDialogFragment = new PushnameEmojiBlacklistDialogFragment();
        Bundle A08 = AnonymousClass002.A08();
        ArrayList A0I = AnonymousClass002.A0I(r4);
        for (String str2 : C39382Bt.A01) {
            if (str.contains(str2)) {
                A0I.add(str2);
            }
        }
        A08.putStringArrayList("invalid_emojis", A0I);
        pushnameEmojiBlacklistDialogFragment.A0u(A08);
        return pushnameEmojiBlacklistDialogFragment;
    }

    public Dialog A1J(Bundle bundle) {
        C19340zH A0L = C18300x5.A0L(this);
        ArrayList<String> stringArrayList = A0H().getStringArrayList("invalid_emojis");
        C626936e.A06(stringArrayList);
        String obj = C66433Lk.A00(this.A02, "26000056").toString();
        A0L.A0Q(C107345b9.A05(A0Q().getApplicationContext(), this.A01, this.A00.A0L(new Object[]{TextUtils.join(" ", stringArrayList)}, R.plurals.f9nameremoved, (long) stringArrayList.size())));
        A0L.A0X(new AnonymousClass4I0(0, obj, this), R.string.f11nameremoved);
        A0L.setPositiveButton(R.string.f11nameremoved, new AnonymousClass4I1(1));
        AnonymousClass043 create = A0L.create();
        create.setCanceledOnTouchOutside(true);
        return create;
    }
}
