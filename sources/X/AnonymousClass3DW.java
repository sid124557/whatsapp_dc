package X;

import android.content.Context;
import android.os.ConditionVariable;
import com.whatsapp.util.Log;

/* renamed from: X.3DW  reason: invalid class name */
public class AnonymousClass3DW implements C16390sw, AnonymousClass65A {
    public boolean A00;
    public boolean A01;
    public final C69263Wi A02;
    public final C56972sr A03;
    public final AnonymousClass0XM A04;
    public final AnonymousClass0U8 A05;
    public final AnonymousClass0WN A06;
    public final C622834k A07;
    public final AnonymousClass5PA A08;
    public final C29401il A09;
    public final C44382Vv A0A;
    public final C50862it A0B;
    public final C56512s6 A0C;
    public final C620633i A0D;
    public final C56612sH A0E;
    public final C54292oU A0F;
    public final AnonymousClass33p A0G;
    public final C620733j A0H;
    public final C28671ha A0I = new C28671ha();
    public final C625835r A0J;
    public final AnonymousClass1VX A0K;
    public final AnonymousClass4FV A0L;
    public final C29321id A0M;
    public final C48772fR A0N;
    public final AnonymousClass4FS A0O;
    public final C34171uL A0P;
    public final C183538qC A0Q;
    public volatile int A0R;

    public void A00() {
        this.A01 = true;
    }

    public void A01(AnonymousClass4EB r2) {
        this.A0I.A07(r2);
    }

    public void A02(AnonymousClass4EB r19, int i) {
        long j;
        C28671ha r11 = this.A0I;
        r11.A06(r19);
        int i2 = i;
        if (i == 0) {
            j = 3000;
        } else {
            j = -1;
        }
        Context context = this.A0F.A00;
        C56612sH r9 = this.A0E;
        C183538qC r14 = this.A0Q;
        AnonymousClass5PA r6 = this.A08;
        C620633i r8 = this.A0D;
        this.A02.BkS(new C70093Zw(this, 39, new C34001u4(context, this.A04, r6, this.A0A, r8, r9, this, r11, this.A0J, this.A0N, r14, i2, j)));
    }

    public final boolean A03(boolean z) {
        C56972sr r1 = this.A03;
        if (C56972sr.A00(r1) == null || r1.A0Y() || !this.A00 || !z || this.A0C.A06() || !this.A09.A00.A02()) {
            return false;
        }
        return true;
    }

    public void BkR() {
        if (A03(this.A0M.A09())) {
            Log.d("local/backup/runLocalBackupIfNeeded");
            C24971Zl r3 = new C24971Zl();
            r3.A05 = Long.valueOf(System.currentTimeMillis());
            r3.A04 = C18280x3.A0S();
            A02(new AnonymousClass3GV((ConditionVariable) null, this, r3), 1);
        }
    }

    public AnonymousClass3DW(C69263Wi r3, C56972sr r4, AnonymousClass0XM r5, AnonymousClass0U8 r6, AnonymousClass0WN r7, C622834k r8, AnonymousClass5PA r9, C29401il r10, C44382Vv r11, C50862it r12, C56512s6 r13, C620633i r14, C56612sH r15, C54292oU r16, AnonymousClass33p r17, C620733j r18, C625835r r19, AnonymousClass1VX r20, AnonymousClass4FV r21, C29321id r22, C48772fR r23, AnonymousClass4FS r24, C34171uL r25, C183538qC r26) {
        this.A0F = r16;
        this.A0E = r15;
        this.A0K = r20;
        this.A02 = r3;
        this.A0B = r12;
        this.A03 = r4;
        this.A0O = r24;
        this.A0L = r21;
        this.A0Q = r26;
        this.A08 = r9;
        this.A0D = r14;
        this.A0H = r18;
        this.A0P = r25;
        this.A06 = r7;
        this.A04 = r5;
        this.A0C = r13;
        this.A07 = r8;
        this.A0J = r19;
        this.A0G = r17;
        this.A09 = r10;
        this.A05 = r6;
        C29321id r1 = r22;
        this.A0M = r1;
        this.A0N = r23;
        this.A0A = r11;
        r1.A06(new AnonymousClass3UR(r15, this));
    }

    public void BUN() {
        BkR();
    }
}
