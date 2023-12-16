package X;

import android.content.Intent;
import android.content.res.Resources;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.mediacomposer.dialog.DataWarningDialog;
import com.whatsapp.support.DescribeProblemActivity;
import com.whatsapp.util.Log;

/* renamed from: X.67S  reason: invalid class name */
public class AnonymousClass67S extends ClickableSpan {
    public Object A00;
    public final int A01;

    public AnonymousClass67S(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void onClick(View view) {
        switch (this.A01) {
            case 0:
                Intent A09 = AnonymousClass0x9.A09("android.settings.DATE_SETTINGS");
                C89004bK r0 = (C89004bK) this.A00;
                r0.A00.A0A(r0.A01, A09);
                return;
            case 1:
                Log.d("DataWarningDialog/deviceSettingsClickable Click");
                DataWarningDialog dataWarningDialog = (DataWarningDialog) this.A00;
                dataWarningDialog.A1K();
                dataWarningDialog.A00.invoke();
                return;
            case 2:
                ((C08310eF) this.A00).startActivityForResult(C627736r.A07(view.getContext()), 0);
                return;
            default:
                DescribeProblemActivity describeProblemActivity = (DescribeProblemActivity) this.A00;
                describeProblemActivity.startActivity(C18310x6.A0D(describeProblemActivity.A01));
                return;
        }
    }

    public void updateDrawState(TextPaint textPaint) {
        int i;
        switch (this.A01) {
            case 1:
                C162457s7.A0J(textPaint, 0);
                super.updateDrawState(textPaint);
                i = C06400Xn.A00((Resources.Theme) null, C08310eF.A09((C08310eF) this.A00), R.color.f5nameremoved);
                break;
            case 2:
                C08310eF r0 = (C08310eF) this.A00;
                i = AnonymousClass5Yj.A03(r0.A1D(), r0.A1D(), R.attr.f3nameremoved, R.color.f5nameremoved);
                break;
            default:
                super.updateDrawState(textPaint);
                return;
        }
        textPaint.setColor(i);
    }
}
