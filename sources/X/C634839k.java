package X;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.Pair;
import android.view.View;
import java.util.Set;

/* renamed from: X.39k  reason: invalid class name and case insensitive filesystem */
public class C634839k implements View.OnClickListener {
    public Object A00;
    public Object A01;
    public Object A02;
    public String A03;
    public final int A04;

    public C634839k(Object obj, Object obj2, Object obj3, String str, int i) {
        this.A04 = i;
        this.A00 = obj;
        this.A03 = str;
        this.A01 = obj2;
        this.A02 = obj3;
    }

    public final void onClick(View view) {
        switch (this.A04) {
            case 0:
                ((C111095hX) this.A00).BkW(((View) this.A01).getContext(), ((C66433Lk) this.A02).A02((Pair) null, "general", this.A03, (String) null), (C624134x) null);
                return;
            case 1:
                String str = this.A03;
                ((Dialog) this.A00).dismiss();
                Intent intent = new Intent("android.settings.REQUEST_SCHEDULE_EXACT_ALARM", Uri.parse(AnonymousClass000.A0V("package:", str, AnonymousClass001.A0o())));
                ((AnonymousClass1QL) this.A01).A02.A0A((Context) this.A02, intent);
                return;
            case 2:
                AnonymousClass3S8 r5 = (AnonymousClass3S8) this.A00;
                Object obj = this.A01;
                String str2 = this.A03;
                ((AnonymousClass65U) this.A02).setBadgeIcon((Drawable) null);
                C70133a0 A002 = C70133a0.A00(r5, obj, 0);
                C72173dI r2 = r5.A00;
                r2.execute(A002);
                r2.execute(new C70123Zz(r5, 47, obj));
                r5.A01.A0A(view.getContext(), new Intent("android.intent.action.VIEW", Uri.parse(str2)));
                return;
            default:
                ((C89654ea) C111095hX.A02(((View) this.A00).getContext())).Boo(C379624s.A00(this.A03, ((C624134x) this.A02).A1J.A01, (Set) this.A01));
                return;
        }
    }
}
