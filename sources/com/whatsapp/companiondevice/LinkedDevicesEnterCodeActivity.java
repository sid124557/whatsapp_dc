package com.whatsapp.companiondevice;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass0x2;
import X.AnonymousClass0x9;
import X.AnonymousClass1Ha;
import X.AnonymousClass1Hf;
import X.AnonymousClass2EJ;
import X.AnonymousClass2JT;
import X.AnonymousClass2R8;
import X.AnonymousClass31C;
import X.AnonymousClass37B;
import X.AnonymousClass3Eo;
import X.AnonymousClass4BE;
import X.AnonymousClass4E3;
import X.AnonymousClass4FJ;
import X.AnonymousClass4FK;
import X.AnonymousClass4HY;
import X.AnonymousClass4K2;
import X.AnonymousClass5UC;
import X.AnonymousClass5V0;
import X.C005205m;
import X.C06560Yg;
import X.C103155Lt;
import X.C107575bX;
import X.C107695bk;
import X.C116985rC;
import X.C18260x0;
import X.C18280x3;
import X.C18310x6;
import X.C18330xA;
import X.C19340zH;
import X.C28881hv;
import X.C29041iB;
import X.C382626p;
import X.C385928h;
import X.C42742Pi;
import X.C44742Xh;
import X.C44752Xi;
import X.C45482a5;
import X.C46372bW;
import X.C48942fj;
import X.C58212ut;
import X.C60172y7;
import X.C626936e;
import X.C64333Db;
import X.C64693En;
import X.C66433Lk;
import X.C66653Mg;
import X.C71323bv;
import X.C85244Fm;
import X.C85924Id;
import X.C88744aj;
import X.C88834as;
import X.C88944b3;
import X.C89644eZ;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.URLSpan;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.qrcode.AgentDeviceLoginViewModel;
import com.whatsapp.util.Log;

public class LinkedDevicesEnterCodeActivity extends C89644eZ implements AnonymousClass4BE {
    public C116985rC A00;
    public C103155Lt A01;
    public C85244Fm A02;
    public AnonymousClass2JT A03;
    public C44742Xh A04;
    public C48942fj A05;
    public C28881hv A06;
    public C44752Xi A07;
    public C42742Pi A08;
    public AnonymousClass4E3 A09;
    public C46372bW A0A;
    public C29041iB A0B;
    public AnonymousClass2R8 A0C;
    public AnonymousClass31C A0D;
    public AgentDeviceLoginViewModel A0E;
    public AnonymousClass5UC A0F;
    public C66433Lk A0G;
    public Runnable A0H;
    public boolean A0I;
    public final C58212ut A0J;
    public final AnonymousClass4FJ A0K;
    public final AnonymousClass4FK A0L;

    public void onCreate(Bundle bundle) {
        AnonymousClass4E3 r0;
        String str;
        super.onCreate(bundle);
        C46372bW r1 = this.A0A;
        if (C66653Mg.A00(r1.A02.A0M)) {
            r0 = new AnonymousClass3Eo(r1.A00, r1.A01, r1.A03, r1.A04);
        } else {
            r0 = new C64693En();
        }
        this.A09 = r0;
        C44752Xi r3 = this.A07;
        AnonymousClass4FK r2 = this.A0L;
        C626936e.A01();
        r3.A01 = new C45482a5((AnonymousClass2EJ) r3.A00.A00.A01.A00.A4e.get(), r2);
        this.A0B.A06(this.A0K);
        this.A06.A06(this.A0J);
        setTitle(R.string.f11nameremoved);
        setContentView((int) R.layout.f8nameremoved);
        int A2I = AnonymousClass1Hf.A2I(this);
        TextEmojiLabel textEmojiLabel = (TextEmojiLabel) C005205m.A00(this, R.id.enter_code_description);
        AnonymousClass0x2.A14(this.A0D, textEmojiLabel);
        SpannableStringBuilder A002 = C18330xA.A00(AnonymousClass0x9.A0B(AnonymousClass002.A0F(this, this.A0G.A03("1324084875126592").toString(), new Object[A2I], 0, R.string.f11nameremoved)));
        URLSpan[] A1Z = C18310x6.A1Z(A002);
        if (A1Z != null) {
            for (URLSpan uRLSpan : A1Z) {
                A002.setSpan(new C88944b3(this, this.A02, this.A05, this.A08, uRLSpan.getURL()), A002.getSpanStart(uRLSpan), A002.getSpanEnd(uRLSpan), A002.getSpanFlags(uRLSpan));
            }
        }
        AnonymousClass0x2.A12(textEmojiLabel, this.A08);
        textEmojiLabel.setText(A002, TextView.BufferType.SPANNABLE);
        this.A0F = this.A01.A00(new C385928h());
        String stringExtra = getIntent().getStringExtra("prefilled_link_code");
        this.A0F.A02((LinearLayout) C06560Yg.A02(this.A00, R.id.enter_code_boxes), this, 8);
        if (!C107575bX.A0F(stringExtra)) {
            BPJ(stringExtra);
        }
        getIntent().getIntExtra("entry_point", A2I);
        getIntent().getStringExtra("agent_id");
        AgentDeviceLoginViewModel agentDeviceLoginViewModel = (AgentDeviceLoginViewModel) AnonymousClass0x9.A0H(this).A01(AgentDeviceLoginViewModel.class);
        this.A0E = agentDeviceLoginViewModel;
        AnonymousClass1Ha.A21(this, agentDeviceLoginViewModel.A05, 60);
        AnonymousClass1Ha.A21(this, this.A0E.A06, 61);
        C44742Xh r4 = this.A04;
        C60172y7 A003 = r4.A00.A00();
        String str2 = null;
        if (A003 != null) {
            str = A003.A02;
            str2 = A003.A01;
        } else {
            str = null;
        }
        r4.A00(2, str, str2);
    }

