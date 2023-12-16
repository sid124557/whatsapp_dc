package X;

import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.group.GroupChangedParticipantsBottomSheet;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.557  reason: invalid class name */
public final class AnonymousClass557 extends AnonymousClass5ZM {
    public final AnonymousClass5ZU A00;
    public final C620733j A01;
    public final String A02;
    public final WeakReference A03;
    public final List A04;
    public final /* synthetic */ GroupChangedParticipantsBottomSheet A05;

    public AnonymousClass557(AnonymousClass5ZU r3, C620733j r4, GroupChangedParticipantsBottomSheet groupChangedParticipantsBottomSheet, GroupChangedParticipantsBottomSheet groupChangedParticipantsBottomSheet2, String str, List list) {
        C162457s7.A0J(list, 5);
        this.A05 = groupChangedParticipantsBottomSheet;
        this.A00 = r3;
        this.A01 = r4;
        ArrayList A0s = AnonymousClass001.A0s();
        this.A04 = A0s;
        this.A03 = AnonymousClass0x9.A14(groupChangedParticipantsBottomSheet2);
        A0s.addAll(list);
        this.A02 = str;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        String str = this.A02;
        if (str == null || str.length() == 0) {
            return this.A04;
        }
        ArrayList A0s = AnonymousClass001.A0s();
        C620733j r5 = this.A01;
        ArrayList A032 = C107155an.A03(r5, str);
        C162457s7.A0D(A032);
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
        String str;
        List list = (List) obj;
        C162457s7.A0J(list, 0);
        GroupChangedParticipantsBottomSheet groupChangedParticipantsBottomSheet = (GroupChangedParticipantsBottomSheet) this.A03.get();
        if (groupChangedParticipantsBottomSheet != null && !groupChangedParticipantsBottomSheet.A0R().isFinishing()) {
            AnonymousClass4WS r2 = groupChangedParticipantsBottomSheet.A0C;
            if (r2 == null) {
                throw C18270x1.A0S("adapter");
            }
            String str2 = groupChangedParticipantsBottomSheet.A0E;
            r2.A01 = list;
            C620733j r0 = r2.A02.A0A;
            if (r0 != null) {
                ArrayList A032 = C107155an.A03(r0, str2);
                C162457s7.A0D(A032);
                r2.A00 = A032;
                r2.A05();
                AnonymousClass5UY A0M = AnonymousClass0x2.A0M(groupChangedParticipantsBottomSheet.A0J(), R.id.search_no_matches);
                if (!list.isEmpty() || (str = groupChangedParticipantsBottomSheet.A0E) == null || str.length() == 0) {
                    A0M.A06(8);
                    return;
                }
                ((TextView) AnonymousClass5UY.A00(A0M, 0)).setText(AnonymousClass0x7.A0n(groupChangedParticipantsBottomSheet, groupChangedParticipantsBottomSheet.A0E, new Object[1], 0, R.string.f11nameremoved));
                return;
            }
            throw C18270x1.A0S("whatsAppLocale");
        }
    }
}
