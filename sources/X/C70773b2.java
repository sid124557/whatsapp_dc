package X;

import android.os.Handler;
import android.os.Message;
import android.os.PowerManager;
import com.whatsapp.conversation.ConversationListView;
import java.io.IOException;

/* renamed from: X.3b2  reason: invalid class name and case insensitive filesystem */
public class C70773b2 implements Runnable {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public boolean A05;
    public final int A06;

    public C70773b2(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i, boolean z) {
        this.A06 = i;
        this.A00 = obj;
        this.A02 = obj2;
        this.A03 = obj3;
        this.A04 = obj4;
        this.A01 = obj5;
        this.A05 = z;
    }

    public void run() {
        boolean z;
        switch (this.A06) {
            case 0:
                C160767oH r0 = (C160767oH) this.A00;
                ((AnonymousClass4FL) this.A02).BVQ(r0.A01, (AnonymousClass7A4) this.A03, (C150007Ot) this.A04, (IOException) this.A01, r0.A00, this.A05);
                return;
            case 1:
                C159017kx r02 = (C159017kx) this.A00;
                boolean z2 = this.A05;
                int i = r02.A00;
                ((AnonymousClass4F1) this.A01).BVS((C156527gm) this.A02, (AnonymousClass7P1) this.A03, r02.A01, (IOException) this.A04, i, z2);
                return;
            case 2:
                C29021i9 r2 = (C29021i9) this.A00;
                byte[] bArr = (byte[]) this.A01;
                byte[] bArr2 = (byte[]) this.A02;
                C42612Ov[] r5 = (C42612Ov[]) this.A03;
                C42612Ov r1 = (C42612Ov) this.A04;
                boolean z3 = this.A05;
                C626936e.A01();
                if (z3) {
                    r2.A0D();
                }
                synchronized (r2) {
                    r2.A02 = true;
                    r2.A04 = r5;
                }
                AnonymousClass31C r3 = r2.A0H;
                Message obtain = Message.obtain((Handler) null, 0, 85, 0, new AnonymousClass2QK(r1, bArr, bArr2, r5));
                C162457s7.A0J(obtain, 0);
                r3.A0A(obtain, (String) null, false);
                return;
            case 3:
                C113245l7 r52 = (C113245l7) this.A00;
                C116095pj r8 = (C116095pj) this.A01;
                C624134x r32 = (C624134x) this.A02;
                C624134x r7 = (C624134x) this.A03;
                boolean z4 = this.A05;
                C30721mu r4 = (C30721mu) this.A04;
                if (!r52.A2z.getMessageAudioPlayerProvider().A0B() && r52.A6J) {
                    if (r52.A6m) {
                        boolean z5 = true;
                        r8.A0R = true;
                        PowerManager.WakeLock wakeLock = r8.A0c;
                        if (wakeLock == null || !wakeLock.isHeld()) {
                            z5 = false;
                        }
                        r8.A0a = z5;
                        r8.A07();
                    }
                    r8.A09(C116095pj.A12, true, false);
                    r52.A4w = r32;
                    if (r52.A6O) {
                        r52.A21(r7);
                    }
                    if (z4) {
                        r52.A2A(r4, 0, false);
                    }
                    ConversationListView conversationListView = r52.A2f;
                    C71663cT r03 = new C71663cT(conversationListView, r32);
                    conversationListView.A0J = r03;
                    conversationListView.post(r03);
                    return;
                }
                return;
            default:
                C620133d r53 = (C620133d) this.A00;
                C56902sk r82 = (C56902sk) this.A01;
                C30471mV r42 = (C30471mV) this.A02;
                C47662dc r72 = (C47662dc) this.A03;
                AnonymousClass4EV r6 = (AnonymousClass4EV) this.A04;
                boolean z6 = this.A05;
                r53.A09(r82, r72, r42, true);
                r53.A0P.A01(r42.A01, r72.A0H);
                C625435m A012 = r82.A01();
                C626936e.A06(A012);
                if (r6 != null) {
                    int i2 = A012.A01;
                    if (i2 == 13 || i2 == 24) {
                        if (r82.A04() != null) {
                            z = r82.A04().booleanValue();
                        } else {
                            z = false;
                        }
                        r6.BRW(z);
                    } else {
                        r6.BRX(A012, r82);
                    }
                }
                r53.A0D(r42, A012.A01, z6);
                return;
        }
    }
}
