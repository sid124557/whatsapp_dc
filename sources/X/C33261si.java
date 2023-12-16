package X;

import android.content.Context;
import android.graphics.Bitmap;
import com.whatsapp.R;
import com.whatsapp.calling.callhistory.CallLogActivity;
import java.lang.ref.WeakReference;

/* renamed from: X.1si  reason: invalid class name and case insensitive filesystem */
public class C33261si extends AnonymousClass5ZM {
    public final WeakReference A00;
    public final /* synthetic */ CallLogActivity A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C33261si(CallLogActivity callLogActivity, CallLogActivity callLogActivity2) {
        super(callLogActivity2, true);
        this.A01 = callLogActivity;
        this.A00 = AnonymousClass0x9.A14(callLogActivity2);
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        Bitmap bitmap;
        CallLogActivity callLogActivity = this.A01;
        int dimensionPixelSize = callLogActivity.getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
        float dimension = callLogActivity.getResources().getDimension(R.dimen.f6nameremoved);
        Context context = (Context) this.A00.get();
        if (context != null) {
            bitmap = callLogActivity.A0M.A03(context, callLogActivity.A0V, dimension, dimensionPixelSize, false);
        } else {
            bitmap = null;
        }
        if (!C18320x8.A1T(this)) {
            callLogActivity.A05.A0S(new C70183a5(this, 12, bitmap));
        }
        return null;
    }
}
