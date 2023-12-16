package com.whatsapp.calling.callgrid.view;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass64B;
import X.AnonymousClass6C6;
import X.C06560Yg;
import X.C18290x4;
import X.C18300x5;
import X.C626936e;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.whatsapp.R;
import com.whatsapp.calling.callgrid.viewmodel.MenuBottomSheetViewModel;
import com.whatsapp.jid.UserJid;

public class MenuBottomSheet extends Hilt_MenuBottomSheet implements AnonymousClass64B {
    public int A00 = 0;
    public LinearLayout A01;
    public MenuBottomSheetViewModel A02;

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return AnonymousClass001.A0R(layoutInflater, viewGroup, R.layout.f8nameremoved);
    }

    public void A0w(Bundle bundle, View view) {
        super.A0w(bundle, view);
        LinearLayout linearLayout = (LinearLayout) view;
        this.A01 = linearLayout;
        C18300x5.A18(C06560Yg.A02(linearLayout, R.id.close), this, 30);
        MenuBottomSheetViewModel menuBottomSheetViewModel = this.A02;
        if (menuBottomSheetViewModel != null) {
            AnonymousClass6C6.A02(A0V(), menuBottomSheetViewModel.A04, this, 58);
        }
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        MenuBottomSheetViewModel menuBottomSheetViewModel = this.A02;
        if (menuBottomSheetViewModel != null) {
            int i = this.A00;
            if (i == 6 || i == 7 || i == 8) {
                C626936e.A0D(AnonymousClass000.A1W(menuBottomSheetViewModel.A01), "MenuBottomSheetViewModel/onCallLinkShareOptionSelected/ callLinkData is null");
                menuBottomSheetViewModel.A0D.A0H(C18290x4.A0K(menuBottomSheetViewModel.A01, i));
                return;
            }
            UserJid userJid = menuBottomSheetViewModel.A02;
            if (userJid != null || i == 0) {
                menuBottomSheetViewModel.A0E.A0H(C18290x4.A0K(userJid, i));
            }
        }
    }

    public int A1H() {
        return R.style.f12nameremoved;
    }
}
