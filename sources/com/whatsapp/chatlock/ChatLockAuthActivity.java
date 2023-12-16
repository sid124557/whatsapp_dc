package com.whatsapp.chatlock;

import X.AnonymousClass001;
import X.AnonymousClass0x2;
import X.AnonymousClass2FE;
import X.AnonymousClass31A;
import X.AnonymousClass32Y;
import X.AnonymousClass34K;
import X.AnonymousClass34R;
import X.AnonymousClass4K2;
import X.AnonymousClass4SG;
import X.AnonymousClass5UK;
import X.AnonymousClass66R;
import X.AnonymousClass68W;
import X.AnonymousClass693;
import X.AnonymousClass6C6;
import X.C06560Yg;
import X.C106995aW;
import X.C107265az;
import X.C107445bK;
import X.C107695bk;
import X.C109325eR;
import X.C119185wZ;
import X.C154517dI;
import X.C15930sC;
import X.C162457s7;
import X.C18260x0;
import X.C18270x1;
import X.C18280x3;
import X.C18290x4;
import X.C18310x6;
import X.C18320x8;
import X.C46932cR;
import X.C56982ss;
import X.C627736r;
import X.C64333Db;
import X.C86604Kt;
import X.C86654Ky;
import X.C88834as;
import X.C89644eZ;
import X.C91564kN;
import X.C95814uZ;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.util.Log;

public final class ChatLockAuthActivity extends C89644eZ {
    public SwitchCompat A00;
    public C46932cR A01;
    public C106995aW A02;
    public AnonymousClass5UK A03;
    public boolean A04;
    public final C15930sC A05;
    public final C15930sC A06;
    public final C15930sC A07;
    public final C107265az A08;
    public final C107265az A09;
    public final AnonymousClass66R A0A;

    public void A5r() {
        if (!this.A04) {
            this.A04 = true;
            C88834as A2W = AnonymousClass4SG.A2W(this);
            C64333Db r2 = A2W.A4Z;
            AnonymousClass4SG.A3W(r2, this);
            C107695bk r1 = r2.A00;
            AnonymousClass4SG.A3Q(r2, r1, this, AnonymousClass4SG.A2t(r2, r1, this));
            this.A03 = (AnonymousClass5UK) r2.A4p.get();
            this.A02 = C86654Ky.A0V(r2);
            this.A01 = A2W.ABn();
        }
    }

    public ChatLockAuthActivity(int i) {
        this.A04 = false;
        AnonymousClass68W.A00(this, 23);
    }

    public static final void A0C(Bundle bundle, ChatLockAuthActivity chatLockAuthActivity) {
        boolean A1a = C86654Ky.A1a(bundle);
        if (bundle.getBoolean("ChatNowLockedDialogFragment_result_key")) {
            AnonymousClass4SG.A2g(chatLockAuthActivity).A0D(true);
            chatLockAuthActivity.A76(5);
            chatLockAuthActivity.startActivity(C627736r.A02(chatLockAuthActivity));
            Intent A072 = C18320x8.A07();
            A072.setClassName(chatLockAuthActivity.getPackageName(), "com.whatsapp.conversationslist.LockedConversationsActivity");
            A072.putExtra("extra_from_lock_chat_helper", true);
            chatLockAuthActivity.startActivity(A072);
            return;
        }
        AnonymousClass4SG.A2g(chatLockAuthActivity).A0D(A1a);
    }

    public static final void A0L(Bundle bundle, ChatLockAuthActivity chatLockAuthActivity) {
        boolean A1a = C86654Ky.A1a(bundle);
        if (bundle.getBoolean("LeakyCompanionDialogFragment_result_key")) {
            chatLockAuthActivity.A74();
        } else {
            AnonymousClass4SG.A2g(chatLockAuthActivity).A0D(A1a);
        }
    }

    public final void A74() {
        C95814uZ A052;
        AnonymousClass31A r0 = AnonymousClass4SG.A2g(this).A00;
        if (r0 != null && (A052 = r0.A05()) != null) {
            C106995aW r3 = this.A02;
            if (r3 != null) {
                r3.A08(this, new C91564kN(A052), this.A09, 0);
                return;
            }
            throw C18270x1.A0S("chatLockManager");
        }
    }

    public final void A75() {
        AnonymousClass31A r0 = AnonymousClass4SG.A2g(this).A00;
        boolean z = false;
        if (r0 != null) {
            z = C18310x6.A1W(r0.A0j ? 1 : 0);
        }
        C18260x0.A1E("ChatLockAuthActivity/update-ui ", AnonymousClass001.A0o(), z);
        SwitchCompat switchCompat = this.A00;
        if (switchCompat == null) {
            throw C18270x1.A0S("switchLock");
        }
        switchCompat.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
        switchCompat.setChecked(z);
        AnonymousClass693.A00(switchCompat, this, 2);
    }

