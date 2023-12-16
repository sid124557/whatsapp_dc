package X;

import android.widget.RadioGroup;
import com.whatsapp.dmsetting.ChangeDMSettingActivity;
import com.whatsapp.ephemeral.ChangeEphemeralSettingActivity;
import com.whatsapp.expiringgroups.ChangeExpiringGroupsSettingActivity;

/* renamed from: X.9pF  reason: invalid class name and case insensitive filesystem */
public class C204369pF implements RadioGroup.OnCheckedChangeListener {
    public Object A00;
    public final int A01;

    public C204369pF(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void onCheckedChanged(RadioGroup radioGroup, int i) {
        int i2 = this.A01;
        Object obj = this.A00;
        switch (i2) {
            case 0:
                ChangeDMSettingActivity changeDMSettingActivity = (ChangeDMSettingActivity) obj;
                int A0K = AnonymousClass001.A0K(C06560Yg.A02(radioGroup, i).getTag());
                changeDMSettingActivity.A03 = A0K;
                changeDMSettingActivity.A75(A0K);
                return;
            case 1:
                ((ChangeEphemeralSettingActivity) obj).A02 = AnonymousClass001.A0K(C06560Yg.A02(radioGroup, i).getTag());
                return;
            default:
                ((ChangeExpiringGroupsSettingActivity) obj).A01 = AnonymousClass001.A0K(C06560Yg.A02(radioGroup, i).getTag());
                return;
        }
    }
}
