package com.whatsapp.calling.spam;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass0x7;
import X.AnonymousClass1Ha;
import X.AnonymousClass1Hf;
import X.AnonymousClass2F7;
import X.AnonymousClass2QX;
import X.AnonymousClass32Y;
import X.AnonymousClass3DZ;
import X.AnonymousClass3ZH;
import X.AnonymousClass49O;
import X.AnonymousClass4FS;
import X.AnonymousClass4HY;
import X.AnonymousClass5V0;
import X.AnonymousClass5ZU;
import X.C003203q;
import X.C08310eF;
import X.C107695bk;
import X.C18270x1;
import X.C18310x6;
import X.C18320x8;
import X.C19340zH;
import X.C29441ip;
import X.C54122oD;
import X.C54682p7;
import X.C56572sD;
import X.C56962sq;
import X.C60892zL;
import X.C619933b;
import X.C626936e;
import X.C64333Db;
import X.C64773Ex;
import X.C66543Lv;
import X.C69263Wi;
import X.C85804Hr;
import X.C86104Iv;
import X.C89644eZ;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.CheckBox;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;

public class CallSpamActivity extends C89644eZ {
    public AnonymousClass2F7 A00;
    public C64773Ex A01;
    public C56572sD A02;
    public boolean A03;
    public final AnonymousClass49O A04;

    public class ReportSpamOrBlockDialogFragment extends Hilt_CallSpamActivity_ReportSpamOrBlockDialogFragment {
        public long A00;
        public CheckBox A01;
        public C69263Wi A02;
        public C56962sq A03;
        public C29441ip A04;
        public C64773Ex A05;
        public AnonymousClass5ZU A06;
        public C54122oD A07;
        public C66543Lv A08;
        public AnonymousClass3ZH A09;
        public C54682p7 A0A;
        public UserJid A0B;
        public UserJid A0C;
        public C619933b A0D;
        public C60892zL A0E;
        public AnonymousClass2QX A0F;
        public AnonymousClass4FS A0G;
        public String A0H;
        public String A0I;
        public String A0J;
        public boolean A0K;
        public boolean A0L;
        public boolean A0M;

        public Dialog A1J(Bundle bundle) {
            String str;
            String A0n;
            Log.i("callspamactivity/createdialog");
            Bundle A0H2 = A0H();
            String string = A0H2.getString("caller_jid");
            AnonymousClass32Y r1 = UserJid.Companion;
            UserJid A0E2 = r1.A0E(string);
            C626936e.A06(A0E2);
            this.A0C = A0E2;
            this.A0B = r1.A0E(A0H2.getString("call_creator_jid"));
            AnonymousClass3ZH A072 = this.A05.A07(this.A0C);
            C626936e.A06(A072);
            this.A09 = A072;
            this.A0H = C18310x6.A0k(A0H2, "call_id");
            this.A00 = A0H2.getLong("call_duration", -1);
            this.A0K = A0H2.getBoolean("call_terminator", false);
            this.A0I = A0H2.getString("call_termination_reason");
            this.A0M = A0H2.getBoolean("call_video", false);
            if (this.A0L) {
                C54682p7 r2 = this.A0A;
                String str2 = this.A0J;
                UserJid userJid = this.A0C;
                C18270x1.A14(str2, userJid);
                r2.A01(userJid, str2, 0);
            }
            C85804Hr r7 = new C85804Hr(this, 29);
            C003203q A0R = A0R();
            C19340zH A002 = AnonymousClass5V0.A00(A0R);
            if (this.A0L) {
                A0n = C08310eF.A09(this).getString(R.string.f11nameremoved);
            } else {
                Object[] objArr = new Object[1];
                AnonymousClass3ZH r12 = this.A09;
                if (r12 != null) {
                    str = this.A06.A0H(r12);
                } else {
                    str = "";
                }
                A0n = AnonymousClass0x7.A0n(this, str, objArr, 0, R.string.f11nameremoved);
            }
            A002.A0g(A0n);
            A002.A0Y(r7, R.string.f11nameremoved);
            C19340zH.A07(A002, this, 30, R.string.f11nameremoved);
            if (this.A0L) {
                View A0H3 = C18310x6.A0H(LayoutInflater.from(A0R), R.layout.f8nameremoved);
                CheckBox checkBox = (CheckBox) A0H3.findViewById(R.id.block_contact);
                this.A01 = checkBox;
                checkBox.setChecked(true);
                A002.setView(A0H3);
            }
            return A002.create();
        }

        public void onCancel(DialogInterface dialogInterface) {
            super.onCancel(dialogInterface);
            if (this.A0L) {
                this.A0A.A00(this.A0C, this.A0J);
            }
        }
    }

    public void A5r() {
        if (!this.A03) {
            this.A03 = true;
            C64333Db A002 = AnonymousClass3DZ.A00(this);
            AnonymousClass1Hf.A2G(A002, this);
            C107695bk r1 = A002.A00;
            AnonymousClass1Ha.A23(A002, r1, r1, this);
            AnonymousClass1Ha.A24(A002, this);
            this.A02 = (C56572sD) A002.AWF.get();
            this.A01 = C64333Db.A26(A002);
            this.A00 = (AnonymousClass2F7) r1.A24.get();
        }
    }

    public CallSpamActivity(int i) {
        this.A03 = false;
        AnonymousClass4HY.A00(this, 27);
    }

    public void onCreate(Bundle bundle) {
        String str;
        UserJid A08;
        super.onCreate(bundle);
        Bundle extras = getIntent().getExtras();
        String str2 = null;
        if (extras == null || (A08 = AnonymousClass32Y.A08(extras.getString("caller_jid"))) == null) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("callspamactivity/create/not-creating/bad-jid: ");
            if (extras != null) {
                str2 = extras.getString("caller_jid");
            }
            str = AnonymousClass000.A0X(str2, A0o);
        } else {
            AnonymousClass3ZH A07 = this.A01.A07(A08);
            String string = extras.getString("call_id");
            if (A07 == null || string == null) {
                str = "callspamactivity/create/not-creating/null-args";
            } else {
                C18310x6.A0x(this, getWindow(), R.color.f5nameremoved);
                getWindow().addFlags(2621440);
                setContentView((int) R.layout.f8nameremoved);
                C18320x8.A16(findViewById(R.id.call_spam_report), extras, this, 25);
                C18320x8.A16(findViewById(R.id.call_spam_not_spam), A08, this, 26);
                C18320x8.A16(findViewById(R.id.call_spam_block), extras, this, 27);
                AnonymousClass2F7 r0 = this.A00;
                r0.A00.add(this.A04);
                return;
            }
        }
        Log.e(str);
        finish();
    }

    public void onDestroy() {
        super.onDestroy();
        AnonymousClass2F7 r0 = this.A00;
        r0.A00.remove(this.A04);
    }

    public void onStop() {
        super.onStop();
        finish();
    }

    public CallSpamActivity() {
        this(0);
        this.A04 = new C86104Iv(this, 1);
    }
}
