package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.whatsapp.util.Log;
import java.util.Collection;
import java.util.Map;

/* renamed from: X.3Gr  reason: invalid class name and case insensitive filesystem */
public final class C65223Gr implements AnonymousClass4FW, AnonymousClass4E8 {
    public Handler A00 = new C18710y8(Looper.getMainLooper(), this);
    public final C69263Wi A01;
    public final C56722sS A02;
    public final C51232jU A03;
    public final C56612sH A04;
    public final C29431io A05;
    public final AnonymousClass1VX A06;
    public final C55832qz A07;
    public final AnonymousClass4FS A08;
    public final Map A09 = AnonymousClass0x9.A1D();

    public final void A00(C624134x r12) {
        String str;
        AnonymousClass21Q r0;
        C624134x r8 = r12;
        if (r12.A1J.A02 || !C57322tS.A00(r12)) {
            str = "BotMessageManager/notBotMessage/skip";
        } else {
            Log.d("BotMessageManager/processBotMessageForTimeout");
            C51962kf A0q = r12.A0q();
            if (A0q != null) {
                if (!C73833g9.A06(AnonymousClass21Q.LAST, AnonymousClass21Q.FULL, AnonymousClass21Q.TIMED_OUT).contains(A0q.A00)) {
                    long j = r12.A0K;
                    C42602Ou A11 = r12.A11();
                    if (A11 != null) {
                        j = A11.A00;
                    }
                    long A062 = C56952sp.A06(this.A06, 4736) - C56612sH.A03(this.A04, j);
                    C18260x0.A10("BotMessageManager/processBotMessageForTimeout/timeToTimeout:", AnonymousClass001.A0o(), A062);
                    if (A062 > 0) {
                        Map map = this.A09;
                        AnonymousClass2z0 A0B = C627636p.A0B(r12);
                        C162457s7.A0D(A0B);
                        map.put(A0B, r12);
                        Handler handler = this.A00;
                        handler.sendMessageDelayed(Message.obtain(handler, 0, r12), A062);
                        str = "BotMessageManager/processBotMessageForTimeout/added to cache/message scheduled";
                    } else {
                        C69903Yy r9 = new C69903Yy();
                        Map map2 = this.A09;
                        AnonymousClass2z0 A0B2 = C627636p.A0B(r12);
                        C162457s7.A0D(A0B2);
                        Object remove = map2.remove(A0B2);
                        r9.element = remove;
                        if (remove == null) {
                            r9.element = r12;
                        }
                        C51962kf A0q2 = r12.A0q();
                        if (A0q2 != null) {
                            this.A08.BkM(new C71593cM((Object) A0q2, (Object) this, (Object) r8, (Object) r9, 19));
                            return;
                        }
                        return;
                    }
                }
            }
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("BotMessageManager/processBotMessageForTimeout/botMessageInfo/nullOrLast botMessageInfoState=");
            if (A0q != null) {
                r0 = A0q.A00;
            } else {
                r0 = null;
            }
            C18260x0.A0m(r0, A0o);
            Map map3 = this.A09;
            AnonymousClass2z0 A0B3 = C627636p.A0B(r12);
            C162457s7.A0D(A0B3);
            map3.remove(A0B3);
            return;
        }
        Log.d(str);
    }

    public void BWS(C624134x r2, int i) {
        C162457s7.A0J(r2, 0);
        Log.d("BotMessageManager/onMessageAdded");
        A00(r2);
    }

