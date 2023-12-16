package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.whatsapp.R;

/* renamed from: X.94K  reason: invalid class name */
public class AnonymousClass94K extends LinearLayout implements AnonymousClass4GJ {
    public ImageView A00;
    public TextView A01;
    public C620933l A02;
    public C116855qy A03;
    public boolean A04;

    public final Object generatedComponent() {
        C116855qy r0 = this.A03;
        if (r0 == null) {
            r0 = C116855qy.A00(this);
            this.A03 = r0;
        }
        return r0.generatedComponent();
    }

    public void setContactInformation(C166587yw r2, String str, String str2) {
        if (r2 == null || TextUtils.isEmpty(str) || !AnonymousClass36S.A07(str2)) {
            setVisibility(8);
        } else {
            setBankContactDetails(r2, str2, str);
        }
    }

    public AnonymousClass94K(Context context) {
        super(context);
        if (!this.A04) {
            this.A04 = true;
            this.A02 = C1899593h.A0E(C88864av.A00(generatedComponent()));
        }
        View A0h = C86664Kz.A0h(C18280x3.A0D(this), this, R.layout.f8nameremoved);
        this.A00 = AnonymousClass0x9.A0F(A0h, R.id.bank_logo);
        this.A01 = AnonymousClass002.A09(A0h, R.id.contact_bank_details);
    }

    public final void setBankContactDetails(C166587yw r6, String str, String str2) {
        Context context = getContext();
        Object[] objArr = new Object[3];
        C18280x3.A19(r6.A0B, str2, objArr);
        String A0F = AnonymousClass002.A0F(context, str, objArr, 2, R.string.f11nameremoved);
        SpannableString spannableString = new SpannableString(A0F);
        C1899693i.A0k(spannableString, AnonymousClass000.A0V("tel:", str2, AnonymousClass001.A0o()), A0F, str2);
        TextView textView = this.A01;
        textView.setText(spannableString);
        Bitmap A09 = r6.A09();
        if (A09 != null) {
            ImageView imageView = this.A00;
            imageView.setImageBitmap(A09);
            imageView.setVisibility(0);
        }
        textView.setVisibility(0);
    }
}
