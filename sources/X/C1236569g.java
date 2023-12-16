package X;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import com.whatsapp.Me;
import java.util.ArrayList;

/* renamed from: X.69g  reason: invalid class name and case insensitive filesystem */
public class C1236569g implements DialogInterface.OnClickListener {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public final int A04;

    public C1236569g(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.A04 = i;
        this.A00 = obj3;
        this.A01 = obj;
        this.A02 = obj2;
        this.A03 = obj4;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C104905Su r4;
        Activity activity;
        AnonymousClass4FU r2;
        AnonymousClass3ZH r1;
        boolean z;
        String A0X;
        switch (this.A04) {
            case 0:
                Activity activity2 = (Activity) this.A00;
                AnonymousClass5WY r42 = (AnonymousClass5WY) this.A01;
                Me me = (Me) this.A03;
                boolean A002 = ((C53202mi) this.A02).A00();
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("catalog not available");
                if (me == null) {
                    A0X = "";
                } else {
                    StringBuilder A0o2 = AnonymousClass001.A0o();
                    A0o2.append(" +");
                    A0o2.append(me.cc);
                    A0X = AnonymousClass000.A0X(me.number, A0o2);
                }
                activity2.startActivity(r42.A00(activity2, (Bundle) null, (C631938h) null, (Integer) null, AnonymousClass000.A0X(A0X, A0o), (String) null, (ArrayList) null, (ArrayList) null, A002));
                return;
            case 1:
                r4 = (C104905Su) this.A00;
                activity = (Activity) this.A01;
                r2 = (AnonymousClass4FU) this.A02;
                r1 = (AnonymousClass3ZH) this.A03;
                C621433s.A00(activity, 10);
                z = true;
                break;
            case 2:
                r4 = (C104905Su) this.A00;
                activity = (Activity) this.A01;
                r2 = (AnonymousClass4FU) this.A02;
                r1 = (AnonymousClass3ZH) this.A03;
                C621433s.A00(activity, 10);
                z = false;
                break;
            default:
                C71343bx.A00((AnonymousClass4FS) this.A00, this.A01, this.A02, 36);
                dialogInterface.dismiss();
                ((AnonymousClass653) this.A03).Ayt();
                return;
        }
        r4.A02(activity, r2, r1, z);
    }
}
