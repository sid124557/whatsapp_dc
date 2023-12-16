package X;

import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.calling.callhistory.group.GroupCallLogActivity;
import com.whatsapp.jid.UserJid;
import java.util.List;

/* renamed from: X.4XB  reason: invalid class name */
public class AnonymousClass4XB extends AnonymousClass0R6 {
    public List A00;
    public final /* synthetic */ GroupCallLogActivity A01;

    public AnonymousClass4XB(GroupCallLogActivity groupCallLogActivity) {
        this.A01 = groupCallLogActivity;
    }

    public static /* synthetic */ void A00(AnonymousClass4XB r3, C95814uZ r4) {
        int i = 0;
        for (AnonymousClass3ZE r0 : r3.A00) {
            if (r0.A02.equals(r4)) {
                r3.A01.A02.A06(i);
                return;
            }
            i++;
        }
    }

    public int A0G() {
        return this.A00.size();
    }

    public void BNf(C05570Ua r6, int i) {
        C88254Ya r62 = (C88254Ya) r6;
        UserJid userJid = ((AnonymousClass3ZE) this.A00.get(i)).A02;
        GroupCallLogActivity groupCallLogActivity = this.A01;
        AnonymousClass3ZH A0A = groupCallLogActivity.A07.A0A(userJid);
        C105365Uq r0 = groupCallLogActivity.A0B;
        ImageView imageView = r62.A02;
        r0.A08(imageView, A0A);
        C109725f5.A00(imageView, this, A0A, r62, 15);
        r62.A04.A08(A0A);
        AnonymousClass3ZF r02 = groupCallLogActivity.A0H;
        if (r02 != null && !r02.A0E.A03 && i == 0) {
            TextView textView = r62.A03;
            textView.setVisibility(0);
            C18320x8.A11(groupCallLogActivity.getResources(), textView, R.color.f5nameremoved);
            textView.setText(R.string.f11nameremoved);
        }
        C18320x8.A16(r62.A01, A0A, this, 21);
        C18320x8.A16(r62.A00, A0A, this, 22);
    }

    public C05570Ua BQR(ViewGroup viewGroup, int i) {
        return new C88254Ya(AnonymousClass001.A0R(C18280x3.A0D(viewGroup), viewGroup, R.layout.f8nameremoved), this.A01);
    }
}
