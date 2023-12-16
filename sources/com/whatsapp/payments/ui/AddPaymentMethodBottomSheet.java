package com.whatsapp.payments.ui;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass0x2;
import X.AnonymousClass1VX;
import X.AnonymousClass303;
import X.AnonymousClass9P2;
import X.AnonymousClass9Wg;
import X.AnonymousClass9XA;
import X.C06560Yg;
import X.C182878p8;
import X.C203499no;
import X.C204439pM;
import X.C620633i;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;

public class AddPaymentMethodBottomSheet extends Hilt_AddPaymentMethodBottomSheet {
    public C620633i A00;
    public AnonymousClass1VX A01;
    public C203499no A02;
    public AnonymousClass9P2 A03;
    public C182878p8 A04;
    public final AnonymousClass9XA A05 = new AnonymousClass9XA();

    public void onCancel(DialogInterface dialogInterface) {
        this.A05.onDismiss(dialogInterface);
    }

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        TextView A09;
        TextView A092;
        View A0R = AnonymousClass001.A0R(layoutInflater, viewGroup, R.layout.f8nameremoved);
        AnonymousClass9P2 r0 = this.A03;
        if (r0 != null) {
            int i = r0.A02;
            if (!(i == 0 || (A092 = AnonymousClass002.A09(A0R, R.id.add_payment_method_bottom_sheet_title)) == null)) {
                A092.setText(i);
            }
            int i2 = this.A03.A01;
            TextEmojiLabel textEmojiLabel = (TextEmojiLabel) A0R.findViewById(R.id.add_payment_method_bottom_sheet_desc);
            if (textEmojiLabel != null) {
                AnonymousClass0x2.A12(textEmojiLabel, this.A00);
                AnonymousClass0x2.A14(this.A01, textEmojiLabel);
                textEmojiLabel.setText(i2);
            }
            int i3 = this.A03.A00;
            if (!(i3 == 0 || (A09 = AnonymousClass002.A09(A0R, R.id.add_payment_method)) == null)) {
                A09.setText(i3);
            }
        }
        String string = A0H().getString("referral_screen");
        AnonymousClass9Wg.A03((AnonymousClass303) null, this.A02, "get_started", string);
        C06560Yg.A02(A0R, R.id.add_payment_method).setOnClickListener(new C204439pM(0, string, this));
        return A0R;
    }
}
