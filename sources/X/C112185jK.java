package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ListView;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.bonsai.BonsaiSystemMessageBottomSheet;
import com.whatsapp.bonsai.embodiment.BotEmbodimentViewModel;
import com.whatsapp.jid.UserJid;

/* renamed from: X.5jK  reason: invalid class name and case insensitive filesystem */
public final class C112185jK implements C1229766o {
    public final AnonymousClass2E5 A00;
    public final AnonymousClass64J A01;
    public final AnonymousClass5TH A02;
    public final AnonymousClass7KQ A03;
    public final C56722sS A04;
    public final C52802m4 A05;
    public final AnonymousClass3GN A06;
    public final AnonymousClass3GN A07;
    public final C50192hm A08;
    public final C53122ma A09;
    public final C41252Jn A0A;
    public final C620733j A0B;
    public final C52412lR A0C;
    public final AnonymousClass1VX A0D;
    public final C183538qC A0E;
    public final C183538qC A0F;
    public final C183538qC A0G;
    public final AnonymousClass66R A0H = C154517dI.A01(C121005zW.A00);

    public void AxS(TextView textView, int i, boolean z) {
        C162457s7.A0J(textView, 0);
        if (!C1001059l.A04) {
            int i2 = R.drawable.vec_bonsai_stardust_large;
            if (z) {
                i2 = R.drawable.vec_bonsai_stardust_small;
            }
            C107555bV.A0B(textView, this.A0B, i2);
        } else if (z) {
            Context context = textView.getContext();
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
            Drawable A002 = AnonymousClass0RP.A00(context, R.drawable.vec_bonsai_stardust_small);
            if (A002 != null) {
                A002.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                C620733j r2 = this.A0B;
                if (C102805Ki.A00(r2)) {
                    textView.setCompoundDrawables(new C131666dx(A002, r2), (Drawable) null, (Drawable) null, (Drawable) null);
                } else {
                    textView.setCompoundDrawables((Drawable) null, (Drawable) null, A002, (Drawable) null);
                }
            }
        } else {
            C107555bV.A0B(textView, this.A0B, R.drawable.vec_bonsai_stardust_large);
        }
        C620733j r0 = this.A0B;
        int A022 = C86624Kv.A02(textView, i);
        Drawable[] compoundDrawables = textView.getCompoundDrawables();
        boolean A003 = C102805Ki.A00(r0);
        char c = 2;
        if (A003) {
            c = 0;
        }
        compoundDrawables[c].setColorFilter(A022, PorterDuff.Mode.SRC_IN);
    }

    public boolean B21(C624134x r4) {
        return (r4 instanceof C30481mW) && r4.A0r() != null && C57322tS.A00(r4) && this.A05.A00() && this.A0D.A0X(5283);
    }

    public void BpI(C89654ea r5, boolean z) {
        AnonymousClass20P r0;
        C162457s7.A0J(r5, 0);
        BonsaiSystemMessageBottomSheet bonsaiSystemMessageBottomSheet = new BonsaiSystemMessageBottomSheet();
        Bundle A082 = AnonymousClass002.A08();
        if (z) {
            r0 = AnonymousClass20P.USER_AGENT;
        } else {
            r0 = AnonymousClass20P.INVOKE;
        }
        A082.putInt("ARG_TYPE_ORDINAL", r0.ordinal());
        bonsaiSystemMessageBottomSheet.A0u(A082);
        r5.Boo(bonsaiSystemMessageBottomSheet);
    }

    public C112185jK(AnonymousClass2E5 r18, AnonymousClass64J r19, AnonymousClass5TH r20, AnonymousClass7KQ r21, C56722sS r22, C52802m4 r23, AnonymousClass3GN r24, AnonymousClass3GN r25, C50192hm r26, C53122ma r27, C41252Jn r28, C620733j r29, C52412lR r30, AnonymousClass1VX r31, C183538qC r32, C183538qC r33, C183538qC r34) {
        AnonymousClass1VX r4 = r31;
        C56722sS r12 = r22;
        C52802m4 r11 = r23;
        C18260x0.A0V(r4, r11, r12);
        AnonymousClass5TH r15 = r20;
        C162457s7.A0J(r15, 5);
        C183538qC r3 = r32;
        C620733j r5 = r29;
        C53122ma r7 = r27;
        AnonymousClass3GN r10 = r24;
        AnonymousClass3GN r9 = r25;
        C18260x0.A0g(r10, r5, r9, r3, r7);
        AnonymousClass7KQ r13 = r21;
        C162457s7.A0J(r13, 11);
        C183538qC r0 = r33;
        C183538qC r2 = r34;
        C41252Jn r6 = r28;
        C50192hm r8 = r26;
        AnonymousClass2E5 r16 = r18;
        C18260x0.A0h(r0, r6, r8, r16, r2);
        AnonymousClass64J r14 = r19;
        C162457s7.A0J(r14, 17);
        this.A0D = r4;
        this.A05 = r11;
        this.A04 = r12;
        this.A0C = r30;
        this.A02 = r15;
        this.A06 = r10;
        this.A0B = r5;
        this.A07 = r9;
        this.A0F = r3;
        this.A09 = r7;
        this.A03 = r13;
        this.A0G = r0;
        this.A0A = r6;
        this.A08 = r8;
        this.A00 = r16;
        this.A0E = r2;
        this.A01 = r14;
    }

    public boolean BH2(C95814uZ r3) {
        if (r3 == null || !C155477ey.A00(r3) || !this.A05.A00()) {
            return false;
        }
        return true;
    }