    public void BWX(C624134x r2, C624134x r3) {
        C162457s7.A0J(r3, 1);
        Log.d("BotMessageManager/onMessageReplaced");
        A00(r3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        X.AnonymousClass2A8.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0062, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0065, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0066, code lost:
        X.AnonymousClass2A8.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0069, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BQX() {
        /*
            r6 = this;
            java.lang.String r0 = "BotMessageManager/onDailyCronWithMessageStore"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            X.2jU r5 = r6.A03
            java.util.ArrayList r4 = X.AnonymousClass001.A0s()
            X.3dV r0 = r5.A01
            X.4GK r3 = r0.get()
            r0 = r3
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x0063 }
            X.2sg r2 = r0.A03     // Catch:{ all -> 0x0063 }
            java.lang.String r1 = "SELECT message_row_id FROM bot_message_info"
            java.lang.String r0 = "SQL_GET_ALL_ROW_IDS"
            android.database.Cursor r2 = X.C56862sg.A01(r2, r1, r0)     // Catch:{ all -> 0x0063 }
        L_0x001e:
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x005c }
            if (r0 == 0) goto L_0x002e
            r0 = 0
            int r0 = r2.getInt(r0)     // Catch:{ all -> 0x005c }
            long r0 = (long) r0     // Catch:{ all -> 0x005c }
            X.AnonymousClass0x2.A1Q(r4, r0)     // Catch:{ all -> 0x005c }
            goto L_0x001e
        L_0x002e:
            r2.close()     // Catch:{ all -> 0x0063 }
            r3.close()
            java.util.Iterator r4 = r4.iterator()
        L_0x0038:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x005b
            long r1 = X.C18270x1.A02(r4)
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "BotMessageManager/onDailyCronWithMessageStore/rowId: "
            X.C18260x0.A10(r0, r3, r1)
            X.2qz r0 = r6.A07
            X.34x r0 = X.C55122pp.A00(r0, r1)
            if (r0 == 0) goto L_0x0057
            r6.A00(r0)
            goto L_0x0038
        L_0x0057:
            r5.A00(r1)
            goto L_0x0038
        L_0x005b:
            return
        L_0x005c:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x005e }
        L_0x005e:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r2, r1)     // Catch:{ all -> 0x0063 }
            throw r0     // Catch:{ all -> 0x0063 }
        L_0x0063:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0065 }
        L_0x0065:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r3, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65223Gr.BQX():void");
    }

    public /* synthetic */ void BRi(C624134x r1) {
    }

    public /* synthetic */ void BVB(C95814uZ r1) {
    }

    public /* synthetic */ void BWW(C624134x r1) {
    }

    public /* synthetic */ void BWY(C624134x r1) {
    }

    public /* synthetic */ void BWf(C95814uZ r1) {
    }

    public /* synthetic */ void BWj(Collection collection) {
    }

    public /* synthetic */ void BX3(C95804uY r1) {
    }

    public /* synthetic */ void BX4(C624134x r1) {
    }

    public /* synthetic */ void BX6(C95804uY r1) {
    }

    public C65223Gr(C69263Wi r3, C56722sS r4, C51232jU r5, C56612sH r6, C29431io r7, AnonymousClass1VX r8, C55832qz r9, AnonymousClass4FS r10) {
        C18260x0.A0f(r6, r8, r3, r10, r4);
        C18260x0.A0W(r7, r9, r5);
        this.A04 = r6;
        this.A06 = r8;
        this.A01 = r3;
        this.A08 = r10;
        this.A02 = r4;
        this.A05 = r7;
        this.A07 = r9;
        this.A03 = r5;
    }

    public String BDW() {
        return "BotMessageManager";
    }

    public /* synthetic */ void BQW() {
    }

    public /* synthetic */ void BXI() {
    }

    public /* synthetic */ void BNb(C624134x r1, int i) {
    }

    public /* synthetic */ void BWU(C624134x r1, int i) {
    }

    public /* synthetic */ void BWe(Collection collection, int i) {
        C381525x.A00(this, collection, i);
    }

    public /* synthetic */ void BWg(Collection collection, Map map) {
    }

    public /* synthetic */ void BWh(C95814uZ r1, Collection collection, boolean z) {
    }

    public /* synthetic */ void BWi(C95814uZ r1, Collection collection, boolean z) {
    }

    public /* synthetic */ void BX5(C95804uY r1, boolean z) {
    }

    public /* synthetic */ void BY8(C624134x r1, C624134x r2) {
    }

    public /* synthetic */ void BY9(C624134x r1, C624134x r2) {
    }
}
