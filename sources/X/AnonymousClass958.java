package X;

import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import java.util.List;

/* renamed from: X.958  reason: invalid class name */
public class AnonymousClass958 extends AnonymousClass0R6 {
    public String A00 = "WhatsappPay";
    public final C620633i A01;
    public final AnonymousClass1VX A02;
    public final List A03 = AnonymousClass001.A0s();

    public int A0G() {
        return this.A03.size();
    }

    public /* bridge */ /* synthetic */ void BNf(C05570Ua r8, int i) {
        String str;
        String str2;
        SpannableString spannableString;
        AnonymousClass95S r82 = (AnonymousClass95S) r8;
        C193619Pi r3 = (C193619Pi) this.A03.get(i);
        r82.A02.setChecked(r3.A00);
        C195339Xj r6 = r3.A03;
        C51892kY r1 = r6.A03;
        if (r1.A01) {
            r82.A01.setVisibility(0);
            SpannableString spannableString2 = r1.A00;
            if (!TextUtils.isEmpty(spannableString2)) {
                r82.A05.setText(spannableString2);
            }
        }
        int i2 = r6.A00;
        if (i2 != 0) {
            r82.A06.setImageResource(i2);
            View view = r82.A00;
            view.setVisibility(0);
            if (r6.A0C) {
                view.setBackground((Drawable) null);
            }
        }
        AnonymousClass5UY r2 = r82.A07;
        r2.A06(8);
        C51872kW r12 = r6.A01;
        if (r12.A01 && (spannableString = r12.A00) != null) {
            r2.A06(0);
            ((TextView) r2.A04()).setText(spannableString);
        }
        C53762nc r22 = r3.A02;
        if (r22 != null) {
            str = C1899593h.A0b(r22, r6.A09, r6.A08);
            str2 = C1899593h.A0b(r22, r6.A07, r6.A06);
        } else {
            str = r6.A08;
            str2 = r6.A06;
        }
        if (!TextUtils.isEmpty(str)) {
            r82.A04.setText(str);
        }
        C51882kX r13 = r6.A02;
        if (r13.A01) {
            SpannableString spannableString3 = r13.A00;
            TextEmojiLabel textEmojiLabel = r82.A03;
            textEmojiLabel.setText(spannableString3);
            textEmojiLabel.setVisibility(0);
        }
        if (!TextUtils.isEmpty(str2)) {
            TextEmojiLabel textEmojiLabel2 = r82.A03;
            textEmojiLabel2.setText(str2);
            textEmojiLabel2.setVisibility(0);
        }
        C204409pJ.A00(r82.A0H, r3, r82, 21);
    }

    public /* bridge */ /* synthetic */ C05570Ua BQR(ViewGroup viewGroup, int i) {
        if (i == 0 || i == 1) {
            AnonymousClass1VX r3 = this.A02;
            return new AnonymousClass95S(AnonymousClass001.A0R(C18280x3.A0D(viewGroup), viewGroup, R.layout.f8nameremoved), this.A01, r3);
        }
        throw AnonymousClass001.A0e("PaymentOptionsBottomSheetAdapter/onCreateViewHolder/unhandled view type");
    }

    public int getItemViewType(int i) {
        return ((C193619Pi) this.A03.get(i)).A01;
    }

    public AnonymousClass958(C620633i r2, AnonymousClass1VX r3) {
        this.A02 = r3;
        this.A01 = r2;
    }
}
