package com.whatsapp;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass1VX;
import X.AnonymousClass1fS;
import X.AnonymousClass326;
import X.AnonymousClass32Y;
import X.AnonymousClass33C;
import X.AnonymousClass33T;
import X.AnonymousClass3LP;
import X.C05610Ue;
import X.C111365hy;
import X.C117715sN;
import X.C1222963v;
import X.C172708Mj;
import X.C18260x0;
import X.C18300x5;
import X.C18310x6;
import X.C18320x8;
import X.C18550xs;
import X.C389229y;
import X.C55972rD;
import X.C56422rx;
import X.C57172tD;
import X.C615431g;
import X.C620733j;
import X.C621033m;
import X.C624735e;
import X.C626936e;
import X.C627336j;
import X.C627736r;
import X.C64333Db;
import X.C64773Ex;
import X.C66553Lw;
import X.C69183Wa;
import X.C95814uZ;
import X.C989053r;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.io.IOException;

public class VoiceMessagingService extends SearchActionVerificationClientService {
    public C1222963v A00;
    public C621033m A01;
    public C64773Ex A02;
    public C56422rx A03;
    public AnonymousClass33T A04;
    public C620733j A05;
    public AnonymousClass1VX A06;
    public AnonymousClass3LP A07;
    public C55972rD A08;
    public C69183Wa A09;
    public C989053r A0A;
    public final Handler A0B = AnonymousClass000.A0A();

    public void performAction(Intent intent, boolean z, Bundle bundle) {
        StringBuilder A0o;
        Uri uri;
        String obj;
        if (!z) {
            obj = "VoiceMessagingService/ignoring unverified voice message";
        } else {
            String stringExtra = intent.getStringExtra("com.google.android.voicesearch.extra.RECIPIENT_CONTACT_CHAT_ID");
            C95814uZ A0S = C18310x6.A0S(stringExtra);
            if ((A0S instanceof PhoneUserJid) || (A0S instanceof AnonymousClass1fS) || C627336j.A0K(A0S)) {
                AnonymousClass1VX r2 = this.A06;
                C56422rx r1 = this.A03;
                UserJid A032 = AnonymousClass32Y.A03(A0S);
                if (!C57172tD.A00(r1, r2, this.A07, A032)) {
                    if (!C615431g.A00(this.A03, this.A06, this.A07, A032, this.A09)) {
                        ClipData clipData = intent.getClipData();
                        if (clipData != null) {
                            if (clipData.getItemCount() == 1) {
                                ClipData.Item itemAt = clipData.getItemAt(0);
                                if (!(itemAt == null || (uri = itemAt.getUri()) == null)) {
                                    try {
                                        AnonymousClass33C r3 = new AnonymousClass33C();
                                        r3.A0F = this.A0A.A0E(uri);
                                        C18260x0.A1R(AnonymousClass001.A0o(), "VoiceMessagingService/sending verified voice message (voice); jid=", A0S);
                                        this.A0B.post(new C172708Mj(this, A0S, r3, 24));
                                        return;
                                    } catch (IOException e) {
                                        Log.w("VoiceMessagingService/IO Exception while trying to send voice message", e);
                                        return;
                                    }
                                }
                            } else if (clipData.getItemCount() > 1 || clipData.getItemCount() < 0) {
                                A0o = AnonymousClass001.A0o();
                                A0o.append("VoiceMessagingService/ignoring voice message with unexpected item count; itemCount=");
                                A0o.append(clipData.getItemCount());
                            }
                        }
                        String stringExtra2 = intent.getStringExtra("android.intent.extra.TEXT");
                        boolean isEmpty = TextUtils.isEmpty(stringExtra2);
                        A0o = AnonymousClass001.A0o();
                        if (isEmpty) {
                            A0o.append("VoiceMessagingService/ignoring voice message with empty contents; jid=");
                            A0o.append(A0S);
                            A0o.append("; text=");
                            A0o.append(stringExtra2);
                        } else {
                            C18260x0.A1R(A0o, "VoiceMessagingService/sending verified voice message (text); jid=", A0S);
                            this.A0B.post(new C117715sN(this, A0S, stringExtra2, 7));
                            return;
                        }
                    }
                }
                C626936e.A06(A0S);
                PendingIntent A002 = C624735e.A00(this, 2, C627736r.A0H(this, AnonymousClass326.A00(this.A02.A0A(A0S)), 0).putExtra("fromNotification", true), 0);
                C05610Ue A003 = C66553Lw.A00(this);
                A003.A0J = "err";
                A003.A03 = 1;
                A003.A0E(true);
                A003.A02(4);
                A003.A06 = 0;
                A003.A09 = A002;
                C18300x5.A14(this, A003, R.string.f11nameremoved);
                C18320x8.A0z(this, A003, R.string.f11nameremoved);
                AnonymousClass33T.A02(A003, R.drawable.notifybar);
                AnonymousClass33T.A03(A003, this.A04, 35);
                return;
            }
            A0o = AnonymousClass001.A0o();
            A0o.append("VoiceMessagingService/ignoring voice message directed at invalid jid; jid=");
            A0o.append(stringExtra);
            obj = A0o.toString();
        }
        Log.w(obj);
    }

    public void attachBaseContext(Context context) {
        Log.d("voicemessagingservice/hilt");
        C64333Db A012 = C389229y.A01(context);
        this.A06 = C64333Db.A4B(A012);
        this.A01 = C64333Db.A08(A012);
        this.A07 = A012.Akp();
        this.A08 = (C55972rD) A012.AJk.get();
        this.A02 = C64333Db.A26(A012);
        this.A0A = (C989053r) A012.AJl.get();
        this.A05 = A012.BsW();
        this.A09 = (C69183Wa) A012.AYu.get();
        this.A03 = (C56422rx) A012.AZn.get();
        this.A04 = A012.BsM();
        C111365hy AIb = A012.AcK.A00.AIb();
        this.A00 = AIb;
        super.attachBaseContext(new C18550xs(context, AIb, this.A05));
    }

    public void postForegroundNotification() {
        C05610Ue A002 = C66553Lw.A00(this);
        C18300x5.A14(this, A002, R.string.f11nameremoved);
        A002.A09 = C624735e.A00(this, 1, C627736r.A02(this), 0);
        A002.A03 = -2;
        AnonymousClass33T.A02(A002, R.drawable.notifybar);
        Notification A012 = A002.A01();
        C18260x0.A1R(AnonymousClass001.A0o(), "VoiceMessagingService/posting assistant notif:", A012);
        startForeground(19, A012);
    }
}
