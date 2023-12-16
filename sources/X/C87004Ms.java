package X;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.EditText;
import com.whatsapp.R;
import com.whatsapp.registration.RegisterPhone;

/* renamed from: X.4Ms  reason: invalid class name and case insensitive filesystem */
public class C87004Ms extends ClickableSpan {
    public final /* synthetic */ AnonymousClass67R A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;

    public C87004Ms(AnonymousClass67R r1, String str, String str2) {
        this.A00 = r1;
        this.A01 = str;
        this.A02 = str2;
    }

    public void onClick(View view) {
        RegisterPhone registerPhone = (RegisterPhone) this.A00.A00;
        C106175Xx r1 = registerPhone.A03;
        String str = this.A01;
        String str2 = this.A02;
        registerPhone.A0I.A03.setText(AnonymousClass36l.A0A(r1, str, str2).substring(str.length() + 2));
        EditText editText = registerPhone.A0I.A03;
        editText.setSelection(C86624Kv.A03(editText));
        registerPhone.A7D();
        registerPhone.A05.A0H(R.string.f11nameremoved, 1);
        C18260x0.A0s("RegisterPhone/suggested/tapped ", str2, AnonymousClass001.A0o());
        registerPhone.A0k = true;
    }

    public void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }
}
