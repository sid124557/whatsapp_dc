package X;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupMenu;
import com.whatsapp.R;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;
import com.whatsapp.components.button.ThumbnailButton;
import com.whatsapp.util.Log;

/* renamed from: X.12l  reason: invalid class name and case insensitive filesystem */
public class C197612l extends C05570Ua {
    public C50392i6 A00;
    public AnonymousClass3ZH A01;
    public final PopupMenu A02;
    public final C69263Wi A03;
    public final C56972sr A04;
    public final AnonymousClass5YB A05;
    public final WaImageView A06;
    public final WaImageView A07;
    public final WaTextView A08;
    public final WaTextView A09;
    public final C1230066r A0A;
    public final ThumbnailButton A0B;
    public final C105365Uq A0C;
    public final C56612sH A0D;
    public final C56762sW A0E;
    public final C66543Lv A0F;
    public final AnonymousClass30G A0G;
    public final C56322rn A0H;
    public final C55422qK A0I;
    public final C50562iN A0J;
    public final AnonymousClass1VX A0K;
    public final AnonymousClass35J A0L;
    public final C55832qz A0M;
    public final AnonymousClass4FS A0N;
    public final C183538qC A0O;

    public final void A07(Context context) {
        String str;
        C50392i6 r0 = this.A00;
        if (r0 == null) {
            str = "UpcomingActivityCallViewHolder/openPrecallLobby schedule call null";
        } else {
            C27991fJ A012 = AnonymousClass34R.A01(r0.A04);
            if (A012 == null) {
                str = "UpcomingActivityCallViewHolder/openPrecallLobby group jid is null";
            } else {
                this.A0N.BkP(new C70323aJ(this, context, A012, 14));
                return;
            }
        }
        Log.w(str);
    }

    public void A08(C64573Ea r8) {
        C48912fg r4 = r8.A00;
        AnonymousClass3ZH r2 = r8.A02;
        this.A01 = r2;
        this.A00 = r8.A01;
        this.A0C.A08(this.A0B, r2);
        this.A09.setText(this.A00.A06);
        this.A05.A08(r2);
        this.A08.setText(r4.A01);
        WaImageView waImageView = this.A06;
        View view = this.A0H;
        C18290x4.A1A(view.getContext(), waImageView, r4.A00);
        boolean z = r4.A02;
        PopupMenu popupMenu = this.A02;
        popupMenu.getMenu().clear();
        popupMenu.getMenu().add(0, 0, 1, R.string.f11nameremoved);
        if (z) {
            SpannableString spannableString = new SpannableString(view.getContext().getString(R.string.f11nameremoved));
            spannableString.setSpan(new ForegroundColorSpan(-65536), 0, spannableString.length(), 0);
            popupMenu.getMenu().add(0, 1, 2, spannableString);
        }
        popupMenu.setOnMenuItemClickListener(new AnonymousClass3A9(this));
        this.A07.setOnClickListener(new C109315eQ(this, 20));
        view.setOnClickListener(new C109315eQ(this, 21));
    }

    public final boolean A09(MenuItem menuItem) {
        String str;
        Context context = this.A0H.getContext();
        if (context == null) {
            str = "UpcomingActivityCallViewHolder/onPopupMenuItemClickListener context null";
        } else if (this.A01 == null || this.A00 == null) {
            str = "UpcomingActivityCallViewHolder/onPopupMenuItemClickListener contact and/or schedule call null";
        } else if (menuItem.getItemId() == 0) {
            A07(context);
            return true;
        } else {
            SpannableString spannableString = new SpannableString(context.getString(R.string.f11nameremoved));
            spannableString.setSpan(new ForegroundColorSpan(-65536), 0, spannableString.length(), 0);
            C19340zH A002 = AnonymousClass5V0.A00(context);
            A002.A0h(AnonymousClass002.A0F(context, this.A00.A06, new Object[1], 0, R.string.f11nameremoved));
            A002.A0g(AnonymousClass002.A0F(context, this.A01.A0J(), new Object[1], 0, R.string.f11nameremoved));
            A002.A0i(true);
            C19340zH.A05(A002);
            A002.A00.A0I(new C85804Hr(this, 28), spannableString);
            C18280x3.A0q(A002);
            return true;
        }
        Log.w(str);
        return false;
    }

    public C197612l(View view, C69263Wi r5, C56972sr r6, AnonymousClass64J r7, C1230066r r8, C105365Uq r9, C56612sH r10, C56762sW r11, C66543Lv r12, AnonymousClass30G r13, C56322rn r14, C55422qK r15, C50562iN r16, AnonymousClass1VX r17, AnonymousClass35J r18, C55832qz r19, AnonymousClass4FS r20, C183538qC r21) {
        super(view);
        this.A0C = r9;
        this.A0D = r10;
        this.A0K = r17;
        this.A03 = r5;
        this.A04 = r6;
        this.A0N = r20;
        this.A0A = r8;
        this.A0G = r13;
        this.A0M = r19;
        this.A0E = r11;
        this.A0L = r18;
        this.A0F = r12;
        this.A0I = r15;
        this.A0H = r14;
        this.A0J = r16;
        this.A0O = r21;
        this.A09 = AnonymousClass0x7.A0L(view, R.id.schedule_call_title);
        this.A08 = AnonymousClass0x7.A0L(view, R.id.schedule_call_time_text);
        this.A06 = AnonymousClass0x9.A0L(view, R.id.call_type_icon);
        this.A0B = (ThumbnailButton) C06560Yg.A02(view, R.id.contact_photo);
        WaImageView A0L2 = AnonymousClass0x9.A0L(view, R.id.context_menu);
        this.A07 = A0L2;
        this.A05 = AnonymousClass5YB.A00(view, r7, R.id.schedule_call_group);
        this.A02 = new PopupMenu(view.getContext(), A0L2);
    }
}
