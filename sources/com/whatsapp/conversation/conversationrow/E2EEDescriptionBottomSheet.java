package com.whatsapp.conversation.conversationrow;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass0x9;
import X.AnonymousClass1VX;
import X.AnonymousClass5WX;
import X.AnonymousClass64B;
import X.C06560Yg;
import X.C08310eF;
import X.C107055ac;
import X.C109345eT;
import X.C111095hX;
import X.C18300x5;
import X.C86604Kt;
import X.C86624Kv;
import X.C86644Kx;
import X.C86654Ky;
import X.C86664Kz;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;

public class E2EEDescriptionBottomSheet extends Hilt_E2EEDescriptionBottomSheet implements AnonymousClass64B {
    public static boolean A04;
    public int A00;
    public C111095hX A01;
    public AnonymousClass1VX A02;
    public AnonymousClass5WX A03;

    public static E2EEDescriptionBottomSheet A00(int i) {
        E2EEDescriptionBottomSheet e2EEDescriptionBottomSheet = new E2EEDescriptionBottomSheet();
        Bundle A08 = AnonymousClass002.A08();
        A08.putInt("entry_point", i);
        e2EEDescriptionBottomSheet.A0u(A08);
        return e2EEDescriptionBottomSheet;
    }

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return AnonymousClass001.A0R(layoutInflater, viewGroup, R.layout.f8nameremoved);
    }

    public void A0w(Bundle bundle, View view) {
        int i;
        super.A0w(bundle, view);
        Bundle bundle2 = this.A06;
        if (!(bundle2 == null || (i = bundle2.getInt("entry_point", -1)) == -1)) {
            A0G().getResources();
            boolean A0X = this.A02.A0X(5111);
            boolean A0X2 = this.A02.A0X(4869);
            boolean A0X3 = this.A02.A0X(4870);
            TextView A0G = C18300x5.A0G(view, R.id.e2ee_bottom_sheet_title);
            if (A0X && A0X2) {
                A0G.setText(R.string.f11nameremoved);
            }
            TextView A0G2 = C18300x5.A0G(view, R.id.e2ee_bottom_sheet_summary);
            if (A0X && A0X3) {
                C86604Kt.A1F(view, R.id.e2ee_description_close_button, 8);
                view.findViewById(R.id.e2ee_scroll_view).setPadding(0, C08310eF.A09(this).getDimensionPixelSize(R.dimen.f6nameremoved), 0, 0);
                ImageView A0E = AnonymousClass0x9.A0E(view, R.id.e2ee_bottom_sheet_image);
                A0E.getLayoutParams().height = C08310eF.A09(this).getDimensionPixelSize(R.dimen.f6nameremoved);
                A0E.requestLayout();
                A0E.setImageResource(R.drawable.vec_e2ee_illustration);
                A0G.setTextSize(24.0f);
                A0G2.setLineSpacing(15.0f, 1.0f);
                A1a(C86664Kz.A11(view, R.id.e2ee_bottom_sheet_image_item_one));
                A1a(C86664Kz.A11(view, R.id.e2ee_bottom_sheet_image_item_two));
                A1a(C86664Kz.A11(view, R.id.e2ee_bottom_sheet_image_item_three));
                A1a(C86664Kz.A11(view, R.id.e2ee_bottom_sheet_image_item_four));
                A1a(C86664Kz.A11(view, R.id.e2ee_bottom_sheet_image_item_five));
                A1b(C86644Kx.A0O(view, R.id.e2ee_bottom_sheet_list_item_one));
                A1b(C86644Kx.A0O(view, R.id.e2ee_bottom_sheet_list_item_two));
                A1b(C86644Kx.A0O(view, R.id.e2ee_bottom_sheet_list_item_three));
                A1b(C86644Kx.A0O(view, R.id.e2ee_bottom_sheet_list_item_four));
                A1b(C86644Kx.A0O(view, R.id.e2ee_bottom_sheet_list_item_five));
            }
            if (A04) {
                A0G.setText(R.string.f11nameremoved);
                A0G2.setText(R.string.f11nameremoved);
                C86624Kv.A0z(view, R.id.e2ee_bottom_sheet_image_item_two, 8);
                C86624Kv.A0z(view, R.id.e2ee_bottom_sheet_list_item_two, 8);
                C86624Kv.A0z(view, R.id.e2ee_bottom_sheet_image_item_five, 8);
                C86624Kv.A0z(view, R.id.e2ee_bottom_sheet_list_item_five, 8);
            } else if (8 == i) {
                A0G.setText(R.string.f11nameremoved);
                A0G2.setText(R.string.f11nameremoved);
            }
            this.A03.A00(i, 1);
            this.A00 = i;
        }
        View A022 = C06560Yg.A02(view, R.id.e2ee_bottom_sheet_learn_more_button);
        View A023 = C06560Yg.A02(view, R.id.e2ee_description_close_button);
        C109345eT.A00(A022, this, 36);
        C109345eT.A00(A023, this, 37);
    }

    public Dialog A1J(Bundle bundle) {
        Dialog A1J = super.A1J(bundle);
        A1J.setOnShowListener(new C107055ac(this, 0));
        return A1J;
    }

    public final void A1a(WaImageView waImageView) {
        int color = C08310eF.A09(this).getColor(R.color.f5nameremoved);
        if (waImageView != null) {
            waImageView.setColorFilter(color);
            waImageView.setPadding(0, 0, 0, 0);
        }
    }

    public final void A1b(WaTextView waTextView) {
        int dimensionPixelSize = C08310eF.A09(this).getDimensionPixelSize(R.dimen.f6nameremoved);
        int A022 = C86654Ky.A02(C08310eF.A09(this), R.dimen.f6nameremoved, C08310eF.A09(this).getDimensionPixelSize(R.dimen.f6nameremoved));
        int A023 = C86654Ky.A02(C08310eF.A09(this), R.dimen.f6nameremoved, C08310eF.A09(this).getDimensionPixelSize(R.dimen.f6nameremoved));
        if (waTextView != null) {
            waTextView.setTextAppearance(A1D(), R.style.f12nameremoved);
            waTextView.setPadding(dimensionPixelSize, A022, 0, A023);
        }
    }
}
