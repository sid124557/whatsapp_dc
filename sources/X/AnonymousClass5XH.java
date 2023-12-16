package X;

import android.content.Context;
import androidx.fragment.app.DialogFragment;
import com.whatsapp.R;
import com.whatsapp.conversationslist.ConversationsFragment;
import java.util.Set;

/* renamed from: X.5XH  reason: invalid class name */
public class AnonymousClass5XH {
    public final Context A00;
    public final C69263Wi A01;
    public final C65203Gp A02;
    public final C64773Ex A03;
    public final C836449f A04;
    public final C56612sH A05;
    public final C56542sA A06;
    public final C55562qY A07;
    public final C66493Lq A08;
    public final AnonymousClass1R1 A09;
    public final C104355Qq A0A;
    public final AnonymousClass4FS A0B;

    public static /* synthetic */ void A00(C08270df r4, AnonymousClass5XH r5, C95814uZ r6, boolean z) {
        DialogFragment dialogFragment;
        AnonymousClass3ZH A0A2 = r5.A03.A0A(r6);
        if (r4 != null) {
            if (A0A2.A0U()) {
                C18260x0.A1R(AnonymousClass001.A0o(), "conversations/delete/group:", A0A2);
                if (r5.A08.A0l.A01) {
                    r5.A01.A0H(R.string.f11nameremoved, 0);
                    return;
                }
                dialogFragment = new ConversationsFragment.DeleteGroupDialogFragment();
            } else if (A0A2.A0H instanceof AnonymousClass1fS) {
                dialogFragment = new ConversationsFragment.DeleteBroadcastListDialogFragment();
            } else {
                r5.A0B.BkL(new C993855n((DialogFragment) new ConversationsFragment.DeleteContactDialogFragment(), r4, r5.A07, A0A2, z), AnonymousClass4L0.A0U());
                return;
            }
            C106565Zm.A01(dialogFragment, A0A2);
            dialogFragment.A0H().putBoolean("chatContainsStarredMessages", z);
            dialogFragment.A1O(r4, (String) null);
        }
    }

    public void A01(C95814uZ r4, long j) {
        if (!(r4 instanceof C28001fK)) {
            C65203Gp r2 = this.A02;
            Set A062 = r2.A06(r4, true);
            if (this.A09.A0O(r4, j) != null) {
                r2.A0O(A062);
            } else {
                r2.A0N(A062);
            }
        }
    }

    public AnonymousClass5XH(Context context, C69263Wi r2, C65203Gp r3, C64773Ex r4, C836449f r5, C56612sH r6, C56542sA r7, C55562qY r8, C66493Lq r9, AnonymousClass1R1 r10, C104355Qq r11, AnonymousClass4FS r12) {
        this.A00 = context;
        this.A05 = r6;
        this.A01 = r2;
        this.A0B = r12;
        this.A06 = r7;
        this.A02 = r3;
        this.A03 = r4;
        this.A08 = r9;
        this.A09 = r10;
        this.A07 = r8;
        this.A0A = r11;
        this.A04 = r5;
    }
}
