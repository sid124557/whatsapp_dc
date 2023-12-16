package X;

import android.os.SystemClock;
import com.whatsapp.util.Log;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.2rb  reason: invalid class name and case insensitive filesystem */
public abstract class C56202rb {
    public int A00 = -1;
    public long A01;
    public final int A02;
    public final long A03;
    public final long A04;
    public final C55682qk A05;
    public final C56612sH A06;
    public final AnonymousClass4FV A07;
    public final C55892r5 A08;
    public final Integer A09;
    public final Integer A0A;
    public final Integer A0B;
    public final String A0C;
    public final Map A0D = C18320x8.A0r();

    public C56202rb(C55682qk r5, C56612sH r6, AnonymousClass4FV r7, C55892r5 r8, Integer num, Integer num2, String str, int i, long j, long j2) {
        this.A06 = r6;
        this.A05 = r5;
        this.A07 = r7;
        this.A08 = r8;
        this.A0C = str;
        this.A03 = j;
        this.A02 = i;
        this.A00 = 1;
        this.A01 = j2;
        this.A04 = j2;
        this.A09 = r7.AzK(A00(-1, 0), (AnonymousClass5ZC) null, false);
        this.A0A = num;
        this.A0B = num2;
    }

    public synchronized void A02() {
        if (this.A00 == 0) {
            C55682qk r3 = this.A05;
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("tag=");
            A0o.append(A01());
            r3.A0A("loggable_stanza_already_acked", true, AnonymousClass000.A0X(" method=onStanzaProcessed", A0o));
        } else {
            StringBuilder A0o2 = AnonymousClass001.A0o();
            A0o2.append("LoggableStanza/onStanzaProcessed/stanzaId=");
            C18260x0.A1L(A0o2, this.A0C);
            C55892r5 r2 = this.A08;
            synchronized (r2) {
                Iterator A032 = C61102zi.A03(r2.A02);
                while (A032.hasNext()) {
                    ((AnonymousClass4FA) A032.next()).Bc3(this);
                }
            }
        }
    }

    public synchronized void A03(int i) {
        int i2 = this.A00;
        if (i == i2) {
            C55682qk r3 = this.A05;
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("tag=");
            A0o.append(A01());
            A0o.append(" stage=");
            A0o.append(i);
            r3.A0A("loggable_stanza_invalid_stage_begin", true, AnonymousClass000.A0Y(" currentStage=", A0o, i2));
        } else {
            long uptimeMillis = SystemClock.uptimeMillis();
            A04(i2, uptimeMillis - this.A01);
            this.A00 = i;
            this.A01 = uptimeMillis;
        }
    }

    public AnonymousClass3ZG A00(int i, long j) {
        if (this instanceof C28261gT) {
            C28261gT r3 = (C28261gT) this;
            C25571aj r2 = new C25571aj();
            r2.A03 = Long.valueOf(j);
            r2.A00 = Boolean.valueOf(r3.A04);
            Integer num = r3.A0A;
            if (num != null) {
                r2.A04 = C18280x3.A0U(num);
            }
            r2.A05 = Long.valueOf(r3.A00);
            r2.A06 = Long.valueOf(C615531h.A03(r3.A06));
            r2.A02 = Integer.valueOf(i);
            r2.A07 = Long.valueOf(r3.A01);
            r2.A08 = r3.A07;
            r2.A01 = Integer.valueOf(r3.A05);
            return r2;
        } else if (this instanceof AnonymousClass1gR) {
            AnonymousClass1gR r1 = (AnonymousClass1gR) this;
            AnonymousClass1ZY r22 = new AnonymousClass1ZY();
            r22.A01 = Long.valueOf(j);
            Integer num2 = r1.A0A;
            if (num2 != null) {
                r22.A02 = C18280x3.A0U(num2);
            }
            r22.A00 = Integer.valueOf(i);
            r22.A04 = r1.A01;
            r22.A03 = r1.A00;
            return r22;
        } else if (this instanceof AnonymousClass1gS) {
            AnonymousClass1gS r12 = (AnonymousClass1gS) this;
            C25631ap r23 = new C25631ap();
            r23.A00 = Boolean.valueOf(r12.A05);
            r23.A04 = Integer.valueOf(r12.A00);
            r23.A08 = Long.valueOf(j);
            r23.A01 = Boolean.valueOf(r12.A02);
            r23.A02 = Boolean.valueOf(r12.A04);
            Integer num3 = r12.A0A;
            if (num3 != null) {
                r23.A09 = C18280x3.A0U(num3);
            }
            r23.A03 = Boolean.valueOf(r12.A06);
            r23.A05 = Integer.valueOf(i);
            r23.A06 = Integer.valueOf(r12.A03);
            r23.A07 = Long.valueOf(r12.A01);
            return r23;
        } else {
            AnonymousClass1gU r13 = (AnonymousClass1gU) this;
            C24771Yr r24 = new C24771Yr();
            r24.A02 = Long.valueOf(j);
            r24.A00 = Integer.valueOf(i);
            Integer num4 = r13.A0A;
            if (num4 != null) {
                r24.A03 = C18280x3.A0U(num4);
            }
            r24.A01 = Integer.valueOf(r13.A00);
            return r24;
        }
    }

    public String A01() {
        if (this instanceof C28261gT) {
            return "LoggableReceiptStanza";
        }
        if (this instanceof AnonymousClass1gR) {
            return "LoggableNotificationStanza";
        }
        if (this instanceof AnonymousClass1gS) {
            return "LoggableMessageStanza";
        }
        return "LoggableCallStanza";
    }

    public final void A04(int i, long j) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("LoggableStanza/onStageComplete stage=");
        A0o.append(i);
        A0o.append("; duration=");
        A0o.append(j);
        String A0P = AnonymousClass000.A0P(this, "; ", A0o);
        Integer num = this.A09;
        if (num != null) {
            Log.i(A0P);
            Map map = this.A0D;
            AnonymousClass0x2.A1K(Integer.valueOf(i), map, j);
            if (i == 0) {
                Iterator A0q = AnonymousClass000.A0q(map);
                while (A0q.hasNext()) {
                    Map.Entry A0w = AnonymousClass001.A0w(A0q);
                    this.A07.BhE(A00(C18280x3.A06(A0w), C18310x6.A0B(A0w.getValue())), num.intValue());
                }
                return;
            }
            return;
        }
        Log.d(A0P);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("loggableStanzaType=");
        A0o.append(this.A02);
        A0o.append("; id=");
        A0o.append(this.A03);
        A0o.append("; stanzaId=");
        A0o.append(this.A0C);
        A0o.append("; currentStage=");
        A0o.append(this.A00);
        A0o.append("; offlineCount=");
        A0o.append(this.A0A);
        A0o.append("; stanzaAttrsHash=");
        return AnonymousClass000.A0R(this.A0B, A0o);
    }
}
