package X;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Pair;
import java.util.ArrayList;

/* renamed from: X.4Hn  reason: invalid class name and case insensitive filesystem */
public class C85764Hn implements DialogInterface.OnClickListener {
    public Object A00;
    public Object A01;
    public Object A02;
    public String A03;
    public String A04;
    public final int A05;

    public C85764Hn(Object obj, Object obj2, Object obj3, String str, String str2, int i) {
        this.A05 = i;
        this.A00 = obj3;
        this.A03 = str;
        this.A04 = str2;
        this.A01 = obj2;
        this.A02 = obj;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (this.A05 != 0) {
            Activity activity = (Activity) this.A00;
            String str = this.A03;
            String str2 = this.A04;
            C621433s.A00(activity, 125);
            activity.startActivity(((AnonymousClass5WY) this.A01).A00(activity, (Bundle) null, (C631938h) null, (Integer) null, AnonymousClass000.A0U("blocked +", str, str2, AnonymousClass001.A0o()), (String) null, (ArrayList) null, (ArrayList) null, ((C53202mi) this.A02).A00()));
            return;
        }
        ((C111095hX) this.A01).A0A((Context) this.A02, C18310x6.A0D(((C66433Lk) this.A00).A02((Pair) null, "general", this.A03, this.A04)));
    }
}
