package X;

import com.whatsapp.businessdirectory.view.activity.DirectorySetLocationMapActivity;

/* renamed from: X.93E  reason: invalid class name */
public class AnonymousClass93E implements C181128mC {
    public Object A00;
    public final int A01;

    public AnonymousClass93E(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void BW2(C105415Uv r3) {
        if (this.A01 != 0) {
            AnonymousClass4uh r1 = (AnonymousClass4uh) this.A00;
            if (r1.A08 == null) {
                r1.A08 = r3;
                r1.setLocationMode(r1.A03);
                return;
            }
            return;
        }
        DirectorySetLocationMapActivity.A0C(r3, (DirectorySetLocationMapActivity) this.A00);
    }
}
