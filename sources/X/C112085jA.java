package X;

import android.view.View;
import com.whatsapp.R;

/* renamed from: X.5jA  reason: invalid class name and case insensitive filesystem */
public final class C112085jA implements AnonymousClass64O {
    public final AnonymousClass5YB A00;

    public void BNe(AnonymousClass64P r3) {
        this.A00.A02.setText(((C112125jE) r3).A00);
    }

    public C112085jA(View view, AnonymousClass64J r4, AnonymousClass5UX r5) {
        r5.A06(AnonymousClass0x9.A0F(view, R.id.contactpicker_row_photo), R.drawable.avatar_contact);
        AnonymousClass5YB A002 = AnonymousClass5YB.A00(view, r4, R.id.contactpicker_row_name);
        this.A00 = A002;
        C106905aM.A04(A002.A02);
    }
}
