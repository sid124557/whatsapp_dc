package X;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.documentpicker.DocumentPreviewActivity;
import com.whatsapp.mediaview.PhotoView;
import java.io.File;
import java.lang.ref.WeakReference;

/* renamed from: X.54q  reason: invalid class name and case insensitive filesystem */
public final class C991554q extends AnonymousClass5ZM {
    public final C107105ah A00;
    public final File A01;
    public final String A02;
    public final WeakReference A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C991554q(C15910sA r2, C179308iw r3, C107105ah r4, File file, String str) {
        super(r2, true);
        C162457s7.A0J(r4, 5);
        this.A01 = file;
        this.A02 = str;
        this.A00 = r4;
        this.A03 = AnonymousClass0x9.A14(r3);
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        Resources A002;
        int i;
        C107105ah r4 = this.A00;
        String str = this.A02;
        File file = this.A01;
        if (AnonymousClass5b1.A06(str) || C989053r.A08(str)) {
            A002 = C54292oU.A00(r4.A00);
            i = R.dimen.f6nameremoved;
        } else {
            A002 = C54292oU.A00(r4.A00);
            i = R.dimen.f6nameremoved;
        }
        byte[] A04 = r4.A04(file, str, A002.getDimension(i), 0);
        if (A04 == null || C18320x8.A1T(this)) {
            return null;
        }
        return AnonymousClass5CD.A00(new BitmapFactory.Options(), A04, 2000);
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        C179308iw r4 = (C179308iw) this.A03.get();
        if (r4 != null) {
            File file = this.A01;
            String str = this.A02;
            DocumentPreviewActivity documentPreviewActivity = (DocumentPreviewActivity) r4;
            documentPreviewActivity.A01.setVisibility(8);
            documentPreviewActivity.A03.setVisibility(8);
            if (bitmap == null) {
                documentPreviewActivity.A79(file, str);
                return;
            }
            documentPreviewActivity.getLayoutInflater().inflate(R.layout.f8nameremoved, documentPreviewActivity.A02, true);
            PhotoView photoView = (PhotoView) C06560Yg.A02(documentPreviewActivity.A02, R.id.document_preview);
            photoView.A06(bitmap);
            int dimensionPixelOffset = photoView.getResources().getDimensionPixelOffset(R.dimen.f6nameremoved);
            ViewGroup.MarginLayoutParams A0T = AnonymousClass001.A0T(photoView);
            A0T.bottomMargin = dimensionPixelOffset;
            photoView.setLayoutParams(A0T);
        }
    }
}
