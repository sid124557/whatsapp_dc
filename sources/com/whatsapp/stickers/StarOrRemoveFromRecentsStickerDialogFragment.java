package com.whatsapp.stickers;

import X.AnonymousClass002;
import X.AnonymousClass39M;
import X.AnonymousClass4FS;
import X.AnonymousClass4I5;
import X.AnonymousClass5V0;
import X.C003203q;
import X.C183538qC;
import X.C19340zH;
import X.C56932sn;
import X.C626936e;
import X.C65203Gp;
import android.app.Dialog;
import android.os.Bundle;
import android.os.Parcelable;
import com.whatsapp.R;

public class StarOrRemoveFromRecentsStickerDialogFragment extends Hilt_StarOrRemoveFromRecentsStickerDialogFragment {
    public C65203Gp A00;
    public AnonymousClass39M A01;
    public C56932sn A02;
    public AnonymousClass4FS A03;
    public C183538qC A04;
    public C183538qC A05;

    public static StarOrRemoveFromRecentsStickerDialogFragment A00(AnonymousClass39M r3, boolean z) {
        StarOrRemoveFromRecentsStickerDialogFragment starOrRemoveFromRecentsStickerDialogFragment = new StarOrRemoveFromRecentsStickerDialogFragment();
        Bundle A08 = AnonymousClass002.A08();
        A08.putParcelable("sticker", r3);
        A08.putBoolean("avatar_sticker", z);
        starOrRemoveFromRecentsStickerDialogFragment.A0u(A08);
        return starOrRemoveFromRecentsStickerDialogFragment;
    }

    public Dialog A1J(Bundle bundle) {
        C003203q A0R = A0R();
        Bundle A0H = A0H();
        Parcelable parcelable = A0H.getParcelable("sticker");
        C626936e.A06(parcelable);
        this.A01 = (AnonymousClass39M) parcelable;
        AnonymousClass4I5 r2 = new AnonymousClass4I5(2, this, A0H.getBoolean("avatar_sticker", false));
        C19340zH A002 = AnonymousClass5V0.A00(A0R);
        A002.A0A(R.string.f11nameremoved);
        A002.setPositiveButton(R.string.f11nameremoved, r2);
        A002.A0X(r2, R.string.f11nameremoved);
        A002.setNegativeButton(R.string.f11nameremoved, r2);
        return A002.create();
    }
}
