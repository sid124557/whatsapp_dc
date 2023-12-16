package X;

import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.businessdirectory.view.activity.BusinessDirectoryMapViewActivity;

/* renamed from: X.602  reason: invalid class name */
public final class AnonymousClass602 extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ BusinessDirectoryMapViewActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass602(BusinessDirectoryMapViewActivity businessDirectoryMapViewActivity) {
        super(1);
        this.this$0 = businessDirectoryMapViewActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        TextEmojiLabel textEmojiLabel;
        BusinessDirectoryMapViewActivity businessDirectoryMapViewActivity = this.this$0;
        int A07 = C86644Kx.A07((Number) obj);
        if (A07 == 0) {
            ViewGroup viewGroup = businessDirectoryMapViewActivity.A04;
            if (viewGroup == null) {
                throw C18270x1.A0S("progressBarContainer");
            }
            viewGroup.setVisibility(8);
            textEmojiLabel = businessDirectoryMapViewActivity.A0B;
            if (textEmojiLabel == null) {
                throw C18270x1.A0S("mapViewChipText");
            }
        } else if (A07 == 1 || A07 == 2) {
            ViewGroup viewGroup2 = businessDirectoryMapViewActivity.A04;
            if (viewGroup2 == null) {
                throw C18270x1.A0S("progressBarContainer");
            }
            viewGroup2.setVisibility(0);
            textEmojiLabel = businessDirectoryMapViewActivity.A0B;
            if (textEmojiLabel == null) {
                throw C18270x1.A0S("mapViewChipText");
            }
        } else {
            if (A07 == 3) {
                ViewGroup viewGroup3 = businessDirectoryMapViewActivity.A04;
                if (viewGroup3 == null) {
                    throw C18270x1.A0S("progressBarContainer");
                }
                viewGroup3.setVisibility(8);
                TextEmojiLabel textEmojiLabel2 = businessDirectoryMapViewActivity.A0B;
                if (textEmojiLabel2 == null) {
                    throw C18270x1.A0S("mapViewChipText");
                }
                textEmojiLabel2.setVisibility(0);
                TextEmojiLabel textEmojiLabel3 = businessDirectoryMapViewActivity.A0B;
                if (textEmojiLabel3 == null) {
                    throw C18270x1.A0S("mapViewChipText");
                }
                textEmojiLabel3.setText(R.string.f11nameremoved);
            }
            return C59022wD.A00;
        }
        textEmojiLabel.setVisibility(8);
        return C59022wD.A00;
    }
}
