package X;

import android.graphics.Bitmap;
import com.whatsapp.filter.FilterUtils;

/* renamed from: X.553  reason: invalid class name */
public class AnonymousClass553 extends AnonymousClass5ZM {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Bitmap A01;
    public final /* synthetic */ AnonymousClass5Y7 A02;
    public final /* synthetic */ Runnable A03;
    public final /* synthetic */ Runnable A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass553(Bitmap bitmap, C15910sA r3, AnonymousClass5Y7 r4, Runnable runnable, Runnable runnable2, int i) {
        super(r3, true);
        this.A02 = r4;
        this.A01 = bitmap;
        this.A00 = i;
        this.A04 = runnable;
        this.A03 = runnable2;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        AnonymousClass5Y7 r5 = this.A02;
        Bitmap bitmap = r5.A04;
        if (bitmap != null) {
            Bitmap bitmap2 = this.A01;
            if (bitmap2 == null || bitmap2 == bitmap || bitmap2.getHeight() != r5.A04.getHeight() || bitmap2.getWidth() != r5.A04.getWidth()) {
                return FilterUtils.A00(r5.A04, r5.A0T, this.A00, true);
            }
            if (FilterUtils.A02(r5.A04, bitmap2, r5.A0T, this.A00)) {
                return bitmap2;
            }
        }
        return null;
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        if (bitmap != null) {
            AnonymousClass5Y7 r3 = this.A02;
            r3.A03 = bitmap;
            Runnable runnable = this.A04;
            if (runnable != null) {
                runnable.run();
            }
            r3.A01 = this.A00;
            r3.A0U.A00();
            r3.A0Q.A09(r3.A0Y, r3.A03);
            return;
        }
        Bitmap bitmap2 = this.A01;
        if (bitmap2 != null) {
            AnonymousClass5Y7 r32 = this.A02;
            r32.A03 = bitmap2;
            r32.A0U.A00();
            r32.A0Q.A09(r32.A0Y, r32.A03);
        }
        this.A03.run();
    }
}
