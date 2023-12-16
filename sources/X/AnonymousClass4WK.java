package X;

import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.components.button.ThumbnailButton;
import com.whatsapp.contact.picker.PhoneContactsSelector;

/* renamed from: X.4WK  reason: invalid class name */
public final class AnonymousClass4WK extends AnonymousClass0R6 {
    public final /* synthetic */ PhoneContactsSelector A00;

    public AnonymousClass4WK(PhoneContactsSelector phoneContactsSelector) {
        this.A00 = phoneContactsSelector;
    }

    public int A0G() {
        return this.A00.A0h.size();
    }

    public /* bridge */ /* synthetic */ void BNf(C05570Ua r6, int i) {
        AnonymousClass4YP r62 = (AnonymousClass4YP) r6;
        PhoneContactsSelector phoneContactsSelector = this.A00;
        C104215Qc r3 = (C104215Qc) phoneContactsSelector.A0h.get(i);
        String str = r3.A05;
        boolean isEmpty = TextUtils.isEmpty(str);
        TextView textView = r62.A01;
        if (!isEmpty) {
            textView.setText(str);
        } else {
            textView.setText(r3.A06);
        }
        ThumbnailButton thumbnailButton = r62.A02;
        phoneContactsSelector.A0D.A06(thumbnailButton, R.drawable.avatar_contact);
        phoneContactsSelector.A0G.A03(thumbnailButton, r3);
        C18290x4.A1I(r62.A00, this, r3, 40);
    }

    public /* bridge */ /* synthetic */ C05570Ua BQR(ViewGroup viewGroup, int i) {
        return new AnonymousClass4YP(AnonymousClass001.A0R(this.A00.getLayoutInflater(), viewGroup, R.layout.f8nameremoved));
    }
}
