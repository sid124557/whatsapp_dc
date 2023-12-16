package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import com.whatsapp.R;
import java.lang.ref.Reference;
import java.lang.ref.SoftReference;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.6Du  reason: invalid class name and case insensitive filesystem */
public final class C124766Du extends Handler {
    public final Context A00;
    public final /* synthetic */ C158927km A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C124766Du(Context context, Looper looper, C158927km r3) {
        super(looper);
        this.A01 = r3;
        C626936e.A06(looper);
        this.A00 = context;
    }

    public void handleMessage(Message message) {
        C105425Uw B13;
        Object r1;
        C158927km r6 = this.A01;
        Message message2 = message;
        String string = message2.getData().getString("tag_bundle_key");
        C626936e.A06(string);
        Context context = this.A00;
        ConcurrentHashMap concurrentHashMap = r6.A0e;
        Reference reference = (Reference) concurrentHashMap.get(string);
        if (reference == null || (r1 = reference.get()) == null) {
            ConcurrentHashMap concurrentHashMap2 = r6.A0f;
            Reference reference2 = (Reference) concurrentHashMap2.get(string);
            if (reference2 == null || (B13 = (C105425Uw) reference2.get()) == null) {
                C85164Fe r2 = (C85164Fe) r6.A0g.get(string);
                if (r2 != null) {
                    B13 = r2.B13(context, r6.A0B, true);
                    concurrentHashMap2.put(string, new SoftReference(B13));
                } else {
                    return;
                }
            }
            String A0C = B13.A0C(context);
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
            if (B13.A0Q()) {
                B13.A0J(r6.A01);
            }
            if (B13.A0R()) {
                B13.A0G(r6.A00);
            }
            Drawable A09 = B13.A09();
            if (A09 == null) {
                float f = (float) dimensionPixelSize;
                B13.A0M(AnonymousClass002.A07(), 0.0f, 0.0f, f, f);
                Bitmap createBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                B13.A0K(new Canvas(createBitmap));
                A09 = new BitmapDrawable(context.getResources(), createBitmap);
            }
            r1 = new C148297Hv(A09, A0C);
        }
        concurrentHashMap.put(string, new SoftReference(r1));
        View view = (View) message2.obj;
        if (view != null) {
            view.setTag(r1);
            Message obtain = Message.obtain(r6.A0K, 0, 0, 0, view);
            Bundle A08 = AnonymousClass002.A08();
            A08.putString("tag_bundle_key", string);
            obtain.setData(A08);
            obtain.sendToTarget();
        }
    }
}