    public final void A76(int i) {
        C95814uZ A052;
        AnonymousClass31A r0 = AnonymousClass4SG.A2g(this).A00;
        if (r0 != null && (A052 = r0.A05()) != null) {
            AnonymousClass5UK r2 = this.A03;
            if (r2 != null) {
                r2.A04(A052, C18290x4.A0Z(), (Integer) null, i);
                if (i == 5) {
                    AnonymousClass5UK r02 = this.A03;
                    if (r02 != null) {
                        r02.A00.A00("new_add_chat_count");
                        return;
                    }
                    throw C18270x1.A0S("chatLockLogger");
                }
                return;
            }
            throw C18270x1.A0S("chatLockLogger");
        }
    }

    public void onCreate(Bundle bundle) {
        C56982ss r1;
        C95814uZ A042;
        C95814uZ A052;
        super.onCreate(bundle);
        setContentView((int) R.layout.f8nameremoved);
        boolean hasExtra = getIntent().hasExtra("jid");
        AnonymousClass66R r3 = this.A0A;
        ChatLockAuthViewModel chatLockAuthViewModel = (ChatLockAuthViewModel) r3.getValue();
        if (hasExtra) {
            String stringExtra = getIntent().getStringExtra("jid");
            r1 = chatLockAuthViewModel.A06;
            A042 = AnonymousClass32Y.A08(stringExtra);
        } else {
            String stringExtra2 = getIntent().getStringExtra("gid");
            r1 = chatLockAuthViewModel.A06;
            A042 = AnonymousClass34R.A04(stringExtra2);
        }
        AnonymousClass31A A002 = C56982ss.A00(r1, A042);
        chatLockAuthViewModel.A00 = A002;
        if (A002 != null) {
            this.A00 = (SwitchCompat) C18280x3.A0E(this.A00, R.id.switch_lock);
            ((ChatLockAuthViewModel) r3.getValue()).A03.A0B(this, this.A07);
            TextView A0I = AnonymousClass0x2.A0I(this.A00, R.id.pref_desc);
            boolean A062 = this.A04.A06();
            int i = R.string.f11nameremoved;
            if (A062) {
                i = R.string.f11nameremoved;
            }
            A0I.setText(i);
            Toolbar toolbar = (Toolbar) C18290x4.A0L(this, R.id.toolbar);
            C86604Kt.A11(this, toolbar, this.A00, R.drawable.ic_back);
            toolbar.setTitle((CharSequence) getString(R.string.f11nameremoved));
            toolbar.setBackgroundResource(AnonymousClass34K.A00(C18290x4.A0F(toolbar)));
            toolbar.setNavigationOnClickListener(new C109325eR(this, 4));
            toolbar.A0J(this, R.style.f12nameremoved);
            setSupportActionBar(toolbar);
            A75();
            View A022 = C06560Yg.A02(this.A00, R.id.description);
            C162457s7.A0K(A022, "null cannot be cast to non-null type com.whatsapp.TextEmojiLabel");
            TextEmojiLabel textEmojiLabel = (TextEmojiLabel) A022;
            C46932cR r12 = this.A01;
            if (r12 != null) {
                r12.A00(textEmojiLabel, (AnonymousClass2FE) null);
                ((ChatLockAuthViewModel) r3.getValue()).A01.A0B(this, this.A05);
                ((ChatLockAuthViewModel) r3.getValue()).A02.A0B(this, this.A06);
                getSupportFragmentManager().A0j(new C107445bK(this, 4), this, "LeakyCompanionDialogFragment_request_key");
                ChatLockAuthViewModel chatLockAuthViewModel2 = (ChatLockAuthViewModel) r3.getValue();
                AnonymousClass31A r0 = chatLockAuthViewModel2.A00;
                if (r0 != null && (A052 = r0.A05()) != null) {
                    chatLockAuthViewModel2.A05.A04(A052, C18290x4.A0Z(), (Integer) null, 1);
                    return;
                }
                return;
            }
            throw C18270x1.A0S("chatLockLinkUtil");
        }
        Log.e("chatlockauthactivity/on_create: exiting due to null chat info");
        finish();
    }

    public void onResume() {
        super.onResume();
        A75();
    }

    public ChatLockAuthActivity() {
        this(0);
        this.A0A = C154517dI.A01(new C119185wZ(this));
        this.A07 = AnonymousClass6C6.A00(this, 89);
        this.A05 = AnonymousClass6C6.A00(this, 90);
        this.A06 = new AnonymousClass4K2(this, 21);
        this.A08 = new C107265az(this, 3);
        this.A09 = new C107265az(this, 4);
    }
}
