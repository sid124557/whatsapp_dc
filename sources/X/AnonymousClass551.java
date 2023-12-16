package X;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.whatsapp.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.551  reason: invalid class name */
public final class AnonymousClass551 extends AnonymousClass5ZM {
    public final C54292oU A00;
    public final AnonymousClass66R A01;
    public final AnonymousClass66R A02 = C154517dI.A01(new C119675xM(this));
    public final AnonymousClass66R A03 = C154517dI.A01(new C119685xN(this));
    public final AnonymousClass4GQ A04;

    public AnonymousClass551(C15910sA r2, C54292oU r3, AnonymousClass4GQ r4, int i) {
        super(r2, true);
        this.A00 = r3;
        this.A04 = r4;
        this.A01 = C154517dI.A01(new C119665xL(i));
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        C162457s7.A0J(obj, 0);
        this.A04.invoke(obj);
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        AnonymousClass66R r8 = this.A02;
        AnonymousClass66R r7 = this.A01;
        List<ResolveInfo> queryIntentActivities = ((PackageManager) C18300x5.A0d(r8)).queryIntentActivities((Intent) r7.getValue(), 0);
        ArrayList A0t = C18300x5.A0t(queryIntentActivities);
        for (T next : queryIntentActivities) {
            if (((ResolveInfo) next).activityInfo.exported) {
                A0t.add(next);
            }
        }
        if (A0t.isEmpty()) {
            return C72023d3.A00;
        }
        Drawable A002 = AnonymousClass0RP.A00(this.A00.A00, R.mipmap.icon);
        if (A002 != null) {
            int intrinsicHeight = A002.getIntrinsicHeight();
            ArrayList A0d = C73783g4.A0d(A0t);
            Iterator it = A0t.iterator();
            while (it.hasNext()) {
                ResolveInfo resolveInfo = (ResolveInfo) it.next();
                AnonymousClass3Z6.A03(resolveInfo, resolveInfo.loadIcon((PackageManager) C18300x5.A0d(r8)), A0d);
            }
            ArrayList A0d2 = C73783g4.A0d(A0d);
            Iterator it2 = A0d.iterator();
            while (it2.hasNext()) {
                C18270x1.A1K(A0d2, ((Drawable) ((AnonymousClass3Z6) it2.next()).second).getIntrinsicHeight());
            }
            Iterator it3 = A0d2.iterator();
            while (it3.hasNext()) {
                intrinsicHeight = Math.min(intrinsicHeight, C18280x3.A05(it3));
            }
            ArrayList A0d3 = C73783g4.A0d(A0d);
            Iterator it4 = A0d.iterator();
            while (it4.hasNext()) {
                AnonymousClass3Z6 r9 = (AnonymousClass3Z6) it4.next();
                ActivityInfo activityInfo = ((ResolveInfo) r9.first).activityInfo;
                C162457s7.A0C(activityInfo);
                Drawable A0A = C107335b8.A0A((Resources) this.A03.getValue(), (Drawable) r9.second, intrinsicHeight);
                C162457s7.A0D(A0A);
                CharSequence loadLabel = ((ResolveInfo) r9.first).loadLabel((PackageManager) C18300x5.A0d(r8));
                C162457s7.A0D(loadLabel);
                A0d3.add(new C102245Ia((Intent) r7.getValue(), activityInfo, A0A, loadLabel));
            }
            return A0d3;
        }
        throw AnonymousClass001.A0g("Icon is NULL");
    }
}
