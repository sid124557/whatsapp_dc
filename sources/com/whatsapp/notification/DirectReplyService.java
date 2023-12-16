package com.whatsapp.notification;

import X.AnonymousClass001;
import X.AnonymousClass0M4;
import X.AnonymousClass0RM;
import X.AnonymousClass326;
import X.AnonymousClass3XI;
import X.AnonymousClass3ZH;
import X.C03950Me;
import X.C04350Nw;
import X.C05480Tm;
import X.C107635bd;
import X.C108845de;
import X.C113905mB;
import X.C18260x0;
import X.C18280x3;
import X.C18290x4;
import X.C18320x8;
import X.C29431io;
import X.C32461qT;
import X.C54122oD;
import X.C60152y5;
import X.C619933b;
import X.C620633i;
import X.C621033m;
import X.C624134x;
import X.C624735e;
import X.C626936e;
import X.C64773Ex;
import X.C65093Ge;
import X.C66513Ls;
import X.C69263Wi;
import X.C70663ar;
import X.C71263bp;
import X.C71613cO;
import X.C95804uY;
import X.C95814uZ;
import android.app.PendingIntent;
import android.content.ContentUris;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CountDownLatch;

public class DirectReplyService extends C32461qT {
    public C69263Wi A00;
    public C621033m A01;
    public C64773Ex A02;
    public C54122oD A03;
    public C113905mB A04;
    public C620633i A05;
    public C29431io A06;
    public C619933b A07;
    public AnonymousClass3XI A08;
    public C60152y5 A09;
    public boolean A0A = false;

    public DirectReplyService() {
        super("DirectReply");
    }

    public static C05480Tm A00(Context context, AnonymousClass3ZH r14, String str, int i, boolean z) {
        boolean equals = "com.whatsapp.intent.action.DIRECT_REPLY_FROM_MISSED_CALL".equals(str);
        int i2 = R.string.f11nameremoved;
        if (equals) {
            i2 = R.string.f11nameremoved;
        }
        String string = context.getString(i2);
        AnonymousClass0M4 r0 = new AnonymousClass0M4("direct_reply_input");
        r0.A00 = string;
        C03950Me r7 = new C03950Me(r0.A02, string, "direct_reply_input", r0.A03, r0.A01);
        Intent putExtra = new Intent(str, AnonymousClass326.A00(r14), context, DirectReplyService.class).putExtra("direct_reply_num_messages", i);
        CharSequence charSequence = r7.A01;
        int i3 = 134217728;
        C624735e.A06(putExtra, 134217728);
        if (C624735e.A01) {
            i3 = 167772160;
        }
        C04350Nw r1 = new C04350Nw(R.drawable.ic_action_reply, charSequence, PendingIntent.getService(context, 0, putExtra, i3));
        ArrayList arrayList = r1.A01;
        if (arrayList == null) {
            arrayList = AnonymousClass001.A0s();
            r1.A01 = arrayList;
        }
        arrayList.add(r7);
        r1.A00 = 1;
        r1.A03 = false;
        r1.A02 = z;
        return r1.A00();
    }

    public static /* synthetic */ void A01(Intent intent, AnonymousClass3ZH r7, C65093Ge r8, DirectReplyService directReplyService, String str) {
        directReplyService.A06.A07(r8);
        if (Build.VERSION.SDK_INT >= 28 && !"com.whatsapp.intent.action.DIRECT_REPLY_FROM_MISSED_CALL".equals(str)) {
            C619933b r2 = directReplyService.A07;
            C95814uZ A012 = AnonymousClass3ZH.A01(r7);
            int A013 = C18320x8.A01(intent, "direct_reply_num_messages");
            C18260x0.A1R(AnonymousClass001.A0o(), "messagenotification/posting reply update runnable for jid:", A012);
            Handler A032 = r2.A03();
            boolean z = true;
            if (!(A012 instanceof C95804uY)) {
                z = false;
            }
            A032.post(r2.A07.A01(A012, (C624134x) null, A013, true, true, false, true, z));
        }
    }

    public static /* synthetic */ void A02(AnonymousClass3ZH r15, C65093Ge r16, DirectReplyService directReplyService, String str, String str2) {
        DirectReplyService directReplyService2 = directReplyService;
        directReplyService2.A06.A06(r16);
        Class<C95814uZ> cls = C95814uZ.class;
        AnonymousClass3ZH r9 = r15;
        directReplyService2.A01.A0C((C66513Ls) null, (C108845de) null, (C624134x) null, str, Collections.singletonList(r15.A0I(cls)), (List) null, false, false);
        if ("com.whatsapp.intent.action.DIRECT_REPLY_FROM_MISSED_CALL".equals(str2)) {
            directReplyService2.A08.A03();
            return;
        }
        int i = Build.VERSION.SDK_INT;
        C54122oD r1 = directReplyService2.A03;
        C95814uZ r0 = (C95814uZ) r9.A0I(cls);
        if (i < 28) {
            r1.A00(r0, 2, true, true);
            directReplyService2.A07.A07();
            return;
        }
        r1.A00(r0, 2, true, false);
    }

    public static boolean A03() {
        return C18280x3.A1U(Build.VERSION.SDK_INT, 24);
    }

    public void onCreate() {
        A04();
        super.onCreate();
    }

    public void onHandleIntent(Intent intent) {
        String str;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("directreplyservice/intent: ");
        Intent intent2 = intent;
        A0o.append(intent2);
        A0o.append(" num_message:");
        C18260x0.A1G(A0o, C18320x8.A01(intent2, "direct_reply_num_messages"));
        Bundle A012 = AnonymousClass0RM.A01(intent2);
        if (A012 == null) {
            str = "directreplyservice/could not find remote input";
        } else {
            String str2 = null;
            if (AnonymousClass326.A01(intent2.getData())) {
                C64773Ex r2 = this.A02;
                Uri data = intent2.getData();
                C626936e.A0B(AnonymousClass326.A01(data));
                AnonymousClass3ZH A042 = r2.A04(ContentUris.parseId(data));
                if (A042 != null) {
                    CharSequence charSequence = A012.getCharSequence("direct_reply_input");
                    if (charSequence != null) {
                        str2 = charSequence.toString().trim();
                    }
                    if (!C107635bd.A0P(this.A05, this.A09, str2)) {
                        Log.i("directreplyservice/message is empty");
                        this.A00.A0S(C71263bp.A00(this, 2));
                        return;
                    }
                    String action = intent2.getAction();
                    CountDownLatch A14 = C18290x4.A14();
                    C65093Ge r6 = new C65093Ge(AnonymousClass3ZH.A01(A042), A14);
                    this.A04.A06(A042.A0H, 2);
                    this.A00.A0S(new C70663ar(this, r6, A042, str2, action, 5));
                    try {
                        A14.await();
                    } catch (InterruptedException e) {
                        Log.e("Interrupted while waiting to add message", e);
                    }
                    this.A00.A0S(new C71613cO(this, r6, A042, intent2, action, 6));
                    return;
                }
            }
            str = "directreplyservice/contact could not be found";
        }
        Log.i(str);
    }
}
