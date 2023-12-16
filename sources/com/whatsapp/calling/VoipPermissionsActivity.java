package com.whatsapp.calling;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass1VX;
import X.AnonymousClass24P;
import X.AnonymousClass32Y;
import X.AnonymousClass39J;
import X.AnonymousClass3ZF;
import X.AnonymousClass4FV;
import X.AnonymousClass4GJ;
import X.AnonymousClass5UF;
import X.AnonymousClass5VY;
import X.AnonymousClass5ZR;
import X.AnonymousClass68W;
import X.C009707r;
import X.C116865qz;
import X.C1230066r;
import X.C17190ui;
import X.C18260x0;
import X.C187958y5;
import X.C56762sW;
import X.C626936e;
import X.C64773Ex;
import X.C69263Wi;
import X.C86634Kw;
import android.content.Intent;
import android.os.Bundle;
import com.whatsapp.R;
import com.whatsapp.RequestPermissionActivity;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.List;

public class VoipPermissionsActivity extends C009707r implements AnonymousClass4GJ {
    public int A00;
    public int A01;
    public C69263Wi A02;
    public C1230066r A03;
    public C64773Ex A04;
    public AnonymousClass5ZR A05;
    public C56762sW A06;
    public AnonymousClass1VX A07;
    public AnonymousClass4FV A08;
    public GroupJid A09;
    public C187958y5 A0A;
    public AnonymousClass3ZF A0B;
    public String A0C;
    public String A0D;
    public List A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public final Object A0I;
    public volatile C116865qz A0J;

    public final Object generatedComponent() {
        if (this.A0J == null) {
            synchronized (this.A0I) {
                if (this.A0J == null) {
                    this.A0J = new C116865qz(this);
                }
            }
        }
        return this.A0J.generatedComponent();
    }

    public void onCreate(Bundle bundle) {
        Log.i("voip/VoipPermissionsActivity/onCreate");
        super.onCreate(bundle);
        Intent intent = getIntent();
        boolean booleanExtra = intent.getBooleanExtra("join_call_log", false);
        this.A01 = intent.getIntExtra("lobby_entry_point", 0);
        if (booleanExtra) {
            int intExtra = intent.getIntExtra("call_log_transaction_id", -1);
            String stringExtra = intent.getStringExtra("call_log_call_id");
            boolean booleanExtra2 = intent.getBooleanExtra("call_log_from_me", false);
            try {
                this.A0B = this.A06.A02(new AnonymousClass39J(intExtra, AnonymousClass32Y.A0A(intent.getStringExtra("call_log_user_jid")), stringExtra, booleanExtra2));
            } catch (AnonymousClass24P unused) {
                Log.e("voip/VoipPermissionsActivity/onCreate invalid jid");
                return;
            }
        } else {
            this.A0C = intent.getStringExtra("call_link_lobby_token");
            List A12 = C86634Kw.A12(intent, UserJid.class, "jids");
            this.A0E = A12;
            if (this.A0C == null) {
                C626936e.A0D(!A12.isEmpty(), "There must be at least one jid");
            }
            this.A00 = intent.getIntExtra("call_from", -1);
            if (intent.hasExtra("group_jid")) {
                this.A09 = GroupJid.Companion.A03(intent.getStringExtra("group_jid"));
            }
        }
        this.A0G = intent.getBooleanExtra("video_call", false);
        this.A0H = intent.getBooleanExtra("voice_chat", false);
        int intExtra2 = intent.getIntExtra("permission_type", -1);
        this.A0D = intent.getStringExtra("scheduled_id");
        if (intExtra2 == 0) {
            RequestPermissionActivity.A0e(this, this.A02, this.A05, this.A0G);
        } else if (intExtra2 != 1) {
            C18260x0.A0y("voip/VoipPermissionsActivity/onCreate unhandled permissionType: ", AnonymousClass001.A0o(), intExtra2);
        } else {
            Log.i("request/permission/checkPhonePermissionForVoipCall");
            AnonymousClass5UF r1 = new AnonymousClass5UF(this);
            r1.A01 = R.drawable.permission_call;
            r1.A02 = R.string.f11nameremoved;
            r1.A03 = R.string.f11nameremoved;
            r1.A0D = new String[]{"android.permission.READ_PHONE_STATE"};
            startActivityForResult(AnonymousClass5UF.A00(r1, true), 156);
        }
    }

    public VoipPermissionsActivity(int i) {
        this.A0I = AnonymousClass002.A0D();
        this.A0F = false;
        AnonymousClass68W.A00(this, 14);
    }

