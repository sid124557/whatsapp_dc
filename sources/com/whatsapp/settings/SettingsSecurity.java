package com.whatsapp.settings;

import X.AnonymousClass002;
import X.AnonymousClass0x2;
import X.AnonymousClass0x7;
import X.AnonymousClass0x9;
import X.AnonymousClass1Ha;
import X.AnonymousClass1Hf;
import X.AnonymousClass1VX;
import X.AnonymousClass31C;
import X.AnonymousClass33Z;
import X.AnonymousClass3DZ;
import X.AnonymousClass4HY;
import X.C06560Yg;
import X.C107635bd;
import X.C107695bk;
import X.C111095hX;
import X.C18280x3;
import X.C18300x5;
import X.C18320x8;
import X.C58422vE;
import X.C620633i;
import X.C634139d;
import X.C64333Db;
import X.C66433Lk;
import X.C66653Mg;
import X.C69263Wi;
import X.C85854Hw;
import X.C89644eZ;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;

public class SettingsSecurity extends C89644eZ {
    public AnonymousClass33Z A00;
    public AnonymousClass31C A01;
    public C66653Mg A02;
    public C66433Lk A03;
    public boolean A04;

    public void A5r() {
        if (!this.A04) {
            this.A04 = true;
            C64333Db A002 = AnonymousClass3DZ.A00(this);
            AnonymousClass1Hf.A2G(A002, this);
            C107695bk r0 = A002.A00;
            AnonymousClass1Ha.A23(A002, r0, r0, this);
            AnonymousClass1Ha.A24(A002, this);
            this.A01 = C64333Db.A5u(A002);
            this.A03 = C64333Db.A8X(A002);
            this.A02 = (C66653Mg) A002.AN6.get();
            this.A00 = (AnonymousClass33Z) A002.A85.get();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(R.string.f11nameremoved);
        setContentView((int) R.layout.f8nameremoved);
        int A2I = AnonymousClass1Hf.A2I(this);
        CompoundButton compoundButton = (CompoundButton) C06560Yg.A02(this.A00, R.id.security_notifications);
        compoundButton.setChecked(C18280x3.A1W(AnonymousClass0x2.A0F(this.A09), "security_notifications"));
        compoundButton.setOnCheckedChangeListener(new C85854Hw(this, 6));
        AnonymousClass1VX r15 = this.A0D;
        C69263Wi r12 = this.A05;
        C111095hX r11 = this.A00;
        C620633i r14 = this.A08;
        TextEmojiLabel A0K = AnonymousClass0x7.A0K(this.A00, R.id.settings_security_toggle_info);
        boolean A002 = C66653Mg.A00(this.A02);
        int i = R.string.f11nameremoved;
        if (A002) {
            i = R.string.f11nameremoved;
        }
        String str = "learn-more";
        C107635bd.A0E(this, this.A03.A04("security-and-privacy", "security-code-change-notification"), r11, r12, A0K, r14, r15, AnonymousClass002.A0F(this, "learn-more", new Object[A2I], 0, i), str);
        AnonymousClass1VX r152 = this.A0D;
        C69263Wi r122 = this.A05;
        C111095hX r112 = this.A00;
        C620633i r142 = this.A08;
        C107635bd.A0E(this, this.A03.A00("https://www.whatsapp.com/security"), r112, r122, AnonymousClass0x7.A0K(this.A00, R.id.settings_security_info_text), r142, r152, AnonymousClass0x2.A0X(this, "learn-more", A2I, R.string.f11nameremoved), str);
        TextView A0G = C18300x5.A0G(this.A00, R.id.settings_security_toggle_title);
        boolean A003 = C66653Mg.A00(this.A02);
        int i2 = R.string.f11nameremoved;
        if (A003) {
            i2 = R.string.f11nameremoved;
        }
        A0G.setText(i2);
        C634139d.A00(findViewById(R.id.security_notifications_group), compoundButton, 29);
        AnonymousClass1VX r1 = this.A0D;
        C58422vE r3 = C58422vE.A02;
        if (r1.A0Y(r3, 1071)) {
            View A022 = C06560Yg.A02(this.A00, R.id.e2ee_settings_layout);
            View A023 = C06560Yg.A02(this.A00, R.id.settings_security_top_container);
            C634139d.A00(C06560Yg.A02(this.A00, R.id.security_settings_learn_more), this, 27);
            A022.setVisibility(0);
            A023.setVisibility(8);
            boolean A0Y = this.A0D.A0Y(r3, 5112);
            boolean A0Y2 = this.A0D.A0Y(r3, 4869);
            boolean A0Y3 = this.A0D.A0Y(r3, 4870);
            if (A0Y) {
                if (A0Y2) {
                    AnonymousClass002.A09(A022, R.id.e2ee_bottom_sheet_title).setText(R.string.f11nameremoved);
                }
                if (A0Y3) {
                    int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
                    C06560Yg.A02(this.A00, R.id.e2ee_settings_layout).setPadding(0, dimensionPixelSize, 0, dimensionPixelSize);
                    ImageView A0F = AnonymousClass0x9.A0F(A022, R.id.e2ee_bottom_sheet_image);
                    A0F.getLayoutParams().height = getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
                    A0F.requestLayout();
                    A0F.setImageResource(R.drawable.vec_e2ee_illustration);
                    TextView A09 = AnonymousClass002.A09(A022, R.id.e2ee_bottom_sheet_title);
                    A09.setTextAppearance(this, R.style.f12nameremoved);
                    A09.setTextSize(24.0f);
                    A09.setGravity(17);
                    TextView A092 = AnonymousClass002.A09(A022, R.id.e2ee_bottom_sheet_summary);
                    A092.setGravity(17);
                    A092.setLineSpacing(15.0f, 1.0f);
                    A74((WaImageView) A022.findViewById(R.id.e2ee_bottom_sheet_list_image_one));
                    A74((WaImageView) A022.findViewById(R.id.e2ee_bottom_sheet_list_image_two));
                    A74((WaImageView) A022.findViewById(R.id.e2ee_bottom_sheet_list_image_three));
                    A74((WaImageView) A022.findViewById(R.id.e2ee_bottom_sheet_list_image_four));
                    A74((WaImageView) A022.findViewById(R.id.e2ee_bottom_sheet_list_image_five));
                    A75((WaTextView) A022.findViewById(R.id.e2ee_bottom_sheet_list_item_one));
                    A75((WaTextView) A022.findViewById(R.id.e2ee_bottom_sheet_list_item_two));
                    A75((WaTextView) A022.findViewById(R.id.e2ee_bottom_sheet_list_item_three));
                    A75((WaTextView) A022.findViewById(R.id.e2ee_bottom_sheet_list_item_four));
                    A75((WaTextView) A022.findViewById(R.id.e2ee_bottom_sheet_list_item_five));
                    TextView A0G2 = C18300x5.A0G(this.A00, R.id.security_settings_learn_more);
                    A0G2.setTextAppearance(this, R.style.f12nameremoved);
                    A0G2.setGravity(17);
                    A0G2.setPadding(0, getResources().getDimensionPixelSize(R.dimen.f6nameremoved), 0, dimensionPixelSize);
                    TextView A0G3 = C18300x5.A0G(this.A00, R.id.settings_security_toggle_info);
                    A0G3.setText(R.string.f11nameremoved);
                    A0G3.setTextAppearance(this, R.style.f12nameremoved);
                    A0G3.setLineSpacing(4.0f, 1.0f);
                    int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
                    int dimensionPixelSize3 = getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
                    A0G3.setPadding(0, dimensionPixelSize2, 0, 0);
                    TextView A0G4 = C18300x5.A0G(this.A00, R.id.settings_security_toggle_learn_more);
                    A0G4.setText(R.string.f11nameremoved);
                    A0G4.setTextAppearance(this, R.style.f12nameremoved);
                    A0G4.setVisibility(0);
                    C634139d.A00(A0G4, this, 28);
                    A0G4.setPadding(0, dimensionPixelSize3, 0, 0);
                }
            }
        }
    }

    public SettingsSecurity(int i) {
        this.A04 = false;
        AnonymousClass4HY.A00(this, 114);
    }

    public final void A74(WaImageView waImageView) {
        int color = getResources().getColor(R.color.f5nameremoved);
        if (waImageView != null) {
            waImageView.setColorFilter(color);
            waImageView.setPadding(0, 0, 0, 0);
        }
    }

    public final void A75(WaTextView waTextView) {
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.f6nameremoved) + getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
        int A002 = C18320x8.A00(this, R.dimen.f6nameremoved) + C18320x8.A00(this, R.dimen.f6nameremoved);
        if (waTextView != null) {
            waTextView.setTextAppearance(this, R.style.f12nameremoved);
            waTextView.setPadding(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize, A002);
        }
    }

    public SettingsSecurity() {
        this(0);
    }
}
