package X;

import android.content.Context;
import android.view.View;
import com.whatsapp.biz.catalog.view.PostcodeChangeBottomSheet;
import com.whatsapp.biz.product.view.activity.ProductDetailActivity;
import com.whatsapp.calling.views.JoinableEducationDialogFragment;
import com.whatsapp.contact.picker.ContactPickerFragment;
import com.whatsapp.text.ReadMoreTextView;

/* renamed from: X.67t  reason: invalid class name and case insensitive filesystem */
public class C1232667t extends C86994Mr {
    public Object A00;
    public final int A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1232667t(Context context, Object obj, int i) {
        super(context);
        this.A01 = i;
        this.A00 = obj;
    }

    public void onClick(View view) {
        switch (this.A01) {
            case 0:
                ProductDetailActivity productDetailActivity = (ProductDetailActivity) this.A00;
                PostcodeChangeBottomSheet postcodeChangeBottomSheet = new PostcodeChangeBottomSheet(new C170758Ek(productDetailActivity), true);
                productDetailActivity.A04 = postcodeChangeBottomSheet;
                postcodeChangeBottomSheet.A0E = (String) productDetailActivity.A03.A04.A07();
                postcodeChangeBottomSheet.A0F = (String) productDetailActivity.A03.A01.A07();
                postcodeChangeBottomSheet.A1d();
                PostcodeChangeBottomSheet postcodeChangeBottomSheet2 = productDetailActivity.A04;
                postcodeChangeBottomSheet2.A0C = productDetailActivity.A0r;
                C86644Kx.A1C(postcodeChangeBottomSheet2, productDetailActivity);
                return;
            case 1:
                C08240dc A0J = AnonymousClass0x2.A0J((C003203q) this.A00);
                A0J.A0C(JoinableEducationDialogFragment.A00(), (String) null);
                A0J.A02();
                return;
            case 2:
                ContactPickerFragment contactPickerFragment = (ContactPickerFragment) this.A00;
                contactPickerFragment.A0U.A0A(contactPickerFragment.A1D(), C18310x6.A0D(C66433Lk.A00(contactPickerFragment.A2P, "26000253")));
                return;
            case 3:
                C113245l7 r2 = (C113245l7) this.A00;
                r2.A5O.A01(3);
                r2.A2P(true);
                return;
            default:
                C117595sB r1 = (C117595sB) this.A00;
                r1.A03 = 0;
                r1.A01 = 0;
                ReadMoreTextView readMoreTextView = r1.A04;
                C183168pb r0 = readMoreTextView.A02;
                if (r0 == null || !r0.BP3()) {
                    readMoreTextView.setExpanded(true);
                    readMoreTextView.A08.removeCallbacks(readMoreTextView.A0A);
                    return;
                }
                return;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1232667t(Context context, Object obj, int i, int i2) {
        super(context, i);
        this.A01 = i2;
        this.A00 = obj;
    }
}
