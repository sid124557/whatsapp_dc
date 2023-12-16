package X;

import android.text.TextUtils;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.group.GroupAdminPickerActivity;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.552  reason: invalid class name */
public class AnonymousClass552 extends AnonymousClass5ZM {
    public final AnonymousClass5ZU A00;
    public final C620733j A01;
    public final String A02;
    public final WeakReference A03;
    public final List A04;

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        String str = this.A02;
        if (TextUtils.isEmpty(str)) {
            return this.A04;
        }
        ArrayList A0s = AnonymousClass001.A0s();
        C620733j r5 = this.A01;
        ArrayList A032 = C107155an.A03(r5, str);
        Iterator it = this.A04.iterator();
        while (it.hasNext()) {
            AnonymousClass3ZH A0R = C18310x6.A0R(it);
            if (this.A00.A0f(A0R, A032, true) || C107155an.A05(r5, A0R.A0b, A032, true)) {
                A0s.add(A0R);
            }
        }
        return A0s;
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        List list = (List) obj;
        GroupAdminPickerActivity groupAdminPickerActivity = (GroupAdminPickerActivity) this.A03.get();
        if (groupAdminPickerActivity != null && !groupAdminPickerActivity.BHW()) {
            AnonymousClass4WR r2 = groupAdminPickerActivity.A0I;
            String str = groupAdminPickerActivity.A0M;
            r2.A01 = list;
            r2.A00 = C107155an.A03(r2.A02.A0E, str);
            r2.A05();
            TextView A0L = C18310x6.A0L(groupAdminPickerActivity, R.id.search_no_matches);
            if (!list.isEmpty() || TextUtils.isEmpty(groupAdminPickerActivity.A0M)) {
                A0L.setVisibility(8);
                return;
            }
            A0L.setVisibility(0);
            Object[] A0L2 = AnonymousClass002.A0L();
            A0L2[0] = groupAdminPickerActivity.A0M;
            AnonymousClass001.A0y(groupAdminPickerActivity, A0L, A0L2, R.string.f11nameremoved);
        }
    }

    public AnonymousClass552(AnonymousClass5ZU r3, C620733j r4, GroupAdminPickerActivity groupAdminPickerActivity, String str, List list) {
        ArrayList A0s = AnonymousClass001.A0s();
        this.A04 = A0s;
        this.A00 = r3;
        this.A01 = r4;
        this.A03 = AnonymousClass0x9.A14(groupAdminPickerActivity);
        A0s.addAll(list);
        this.A02 = str;
    }
}
