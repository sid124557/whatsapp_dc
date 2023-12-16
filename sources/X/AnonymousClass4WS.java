package X;

import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.group.GroupChangedParticipantsBottomSheet;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.4WS  reason: invalid class name */
public final class AnonymousClass4WS extends AnonymousClass0R6 {
    public ArrayList A00;
    public List A01 = AnonymousClass001.A0s();
    public final /* synthetic */ GroupChangedParticipantsBottomSheet A02;

    public /* bridge */ /* synthetic */ C05570Ua BQR(ViewGroup viewGroup, int i) {
        C162457s7.A0J(viewGroup, 0);
        GroupChangedParticipantsBottomSheet groupChangedParticipantsBottomSheet = this.A02;
        return new C88284Yd(C18310x6.A0I(groupChangedParticipantsBottomSheet.A0I(), viewGroup, R.layout.f8nameremoved, false), groupChangedParticipantsBottomSheet);
    }

    public AnonymousClass4WS(GroupChangedParticipantsBottomSheet groupChangedParticipantsBottomSheet) {
        this.A02 = groupChangedParticipantsBottomSheet;
    }

    public int A0G() {
        return this.A01.size();
    }

    public /* bridge */ /* synthetic */ void BNf(C05570Ua r8, int i) {
        C88284Yd r82 = (C88284Yd) r8;
        C162457s7.A0J(r82, 0);
        AnonymousClass3ZH A0L = AnonymousClass4L0.A0L(this.A01, i);
        r82.A01.setVisibility(8);
        AnonymousClass5YB r1 = r82.A04;
        ArrayList arrayList = this.A00;
        if (arrayList == null) {
            throw C18270x1.A0S("filterTerms");
        }
        r1.A0A(A0L, arrayList);
        GroupChangedParticipantsBottomSheet groupChangedParticipantsBottomSheet = this.A02;
        C105365Uq r12 = groupChangedParticipantsBottomSheet.A08;
        if (r12 != null) {
            r12.A08(r82.A00, A0L);
        }
        AnonymousClass5ZU r13 = groupChangedParticipantsBottomSheet.A07;
        if (r13 != null) {
            if (!r13.A0e(A0L, -1) || A0L.A0b == null) {
                r82.A02.setVisibility(8);
            } else {
                TextEmojiLabel textEmojiLabel = r82.A02;
                textEmojiLabel.getLayoutParams().width = -1;
                C620733j r0 = groupChangedParticipantsBottomSheet.A0A;
                if (r0 != null) {
                    boolean A002 = C102805Ki.A00(r0);
                    int i2 = 2;
                    if (A002) {
                        i2 = 3;
                    }
                    textEmojiLabel.setTextAlignment(i2);
                    textEmojiLabel.setVisibility(0);
                    AnonymousClass5ZU r02 = groupChangedParticipantsBottomSheet.A07;
                    if (r02 != null) {
                        String A03 = AnonymousClass5ZU.A03(r02, A0L);
                        ArrayList arrayList2 = this.A00;
                        if (arrayList2 == null) {
                            throw C18270x1.A0S("filterTerms");
                        }
                        textEmojiLabel.A0K(arrayList2, A03);
                    } else {
                        throw C18270x1.A0S("waContactNames");
                    }
                } else {
                    throw C18270x1.A0S("whatsAppLocale");
                }
            }
            r82.A0H.setTag(AnonymousClass3ZH.A03(A0L));
            return;
        }
        throw C18270x1.A0S("waContactNames");
    }
}
