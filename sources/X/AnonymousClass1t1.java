package X;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.whatsapp.privacy.usernotice.UserNoticeModalIconView;
import java.io.File;
import java.lang.ref.WeakReference;

/* renamed from: X.1t1  reason: invalid class name */
public class AnonymousClass1t1 extends AnonymousClass5ZM {
    public final int A00;
    public final C151227Tx A01;
    public final WeakReference A02;

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        File file;
        View view;
        File[] fileArr = (File[]) objArr;
        if (fileArr == null || fileArr.length == 0 || (file = fileArr[0]) == null || (view = (View) this.A02.get()) == null) {
            return null;
        }
        int i = this.A00;
        return new BitmapDrawable(view.getResources(), C107245ax.A06(new AnonymousClass5WB(i, i), file).A02);
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        Drawable drawable = (Drawable) obj;
        AnonymousClass1kS r4 = (AnonymousClass1kS) this.A02.get();
        if (r4 == null) {
            return;
        }
        if (drawable == null) {
            r4.A08(this.A01);
            return;
        }
        Context context = r4.getContext();
        C151227Tx r0 = this.A01;
        C60622yr A002 = AnonymousClass754.A00(context, r0.A02, r0.A03);
        if (A002 != null) {
            Context context2 = r4.getContext();
            C162457s7.A0J(context2, 0);
            int A04 = AnonymousClass0Y8.A04(context2, A002.A00);
            Drawable A0B = C107335b8.A0B(drawable, AnonymousClass0Y8.A04(context2, A002.A01));
            C162457s7.A0D(A0B);
            drawable = new AnonymousClass4Lp(A0B, A04);
        }
        if (r4 instanceof UserNoticeModalIconView) {
            UserNoticeModalIconView userNoticeModalIconView = (UserNoticeModalIconView) r4;
            AnonymousClass0YY.A04((Drawable) null, userNoticeModalIconView);
            userNoticeModalIconView.setImageDrawable(drawable);
            userNoticeModalIconView.A00.setVisibility(8);
            return;
        }
        r4.clearColorFilter();
        r4.setImageDrawable(drawable);
    }

    public AnonymousClass1t1(C151227Tx r2, AnonymousClass1kS r3) {
        this.A01 = r2;
        this.A02 = AnonymousClass0x9.A14(r3);
        this.A00 = r3.getTargetIconSize();
    }
}