    public void A5r() {
        if (!this.A0I) {
            this.A0I = true;
            C88834as A0I2 = C18280x3.A0I(this);
            C64333Db r1 = A0I2.A4Z;
            AnonymousClass1Hf.A2G(r1, this);
            C107695bk r2 = r1.A00;
            AnonymousClass1Ha.A23(r1, r2, r2, this);
            AnonymousClass1Ha.A24(r1, this);
            this.A02 = C64333Db.A05(r1);
            this.A0D = C64333Db.A5u(r1);
            this.A0G = C64333Db.A8X(r1);
            this.A0C = (AnonymousClass2R8) r1.AWC.get();
            this.A0B = C64333Db.A3S(r1);
            this.A00 = C88744aj.A00;
            this.A05 = (C48942fj) r1.A5n.get();
            this.A01 = (C103155Lt) A0I2.A0e.get();
            this.A04 = r1.AiM();
            this.A03 = (AnonymousClass2JT) r2.AAz.get();
            this.A07 = (C44752Xi) r2.A2W.get();
            this.A06 = (C28881hv) r1.A5s.get();
            this.A0A = (C46372bW) r2.A3T.get();
            this.A08 = (C42742Pi) r1.A5t.get();
        }
    }

    public void BPJ(String str) {
        Log.d("LinkedDevicesEnterCodeActivity/onCodeEntered");
        A6Q(new AnonymousClass37B(this.A05.A00(), this), 0, R.string.f11nameremoved);
        this.A04.BkP(new C71323bv(23, str, this));
    }

    public void onDestroy() {
        C44752Xi r1 = this.A07;
        C626936e.A01();
        r1.A01 = null;
        this.A0B.A07(this.A0K);
        this.A06.A07(this.A0J);
        super.onDestroy();
    }

    public void onStop() {
        this.A08.A00 = false;
        super.onStop();
    }

    public LinkedDevicesEnterCodeActivity(int i) {
        this.A0I = false;
        AnonymousClass4HY.A00(this, 44);
    }

    public final void A74() {
        BjL();
        C626936e.A01();
        Runnable runnable = this.A0H;
        if (runnable != null) {
            this.A00.removeCallbacks(runnable);
        }
    }

    public final void A75(int i) {
        C19340zH A002 = AnonymousClass5V0.A00(this);
        C19340zH.A02(this, A002);
        A002.A0b(this, new AnonymousClass4K2(this, 62));
        int i2 = R.string.f11nameremoved;
        if (i != 1) {
            i2 = R.string.f11nameremoved;
        }
        A002.A0U(i2);
        int i3 = R.string.f11nameremoved;
        if (i != 1) {
            i3 = R.string.f11nameremoved;
            if (i != 2) {
                i3 = R.string.f11nameremoved;
            }
        }
        A002.A0T(i3);
        A002.A0S();
    }

    public void onStart() {
        super.onStart();
        C42742Pi r3 = this.A08;
        r3.A00 = true;
        C18260x0.A0q("CompanionRegWithLinkCodeNotificationManager/cancelNotification ", "CompanionRegWithLinkCodeNotificationManager/onEnterCodeActivityStart", AnonymousClass001.A0o());
        r3.A03.A05(54, "CompanionRegWithLinkCodeNotificationManager/onEnterCodeActivityStart");
    }

    public LinkedDevicesEnterCodeActivity() {
        this(0);
        this.A0L = new C382626p(this, 0);
        this.A0K = new C85924Id(this, 0);
        this.A0J = new C58212ut(this);
    }
}
