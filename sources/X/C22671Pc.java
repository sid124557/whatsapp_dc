package X;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;
import com.whatsapp.contact.FacepileView;

/* renamed from: X.1Pc  reason: invalid class name and case insensitive filesystem */
public final class C22671Pc extends C93314oJ {
    public AnonymousClass5UX A00;
    public C54922pV A01;
    public C45942ap A02;
    public C73853gB A03;
    public C73853gB A04;
    public boolean A05;
    public final View A06 = C18280x3.A0E(this, R.id.event_action_divider);
    public final LinearLayout A07 = ((LinearLayout) C18280x3.A0E(this, R.id.event_action));
    public final LinearLayout A08 = ((LinearLayout) C18280x3.A0E(this, R.id.responses_row));
    public final TextEmojiLabel A09 = ((TextEmojiLabel) C18280x3.A0E(this, R.id.event_name));
    public final WaImageView A0A = C18280x3.A0J(this, R.id.event_action_icon);
    public final WaImageView A0B = C18280x3.A0J(this, R.id.event_icon);
    public final WaTextView A0C = ((WaTextView) C18280x3.A0E(this, R.id.event_action_text));
    public final WaTextView A0D = ((WaTextView) C18280x3.A0E(this, R.id.event_date));
    public final WaTextView A0E = ((WaTextView) C18280x3.A0E(this, R.id.responses_going_count));
    public final FacepileView A0F = ((FacepileView) C18280x3.A0E(this, R.id.responses_face_pile_view));
    public final C105365Uq A0G;
    public final AnonymousClass5UY A0H = AnonymousClass0x2.A0M(this, R.id.event_location);

    public final void setContactAvatars(AnonymousClass5UX r2) {
        C162457s7.A0J(r2, 0);
        this.A00 = r2;
    }

    public final void setEventMessageManager(C54922pV r2) {
        C162457s7.A0J(r2, 0);
        this.A01 = r2;
    }

    public final void setEventUtils(C45942ap r2) {
        C162457s7.A0J(r2, 0);
        this.A02 = r2;
    }

    public final void setIoDispatcher(C73853gB r2) {
        C162457s7.A0J(r2, 0);
        this.A03 = r2;
    }

    public final void setMainDispatcher(C73853gB r2) {
        C162457s7.A0J(r2, 0);
        this.A04 = r2;
    }

    public void A0v() {
        if (!this.A05) {
            this.A05 = true;
            AnonymousClass0x7.A0I(this).A4c(this);
        }
    }

    public final AnonymousClass5UX getContactAvatars() {
        AnonymousClass5UX r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("contactAvatars");
    }

    public final C54922pV getEventMessageManager() {
        C54922pV r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("eventMessageManager");
    }

    public final C45942ap getEventUtils() {
        C45942ap r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("eventUtils");
    }

    public final C73853gB getIoDispatcher() {
        C73853gB r0 = this.A03;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("ioDispatcher");
    }

    public int getMainChildMaxWidth() {
        if (this.A0n.BHf(getFMessage())) {
            return 0;
        }
        return getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
    }

    public final C73853gB getMainDispatcher() {
        C73853gB r0 = this.A04;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("mainDispatcher");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22671Pc(Context context, C105365Uq r3, AnonymousClass677 r4, C30461mU r5) {
        super(context, r4, r5);
        C18260x0.A0Q(context, r5);
        C162457s7.A0J(r3, 4);
        A0v();
        this.A0G = r3;
        A22();
    }

    public static /* synthetic */ void getIoDispatcher$annotations() {
    }

    public static /* synthetic */ void getMainDispatcher$annotations() {
    }

    public void A1H() {
        super.A1H();
        A22();
    }

    public void A1q(C624134x r1, boolean z) {
        super.A1q(r1, z);
        A22();
    }

    public final void A22() {
        LinearLayout linearLayout;
        AnonymousClass543 r1;
        String str;
        C624134x fMessage = getFMessage();
        C162457s7.A0K(fMessage, "null cannot be cast to non-null type com.whatsapp.event.fmessage.FMessageEvent");
        C30461mU r4 = (C30461mU) fMessage;
        setMessageText(r4.A04, this.A09, r4);
        CharSequence A012 = C107565bW.A01(this.A1E, this.A0M, r4.A00);
        C162457s7.A0D(A012);
        String A002 = C107145am.A00(this.A0M, r4.A00);
        WaTextView waTextView = this.A0D;
        Context context = getContext();
        Object[] A0M = AnonymousClass002.A0M();
        C18280x3.A19(A012, A002, A0M);
        AnonymousClass001.A0y(context, waTextView, A0M, R.string.f11nameremoved);
        C52422lS r0 = r4.A01;
        if (r0 == null || (str = r0.A02) == null || str.length() == 0) {
            this.A0H.A06(8);
        } else {
            AnonymousClass5UY r12 = this.A0H;
            ((TextView) r12.A04()).setText(str);
            r12.A06(0);
        }
        setOnClickListener(new AnonymousClass543(this, 42, r4));
        if (r4.A1J.A02) {
            this.A07.setVisibility(8);
            this.A06.setVisibility(8);
        } else {
            boolean A1V = AnonymousClass001.A1V((r4.A00 > getEventMessageManager().A01.A0D() ? 1 : (r4.A00 == getEventMessageManager().A01.A0D() ? 0 : -1)));
            WaTextView waTextView2 = this.A0C;
            Context context2 = getContext();
            if (A1V) {
                AnonymousClass0x2.A0q(context2, waTextView2, R.color.f5nameremoved);
                this.A0A.setVisibility(8);
                linearLayout = this.A07;
                r1 = null;
            } else {
                AnonymousClass0x2.A0q(context2, waTextView2, R.color.f5nameremoved);
                this.A0A.setVisibility(0);
                linearLayout = this.A07;
                r1 = new AnonymousClass543(this, 41, r4);
            }
            linearLayout.setOnClickListener(r1);
            linearLayout.setVisibility(0);
            this.A06.setVisibility(0);
        }
        boolean A1V2 = AnonymousClass001.A1V((r4.A00 > getEventMessageManager().A01.A0D() ? 1 : (r4.A00 == getEventMessageManager().A01.A0D() ? 0 : -1)));
        WaImageView waImageView = this.A0B;
        Context context3 = getContext();
        int i = R.color.f5nameremoved;
        if (A1V2) {
            i = R.color.f5nameremoved;
        }
        AnonymousClass0x2.A0p(context3, waImageView, i);
        getEventUtils().A00(r4, "ConversationRowEvent", new C818241f(this));
    }

    public int getCenteredLayoutId() {
        return R.layout.f8nameremoved;
    }

    public int getIncomingLayoutId() {
        return R.layout.f8nameremoved;
    }

    public int getOutgoingLayoutId() {
        return R.layout.f8nameremoved;
    }

    public int getUserNameInGroupLayoutOption() {
        return 1;
    }
}
