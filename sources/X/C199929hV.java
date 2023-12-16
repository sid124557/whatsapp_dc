package X;

import com.whatsapp.dmsetting.ChangeDMSettingActivity;
import java.util.List;

/* renamed from: X.9hV  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C199929hV implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ ChangeDMSettingActivity A01;

    public final void run() {
        ChangeDMSettingActivity changeDMSettingActivity = this.A01;
        int i = this.A00;
        if (i == -1) {
            i = changeDMSettingActivity.A09.A05().intValue();
        }
        changeDMSettingActivity.A0A.A01((List) null, 1, i, 0, changeDMSettingActivity.A00, changeDMSettingActivity.A01);
        AnonymousClass5PH r2 = new AnonymousClass5PH(changeDMSettingActivity);
        r2.A0H = true;
        r2.A0L = true;
        r2.A0Z = AnonymousClass001.A0s();
        r2.A0E = true;
        r2.A0P = Integer.valueOf(i);
        changeDMSettingActivity.startActivityForResult(r2.A03("com.whatsapp.contact.picker.ContactPicker"), 1);
    }

    public /* synthetic */ C199929hV(ChangeDMSettingActivity changeDMSettingActivity, int i) {
        this.A01 = changeDMSettingActivity;
        this.A00 = i;
    }
}
