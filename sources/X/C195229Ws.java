package X;

import android.app.Activity;

/* renamed from: X.9Ws  reason: invalid class name and case insensitive filesystem */
public class C195229Ws implements C202449m2 {
    public Object A00;
    public final int A01;

    public C195229Ws(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void Baq() {
        Activity A0Q;
        int i = this.A01;
        Object obj = this.A00;
        switch (i) {
            case 2:
            case 4:
                A0Q = ((C08310eF) obj).A0Q();
                break;
            default:
                A0Q = (Activity) obj;
                break;
        }
        AnonymousClass9VH.A00(A0Q);
    }
}
