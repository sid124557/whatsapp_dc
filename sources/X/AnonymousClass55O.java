package X;

import android.graphics.Bitmap;
import com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel;

/* renamed from: X.55O  reason: invalid class name */
public class AnonymousClass55O extends AnonymousClass5ZM {
    public final boolean A00;
    public final boolean A01 = true;
    public final /* synthetic */ CallGridViewModel A02;

    public AnonymousClass55O(CallGridViewModel callGridViewModel, boolean z) {
        this.A02 = callGridViewModel;
        this.A00 = z;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        Bitmap[] bitmapArr = (Bitmap[]) objArr;
        int length = bitmapArr.length;
        boolean A1T = AnonymousClass001.A1T(length);
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("OnCameraClosedBlurTask requires only 1 bitmap but received ");
        A0o.append(length);
        C626936e.A0D(A1T, AnonymousClass000.A0X(" bitmaps", A0o));
        Bitmap bitmap = bitmapArr[0];
        CallGridViewModel.A0A(bitmap);
        return bitmap;
    }

    /* renamed from: A0G */
    public void A0C(Bitmap bitmap) {
        if (!C18320x8.A1T(this)) {
            if (this.A01) {
                AnonymousClass107 r2 = this.A02.A0i;
                r2.A0H(new AnonymousClass7Y7(((AnonymousClass7Y7) r2.A07()).A00, bitmap));
            }
            if (this.A00) {
                C102545Jg r1 = this.A02.A0T;
                synchronized (r1) {
                    if (r1.A04) {
                        r1.A00 = bitmap;
                    }
                }
            }
        }
    }
}
