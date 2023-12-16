package X;

import com.whatsapp.businessdirectory.view.activity.DirectorySetLocationMapActivity;

/* renamed from: X.925  reason: invalid class name */
public class AnonymousClass925 implements AnonymousClass4CW {
    public Object A00;
    public final int A01;

    public AnonymousClass925(DirectorySetLocationMapActivity directorySetLocationMapActivity, int i) {
        this.A01 = i;
        this.A00 = directorySetLocationMapActivity;
    }

    public void BTu(int i, int i2) {
        int i3 = this.A01;
        DirectorySetLocationMapActivity directorySetLocationMapActivity = (DirectorySetLocationMapActivity) this.A00;
        if (i3 != 0) {
            directorySetLocationMapActivity.A7A(new C1891190b(this, 21), new AnonymousClass8FA(this, i, i2), i);
            return;
        }
        directorySetLocationMapActivity.A0B.A06.setVisibility(8);
        directorySetLocationMapActivity.A0B.A00();
    }

    public void BTv(String str) {
        if (this.A01 != 0) {
            DirectorySetLocationMapActivity directorySetLocationMapActivity = (DirectorySetLocationMapActivity) this.A00;
            directorySetLocationMapActivity.A0B.A03(str);
            directorySetLocationMapActivity.A74();
            return;
        }
        DirectorySetLocationMapActivity directorySetLocationMapActivity2 = (DirectorySetLocationMapActivity) this.A00;
        directorySetLocationMapActivity2.A0B.A06.setVisibility(8);
        directorySetLocationMapActivity2.A0B.A03(str);
    }
}
