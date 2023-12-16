package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.conversation.conversationrow.viewmodel.SharePhoneNumberRowViewModel;
import com.whatsapp.jid.UserJid;

/* renamed from: X.1Pb  reason: invalid class name and case insensitive filesystem */
public class C22661Pb extends C93314oJ {
    public TextView A00;
    public boolean A01;
    public final C89654ea A02;
    public final SharePhoneNumberRowViewModel A03;

    private AnonymousClass3LD getPhoneNumberSharedBridge() {
        return (AnonymousClass3LD) ((C48062eH) this.A2B.get()).A02(AnonymousClass3LD.class);
    }

    public void A0v() {
        if (!this.A01) {
            this.A01 = true;
            AnonymousClass0x7.A0I(this).A4g(this);
        }
    }

    public C22661Pb(Context context, AnonymousClass677 r9, C30261mA r10) {
        super(context, r9, r10);
        A0v();
        C89654ea r0 = (C89654ea) C111095hX.A03(context, C89654ea.class);
        this.A02 = r0;
        this.A03 = (SharePhoneNumberRowViewModel) AnonymousClass0x9.A0H(r0).A01(SharePhoneNumberRowViewModel.class);
        AnonymousClass2z0 r02 = r10.A1J;
        boolean z = r02.A02;
        C95814uZ r4 = r02.A00;
        setBackground((Drawable) null);
        setLongClickable(false);
        if (r4 != null) {
            if (z) {
                SharePhoneNumberRowViewModel sharePhoneNumberRowViewModel = this.A03;
                AnonymousClass4UC A0b = AnonymousClass0x9.A0b();
                C70333aK.A00(sharePhoneNumberRowViewModel.A04, sharePhoneNumberRowViewModel, r4, A0b, 35);
                AnonymousClass4K2.A00(this.A02, A0b, this, 78);
            } else if (r4 instanceof UserJid) {
                setOnClickListener(new C109475eg(this, 26, r4));
            }
        }
        TextView A0G = C18300x5.A0G(this, R.id.info);
        this.A00 = A0G;
        if (z) {
            A0G.setText(R.string.f11nameremoved);
            setVisibility(0);
        } else if (r4 != null) {
            setVisibility(8);
            SharePhoneNumberRowViewModel sharePhoneNumberRowViewModel2 = this.A03;
            AnonymousClass4UC A0b2 = AnonymousClass0x9.A0b();
            C70333aK.A00(sharePhoneNumberRowViewModel2.A04, sharePhoneNumberRowViewModel2, r4, A0b2, 33);
            AnonymousClass4K2.A00(this.A02, A0b2, this, 79);
        }
    }

    public static /* synthetic */ void A00(C22661Pb r3, AnonymousClass1QS r4) {
        r3.getPhoneNumberSharedBridge();
        r3.A02.Bon(AnonymousClass25J.A00(r4.A00, r4.A01), "ConversationRowSharePhoneNumber");
    }

    public boolean A14() {
        return true;
    }

    public boolean A1v() {
        return false;
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
        return 3;
    }
}
