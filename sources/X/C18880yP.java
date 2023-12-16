package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.whatsapp.util.Log;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.0yP  reason: invalid class name and case insensitive filesystem */
public class C18880yP extends Handler {
    public final HashMap A00 = AnonymousClass001.A0t();
    public final /* synthetic */ AnonymousClass32O A01;

    public final void A00(C95814uZ r4, boolean z) {
        if (!hasMessages(0, r4) && !hasMessages(3, r4)) {
            if (!hasMessages(2, r4)) {
                AnonymousClass32O r1 = this.A01;
                if (r1.A01.A06 && (z || hasMessages(5, r4))) {
                    AnonymousClass32O.A00(r1, r4);
                }
            }
            removeMessages(4, r4);
            removeMessages(5, r4);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C18880yP(Looper looper, AnonymousClass32O r3) {
        super(looper);
        this.A01 = r3;
    }

    public void handleMessage(Message message) {
        Message message2;
        long j;
        AnonymousClass32O r3;
        String str;
        int i = message.what;
        if (i == 0) {
            C95814uZ r11 = (C95814uZ) message.obj;
            int i2 = message.arg2;
            if (!hasMessages(1, r11) && !hasMessages(4, r11)) {
                removeMessages(0, r11);
                if (hasMessages(2, r11) || hasMessages(5, r11)) {
                    HashMap hashMap = this.A00;
                    Number A0p = AnonymousClass0x9.A0p(r11, hashMap);
                    long currentTimeMillis = System.currentTimeMillis();
                    if (A0p != null && currentTimeMillis - A0p.longValue() > 10000) {
                        r3 = this.A01;
                        if (r3.A01.A06) {
                            AnonymousClass32O.A01(r3, r11, i2);
                            AnonymousClass0x2.A1J(r11, hashMap, currentTimeMillis);
                        }
                    }
                    removeMessages(2, r11);
                    message2 = obtainMessage(2, 0, 0, r11);
                    j = 2500;
                } else {
                    r3 = this.A01;
                    if (r3.A01.A06) {
                        AnonymousClass32O.A01(r3, r11, i2);
                        AnonymousClass0x2.A1J(r11, this.A00, System.currentTimeMillis());
                    }
                    removeMessages(2, r11);
                    message2 = obtainMessage(2, 0, 0, r11);
                    j = 2500;
                }
                r3.A04.A00(r11);
                C66503Lr r4 = r3.A03;
                C27991fJ A012 = AnonymousClass34R.A01(r11);
                if (A012 == null) {
                    str = "GroupXmppMethods/sendGetGroupWhenComposing not group jid";
                } else {
                    Map map = r4.A0F;
                    if (map.containsKey(A012) && r4.A02.A0H() - C18290x4.A0C(A012, map) <= 43200000) {
                        str = "GroupXmppMethods/sendGetGroupWhenComposing send the query in this session within half day";
                    } else if (!r4.A04.A0Y(C58422vE.A02, 3644)) {
                        str = "GroupXmppMethods/sendGetGroupWhenComposing abprop disabled";
                    } else {
                        r4.A08.BkN(new C70103Zx(r4, 30, A012), "GroupXmppMethods/sendGetGroupWhenComposing");
                        removeMessages(2, r11);
                        message2 = obtainMessage(2, 0, 0, r11);
                        j = 2500;
                    }
                }
                Log.d(str);
                removeMessages(2, r11);
                message2 = obtainMessage(2, 0, 0, r11);
                j = 2500;
            } else {
                return;
            }
        } else if (i == 1 || i == 2) {
            C95814uZ r2 = (C95814uZ) message.obj;
            if (!hasMessages(0, r2) && !hasMessages(3, r2)) {
                if (!hasMessages(5, r2)) {
                    AnonymousClass32O r1 = this.A01;
                    if (r1.A01.A06) {
                        AnonymousClass32O.A00(r1, r2);
                    }
                }
                removeMessages(1, r2);
                removeMessages(2, r2);
                return;
            }
            return;
        } else if (i == 3) {
            C95814uZ r32 = (C95814uZ) message.obj;
            int i3 = message.arg2;
            if (!hasMessages(1, r32) && !hasMessages(4, r32)) {
                if (!hasMessages(2, r32)) {
                    AnonymousClass32O r12 = this.A01;
                    if (r12.A01.A06) {
                        AnonymousClass32O.A01(r12, r32, i3);
                    }
                }
                message2 = obtainMessage(5, 0, 0, r32);
                j = C625635p.A0L;
            } else {
                return;
            }
        } else if (i == 4) {
            A00((C95814uZ) message.obj, false);
            return;
        } else if (i == 5) {
            A00((C95814uZ) message.obj, true);
            return;
        } else {
            return;
        }
        sendMessageDelayed(message2, j);
    }
}
