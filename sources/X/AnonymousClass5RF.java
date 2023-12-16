package X;

import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.whatsapp.R;
import com.whatsapp.components.RoundCornerProgressBarV2;
import java.util.List;

/* renamed from: X.5RF  reason: invalid class name */
public class AnonymousClass5RF {
    public C60142y4 A00;
    public C30451mT A01;
    public final View A02;
    public final View A03;
    public final CheckBox A04;
    public final TextView A05;
    public final TextView A06;
    public final ConstraintLayout A07;
    public final C56972sr A08;
    public final C621033m A09;
    public final RoundCornerProgressBarV2 A0A;
    public final C64773Ex A0B;
    public final C105365Uq A0C;
    public final C620633i A0D;
    public final C620733j A0E;
    public final AnonymousClass5Y0 A0F;
    public final AnonymousClass1VX A0G;
    public final C617532c A0H;
    public final C60152y5 A0I;
    public final AnonymousClass5UY A0J;
    public final AnonymousClass5UY A0K;
    public final AnonymousClass5UY A0L;
    public final C183538qC A0M;
    public final C183538qC A0N;
    public final boolean A0O;

    public final boolean A00(C624134x r4) {
        C95814uZ r1 = r4.A1J.A00;
        if (!(r1 instanceof C95804uY)) {
            return false;
        }
        C626936e.A06(r4);
        AnonymousClass1RL r0 = (AnonymousClass1RL) ((C56982ss) this.A0M.get()).A0A(r1, false);
        if (r0 == null || !r0.A0K() || !this.A0G.A0X(6382)) {
            return true;
        }
        return false;
    }

    public AnonymousClass5RF(View view, C56972sr r6, C621033m r7, C64773Ex r8, C105365Uq r9, C620633i r10, C620733j r11, AnonymousClass5Y0 r12, AnonymousClass1VX r13, C617532c r14, C60152y5 r15, C183538qC r16, C183538qC r17, List list, boolean z) {
        this.A0G = r13;
        this.A0E = r11;
        this.A08 = r6;
        this.A0F = r12;
        this.A09 = r7;
        this.A0B = r8;
        this.A0D = r10;
        this.A0M = r16;
        this.A0H = r14;
        this.A0I = r15;
        this.A0C = r9;
        this.A02 = view;
        this.A0N = r17;
        View A022 = C06560Yg.A02(view, R.id.poll_option_end_wrapper);
        this.A03 = A022;
        this.A05 = C18300x5.A0G(view, R.id.poll_option_name);
        this.A06 = C18300x5.A0G(view, R.id.poll_option_vote_count);
        this.A0A = (RoundCornerProgressBarV2) C06560Yg.A02(view, R.id.poll_vote_ratio);
        CheckBox checkBox = (CheckBox) C06560Yg.A02(view, R.id.poll_option_vote_checkbox);
        this.A04 = checkBox;
        this.A0O = z;
        C633939b.A00(A022, this, 11);
        this.A0J = AnonymousClass0x2.A0M(view, R.id.poll_option_vote_first_profile_circle_view);
        this.A0K = AnonymousClass0x2.A0M(view, R.id.poll_option_vote_first_profile_image_view);
        this.A0L = AnonymousClass0x2.A0M(view, R.id.poll_option_vote_second_profile_image_view);
        C634339f.A00(checkBox, this, list, 0);
        ConstraintLayout constraintLayout = (ConstraintLayout) C06560Yg.A02(view, R.id.poll_option_main_layout);
        this.A07 = constraintLayout;
        if (!z) {
            constraintLayout.setFocusableInTouchMode(false);
            constraintLayout.setFocusable(false);
            constraintLayout.setImportantForAccessibility(2);
        }
    }
}
