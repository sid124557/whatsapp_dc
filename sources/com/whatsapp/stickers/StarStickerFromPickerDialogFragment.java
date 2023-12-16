package com.whatsapp.stickers;

import X.AnonymousClass002;
import X.AnonymousClass043;
import X.AnonymousClass37F;
import X.AnonymousClass39M;
import X.AnonymousClass48W;
import X.AnonymousClass4FS;
import X.AnonymousClass5V0;
import X.C003203q;
import X.C08310eF;
import X.C19340zH;
import X.C56352rq;
import X.C56932sn;
import X.C626936e;
import X.C85804Hr;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Parcelable;
import com.whatsapp.R;

public class StarStickerFromPickerDialogFragment extends Hilt_StarStickerFromPickerDialogFragment {
    public C56352rq A00;
    public AnonymousClass48W A01;
    public AnonymousClass39M A02;
    public C56932sn A03;
    public AnonymousClass4FS A04;

    public static StarStickerFromPickerDialogFragment A00(AnonymousClass39M r3) {
        StarStickerFromPickerDialogFragment starStickerFromPickerDialogFragment = new StarStickerFromPickerDialogFragment();
        Bundle A08 = AnonymousClass002.A08();
        A08.putParcelable("sticker", r3);
        starStickerFromPickerDialogFragment.A0u(A08);
        return starStickerFromPickerDialogFragment;
    }

    public void A1G(Context context) {
        super.A1G(context);
        try {
            this.A01 = (AnonymousClass48W) context;
        } catch (ClassCastException unused) {
        }
    }

    public Dialog A1J(Bundle bundle) {
        C003203q A0R = A0R();
        Parcelable parcelable = A0H().getParcelable("sticker");
        C626936e.A06(parcelable);
        this.A02 = (AnonymousClass39M) parcelable;
        C19340zH A002 = AnonymousClass5V0.A00(A0R);
        A002.A0A(R.string.f11nameremoved);
        String string = C08310eF.A09(this).getString(R.string.f11nameremoved);
        A002.A0I(new C85804Hr(this, 99), string);
        A002.setNegativeButton(R.string.f11nameremoved, (DialogInterface.OnClickListener) null);
        AnonymousClass043 create = A002.create();
        create.setOnShowListener(new AnonymousClass37F(create, string));
        return create;
    }
}
