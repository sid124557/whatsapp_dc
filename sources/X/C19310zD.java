package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ContextMenu;
import android.view.View;
import android.widget.LinearLayout;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaTextView;
import com.whatsapp.jid.UserJid;
import com.whatsapp.wds.components.profilephoto.WDSProfilePhoto;

/* renamed from: X.0zD  reason: invalid class name and case insensitive filesystem */
public final class C19310zD extends LinearLayout implements AnonymousClass4GJ {
    public C56972sr A00;
    public AnonymousClass5UX A01;
    public C64773Ex A02;
    public AnonymousClass5ZU A03;
    public C56612sH A04;
    public C620733j A05;
    public C85304Fs A06;
    public C116855qy A07;
    public C73853gB A08;
    public C73853gB A09;
    public boolean A0A;
    public final LinearLayout A0B;
    public final TextEmojiLabel A0C;
    public final TextEmojiLabel A0D;
    public final WaTextView A0E;
    public final AnonymousClass5UY A0F;
    public final WDSProfilePhoto A0G;

    public C19310zD(Context context) {
        super(context, (AttributeSet) null, 0);
        if (!this.A0A) {
            this.A0A = true;
            C64333Db r1 = ((C88864av) ((C111685iW) generatedComponent())).A0K;
            this.A04 = C64333Db.A2p(r1);
            this.A00 = C64333Db.A06(r1);
            this.A02 = C64333Db.A26(r1);
            this.A01 = (AnonymousClass5UX) r1.A6K.get();
            this.A03 = C64333Db.A28(r1);
            this.A05 = C64333Db.A2t(r1);
            this.A06 = r1.A00.ALm();
            AnonymousClass46Q r0 = AnonymousClass2C4.A01;
            C615931l.A00(r0);
            this.A08 = r0;
            AnonymousClass46A r02 = AnonymousClass2C4.A03;
            C615931l.A00(r02);
            this.A09 = r02;
        }
        View.inflate(context, R.layout.f8nameremoved, this);
        C18310x6.A15(this);
        this.A0G = (WDSProfilePhoto) C18280x3.A0E(this, R.id.event_response_user_picture);
        this.A0C = (TextEmojiLabel) C18280x3.A0E(this, R.id.event_response_user_name);
        this.A0D = (TextEmojiLabel) C18280x3.A0E(this, R.id.event_response_secondary_name);
        this.A0E = (WaTextView) C18280x3.A0E(this, R.id.event_response_timestamp);
        this.A0B = (LinearLayout) C18280x3.A0E(this, R.id.event_response_subtitle_row);
        this.A0F = AnonymousClass0x2.A0M(this, R.id.event_response_user_label);
    }

    private final void setSecondaryName(String str) {
        if (str == null || str.length() == 0) {
            this.A0D.setVisibility(8);
            return;
        }
        TextEmojiLabel textEmojiLabel = this.A0D;
        textEmojiLabel.setText(str);
        textEmojiLabel.setVisibility(0);
    }

    public static final void setUpContextMenu$lambda$2$lambda$1(C19310zD r1, View view) {
        C162457s7.A0J(r1, 0);
        r1.showContextMenu();
    }

    public final void setContactAvatars(AnonymousClass5UX r2) {
        C162457s7.A0J(r2, 0);
        this.A01 = r2;
    }

    public final void setContactManager(C64773Ex r2) {
        C162457s7.A0J(r2, 0);
        this.A02 = r2;
    }

    public final void setEventResponseContextMenuHelper(C85304Fs r2) {
        C162457s7.A0J(r2, 0);
        this.A06 = r2;
    }

    public final void setIoDispatcher(C73853gB r2) {
        C162457s7.A0J(r2, 0);
        this.A08 = r2;
    }

    public final void setMainDispatcher(C73853gB r2) {
        C162457s7.A0J(r2, 0);
        this.A09 = r2;
    }

    public final void setMeManager(C56972sr r2) {
        C162457s7.A0J(r2, 0);
        this.A00 = r2;
    }

    public final void setTime(C56612sH r2) {
        C162457s7.A0J(r2, 0);
        this.A04 = r2;
    }

    public final void setWaContactNames(AnonymousClass5ZU r2) {
        C162457s7.A0J(r2, 0);
        this.A03 = r2;
    }

    public final void setWhatsAppLocale(C620733j r2) {
        C162457s7.A0J(r2, 0);
        this.A05 = r2;
    }

    public static final /* synthetic */ void A00(C51652kA r2, C19310zD r3, Long l) {
        r3.A0C.setText(r2.A00);
        String str = r2.A01;
        if ((str == null || str.length() == 0) && l == null) {
            r3.A0B.setVisibility(8);
            return;
        }
        r3.A0B.setVisibility(0);
        r3.setSecondaryName(str);
    }

    public final Object generatedComponent() {
        C116855qy r0 = this.A07;
        if (r0 == null) {
            r0 = new C116855qy(this);
            this.A07 = r0;
        }
        return r0.generatedComponent();
    }

    public final AnonymousClass5UX getContactAvatars() {
        AnonymousClass5UX r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("contactAvatars");
    }

    public final C64773Ex getContactManager() {
        C64773Ex r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("contactManager");
    }

    public final C85304Fs getEventResponseContextMenuHelper() {
        C85304Fs r0 = this.A06;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("eventResponseContextMenuHelper");
    }

    public final C73853gB getIoDispatcher() {
        C73853gB r0 = this.A08;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("ioDispatcher");
    }

    public final C73853gB getMainDispatcher() {
        C73853gB r0 = this.A09;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("mainDispatcher");
    }

    public final C56972sr getMeManager() {
        C56972sr r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("meManager");
    }

    public final C56612sH getTime() {
        C56612sH r0 = this.A04;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("time");
    }

    public final AnonymousClass5ZU getWaContactNames() {
        AnonymousClass5ZU r0 = this.A03;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("waContactNames");
    }

    public final C620733j getWhatsAppLocale() {
        C620733j r0 = this.A05;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("whatsAppLocale");
    }

    public static /* synthetic */ void getIoDispatcher$annotations() {
    }

    public static /* synthetic */ void getMainDispatcher$annotations() {
    }

    /* access modifiers changed from: private */
    public final void setUpContextMenu(AnonymousClass1T5 r3) {
        int i;
        boolean z = !((AnonymousClass3M9) getEventResponseContextMenuHelper()).A01.A0a(r3.A02);
        setClickable(z);
        if (z) {
            setOnCreateContextMenuListener(new C635639s(this, r3));
            setOnClickListener(new C633839a(this, 37));
            i = R.drawable.selector_orange_gradient;
        } else {
            i = R.color.f5nameremoved;
        }
        setBackgroundResource(i);
    }

    public static final void setUpContextMenu$lambda$2$lambda$0(C19310zD r5, AnonymousClass1T5 r6, ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        C18260x0.A0O(r5, r6);
        if (contextMenu != null) {
            C85304Fs eventResponseContextMenuHelper = r5.getEventResponseContextMenuHelper();
            UserJid userJid = r6.A02;
            C89644eZ r2 = (C89644eZ) C111095hX.A03(r5.getContext(), C89644eZ.class);
            AnonymousClass3M9 r4 = (AnonymousClass3M9) eventResponseContextMenuHelper;
            C162457s7.A0J(r2, 2);
            r4.A00.A01(contextMenu, r2, r4.A02.A0A(userJid));
            AnonymousClass5XA.A00(contextMenu, r2, userJid);
        }
    }
}
