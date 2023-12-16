package X;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.whatsapp.R;

/* renamed from: X.94J  reason: invalid class name */
public class AnonymousClass94J extends LinearLayout implements AnonymousClass4GJ {
    public TextView A00;
    public C66663Mh A01;
    public C116855qy A02;
    public boolean A03;

    public final Object generatedComponent() {
        C116855qy r0 = this.A02;
        if (r0 == null) {
            r0 = C116855qy.A00(this);
            this.A02 = r0;
        }
        return r0.generatedComponent();
    }

    public void setContactInformation(String str) {
        String A06 = this.A01.A06(C66663Mh.A27);
        if (TextUtils.isEmpty(A06) || !AnonymousClass36S.A07(str)) {
            if (!TextUtils.isEmpty(A06)) {
                str = null;
            } else {
                setVisibility(8);
                return;
            }
        }
        setWhatsAppContactDetails(A06, str);
    }

    public AnonymousClass94J(Context context) {
        super(context);
        if (!this.A03) {
            this.A03 = true;
            this.A01 = (C66663Mh) C88864av.A00(generatedComponent()).AUd.get();
        }
        this.A00 = AnonymousClass002.A09(C86664Kz.A0h(C18280x3.A0D(this), this, R.layout.f8nameremoved), R.id.contact_bank_details);
    }

    public final void setWhatsAppContactDetails(String str, String str2) {
        int i;
        Object[] objArr;
        boolean A07 = AnonymousClass36S.A07(str2);
        Context context = getContext();
        if (A07) {
            i = R.string.f11nameremoved;
            objArr = C18310x6.A1b(str, 0);
            objArr[1] = str2;
        } else {
            i = R.string.f11nameremoved;
            objArr = new Object[]{str};
        }
        String string = context.getString(i, objArr);
        SpannableString spannableString = new SpannableString(string);
        C1899693i.A0k(spannableString, AnonymousClass000.A0V("tel:", str, AnonymousClass001.A0o()), string, str);
        TextView textView = this.A00;
        textView.setText(spannableString);
        textView.setVisibility(0);
    }
}
