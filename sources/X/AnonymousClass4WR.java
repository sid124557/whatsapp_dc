package X;

import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.group.GroupAdminPickerActivity;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.4WR  reason: invalid class name */
public class AnonymousClass4WR extends AnonymousClass0R6 {
    public ArrayList A00;
    public List A01 = AnonymousClass001.A0s();
    public final /* synthetic */ GroupAdminPickerActivity A02;

    public AnonymousClass4WR(GroupAdminPickerActivity groupAdminPickerActivity) {
        this.A02 = groupAdminPickerActivity;
    }

    public int A0G() {
        return this.A01.size();
    }

    public /* bridge */ /* synthetic */ void BNf(C05570Ua r8, int i) {
        C88274Yc r82 = (C88274Yc) r8;
        AnonymousClass3ZH A0L = AnonymousClass4L0.A0L(this.A01, i);
        r82.A01.setVisibility(8);
        r82.A04.A0A(A0L, this.A00);
        GroupAdminPickerActivity groupAdminPickerActivity = this.A02;
        groupAdminPickerActivity.A0C.A08(r82.A00, A0L);
        if (!groupAdminPickerActivity.A0B.A0e(A0L, -1) || A0L.A0b == null) {
            r82.A02.setVisibility(8);
        } else {
            TextEmojiLabel textEmojiLabel = r82.A02;
            textEmojiLabel.setVisibility(0);
            textEmojiLabel.A0K(this.A00, AnonymousClass5ZU.A03(groupAdminPickerActivity.A0B, A0L));
        }
        String str = A0L.A0X;
        TextEmojiLabel textEmojiLabel2 = r82.A03;
        if (str != null) {
            textEmojiLabel2.setVisibility(0);
            textEmojiLabel2.A0K((List) null, A0L.A0X);
        } else {
            textEmojiLabel2.setVisibility(8);
        }
        r82.A0H.setTag(AnonymousClass3ZH.A03(A0L));
    }

    public /* bridge */ /* synthetic */ C05570Ua BQR(ViewGroup viewGroup, int i) {
        GroupAdminPickerActivity groupAdminPickerActivity = this.A02;
        return new C88274Yc(AnonymousClass001.A0R(groupAdminPickerActivity.getLayoutInflater(), viewGroup, R.layout.f8nameremoved), groupAdminPickerActivity);
    }
}
