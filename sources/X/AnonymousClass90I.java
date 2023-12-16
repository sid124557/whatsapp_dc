package X;

import android.content.Intent;
import android.view.KeyEvent;
import android.widget.TextView;
import com.whatsapp.payments.ui.mapper.register.IndiaUpiCreateCustomNumberActivity;
import com.whatsapp.textstatuscomposer.TextStatusComposerActivity;
import com.whatsapp.util.Log;

/* renamed from: X.90I  reason: invalid class name */
public class AnonymousClass90I implements TextView.OnEditorActionListener {
    public Object A00;
    public final int A01;

    public AnonymousClass90I(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        String str;
        switch (this.A01) {
            case 0:
                C102935Kv r2 = (C102935Kv) this.A00;
                if (keyEvent == null || keyEvent.getKeyCode() != 66) {
                    return false;
                }
                r2.A07.A05();
                return true;
            case 1:
                C185458ti r1 = (C185458ti) this.A00;
                if (i != 6) {
                    return false;
                }
                Log.i("MediaCaptionDialog/dismiss/send");
                r1.onDismiss();
                return true;
            case 2:
                IndiaUpiCreateCustomNumberActivity indiaUpiCreateCustomNumberActivity = (IndiaUpiCreateCustomNumberActivity) this.A00;
                if ((keyEvent == null || keyEvent.getKeyCode() != 66) && i != 6) {
                    return false;
                }
                C197109ca r4 = indiaUpiCreateCustomNumberActivity.A05;
                if (r4 != null) {
                    Integer A0S = C18280x3.A0S();
                    Intent intent = indiaUpiCreateCustomNumberActivity.getIntent();
                    if (intent != null) {
                        str = intent.getStringExtra("extra_referral_screen");
                    } else {
                        str = null;
                    }
                    r4.BKB(A0S, (Integer) null, "create_numeric_upi_alias", str);
                    indiaUpiCreateCustomNumberActivity.A74();
                    return true;
                }
                throw C18270x1.A0S("fieldStatsLogger");
            default:
                TextStatusComposerActivity textStatusComposerActivity = (TextStatusComposerActivity) this.A00;
                if (i != 4) {
                    return false;
                }
                textStatusComposerActivity.A79();
                textStatusComposerActivity.A78();
                return true;
        }
    }
}