    public boolean BH4(C95814uZ r4) {
        String str;
        AnonymousClass1VX r2 = this.A0D;
        if ((r2.A0X(4532) || r2.A0X(5259)) && !this.A0C.A02() && BH2(r4) && this.A05.A00() && (r4 instanceof UserJid)) {
            C48902ff r0 = (C48902ff) this.A0G.get();
            UserJid userJid = (UserJid) r4;
            C162457s7.A0J(userJid, 0);
            C54002o1 A002 = r0.A00(userJid);
            if (A002 == null || (str = A002.A03) == null || str.length() == 0) {
                return false;
            }
            return true;
        }
        return false;
    }

    public boolean BHD() {
        if (!this.A05.A02() || !C86654Ky.A1T(C18310x6.A0F(this.A03.A02), "bonsai_meta_ai_button_setting_enabled")) {
            return false;
        }
        return true;
    }

    public boolean BoS() {
        C52802m4 r1 = this.A05;
        if (!r1.A00() || !r1.A01() || !r1.A03.A0X(6252)) {
            return false;
        }
        AnonymousClass2NA r5 = (AnonymousClass2NA) this.A0E.get();
        Boolean bool = r5.A00;
        Boolean bool2 = Boolean.FALSE;
        boolean z = false;
        if (C162457s7.A0P(bool, bool2)) {
            return false;
        }
        C52802m4 r12 = r5.A02.A01;
        if (r12.A00() && r12.A00.A02()) {
            r5.A00 = bool2;
            return false;
        } else if (AnonymousClass0x9.A1Q(r5.A00)) {
            return true;
        } else {
            AnonymousClass66R r4 = r5.A01.A02;
            int i = C18310x6.A0F(r4).getInt("bonsai_fab_tooltip_shown_count", 0);
            SharedPreferences.Editor A042 = C18270x1.A04(r4);
            C162457s7.A0D(A042);
            A042.putInt("bonsai_fab_tooltip_shown_count", i + 1);
            A042.apply();
            if (i < 3) {
                z = true;
            }
            Boolean valueOf = Boolean.valueOf(z);
            r5.A00 = valueOf;
            C626936e.A06(valueOf);
            if (valueOf.booleanValue()) {
                return true;
            }
            return false;
        }
    }

    public static final C995055z A00(ViewGroup viewGroup, Window window, C009707r r11, BotEmbodimentViewModel botEmbodimentViewModel, C95814uZ r13) {
        ViewGroup viewGroup2;
        botEmbodimentViewModel.A0D(r13);
        C995055z r3 = new C995055z(r11, viewGroup, r13);
        viewGroup.addOnLayoutChangeListener(new C1891690g((Object) r3, 2));
        AnonymousClass4QF r4 = new AnonymousClass4QF(r11);
        r4.A04(r11, r13);
        r3.A09(r4, (View) null, r11.getResources().getDimensionPixelSize(R.dimen.f6nameremoved), r11.getResources().getDimensionPixelSize(R.dimen.f6nameremoved), r11.getResources().getDimensionPixelSize(R.dimen.f6nameremoved), r11.getResources().getDimensionPixelSize(R.dimen.f6nameremoved));
        View decorView = window.getDecorView();
        if ((decorView instanceof ViewGroup) && (viewGroup2 = (ViewGroup) decorView) != null) {
            viewGroup2.addView(r3, new ViewGroup.LayoutParams(-1, -1));
        }
        return r3;
    }

    public static final boolean A01(ViewGroup viewGroup, int i) {
        View childAt = viewGroup.getChildAt(i);
        if (childAt != null) {
            int[] iArr = new int[2];
            childAt.getLocationInWindow(iArr);
            int[] iArr2 = new int[2];
            viewGroup.getLocationInWindow(iArr2);
            float f = (float) (iArr[1] - iArr2[1]);
            if (i != 0 || C86664Kz.A00(((float) viewGroup.getPaddingTop()) - f, (float) viewGroup.getPaddingTop(), 1.0f) >= 1.0f) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final void A02(ListView listView, AnonymousClass3ZH r5) {
        View findViewById = listView.findViewById(R.id.bonsai_list_view_header);
        if (findViewById == null) {
            findViewById = AnonymousClass001.A0R(C18280x3.A0D(listView), listView, R.layout.f8nameremoved);
            listView.addHeaderView(findViewById);
            if (findViewById == null) {
                return;
            }
        }
        AnonymousClass5YB.A00(findViewById, this.A01, R.id.bonsai_list_view_header_contact_name).A08(r5);
    }

    public boolean BH3(C95814uZ r3) {
        if (!BH2(r3) || r3 == null) {
            return false;
        }
        AnonymousClass1RK r0 = (AnonymousClass1RK) this.A07.A06.get(r3);
        if (r0 == null || r0.A00) {
            return true;
        }
        return false;
    }

    public void BhO(Configuration configuration, Window window, ListView listView, AnonymousClass3ZH r7) {
        C18260x0.A0O(listView, r7);
        C86614Ku.A1S(configuration, 2, window);
        AnonymousClass560 r0 = (AnonymousClass560) C86634Kw.A0N(window);
        if (r0 != null) {
            r0.A07();
            r0.setConfiguration(configuration);
        }
        View findViewById = listView.findViewById(R.id.bonsai_list_view_header);
        if (configuration.orientation == 2 || !BH3(r7.A0H)) {
            listView.removeHeaderView(findViewById);
        } else if (findViewById == null) {
            A02(listView, r7);
        }
    }
}
