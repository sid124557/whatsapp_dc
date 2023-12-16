package X;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.BaseBundle;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.whatsapp.R;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.service.GcmFGService;
import com.whatsapp.util.Log;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* renamed from: X.0yT  reason: invalid class name and case insensitive filesystem */
public final class C18920yT extends Handler implements AnonymousClass4FQ {
    public final /* synthetic */ C66523Lt A00;

    public void Bfs(Message message) {
        message.what = 5;
        sendMessage(message);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C18920yT(Looper looper, C66523Lt r2) {
        super(looper);
        this.A00 = r2;
    }

    public void BPE() {
        Log.d("MessageHandler/onClockWrong/send");
        sendEmptyMessage(6);
    }

    public void BPl(Integer num, int i, boolean z, boolean z2) {
        Log.d("MessageHandler/onConnected/send");
        C18290x4.A1C(this, new AnonymousClass2RR(this, num, i, z, z2), 3);
    }

    public void BPm() {
        Log.d("MessageHandler/onConnecting/send");
        sendEmptyMessage(1);
    }

    public void BPp(AnonymousClass4EW r2) {
        Log.d("MessageHandler/onConnectionThreadReady/send");
        C18290x4.A1C(this, r2, 0);
    }

    public void BRH(boolean z) {
        Log.d("MessageHandler/onDisconnected/send");
        obtainMessage(4, z ? 1 : 0, 0).sendToTarget();
    }

    public void BVv(AnonymousClass24H r2) {
        Log.d("MessageHandler/onLoginFailed/send");
        C18290x4.A1C(this, r2, 2);
    }

    public void BZL() {
        Log.d("MessageHandler/onQuit/send");
        sendEmptyMessage(9);
    }

    public void Bbn() {
        Log.d("MessageHandler/onSoftwareHasExpired/send");
        sendEmptyMessage(7);
    }

    public void handleMessage(Message message) {
        AnonymousClass317 r0;
        String str;
        C84694Di r1;
        C95814uZ r4;
        AnonymousClass2SS r02;
        int i;
        C72173dI r03;
        Runnable r8;
        Message message2 = message;
        switch (message2.what) {
            case 0:
                Log.d("MessageHandler/ConnectionThreadHandler/recv/sending_channel_ready");
                C66523Lt r2 = this.A00;
                AnonymousClass4EW r3 = (AnonymousClass4EW) message2.obj;
                if (!r2.A12) {
                    Log.i("MessageHandler/handleSendingChannelReady/not started");
                    return;
                }
                r2.A08 = r3;
                C61032zb r12 = r2.A0s;
                r12.A00 = r2;
                C154317cy.A00(r12.A01, r12.A08.A00, new IntentFilter("com.whatsapp.MessageHandler.LOGOUT_ACTION"), (Handler) null, C58152un.A0C, false);
                AnonymousClass31C r13 = r2.A0d;
                AnonymousClass2WX r04 = new AnonymousClass2WX(r2);
                r13.A0D = r3;
                r13.A00 = r04;
                Log.i("MessageHandler/handleConnectionThreadReady connectionready");
                AnonymousClass4F9 r42 = r2.A0g;
                r2.A01 = r42.B6U();
                C18320x8.A0x(r2.A0D, r2.A0T.A00, "com.whatsapp.MessageHandler.CONNECTIVITY_RETRY_ACTION", false);
                HandlerThread handlerThread = new HandlerThread("MessageHandler Connectivity Handler");
                r2.A04 = handlerThread;
                handlerThread.start();
                r42.Bpg(new Handler(r2.A04.getLooper()));
                r2.A0H(true, false, false);
                C29411im r14 = r2.A0K;
                r14.A06 = true;
                r14.A03 = -1;
                AnonymousClass30H r05 = r2.A09;
                if (r05 != null) {
                    r05.A01();
                }
                r2.A0X.A01(r2.A0N.A0A());
                return;
            case 1:
                Log.d("MessageHandler/ConnectionThreadHandler/recv/connecting");
                C29411im r15 = this.A00.A09.A0C;
                r15.A04 = 1;
                r15.A00++;
                C626936e.A01();
                Iterator A03 = C61102zi.A03(r15);
                while (A03.hasNext()) {
                    ((AnonymousClass4F2) A03.next()).BUC();
                }
                return;
            case 2:
                Log.d("MessageHandler/ConnectionThreadHandler/recv/login_failed");
                C66523Lt r5 = this.A00;
                r5.A0w.set(false);
                AnonymousClass24H r6 = (AnonymousClass24H) message2.obj;
                synchronized (r5.A0u) {
                    int i2 = r6.type;
                    boolean z = false;
                    if (i2 == 4 || i2 == 6 || i2 == 8) {
                        C18260x0.A0z("MessageHandler/login failed with reason: ", AnonymousClass001.A0o(), i2);
                        r5.A0C = true;
                        if (r6.type == 6) {
                            z = true;
                        }
                        r5.A0E(z);
                    } else {
                        AnonymousClass30H r7 = r5.A09;
                        Context context = r7.A0M.A00;
                        C116985rC r16 = r7.A01;
                        if (r16.A07()) {
                            C65213Gq r17 = (C65213Gq) r16.A04();
                            if (AnonymousClass2OK.A00(r17.A01)) {
                                Log.d("InstrumentationObserverImpl/onAccountFailure");
                                r17.A02.A01();
                            }
                        }
                        int i3 = r6.type;
                        if (i3 != 0) {
                            if (i3 != 5) {
                                if (i3 == 7) {
                                    Log.i("MessageHandlerCallback/onMessageHandlerLoginFailed/perm-banned");
                                    r7.A03.A0B();
                                    r7.A0y.A00();
                                    r7.A0o.A08(true);
                                    r7.A04(r6);
                                    if (!r7.A07.A0Y()) {
                                        C43792Tm r122 = (C43792Tm) r7.A0z.get();
                                        int i4 = r6.violationType;
                                        String str2 = r6.banAppealToken;
                                        C18260x0.A0y("banmanager/startPermanentBanFlow vt: ", AnonymousClass001.A0o(), i4);
                                        if (i4 <= 0 || !r122.A06.A0Y(C58422vE.A02, 622) || !r122.A08.A02()) {
                                            Log.i("banmanager/startPermanentBanFlow/notify-or-show-login-failure-overlay-alert");
                                            r0 = r122.A07;
                                        } else {
                                            C614930z r18 = r122.A02;
                                            Log.i("AccountSwitcher/updateBannedAccountSharedPrefs");
                                            C56972sr r10 = r18.A06;
                                            if (r10.A0H() == null || C56972sr.A04(r10) == null) {
                                                Log.i("AccountSwitcher/updateBannedAccountSharedPrefs/me manager is null");
                                            } else {
                                                AnonymousClass33p r9 = r18.A0A;
                                                C27981fH A0H = r10.A0H();
                                                String str3 = null;
                                                if (A0H != null) {
                                                    str = A0H.getRawString();
                                                } else {
                                                    str = null;
                                                }
                                                C18270x1.A0j(C18270x1.A03(r9), "account_switching_banned_account_lid", str);
                                                PhoneUserJid A04 = C56972sr.A04(r10);
                                                if (A04 != null) {
                                                    str3 = A04.user;
                                                }
                                                C18270x1.A0j(C18270x1.A03(r9), "account_switching_banned_account_phone_user_jid", str3);
                                            }
                                            AnonymousClass317 r19 = r122.A07;
                                            r19.A01();
                                            r19.A0B(9, true);
                                            AnonymousClass33p r72 = r122.A05;
                                            C18270x1.A0l(C18270x1.A03(r72), "support_ban_appeal_user_banned_from_chat_disconnect", true);
                                            C18270x1.A0l(C18270x1.A03(r72), "support_ban_appeal_screen_before_verification", true);
                                            r122.A01.A02();
                                            r122.A00.BkS(new C70473aY(r122, context, str2, i4, 13));
                                            r5.A0Z.A00(true);
                                            r5.A0c.A01(r6);
                                            C613430h r110 = r5.A0j;
                                            AnonymousClass4EW r06 = r5.A08;
                                            z = true;
                                            r110.A06(z);
                                        }
                                    }
                                    Log.i("MessageHandlerCallback/handleLoginFailedOnCompanion/companion logged out");
                                    r7.A0x.BkP(new C70013Zn(r7, 28));
                                    r7.A05.A0S(new C70013Zn(r7, 30));
                                    r5.A0Z.A00(true);
                                    r5.A0c.A01(r6);
                                    C613430h r1102 = r5.A0j;
                                    AnonymousClass4EW r062 = r5.A08;
                                    z = true;
                                    r1102.A06(z);
                                } else if (i3 != 9) {
                                    if (i3 == 11) {
                                        Log.i("MessageHandlerCallback/onMessageHandlerLoginFailed/wf-underage-account");
                                        r7.A03.A0B();
                                        r7.A0y.A00();
                                        r7.A0o.A08(true);
                                        r7.A04(r6);
                                        if (!r7.A07.A0Y()) {
                                            Object obj = r7.A10.get();
                                            C626936e.A06(obj);
                                            AnonymousClass32N r82 = (AnonymousClass32N) obj;
                                            int i5 = r6.violationType;
                                            String str4 = r6.violationReason;
                                            int i6 = r6.violationSourceAcct;
                                            StringBuilder A0g = C18280x3.A0g(context, 0);
                                            A0g.append("WfacManager/startWfacFlow violationType: ");
                                            A0g.append(i5);
                                            A0g.append(" violationReason: ");
                                            A0g.append(str4);
                                            AnonymousClass356.A01(AnonymousClass000.A0Y(" violationSourceAccount: ", A0g, i6));
                                            StringBuilder A0o = AnonymousClass001.A0o();
                                            A0o.append("WfacManager/startWfacBanLogging launchSource {");
                                            A0o.append(3);
                                            A0o.append("} vs {");
                                            A0o.append(i6);
                                            AnonymousClass356.A01(AnonymousClass000.A0d(A0o));
                                            if (i5 != 14 || !C162457s7.A0P(str4, "u13_checkpoint")) {
                                                AnonymousClass356.A03("WfacManager/startWfacFlow/notify-or-show-login-failure-overlay-alert");
                                                r0 = r82.A04;
                                            } else {
                                                AnonymousClass317 r111 = r82.A04;
                                                r111.A01();
                                                r111.A0B(21, true);
                                                r82.A01.A02();
                                                r82.A00.BkS(new C71463c9(context, r82, str4, i6));
                                            }
                                        }
                                        Log.i("MessageHandlerCallback/handleLoginFailedOnCompanion/companion logged out");
                                        r7.A0x.BkP(new C70013Zn(r7, 28));
                                        r7.A05.A0S(new C70013Zn(r7, 30));
                                    } else if (i3 == 2) {
                                        int i7 = r6.code;
                                        int i8 = r6.expire_time_out;
                                        String str5 = r6.banMessage;
                                        String str6 = r6.faqUrl;
                                        Intent A07 = C18320x8.A07();
                                        A07.setClassName(context.getPackageName(), "com.whatsapp.spamwarning.SpamWarningActivity");
                                        if (i7 >= 100) {
                                            A07.putExtra("spam_warning_reason_key", i7);
                                        }
                                        A07.putExtra("expiry_in_seconds", i8);
                                        if (!TextUtils.isEmpty(str5)) {
                                            A07.putExtra("spam_warning_message_key", str5);
                                        }
                                        if (!TextUtils.isEmpty(str6)) {
                                            A07.putExtra("faq_url_key", str6);
                                        }
                                        A07.setFlags(268435456);
                                        AnonymousClass33p r102 = r7.A0N;
                                        C18270x1.A0l(C18270x1.A03(r102), "spam_banned", true);
                                        C18260x0.A0M(r102, "spam_banned_expiry_timestamp", System.currentTimeMillis() + C18290x4.A0A(r6.expire_time_out));
                                        C18260x0.A1D("wa-shared-prefs/setspambanned ", AnonymousClass001.A0o(), true);
                                        context.startActivity(A07);
                                    } else if (i3 != 3) {
                                        StringBuilder A0o2 = AnonymousClass001.A0o();
                                        A0o2.append("message-handler-callback/login-failed LoginFailureException type: ");
                                        A0o2.append(i3);
                                        A0o2.append(" server error code: ");
                                        C18270x1.A1F(A0o2, r6.serverErrorCode);
                                    } else {
                                        long j = r6.expiration_time;
                                        if (j <= 0) {
                                            j = r7.A0L.A0H();
                                        }
                                        C18270x1.A0i(C18270x1.A03(r7.A0N), "software_forced_expiration", j);
                                        r7.A03();
                                    }
                                    r5.A0Z.A00(true);
                                    r5.A0c.A01(r6);
                                    C613430h r11022 = r5.A0j;
                                    AnonymousClass4EW r0622 = r5.A08;
                                    if (r0622 != null && r0622.BFQ()) {
                                        z = true;
                                    }
                                    r11022.A06(z);
                                } else {
                                    Log.i("MessageHandlerCallback/onMessageHandlerLoginFailed/not authorized");
                                    AnonymousClass4FS r83 = r7.A0x;
                                    C621133n r112 = r7.A0P;
                                    Objects.requireNonNull(r112);
                                    C70013Zn.A01(r83, r112, 31);
                                }
                                r0.A06();
                                r5.A0Z.A00(true);
                                r5.A0c.A01(r6);
                                C613430h r110222 = r5.A0j;
                                AnonymousClass4EW r06222 = r5.A08;
                                z = true;
                                r110222.A06(z);
                            } else {
                                Log.i("MessageHandlerCallback/onMessageHandlerLoginFailed/underage-account");
                                C18270x1.A0l(C18270x1.A03(r7.A0N), "underage_account_banned", true);
                                C18260x0.A1D("wa-shared-prefs/setUnderageAccountBanned ", AnonymousClass001.A0o(), true);
                                r7.A0o.A08(true);
                                if (!r7.A07.A0Y()) {
                                    Intent A01 = r7.A0p.A01();
                                    A01.putExtra("com.whatsapp.registration.RegisterPhone.show_underage_account_ban_dialog", true);
                                    context.startActivity(A01);
                                    r5.A0Z.A00(true);
                                    r5.A0c.A01(r6);
                                    C613430h r1102222 = r5.A0j;
                                    AnonymousClass4EW r062222 = r5.A08;
                                    z = true;
                                    r1102222.A06(z);
                                }
                                Log.i("MessageHandlerCallback/handleLoginFailedOnCompanion/companion logged out");
                                r7.A0x.BkP(new C70013Zn(r7, 28));
                                r7.A05.A0S(new C70013Zn(r7, 30));
                                r5.A0Z.A00(true);
                                r5.A0c.A01(r6);
                                C613430h r11022222 = r5.A0j;
                                AnonymousClass4EW r0622222 = r5.A08;
                                z = true;
                                r11022222.A06(z);
                            }
                        }
                        Log.i("MessageHandlerCallback/onMessageHandlerLoginFailed/exception-password");
                        r7.A0o.A08(true);
                        r7.A04(r6);
                        if (!r7.A07.A0Y()) {
                            C18270x1.A0l(C55262q4.A00(r7.A0K), "previously_logged_out_from_primary", true);
                            r7.A0p.A06();
                            if (C72303dV.A00(r7.A0R)) {
                                C70013Zn.A01(r7.A0x, r7, 32);
                            }
                            r5.A0Z.A00(true);
                            r5.A0c.A01(r6);
                            C613430h r110222222 = r5.A0j;
                            AnonymousClass4EW r06222222 = r5.A08;
                            z = true;
                            r110222222.A06(z);
                        }
                        Log.i("MessageHandlerCallback/handleLoginFailedOnCompanion/companion logged out");
                        r7.A0x.BkP(new C70013Zn(r7, 28));
                        r7.A05.A0S(new C70013Zn(r7, 30));
                        r5.A0Z.A00(true);
                        r5.A0c.A01(r6);
                        C613430h r1102222222 = r5.A0j;
                        AnonymousClass4EW r062222222 = r5.A08;
                        z = true;
                        r1102222222.A06(z);
                    }
                }
                return;
            case 3:
                StringBuilder A0o3 = AnonymousClass001.A0o();
                A0o3.append("MessageHandler/ConnectionThreadHandler/recv/connected; sessionId=");
                A0o3.append(message2.arg1);
                A0o3.append(" ipV6=");
                C18260x0.A1F(A0o3, message2.arg2);
                C66523Lt r43 = this.A00;
                r43.A0w.set(false);
                Object obj2 = message2.obj;
                C626936e.A06(obj2);
                AnonymousClass2RR r07 = (AnonymousClass2RR) obj2;
                C66523Lt.A02(r43, r07.A01, r07.A00, r07.A02, r07.A03);
                return;
            case 4:
                Log.d("MessageHandler/ConnectionThreadHandler/recv/disconnected");
                C66523Lt.A03(this.A00, C18310x6.A1W(message2.arg1));
                return;
            case 5:
                AnonymousClass2U7 r92 = this.A00.A09.A0d;
                int i9 = message2.arg1;
                if (i9 == 5) {
                    BaseBundle baseBundle = (BaseBundle) message2.obj;
                    r4 = (C95814uZ) AnonymousClass32W.A00(baseBundle.getString("jid"));
                    String string = baseBundle.getString("pushName");
                    StringBuilder A0o4 = AnonymousClass001.A0o();
                    C18280x3.A1I(A0o4, "app/xmpp/recv/handle_available ", r4);
                    C18260x0.A1L(A0o4, string);
                    AnonymousClass3ZH A012 = r92.A06.A01(r4);
                    AnonymousClass3S3 r32 = r92.A0C;
                    boolean z2 = true;
                    if (!C627336j.A0K(r4) && ((r02 = (AnonymousClass2SS) r32.A06.get(r4)) == null || r02.A04 != 1)) {
                        z2 = false;
                    }
                    HashMap hashMap = r32.A06;
                    AnonymousClass2SS A0R = C18290x4.A0R(r4, hashMap);
                    A0R.A04 = 1;
                    A0R.A01 = 1;
                    C18290x4.A0R(r4, hashMap).A02 = 1;
                    if (!z2 && A012.A0H != null) {
                        AnonymousClass32O r08 = r92.A02;
                        Object obj3 = r4;
                        Handler handler = r08.A00;
                        HashMap hashMap2 = r08.A06;
                        Object obj4 = hashMap2.get(r4);
                        if (obj4 != null) {
                            obj3 = obj4;
                        } else {
                            hashMap2.put(r4, r4);
                        }
                        handler.removeMessages(2, obj3);
                    }
                } else if (i9 == 12) {
                    Log.d("app/xmpp/recv/handle_remove_account");
                    r92.A03.A08();
                    return;
                } else if (i9 == 24) {
                    Bundle data = message2.getData();
                    AnonymousClass39T r52 = (AnonymousClass39T) data.getParcelable("stanzaKey");
                    byte[] byteArray = data.getByteArray("jidHash");
                    C59812xW r44 = (C59812xW) message2.obj;
                    C56202rb A013 = r92.A0B.A01(2, r52.A00);
                    if (A013 != null) {
                        A013.A03(3);
                    }
                    C60982zU r09 = new C60982zU(AnonymousClass227.A0J);
                    r09.A02 = true;
                    r92.A05.A03(C60982zU.A00(r09, r44, byteArray), true);
                    r92.A0A.A01(r52);
                    return;
                } else if (i9 == 64) {
                    BaseBundle baseBundle2 = (BaseBundle) message2.obj;
                    r4 = (C95814uZ) AnonymousClass32W.A00(baseBundle2.getString("jid"));
                    String string2 = baseBundle2.getString("pushName");
                    long j2 = baseBundle2.getLong("lastSeen");
                    String string3 = baseBundle2.getString("presence");
                    StringBuilder A0o5 = AnonymousClass001.A0o();
                    C18280x3.A1I(A0o5, "app/xmpp/recv/handle_unavailable ", r4);
                    A0o5.append(string2);
                    A0o5.append(" last:");
                    A0o5.append(j2);
                    C18260x0.A0s(" presence: ", string3, A0o5);
                    r92.A06.A01(r4);
                    if (string3 == null) {
                        i = 1;
                    } else {
                        i = 2;
                        if (string3.equals("deny")) {
                            i = 0;
                        }
                    }
                    AnonymousClass3S3 r010 = r92.A0C;
                    GroupJid A032 = r010.A03(r4, i, j2);
                    C18290x4.A0R(r4, r010.A06).A02 = 1;
                    if (A032 != null) {
                        r92.A04.A08(A032);
                    }
                } else if (i9 == 85) {
                    r92.A0A.A01((AnonymousClass39T) ((Bundle) message2.obj).getParcelable("stanzaKey"));
                    return;
                } else if (i9 == 88) {
                    BaseBundle baseBundle3 = (BaseBundle) message2.obj;
                    C95814uZ r33 = (C95814uZ) AnonymousClass32W.A00(baseBundle3.getString("jid"));
                    String string4 = baseBundle3.getString("pushName");
                    StringBuilder A0o6 = AnonymousClass001.A0o();
                    C18280x3.A1I(A0o6, "app/xmpp/recv/handle_unsubscribe", r33);
                    C18260x0.A1L(A0o6, string4);
                    r92.A06.A01(r33);
                    AnonymousClass2SS A0R2 = C18290x4.A0R(r33, r92.A0C.A06);
                    A0R2.A02 = 0;
                    A0R2.A04 = 0;
                    r92.A04.A08(r33);
                    return;
                } else if (i9 == 158) {
                    int i10 = message2.getData().getInt("errorCode");
                    C66523Lt r113 = r92.A09;
                    Log.d("MessageHandler/onConnectionStreamError");
                    if (i10 >= 500 && i10 < 600) {
                        r113.A0C = true;
                        r113.A0E(false);
                        return;
                    }
                    return;
                } else if (i9 != 237) {
                    if (i9 == 20) {
                        BaseBundle baseBundle4 = (BaseBundle) message2.obj;
                        String string5 = baseBundle4.getString("jid");
                        AnonymousClass32W r114 = Jid.Companion;
                        Jid A033 = r114.A03(string5);
                        Jid A034 = r114.A03(baseBundle4.getString("author"));
                        Jid A035 = r114.A03(baseBundle4.getString("author_pn"));
                        int i11 = baseBundle4.getInt("media");
                        r03 = r92.A0E;
                        r8 = new C70623an(r92, A034, A035, A033, i11, 7);
                    } else if (i9 == 21) {
                        BaseBundle baseBundle5 = (BaseBundle) message2.obj;
                        String string6 = baseBundle5.getString("jid");
                        AnonymousClass32W r115 = Jid.Companion;
                        Jid A036 = r115.A03(string6);
                        Jid A037 = r115.A03(baseBundle5.getString("author"));
                        Jid A038 = r115.A03(baseBundle5.getString("author_pn"));
                        r03 = r92.A0E;
                        r8 = new C70513ac(r92, A037, A038, A036, 9);
                    } else {
                        return;
                    }
                    r03.execute(r8);
                    return;
                } else {
                    r92.A00.A0A("SmaxInvalidError", false, "[WA Debug] Server sent smax-invalid (code:479)");
                    return;
                }
                r92.A04.A08(r4);
                return;
            case 6:
                Log.d("MessageHandler/ConnectionThreadHandler/recv/clock-wrong");
                C66523Lt r116 = this.A00;
                r116.A0w.set(false);
                AnonymousClass30H r45 = r116.A09;
                Log.i("message-handler-callback/handlerconnected/handleclockwrong");
                C54622p1 r117 = r45.A0r;
                Context context2 = r45.A0M.A00;
                r117.A01(context2, GcmFGService.class);
                AnonymousClass4FU r22 = r45.A05.A00;
                if (r22 == null || !C621533t.A02(r22, r45.A0c, r45.A0g)) {
                    StringBuilder A0o7 = AnonymousClass001.A0o();
                    A0o7.append("message-handler-callback/handlerconnected/displayclockwrong/notification ");
                    A0o7.append(new Date());
                    C18290x4.A1Q(A0o7, " ");
                    AnonymousClass0x2.A19(A0o7);
                    r45.A0u.A01(context2.getString(R.string.f11nameremoved), context2.getString(R.string.f11nameremoved), 8, false);
                    r45.A0g.A03 = true;
                    return;
                }
                return;
            case 7:
                Log.d("MessageHandler/ConnectionThreadHandler/recv/software-expired");
                C66523Lt r118 = this.A00;
                r118.A0w.set(false);
                AnonymousClass30H r34 = r118.A09;
                Log.i("message-handler-callback/handlerconnected/handlesoftwareexpired");
                r34.A0r.A01(r34.A0M.A00, GcmFGService.class);
                r34.A03();
                return;
            case 8:
                StringBuilder A0o8 = AnonymousClass001.A0o();
                A0o8.append("MessageHandler/ConnectionThreadHandler/recv/iq-response; id=");
                C18260x0.A0m(message2.obj, A0o8);
                C50122hf r119 = this.A00.A0c;
                Object obj5 = message2.obj;
                Map map = r119.A06;
                synchronized (map) {
                    r1 = (C84694Di) map.remove(obj5);
                }
                if (r1 != null) {
                    r1.BQt((Object) null);
                    return;
                }
                return;
            case 9:
                Log.d("MessageHandler/ConnectionThreadHandler/recv/quit");
                AnonymousClass30H r011 = this.A00.A09;
                if (r011 != null) {
                    r011.A02();
                    return;
                }
                return;
            default:
                return;
        }
    }

    public void BUl(String str) {
        C18260x0.A0q("MessageHandler/onIqResponse/send; id=", str, AnonymousClass001.A0o());
        C18290x4.A1C(this, str, 8);
    }
}
