package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.util.SparseArray;
import com.google.android.material.chip.Chip;
import com.whatsapp.R;

/* renamed from: X.5VL  reason: invalid class name */
public class AnonymousClass5VL {
    public static SparseArray A00(AnonymousClass1VX r16) {
        SparseArray sparseArray = new SparseArray();
        float f = 2.0f;
        if (C1001059l.A04) {
            f = 0.0f;
        }
        sparseArray.put(C627136h.A03, new C149937Om(9.0f, 4.0f, f, R.id.search_media_filter_link, R.string.f11nameremoved, R.drawable.ic_link));
        sparseArray.put(105, new C149937Om(9.0f, 4.0f, 0.0f, R.id.search_media_filter_image, R.string.f11nameremoved, R.drawable.msg_status_image));
        sparseArray.put(97, new C149937Om(8.0f, 4.0f, 0.0f, R.id.search_media_filter_audio, R.string.f11nameremoved, R.drawable.msg_status_audio));
        sparseArray.put(103, new C149937Om(10.0f, 6.0f, 0.2f, R.id.search_media_filter_gif, R.string.f11nameremoved, R.drawable.msg_status_gif));
        sparseArray.put(118, new C149937Om(9.0f, 5.0f, 0.0f, R.id.search_media_filter_video, R.string.f11nameremoved, R.drawable.msg_status_video));
        sparseArray.put(100, new C149937Om(7.0f, 3.0f, 0.0f, R.id.search_media_filter_doc, R.string.f11nameremoved, R.drawable.msg_status_doc));
        sparseArray.put(117, new C149937Om(9.0f, 5.0f, 0.0f, R.id.search_unread_filter, R.string.f11nameremoved, R.drawable.smart_filter_unread));
        boolean A1Y = C86614Ku.A1Y(r16);
        int i = R.drawable.msg_status_poll;
        if (A1Y) {
            i = R.drawable.msg_status_poll_v2;
        }
        sparseArray.put(111, new C149937Om(7.0f, 3.0f, 0.0f, R.id.search_poll_filter, R.string.f11nameremoved, i));
        return sparseArray;
    }

    public static void A01(Context context, Chip chip, AnonymousClass1VX r11, int i, int i2) {
        InsetDrawable insetDrawable;
        C149937Om r2 = (C149937Om) A00(r11).get(i);
        Drawable A00 = C02680He.A00((Resources.Theme) null, context.getResources(), r2.A03);
        int A04 = AnonymousClass5YI.A04(context, r2.A01);
        if (A00 == null) {
            insetDrawable = null;
        } else {
            int max = Math.max(A00.getIntrinsicWidth(), A00.getIntrinsicHeight());
            int intrinsicWidth = ((max - A00.getIntrinsicWidth()) / 2) + A04;
            int A02 = (AnonymousClass4L0.A02(A00, max) / 2) + A04;
            insetDrawable = new InsetDrawable(A00, intrinsicWidth, A02, intrinsicWidth, A02);
        }
        C626936e.A06(insetDrawable);
        chip.setChipIcon(C107335b8.A07(context, insetDrawable, i2));
        chip.setChipIconSize(AnonymousClass5YI.A01(context, 20.0f));
        chip.setChipStartPadding(AnonymousClass5YI.A01(context, 1.0f));
        chip.setTextStartPadding(AnonymousClass5YI.A01(context, 1.0f));
        chip.setIconStartPadding(AnonymousClass5YI.A01(context, r2.A02));
        chip.setIconEndPadding(AnonymousClass5YI.A01(context, r2.A00));
    }
}
