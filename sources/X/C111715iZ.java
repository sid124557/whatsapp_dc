package X;

import android.graphics.Bitmap;
import android.os.AsyncTask;
import com.whatsapp.R;
import com.whatsapp.chatinfo.ContactInfoActivity;
import com.whatsapp.chatinfo.view.custom.BusinessChatInfoLayout;

/* renamed from: X.5iZ  reason: invalid class name and case insensitive filesystem */
public final class C111715iZ implements C185398ta {
    public /* bridge */ /* synthetic */ void BVd(Bitmap bitmap, C186038ue r9, boolean z) {
        C111755id r6 = ((C111725ia) r9).A02.A00;
        ContactInfoActivity contactInfoActivity = r6.A0n;
        if (bitmap != null) {
            C91504kC r2 = (C91504kC) contactInfoActivity.findViewById(R.id.content);
            if (r2 instanceof BusinessChatInfoLayout) {
                AnonymousClass0x9.A0E(r2, R.id.picture).setImageBitmap(bitmap);
                r2.A09();
                AnonymousClass6BG.A00(r2.A0I.getViewTreeObserver(), r2, 7);
            }
            AnonymousClass0OY r5 = new AnonymousClass0OY(bitmap);
            new AnonymousClass01Q(r5, new C110725gv(contactInfoActivity)).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Bitmap[]{r5.A01});
        }
        r6.A0O = null;
    }

    public /* bridge */ /* synthetic */ void BMf(C186038ue r1) {
    }

    public /* bridge */ /* synthetic */ void BVP(C186038ue r1) {
    }

    public /* bridge */ /* synthetic */ void BVY(C186038ue r1) {
    }
}
