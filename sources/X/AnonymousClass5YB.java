package X;

import android.content.Context;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaTextView;
import com.whatsapp.group.view.custom.GroupDetailsCard;
import java.util.List;

/* renamed from: X.5YB  reason: invalid class name */
public class AnonymousClass5YB {
    public final Context A00;
    public final C162167rN A01 = C162167rN.A00();
    public final TextEmojiLabel A02;
    public final AnonymousClass5ZU A03;
    public final C620733j A04;
    public final C56982ss A05;
    public final AnonymousClass1VX A06;

    public static void A01(LayoutInflater layoutInflater, GroupDetailsCard groupDetailsCard, int i) {
        layoutInflater.inflate(i, groupDetailsCard, true);
        View A022 = C06560Yg.A02(groupDetailsCard, R.id.action_message);
        C162457s7.A0D(A022);
        groupDetailsCard.A03 = A022;
        View A023 = C06560Yg.A02(groupDetailsCard, R.id.action_add_person);
        C162457s7.A0D(A023);
        groupDetailsCard.A00 = A023;
        View A024 = C06560Yg.A02(groupDetailsCard, R.id.action_search_chat);
        C162457s7.A0D(A024);
        groupDetailsCard.A02 = A024;
        View A025 = C06560Yg.A02(groupDetailsCard, R.id.action_call);
        C162457s7.A0D(A025);
        groupDetailsCard.A01 = A025;
        View A026 = C06560Yg.A02(groupDetailsCard, R.id.action_videocall);
        C162457s7.A0D(A026);
        groupDetailsCard.A04 = A026;
        View A027 = C06560Yg.A02(groupDetailsCard, R.id.group_details_card_subtitle);
        C162457s7.A0D(A027);
        groupDetailsCard.A08 = (TextEmojiLabel) A027;
        View A028 = C06560Yg.A02(groupDetailsCard, R.id.announcements_subtitle_number_of_participants);
        C162457s7.A0D(A028);
        groupDetailsCard.A05 = (TextView) A028;
        View A029 = C06560Yg.A02(groupDetailsCard, R.id.group_second_subtitle);
        C162457s7.A0D(A029);
        groupDetailsCard.A0B = (WaTextView) A029;
        groupDetailsCard.A0A = A00(groupDetailsCard, groupDetailsCard.getTextEmojiLabelViewControllerFactory(), R.id.group_title);
        groupDetailsCard.A03();
    }

    public void A08(AnonymousClass3ZH r9) {
        AnonymousClass5ZU r1 = this.A03;
        AnonymousClass3ZH r4 = r9;
        AnonymousClass7HU A0B = r1.A0B(r9, -1);
        boolean A0C = A0C(r9);
        if (r9.A0R() && (r1.A0d(r9) || r9.A0F == null)) {
            A0C = r9.A0V();
        } else if (r9.A0T() && r9.A0V()) {
            A0C = true;
        }
        A07(A0B, r4, (List) null, -1, A0C);
    }

    public void A0A(AnonymousClass3ZH r8, List list) {
        A07(this.A03.A0B(r8, -1), r8, list, -1, AnonymousClass000.A1S(A0C(r8) ? 1 : 0));
    }

    public static void A02(AnonymousClass5YB r1) {
        TextEmojiLabel textEmojiLabel = r1.A02;
        AnonymousClass0YY.A06(textEmojiLabel, 2);
        C106905aM.A04(textEmojiLabel);
    }

    public static void A03(AnonymousClass5YB r0, int i) {
        r0.A02.setTextColor(i);
    }

    public final Spannable A04(CharSequence charSequence, CharSequence charSequence2) {
        AnonymousClass0XH r1;
        C15770ru r0;
        C620733j r4 = this.A04;
        AnonymousClass0XH r12 = r4.A05().A01;
        CharSequence A032 = r12.A03(r12.A00, charSequence2);
        AnonymousClass8LC r2 = null;
        try {
            r2 = this.A01.A0F(charSequence.toString(), (String) null);
        } catch (C143616zC unused) {
        }
        if (r2 == null || !this.A01.A0M(r2)) {
            r1 = r4.A05().A01;
            r0 = r1.A00;
        } else {
            r1 = r4.A05().A01;
            r0 = AnonymousClass0K7.A04;
        }
        CharSequence A033 = r1.A03(r0, charSequence);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append(A033).append(" ").append(A032);
        return spannableStringBuilder;
    }

