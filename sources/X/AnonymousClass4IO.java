package X;

import com.whatsapp.R;
import com.whatsapp.community.AddGroupsToCommunityActivity;

/* renamed from: X.4IO  reason: invalid class name */
public class AnonymousClass4IO implements C84394Ce {
    public Object A00;
    public final int A01;

    public AnonymousClass4IO(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void BPN() {
        if (this.A01 != 0) {
            AnonymousClass1Np r7 = (AnonymousClass1Np) this.A00;
            AnonymousClass33U r1 = r7.A0A;
            C46352bU r0 = r1.A01;
            String A002 = r0.A00();
            r1.A08(C18300x5.A0Z(), C18290x4.A0b(), r0.A02, (Long) null, A002);
            r7.BjL();
            r7.A6Y(new C85884Hz(r7, 3), 0, R.string.f11nameremoved, R.string.f11nameremoved, R.string.f11nameremoved);
            return;
        }
        AddGroupsToCommunityActivity addGroupsToCommunityActivity = (AddGroupsToCommunityActivity) this.A00;
        addGroupsToCommunityActivity.BjL();
        addGroupsToCommunityActivity.A76();
    }
}
