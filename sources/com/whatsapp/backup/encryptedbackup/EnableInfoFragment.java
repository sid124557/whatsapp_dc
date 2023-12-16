package com.whatsapp.backup.encryptedbackup;

import X.AnonymousClass002;
import X.AnonymousClass0XZ;
import X.AnonymousClass0w5;
import X.AnonymousClass1VX;
import X.AnonymousClass35V;
import X.C02680He;
import X.C06560Yg;
import X.C08310eF;
import X.C107575bX;
import X.C620733j;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.whatsapp.R;
import com.whatsapp.wds.components.textlayout.WDSTextLayout;

public class EnableInfoFragment extends Hilt_EnableInfoFragment {
    public C620733j A00;
    public AnonymousClass1VX A01;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0016, code lost:
        if (r1 == false) goto L_0x0018;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View A0K(android.os.Bundle r4, android.view.LayoutInflater r5, android.view.ViewGroup r6) {
        /*
            r3 = this;
            X.1VX r1 = r3.A01
            r0 = 5113(0x13f9, float:7.165E-42)
            boolean r0 = r1.A0X(r0)
            r2 = 0
            if (r0 == 0) goto L_0x0018
            X.1VX r1 = r3.A01
            r0 = 4870(0x1306, float:6.824E-42)
            boolean r1 = r1.A0X(r0)
            r0 = 2131624841(0x7f0e0389, float:1.8876873E38)
            if (r1 != 0) goto L_0x001b
        L_0x0018:
            r0 = 2131624840(0x7f0e0388, float:1.8876871E38)
        L_0x001b:
            android.view.View r0 = r5.inflate(r0, r6, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.backup.encryptedbackup.EnableInfoFragment.A0K(android.os.Bundle, android.view.LayoutInflater, android.view.ViewGroup):android.view.View");
    }

    public void A0w(Bundle bundle, View view) {
        super.A0p(bundle);
        EncBackupViewModel encBackupViewModel = (EncBackupViewModel) C08310eF.A0B(this);
        boolean A0X = this.A01.A0X(5113);
        View view2 = view;
        if (!A0X || !this.A01.A0X(4870)) {
            TextView A0A = C08310eF.A0A(view2, R.id.enable_info_backup_size_message);
            long A0G = encBackupViewModel.A0G();
            long A0F = encBackupViewModel.A0F();
            int i = (A0G > 0 ? 1 : (A0G == 0 ? 0 : -1));
            if (i > 0 || A0G == -1) {
                C08310eF.A0A(view2, R.id.enable_info_enc_backup_info).setText(R.string.f11nameremoved);
                if (i > 0 && A0F >= 0) {
                    A0A.setVisibility(0);
                    Context A0G2 = A0G();
                    Object[] A0M = AnonymousClass002.A0M();
                    A0M[0] = AnonymousClass35V.A04(this.A00, A0G);
                    A0M[1] = AnonymousClass35V.A04(this.A00, A0F);
                    A0A.setText(C107575bX.A00(A0G2, A0M, R.string.f11nameremoved));
                }
            }
            C06560Yg.A02(view2, R.id.enable_info_turn_on_button).setOnClickListener(new AnonymousClass0w5(this, 7, encBackupViewModel));
            if (!A0X) {
                return;
            }
        } else {
            WDSTextLayout wDSTextLayout = (WDSTextLayout) C06560Yg.A02(view2, R.id.e2ee_backup_text_layout);
            wDSTextLayout.setPrimaryButtonClickListener(new AnonymousClass0w5(this, 6, encBackupViewModel));
            wDSTextLayout.setHeaderImage(C02680He.A00((Resources.Theme) null, C08310eF.A09(this), R.drawable.vec_e2ee_backup_illustration));
            wDSTextLayout.setHeadlineText(C08310eF.A09(this).getString(R.string.f11nameremoved));
            wDSTextLayout.setPrimaryButtonText(C08310eF.A09(this).getString(R.string.f11nameremoved));
        }
        if (this.A01.A0X(4869) && !this.A01.A0X(4870)) {
            TextView A0A2 = C08310eF.A0A(view2, R.id.enable_info_title);
            A0A2.setText(R.string.f11nameremoved);
            A0A2.setPadding(0, 0, 0, C08310eF.A09(this).getDimensionPixelSize(R.dimen.f6nameremoved));
            C06560Yg.A02(A0J(), R.id.enable_info_enc_backup_info).setVisibility(8);
            View A02 = C06560Yg.A02(A0J(), R.id.enc_backup_enable_list_no_image);
            A02.setVisibility(0);
            A02.findViewById(R.id.enc_bottom_sheet_image_item_one).setVisibility(8);
            A02.findViewById(R.id.enc_bottom_sheet_image_item_two).setVisibility(8);
            A02.findViewById(R.id.enc_bottom_sheet_image_item_three).setVisibility(8);
            ConstraintLayout constraintLayout = (ConstraintLayout) C06560Yg.A02(A0J(), R.id.enc_backup_enable_list_no_image);
            AnonymousClass0XZ r1 = new AnonymousClass0XZ();
            r1.A0B(constraintLayout);
            r1.A06(R.id.enc_bottom_sheet_list_item_one);
            r1.A06(R.id.enc_bottom_sheet_list_item_two);
            r1.A06(R.id.enc_bottom_sheet_list_item_three);
            r1.A09(constraintLayout);
            A02.setLayoutParams(constraintLayout.getLayoutParams());
        }
    }
}
