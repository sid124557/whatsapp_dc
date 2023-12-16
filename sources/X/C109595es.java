package X;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;

/* renamed from: X.5es  reason: invalid class name and case insensitive filesystem */
public class C109595es implements View.OnClickListener {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public String A04;
    public String A05;
    public final int A06;

    public final void onClick(View view) {
        String str;
        Object obj;
        String str2;
        Drawable drawable;
        int i;
        boolean z;
        boolean z2;
        Object obj2;
        if (this.A06 != 0) {
            C1230466w r4 = (C1230466w) this.A00;
            int B2E = r4.B2E();
            boolean AyF = r4.AyF();
            if (B2E == 0) {
                if (AyF) {
                    str2 = this.A04;
                    obj2 = this.A01;
                } else {
                    str2 = this.A05;
                    obj2 = this.A02;
                }
                drawable = (Drawable) obj2;
                i = 0;
                z = true;
                z2 = false;
            } else {
                if (AyF) {
                    str = this.A04;
                    obj = this.A01;
                } else {
                    str = this.A05;
                    obj = this.A02;
                }
                drawable = (Drawable) obj;
                i = 0;
                z = true;
                z2 = true;
            }
            r4.Avx(drawable, this, str2, i, z, z2);
            return;
        }
        Runnable runnable = (Runnable) this.A00;
        Activity activity = (Activity) this.A01;
        AnonymousClass5WY r42 = (AnonymousClass5WY) this.A02;
        C53202mi r0 = (C53202mi) this.A03;
        String str3 = this.A04;
        String str4 = this.A05;
        if (runnable != null) {
            runnable.run();
        }
        activity.startActivity(r42.A00(activity, (Bundle) null, (C631938h) null, (Integer) null, AnonymousClass000.A0U("blocked +", str3, str4, AnonymousClass001.A0o()), (String) null, (ArrayList) null, (ArrayList) null, r0.A00()));
        C621433s.A00(activity, 124);
    }

    public C109595es(Object obj, Object obj2, Object obj3, Object obj4, String str, String str2, int i) {
        this.A06 = i;
        this.A00 = obj;
        this.A01 = obj2;
        this.A02 = obj3;
        this.A03 = obj4;
        this.A04 = str;
        this.A05 = str2;
    }
}
