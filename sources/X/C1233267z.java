package X;

import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.registration.RegisterPhone;
import com.whatsapp.util.Log;
import java.io.IOException;

/* renamed from: X.67z  reason: invalid class name and case insensitive filesystem */
public class C1233267z extends C151457Uw {
    public Object A00;
    public final int A01;

    public C1233267z(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void A00() {
        if (1 - this.A01 != 0) {
            super.A00();
        } else {
            ((RegisterPhone) this.A00).A7F();
        }
    }

    public void A01(String str, String str2) {
        if (this.A01 != 0) {
            RegisterPhone registerPhone = (RegisterPhone) this.A00;
            registerPhone.A0I.A04.setContentDescription((CharSequence) null);
            int i = 0;
            if ("".equals(str)) {
                registerPhone.A0I.A04.setText(R.string.f11nameremoved);
            } else if (str2 == null) {
                registerPhone.A0I.A04.setText(R.string.f11nameremoved);
                registerPhone.A7D();
            } else {
                String A02 = registerPhone.A0S.A02(registerPhone.A00, str2);
                registerPhone.A0I.A04.setText(A02);
                registerPhone.A0I.A04.setContentDescription(AnonymousClass0x2.A0X(registerPhone, A02, 1, R.string.f11nameremoved));
                registerPhone.A7F();
            }
            TextEmojiLabel textEmojiLabel = registerPhone.A0E;
            try {
                if ("eu".equals(registerPhone.A03.A03(str))) {
                    textEmojiLabel.setVisibility(i);
                    return;
                }
            } catch (IOException e) {
                Log.e("RegisterPhone/shouldShowTosInfo/getTosRegion failed", e);
            }
            i = 8;
            textEmojiLabel.setVisibility(i);
            return;
        }
        ((C97674z3) this.A00).A0I.A06 = str2;
    }
}
