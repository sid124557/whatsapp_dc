package X;

import android.content.Context;
import android.content.DialogInterface;
import java.util.List;

/* renamed from: X.4I6  reason: invalid class name */
public class AnonymousClass4I6 implements DialogInterface.OnClickListener {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public final int A05;

    public AnonymousClass4I6(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.A05 = i;
        this.A00 = obj4;
        this.A01 = obj5;
        this.A02 = obj3;
        this.A03 = obj2;
        this.A04 = obj;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (this.A05 != 0) {
            AnonymousClass30E r4 = (AnonymousClass30E) this.A00;
            List list = (List) this.A04;
            C84764Dp r5 = (C84764Dp) this.A02;
            C614430u r2 = r4.A01.A02;
            Boolean bool = Boolean.FALSE;
            r2.A06("e2ee_popup_fb_auto_crossposting", bool);
            r2.A06("e2ee_popup_ig_auto_crossposting", bool);
            r4.A02.BkM(new C71493cC((Context) this.A01, r4, r5, list, (List) this.A03));
            return;
        }
        Object obj = this.A00;
        ((AnonymousClass4FS) this.A01).BkM(new C71593cM(this.A02, (Object) C18300x5.A0x(obj), this.A03, this.A04, 49));
        dialogInterface.dismiss();
    }
}