    public C17190ui B6u() {
        return AnonymousClass5VY.A00(this, super.B6u());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00ff, code lost:
        if (X.C627436k.A0J(r2) != false) goto L_0x0101;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onActivityResult(int r17, int r18, android.content.Intent r19) {
        /*
            r16 = this;
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "VoipPermissionsActivity onActivityResult got result: "
            r1.append(r0)
            r3 = r18
            r1.append(r3)
            java.lang.String r0 = " for request: "
            r1.append(r0)
            r4 = r17
            r1.append(r4)
            java.lang.String r0 = " data: "
            r2 = r19
            X.C18260x0.A1R(r1, r0, r2)
            r0 = 152(0x98, float:2.13E-43)
            r1 = 156(0x9c, float:2.19E-43)
            r6 = r16
            if (r4 == r0) goto L_0x0041
            if (r4 == r1) goto L_0x0041
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "VoipPermissionsActivity onActivityResult unhandled request: "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = " result: "
            X.C18260x0.A0y(r0, r1, r3)
            super.onActivityResult(r4, r3, r2)
        L_0x003d:
            r6.finish()
            return
        L_0x0041:
            r0 = -1
            if (r3 != r0) goto L_0x0107
            X.3ZF r0 = r6.A0B
            r11 = 1
            if (r0 != 0) goto L_0x00e3
            java.util.ArrayList r8 = X.AnonymousClass001.A0s()
            java.util.List r0 = r6.A0E
            java.util.Iterator r3 = r0.iterator()
        L_0x0053:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0073
            X.4uZ r2 = X.C18300x5.A0P(r3)
            X.3Ex r0 = r6.A04
            X.3ZH r0 = r0.A07(r2)
            if (r0 == 0) goto L_0x0069
            r8.add(r0)
            goto L_0x0053
        L_0x0069:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "VoipPermissionsActivity/unable to find contact:"
            X.C18260x0.A1P(r1, r0, r2)
            goto L_0x0053
        L_0x0073:
            java.lang.String r0 = r6.A0C
            if (r0 == 0) goto L_0x0092
            java.lang.String r0 = "VoipPermissionsActivity onActivityResult starting call link lobby"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            int r0 = r6.A01
            if (r0 != 0) goto L_0x0081
            r11 = 0
        L_0x0081:
            java.lang.String r0 = "Valid call link lobby entry point required"
            X.C626936e.A0D(r11, r0)
            X.66r r3 = r6.A03
            java.lang.String r2 = r6.A0C
            boolean r1 = r6.A0G
            int r0 = r6.A01
            r3.BhT(r6, r2, r0, r1)
            goto L_0x003d
        L_0x0092:
            java.lang.String r0 = r6.A0D
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x00b9
            X.1VX r0 = r6.A07
            boolean r0 = X.C627436k.A0I(r0)
            if (r0 == 0) goto L_0x00b9
            java.lang.String r0 = "VoipPermissionsActivity onActivityResult start precall lobby"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.66r r9 = r6.A03
            boolean r1 = r6.A0G
            com.whatsapp.jid.GroupJid r11 = r6.A09
            java.lang.String r12 = r6.A0D
            int r0 = r6.A01
            r10 = r6
            r13 = r8
            r14 = r0
            r15 = r1
            r9.Bps(r10, r11, r12, r13, r14, r15)
            goto L_0x003d
        L_0x00b9:
            boolean r0 = r6.A0H
            if (r0 == 0) goto L_0x00d1
            java.lang.String r0 = "VoipPermissionsActivity onActivityResult starting voice chat"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.66r r5 = r6.A03
            int r9 = r6.A00
            com.whatsapp.jid.GroupJid r7 = r6.A09
            X.5jl r5 = (X.C112455jl) r5
            r10 = 0
            r12 = r10
            r5.BL0(r6, r7, r8, r9, r10, r11, r12)
            goto L_0x003d
        L_0x00d1:
            java.lang.String r0 = "VoipPermissionsActivity onActivityResult starting call"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.66r r5 = r6.A03
            int r9 = r6.A00
            boolean r10 = r6.A0G
            com.whatsapp.jid.GroupJid r7 = r6.A09
            r5.Bpm(r6, r7, r8, r9, r10)
            goto L_0x003d
        L_0x00e3:
            int r0 = r6.A01
            if (r0 != 0) goto L_0x00e8
            r11 = 0
        L_0x00e8:
            java.lang.String r0 = "Valid re-join lobby entry point required"
            X.C626936e.A0D(r11, r0)
            X.66r r5 = r6.A03
            X.3ZF r4 = r6.A0B
            int r3 = r6.A01
            X.1VX r2 = r6.A07
            int r1 = r4.A0H
            r0 = 2
            if (r1 != r0) goto L_0x0101
            boolean r1 = X.C627436k.A0J(r2)
            r0 = 1
            if (r1 == 0) goto L_0x0102
        L_0x0101:
            r0 = 0
        L_0x0102:
            r5.BJS(r6, r4, r3, r0)
            goto L_0x003d
        L_0x0107:
            if (r4 != r1) goto L_0x003d
            if (r18 != 0) goto L_0x003d
            X.1X4 r1 = new X.1X4
            r1.<init>()
            java.lang.String r0 = "voip_call_fail_phone_perm_denied"
            r1.A00 = r0
            X.4FV r0 = r6.A08
            r0.BhD(r1)
            goto L_0x003d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.VoipPermissionsActivity.onActivityResult(int, int, android.content.Intent):void");
    }

    public VoipPermissionsActivity() {
        this(0);
        this.A0E = AnonymousClass001.A0s();
        this.A0C = null;
    }
}