    public void A05() {
        TextEmojiLabel textEmojiLabel = this.A02;
        textEmojiLabel.setText(R.string.f11nameremoved);
        textEmojiLabel.A0E();
    }

    public void A06(int i) {
        TextEmojiLabel textEmojiLabel;
        int A002;
        if (i != 0) {
            if (i == 1) {
                textEmojiLabel = this.A02;
                A002 = AnonymousClass29N.A00(this.A06);
            } else if (i == 2) {
                textEmojiLabel = this.A02;
                boolean A0X = this.A06.A0X(5276);
                A002 = R.drawable.ic_verified_large;
                if (A0X) {
                    A002 = R.drawable.ic_verified_blue_large;
                }
            } else if (i == 3) {
                textEmojiLabel = this.A02;
                boolean A0X2 = this.A06.A0X(5276);
                A002 = R.drawable.ic_verified;
                if (A0X2) {
                    A002 = R.drawable.ic_verified_blue_small;
                }
            } else {
                return;
            }
            textEmojiLabel.A0F(A002, R.dimen.f6nameremoved);
            return;
        }
        this.A02.A0E();
    }

    public void A07(AnonymousClass7HU r5, AnonymousClass3ZH r6, List list, int i, boolean z) {
        TextEmojiLabel textEmojiLabel = this.A02;
        int i2 = 0;
        textEmojiLabel.A0J(r5.A01, list, 256, false);
        if (C998258i.PUSH_NAME == r5.A00 && i == 7) {
            textEmojiLabel.setContentDescription(this.A03.A0Q(r6, R.string.f11nameremoved));
        }
        if (z) {
            i2 = 1;
            if (i == 1) {
                i2 = 3;
            }
        }
        A06(i2);
    }

    public void A09(AnonymousClass3ZH r12, C107075ae r13, List list, float f) {
        Context context = this.A00;
        String A0J = this.A03.A0J(r12);
        if (A0J == null) {
            A0J = "";
        }
        String string = context.getString(R.string.f11nameremoved);
        TextEmojiLabel textEmojiLabel = this.A02;
        float f2 = f;
        int i = 0;
        if (f == 1.0f) {
            i = 256;
        }
        CharSequence A0D = textEmojiLabel.A0D(r13, A0J, list, f2, i, false);
        Spannable A042 = A04(A0D, string);
        C105565Vm.A00(A042, A042);
        textEmojiLabel.A08 = new AnonymousClass8E4(A042, this, A0D, string);
        textEmojiLabel.setText(A042);
        A06(r12.A0W() ? 1 : 0);
    }

    public void A0B(List list, CharSequence charSequence) {
        if (this instanceof C89414cu) {
            ((C89414cu) this).A0E((C107075ae) null, charSequence, list);
        } else {
            this.A02.A0J(charSequence, list, 0, false);
        }
    }

    public boolean A0C(AnonymousClass3ZH r4) {
        AnonymousClass1RL r0;
        C56982ss r2 = this.A05;
        if (r2 != null) {
            C95814uZ r1 = r4.A0H;
            if ((r1 instanceof C95804uY) && (r0 = (AnonymousClass1RL) C56982ss.A00(r2, r1)) != null) {
                return r0.A0L();
            }
        }
        return r4.A0W();
    }

    public AnonymousClass5YB(Context context, TextEmojiLabel textEmojiLabel, AnonymousClass5ZU r4, C620733j r5, C56982ss r6, AnonymousClass1VX r7) {
        C626936e.A06(context);
        this.A00 = context;
        C626936e.A04(textEmojiLabel);
        this.A02 = textEmojiLabel;
        C626936e.A06(r4);
        this.A03 = r4;
        C626936e.A06(r5);
        this.A04 = r5;
        this.A05 = r6;
        C626936e.A06(r7);
        this.A06 = r7;
    }

    public static AnonymousClass5YB A00(View view, AnonymousClass64J r3, int i) {
        return r3.Azt(view.getContext(), AnonymousClass0x7.A0K(view, i));
    }
}
