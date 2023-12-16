package X;

import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.chatinfo.view.custom.SharePhoneNumberBottomSheet;

/* renamed from: X.41K  reason: invalid class name */
public final class AnonymousClass41K extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ SharePhoneNumberBottomSheet this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass41K(SharePhoneNumberBottomSheet sharePhoneNumberBottomSheet) {
        super(1);
        this.this$0 = sharePhoneNumberBottomSheet;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        int i;
        TextView textView;
        C51332je r7 = (C51332je) obj;
        SharePhoneNumberBottomSheet sharePhoneNumberBottomSheet = this.this$0;
        C162457s7.A0H(r7);
        String str = r7.A01;
        if (!(str == null || (textView = sharePhoneNumberBottomSheet.A02) == null)) {
            textView.setText(str);
        }
        int A09 = AnonymousClass0x2.A09(sharePhoneNumberBottomSheet.A03);
        if (A09 == 3 || A09 == 4) {
            i = R.string.f11nameremoved;
        } else {
            i = R.string.f11nameremoved;
            if (A09 != 5) {
                i = R.string.f11nameremoved;
            }
        }
        String A0n = AnonymousClass0x7.A0n(sharePhoneNumberBottomSheet, r7.A00, new Object[1], 0, i);
        C162457s7.A0H(A0n);
        TextView textView2 = sharePhoneNumberBottomSheet.A04;
        if (textView2 != null) {
            C106715a2 r1 = sharePhoneNumberBottomSheet.A02;
            if (r1 != null) {
                textView2.setText(r1.A03(textView2.getContext(), A0n), TextView.BufferType.SPANNABLE);
                AnonymousClass1VX r0 = sharePhoneNumberBottomSheet.A01;
                if (r0 != null) {
                    C18270x1.A0q(textView2, r0);
                } else {
                    throw C18270x1.A0R();
                }
            } else {
                throw C18270x1.A0S("linkifier");
            }
        }
        return C59022wD.A00;
    }
}
